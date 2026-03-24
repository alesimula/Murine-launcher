package com.android.internal.widget.remotecompose.core.operations;

public class ColorAttribute extends com.android.internal.widget.remotecompose.core.PaintOperation {
    public int mId;
    public int mColorId;
    public short mType;
    public static final short COLOR_HUE = 0;
    public static final short COLOR_SATURATION = 1;
    public static final short COLOR_BRIGHTNESS = 2;
    public static final short COLOR_RED = 3;
    public static final short COLOR_GREEN = 4;
    public static final short COLOR_BLUE = 5;
    public static final short COLOR_ALPHA = 6;
    @android.annotation.NonNull
    float[] mBounds;
    public ColorAttribute(int p0, int p1, short p2) { super(); }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, short p3) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
