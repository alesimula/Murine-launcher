package com.android.internal.protolog;

public class ProtoLogController {
    @android.annotation.Nullable
    com.android.internal.protolog.common.IProtoLog mProtoLogInstance;
    public ProtoLogController() {}
    public void registerLogGroupInProcess(com.android.internal.protolog.common.IProtoLogGroup... p0) {}
    public void init(com.android.internal.protolog.common.IProtoLogGroup... p0) {}
    @android.annotation.Nullable
    public com.android.internal.protolog.common.IProtoLog getProtoLogInstance() { return null; }
    public void tearDown() {}
    @android.annotation.NonNull
    public java.util.Set<com.android.internal.protolog.common.IProtoLogGroup> getRegisteredGroups() { return null; }
    protected boolean shouldLogOnlyToLogcat() { return false; }
    @android.annotation.NonNull
    protected com.android.internal.protolog.common.IProtoLog createLogcatOnlyInstance() { return null; }
    @android.annotation.NonNull
    protected com.android.internal.protolog.PerfettoProtoLogImpl createAndEnableNewPerfettoProtoLogImpl(com.android.internal.protolog.ProtoLogDataSource p0, com.android.internal.protolog.common.IProtoLogGroup[] p1) { return null; }
}
