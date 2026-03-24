package com.android.internal.widget.remotecompose.core.operations;

public class NamedVariable extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.serialize.Serializable {
    public final int mVarId = 0;
    @android.annotation.NonNull
    public final java.lang.String mVarName = null;
    public final int mVarType = 0;
    public static final int MAX_STRING_SIZE = 4000;
    public static final int COLOR_TYPE = 2;
    public static final int FLOAT_TYPE = 1;
    public static final int STRING_TYPE = 0;
    public static final int IMAGE_TYPE = 3;
    public static final int INT_TYPE = 4;
    public static final int LONG_TYPE = 5;
    public NamedVariable(int p0, int p1, java.lang.String p2) { super(); }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, java.lang.String p3) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
