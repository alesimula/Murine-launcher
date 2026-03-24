package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public class HostNamedActionOperation extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.operations.layout.ActionOperation, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    public static final int FLOAT_TYPE = 0;
    public static final int INT_TYPE = 1;
    public static final int STRING_TYPE = 2;
    public static final int FLOAT_ARRAY_TYPE = 3;
    public static final int NONE_TYPE = -1;
    int mTextId;
    int mType;
    int mValueId;
    public HostNamedActionOperation(int p0, int p1, int p2) { super(); }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public java.lang.String serializedName() { return null; }
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public void runAction(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4) {}
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
