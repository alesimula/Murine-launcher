package com.android.internal.widget.remotecompose.core.operations;

public class ShaderData extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    int mShaderTextId;
    int mShaderID;
    @android.annotation.Nullable
    java.util.HashMap<java.lang.String, float[]> mUniformRawFloatMap;
    @android.annotation.Nullable
    java.util.HashMap<java.lang.String, float[]> mUniformFloatMap;
    @android.annotation.Nullable
    java.util.HashMap<java.lang.String, int[]> mUniformIntMap;
    @android.annotation.Nullable
    java.util.HashMap<java.lang.String, java.lang.Integer> mUniformBitmapMap;
    public ShaderData(int p0, int p1, java.util.HashMap<java.lang.String, float[]> p2, java.util.HashMap<java.lang.String, int[]> p3, java.util.HashMap<java.lang.String, java.lang.Integer> p4) { super(); }
    public int getShaderTextId() { return 0; }
    @android.annotation.NonNull
    public java.lang.String[] getUniformFloatNames() { return null; }
    @android.annotation.NonNull
    public float[] getUniformFloats(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getUniformIntegerNames() { return null; }
    @android.annotation.NonNull
    public int[] getUniformInts(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getUniformBitmapNames() { return null; }
    public int getUniformBitmapId(java.lang.String p0) { return 0; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, java.util.HashMap<java.lang.String, float[]> p3, java.util.HashMap<java.lang.String, int[]> p4, java.util.HashMap<java.lang.String, java.lang.Integer> p5) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void enable(boolean p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
