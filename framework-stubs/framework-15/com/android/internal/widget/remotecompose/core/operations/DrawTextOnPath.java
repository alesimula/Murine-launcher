package com.android.internal.widget.remotecompose.core.operations;

public class DrawTextOnPath extends com.android.internal.widget.remotecompose.core.PaintOperation {
    public static final com.android.internal.widget.remotecompose.core.operations.DrawTextOnPath.Companion COMPANION = null;
    int mPathId;
    public int mTextId;
    float mVOffset;
    float mHOffset;
    public DrawTextOnPath(int p0, int p1, float p2, float p3) { super(); }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public java.lang.String toString() { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}

    public static class Companion implements com.android.internal.widget.remotecompose.core.CompanionOperation {
        public void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
        public java.lang.String name() { return null; }
        public int id() { return 0; }
        public void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, float p3, float p4) {}
    }
}
