package android.os;

public class ZygoteProcess {
    private static final int ZYGOTE_CONNECT_TIMEOUT_MS = 20000;
    private static final int ZYGOTE_CONNECT_RETRY_DELAY_MS = 50;
    private static final java.lang.String LOG_TAG = "ZygoteProcess";
    private static final java.lang.String USAP_POOL_ENABLED_DEFAULT = "false";
    private final android.net.LocalSocketAddress mZygoteSocketAddress = null;
    private final android.net.LocalSocketAddress mZygoteSecondarySocketAddress = null;
    private final android.net.LocalSocketAddress mUsapPoolSocketAddress = null;
    private final android.net.LocalSocketAddress mUsapPoolSecondarySocketAddress = null;
    private final java.lang.Object mLock = null;
    private java.util.List<java.lang.String> mApiBlacklistExemptions;
    private int mHiddenApiAccessLogSampleRate;
    private int mHiddenApiAccessStatslogSampleRate;
    private android.os.ZygoteProcess.ZygoteState primaryZygoteState;
    private android.os.ZygoteProcess.ZygoteState secondaryZygoteState;
    private boolean mUsapPoolEnabled;
    static final int ZYGOTE_RETRY_MILLIS = 500;
    private static final java.lang.String[] INVALID_USAP_FLAGS = null;
    private boolean mIsFirstPropCheck;
    private long mLastPropCheckTimestamp;
    public ZygoteProcess() {}
    public ZygoteProcess(android.net.LocalSocketAddress p0, android.net.LocalSocketAddress p1) {}
    public android.net.LocalSocketAddress getPrimarySocketAddress() { return null; }
    public final android.os.Process.ProcessStartResult start(java.lang.String p0, java.lang.String p1, int p2, int p3, int[] p4, int p5, int p6, int p7, java.lang.String p8, java.lang.String p9, java.lang.String p10, java.lang.String p11, java.lang.String p12, java.lang.String p13, boolean p14, java.lang.String[] p15) { return null; }
    private static java.util.List<java.lang.String> getAbiList(java.io.BufferedWriter p0, java.io.DataInputStream p1) throws java.io.IOException { return null; }
    private android.os.Process.ProcessStartResult zygoteSendArgsAndGetResult(android.os.ZygoteProcess.ZygoteState p0, boolean p1, java.util.ArrayList<java.lang.String> p2) throws android.os.ZygoteStartFailedEx { return null; }
    private android.os.Process.ProcessStartResult attemptZygoteSendArgsAndGetResult(android.os.ZygoteProcess.ZygoteState p0, java.lang.String p1) throws android.os.ZygoteStartFailedEx { return null; }
    private android.os.Process.ProcessStartResult attemptUsapSendArgsAndGetResult(android.os.ZygoteProcess.ZygoteState p0, java.lang.String p1) throws android.os.ZygoteStartFailedEx, java.io.IOException { return null; }
    private static boolean canAttemptUsap(java.util.ArrayList<java.lang.String> p0) { return false; }
    private android.os.Process.ProcessStartResult startViaZygote(java.lang.String p0, java.lang.String p1, int p2, int p3, int[] p4, int p5, int p6, int p7, java.lang.String p8, java.lang.String p9, java.lang.String p10, java.lang.String p11, java.lang.String p12, boolean p13, java.lang.String p14, boolean p15, java.lang.String[] p16) throws android.os.ZygoteStartFailedEx { return null; }
    private boolean fetchUsapPoolEnabledProp() { return false; }
    private boolean fetchUsapPoolEnabledPropWithMinInterval() { return false; }
    public void close() {}
    public void establishZygoteConnectionForAbi(java.lang.String p0) {}
    public int getZygotePid(java.lang.String p0) { return 0; }
    public boolean setApiBlacklistExemptions(java.util.List<java.lang.String> p0) { return false; }
    public void setHiddenApiAccessLogSampleRate(int p0) {}
    public void setHiddenApiAccessStatslogSampleRate(int p0) {}
    private boolean maybeSetApiBlacklistExemptions(android.os.ZygoteProcess.ZygoteState p0, boolean p1) { return false; }
    private void maybeSetHiddenApiAccessLogSampleRate(android.os.ZygoteProcess.ZygoteState p0) {}
    private void maybeSetHiddenApiAccessStatslogSampleRate(android.os.ZygoteProcess.ZygoteState p0) {}
    private void attemptConnectionToPrimaryZygote() throws java.io.IOException {}
    private void attemptConnectionToSecondaryZygote() throws java.io.IOException {}
    private android.os.ZygoteProcess.ZygoteState openZygoteSocketIfNeeded(java.lang.String p0) throws android.os.ZygoteStartFailedEx { return null; }
    public boolean preloadApp(android.content.pm.ApplicationInfo p0, java.lang.String p1) throws android.os.ZygoteStartFailedEx, java.io.IOException { return false; }
    public boolean preloadPackageForAbi(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.ZygoteStartFailedEx, java.io.IOException { return false; }
    public boolean preloadDefault(java.lang.String p0) throws android.os.ZygoteStartFailedEx, java.io.IOException { return false; }
    public static void waitForConnectionToZygote(java.lang.String p0) {}
    public static void waitForConnectionToZygote(android.net.LocalSocketAddress p0) {}
    private void informZygotesOfUsapPoolStatus() {}
    public android.os.ChildZygoteProcess startChildZygote(java.lang.String p0, java.lang.String p1, int p2, int p3, int[] p4, int p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9, int p10, int p11) { return null; }

    private static class ZygoteState implements java.lang.AutoCloseable {
        final android.net.LocalSocketAddress mZygoteSocketAddress = null;
        final android.net.LocalSocketAddress mUsapSocketAddress = null;
        private final android.net.LocalSocket mZygoteSessionSocket = null;
        final java.io.DataInputStream mZygoteInputStream = null;
        final java.io.BufferedWriter mZygoteOutputWriter = null;
        private final java.util.List<java.lang.String> mAbiList = null;
        private boolean mClosed;
        private ZygoteState(android.net.LocalSocketAddress p0, android.net.LocalSocketAddress p1, android.net.LocalSocket p2, java.io.DataInputStream p3, java.io.BufferedWriter p4, java.util.List<java.lang.String> p5) {}
        static android.os.ZygoteProcess.ZygoteState connect(android.net.LocalSocketAddress p0, android.net.LocalSocketAddress p1) throws java.io.IOException { return null; }
        android.net.LocalSocket getUsapSessionSocket() throws java.io.IOException { return null; }
        boolean matches(java.lang.String p0) { return false; }
        public void close() {}
        boolean isClosed() { return false; }
    }
}
