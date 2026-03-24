package com.android.internal.widget.remotecompose.core.operations.layout.managers;

public abstract class LayoutManager extends com.android.internal.widget.remotecompose.core.operations.layout.LayoutComponent implements com.android.internal.widget.remotecompose.core.operations.layout.measure.Measurable {
    @android.annotation.NonNull
    com.android.internal.widget.remotecompose.core.operations.layout.measure.Size mCachedWrapSize;
    public LayoutManager(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, float p3, float p4, float p5, float p6) { super(null, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f); }
    public boolean applyVisibility(float p0, float p1, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p2) { return false; }
    public void internalLayoutMeasure(com.android.internal.widget.remotecompose.core.PaintContext p0, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p1) {}
    public void computeWrapSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, boolean p3, boolean p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5, com.android.internal.widget.remotecompose.core.operations.layout.measure.Size p6) {}
    public float minIntrinsicHeight(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public float minIntrinsicWidth(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public void computeSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    protected boolean childrenHaveHorizontalWeights() { return false; }
    protected boolean childrenHaveVerticalWeights() { return false; }
    public boolean isInHorizontalFill() { return false; }
    public boolean isInVerticalFill() { return false; }
    public void measure(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    protected boolean hasHorizontalIntrinsicDimension() { return false; }
    protected boolean hasVerticalIntrinsicDimension() { return false; }
    public void layout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p1) {}
    public void selfLayout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p1) {}
}
