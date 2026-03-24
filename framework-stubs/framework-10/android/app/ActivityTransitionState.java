package android.app;

class ActivityTransitionState {
    private static final java.lang.String PENDING_EXIT_SHARED_ELEMENTS = "android:pendingExitSharedElements";
    private static final java.lang.String EXITING_MAPPED_FROM = "android:exitingMappedFrom";
    private static final java.lang.String EXITING_MAPPED_TO = "android:exitingMappedTo";
    private java.util.ArrayList<java.lang.String> mPendingExitNames;
    private java.util.ArrayList<java.lang.String> mExitingFrom;
    private java.util.ArrayList<java.lang.String> mExitingTo;
    private java.util.ArrayList<android.view.View> mExitingToView;
    private android.app.ExitTransitionCoordinator mCalledExitCoordinator;
    private android.app.ExitTransitionCoordinator mReturnExitCoordinator;
    private android.app.EnterTransitionCoordinator mEnterTransitionCoordinator;
    private android.app.ActivityOptions mEnterActivityOptions;
    private boolean mHasExited;
    private boolean mIsEnterPostponed;
    private android.util.SparseArray<java.lang.ref.WeakReference<android.app.ExitTransitionCoordinator>> mExitTransitionCoordinators;
    private int mExitTransitionCoordinatorsKey;
    private boolean mIsEnterTriggered;
    public ActivityTransitionState() {}
    public int addExitTransitionCoordinator(android.app.ExitTransitionCoordinator p0) { return 0; }
    public void readState(android.os.Bundle p0) {}
    private java.util.ArrayList<java.lang.String> getPendingExitNames() { return null; }
    public void saveState(android.os.Bundle p0) {}
    public void setEnterActivityOptions(android.app.Activity p0, android.app.ActivityOptions p1) {}
    public void enterReady(android.app.Activity p0) {}
    public void postponeEnterTransition() {}
    public void startPostponedEnterTransition() {}
    private void startEnter() {}
    public void onStop() {}
    public void onResume(android.app.Activity p0) {}
    public void clear() {}
    private void restoreExitedViews() {}
    private void restoreReenteringViews() {}
    public boolean startExitBackTransition(android.app.Activity p0) { return false; }
    public boolean isTransitionRunning() { return false; }
    public void startExitOutTransition(android.app.Activity p0, android.os.Bundle p1) {}
}
