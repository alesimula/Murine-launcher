package android.app;

class ActivityTransitionState {
    public ActivityTransitionState() {}
    public int addExitTransitionCoordinator(android.app.ExitTransitionCoordinator p0) { return 0; }
    public void readState(android.os.Bundle p0) {}
    public void saveState(android.os.Bundle p0) {}
    public void setEnterActivityOptions(android.app.Activity p0, android.app.ActivityOptions p1) {}
    public void enterReady(android.app.Activity p0) {}
    public void postponeEnterTransition() {}
    public void startPostponedEnterTransition() {}
    public void onStop(android.app.Activity p0) {}
    public void onResume(android.app.Activity p0) {}
    public void clear() {}
    public boolean startExitBackTransition(android.app.Activity p0) { return false; }
    public boolean isTransitionRunning() { return false; }
    public void startExitOutTransition(android.app.Activity p0, android.os.Bundle p1) {}
}
