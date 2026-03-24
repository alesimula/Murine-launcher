package android.view;

public class InsetsController implements android.view.WindowInsetsController, android.view.InsetsAnimationControlCallbacks {
    public static final int ANIMATION_DURATION_RESIZE = 300;
    public static final android.view.animation.Interpolator RESIZE_INTERPOLATOR = null;
    static final boolean DEBUG = false;
    static final boolean WARN = false;
    public static final int LAYOUT_INSETS_DURING_ANIMATION_SHOWN = 0;
    public static final int LAYOUT_INSETS_DURING_ANIMATION_HIDDEN = 1;
    public static final int ANIMATION_TYPE_NONE = -1;
    public static final int ANIMATION_TYPE_SHOW = 0;
    public static final int ANIMATION_TYPE_HIDE = 1;
    public static final int ANIMATION_TYPE_USER = 2;
    public static final int ANIMATION_TYPE_RESIZE = 3;
    public InsetsController(android.view.InsetsController.Host p0) {}
    public InsetsController(android.view.InsetsController.Host p0, java.util.function.BiFunction<android.view.InsetsController, java.lang.Integer, android.view.InsetsSourceConsumer> p1, android.os.Handler p2) {}
    public void onFrameChanged(android.graphics.Rect p0) {}
    public android.view.InsetsState getState() { return null; }
    public boolean isRequestedVisible(int p0) { return false; }
    public android.view.InsetsState getLastDispatchedState() { return null; }
    public boolean onStateChanged(android.view.InsetsState p0) { return false; }
    public android.view.WindowInsets calculateInsets(boolean p0, boolean p1, int p2, int p3, int p4, int p5, int p6) { return null; }
    public android.graphics.Insets calculateVisibleInsets(int p0, int p1, int p2, int p3) { return null; }
    public void onControlsChanged(android.view.InsetsSourceControl[] p0) {}
    public void show(int p0) {}
    public void show(int p0, boolean p1) {}
    public void hide(int p0) {}
    public void hide(int p0, boolean p1) {}
    public void controlWindowInsetsAnimation(int p0, long p1, android.view.animation.Interpolator p2, android.os.CancellationSignal p3, android.view.WindowInsetsAnimationControlListener p4) {}
    public void setSystemDrivenInsetsAnimationLoggingListener(android.view.WindowInsetsAnimationControlListener p0) {}
    public void notifyFinished(android.view.InsetsAnimationControlRunner p0, boolean p1) {}
    public void applySurfaceParams(android.view.SyncRtSurfaceTransactionApplier.SurfaceParams... p0) {}
    void notifyControlRevoked(android.view.InsetsSourceConsumer p0) {}
    public android.view.InsetsSourceConsumer getSourceConsumer(int p0) { return null; }
    public void notifyVisibilityChanged() {}
    public void updateCompatSysUiVisibility(int p0, boolean p1, boolean p2) {}
    public void onWindowFocusGained(boolean p0) {}
    public void onWindowFocusLost() {}
    public int getAnimationType(int p0) { return 0; }
    public void onRequestedVisibilityChanged(android.view.InsetsSourceConsumer p0) {}
    android.view.InsetsVisibilities getRequestedVisibilities() { return null; }
    public void applyAnimation(int p0, boolean p1, boolean p2) {}
    public void applyAnimation(int p0, boolean p1, boolean p2, boolean p3) {}
    public void cancelExistingAnimations() {}
    void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public <T extends android.view.InsetsAnimationControlRunner & android.view.InternalInsetsAnimationController> void startAnimation(T p0, android.view.WindowInsetsAnimationControlListener p1, int p2, android.view.WindowInsetsAnimation p3, android.view.WindowInsetsAnimation.Bounds p4) {}
    public void dispatchAnimationEnd(android.view.WindowInsetsAnimation p0) {}
    public void scheduleApplyChangeInsets(android.view.InsetsAnimationControlRunner p0) {}
    public void setSystemBarsAppearance(int p0, int p1) {}
    public int getSystemBarsAppearance() { return 0; }
    public void setCaptionInsetsHeight(int p0) {}
    public void setSystemBarsBehavior(int p0) {}
    public int getSystemBarsBehavior() { return 0; }
    public void setAnimationsDisabled(boolean p0) {}
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
        public void updateRequestedVisibilities(android.view.InsetsVisibilities p0);
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
        public InternalAnimationControlListener(boolean p0, boolean p1, int p2, int p3, boolean p4, int p5, android.view.WindowInsetsAnimationControlListener p6) {}
        public void onReady(android.view.WindowInsetsAnimationController p0, int p1) {}
        public void onFinished(android.view.WindowInsetsAnimationController p0) {}
        public void onCancelled(android.view.WindowInsetsAnimationController p0) {}
        protected android.view.animation.Interpolator getInsetsInterpolator() { return null; }
        android.view.animation.Interpolator getAlphaInterpolator() { return null; }
        protected void onAnimationFinish() {}
        public long getDurationMs() { return 0L; }
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
