package framework.application;

import android.app.Activity;
import android.os.Bundle;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by duxueyang on 17/1/17.
 *
 * Application
 */

public class App extends android.app.Application {
    private static App mApp;
    public Stack<Activity> store;
    public HashMap<String, Object> mCurActivityExtra;

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
        store = new Stack<>();
        registerActivityLifecycleCallbacks(new SwitchBackgroundCallbacks());
    }

    public static App getAppContext() {
        return mApp;
    }


    private class SwitchBackgroundCallbacks implements android.app.Application.ActivityLifecycleCallbacks {

        @Override
        public void onActivityCreated(Activity activity, Bundle bundle) {
            store.add(activity);
        }

        @Override
        public void onActivityStarted(Activity activity) {

        }

        @Override
        public void onActivityResumed(Activity activity) {

        }

        @Override
        public void onActivityPaused(Activity activity) {

        }

        @Override
        public void onActivityStopped(Activity activity) {

        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

        }

        @Override
        public void onActivityDestroyed(Activity activity) {
            store.remove(activity);
        }
    }

    /**
     * 获取当前的Activity
     * 获取最晚
     * @return
     */
    public Activity getCurActivity() {
        return store.lastElement();
    }
}
