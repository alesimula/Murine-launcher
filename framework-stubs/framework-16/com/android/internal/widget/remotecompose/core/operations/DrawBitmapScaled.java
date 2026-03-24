package com.android.internal.widget.remotecompose.core.operations;

public class DrawBitmapScaled extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent {
    int mImageId;
    float mSrcLeft;
    float mOutSrcLeft;
    float mSrcTop;
    float mOutSrcTop;
    float mSrcRight;
    float mOutSrcRight;
    float mSrcBottom;
    float mOutSrcBottom;
    float mDstLeft;
    float mOutDstLeft;
    float mDstTop;
    float mOutDstTop;
    float mDstRight;
    float mOutDstRight;
    float mDstBottom;
    float mOutDstBottom;
    int mContentDescId;
    float mScaleFactor;
    float mOutScaleFactor;
    int mScaleType;
    int mMode;
    @android.annotation.NonNull
    com.android.internal.widget.remotecompose.core.operations.utilities.ImageScaling mScaling;
    public static final int SCALE_NONE = 0;
    public static final int SCALE_INSIDE = 1;
    public static final int SCALE_FILL_WIDTH = 2;
    public static final int SCALE_FILL_HEIGHT = 3;
    public static final int SCALE_FIT = 4;
    public static final int SCALE_CROP = 5;
    public static final int SCALE_FILL_BOUNDS = 6;
    public static final int SCALE_FIXED_SCALE = 7;
    public DrawBitmapScaled(int p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, int p9, float p10, int p11) { super(); }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    static java.lang.String str(float p0) { return null; }
    void print(java.lang.String p0, float p1, float p2, float p3, float p4) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public java.lang.Integer getContentDescriptionId() { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, int p10, float p11, int p12) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
