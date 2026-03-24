package com.android.internal.widget.remotecompose.core.operations;

public class DrawBitmapInt extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent {
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
    public DrawBitmapInt(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9) { super(); }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public java.lang.Integer getContentDescriptionId() { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
