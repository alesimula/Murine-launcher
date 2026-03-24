package android.os;

public class AppZygote {
    private static final java.lang.String LOG_TAG = "AppZygote";
    private final int mZygoteUid = 0;
    private final int mZygoteUidGidMin = 0;
    private final int mZygoteUidGidMax = 0;
    private final java.lang.Object mLock = null;
    private android.os.ChildZygoteProcess mZygote;
    private final android.content.pm.ApplicationInfo mAppInfo = null;
    public AppZygote(android.content.pm.ApplicationInfo p0, int p1, int p2, int p3) {}
    public android.os.ChildZygoteProcess getProcess() { return null; }
    public void stopZygote() {}
    public android.content.pm.ApplicationInfo getAppInfo() { return null; }
    private void stopZygoteLocked() {}
    private void connectToZygoteIfNeededLocked() {}
}
