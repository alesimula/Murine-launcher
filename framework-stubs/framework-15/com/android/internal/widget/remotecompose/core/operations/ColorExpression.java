package com.android.internal.widget.remotecompose.core.operations;

public class ColorExpression implements com.android.internal.widget.remotecompose.core.Operation, com.android.internal.widget.remotecompose.core.VariableSupport {
    public int mId;
    int mMode;
    public int mColor1;
    public int mColor2;
    public float mTween;
    public float mHue;
    public float mSat;
    public float mValue;
    public float mOutHue;
    public float mOutSat;
    public float mOutValue;
    public int mAlpha;
    public float mOutTween;
    public int mOutColor1;
    public int mOutColor2;
    public static final com.android.internal.widget.remotecompose.core.operations.ColorExpression.Companion COMPANION = null;
    public static final int HSV_MODE = 4;
    public ColorExpression(int p0, float p1, float p2, float p3) {}
    public ColorExpression(int p0, int p1, float p2, float p3, float p4) {}
    public ColorExpression(int p0, int p1, int p2, int p3, float p4) {}
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public java.lang.String toString() { return null; }
    public java.lang.String deepToString(java.lang.String p0) { return null; }

    public static class Companion implements com.android.internal.widget.remotecompose.core.CompanionOperation {
        public java.lang.String name() { return null; }
        public int id() { return 0; }
        public void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, int p4, float p5) {}
        public void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    }
}
