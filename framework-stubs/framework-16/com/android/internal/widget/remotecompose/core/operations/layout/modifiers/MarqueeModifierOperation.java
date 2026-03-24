package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public class MarqueeModifierOperation extends com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DecoratorModifierOperation implements com.android.internal.widget.remotecompose.core.operations.layout.ScrollDelegate {
    public static final java.lang.String CLASS_NAME = "MarqueeModifierOperation";
    int mIterations;
    int mAnimationMode;
    float mRepeatDelayMillis;
    float mInitialDelayMillis;
    float mSpacing;
    float mVelocity;
    public MarqueeModifierOperation(int p0, int p1, float p2, float p3, float p4, float p5) { super(); }
    public void setContentWidth(float p0) {}
    public void setContentHeight(float p0) {}
    public float getScrollX(float p0) { return 0.0f; }
    public float getScrollY(float p0) { return 0.0f; }
    public boolean handlesHorizontalScroll() { return false; }
    public boolean handlesVerticalScroll() { return false; }
    public void reset() {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public java.lang.String toString() { return null; }
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, float p3, float p4, float p5, float p6) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void layout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, float p2, float p3) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
