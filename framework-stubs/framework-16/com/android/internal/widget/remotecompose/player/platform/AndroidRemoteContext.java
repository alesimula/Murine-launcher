package com.android.internal.widget.remotecompose.player.platform;

public class AndroidRemoteContext extends com.android.internal.widget.remotecompose.core.RemoteContext {
    java.util.HashMap<java.lang.String, com.android.internal.widget.remotecompose.player.platform.AndroidRemoteContext.VarName> mVarNameHashMap;
    public AndroidRemoteContext() { super(); }
    public void useCanvas(android.graphics.Canvas p0) {}
    public void loadPathData(int p0, float[] p1) {}
    public float[] getPathData(int p0) { return null; }
    public void loadVariableName(java.lang.String p0, int p1, int p2) {}
    public void setNamedStringOverride(java.lang.String p0, java.lang.String p1) {}
    public void clearNamedStringOverride(java.lang.String p0) {}
    public void setNamedIntegerOverride(java.lang.String p0, int p1) {}
    public void clearNamedIntegerOverride(java.lang.String p0) {}
    public void setNamedFloatOverride(java.lang.String p0, float p1) {}
    public void clearNamedFloatOverride(java.lang.String p0) {}
    public void setNamedLong(java.lang.String p0, long p1) {}
    public void setNamedDataOverride(java.lang.String p0, java.lang.Object p1) {}
    public void clearNamedDataOverride(java.lang.String p0) {}
    public void setNamedColorOverride(java.lang.String p0, int p1) {}
    public void addCollection(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.ArrayAccess p1) {}
    public void putDataMap(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.DataMap p1) {}
    public com.android.internal.widget.remotecompose.core.operations.utilities.DataMap getDataMap(int p0) { return null; }
    public void runAction(int p0, java.lang.String p1) {}
    public void runNamedAction(int p0, java.lang.Object p1) {}
    public void loadBitmap(int p0, short p1, short p2, int p3, int p4, byte[] p5) {}
    public void loadText(int p0, java.lang.String p1) {}
    public void overrideText(int p0, java.lang.String p1) {}
    public void overrideInt(int p0, int p1) {}
    public void overrideData(int p0, java.lang.Object p1) {}
    public void clearDataOverride(int p0) {}
    public void clearIntegerOverride(int p0) {}
    public void clearFloatOverride(int p0) {}
    public java.lang.String getText(int p0) { return null; }
    public void loadFloat(int p0, float p1) {}
    public void overrideFloat(int p0, float p1) {}
    public void loadInteger(int p0, int p1) {}
    public void overrideInteger(int p0, int p1) {}
    public void overrideText(int p0, int p1) {}
    public void loadColor(int p0, int p1) {}
    public void loadAnimatedFloat(int p0, com.android.internal.widget.remotecompose.core.operations.FloatExpression p1) {}
    public void loadShader(int p0, com.android.internal.widget.remotecompose.core.operations.ShaderData p1) {}
    public float getFloat(int p0) { return 0.0f; }
    public void putObject(int p0, java.lang.Object p1) {}
    public java.lang.Object getObject(int p0) { return null; }
    public int getInteger(int p0) { return 0; }
    public long getLong(int p0) { return 0L; }
    public int getColor(int p0) { return 0; }
    public void listensTo(int p0, com.android.internal.widget.remotecompose.core.VariableSupport p1) {}
    public int updateOps() { return 0; }
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.operations.ShaderData getShader(int p0) { return null; }
    public void addTouchListener(com.android.internal.widget.remotecompose.core.TouchListener p0) {}
    public void addClickArea(int p0, int p1, float p2, float p3, float p4, float p5, int p6) {}
    public void hapticEffect(int p0) {}

    static class VarName {
        java.lang.String mName;
        int mId;
        int mType;
        VarName(java.lang.String p0, int p1, int p2) {}
    }
}
