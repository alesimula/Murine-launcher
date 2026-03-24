package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public class RoundedClipRectModifierOperation extends com.android.internal.widget.remotecompose.core.operations.DrawBase4 implements com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ModifierOperation, com.android.internal.widget.remotecompose.core.operations.layout.DecoratorComponent {
    public static final int OP_CODE = 54;
    public static final java.lang.String CLASS_NAME = "RoundedClipRectModifierOperation";
    float mWidth;
    float mHeight;
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static int id() { return 0; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    protected void write(com.android.internal.widget.remotecompose.core.WireBuffer p0, float p1, float p2, float p3, float p4) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public RoundedClipRectModifierOperation(float p0, float p1, float p2, float p3) { super(0.0f, 0.0f, 0.0f, 0.0f); }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void layout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, float p2, float p3) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, float p1, float p2, float p3, float p4) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
