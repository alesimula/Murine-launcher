package com.android.internal.widget.remotecompose.core.operations;

public class BitmapData implements com.android.internal.widget.remotecompose.core.Operation {
    int mImageId;
    int mImageWidth;
    int mImageHeight;
    byte[] mBitmap;
    public static final int MAX_IMAGE_DIMENSION = 8000;
    public static final com.android.internal.widget.remotecompose.core.operations.BitmapData.Companion COMPANION = null;
    public BitmapData(int p0, int p1, int p2, byte[] p3) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public java.lang.String toString() { return null; }
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }

    public static class Companion implements com.android.internal.widget.remotecompose.core.CompanionOperation {
        public java.lang.String name() { return null; }
        public int id() { return 0; }
        public void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, byte[] p4) {}
        public void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    }
}
