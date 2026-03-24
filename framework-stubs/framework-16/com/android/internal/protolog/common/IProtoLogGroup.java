package com.android.internal.protolog.common;

public interface IProtoLogGroup {
    public boolean isEnabled();
    public boolean isLogToProto();
    public boolean isLogToLogcat();
    default public boolean isLogToAny() { return false; }
    public java.lang.String getTag();
    public void setLogToProto(boolean p0);
    public void setLogToLogcat(boolean p0);
    public java.lang.String name();
    public int getId();
}
