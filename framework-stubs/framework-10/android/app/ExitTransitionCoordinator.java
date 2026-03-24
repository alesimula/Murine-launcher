package android.app;

class ExitTransitionCoordinator extends android.app.ActivityTransitionCoordinator {
    private static final java.lang.String TAG = "ExitTransitionCoordinator";
    private static final long MAX_WAIT_MS = 1000L;
    private android.os.Bundle mSharedElementBundle;
    private boolean mExitNotified;
    private boolean mSharedElementNotified;
    private android.app.Activity mActivity;
    private boolean mIsBackgroundReady;
    private boolean mIsCanceled;
    private android.os.Handler mHandler;
    private android.animation.ObjectAnimator mBackgroundAnimator;
    private boolean mIsHidden;
    private android.os.Bundle mExitSharedElementBundle;
    private boolean mIsExitStarted;
    private boolean mSharedElementsHidden;
    private android.app.ExitTransitionCoordinator.HideSharedElementsCallback mHideSharedElementsCallback;
    public ExitTransitionCoordinator(android.app.Activity p0, android.view.Window p1, android.app.SharedElementCallback p2, java.util.ArrayList<java.lang.String> p3, java.util.ArrayList<java.lang.String> p4, java.util.ArrayList<android.view.View> p5, boolean p6) { super(null, null, null, false); }
    void setHideSharedElementsCallback(android.app.ExitTransitionCoordinator.HideSharedElementsCallback p0) {}
    protected void onReceiveResult(int p0, android.os.Bundle p1) {}
    private void stopCancel() {}
    private void delayCancel() {}
    public void resetViews() {}
    private void sharedElementExitBack() {}
    private void startSharedElementExit(android.view.ViewGroup p0) {}
    private void hideSharedElements() {}
    public void startExit() {}
    public void startExit(int p0, android.content.Intent p1) {}
    public void stop() {}
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

    static interface HideSharedElementsCallback {
        public void hideSharedElements();
    }
}
