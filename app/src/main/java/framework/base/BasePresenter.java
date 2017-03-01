package framework.base;

import rx.subscriptions.CompositeSubscription;

/**
 * Created by duxueyang on 17/2/27.
 * mvp 中的P
 * 抽象类  需要子类去继承实现
 */

public abstract class BasePresenter<V> {

    /**
     * presenter中要操作的View
     */
    protected V mView;

    /**
     * RxJava 中的处理类
     */
    protected CompositeSubscription mCompositeSubscription = new CompositeSubscription();

    /**
     * 给Presenter 传递view
     * @param v
     */
    public void setView(V v) {
        this.mView = v;
        this.onAttached();
    }


    public abstract void onAttached();


    public void onDetached() {
        mCompositeSubscription.unsubscribe();
    }
}
