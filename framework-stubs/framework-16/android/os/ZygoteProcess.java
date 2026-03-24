package android.os;

public class ZygoteProcess {
    public static volatile int sAppZygotePreloadTimeoutMs;
    static final int ZYGOTE_RETRY_MILLIS = 500;
    public ZygoteProcess() {}
    public ZygoteProcess(android.net.LocalSocketAddress p0, android.net.LocalSocketAddress p1) {}
    public android.net.LocalSocketAddress getPrimarySocketAddress() { return null; }
    public final android.os.Process.ProcessStartResult start(java.lang.String p0, java.lang.String p1, int p2, int p3, int[] p4, int p5, int p6, int p7, java.lang.String p8, java.lang.String p9, java.lang.String p10, java.lang.String p11, java.lang.String p12, java.lang.String p13, int p14, boolean p15, long[] p16, java.util.Map<java.lang.String, android.util.Pair<java.lang.String, java.lang.Long>> p17, java.util.Map<java.lang.String, android.util.Pair<java.lang.String, java.lang.Long>> p18, boolean p19, boolean p20, boolean p21, java.lang.String[] p22) { return null; }
    public void close() {}
    public void establishZygoteConnectionForAbi(java.lang.String p0) {}
    public int getZygotePid(java.lang.String p0) { return 0; }
    public void bootCompleted() {}
    public boolean setApiDenylistExemptions(java.util.List<java.lang.String> p0) { return false; }
    public void setHiddenApiAccessLogSampleRate(int p0) {}
    public void setHiddenApiAccessStatslogSampleRate(int p0) {}
    public static void setAppZygotePreloadTimeout(int p0) {}
    public boolean preloadApp(android.content.pm.ApplicationInfo p0, java.lang.String p1) throws android.os.ZygoteStartFailedEx, java.io.IOException { return false; }
    public boolean preloadDefault(java.lang.String p0) throws android.os.ZygoteStartFailedEx, java.io.IOException { return false; }
    public static void waitForConnectionToZygote(java.lang.String p0) {}
    public static void waitForConnectionToZygote(android.net.LocalSocketAddress p0) {}
    public android.os.ChildZygoteProcess startChildZygote(java.lang.String p0, java.lang.String p1, int p2, int p3, int[] p4, int p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9, int p10, int p11) { return null; }

    private static class ZygoteState implements java.lang.AutoCloseable {
        final android.net.LocalSocketAddress mZygoteSocketAddress = null;
        final android.net.LocalSocketAddress mUsapSocketAddress = null;
        final java.io.DataInputStream mZygoteInputStream = null;
        final java.io.BufferedWriter mZygoteOutputWriter = null;
        static android.os.ZygoteProcess.ZygoteState connect(android.net.LocalSocketAddress p0, android.net.LocalSocketAddress p1) throws java.io.IOException { return null; }
        android.net.LocalSocket getUsapSessionSocket() throws java.io.IOException { return null; }
        boolean matches(java.lang.String p0) { return false; }
        public void close() {}
        boolean isClosed() { return false; }
    }
}
