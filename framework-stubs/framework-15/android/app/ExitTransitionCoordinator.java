package android.app;

public class ExitTransitionCoordinator extends android.app.ActivityTransitionCoordinator {
    static long sMaxWaitMillis;
    public ExitTransitionCoordinator(android.app.ExitTransitionCoordinator.ExitTransitionCallbacks p0, android.view.Window p1, android.app.SharedElementCallback p2, java.util.ArrayList<java.lang.String> p3, java.util.ArrayList<java.lang.String> p4, java.util.ArrayList<android.view.View> p5, boolean p6) { super(null, null, null, false); }
    protected void onReceiveResult(int p0, android.os.Bundle p1) {}
    public void resetViews() {}
    public void startExit() {}
    public void startExit(android.app.Activity p0) {}
    public void stop(android.app.Activity p0) {}
    protected boolean isReadyToNotify() { return false; }
    protected void sharedElementTransitionComplete() {}
    protected void onTransitionsComplete() {}
    protected void notifyComplete() {}
    protected void clearState() {}
    protected boolean moveSharedElementWithParent() { return false; }
    protected android.transition.Transition getViewsTransition() { return null; }
    protected android.transition.Transition getSharedElementTransition() { return null; }

    public static class ActivityExitTransitionCallbacks implements android.app.ExitTransitionCoordinator.ExitTransitionCallbacks {
        @android.annotation.NonNull
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
