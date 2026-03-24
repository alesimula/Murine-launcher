package com.android.internal.widget.remotecompose.core.operations;

public class PathCreate extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    int mInstanceId;
    float[] mFloatPath;
    float[] mOutputPath;
    public static final int MOVE = 10;
    public static final int LINE = 11;
    public static final int QUADRATIC = 12;
    public static final int CONIC = 13;
    public static final int CUBIC = 14;
    public static final int CLOSE = 15;
    public static final int DONE = 16;
    public static final float MOVE_NAN = Float.valueOf(0.0f);
    public static final float LINE_NAN = Float.valueOf(0.0f);
    public static final float QUADRATIC_NAN = Float.valueOf(0.0f);
    public static final float CONIC_NAN = Float.valueOf(0.0f);
    public static final float CUBIC_NAN = Float.valueOf(0.0f);
    public static final float CLOSE_NAN = Float.valueOf(0.0f);
    public static final float DONE_NAN = Float.valueOf(0.0f);
    PathCreate(int p0, float p1, float p2) { super(); }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2, float p3) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    @android.annotation.NonNull
    public static java.lang.String pathString(float[] p0) { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
