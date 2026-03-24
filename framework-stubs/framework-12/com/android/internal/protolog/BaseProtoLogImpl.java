package com.android.internal.protolog;

public class BaseProtoLogImpl {
    protected static final java.util.TreeMap<java.lang.String, com.android.internal.protolog.common.IProtoLogGroup> LOG_GROUPS = null;
    public static java.lang.Runnable sCacheUpdater;
    private static final java.lang.String TAG = "ProtoLog";
    private static final long MAGIC_NUMBER_VALUE = 5138409603453637200L;
    static final java.lang.String PROTOLOG_VERSION = "1.0.0";
    private final java.io.File mLogFile = null;
    private final java.lang.String mViewerConfigFilename = null;
    private final com.android.internal.util.TraceBuffer mBuffer = null;
    protected final com.android.internal.protolog.ProtoLogViewerConfigReader mViewerConfig = null;
    private boolean mProtoLogEnabled;
    private boolean mProtoLogEnabledLockFree;
    private final java.lang.Object mProtoLogEnabledLock = null;
    protected static void addLogGroupEnum(com.android.internal.protolog.common.IProtoLogGroup[] p0) {}
    public void log(com.android.internal.protolog.BaseProtoLogImpl.LogLevel p0, com.android.internal.protolog.common.IProtoLogGroup p1, int p2, int p3, java.lang.String p4, java.lang.Object[] p5) {}
    private void logToLogcat(java.lang.String p0, com.android.internal.protolog.BaseProtoLogImpl.LogLevel p1, int p2, java.lang.String p3, java.lang.Object[] p4) {}
    public void passToLogcat(java.lang.String p0, com.android.internal.protolog.BaseProtoLogImpl.LogLevel p1, java.lang.String p2) {}
    private void logToProto(int p0, int p1, java.lang.Object[] p2) {}
    public BaseProtoLogImpl(java.io.File p0, java.lang.String p1, int p2, com.android.internal.protolog.ProtoLogViewerConfigReader p3) {}
    public void startProtoLog(java.io.PrintWriter p0) {}
    public void stopProtoLog(java.io.PrintWriter p0, boolean p1) {}
    public boolean isProtoEnabled() { return false; }
    protected int setLogging(boolean p0, boolean p1, java.io.PrintWriter p2, java.lang.String... p3) { return 0; }
    private int unknownCommand(java.io.PrintWriter p0) { return 0; }
    public int onShellCommand(android.os.ShellCommand p0) { return 0; }
    public java.lang.String getStatus() { return null; }
    private void writeProtoLogToFileLocked() {}
    static void logAndPrintln(java.io.PrintWriter p0, java.lang.String p1) {}

    public static enum LogLevel {
        DEBUG,
        VERBOSE,
        INFO,
        WARN,
        ERROR,
        WTF;
        private LogLevel() {}
    }
}
