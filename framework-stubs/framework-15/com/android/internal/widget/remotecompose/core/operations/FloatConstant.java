package com.android.internal.widget.remotecompose.core.operations;

public class FloatConstant implements com.android.internal.widget.remotecompose.core.Operation {
    public int mTextId;
    public float mValue;
    public static final com.android.internal.widget.remotecompose.core.operations.FloatConstant.Companion COMPANION = null;
    public static final int MAX_STRING_SIZE = 4000;
    public FloatConstant(int p0, float p1) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public java.lang.String toString() { return null; }
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }

    public static class Companion implements com.android.internal.widget.remotecompose.core.CompanionOperation {
        public java.lang.String name() { return null; }
        public int id() { return 0; }
        public void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2) {}
        public void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    }
}
