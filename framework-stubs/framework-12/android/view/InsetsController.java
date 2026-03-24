package android.view;

public class InsetsController implements android.view.WindowInsetsController, android.view.InsetsAnimationControlCallbacks {
    private int mTypesBeingCancelled;
    private static final java.lang.String TAG = "InsetsController";
    private static final int ANIMATION_DURATION_MOVE_IN_MS = 275;
    private static final int ANIMATION_DURATION_MOVE_OUT_MS = 340;
    private static final int ANIMATION_DURATION_FADE_IN_MS = 500;
    private static final int ANIMATION_DURATION_FADE_OUT_MS = 1500;
    private static final int ANIMATION_DELAY_DIM_MS = 500;
    private static final int ANIMATION_DURATION_SYNC_IME_MS = 285;
    private static final int ANIMATION_DURATION_UNSYNC_IME_MS = 200;
    private static final int PENDING_CONTROL_TIMEOUT_MS = 2000;
    private static final android.view.animation.Interpolator SYSTEM_BARS_INSETS_INTERPOLATOR = null;
    private static final android.view.animation.Interpolator SYSTEM_BARS_ALPHA_INTERPOLATOR = null;
    private static final android.view.animation.Interpolator SYSTEM_BARS_DIM_INTERPOLATOR = null;
    private static final android.view.animation.Interpolator SYNC_IME_INTERPOLATOR = null;
    private static final android.view.animation.Interpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = null;
    private static final android.view.animation.Interpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = null;
    private static final int FLOATING_IME_BOTTOM_INSET_DP = -80;
    static final boolean DEBUG = false;
    static final boolean WARN = false;
    public static final int LAYOUT_INSETS_DURING_ANIMATION_SHOWN = 0;
    public static final int LAYOUT_INSETS_DURING_ANIMATION_HIDDEN = 1;
    public static final int ANIMATION_TYPE_NONE = -1;
    public static final int ANIMATION_TYPE_SHOW = 0;
    public static final int ANIMATION_TYPE_HIDE = 1;
    public static final int ANIMATION_TYPE_USER = 2;
    private static android.animation.TypeEvaluator<android.graphics.Insets> sEvaluator;
    private final android.view.InsetsState mState = null;
    private final android.view.InsetsState mLastDispatchedState = null;
    private final android.view.InsetsState mRequestedState = null;
    private final android.graphics.Rect mFrame = null;
    private final java.util.function.BiFunction<android.view.InsetsController, java.lang.Integer, android.view.InsetsSourceConsumer> mConsumerCreator = null;
    private final android.util.SparseArray<android.view.InsetsSourceConsumer> mSourceConsumers = null;
    private final android.view.InsetsController.Host mHost = null;
    private final android.os.Handler mHandler = null;
    private final android.util.SparseArray<android.view.InsetsSourceControl> mTmpControlArray = null;
    private final java.util.ArrayList<android.view.InsetsController.RunningAnimation> mRunningAnimations = null;
    private final java.util.ArrayList<android.view.InsetsAnimationControlImpl> mTmpFinishedControls = null;
    private final android.util.ArraySet<android.view.InsetsSourceConsumer> mRequestedVisibilityChanged = null;
    private android.view.WindowInsets mLastInsets;
    private boolean mAnimCallbackScheduled;
    private final java.lang.Runnable mAnimCallback = null;
    private android.view.InsetsController.PendingControlRequest mPendingImeControlRequest;
    private int mWindowType;
    private int mLastLegacySoftInputMode;
    private int mLastLegacyWindowFlags;
    private int mLastLegacySystemUiFlags;
    private int mLastWindowingMode;
    private boolean mStartingAnimation;
    private int mCaptionInsetsHeight;
    private boolean mAnimationsDisabled;
    private java.lang.Runnable mPendingControlTimeout;
    private final java.util.ArrayList<android.view.WindowInsetsController.OnControllableInsetsChangedListener> mControllableInsetsChangedListeners = null;
    private int mLastStartedAnimTypes;
    private int mDisabledUserAnimationInsetsTypes;
    private java.lang.Runnable mInvokeControllableInsetsChangedListeners;
    public InsetsController(android.view.InsetsController.Host p0) {}
    public InsetsController(android.view.InsetsController.Host p0, java.util.function.BiFunction<android.view.InsetsController, java.lang.Integer, android.view.InsetsSourceConsumer> p1, android.os.Handler p2) {}
    public void onFrameChanged(android.graphics.Rect p0) {}
    public android.view.InsetsState getState() { return null; }
    public boolean isRequestedVisible(int p0) { return false; }
    public android.view.InsetsState getLastDispatchedState() { return null; }
    public boolean onStateChanged(android.view.InsetsState p0) { return false; }
    private void updateState(android.view.InsetsState p0) {}
    private void updateDisabledUserAnimationTypes(int p0) {}
    private boolean captionInsetsUnchanged() { return false; }
    public android.view.WindowInsets calculateInsets(boolean p0, boolean p1, int p2, int p3, int p4, int p5, int p6) { return null; }
    public android.graphics.Rect calculateVisibleInsets(int p0) { return null; }
    public void onControlsChanged(android.view.InsetsSourceControl[] p0) {}
    public void show(int p0) {}
    public void show(int p0, boolean p1) {}
    public void hide(int p0) {}
    public void hide(int p0, boolean p1) {}
    public void controlWindowInsetsAnimation(int p0, long p1, android.view.animation.Interpolator p2, android.os.CancellationSignal p3, android.view.WindowInsetsAnimationControlListener p4) {}
    private void controlWindowInsetsAnimation(int p0, android.os.CancellationSignal p1, android.view.WindowInsetsAnimationControlListener p2, boolean p3, long p4, android.view.animation.Interpolator p5, int p6) {}
    private void controlAnimationUnchecked(int p0, android.os.CancellationSignal p1, android.view.WindowInsetsAnimationControlListener p2, android.graphics.Rect p3, boolean p4, long p5, android.view.animation.Interpolator p6, int p7, int p8, boolean p9) {}
    private android.util.Pair<java.lang.Integer, java.lang.Boolean> collectSourceControls(boolean p0, android.util.ArraySet<java.lang.Integer> p1, android.util.SparseArray<android.view.InsetsSourceControl> p2, int p3) { return null; }
    private int getLayoutInsetsDuringAnimationMode(int p0) { return 0; }
    private void cancelExistingControllers(int p0) {}
    private void abortPendingImeControlRequest() {}
    public void notifyFinished(android.view.InsetsAnimationControlRunner p0, boolean p1) {}
    public void applySurfaceParams(android.view.SyncRtSurfaceTransactionApplier.SurfaceParams... p0) {}
    void notifyControlRevoked(android.view.InsetsSourceConsumer p0) {}
    private void cancelAnimation(android.view.InsetsAnimationControlRunner p0, boolean p1) {}
    private void applyLocalVisibilityOverride() {}
    public android.view.InsetsSourceConsumer getSourceConsumer(int p0) { return null; }
    public void notifyVisibilityChanged() {}
    public void updateCompatSysUiVisibility(int p0, boolean p1, boolean p2) {}
    public void onWindowFocusGained(boolean p0) {}
    public void onWindowFocusLost() {}
    public int getAnimationType(int p0) { return 0; }
    public void onRequestedVisibilityChanged(android.view.InsetsSourceConsumer p0) {}
    private void updateRequestedVisibility() {}
    android.view.InsetsState getRequestedVisibility() { return null; }
    public void applyAnimation(int p0, boolean p1, boolean p2) {}
    public void applyAnimation(int p0, boolean p1, boolean p2, boolean p3) {}
    private void hideDirectly(int p0, boolean p1, int p2, boolean p3) {}
    private void showDirectly(int p0, boolean p1) {}
    public void cancelExistingAnimations() {}
    void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void startAnimation(android.view.InsetsAnimationControlImpl p0, android.view.WindowInsetsAnimationControlListener p1, int p2, android.view.WindowInsetsAnimation p3, android.view.WindowInsetsAnimation.Bounds p4) {}
    public void dispatchAnimationEnd(android.view.WindowInsetsAnimation p0) {}
    public void scheduleApplyChangeInsets(android.view.InsetsAnimationControlRunner p0) {}
    public void setSystemBarsAppearance(int p0, int p1) {}
    public int getSystemBarsAppearance() { return 0; }
    public void setCaptionInsetsHeight(int p0) {}
    public void setSystemBarsBehavior(int p0) {}
    public int getSystemBarsBehavior() { return 0; }
    public void setAnimationsDisabled(boolean p0) {}
    private int calculateControllableTypes() { return 0; }
    private int invokeControllableInsetsChangedListeners() { return 0; }
    public void addOnControllableInsetsChangedListener(android.view.WindowInsetsController.OnControllableInsetsChangedListener p0) {}
    public void removeOnControllableInsetsChangedListener(android.view.WindowInsetsController.OnControllableInsetsChangedListener p0) {}
    public void releaseSurfaceControlFromRt(android.view.SurfaceControl p0) {}
    public void reportPerceptible(int p0, boolean p1) {}
    android.view.InsetsController.Host getHost() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface AnimationType {
    }

    public static interface Host {
        public android.os.Handler getHandler();
        public void notifyInsetsChanged();
        public void dispatchWindowInsetsAnimationPrepare(android.view.WindowInsetsAnimation p0);
        public android.view.WindowInsetsAnimation.Bounds dispatchWindowInsetsAnimationStart(android.view.WindowInsetsAnimation p0, android.view.WindowInsetsAnimation.Bounds p1);
        public android.view.WindowInsets dispatchWindowInsetsAnimationProgress(android.view.WindowInsets p0, java.util.List<android.view.WindowInsetsAnimation> p1);
        public void dispatchWindowInsetsAnimationEnd(android.view.WindowInsetsAnimation p0);
        public void applySurfaceParams(android.view.SyncRtSurfaceTransactionApplier.SurfaceParams... p0);
        public void updateCompatSysUiVisibility(int p0, boolean p1, boolean p2);
        public void onInsetsModified(android.view.InsetsState p0);
        public boolean hasAnimationCallbacks();
        public void setSystemBarsAppearance(int p0, int p1);
        public int getSystemBarsAppearance();
        default public boolean isSystemBarsAppearanceControlled() { return false; }
        public void setSystemBarsBehavior(int p0);
        public int getSystemBarsBehavior();
        default public boolean isSystemBarsBehaviorControlled() { return false; }
        public void releaseSurfaceControlFromRt(android.view.SurfaceControl p0);
        public void addOnPreDrawRunnable(java.lang.Runnable p0);
        public void postInsetsAnimationCallback(java.lang.Runnable p0);
        public android.view.inputmethod.InputMethodManager getInputMethodManager();
        public java.lang.String getRootViewTitle();
        public int dipToPx(int p0);
        public android.os.IBinder getWindowToken();
        default public android.content.res.CompatibilityInfo.Translator getTranslator() { return null; }
    }

    public static class InternalAnimationControlListener implements android.view.WindowInsetsAnimationControlListener {
        private android.view.WindowInsetsAnimationController mController;
        private android.animation.ValueAnimator mAnimator;
        private final boolean mShow = false;
        private final boolean mHasAnimationCallbacks = false;
        private final int mRequestedTypes = 0;
        private final int mBehavior = 0;
        private final long mDurationMs = 0L;
        private final boolean mDisable = false;
        private final int mFloatingImeBottomInset = 0;
        private java.lang.ThreadLocal<android.animation.AnimationHandler> mSfAnimationHandlerThreadLocal;
        public InternalAnimationControlListener(boolean p0, boolean p1, int p2, int p3, boolean p4, int p5) {}
        public void onReady(android.view.WindowInsetsAnimationController p0, int p1) {}
        public void onFinished(android.view.WindowInsetsAnimationController p0) {}
        public void onCancelled(android.view.WindowInsetsAnimationController p0) {}
        protected android.view.animation.Interpolator getInsetsInterpolator() { return null; }
        android.view.animation.Interpolator getAlphaInterpolator() { return null; }
        protected void onAnimationFinish() {}
        public long getDurationMs() { return 0L; }
        private long calculateDurationMs() { return 0L; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface LayoutInsetsDuringAnimation {
    }

    private static class PendingControlRequest {
        final int types = 0;
        final android.view.WindowInsetsAnimationControlListener listener = null;
        final long durationMs = 0L;
        final android.view.animation.Interpolator interpolator = null;
        final int animationType = 0;
        final int layoutInsetsDuringAnimation = 0;
        final android.os.CancellationSignal cancellationSignal = null;
        final boolean useInsetsAnimationThread = false;
        PendingControlRequest(int p0, android.view.WindowInsetsAnimationControlListener p1, long p2, android.view.animation.Interpolator p3, int p4, int p5, android.os.CancellationSignal p6, boolean p7) {}
    }

    private static class RunningAnimation {
        final android.view.InsetsAnimationControlRunner runner = null;
        final int type = 0;
        boolean startDispatched;
        RunningAnimation(android.view.InsetsAnimationControlRunner p0, int p1) {}
    }
}
