package com.android.internal.widget.remotecompose.core.operations.layout.managers;

public class CollapsibleColumnLayout extends com.android.internal.widget.remotecompose.core.operations.layout.managers.ColumnLayout {
    public CollapsibleColumnLayout(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, float p3, float p4, float p5, float p6, int p7, int p8, float p9) { super((com.android.internal.widget.remotecompose.core.operations.layout.Component)null, 0, 0, 0, 0, 0.0f); }
    public CollapsibleColumnLayout(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, int p3, int p4, float p5) { super((com.android.internal.widget.remotecompose.core.operations.layout.Component)null, 0, 0, 0, 0, 0.0f); }
    @android.annotation.NonNull
    protected java.lang.String getSerializedName() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, int p4, float p5) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public float minIntrinsicHeight(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public float minIntrinsicWidth(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public boolean hasVerticalIntrinsicDimension() { return false; }
    public void computeWrapSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, boolean p3, boolean p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5, com.android.internal.widget.remotecompose.core.operations.layout.measure.Size p6) {}
    public void computeSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    public void internalLayoutMeasure(com.android.internal.widget.remotecompose.core.PaintContext p0, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p1) {}
}
