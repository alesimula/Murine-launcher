package com.android.internal.policy;

public class BackdropFrameRenderer extends java.lang.Thread implements android.view.Choreographer.FrameCallback {
    public BackdropFrameRenderer(com.android.internal.policy.DecorView p0, android.view.ThreadedRenderer p1, android.graphics.Rect p2, android.graphics.drawable.Drawable p3, android.graphics.drawable.Drawable p4, android.graphics.drawable.Drawable p5, int p6, int p7, boolean p8, android.graphics.Insets p9) { super(); }
    void onResourcesLoaded(com.android.internal.policy.DecorView p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3, int p4, int p5) {}
    public void setTargetRect(android.graphics.Rect p0, boolean p1, android.graphics.Rect p2) {}
    public void onConfigurationChange() {}
    void releaseRenderer() {}
    public void run() {}
    public void doFrame(long p0) {}
    boolean onContentDrawn(int p0, int p1, int p2, int p3) { return false; }
    void onRequestDraw(boolean p0) {}
    void setUserCaptionBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
}
