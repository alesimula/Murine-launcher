package com.android.internal.widget;

public class ViewClippingUtil {
    public ViewClippingUtil() {}
    public static void setClippingDeactivated(android.view.View p0, boolean p1, com.android.internal.widget.ViewClippingUtil.ClippingParameters p2) {}

    public static interface ClippingParameters {
        public boolean shouldFinish(android.view.View p0);
        default public boolean isClippingEnablingAllowed(android.view.View p0) { return false; }
        default public void onClippingStateChanged(android.view.View p0, boolean p1) {}
    }
}
