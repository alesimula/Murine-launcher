package android.app;

public interface AnrController {
    public long getAnrDelayMillis(java.lang.String p0, int p1);
    public void onAnrDelayStarted(java.lang.String p0, int p1);
    public boolean onAnrDelayCompleted(java.lang.String p0, int p1);
}
