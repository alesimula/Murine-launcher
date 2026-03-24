package com.android.internal.widget.remotecompose.core.operations;

public class DataListFloat extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.operations.utilities.ArrayAccess, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    public final int mId = 0;
    public DataListFloat(int p0, float[] p1) { super(); }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float[] p2) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public float getFloatValue(int p0) { return 0.0f; }
    @android.annotation.NonNull
    public float[] getFloats() { return null; }
    public int getLength() { return 0; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void update(com.android.internal.widget.remotecompose.core.operations.DataListFloat p0) {}
}
