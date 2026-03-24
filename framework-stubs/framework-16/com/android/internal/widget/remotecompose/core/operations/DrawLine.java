package com.android.internal.widget.remotecompose.core.operations;

public class DrawLine extends com.android.internal.widget.remotecompose.core.operations.DrawBase4 implements com.android.internal.widget.remotecompose.core.SerializableToString {
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static int id() { return 0; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    protected void write(com.android.internal.widget.remotecompose.core.WireBuffer p0, float p1, float p2, float p3, float p4) {}
    public DrawLine(float p0, float p1, float p2, float p3) { super(0.0f, 0.0f, 0.0f, 0.0f); }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, float p1, float p2, float p3, float p4) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
