package com.android.internal.protolog;

public abstract class PerfettoProtoLogImpl extends com.android.internal.protolog.IProtoLogClient.Stub implements com.android.internal.protolog.common.IProtoLog, com.android.internal.protolog.ProtoLogDataSource.Instance.TracingInstanceStartCallback, com.android.internal.protolog.ProtoLogDataSource.Instance.TracingInstanceStopCallback, com.android.internal.protolog.ProtoLogDataSource.Instance.TracingFlushCallback {
    public static final java.lang.String NULL_STRING = "null";
    @android.annotation.NonNull
    protected final com.android.internal.protolog.ProtoLogDataSource mDataSource = null;
    @android.annotation.Nullable
    protected final com.android.internal.protolog.IProtoLogConfigurationService mConfigurationService = null;
    @android.annotation.NonNull
    protected final java.util.TreeMap<java.lang.String, com.android.internal.protolog.common.IProtoLogGroup> mLogGroups = null;
    @android.annotation.NonNull
    public final android.os.Handler mBackgroundHandler = null;
    protected PerfettoProtoLogImpl(com.android.internal.protolog.ProtoLogDataSource p0, com.android.internal.protolog.ProtoLogCacheUpdater p1, com.android.internal.protolog.common.IProtoLogGroup[] p2) { super(); }
    protected PerfettoProtoLogImpl(com.android.internal.protolog.ProtoLogDataSource p0, com.android.internal.protolog.ProtoLogCacheUpdater p1, com.android.internal.protolog.common.IProtoLogGroup[] p2, com.android.internal.protolog.IProtoLogConfigurationService p3) { super(); }
    public void enable() {}
    public void registerGroups(com.android.internal.protolog.common.IProtoLogGroup... p0) {}
    public void disable() {}
    @android.annotation.NonNull
    protected abstract com.android.internal.protolog.IProtoLogConfigurationService.RegisterClientArgs createConfigurationServiceRegisterClientArgs();
    public void log(com.android.internal.protolog.common.LogLevel p0, com.android.internal.protolog.common.IProtoLogGroup p1, long p2, int p3, java.lang.Object[] p4) {}
    public void log(com.android.internal.protolog.common.LogLevel p0, com.android.internal.protolog.common.IProtoLogGroup p1, java.lang.String p2, java.lang.Object... p3) {}
    public void passToLogcat(java.lang.String p0, com.android.internal.protolog.common.LogLevel p1, java.lang.String p2) {}
    public boolean isProtoEnabled() { return false; }
    public void toggleLogcat(boolean p0, java.lang.String[] p1) {}
    public int startLoggingToLogcat(java.lang.String[] p0, com.android.internal.protolog.common.ILogger p1) { return 0; }
    public int stopLoggingToLogcat(java.lang.String[] p0, com.android.internal.protolog.common.ILogger p1) { return 0; }
    public boolean isEnabled(com.android.internal.protolog.common.IProtoLogGroup p0, com.android.internal.protolog.common.LogLevel p1) { return false; }
    @android.annotation.NonNull
    public java.util.List<com.android.internal.protolog.common.IProtoLogGroup> getRegisteredGroups() { return null; }
    protected void readyToLogToLogcat() {}
    @java.lang.Deprecated
    public int onShellCommand(android.os.ShellCommand p0) { return 0; }
    public void onTracingFlush() {}
    @java.lang.Deprecated
    abstract void dumpViewerConfig();
    @android.annotation.NonNull
    abstract java.lang.String getLogcatMessageString(com.android.internal.protolog.PerfettoProtoLogImpl.Message p0);
    protected boolean validateGroups(com.android.internal.protolog.common.ILogger p0, java.lang.String[] p1) { return false; }
    public void onTracingInstanceStart(int p0, com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig p1) {}
    public synchronized void onTracingInstanceStop(int p0, com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig p1) {}
    public static void waitForInitialization() {}

    protected static class Message {
        @android.annotation.Nullable
        protected java.lang.Long getMessageHash() { return null; }
        @android.annotation.Nullable
        protected java.lang.String getMessage() { return null; }
        @android.annotation.Nullable
        protected java.lang.String getMessage(com.android.internal.protolog.ProtoLogViewerConfigReader p0) { return null; }
    }
}
