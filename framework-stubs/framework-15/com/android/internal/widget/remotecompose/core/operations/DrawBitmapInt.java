package com.android.internal.widget.remotecompose.core.operations;

public class DrawBitmapInt extends com.android.internal.widget.remotecompose.core.PaintOperation {
    int mImageId;
    int mSrcLeft;
    int mSrcTop;
    int mSrcRight;
    int mSrcBottom;
    int mDstLeft;
    int mDstTop;
    int mDstRight;
    int mDstBottom;
    int mContentDescId;
    public static final com.android.internal.widget.remotecompose.core.operations.DrawBitmapInt.Companion COMPANION = null;
    public DrawBitmapInt(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9) { super(); }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public java.lang.String toString() { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}

    public static class Companion implements com.android.internal.widget.remotecompose.core.CompanionOperation {
        public java.lang.String name() { return null; }
        public int id() { return 0; }
        public void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10) {}
        public void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    }
}
