package android.app;

public class ExitTransitionCoordinator extends android.app.ActivityTransitionCoordinator {
    private static final java.lang.String TAG = "ExitTransitionCoordinator";
    static long sMaxWaitMillis;
    private android.os.Bundle mSharedElementBundle;
    private boolean mExitNotified;
    private boolean mSharedElementNotified;
    private android.app.ExitTransitionCoordinator.ExitTransitionCallbacks mExitCallbacks;
    private boolean mIsBackgroundReady;
    private boolean mIsCanceled;
    private android.os.Handler mHandler;
    private android.animation.ObjectAnimator mBackgroundAnimator;
    private boolean mIsHidden;
    private android.os.Bundle mExitSharedElementBundle;
    private boolean mIsExitStarted;
    private boolean mSharedElementsHidden;
    public ExitTransitionCoordinator(android.app.ExitTransitionCoordinator.ExitTransitionCallbacks p0, android.view.Window p1, android.app.SharedElementCallback p2, java.util.ArrayList<java.lang.String> p3, java.util.ArrayList<java.lang.String> p4, java.util.ArrayList<android.view.View> p5, boolean p6) { super(null, null, null, false); }
    protected void onReceiveResult(int p0, android.os.Bundle p1) {}
    private void stopCancel() {}
    private void delayCancel() {}
    public void resetViews() {}
    private void sharedElementExitBack() {}
    private void startSharedElementExit(android.view.ViewGroup p0) {}
    private void hideSharedElements() {}
    public void startExit() {}
    public void startExit(android.app.Activity p0) {}
    public void stop(android.app.Activity p0) {}
    private void startExitTransition() {}
    private void fadeOutBackground() {}
    private android.transition.Transition getExitTransition() { return null; }
    private android.transition.Transition getSharedElementExitTransition() { return null; }
    private void beginTransitions() {}
    protected boolean isReadyToNotify() { return false; }
    protected void sharedElementTransitionComplete() {}
    private android.os.Bundle captureExitSharedElementsState() { return null; }
    protected void onTransitionsComplete() {}
    protected void notifyComplete() {}
    private void notifyExitComplete() {}
    private void finishIfNecessary() {}
    private void finish() {}
    protected void clearState() {}
    protected boolean moveSharedElementWithParent() { return false; }
    protected android.transition.Transition getViewsTransition() { return null; }
    protected android.transition.Transition getSharedElementTransition() { return null; }

    public static class ActivityExitTransitionCallbacks implements android.app.ExitTransitionCoordinator.ExitTransitionCallbacks {
        final android.app.Activity mActivity = null;
        ActivityExitTransitionCallbacks(android.app.Activity p0) {}
        public boolean isReturnTransitionAllowed() { return false; }
        public void onFinish() {}
    }

    public static interface ExitTransitionCallbacks {
        public boolean isReturnTransitionAllowed();
        public void onFinish();
        default public void hideSharedElements() {}
    }
}
