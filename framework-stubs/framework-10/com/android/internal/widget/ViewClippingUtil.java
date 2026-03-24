package com.android.internal.widget;

public class ViewClippingUtil {
    private static final int CLIP_CLIPPING_SET = 16908812;
    private static final int CLIP_CHILDREN_TAG = 16908813;
    private static final int CLIP_TO_PADDING = 16908815;
    public ViewClippingUtil() {}
    public static void setClippingDeactivated(android.view.View p0, boolean p1, com.android.internal.widget.ViewClippingUtil.ClippingParameters p2) {}

    public static interface ClippingParameters {
        public boolean shouldFinish(android.view.View p0);
        default public boolean isClippingEnablingAllowed(android.view.View p0) { return false; }
        default public void onClippingStateChanged(android.view.View p0, boolean p1) {}
    }
}
