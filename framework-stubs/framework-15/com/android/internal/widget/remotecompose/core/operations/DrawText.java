package com.android.internal.widget.remotecompose.core.operations;

public class DrawText extends com.android.internal.widget.remotecompose.core.PaintOperation {
    public static final com.android.internal.widget.remotecompose.core.operations.DrawText.Companion COMPANION = null;
    int mTextID;
    int mStart;
    int mEnd;
    int mContextStart;
    int mContextEnd;
    float mX;
    float mY;
    boolean mRtl;
    public DrawText(int p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7) { super(); }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public java.lang.String toString() { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}

    public static class Companion implements com.android.internal.widget.remotecompose.core.CompanionOperation {
        public void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
        public java.lang.String name() { return null; }
        public int id() { return 0; }
        public void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, int p4, int p5, float p6, float p7, boolean p8) {}
    }
}
