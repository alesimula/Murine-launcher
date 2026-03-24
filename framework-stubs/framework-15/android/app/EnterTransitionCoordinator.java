package android.app;

class EnterTransitionCoordinator extends android.app.ActivityTransitionCoordinator {
    EnterTransitionCoordinator(android.app.Activity p0, android.os.ResultReceiver p1, java.util.ArrayList<java.lang.String> p2, boolean p3, boolean p4) { super(null, null, null, false); }
    boolean isCrossTask() { return false; }
    public void viewInstancesReady(java.util.ArrayList<java.lang.String> p0, java.util.ArrayList<java.lang.String> p1, java.util.ArrayList<android.view.View> p2) {}
    public void namedViewsReady(java.util.ArrayList<java.lang.String> p0, java.util.ArrayList<java.lang.String> p1) {}
    public android.transition.Transition getEnterViewsTransition() { return null; }
    protected void viewsReady(android.util.ArrayMap<java.lang.String, android.view.View> p0) {}
    protected void onReceiveResult(int p0, android.os.Bundle p1) {}
    public boolean isWaitingForRemoteExit() { return false; }
    public java.util.ArrayList<java.lang.String> getPendingExitSharedElementNames() { return null; }
    public void forceViewsToAppear() {}
    public boolean isReturning() { return false; }
    protected void prepareEnter() {}
    protected android.transition.Transition getViewsTransition() { return null; }
    protected android.transition.Transition getSharedElementTransition() { return null; }
    public void runAfterTransitionsComplete(java.lang.Runnable p0) {}
    protected void onTransitionsComplete() {}
    public void stop() {}
    public boolean cancelEnter() { return false; }
    protected void clearState() {}
    protected void onRemoteExitTransitionComplete() {}
}
