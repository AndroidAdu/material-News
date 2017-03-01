package framework.network;


import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import framework.application.App;
import framework.constant.HttpContants;
import framework.util.NetUtils;
import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by baixiaokang on 16/3/9.
 */
public class Api {

    //Retrofit
    public Retrofit retrofit;
    //Retrofit 定义的接口文件
    public ApiService service;

    private static class SingletonHolder {
        private static final Api INSTANCE = new Api();
    }

    //构造方法
    public static Api getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 定义拦截器设置Token
     * lambda 表达式
     */
    Interceptor mInterceptor = (chain) -> chain.proceed(chain.request().newBuilder()
            .addHeader("Content-type", "application/json;charset=UTF-8")
            .addHeader("Authorization", "Bearer "+HttpContants.TOKEN)
            .build());

    //构造方法
    private Api() {
        //日志
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        //文件缓存目录
        File cacheFile = new File(App.getAppContext().getCacheDir(), "cache");
        //设定缓存目录  okhttp里面的缓存
        Cache cache = new Cache(cacheFile, 1024 * 1024 * 100); //100Mb
        //okhttp 的默认设置
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(7676, TimeUnit.MILLISECONDS)
                .connectTimeout(7676, TimeUnit.MILLISECONDS)
                //设置head
                .addInterceptor(mInterceptor)
                //设置日志拦截器
                .addInterceptor(interceptor)
                //设置网络拦截器 （暂时用不到重定向或者实体设置）
                .addNetworkInterceptor(new HttpCacheInterceptor())
                //设置缓存
                .cache(cache)
                .build();
        //设置时间日期
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").serializeNulls().create();
        //设置gson 解析
        //设置url的目录
        retrofit = new Retrofit.Builder()
                .client(okHttpClient)
                //增加返回值为Gson的支持(以实体类返回)
                .addConverterFactory(GsonConverterFactory.create(gson))
                //增加返回值为Oservable<T>的支持
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                //给Retrofit 设置baseUrl
                .baseUrl(HttpContants.BASE_URL)
                .build();
        service = retrofit.create(ApiService.class);
    }


    /**
     *
     *  可以添加、删除或替换请求头信息，还可以改变的请求携带的实体
     *
     *  能够操作中间过程的响应,如重定向和重试.
        当网络短路而返回缓存响应时不被调用.
        只观察在网络上传输的数据.
        携带请求来访问连接.

     */
    class HttpCacheInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            //如果没有网的情况下
            if (!NetUtils.isConnected(App.getAppContext())) {
                request = request.newBuilder()
                        .cacheControl(CacheControl.FORCE_CACHE)
                        .build();
                Log.d("Okhttp", "no network");
            }

            Response originalResponse = chain.proceed(request);
            if (NetUtils.isConnected(App.getAppContext())) {
                //有网的时候读接口上的@Headers里的配置，你可以在这里进行统一的设置
                String cacheControl = request.cacheControl().toString();
                return originalResponse.newBuilder()
                        .header("Cache-Control", cacheControl)
                        .removeHeader("Pragma")
                        .build();
            } else {
                return originalResponse.newBuilder()
                        .header("Cache-Control", "public, only-if-cached, max-stale=2419200")
                        .removeHeader("Pragma")
                        .build();
            }
        }
    }
}