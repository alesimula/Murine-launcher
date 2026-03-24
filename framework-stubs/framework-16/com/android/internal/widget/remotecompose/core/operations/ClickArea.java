package com.android.internal.widget.remotecompose.core.operations;

public class ClickArea extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.RemoteComposeOperation, com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent, com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    int mId;
    int mContentDescription;
    float mLeft;
    float mTop;
    float mRight;
    float mBottom;
    float mOutLeft;
    float mOutTop;
    float mOutRight;
    float mOutBottom;
    int mMetadata;
    public ClickArea(int p0, int p1, float p2, float p3, float p4, float p5, int p6) { super(); }
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public java.lang.Integer getContentDescriptionId() { return null; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, float p3, float p4, float p5, float p6, int p7) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
