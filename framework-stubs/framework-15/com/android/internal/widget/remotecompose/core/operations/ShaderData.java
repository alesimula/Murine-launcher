package com.android.internal.widget.remotecompose.core.operations;

public class ShaderData implements com.android.internal.widget.remotecompose.core.Operation, com.android.internal.widget.remotecompose.core.VariableSupport {
    int mShaderTextId;
    int mShaderID;
    java.util.HashMap<java.lang.String, float[]> mUniformRawFloatMap;
    java.util.HashMap<java.lang.String, float[]> mUniformFloatMap;
    java.util.HashMap<java.lang.String, int[]> mUniformIntMap;
    java.util.HashMap<java.lang.String, java.lang.Integer> mUniformBitmapMap;
    public static final int MAX_IMAGE_DIMENSION = 8000;
    public static final com.android.internal.widget.remotecompose.core.operations.ShaderData.Companion COMPANION = null;
    public ShaderData(int p0, int p1, java.util.HashMap<java.lang.String, float[]> p2, java.util.HashMap<java.lang.String, int[]> p3, java.util.HashMap<java.lang.String, java.lang.Integer> p4) {}
    public int getShaderTextId() { return 0; }
    public java.lang.String[] getUniformFloatNames() { return null; }
    public float[] getUniformFloats(java.lang.String p0) { return null; }
    public java.lang.String[] getUniformIntegerNames() { return null; }
    public int[] getUniformInts(java.lang.String p0) { return null; }
    public java.lang.String[] getUniformBitmapNames() { return null; }
    public int getUniformBitmapId(java.lang.String p0) { return 0; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }

    public static class Companion implements com.android.internal.widget.remotecompose.core.CompanionOperation {
        public java.lang.String name() { return null; }
        public int id() { return 0; }
        public void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, java.util.HashMap<java.lang.String, float[]> p3, java.util.HashMap<java.lang.String, int[]> p4, java.util.HashMap<java.lang.String, java.lang.Integer> p5) {}
        public void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    }
}
