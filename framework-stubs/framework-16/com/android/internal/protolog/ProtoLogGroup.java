package com.android.internal.protolog;

public class ProtoLogGroup implements com.android.internal.protolog.common.IProtoLogGroup {
    public ProtoLogGroup(java.lang.String p0) {}
    public ProtoLogGroup(java.lang.String p0, java.lang.String p1) {}
    public ProtoLogGroup(java.lang.String p0, java.lang.String p1, boolean p2) {}
    public boolean isEnabled() { return false; }
    @java.lang.Deprecated
    public boolean isLogToProto() { return false; }
    public boolean isLogToLogcat() { return false; }
    @android.annotation.NonNull
    public java.lang.String getTag() { return null; }
    @java.lang.Deprecated
    public void setLogToProto(boolean p0) {}
    public void setLogToLogcat(boolean p0) {}
    @android.annotation.NonNull
    public java.lang.String name() { return null; }
    public int getId() { return 0; }
}
