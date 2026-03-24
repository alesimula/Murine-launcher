package com.android.internal.protolog;

public class ProtoLogConfigurationServiceImpl extends com.android.internal.protolog.IProtoLogConfigurationService.Stub implements com.android.internal.protolog.ProtoLogConfigurationService, android.os.IBinder.DeathRecipient {
    public ProtoLogConfigurationServiceImpl() { super(); }
    public ProtoLogConfigurationServiceImpl(com.android.internal.protolog.ProtoLogDataSource p0) { super(); }
    public ProtoLogConfigurationServiceImpl(com.android.internal.protolog.ProtoLogConfigurationServiceImpl.ViewerConfigFileTracer p0) { super(); }
    public ProtoLogConfigurationServiceImpl(com.android.internal.protolog.ProtoLogDataSource p0, com.android.internal.protolog.ProtoLogConfigurationServiceImpl.ViewerConfigFileTracer p1) { super(); }
    public void registerClient(com.android.internal.protolog.IProtoLogClient p0, com.android.internal.protolog.IProtoLogConfigurationService.RegisterClientArgs p1) throws android.os.RemoteException {}
    public void registerGroups(com.android.internal.protolog.IProtoLogClient p0, com.android.internal.protolog.IProtoLogConfigurationService.RegisterGroupsArgs p1) throws android.os.RemoteException {}
    public void unregisterClient(com.android.internal.protolog.IProtoLogClient p0) {}
    public void onShellCommand(java.io.FileDescriptor p0, java.io.FileDescriptor p1, java.io.FileDescriptor p2, java.lang.String[] p3, android.os.ShellCallback p4, android.os.ResultReceiver p5) throws android.os.RemoteException {}
    @android.annotation.NonNull
    public java.lang.String[] getGroups() { return null; }
    public void enableProtoLogToLogcat(java.io.PrintWriter p0, java.lang.String... p1) {}
    public void disableProtoLogToLogcat(java.io.PrintWriter p0, java.lang.String... p1) {}
    public boolean isLoggingToLogcat(java.lang.String p0) { return false; }
    public void binderDied() {}
    public void binderDied(android.os.IBinder p0) {}

    private static final class ClientRecord {
        @android.annotation.NonNull
        public final com.android.internal.protolog.IProtoLogClient client = null;
        @android.annotation.Nullable
        public final java.lang.String configFile = null;
        @android.annotation.NonNull
        public final java.util.Set<java.lang.String> groups = null;
        public ClientRecord(com.android.internal.protolog.IProtoLogClient p0, java.lang.String p1) {}
    }

    @java.lang.FunctionalInterface
    public static interface ViewerConfigFileTracer {
        public void trace(com.android.internal.protolog.ProtoLogDataSource p0, java.lang.String p1);
    }
}
