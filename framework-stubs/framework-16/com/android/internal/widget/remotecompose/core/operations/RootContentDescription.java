package com.android.internal.widget.remotecompose.core.operations;

public class RootContentDescription extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.RemoteComposeOperation, com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    int mContentDescription;
    public RootContentDescription(int p0) { super(); }
    public boolean isInterestingForSemantics() { return false; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public java.lang.Integer getContentDescriptionId() { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
