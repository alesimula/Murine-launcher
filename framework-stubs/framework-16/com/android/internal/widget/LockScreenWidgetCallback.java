package com.android.internal.widget;

public interface LockScreenWidgetCallback {
    public void requestShow(android.view.View p0);
    public void requestHide(android.view.View p0);
    public boolean isVisible(android.view.View p0);
    public void userActivity(android.view.View p0);
}
