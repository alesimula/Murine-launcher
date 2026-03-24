package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public class RippleModifierOperation extends com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DecoratorModifierOperation implements com.android.internal.widget.remotecompose.core.operations.layout.TouchHandler {
    long mAnimateRippleStart;
    float mAnimateRippleX;
    float mAnimateRippleY;
    int mAnimateRippleDuration;
    float mWidth;
    float mHeight;
    @android.annotation.NonNull
    public float[] locationInWindow;
    @android.annotation.NonNull
    com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle mPaint;
    public RippleModifierOperation() { super(); }
    public void animateRipple(float p0, float p1) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void layout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, float p2, float p3) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void onTouchDown(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4) {}
    public void onTouchUp(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4, float p5, float p6) {}
    public void onTouchDrag(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4) {}
    public void onTouchCancel(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
