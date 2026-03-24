package com.android.internal.os;

class ZygoteConnection {
    private static final java.lang.String TAG = "Zygote";
    @android.annotation.UnsupportedAppUsage
    private final android.net.LocalSocket mSocket = null;
    @android.annotation.UnsupportedAppUsage
    private final java.io.DataOutputStream mSocketOutStream = null;
    private final java.io.BufferedReader mSocketReader = null;
    @android.annotation.UnsupportedAppUsage
    private final android.net.Credentials peer = null;
    private final java.lang.String abiList = null;
    private boolean isEof;
    ZygoteConnection(android.net.LocalSocket p0, java.lang.String p1) throws java.io.IOException {}
    java.io.FileDescriptor getFileDescriptor() { return null; }
    java.lang.Runnable processOneCommand(com.android.internal.os.ZygoteServer p0) { return null; }
    private void handleAbiListQuery() {}
    private void handlePidQuery() {}
    private void handlePreload() {}
    private java.lang.Runnable stateChangeWithUsapPoolReset(com.android.internal.os.ZygoteServer p0, java.lang.Runnable p1) { return null; }
    private java.lang.Runnable handleApiBlacklistExemptions(com.android.internal.os.ZygoteServer p0, java.lang.String[] p1) { return null; }
    private java.lang.Runnable handleUsapPoolStatusChange(com.android.internal.os.ZygoteServer p0, boolean p1) { return null; }
    private java.lang.Runnable handleHiddenApiAccessLogSampleRate(com.android.internal.os.ZygoteServer p0, int p1, int p2) { return null; }
    protected void preload() {}
    protected boolean isPreloadComplete() { return false; }
    protected java.io.DataOutputStream getSocketOutputStream() { return null; }
    protected void handlePreloadPackage(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    protected boolean canPreloadApp() { return false; }
    protected void handlePreloadApp(android.content.pm.ApplicationInfo p0) {}
    @android.annotation.UnsupportedAppUsage
    void closeSocket() {}
    boolean isClosedByPeer() { return false; }
    private java.lang.Runnable handleChildProc(com.android.internal.os.ZygoteArguments p0, java.io.FileDescriptor[] p1, java.io.FileDescriptor p2, boolean p3) { return null; }
    private void handleParentProc(int p0, java.io.FileDescriptor[] p1, java.io.FileDescriptor p2) {}
    private void setChildPgid(int p0) {}

    private static class HiddenApiUsageLogger {
        private final com.android.internal.logging.MetricsLogger mMetricsLogger = null;
        private static com.android.internal.os.ZygoteConnection.HiddenApiUsageLogger sInstance;
        private int mHiddenApiAccessLogSampleRate;
        private int mHiddenApiAccessStatslogSampleRate;
        private HiddenApiUsageLogger() {}
        public static void setHiddenApiAccessLogSampleRates(int p0, int p1) {}
        public static com.android.internal.os.ZygoteConnection.HiddenApiUsageLogger getInstance() { return null; }
        public void hiddenApiUsed(int p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4) {}
        private void logUsage(java.lang.String p0, java.lang.String p1, int p2, boolean p3) {}
        private void newLogUsage(java.lang.String p0, int p1, boolean p2) {}
    }
}
