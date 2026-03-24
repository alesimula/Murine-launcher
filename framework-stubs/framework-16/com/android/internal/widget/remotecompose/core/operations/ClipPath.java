package com.android.internal.widget.remotecompose.core.operations;

public class ClipPath extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.serialize.Serializable {
    int mId;
    int mRegionOp;
    public static final int PATH_CLIP_REPLACE = 0;
    public static final int PATH_CLIP_DIFFERENCE = 1;
    public static final int PATH_CLIP_INTERSECT = 2;
    public static final int PATH_CLIP_UNION = 3;
    public static final int PATH_CLIP_XOR = 4;
    public static final int PATH_CLIP_REVERSE_DIFFERENCE = 5;
    public static final int PATH_CLIP_UNDEFINED = 6;
    public static final int REPLACE = 0;
    public static final int DIFFERENCE = 1;
    public static final int INTERSECT = 2;
    public static final int UNION = 3;
    public static final int XOR = 4;
    public static final int REVERSE_DIFFERENCE = 5;
    public static final int UNDEFINED = 6;
    public ClipPath(int p0, int p1) { super(); }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    java.lang.String regionOpToString() { return null; }
}
