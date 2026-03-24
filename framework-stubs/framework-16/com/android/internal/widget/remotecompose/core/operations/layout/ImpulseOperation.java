package com.android.internal.widget.remotecompose.core.operations.layout;

public class ImpulseOperation extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.operations.layout.Container {
    @android.annotation.NonNull
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> mList;
    int mIndexVariableId;
    public ImpulseOperation(float p0, float p1) { super(); }
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> getList() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, float p1, float p2) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public int estimateIterations() { return 0; }
    public void setProcess(com.android.internal.widget.remotecompose.core.operations.layout.ImpulseProcess p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
