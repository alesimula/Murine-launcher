package com.android.internal.policy;

public class TransitionAnimation {
    public static final int WALLPAPER_TRANSITION_NONE = 0;
    public static final int WALLPAPER_TRANSITION_CHANGE = 1;
    public static final int WALLPAPER_TRANSITION_OPEN = 2;
    public static final int WALLPAPER_TRANSITION_CLOSE = 3;
    public static final int WALLPAPER_TRANSITION_INTRA_OPEN = 4;
    public static final int WALLPAPER_TRANSITION_INTRA_CLOSE = 5;
    public static final int DEFAULT_APP_TRANSITION_DURATION = 336;
    static final android.view.animation.Interpolator TOUCH_RESPONSE_INTERPOLATOR = null;
    public TransitionAnimation(android.content.Context p0, boolean p1, java.lang.String p2) {}
    public android.view.animation.Animation loadKeyguardExitAnimation(int p0, boolean p1) { return null; }
    @android.annotation.Nullable
    public android.view.animation.Animation loadKeyguardUnoccludeAnimation(int p0) { return null; }
    @android.annotation.Nullable
    public android.view.animation.Animation loadKeyguardUnoccludeAnimation() { return null; }
    @android.annotation.Nullable
    public android.view.animation.Animation loadVoiceActivityOpenAnimation(boolean p0, int p1) { return null; }
    @android.annotation.Nullable
    public android.view.animation.Animation loadVoiceActivityOpenAnimation(boolean p0) { return null; }
    @android.annotation.Nullable
    public android.view.animation.Animation loadVoiceActivityExitAnimation(boolean p0, int p1) { return null; }
    @android.annotation.Nullable
    public android.view.animation.Animation loadVoiceActivityExitAnimation(boolean p0) { return null; }
    @android.annotation.Nullable
    public android.view.animation.Animation loadAppTransitionAnimation(java.lang.String p0, int p1) { return null; }
    @android.annotation.Nullable
    public android.view.animation.Animation loadCrossProfileAppEnterAnimation(int p0) { return null; }
    @android.annotation.Nullable
    public android.view.animation.Animation loadCrossProfileAppEnterAnimation() { return null; }
    @android.annotation.Nullable
    public android.view.animation.Animation loadCrossProfileAppThumbnailEnterAnimation() { return null; }
    @android.annotation.Nullable
    public android.view.animation.Animation createCrossProfileAppsThumbnailAnimationLocked(android.graphics.Rect p0) { return null; }
    @android.annotation.Nullable
    public android.view.animation.Animation loadAnimationRes(java.lang.String p0, int p1, int p2) { return null; }
    @android.annotation.Nullable
    public android.view.animation.Animation loadAnimationRes(java.lang.String p0, int p1) { return null; }
    @android.annotation.Nullable
    public android.view.animation.Animation loadDefaultAnimationRes(int p0, int p1) { return null; }
    @android.annotation.Nullable
    public android.view.animation.Animation loadDefaultAnimationRes(int p0) { return null; }
    @android.annotation.Nullable
    public android.view.animation.Animation loadAnimationAttr(android.view.WindowManager.LayoutParams p0, int p1, int p2) { return null; }
    public int getAnimationResId(android.view.WindowManager.LayoutParams p0, int p1, int p2) { return 0; }
    public int getDefaultAnimationResId(int p0, int p1) { return 0; }
    @android.annotation.Nullable
    public android.view.animation.Animation loadAnimationAttr(java.lang.String p0, int p1, int p2, boolean p3) { return null; }
    @android.annotation.Nullable
    public android.view.animation.Animation loadDefaultAnimationAttr(int p0, boolean p1) { return null; }
    @android.annotation.Nullable
    public android.view.animation.Animation loadDefaultAnimationAttr(int p0, int p1) { return null; }
    public int getAnimationStyleResId(android.view.WindowManager.LayoutParams p0) { return 0; }
    public android.view.animation.Animation createRelaunchAnimation(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2) { return null; }
    public android.view.animation.Animation createClipRevealAnimationLocked(int p0, int p1, boolean p2, android.graphics.Rect p3, android.graphics.Rect p4, android.graphics.Rect p5) { return null; }
    public android.view.animation.Animation createClipRevealAnimationLockedCompat(int p0, boolean p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4) { return null; }
    public android.view.animation.Animation createScaleUpAnimationLocked(int p0, int p1, boolean p2, android.graphics.Rect p3, android.graphics.Rect p4) { return null; }
    public android.view.animation.Animation createScaleUpAnimationLockedCompat(int p0, boolean p1, android.graphics.Rect p2, android.graphics.Rect p3) { return null; }
    public android.view.animation.Animation createThumbnailEnterExitAnimationLocked(boolean p0, boolean p1, android.graphics.Rect p2, int p3, int p4, android.hardware.HardwareBuffer p5, android.graphics.Rect p6) { return null; }
    public android.view.animation.Animation createThumbnailEnterExitAnimationLockedCompat(boolean p0, boolean p1, android.graphics.Rect p2, int p3, android.hardware.HardwareBuffer p4, android.graphics.Rect p5) { return null; }
    public android.view.animation.Animation createAspectScaledThumbnailEnterExitAnimationLocked(boolean p0, boolean p1, int p2, int p3, android.graphics.Rect p4, android.graphics.Rect p5, android.graphics.Rect p6, android.graphics.Rect p7, boolean p8, android.graphics.Rect p9, android.graphics.Rect p10) { return null; }
    public android.view.animation.Animation createThumbnailAspectScaleAnimationLocked(android.graphics.Rect p0, android.graphics.Rect p1, android.hardware.HardwareBuffer p2, int p3, android.graphics.Rect p4, android.graphics.Rect p5, boolean p6) { return null; }
    public android.hardware.HardwareBuffer createCrossProfileAppsThumbnail(android.graphics.drawable.Drawable p0, android.graphics.Rect p1) { return null; }
    public static android.view.animation.Animation prepareThumbnailAnimationWithDuration(android.view.animation.Animation p0, int p1, int p2, long p3, android.view.animation.Interpolator p4) { return null; }
    public static float computePivot(int p0, float p1) { return 0.0f; }
    @android.annotation.Nullable
    public static android.view.animation.Animation loadAnimationSafely(android.content.Context p0, int p1, java.lang.String p2) { return null; }
    public static android.view.animation.Animation createHiddenByKeyguardExit(android.content.Context p0, com.android.internal.policy.LogDecelerateInterpolator p1, boolean p2, boolean p3, boolean p4) { return null; }
    public static void configureScreenshotLayer(android.view.SurfaceControl.Transaction p0, android.view.SurfaceControl p1, android.window.ScreenCapture.ScreenshotHardwareBuffer p2) {}
    public static boolean hasProtectedContent(android.hardware.HardwareBuffer p0) { return false; }
    public static float getBorderLuma(android.hardware.HardwareBuffer p0, android.graphics.ColorSpace p1, android.view.SurfaceControl p2) { return 0.0f; }
    public static float getBorderLuma(android.view.SurfaceControl p0, int p1, int p2) { return 0.0f; }
    public static float getBorderLuma(android.hardware.HardwareBuffer p0, android.graphics.ColorSpace p1) { return 0.0f; }
    public static void initAttributeCache(android.content.Context p0, android.os.Handler p1) {}
}
