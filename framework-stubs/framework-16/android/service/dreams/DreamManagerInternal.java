package android.service.dreams;

public abstract class DreamManagerInternal {
    public DreamManagerInternal() {}
    public abstract void startDream(boolean p0, java.lang.String p1);
    public abstract void stopDream(boolean p0, java.lang.String p1);
    public abstract boolean isDreaming();
    public abstract void requestDream();
    public abstract boolean canStartDreaming(boolean p0);
    public abstract boolean dreamConditionActive();
    public abstract void registerDreamManagerStateListener(android.service.dreams.DreamManagerInternal.DreamManagerStateListener p0);
    public abstract void unregisterDreamManagerStateListener(android.service.dreams.DreamManagerInternal.DreamManagerStateListener p0);

    public static interface DreamManagerStateListener {
        default public void onKeepDreamingWhenUnpluggingChanged(boolean p0) {}
        default public void onDreamingStarted() {}
        default public void onDreamingStopped() {}
    }
}
