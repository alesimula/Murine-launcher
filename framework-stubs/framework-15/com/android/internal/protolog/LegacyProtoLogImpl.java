package com.android.internal.protolog;

public class LegacyProtoLogImpl implements com.android.internal.protolog.common.IProtoLog {
    static final java.lang.String PROTOLOG_VERSION = "2.0.0";
    public LegacyProtoLogImpl(java.lang.String p0, java.lang.String p1, java.util.TreeMap<java.lang.String, com.android.internal.protolog.common.IProtoLogGroup> p2, java.lang.Runnable p3) {}
    public LegacyProtoLogImpl(java.io.File p0, java.lang.String p1, int p2, com.android.internal.protolog.LegacyProtoLogViewerConfigReader p3, int p4, java.util.TreeMap<java.lang.String, com.android.internal.protolog.common.IProtoLogGroup> p5, java.lang.Runnable p6) {}
    public void log(com.android.internal.protolog.common.LogLevel p0, com.android.internal.protolog.common.IProtoLogGroup p1, long p2, int p3, java.lang.String p4, java.lang.Object[] p5) {}
    public void passToLogcat(java.lang.String p0, com.android.internal.protolog.common.LogLevel p1, java.lang.String p2) {}
    public void startProtoLog(java.io.PrintWriter p0) {}
    public void stopProtoLog(java.io.PrintWriter p0, boolean p1) {}
    public boolean isProtoEnabled() { return false; }
    public int onShellCommand(android.os.ShellCommand p0) { return 0; }
    public java.lang.String getStatus() { return null; }
    static void logAndPrintln(java.io.PrintWriter p0, java.lang.String p1) {}
    public int startLoggingToLogcat(java.lang.String[] p0, com.android.internal.protolog.common.ILogger p1) { return 0; }
    public int stopLoggingToLogcat(java.lang.String[] p0, com.android.internal.protolog.common.ILogger p1) { return 0; }
    public boolean isEnabled(com.android.internal.protolog.common.IProtoLogGroup p0, com.android.internal.protolog.common.LogLevel p1) { return false; }
}
