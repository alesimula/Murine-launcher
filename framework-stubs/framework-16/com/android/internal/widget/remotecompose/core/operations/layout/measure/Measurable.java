package com.android.internal.widget.remotecompose.core.operations.layout.measure;

public interface Measurable {
    public void measure(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5);
    public void layout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p1);
    public boolean needsMeasure();
    public void animatingBounds(com.android.internal.widget.remotecompose.core.RemoteContext p0);
}
