package com.android.internal.policy;

public class BackdropFrameRenderer extends java.lang.Thread implements android.view.Choreographer.FrameCallback {
    private com.android.internal.policy.DecorView mDecorView;
    private final android.graphics.Rect mTargetRect = null;
    private android.view.ThreadedRenderer mRenderer;
    private android.graphics.RenderNode mFrameAndBackdropNode;
    private android.graphics.RenderNode mSystemBarBackgroundNode;
    private final android.graphics.Rect mOldTargetRect = null;
    private final android.graphics.Rect mNewTargetRect = null;
    private android.view.Choreographer mChoreographer;
    private int mLastContentWidth;
    private int mLastContentHeight;
    private int mLastCaptionHeight;
    private int mLastXOffset;
    private int mLastYOffset;
    private boolean mReportNextDraw;
    private android.graphics.drawable.Drawable mCaptionBackgroundDrawable;
    private android.graphics.drawable.Drawable mUserCaptionBackgroundDrawable;
    private android.graphics.drawable.Drawable mResizingBackgroundDrawable;
    private android.graphics.drawable.ColorDrawable mStatusBarColor;
    private android.graphics.drawable.ColorDrawable mNavigationBarColor;
    private boolean mOldFullscreen;
    private boolean mFullscreen;
    private final android.graphics.Rect mOldSystemBarInsets = null;
    private final android.graphics.Rect mSystemBarInsets = null;
    private final android.graphics.Rect mTmpRect = null;
    public BackdropFrameRenderer(com.android.internal.policy.DecorView p0, android.view.ThreadedRenderer p1, android.graphics.Rect p2, android.graphics.drawable.Drawable p3, android.graphics.drawable.Drawable p4, android.graphics.drawable.Drawable p5, int p6, int p7, boolean p8, android.graphics.Insets p9) { super(); }
    void onResourcesLoaded(com.android.internal.policy.DecorView p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3, int p4, int p5) {}
    private void addSystemBarNodeIfNeeded() {}
    public void setTargetRect(android.graphics.Rect p0, boolean p1, android.graphics.Rect p2) {}
    public void onConfigurationChange() {}
    void releaseRenderer() {}
    public void run() {}
    public void doFrame(long p0) {}
    private void doFrameUncheckedLocked() {}
    boolean onContentDrawn(int p0, int p1, int p2, int p3) { return false; }
    void onRequestDraw(boolean p0) {}
    private void redrawLocked(android.graphics.Rect p0, boolean p1) {}
    private void drawColorViews(int p0, int p1, int p2, int p3, boolean p4) {}
    private void reportDrawIfNeeded() {}
    private void pingRenderLocked(boolean p0) {}
    void setUserCaptionBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
}
