package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public class BackgroundModifierOperation extends com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DecoratorModifierOperation {
    float mX;
    float mY;
    float mWidth;
    float mHeight;
    float mR;
    float mG;
    float mB;
    float mA;
    int mShapeType;
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle mPaint;
    public BackgroundModifierOperation(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, int p8) { super(); }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public void layout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, float p2, float p3) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, int p9) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
