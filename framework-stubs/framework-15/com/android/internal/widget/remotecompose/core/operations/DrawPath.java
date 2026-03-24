package com.android.internal.widget.remotecompose.core.operations;

public class DrawPath extends com.android.internal.widget.remotecompose.core.PaintOperation {
    public static final com.android.internal.widget.remotecompose.core.operations.DrawPath.Companion COMPANION = null;
    int mId;
    float mStart;
    float mEnd;
    public DrawPath(int p0) { super(); }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public java.lang.String toString() { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}

    public static class Companion implements com.android.internal.widget.remotecompose.core.CompanionOperation {
        public void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
        public java.lang.String name() { return null; }
        public int id() { return 0; }
        public void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1) {}
    }
}
