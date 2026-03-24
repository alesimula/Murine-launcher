package com.android.internal.widget.remotecompose.core.operations.layout.managers;

public class ImageLayout extends com.android.internal.widget.remotecompose.core.operations.layout.managers.LayoutManager implements com.android.internal.widget.remotecompose.core.VariableSupport {
    @android.annotation.NonNull
    com.android.internal.widget.remotecompose.core.operations.utilities.ImageScaling mScaling;
    @android.annotation.NonNull
    com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle mPaint;
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public ImageLayout(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, int p3, float p4, float p5, float p6, float p7, int p8, float p9) { super(null, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f); }
    public ImageLayout(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, int p3, int p4, float p5) { super(null, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f); }
    public void computeWrapSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, boolean p3, boolean p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5, com.android.internal.widget.remotecompose.core.operations.layout.measure.Size p6) {}
    public void computeSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    public void paintingComponent(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    protected java.lang.String getSerializedName() { return null; }
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, int p4, float p5) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
