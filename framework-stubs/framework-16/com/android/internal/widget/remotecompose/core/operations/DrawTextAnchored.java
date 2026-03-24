package com.android.internal.widget.remotecompose.core.operations;

public class DrawTextAnchored extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    int mTextID;
    float mX;
    float mY;
    float mPanX;
    float mPanY;
    int mFlags;
    float mOutX;
    float mOutY;
    float mOutPanX;
    float mOutPanY;
    java.lang.String mLastString;
    public static final int ANCHOR_TEXT_RTL = 1;
    public static final int ANCHOR_MONOSPACE_MEASURE = 2;
    public static final int MEASURE_EVERY_TIME = 4;
    @android.annotation.NonNull
    float[] mBounds;
    public DrawTextAnchored(int p0, float p1, float p2, float p3, float p4, int p5) { super(); }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2, float p3, float p4, float p5, int p6) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
