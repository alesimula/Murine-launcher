package com.android.internal.widget.remotecompose.core;

public abstract class Operation {
    public Operation() {}
    public abstract void write(com.android.internal.widget.remotecompose.core.WireBuffer p0);
    public abstract void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0);
    @android.annotation.NonNull
    public abstract java.lang.String deepToString(java.lang.String p0);
    public void markDirty() {}
    public void markNotDirty() {}
    public boolean isDirty() { return false; }
}
