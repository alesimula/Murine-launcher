package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public class ScrollModifierOperation extends com.android.internal.widget.remotecompose.core.operations.layout.ListActionsOperation implements com.android.internal.widget.remotecompose.core.operations.layout.TouchHandler, com.android.internal.widget.remotecompose.core.operations.layout.DecoratorComponent, com.android.internal.widget.remotecompose.core.operations.layout.ScrollDelegate, com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.semantics.ScrollableComponent {
    public static final java.lang.String CLASS_NAME = "ScrollModifierOperation";
    int mDirection;
    float mTouchDownX;
    float mTouchDownY;
    float mInitialScrollX;
    float mInitialScrollY;
    float mScrollX;
    float mScrollY;
    float mMaxScrollX;
    float mMaxScrollY;
    float mHostDimension;
    float mContentDimension;
    public ScrollModifierOperation(int p0, float p1, float p2, float p3) { super(null); }
    public void inflate(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public boolean isVerticalScroll() { return false; }
    public boolean isHorizontalScroll() { return false; }
    public float getScrollX() { return 0.0f; }
    public float getScrollY() { return 0.0f; }
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2, float p3, float p4) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void layout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, float p2, float p3) {}
    public void onTouchDown(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4) {}
    public void onTouchUp(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4, float p5, float p6) {}
    public void onTouchDrag(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4) {}
    public void onTouchCancel(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4) {}
    public void setHorizontalScrollDimension(float p0, float p1) {}
    public void setVerticalScrollDimension(float p0, float p1) {}
    public float getContentDimension() { return 0.0f; }
    public float getScrollX(float p0) { return 0.0f; }
    public float getScrollY(float p0) { return 0.0f; }
    public boolean handlesHorizontalScroll() { return false; }
    public boolean handlesVerticalScroll() { return false; }
    public void reset() {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public int scrollDirection() { return 0; }
    public int scrollByOffset(com.android.internal.widget.remotecompose.core.RemoteContext p0, int p1) { return 0; }
    public boolean scrollDirection(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.semantics.ScrollableComponent.ScrollDirection p1) { return false; }
    public boolean showOnScreen(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1) { return false; }
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.semantics.ScrollableComponent.ScrollAxisRange getScrollAxisRange() { return null; }
}
