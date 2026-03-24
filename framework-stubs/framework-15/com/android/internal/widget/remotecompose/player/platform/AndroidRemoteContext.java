package com.android.internal.widget.remotecompose.player.platform;

class AndroidRemoteContext extends com.android.internal.widget.remotecompose.core.RemoteContext {
    java.util.HashMap<java.lang.String, com.android.internal.widget.remotecompose.player.platform.AndroidRemoteContext.VarName> mVarNameHashMap;
    AndroidRemoteContext() { super(); }
    public void useCanvas(android.graphics.Canvas p0) {}
    public void loadPathData(int p0, float[] p1) {}
    public void loadVariableName(java.lang.String p0, int p1, int p2) {}
    public void loadBitmap(int p0, int p1, int p2, byte[] p3) {}
    public void loadText(int p0, java.lang.String p1) {}
    public java.lang.String getText(int p0) { return null; }
    public void loadFloat(int p0, float p1) {}
    public void loadColor(int p0, int p1) {}
    public void loadAnimatedFloat(int p0, com.android.internal.widget.remotecompose.core.operations.FloatExpression p1) {}
    public void loadShader(int p0, com.android.internal.widget.remotecompose.core.operations.ShaderData p1) {}
    public float getFloat(int p0) { return 0.0f; }
    public int getColor(int p0) { return 0; }
    public void listensTo(int p0, com.android.internal.widget.remotecompose.core.VariableSupport p1) {}
    public int updateOps() { return 0; }
    public com.android.internal.widget.remotecompose.core.operations.ShaderData getShader(int p0) { return null; }
    public void addClickArea(int p0, int p1, float p2, float p3, float p4, float p5, int p6) {}

    static class VarName {
        java.lang.String mName;
        int mId;
        int mType;
        VarName(java.lang.String p0, int p1, int p2) {}
    }
}
