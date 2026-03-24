package com.android.internal.widget.remotecompose.core.operations.layout.managers;

public class TextLayout extends com.android.internal.widget.remotecompose.core.operations.layout.managers.LayoutManager implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent {
    public static final int TEXT_ALIGN_LEFT = 1;
    public static final int TEXT_ALIGN_RIGHT = 2;
    public static final int TEXT_ALIGN_CENTER = 3;
    public static final int TEXT_ALIGN_JUSTIFY = 4;
    public static final int TEXT_ALIGN_START = 5;
    public static final int TEXT_ALIGN_END = 6;
    public static final int OVERFLOW_CLIP = 1;
    public static final int OVERFLOW_VISIBLE = 2;
    public static final int OVERFLOW_ELLIPSIS = 3;
    public static final int OVERFLOW_START_ELLIPSIS = 4;
    public static final int OVERFLOW_MIDDLE_ELLIPSIS = 5;
    com.android.internal.widget.remotecompose.core.Platform.ComputedTextLayout mComputedTextLayout;
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle mPaint;
    @android.annotation.Nullable
    public java.lang.Integer getTextId() { return null; }
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public TextLayout(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, float p3, float p4, float p5, float p6, int p7, int p8, float p9, int p10, float p11, int p12, int p13, int p14, int p15) { super(null, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f); }
    public TextLayout(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, int p3, int p4, float p5, int p6, float p7, int p8, int p9, int p10, int p11) { super(null, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f); }
    public void paintingComponent(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    protected java.lang.String getSerializedName() { return null; }
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public void computeSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    public void computeWrapSize(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, boolean p3, boolean p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5, com.android.internal.widget.remotecompose.core.operations.layout.measure.Size p6) {}
    public float minIntrinsicHeight(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public float minIntrinsicWidth(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, int p4, float p5, int p6, float p7, int p8, int p9, int p10, int p11) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
