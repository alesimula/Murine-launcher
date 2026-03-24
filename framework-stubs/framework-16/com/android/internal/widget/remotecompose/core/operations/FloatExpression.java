package com.android.internal.widget.remotecompose.core.operations;

public class FloatExpression extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.operations.ComponentData, com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    public int mId;
    @android.annotation.NonNull
    public float[] mSrcValue;
    @android.annotation.Nullable
    public float[] mSrcAnimation;
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.operations.utilities.easing.FloatAnimation mFloatAnimation;
    @android.annotation.Nullable
    public float[] mPreCalcValue;
    @android.annotation.NonNull
    com.android.internal.widget.remotecompose.core.operations.utilities.AnimatedFloatExpression mExp;
    public static final int MAX_EXPRESSION_SIZE = 32;
    float mLastAnimatedValue;
    public FloatExpression(int p0, float[] p1, float[] p2) { super(); }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public float evaluate(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float[] p2, float[] p3) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
