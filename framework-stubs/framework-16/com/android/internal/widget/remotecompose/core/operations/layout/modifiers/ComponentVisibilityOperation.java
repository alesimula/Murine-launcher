package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public class ComponentVisibilityOperation extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ModifierOperation, com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.operations.layout.DecoratorComponent {
    int mVisibilityId;
    int mVisibility;
    public ComponentVisibilityOperation(int p0) { super(); }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public java.lang.String serializedName() { return null; }
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void setParent(com.android.internal.widget.remotecompose.core.operations.layout.LayoutComponent p0) {}
    public void layout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, float p2, float p3) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
