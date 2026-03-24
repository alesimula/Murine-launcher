package android.window;

public class BackTouchTracker {
    public BackTouchTracker() {}
    public void update(float p0, float p1, float p2, float p3) {}
    public void setTriggerBack(boolean p0) {}
    public boolean getTriggerBack() { return false; }
    public boolean shouldUpdateStartLocation() { return false; }
    public void setShouldUpdateStartLocation(boolean p0) {}
    public void setState(android.window.BackTouchTracker.TouchTrackerState p0) {}
    public boolean isInInitialState() { return false; }
    public boolean isActive() { return false; }
    public boolean isFinished() { return false; }
    public void setGestureStartLocation(float p0, float p1, int p2) {}
    public void updateStartLocation() {}
    public void reset() {}
    public android.window.BackMotionEvent createStartEvent(android.view.RemoteAnimationTarget p0) { return null; }
    public android.window.BackMotionEvent createProgressEvent() { return null; }
    public float getProgress(float p0) { return 0.0f; }
    public float getMaxDistance() { return 0.0f; }
    public float getLinearDistance() { return 0.0f; }
    public float getNonLinearFactor() { return 0.0f; }
    public android.window.BackMotionEvent createProgressEvent(float p0) { return null; }
    public void setProgressThresholds(float p0, float p1, float p2) {}
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}

    public static enum TouchTrackerState {
        INITIAL,
        ACTIVE,
        FINISHED;
    }
}
