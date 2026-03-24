package com.android.internal.widget.remotecompose.core;

public class RemoteComposeState {
    public static final int START_ID = 42;
    com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<java.util.ArrayList<com.android.internal.widget.remotecompose.core.VariableSupport>> mVarListeners;
    java.util.ArrayList<com.android.internal.widget.remotecompose.core.VariableSupport> mAllVarListeners;
    public RemoteComposeState() {}
    public java.lang.Object getFromId(int p0) { return null; }
    public boolean containsId(int p0) { return false; }
    public int dataGetId(java.lang.Object p0) { return 0; }
    public int cache(java.lang.Object p0) { return 0; }
    public void cache(int p0, java.lang.Object p1) {}
    public void update(int p0, java.lang.Object p1) {}
    public int cacheFloat(float p0) { return 0; }
    public void cacheFloat(int p0, float p1) {}
    public void updateFloat(int p0, float p1) {}
    public float getFloat(int p0) { return 0.0f; }
    public int getColor(int p0) { return 0; }
    public void updateColor(int p0, int p1) {}
    public boolean wasNotWritten(int p0) { return false; }
    public void markWritten(int p0) {}
    void reset() {}
    public int nextId() { return 0; }
    public void setNextId(int p0) {}
    public void listenToVar(int p0, com.android.internal.widget.remotecompose.core.VariableSupport p1) {}
    public int getOpsToUpdate(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0; }
    public void setWindowWidth(float p0) {}
    public void setWindowHeight(float p0) {}
}
