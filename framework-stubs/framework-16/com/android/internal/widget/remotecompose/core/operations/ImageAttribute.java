package com.android.internal.widget.remotecompose.core.operations;

public class ImageAttribute extends com.android.internal.widget.remotecompose.core.PaintOperation {
    public int mId;
    int mImageId;
    short mType;
    public static final short IMAGE_WIDTH = 0;
    public static final short IMAGE_HEIGHT = 1;
    @android.annotation.NonNull
    float[] mBounds;
    public ImageAttribute(int p0, int p1, short p2, int[] p3) { super(); }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, short p3, int[] p4) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
