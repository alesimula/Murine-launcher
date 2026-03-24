package com.android.internal.widget.remotecompose.core.operations;

public class IntegerExpression extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    public int mId;
    @android.annotation.NonNull
    public final int[] mSrcValue = null;
    @android.annotation.Nullable
    public int[] mPreCalcValue;
    public static final int MAX_SIZE = 320;
    @android.annotation.NonNull
    com.android.internal.widget.remotecompose.core.operations.utilities.IntegerExpressionEvaluator mExp;
    public IntegerExpression(int p0, int p1, int[] p2) { super(); }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public int evaluate(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int[] p3) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public static boolean isId(int p0, int p1, int p2) { return false; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
