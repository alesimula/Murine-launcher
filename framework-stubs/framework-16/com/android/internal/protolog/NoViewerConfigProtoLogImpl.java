package com.android.internal.protolog;

@java.lang.Deprecated
public class NoViewerConfigProtoLogImpl implements com.android.internal.protolog.common.IProtoLog {
    public NoViewerConfigProtoLogImpl() {}
    public void log(com.android.internal.protolog.common.LogLevel p0, com.android.internal.protolog.common.IProtoLogGroup p1, long p2, int p3, java.lang.Object[] p4) {}
    public void log(com.android.internal.protolog.common.LogLevel p0, com.android.internal.protolog.common.IProtoLogGroup p1, java.lang.String p2, java.lang.Object... p3) {}
    public boolean isProtoEnabled() { return false; }
    public int startLoggingToLogcat(java.lang.String[] p0, com.android.internal.protolog.common.ILogger p1) { return 0; }
    public int stopLoggingToLogcat(java.lang.String[] p0, com.android.internal.protolog.common.ILogger p1) { return 0; }
    public boolean isEnabled(com.android.internal.protolog.common.IProtoLogGroup p0, com.android.internal.protolog.common.LogLevel p1) { return false; }
    @android.annotation.NonNull
    public java.util.List<com.android.internal.protolog.common.IProtoLogGroup> getRegisteredGroups() { return null; }
    public void registerGroups(com.android.internal.protolog.common.IProtoLogGroup... p0) {}
}
