package com.android.internal.widget.remotecompose.core.operations.layout;

public class LayoutComponent extends com.android.internal.widget.remotecompose.core.operations.layout.Component {
    @android.annotation.Nullable
    protected com.android.internal.widget.remotecompose.core.operations.layout.modifiers.WidthModifierOperation mWidthModifier;
    @android.annotation.Nullable
    protected com.android.internal.widget.remotecompose.core.operations.layout.modifiers.HeightModifierOperation mHeightModifier;
    @android.annotation.Nullable
    protected com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ZIndexModifierOperation mZIndexModifier;
    @android.annotation.Nullable
    protected com.android.internal.widget.remotecompose.core.operations.layout.modifiers.GraphicsLayerModifierOperation mGraphicsLayerModifier;
    protected float mPaddingLeft;
    protected float mPaddingRight;
    protected float mPaddingTop;
    protected float mPaddingBottom;
    float mScrollX;
    float mScrollY;
    @android.annotation.Nullable
    protected com.android.internal.widget.remotecompose.core.operations.layout.ScrollDelegate mHorizontalScrollDelegate;
    @android.annotation.Nullable
    protected com.android.internal.widget.remotecompose.core.operations.layout.ScrollDelegate mVerticalScrollDelegate;
    @android.annotation.NonNull
    protected com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ComponentModifiers mComponentModifiers;
    @android.annotation.NonNull
    protected java.util.ArrayList<com.android.internal.widget.remotecompose.core.operations.layout.Component> mChildrenComponents;
    protected boolean mChildrenHaveZIndex;
    @android.annotation.Nullable
    protected com.android.internal.widget.remotecompose.core.operations.layout.LayoutComponentContent mContent;
    protected final java.util.HashMap<java.lang.Integer, java.lang.Object> mCachedAttributes = null;
    public LayoutComponent(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, float p3, float p4, float p5, float p6) { super((com.android.internal.widget.remotecompose.core.operations.layout.Component)null); }
    public float getPaddingLeft() { return 0.0f; }
    public float getPaddingTop() { return 0.0f; }
    public float getPaddingRight() { return 0.0f; }
    public float getPaddingBottom() { return 0.0f; }
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.operations.layout.modifiers.WidthModifierOperation getWidthModifier() { return null; }
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.operations.layout.modifiers.HeightModifierOperation getHeightModifier() { return null; }
    public float getZIndex() { return 0.0f; }
    public void setCanvasOperations(com.android.internal.widget.remotecompose.core.operations.layout.CanvasOperations p0) {}
    public void inflate() {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public void getLocationInWindow(float[] p0, boolean p1) {}
    public float getScrollX() { return 0.0f; }
    public void setScrollX(float p0) {}
    public float getScrollY() { return 0.0f; }
    public void setScrollY(float p0) {}
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void drawContent(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void paintingComponent(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public float computeModifierDefinedWidth(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public float computeModifierDefinedPaddingWidth(float[] p0) { return 0.0f; }
    public float computeModifierDefinedHeight(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public float computeModifierDefinedPaddingHeight(float[] p0) { return 0.0f; }
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ComponentModifiers getComponentModifiers() { return null; }
    @android.annotation.NonNull
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.operations.layout.Component> getChildrenComponents() { return null; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    @android.annotation.Nullable
    public <T extends java.lang.Object> T selfOrModifier(java.lang.Class<T> p0) { return null; }
    public void registerVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
}
