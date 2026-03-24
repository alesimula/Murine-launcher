package com.android.internal.protolog;

public class PerfettoProtoLogImpl implements com.android.internal.protolog.common.IProtoLog {
    public PerfettoProtoLogImpl(java.lang.String p0, java.util.TreeMap<java.lang.String, com.android.internal.protolog.common.IProtoLogGroup> p1, java.lang.Runnable p2) {}
    public PerfettoProtoLogImpl(com.android.internal.protolog.ViewerConfigInputStreamProvider p0, java.util.TreeMap<java.lang.String, com.android.internal.protolog.common.IProtoLogGroup> p1, java.lang.Runnable p2) {}
    public PerfettoProtoLogImpl(com.android.internal.protolog.ViewerConfigInputStreamProvider p0, com.android.internal.protolog.ProtoLogViewerConfigReader p1, java.util.TreeMap<java.lang.String, com.android.internal.protolog.common.IProtoLogGroup> p2, java.lang.Runnable p3) {}
    public void log(com.android.internal.protolog.common.LogLevel p0, com.android.internal.protolog.common.IProtoLogGroup p1, long p2, int p3, java.lang.String p4, java.lang.Object[] p5) {}
    public void passToLogcat(java.lang.String p0, com.android.internal.protolog.common.LogLevel p1, java.lang.String p2) {}
    public boolean isProtoEnabled() { return false; }
    public int startLoggingToLogcat(java.lang.String[] p0, com.android.internal.protolog.common.ILogger p1) { return 0; }
    public int stopLoggingToLogcat(java.lang.String[] p0, com.android.internal.protolog.common.ILogger p1) { return 0; }
    public boolean isEnabled(com.android.internal.protolog.common.IProtoLogGroup p0, com.android.internal.protolog.common.LogLevel p1) { return false; }
    public int startLoggingStackTrace(java.lang.String[] p0, com.android.internal.protolog.common.ILogger p1) { return 0; }
    public int stopLoggingStackTrace() { return 0; }
    public int onShellCommand(android.os.ShellCommand p0) { return 0; }
    static void logAndPrintln(java.io.PrintWriter p0, java.lang.String p1) {}
}
