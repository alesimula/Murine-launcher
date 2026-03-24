package com.android.internal.widget.remotecompose.core.operations;

public class Theme extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.RemoteComposeOperation {
    int mTheme;
    public static final int UNSPECIFIED = -1;
    public static final int DARK = -2;
    public static final int LIGHT = -3;
    public Theme(int p0) { super(); }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
}
