package com.android.internal.widget;

public class MessagingPropertyAnimator implements android.view.View.OnLayoutChangeListener {
    private static final long APPEAR_ANIMATION_LENGTH = 210L;
    private static final android.view.animation.Interpolator ALPHA_IN = null;
    public static final android.view.animation.Interpolator ALPHA_OUT = null;
    private static final int TAG_TOP_ANIMATOR = 16909427;
    private static final int TAG_TOP = 16909428;
    private static final int TAG_LAYOUT_TOP = 16909426;
    private static final int TAG_FIRST_LAYOUT = 16909425;
    private static final int TAG_ALPHA_ANIMATOR = 16909424;
    private static final com.android.internal.widget.ViewClippingUtil.ClippingParameters CLIPPING_PARAMETERS = null;
    private static final android.util.IntProperty<android.view.View> TOP = null;
    public MessagingPropertyAnimator() {}
    public void onLayoutChange(android.view.View p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8) {}
    private static boolean isFirstLayout(android.view.View p0) { return false; }
    public static void recycle(android.view.View p0) {}
    private static void setFirstLayout(android.view.View p0, boolean p1) {}
    private static void setLayoutTop(android.view.View p0, int p1) {}
    public static int getLayoutTop(android.view.View p0) { return 0; }
    public static void startLocalTranslationFrom(android.view.View p0, int p1, android.view.animation.Interpolator p2) {}
    public static void startLocalTranslationTo(android.view.View p0, int p1, android.view.animation.Interpolator p2) {}
    public static int getTop(android.view.View p0) { return 0; }
    private static void setTop(android.view.View p0, int p1) {}
    private static void updateTopAndBottom(android.view.View p0) {}
    private static void startTopAnimation(android.view.View p0, int p1, int p2, android.view.animation.Interpolator p3) {}
    private static boolean isHidingAnimated(android.view.View p0) { return false; }
    public static void fadeIn(android.view.View p0) {}
    private static void updateLayerType(android.view.View p0, boolean p1) {}
    public static void fadeOut(android.view.View p0, java.lang.Runnable p1) {}
    public static void setClippingDeactivated(android.view.View p0, boolean p1) {}
    public static boolean isAnimatingTranslation(android.view.View p0) { return false; }
    public static boolean isAnimatingAlpha(android.view.View p0) { return false; }
    public static void setToLaidOutPosition(android.view.View p0) {}
}
