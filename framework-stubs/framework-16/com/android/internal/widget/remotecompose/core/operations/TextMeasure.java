package com.android.internal.widget.remotecompose.core.operations;

public class TextMeasure extends com.android.internal.widget.remotecompose.core.PaintOperation {
    public int mId;
    public int mTextId;
    public int mType;
    public static final int MEASURE_WIDTH = 0;
    public static final int MEASURE_HEIGHT = 1;
    public static final int MEASURE_LEFT = 2;
    public static final int MEASURE_RIGHT = 3;
    public static final int MEASURE_TOP = 4;
    public static final int MEASURE_BOTTOM = 5;
    public static final int MEASURE_MONOSPACE_FLAG = 256;
    public static final int MEASURE_MAX_HEIGHT_FLAG = 512;
    @android.annotation.NonNull
    float[] mBounds;
    public TextMeasure(int p0, int p1, int p2) { super(); }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
