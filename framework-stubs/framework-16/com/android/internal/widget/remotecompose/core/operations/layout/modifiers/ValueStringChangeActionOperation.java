package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public class ValueStringChangeActionOperation extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.operations.layout.ActionOperation {
    int mTargetValueId;
    int mValueId;
    public ValueStringChangeActionOperation(int p0, int p1) { super(); }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public int getActionId() { return 0; }
    @android.annotation.NonNull
    public java.lang.String serializedName() { return null; }
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public void runAction(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4) {}
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
