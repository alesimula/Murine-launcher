package com.android.internal.widget.remotecompose.core.operations;

public class DrawTweenPath extends com.android.internal.widget.remotecompose.core.PaintOperation {
    public static final com.android.internal.widget.remotecompose.core.operations.DrawTweenPath.Companion COMPANION = null;
    float mTween;
    float mStart;
    float mStop;
    int mPath1Id;
    int mPath2Id;
    public DrawTweenPath(int p0, int p1, float p2, float p3, float p4) { super(); }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public java.lang.String toString() { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}

    public static class Companion implements com.android.internal.widget.remotecompose.core.CompanionOperation {
        public void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
        public java.lang.String name() { return null; }
        public int id() { return 0; }
        public void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, float p3, float p4, float p5) {}
    }
}
