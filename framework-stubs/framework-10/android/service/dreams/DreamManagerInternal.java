package android.service.dreams;

public abstract class DreamManagerInternal {
    public DreamManagerInternal() {}
    public abstract void startDream(boolean p0);
    public abstract void stopDream(boolean p0);
    public abstract boolean isDreaming();
}
