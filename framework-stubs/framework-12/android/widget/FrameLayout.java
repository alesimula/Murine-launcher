package android.widget;

@android.widget.RemoteViews.RemoteView
public class FrameLayout extends android.view.ViewGroup {
    private static final int DEFAULT_CHILD_GRAVITY = 8388659;
    @android.view.ViewDebug.ExportedProperty(category="measurement")
    boolean mMeasureAllChildren;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    private int mForegroundPaddingLeft;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    private int mForegroundPaddingTop;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    private int mForegroundPaddingRight;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    private int mForegroundPaddingBottom;
    private final java.util.ArrayList<android.view.View> mMatchParentChildren = null;
    public FrameLayout(android.content.Context p0) { super((android.content.Context)null); }
    public FrameLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public FrameLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public FrameLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    @android.view.RemotableViewMethod
    public void setForegroundGravity(int p0) {}
    protected android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams() { return null; }
    int getPaddingLeftWithForeground() { return 0; }
    int getPaddingRightWithForeground() { return 0; }
    private int getPaddingTopWithForeground() { return 0; }
    private int getPaddingBottomWithForeground() { return 0; }
    protected void onMeasure(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    void layoutChildren(int p0, int p1, int p2, int p3, boolean p4) {}
    @android.view.RemotableViewMethod
    public void setMeasureAllChildren(boolean p0) {}
    @java.lang.Deprecated
    public boolean getConsiderGoneChildrenWhenMeasuring() { return false; }
    public boolean getMeasureAllChildren() { return false; }
    public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    public boolean shouldDelayChildPressedState() { return false; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public static final int UNSPECIFIED_GRAVITY = -1;
        public int gravity;
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(int p0, int p1, int p2) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.widget.FrameLayout.LayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }

        public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.FrameLayout.LayoutParams> {
            private boolean mPropertiesMapped;
            private int mLayout_gravityId;
            public InspectionCompanion() {}
            public void mapProperties(android.view.inspector.PropertyMapper p0) {}
            public void readProperties(android.widget.FrameLayout.LayoutParams p0, android.view.inspector.PropertyReader p1) {}
        }
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.FrameLayout> {
        private boolean mPropertiesMapped;
        private int mMeasureAllChildrenId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.FrameLayout p0, android.view.inspector.PropertyReader p1) {}
    }
}
