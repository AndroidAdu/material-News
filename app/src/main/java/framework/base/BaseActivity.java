package framework.base;

import android.databinding.ViewDataBinding;

import java.lang.reflect.ParameterizedType;

import framework.util.InstanceUtils;

/**
 * Created by duxueyang on 17/2/28.
 * 在View(Activity)中处理Present 的问题
 */

public abstract class BaseActivity<P extends BasePresenter, B extends ViewDataBinding> extends BaseDataBindingActivity<B> {


    public P mPresenter;

    @Override
    protected void initPresenter() {
        if (this instanceof BaseView &&
                this.getClass().getGenericSuperclass() instanceof ParameterizedType &&
                ((ParameterizedType) (this.getClass().getGenericSuperclass())).getActualTypeArguments().length > 0) {
            Class mPresenterClass = (Class) ((ParameterizedType) (this.getClass()
                    .getGenericSuperclass())).getActualTypeArguments()[0];
            mPresenter = InstanceUtils.getInstance(mPresenterClass);
            mPresenter.setView(this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) mPresenter.onDetached();
    }
}
