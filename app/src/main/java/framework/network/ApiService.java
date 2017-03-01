package framework.network;

import com.app.annotation.apt.ApiFactory;
import com.mindimps.base.model.BaseModel;
import com.mindimps.module.init.model.ADEntity;

import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 每一个的网络请求
 * Retrofit 定义的网络请求
 * Retrofit 与RXJava  的相互实现
 */
@ApiFactory
public interface ApiService {

    //公共广告图片
    @GET("api/ADs/newest")
    Observable<BaseModel<ADEntity>>  getADImageUrl();

    /**
     * 开课模块
     */

    // 最新开课
//    @GET("api/videos/page?page=1&size=4&code=media_type_adviser")
//    Observable<>  getNewestSubject();

    // 开课分类
//    @GET("api/video_lessons/video_lesson_type/tag")
//    Observable<>  getSubjectCategory();





//    @GET("login")
//    Observable<> login(@Query("username") String username, @Query("password") String password);
//
//    @POST("users")
//    Observable<CreatedResult> createUser(@Body _User user);
//
//    @GET("users")
//    Observable<DataArr<_User>> getAllUser(@Query("skip") int skip, @Query("limit") int limit);
//
//    @GET("classes/Image")
//    Observable<DataArr<Image>> getAllImages(@Query("where") String where, @Query("skip") int skip, @Query("limit") int limit, @Query("order") String order);
//
//
//    @GET("classes/Comment")
//    Observable<DataArr<CommentInfo>> getCommentList(@Query("include") String include, @Query("where") String where, @Query("skip") int skip, @Query("limit") int limit);
//
//    @POST("classes/Comment")
//    Observable<CreatedResult> createComment(@Body Comment mComment);
//
//
//    @Headers("Content-Type: image/png")
//    @POST("files/{name}")
//    Observable<CreatedResult> upFile(@Path("name") String name, @Body RequestBody body);
//
//
//    @PUT("users/{uid}")
//    Observable<CreatedResult> upUser(@Header("X-LC-Session") String session, @Path("uid") String uid, @Body Face face);
//
//
//    @POST("classes/Message")
//    Observable<CreatedResult> createMessage(@Body Message mComment);
//
//    @GET("classes/Message")
//    Observable<DataArr<MessageInfo>> getMessageList(@Query("include") String include, @Query("where") String where, @Query("skip") int skip, @Query("limit") int limit, @Query("order") String order);

}
