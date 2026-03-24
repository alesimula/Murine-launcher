package com.android.internal.widget.remotecompose.core;

public interface TouchListener {
    public void touchDown(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2);
    public void touchUp(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2, float p3, float p4);
    public void touchDrag(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2);
    public void setComponent(com.android.internal.widget.remotecompose.core.operations.layout.Component p0);
}
