package com.android.internal.widget.remotecompose.core.operations.layout;

public class Component extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.operations.layout.Container, com.android.internal.widget.remotecompose.core.operations.layout.measure.Measurable, com.android.internal.widget.remotecompose.core.SerializableToString, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    protected int mComponentId;
    protected float mX;
    protected float mY;
    protected float mWidth;
    protected float mHeight;
    @android.annotation.Nullable
    protected com.android.internal.widget.remotecompose.core.operations.layout.Component mParent;
    protected int mAnimationId;
    public int mVisibility;
    public int mScheduledVisibility;
    @android.annotation.NonNull
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> mList;
    public com.android.internal.widget.remotecompose.core.PaintOperation mPreTranslate;
    public boolean mNeedsMeasure;
    public boolean mNeedsRepaint;
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimateMeasure mAnimateMeasure;
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec mAnimationSpec;
    public boolean mFirstLayout;
    @android.annotation.NonNull
    com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle mPaint;
    @android.annotation.NonNull
    protected java.util.HashSet<com.android.internal.widget.remotecompose.core.operations.ComponentValue> mComponentValues;
    protected float mZIndex;
    @android.annotation.NonNull
    public float[] locationInWindow;
    public void markNeedsBoundsAnimation() {}
    public void clearNeedsBoundsAnimation() {}
    public boolean needsBoundsAnimation() { return false; }
    public float getZIndex() { return 0.0f; }
    @android.annotation.NonNull
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> getList() { return null; }
    public float getX() { return 0.0f; }
    public float getY() { return 0.0f; }
    public float getWidth() { return 0.0f; }
    public float getHeight() { return 0.0f; }
    public int getComponentId() { return 0; }
    public int getAnimationId() { return 0; }
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.operations.layout.Component getParent() { return null; }
    public void setX(float p0) {}
    public void setY(float p0) {}
    public void setWidth(float p0) {}
    public void setHeight(float p0) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void setComponentId(int p0) {}
    public void setAnimationId(int p0) {}
    public Component(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, float p3, float p4, float p5, float p6) { super(); }
    public Component(int p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.Component p5) { super(); }
    public Component(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { super(); }
    public void finalizeCreation() {}
    public boolean needsMeasure() { return false; }
    public void setParent(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) {}
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void addComponentValue(com.android.internal.widget.remotecompose.core.operations.ComponentValue p0) {}
    public float minIntrinsicWidth(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public float maxIntrinsicWidth(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public float minIntrinsicHeight(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public float maxIntrinsicHeight(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public void inflate() {}
    protected com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec getAnimationSpec() { return null; }
    protected void setAnimationSpec(com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec p0) {}
    public void registerVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public boolean isVisible() { return false; }
    public boolean isGone() { return false; }
    public boolean isInvisible() { return false; }
    public void setVisibility(int p0) {}
    public boolean suitableForTransition(com.android.internal.widget.remotecompose.core.Operation p0) { return false; }
    public void measure(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    public void layout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p1) {}
    public void animatingBounds(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public boolean contains(float p0, float p1) { return false; }
    public float getScrollX() { return 0.0f; }
    public float getScrollY() { return 0.0f; }
    public void onClick(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, float p2, float p3) {}
    public void onTouchDown(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, float p2, float p3) {}
    public void onTouchUp(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, float p2, float p3, float p4, float p5, boolean p6) {}
    public void onTouchCancel(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, float p2, float p3, boolean p4) {}
    public void onTouchDrag(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, float p2, float p3, boolean p4) {}
    public void getLocationInWindow(float[] p0, boolean p1) {}
    public void getLocationInWindow(float[] p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    protected java.lang.String getSerializedName() { return null; }
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.operations.layout.RootLayoutComponent getRoot() throws java.lang.Exception { return null; }
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void invalidateMeasure() {}
    public void needsRepaint() {}
    @android.annotation.NonNull
    public java.lang.String content() { return null; }
    @android.annotation.NonNull
    public java.lang.String textContent() { return null; }
    public void debugBox(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, com.android.internal.widget.remotecompose.core.PaintContext p1) {}
    public void setLayoutPosition(float p0, float p1) {}
    public float getTranslateX() { return 0.0f; }
    public float getTranslateY() { return 0.0f; }
    public void paintingComponent(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public boolean applyAnimationAsNeeded(com.android.internal.widget.remotecompose.core.PaintContext p0) { return false; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void getComponents(java.util.ArrayList<com.android.internal.widget.remotecompose.core.operations.layout.Component> p0) {}
    public void getData(java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p0) {}
    public int getComponentCount() { return 0; }
    public int getPaintId() { return 0; }
    public boolean doesNeedsRepaint() { return false; }
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.operations.layout.Component getComponent(int p0) { return null; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    @android.annotation.Nullable
    public <T extends java.lang.Object> T selfOrModifier(java.lang.Class<T> p0) { return null; }

    public static class Visibility {
        public static final int GONE = 0;
        public static final int VISIBLE = 1;
        public static final int INVISIBLE = 2;
        public static final int OVERRIDE_GONE = 16;
        public static final int OVERRIDE_VISIBLE = 32;
        public static final int OVERRIDE_INVISIBLE = 64;
        public static final int CLEAR_OVERRIDE = 128;
        public Visibility() {}
        public static java.lang.String toString(int p0) { return null; }
        public static boolean isGone(int p0) { return false; }
        public static boolean isVisible(int p0) { return false; }
        public static boolean isInvisible(int p0) { return false; }
        public static boolean hasOverride(int p0) { return false; }
        public static int clearOverride(int p0) { return 0; }
        public static int add(int p0, int p1) { return 0; }
    }
}
