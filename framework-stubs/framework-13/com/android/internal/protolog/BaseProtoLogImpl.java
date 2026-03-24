package com.android.internal.protolog;

public class BaseProtoLogImpl {
    protected static final java.util.TreeMap<java.lang.String, com.android.internal.protolog.common.IProtoLogGroup> LOG_GROUPS = null;
    public static java.lang.Runnable sCacheUpdater;
    static final java.lang.String PROTOLOG_VERSION = "1.0.0";
    protected final com.android.internal.protolog.ProtoLogViewerConfigReader mViewerConfig = null;
    protected static void addLogGroupEnum(com.android.internal.protolog.common.IProtoLogGroup[] p0) {}
    public void log(com.android.internal.protolog.BaseProtoLogImpl.LogLevel p0, com.android.internal.protolog.common.IProtoLogGroup p1, int p2, int p3, java.lang.String p4, java.lang.Object[] p5) {}
    public void passToLogcat(java.lang.String p0, com.android.internal.protolog.BaseProtoLogImpl.LogLevel p1, java.lang.String p2) {}
    public BaseProtoLogImpl(java.io.File p0, java.lang.String p1, int p2, com.android.internal.protolog.ProtoLogViewerConfigReader p3) {}
    public void startProtoLog(java.io.PrintWriter p0) {}
    public void stopProtoLog(java.io.PrintWriter p0, boolean p1) {}
    public boolean isProtoEnabled() { return false; }
    protected int setLogging(boolean p0, boolean p1, java.io.PrintWriter p2, java.lang.String... p3) { return 0; }
    public int onShellCommand(android.os.ShellCommand p0) { return 0; }
    public java.lang.String getStatus() { return null; }
    static void logAndPrintln(java.io.PrintWriter p0, java.lang.String p1) {}

    public static enum LogLevel {
        DEBUG,
        VERBOSE,
        INFO,
        WARN,
        ERROR,
        WTF;
    }
}
