package com.android.internal.widget.remotecompose.core;

public class RemoteComposeState implements com.android.internal.widget.remotecompose.core.operations.utilities.CollectionsAccess {
    public static final int START_ID = 42;
    @android.annotation.NonNull
    com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<java.util.ArrayList<com.android.internal.widget.remotecompose.core.VariableSupport>> mVarListeners;
    @android.annotation.NonNull
    java.util.ArrayList<com.android.internal.widget.remotecompose.core.VariableSupport> mAllVarListeners;
    public RemoteComposeState() {}
    @android.annotation.Nullable
    public java.lang.Object getFromId(int p0) { return null; }
    public boolean containsId(int p0) { return false; }
    public int dataGetId(java.lang.Object p0) { return 0; }
    public int cacheData(java.lang.Object p0) { return 0; }
    public int cacheData(java.lang.Object p0, int p1) { return 0; }
    public void cacheData(int p0, java.lang.Object p1) {}
    public void updateData(int p0, java.lang.Object p1) {}
    public java.lang.Object getPath(int p0) { return null; }
    public void putPath(int p0, java.lang.Object p1) {}
    public void putPathData(int p0, float[] p1) {}
    public float[] getPathData(int p0) { return null; }
    public void overrideData(int p0, java.lang.Object p1) {}
    public int cacheFloat(float p0) { return 0; }
    public void cacheFloat(int p0, float p1) {}
    public void updateFloat(int p0, float p1) {}
    public void overrideFloat(int p0, float p1) {}
    public int cacheInteger(int p0) { return 0; }
    public void updateInteger(int p0, int p1) {}
    public void overrideInteger(int p0, int p1) {}
    public float getFloat(int p0) { return 0.0f; }
    public int getInteger(int p0) { return 0; }
    public int getColor(int p0) { return 0; }
    public void updateColor(int p0, int p1) {}
    public void overrideColor(int p0, int p1) {}
    public void clearColorOverride() {}
    public void clearDataOverride(int p0) {}
    public void clearIntegerOverride(int p0) {}
    public void clearFloatOverride(int p0) {}
    public boolean wasNotWritten(int p0) { return false; }
    public void markWritten(int p0) {}
    public void reset() {}
    public int nextId() { return 0; }
    public int nextId(int p0) { return 0; }
    public void setNextId(int p0) {}
    public void listenToVar(int p0, com.android.internal.widget.remotecompose.core.VariableSupport p1) {}
    public boolean hasListener(int p0) { return false; }
    public int getOpsToUpdate(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0; }
    public void setWindowWidth(float p0) {}
    public void setWindowHeight(float p0) {}
    public void addCollection(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.ArrayAccess p1) {}
    public float getFloatValue(int p0, int p1) { return 0.0f; }
    @android.annotation.Nullable
    public float[] getFloats(int p0) { return null; }
    public int getId(int p0, int p1) { return 0; }
    public void putDataMap(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.DataMap p1) {}
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.operations.utilities.DataMap getDataMap(int p0) { return null; }
    public int getListLength(int p0) { return 0; }
    public void setContext(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void updateObject(int p0, java.lang.Object p1) {}
    @android.annotation.Nullable
    public java.lang.Object getObject(int p0) { return null; }
}
