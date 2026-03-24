package android.app;

class EnterTransitionCoordinator extends android.app.ActivityTransitionCoordinator {
    private static final java.lang.String TAG = "EnterTransitionCoordinator";
    private static final int MIN_ANIMATION_FRAMES = 2;
    private boolean mSharedElementTransitionStarted;
    private android.app.Activity mActivity;
    private boolean mIsTaskRoot;
    private boolean mHasStopped;
    private boolean mIsCanceled;
    private android.animation.ObjectAnimator mBackgroundAnimator;
    private boolean mIsExitTransitionComplete;
    private boolean mIsReadyForTransition;
    private android.os.Bundle mSharedElementsBundle;
    private boolean mWasOpaque;
    private boolean mAreViewsReady;
    private boolean mIsViewsTransitionStarted;
    private android.transition.Transition mEnterViewsTransition;
    private com.android.internal.view.OneShotPreDrawListener mViewsReadyListener;
    private final boolean mIsCrossTask = false;
    private android.graphics.drawable.Drawable mReplacedBackground;
    private java.util.ArrayList<java.lang.String> mPendingExitNames;
    private java.lang.Runnable mOnTransitionComplete;
    EnterTransitionCoordinator(android.app.Activity p0, android.os.ResultReceiver p1, java.util.ArrayList<java.lang.String> p2, boolean p3, boolean p4) { super(null, null, null, false); }
    boolean isCrossTask() { return false; }
    public void viewInstancesReady(java.util.ArrayList<java.lang.String> p0, java.util.ArrayList<java.lang.String> p1, java.util.ArrayList<android.view.View> p2) {}
    public void namedViewsReady(java.util.ArrayList<java.lang.String> p0, java.util.ArrayList<java.lang.String> p1) {}
    public android.transition.Transition getEnterViewsTransition() { return null; }
    protected void viewsReady(android.util.ArrayMap<java.lang.String, android.view.View> p0) {}
    private void triggerViewsReady(android.util.ArrayMap<java.lang.String, android.view.View> p0) {}
    private android.util.ArrayMap<java.lang.String, android.view.View> mapNamedElements(java.util.ArrayList<java.lang.String> p0, java.util.ArrayList<java.lang.String> p1) { return null; }
    private void sendSharedElementDestination() {}
    private static android.app.SharedElementCallback getListener(android.app.Activity p0, boolean p1) { return null; }
    protected void onReceiveResult(int p0, android.os.Bundle p1) {}
    public boolean isWaitingForRemoteExit() { return false; }
    public java.util.ArrayList<java.lang.String> getPendingExitSharedElementNames() { return null; }
    public void forceViewsToAppear() {}
    private void cancel() {}
    public boolean isReturning() { return false; }
    protected void prepareEnter() {}
    protected android.transition.Transition getViewsTransition() { return null; }
    protected android.transition.Transition getSharedElementTransition() { return null; }
    private void startSharedElementTransition(android.os.Bundle p0) {}
    private static void removeNullViews(java.util.ArrayList<android.view.View> p0) {}
    private void onTakeSharedElements() {}
    private void requestLayoutForSharedElements() {}
    private android.transition.Transition beginTransition(android.view.ViewGroup p0, boolean p1, boolean p2) { return null; }
    public void runAfterTransitionsComplete(java.lang.Runnable p0) {}
    protected void onTransitionsComplete() {}
    private void sharedElementTransitionStarted() {}
    private void startEnterTransition(android.transition.Transition p0) {}
    public void stop() {}
    public boolean cancelEnter() { return false; }
    protected void clearState() {}
    private void makeOpaque() {}
    private boolean allowOverlappingTransitions() { return false; }
    private void startRejectedAnimations(java.util.ArrayList<android.view.View> p0) {}
    protected void onRemoteExitTransitionComplete() {}
    private void startEnterTransitionOnly() {}
}
