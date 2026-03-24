package com.android.internal.widget.remotecompose.core;

public abstract class PaintOperation extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.serialize.Serializable {
    public PaintOperation() { super(); }
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public abstract void paint(com.android.internal.widget.remotecompose.core.PaintContext p0);
    public boolean suitableForTransition(com.android.internal.widget.remotecompose.core.Operation p0) { return false; }
}
