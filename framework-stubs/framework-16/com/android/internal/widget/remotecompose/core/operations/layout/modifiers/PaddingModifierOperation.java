package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public class PaddingModifierOperation extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ModifierOperation {
    public static final java.lang.String CLASS_NAME = "PaddingModifierOperation";
    float mLeft;
    float mTop;
    float mRight;
    float mBottom;
    public PaddingModifierOperation(float p0, float p1, float p2, float p3) { super(); }
    public float getLeft() { return 0.0f; }
    public float getTop() { return 0.0f; }
    public float getRight() { return 0.0f; }
    public float getBottom() { return 0.0f; }
    public void setLeft(float p0) {}
    public void setTop(float p0) {}
    public void setRight(float p0) {}
    public void setBottom(float p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, float p1, float p2, float p3, float p4) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
