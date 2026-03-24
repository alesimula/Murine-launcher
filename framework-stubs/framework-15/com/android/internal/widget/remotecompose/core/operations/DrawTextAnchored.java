package com.android.internal.widget.remotecompose.core.operations;

public class DrawTextAnchored extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport {
    public static final com.android.internal.widget.remotecompose.core.operations.DrawTextAnchored.Companion COMPANION = null;
    int mTextID;
    float mX;
    float mY;
    float mPanX;
    float mPanY;
    int mFlags;
    float mOutX;
    float mOutY;
    float mOutPanX;
    float mOutPanY;
    public static final int ANCHOR_TEXT_RTL = 1;
    public static final int ANCHOR_MONOSPACE_MEASURE = 2;
    float[] mBounds;
    public DrawTextAnchored(int p0, float p1, float p2, float p3, float p4, int p5) { super(); }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public java.lang.String toString() { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}

    public static class Companion implements com.android.internal.widget.remotecompose.core.CompanionOperation {
        public void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
        public java.lang.String name() { return null; }
        public int id() { return 0; }
        public void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2, float p3, float p4, float p5, int p6) {}
    }
}
