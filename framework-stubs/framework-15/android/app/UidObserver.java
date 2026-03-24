package android.app;

public class UidObserver extends android.app.IUidObserver.Stub {
    public UidObserver() { super(); }
    public void onUidActive(int p0) {}
    public void onUidCachedChanged(int p0, boolean p1) {}
    public void onUidGone(int p0, boolean p1) {}
    public void onUidIdle(int p0, boolean p1) {}
    public void onUidProcAdjChanged(int p0, int p1) {}
    public void onUidStateChanged(int p0, int p1, long p2, int p3) {}
}
