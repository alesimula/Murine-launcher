package android.animation;

public class LayoutTransition {
    public static final int CHANGE_APPEARING = 0;
    public static final int CHANGE_DISAPPEARING = 1;
    public static final int APPEARING = 2;
    public static final int DISAPPEARING = 3;
    public static final int CHANGING = 4;
    private static final int FLAG_APPEARING = 1;
    private static final int FLAG_DISAPPEARING = 2;
    private static final int FLAG_CHANGE_APPEARING = 4;
    private static final int FLAG_CHANGE_DISAPPEARING = 8;
    private static final int FLAG_CHANGING = 16;
    private android.animation.Animator mDisappearingAnim;
    private android.animation.Animator mAppearingAnim;
    private android.animation.Animator mChangingAppearingAnim;
    private android.animation.Animator mChangingDisappearingAnim;
    private android.animation.Animator mChangingAnim;
    private static android.animation.ObjectAnimator defaultChange;
    private static android.animation.ObjectAnimator defaultChangeIn;
    private static android.animation.ObjectAnimator defaultChangeOut;
    private static android.animation.ObjectAnimator defaultFadeIn;
    private static android.animation.ObjectAnimator defaultFadeOut;
    private static long DEFAULT_DURATION;
    private long mChangingAppearingDuration;
    private long mChangingDisappearingDuration;
    private long mChangingDuration;
    private long mAppearingDuration;
    private long mDisappearingDuration;
    private long mAppearingDelay;
    private long mDisappearingDelay;
    private long mChangingAppearingDelay;
    private long mChangingDisappearingDelay;
    private long mChangingDelay;
    private long mChangingAppearingStagger;
    private long mChangingDisappearingStagger;
    private long mChangingStagger;
    private static android.animation.TimeInterpolator ACCEL_DECEL_INTERPOLATOR;
    private static android.animation.TimeInterpolator DECEL_INTERPOLATOR;
    private static android.animation.TimeInterpolator sAppearingInterpolator;
    private static android.animation.TimeInterpolator sDisappearingInterpolator;
    private static android.animation.TimeInterpolator sChangingAppearingInterpolator;
    private static android.animation.TimeInterpolator sChangingDisappearingInterpolator;
    private static android.animation.TimeInterpolator sChangingInterpolator;
    private android.animation.TimeInterpolator mAppearingInterpolator;
    private android.animation.TimeInterpolator mDisappearingInterpolator;
    private android.animation.TimeInterpolator mChangingAppearingInterpolator;
    private android.animation.TimeInterpolator mChangingDisappearingInterpolator;
    private android.animation.TimeInterpolator mChangingInterpolator;
    private final java.util.HashMap<android.view.View, android.animation.Animator> pendingAnimations = null;
    private final java.util.LinkedHashMap<android.view.View, android.animation.Animator> currentChangingAnimations = null;
    private final java.util.LinkedHashMap<android.view.View, android.animation.Animator> currentAppearingAnimations = null;
    private final java.util.LinkedHashMap<android.view.View, android.animation.Animator> currentDisappearingAnimations = null;
    private final java.util.HashMap<android.view.View, android.view.View.OnLayoutChangeListener> layoutChangeListenerMap = null;
    private long staggerDelay;
    private int mTransitionTypes;
    private java.util.ArrayList<android.animation.LayoutTransition.TransitionListener> mListeners;
    private boolean mAnimateParentHierarchy;
    public LayoutTransition() {}
    public void setDuration(long p0) {}
    public void enableTransitionType(int p0) {}
    public void disableTransitionType(int p0) {}
    public boolean isTransitionTypeEnabled(int p0) { return false; }
    public void setStartDelay(int p0, long p1) {}
    public long getStartDelay(int p0) { return 0L; }
    public void setDuration(int p0, long p1) {}
    public long getDuration(int p0) { return 0L; }
    public void setStagger(int p0, long p1) {}
    public long getStagger(int p0) { return 0L; }
    public void setInterpolator(int p0, android.animation.TimeInterpolator p1) {}
    public android.animation.TimeInterpolator getInterpolator(int p0) { return null; }
    public void setAnimator(int p0, android.animation.Animator p1) {}
    public android.animation.Animator getAnimator(int p0) { return null; }
    private void runChangeTransition(android.view.ViewGroup p0, android.view.View p1, int p2) {}
    public void setAnimateParentHierarchy(boolean p0) {}
    private void setupChangeAnimation(android.view.ViewGroup p0, int p1, android.animation.Animator p2, long p3, android.view.View p4) {}
    public void startChangingAnimations() {}
    public void endChangingAnimations() {}
    public boolean isChangingLayout() { return false; }
    public boolean isRunning() { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public void cancel() {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public void cancel(int p0) {}
    private void runAppearingTransition(android.view.ViewGroup p0, android.view.View p1) {}
    private void runDisappearingTransition(android.view.ViewGroup p0, android.view.View p1) {}
    private void addChild(android.view.ViewGroup p0, android.view.View p1, boolean p2) {}
    private boolean hasListeners() { return false; }
    public void layoutChange(android.view.ViewGroup p0) {}
    public void addChild(android.view.ViewGroup p0, android.view.View p1) {}
    @java.lang.Deprecated
    public void showChild(android.view.ViewGroup p0, android.view.View p1) {}
    public void showChild(android.view.ViewGroup p0, android.view.View p1, int p2) {}
    private void removeChild(android.view.ViewGroup p0, android.view.View p1, boolean p2) {}
    public void removeChild(android.view.ViewGroup p0, android.view.View p1) {}
    @java.lang.Deprecated
    public void hideChild(android.view.ViewGroup p0, android.view.View p1) {}
    public void hideChild(android.view.ViewGroup p0, android.view.View p1, int p2) {}
    public void addTransitionListener(android.animation.LayoutTransition.TransitionListener p0) {}
    public void removeTransitionListener(android.animation.LayoutTransition.TransitionListener p0) {}
    public java.util.List<android.animation.LayoutTransition.TransitionListener> getTransitionListeners() { return null; }

    public static interface TransitionListener {
        public void startTransition(android.animation.LayoutTransition p0, android.view.ViewGroup p1, android.view.View p2, int p3);
        public void endTransition(android.animation.LayoutTransition p0, android.view.ViewGroup p1, android.view.View p2, int p3);
    }

    private static final class CleanupCallback implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {
        final java.util.Map<android.view.View, android.view.View.OnLayoutChangeListener> layoutChangeListenerMap = null;
        final android.view.ViewGroup parent = null;
        CleanupCallback(java.util.Map<android.view.View, android.view.View.OnLayoutChangeListener> p0, android.view.ViewGroup p1) {}
        private void cleanup() {}
        public void onViewAttachedToWindow(android.view.View p0) {}
        public void onViewDetachedFromWindow(android.view.View p0) {}
        public boolean onPreDraw() { return false; }
    }
}
