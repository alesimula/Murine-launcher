package com.android.internal.widget.remotecompose.core;

public interface OperationInterface {
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0);
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0);
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0);
    public boolean isDirty();
    public void markNotDirty();
}
