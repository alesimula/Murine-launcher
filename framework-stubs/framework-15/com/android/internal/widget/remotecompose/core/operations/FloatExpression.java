package com.android.internal.widget.remotecompose.core.operations;

public class FloatExpression implements com.android.internal.widget.remotecompose.core.Operation, com.android.internal.widget.remotecompose.core.VariableSupport {
    public int mId;
    public float[] mSrcValue;
    public float[] mSrcAnimation;
    public com.android.internal.widget.remotecompose.core.operations.utilities.easing.FloatAnimation mFloatAnimation;
    public float[] mPreCalcValue;
    com.android.internal.widget.remotecompose.core.operations.utilities.AnimatedFloatExpression mExp;
    public static final com.android.internal.widget.remotecompose.core.operations.FloatExpression.Companion COMPANION = null;
    public static final int MAX_STRING_SIZE = 4000;
    public FloatExpression(int p0, float[] p1, float[] p2) {}
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public java.lang.String toString() { return null; }
    public java.lang.String deepToString(java.lang.String p0) { return null; }

    public static class Companion implements com.android.internal.widget.remotecompose.core.CompanionOperation {
        public java.lang.String name() { return null; }
        public int id() { return 0; }
        public void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float[] p2, float[] p3) {}
        public void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    }
}
