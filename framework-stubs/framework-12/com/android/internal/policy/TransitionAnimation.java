package com.android.internal.policy;

public class TransitionAnimation {
    public static final int THUMBNAIL_TRANSITION_ENTER_SCALE_UP = 0;
    public static final int THUMBNAIL_TRANSITION_EXIT_SCALE_UP = 1;
    public static final int THUMBNAIL_TRANSITION_ENTER_SCALE_DOWN = 2;
    public static final int THUMBNAIL_TRANSITION_EXIT_SCALE_DOWN = 3;
    private static final int MAX_CLIP_REVEAL_TRANSITION_DURATION = 420;
    private static final int CLIP_REVEAL_TRANSLATION_Y_DP = 8;
    private static final int THUMBNAIL_APP_TRANSITION_DURATION = 336;
    public static final int DEFAULT_APP_TRANSITION_DURATION = 336;
    private static final float RECENTS_THUMBNAIL_FADEOUT_FRACTION = 0.5f;
    private static final java.lang.String DEFAULT_PACKAGE = "android";
    private final android.content.Context mContext = null;
    private final java.lang.String mTag = null;
    private final com.android.internal.policy.LogDecelerateInterpolator mInterpolator = null;
    private final android.view.animation.Interpolator mTouchResponseInterpolator = null;
    private final android.view.animation.Interpolator mClipHorizontalInterpolator = null;
    private final android.view.animation.Interpolator mDecelerateInterpolator = null;
    private final android.view.animation.Interpolator mLinearOutSlowInInterpolator = null;
    private final android.view.animation.Interpolator mThumbnailFadeOutInterpolator = null;
    private final android.graphics.Rect mTmpFromClipRect = null;
    private final android.graphics.Rect mTmpToClipRect = null;
    private final android.graphics.Rect mTmpRect = null;
    private final int mClipRevealTranslationY = 0;
    private final int mConfigShortAnimTime = 0;
    private final int mDefaultWindowAnimationStyleResId = 0;
    private final boolean mDebug = false;
    private final boolean mGridLayoutRecentsEnabled = false;
    private final boolean mLowRamRecentsEnabled = false;
    public TransitionAnimation(android.content.Context p0, boolean p1, java.lang.String p2) {}
    public android.view.animation.Animation loadKeyguardExitAnimation(int p0, boolean p1) { return null; }
    public android.view.animation.Animation loadKeyguardUnoccludeAnimation() { return null; }
    public android.view.animation.Animation loadVoiceActivityOpenAnimation(boolean p0) { return null; }
    public android.view.animation.Animation loadVoiceActivityExitAnimation(boolean p0) { return null; }
    public android.view.animation.Animation loadAppTransitionAnimation(java.lang.String p0, int p1) { return null; }
    public android.view.animation.Animation loadCrossProfileAppEnterAnimation() { return null; }
    public android.view.animation.Animation loadCrossProfileAppThumbnailEnterAnimation() { return null; }
    public android.view.animation.Animation loadAnimationRes(java.lang.String p0, int p1) { return null; }
    public android.view.animation.Animation loadDefaultAnimationRes(int p0) { return null; }
    public android.view.animation.Animation loadAnimationAttr(android.view.WindowManager.LayoutParams p0, int p1, int p2) { return null; }
    public android.view.animation.Animation loadDefaultAnimationAttr(int p0) { return null; }
    private com.android.internal.policy.AttributeCache.Entry getCachedAnimations(android.view.WindowManager.LayoutParams p0) { return null; }
    private com.android.internal.policy.AttributeCache.Entry getCachedAnimations(java.lang.String p0, int p1) { return null; }
    public int getAnimationStyleResId(android.view.WindowManager.LayoutParams p0) { return 0; }
    public android.view.animation.Animation createRelaunchAnimation(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2) { return null; }
    private void setupDefaultNextAppTransitionStartRect(android.graphics.Rect p0, android.graphics.Rect p1) {}
    public android.view.animation.Animation createClipRevealAnimationLocked(int p0, boolean p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4) { return null; }
    public android.view.animation.Animation createScaleUpAnimationLocked(int p0, boolean p1, android.graphics.Rect p2, android.graphics.Rect p3) { return null; }
    public android.view.animation.Animation createThumbnailEnterExitAnimationLocked(int p0, android.graphics.Rect p1, int p2, android.hardware.HardwareBuffer p3, android.graphics.Rect p4) { return null; }
    public android.view.animation.Animation createAspectScaledThumbnailEnterExitAnimationLocked(int p0, int p1, int p2, android.graphics.Rect p3, android.graphics.Rect p4, android.graphics.Rect p5, android.graphics.Rect p6, boolean p7, android.graphics.Rect p8, android.graphics.Rect p9) { return null; }
    private android.view.animation.Animation prepareThumbnailAnimation(android.view.animation.Animation p0, int p1, int p2, int p3) { return null; }
    private android.view.animation.Animation createAspectScaledThumbnailEnterFreeformAnimationLocked(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3) { return null; }
    private android.view.animation.Animation createAspectScaledThumbnailExitFreeformAnimationLocked(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3) { return null; }
    private void getNextAppTransitionStartRect(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2) {}
    private android.view.animation.AnimationSet createAspectScaledThumbnailFreeformAnimationLocked(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, boolean p3) { return null; }
    private boolean shouldScaleDownThumbnailTransition(int p0) { return false; }
    private static int updateToTranslucentAnimIfNeeded(int p0, int p1) { return 0; }
    private static long calculateClipRevealTransitionDuration(boolean p0, float p1, float p2, android.graphics.Rect p3) { return 0L; }
    private static android.view.animation.Animation prepareThumbnailAnimationWithDuration(android.view.animation.Animation p0, int p1, int p2, long p3, android.view.animation.Interpolator p4) { return null; }
    private static android.view.animation.Animation createCurvedMotion(float p0, float p1, float p2, float p3) { return null; }
    public static float computePivot(int p0, float p1) { return 0.0f; }
    public static android.view.animation.Animation loadAnimationSafely(android.content.Context p0, int p1, java.lang.String p2) { return null; }
    public static android.view.animation.Animation createHiddenByKeyguardExit(android.content.Context p0, com.android.internal.policy.LogDecelerateInterpolator p1, boolean p2, boolean p3, boolean p4) { return null; }
}
