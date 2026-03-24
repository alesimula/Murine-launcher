package com.android.internal.protolog;

public class ProcessedPerfettoProtoLogImpl extends com.android.internal.protolog.PerfettoProtoLogImpl {
    public ProcessedPerfettoProtoLogImpl(com.android.internal.protolog.ProtoLogDataSource p0, java.lang.String p1, com.android.internal.protolog.ProtoLogCacheUpdater p2, com.android.internal.protolog.common.IProtoLogGroup[] p3) throws android.os.ServiceManager.ServiceNotFoundException { super((com.android.internal.protolog.ProtoLogDataSource)null, (com.android.internal.protolog.ProtoLogCacheUpdater)null, (com.android.internal.protolog.common.IProtoLogGroup[])null); }
    public ProcessedPerfettoProtoLogImpl(com.android.internal.protolog.ProtoLogDataSource p0, java.lang.String p1, com.android.internal.protolog.ViewerConfigInputStreamProvider p2, com.android.internal.protolog.ProtoLogCacheUpdater p3, com.android.internal.protolog.common.IProtoLogGroup[] p4) throws android.os.ServiceManager.ServiceNotFoundException { super((com.android.internal.protolog.ProtoLogDataSource)null, (com.android.internal.protolog.ProtoLogCacheUpdater)null, (com.android.internal.protolog.common.IProtoLogGroup[])null); }
    public ProcessedPerfettoProtoLogImpl(com.android.internal.protolog.ProtoLogDataSource p0, java.lang.String p1, com.android.internal.protolog.ViewerConfigInputStreamProvider p2, com.android.internal.protolog.ProtoLogViewerConfigReader p3, com.android.internal.protolog.ProtoLogCacheUpdater p4, com.android.internal.protolog.common.IProtoLogGroup[] p5, com.android.internal.protolog.IProtoLogConfigurationService p6) throws android.os.ServiceManager.ServiceNotFoundException { super((com.android.internal.protolog.ProtoLogDataSource)null, (com.android.internal.protolog.ProtoLogCacheUpdater)null, (com.android.internal.protolog.common.IProtoLogGroup[])null); }
    @android.annotation.NonNull
    protected com.android.internal.protolog.IProtoLogConfigurationService.RegisterClientArgs createConfigurationServiceRegisterClientArgs() { return null; }
    public int startLoggingToLogcat(java.lang.String[] p0, com.android.internal.protolog.common.ILogger p1) { return 0; }
    public int stopLoggingToLogcat(java.lang.String[] p0, com.android.internal.protolog.common.ILogger p1) { return 0; }
    @java.lang.Deprecated
    void dumpViewerConfig() {}
    @android.annotation.NonNull
    java.lang.String getLogcatMessageString(com.android.internal.protolog.PerfettoProtoLogImpl.Message p0) { return null; }
}
