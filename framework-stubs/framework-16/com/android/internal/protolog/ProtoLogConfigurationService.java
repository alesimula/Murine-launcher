package com.android.internal.protolog;

public interface ProtoLogConfigurationService extends com.android.internal.protolog.IProtoLogConfigurationService {
    @android.annotation.NonNull
    public java.lang.String[] getGroups();
    public boolean isLoggingToLogcat(java.lang.String p0);
    public void enableProtoLogToLogcat(java.io.PrintWriter p0, java.lang.String... p1);
    public void disableProtoLogToLogcat(java.io.PrintWriter p0, java.lang.String... p1);
}
