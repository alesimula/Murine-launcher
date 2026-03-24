package com.android.internal.widget.remotecompose.core.operations.layout;

public interface ActionOperation extends com.android.internal.widget.remotecompose.core.serialize.Serializable {
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1);
    public void runAction(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4);
}
