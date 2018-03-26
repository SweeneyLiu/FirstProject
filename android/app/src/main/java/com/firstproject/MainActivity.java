package com.firstproject;

import com.facebook.react.ReactActivity;

//页面继承ReactActivity，ReactActivity作为JS页面的容器。
public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        //返回组件名
        return "FirstProject";
    }
}
