package com.android.internal.widget.remotecompose.core.operations;

public class ComponentValue extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.SerializableToString, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    public static final int WIDTH = 0;
    public static final int HEIGHT = 1;
    public static int id() { return 0; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public int getType() { return 0; }
    public int getComponentId() { return 0; }
    public int getValueId() { return 0; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public ComponentValue(int p0, int p1, int p2) { super(); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
