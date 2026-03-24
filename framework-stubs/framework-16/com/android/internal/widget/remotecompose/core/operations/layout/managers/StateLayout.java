package com.android.internal.widget.remotecompose.core.operations.layout.managers;

public class StateLayout extends com.android.internal.widget.remotecompose.core.operations.layout.managers.LayoutManager {
    public int measuredLayoutIndex;
    public int currentLayoutIndex;
    public int previousLayoutIndex;
    @android.annotation.NonNull
    public java.util.Map<java.lang.Integer, com.android.internal.widget.remotecompose.core.operations.layout.Component[]> statePaintedComponents;
    public int MAX_CACHE_ELEMENTS;
    @android.annotation.NonNull
    public int[] cacheListElementsId;
    public boolean inTransition;
    public StateLayout(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, float p3, float p4, float p5, float p6, int p7) { super(null, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f); }
    public void inflate() {}
    public void findAnimatedComponents() {}
    public void collapsePaintedComponents() {}
    public void computeSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    public void internalLayoutMeasure(com.android.internal.widget.remotecompose.core.PaintContext p0, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p1) {}
    public void computeWrapSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, boolean p3, boolean p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5, com.android.internal.widget.remotecompose.core.operations.layout.measure.Size p6) {}
    public void onClick(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, float p2, float p3) {}
    public void layout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p1) {}
    public void measure(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    public void hideLayoutsOtherThan(int p0) {}
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.operations.layout.managers.LayoutManager getLayout(int p0) { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void checkEndOfTransition() {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, int p4, int p5) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
