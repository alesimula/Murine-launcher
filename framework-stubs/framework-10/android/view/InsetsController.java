package android.view;

public class InsetsController implements android.view.WindowInsetsController {
    private static final int ANIMATION_DURATION_SHOW_MS = 275;
    private static final int ANIMATION_DURATION_HIDE_MS = 340;
    private static final android.view.animation.Interpolator INTERPOLATOR = null;
    private static final int DIRECTION_NONE = 0;
    private static final int DIRECTION_SHOW = 1;
    private static final int DIRECTION_HIDE = 2;
    private static android.animation.TypeEvaluator<android.graphics.Insets> sEvaluator;
    private final java.lang.String TAG = null;
    private final android.view.InsetsState mState = null;
    private final android.view.InsetsState mTmpState = null;
    private final android.graphics.Rect mFrame = null;
    private final android.util.SparseArray<android.view.InsetsSourceConsumer> mSourceConsumers = null;
    private final android.view.ViewRootImpl mViewRoot = null;
    private final android.util.SparseArray<android.view.InsetsSourceControl> mTmpControlArray = null;
    private final java.util.ArrayList<android.view.InsetsAnimationControlImpl> mAnimationControls = null;
    private final java.util.ArrayList<android.view.InsetsAnimationControlImpl> mTmpFinishedControls = null;
    private android.view.WindowInsets mLastInsets;
    private boolean mAnimCallbackScheduled;
    private final java.lang.Runnable mAnimCallback = null;
    private final android.graphics.Rect mLastLegacyContentInsets = null;
    private final android.graphics.Rect mLastLegacyStableInsets = null;
    @android.view.InsetsController.AnimationDirection
    private int mAnimationDirection;
    private int mPendingTypesToShow;
    private int mLastLegacySoftInputMode;
    public InsetsController(android.view.ViewRootImpl p0) {}
    public void onFrameChanged(android.graphics.Rect p0) {}
    public android.view.InsetsState getState() { return null; }
    boolean onStateChanged(android.view.InsetsState p0) { return false; }
    public android.view.WindowInsets calculateInsets(boolean p0, boolean p1, android.view.DisplayCutout p2, android.graphics.Rect p3, android.graphics.Rect p4, int p5) { return null; }
    public void onControlsChanged(android.view.InsetsSourceControl[] p0) {}
    public void show(int p0) {}
    private void show(int p0, boolean p1) {}
    public void hide(int p0) {}
    public void controlWindowInsetsAnimation(int p0, android.view.WindowInsetsAnimationControlListener p1) {}
    private void controlWindowInsetsAnimation(int p0, android.view.WindowInsetsAnimationControlListener p1, boolean p2) {}
    private void controlAnimationUnchecked(int p0, android.view.WindowInsetsAnimationControlListener p1, android.graphics.Rect p2, boolean p3) {}
    private android.util.Pair<java.lang.Integer, java.lang.Boolean> collectConsumers(boolean p0, android.util.ArraySet<java.lang.Integer> p1, android.util.SparseArray<android.view.InsetsSourceConsumer> p2) { return null; }
    private int collectPendingConsumers(int p0, android.util.SparseArray<android.view.InsetsSourceConsumer> p1) { return 0; }
    private void cancelExistingControllers(int p0) {}
    public void notifyFinished(android.view.InsetsAnimationControlImpl p0, int p1) {}
    void notifyControlRevoked(android.view.InsetsSourceConsumer p0) {}
    private void cancelAnimation(android.view.InsetsAnimationControlImpl p0) {}
    private void applyLocalVisibilityOverride() {}
    public android.view.InsetsSourceConsumer getSourceConsumer(int p0) { return null; }
    public void notifyVisibilityChanged() {}
    public void onWindowFocusGained() {}
    public void onWindowFocusLost() {}
    android.view.ViewRootImpl getViewRoot() { return null; }
    public void applyImeVisibility(boolean p0) {}
    private android.view.InsetsSourceConsumer createConsumerOfType(int p0) { return null; }
    private void sendStateToWindowManager() {}
    private void applyAnimation(int p0, boolean p1, boolean p2) {}
    private void hideDirectly(int p0) {}
    private void showDirectly(int p0) {}
    public void cancelExistingAnimation() {}
    void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public void dispatchAnimationStarted(android.view.WindowInsetsAnimationListener.InsetsAnimation p0) {}
    public void dispatchAnimationFinished(android.view.WindowInsetsAnimationListener.InsetsAnimation p0) {}
    public void scheduleApplyChangeInsets() {}

    private static class InsetsProperty extends android.util.Property<android.view.WindowInsetsAnimationController, android.graphics.Insets> {
        InsetsProperty() { super(null, null); }
        public android.graphics.Insets get(android.view.WindowInsetsAnimationController p0) { return null; }
        public void set(android.view.WindowInsetsAnimationController p0, android.graphics.Insets p1) {}
    }

    private static @interface AnimationDirection {
    }
}
