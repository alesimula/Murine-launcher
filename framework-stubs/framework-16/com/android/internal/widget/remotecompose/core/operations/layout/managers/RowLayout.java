package com.android.internal.widget.remotecompose.core.operations.layout.managers;

public class RowLayout extends com.android.internal.widget.remotecompose.core.operations.layout.managers.LayoutManager {
    public static final int START = 1;
    public static final int CENTER = 2;
    public static final int END = 3;
    public static final int TOP = 4;
    public static final int BOTTOM = 5;
    public static final int SPACE_BETWEEN = 6;
    public static final int SPACE_EVENLY = 7;
    public static final int SPACE_AROUND = 8;
    int mHorizontalPositioning;
    int mVerticalPositioning;
    float mSpacedBy;
    public RowLayout(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, float p3, float p4, float p5, float p6, int p7, int p8, float p9) { super(null, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f); }
    public RowLayout(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, int p3, int p4, float p5) { super(null, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f); }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    protected java.lang.String getSerializedName() { return null; }
    public boolean isInHorizontalFill() { return false; }
    public void computeWrapSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, boolean p3, boolean p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5, com.android.internal.widget.remotecompose.core.operations.layout.measure.Size p6) {}
    public void computeSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    public float minIntrinsicWidth(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public float minIntrinsicHeight(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public void internalLayoutMeasure(com.android.internal.widget.remotecompose.core.PaintContext p0, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p1) {}
    public void getLocationInWindow(float[] p0, boolean p1) {}
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, int p4, float p5) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
