package android.util;

public final class StatsLog extends android.util.StatsLogInternal {
    private static final java.lang.String TAG = "StatsLog";
    private static final boolean DEBUG = false;
    private static android.os.IStatsManager sService;
    private static java.lang.Object sLogLock;
    private StatsLog() { super(); }
    public static boolean logStart(int p0) { return false; }
    public static boolean logStop(int p0) { return false; }
    public static boolean logEvent(int p0) { return false; }
    public static boolean logBinaryPushStateChanged(java.lang.String p0, long p1, int p2, int p3, long[] p4) { return false; }
    public static boolean logWatchdogRollbackOccurred(int p0, java.lang.String p1, long p2) { return false; }
    private static android.os.IStatsManager getIStatsManagerLocked() throws android.os.RemoteException { return null; }
    @android.annotation.SystemApi
    public static native void writeRaw(byte[] p0, int p1);
    private static void enforceDumpCallingPermission(android.content.Context p0) {}
    private static void enforcesageStatsCallingPermission(android.content.Context p0) {}
}
