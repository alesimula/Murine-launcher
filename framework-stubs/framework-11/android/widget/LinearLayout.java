package android.widget;

@android.widget.RemoteViews.RemoteView
public class LinearLayout extends android.view.ViewGroup {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_END = 4;
    private final boolean mAllowInconsistentMeasurement = false;
    @android.view.ViewDebug.ExportedProperty(category="layout")
    private boolean mBaselineAligned;
    @android.view.ViewDebug.ExportedProperty(category="layout")
    private int mBaselineAlignedChildIndex;
    @android.view.ViewDebug.ExportedProperty(category="measurement")
    private int mBaselineChildTop;
    @android.view.ViewDebug.ExportedProperty(category="measurement")
    private int mOrientation;
    @android.view.ViewDebug.ExportedProperty(category="measurement", flagMapping={@android.view.ViewDebug.FlagToString(mask=-1, equals=-1, name="NONE"), @android.view.ViewDebug.FlagToString(mask=0, equals=0, name="NONE"), @android.view.ViewDebug.FlagToString(mask=48, equals=48, name="TOP"), @android.view.ViewDebug.FlagToString(mask=80, equals=80, name="BOTTOM"), @android.view.ViewDebug.FlagToString(mask=3, equals=3, name="LEFT"), @android.view.ViewDebug.FlagToString(mask=5, equals=5, name="RIGHT"), @android.view.ViewDebug.FlagToString(mask=8388611, equals=8388611, name="START"), @android.view.ViewDebug.FlagToString(mask=8388613, equals=8388613, name="END"), @android.view.ViewDebug.FlagToString(mask=16, equals=16, name="CENTER_VERTICAL"), @android.view.ViewDebug.FlagToString(mask=112, equals=112, name="FILL_VERTICAL"), @android.view.ViewDebug.FlagToString(mask=1, equals=1, name="CENTER_HORIZONTAL"), @android.view.ViewDebug.FlagToString(mask=7, equals=7, name="FILL_HORIZONTAL"), @android.view.ViewDebug.FlagToString(mask=17, equals=17, name="CENTER"), @android.view.ViewDebug.FlagToString(mask=119, equals=119, name="FILL"), @android.view.ViewDebug.FlagToString(mask=8388608, equals=8388608, name="RELATIVE")}, formatToHexString=true)
    private int mGravity;
    @android.view.ViewDebug.ExportedProperty(category="measurement")
    private int mTotalLength;
    @android.view.ViewDebug.ExportedProperty(category="layout")
    private float mWeightSum;
    @android.view.ViewDebug.ExportedProperty(category="layout")
    private boolean mUseLargestChild;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_TOP = 1;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_FILL = 3;
    private android.graphics.drawable.Drawable mDivider;
    private int mDividerWidth;
    private int mDividerHeight;
    private int mShowDividers;
    private int mDividerPadding;
    private int mLayoutDirection;
    private static boolean sCompatibilityDone;
    private static boolean sRemeasureWeightedChildren;
    public LinearLayout(android.content.Context p0) { super((android.content.Context)null); }
    public LinearLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public LinearLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public LinearLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private boolean isShowingDividers() { return false; }
    public void setShowDividers(int p0) {}
    public boolean shouldDelayChildPressedState() { return false; }
    public int getShowDividers() { return 0; }
    public android.graphics.drawable.Drawable getDividerDrawable() { return null; }
    public void setDividerDrawable(android.graphics.drawable.Drawable p0) {}
    public void setDividerPadding(int p0) {}
    public int getDividerPadding() { return 0; }
    public int getDividerWidth() { return 0; }
    protected void onDraw(android.graphics.Canvas p0) {}
    void drawDividersVertical(android.graphics.Canvas p0) {}
    private android.view.View getLastNonGoneChild() { return null; }
    void drawDividersHorizontal(android.graphics.Canvas p0) {}
    void drawHorizontalDivider(android.graphics.Canvas p0, int p1) {}
    void drawVerticalDivider(android.graphics.Canvas p0, int p1) {}
    public boolean isBaselineAligned() { return false; }
    @android.view.RemotableViewMethod
    public void setBaselineAligned(boolean p0) {}
    public boolean isMeasureWithLargestChildEnabled() { return false; }
    @android.view.RemotableViewMethod
    public void setMeasureWithLargestChildEnabled(boolean p0) {}
    public int getBaseline() { return 0; }
    public int getBaselineAlignedChildIndex() { return 0; }
    @android.view.RemotableViewMethod
    public void setBaselineAlignedChildIndex(int p0) {}
    android.view.View getVirtualChildAt(int p0) { return null; }
    int getVirtualChildCount() { return 0; }
    public float getWeightSum() { return 0.0f; }
    @android.view.RemotableViewMethod
    public void setWeightSum(float p0) {}
    protected void onMeasure(int p0, int p1) {}
    protected boolean hasDividerBeforeChildAt(int p0) { return false; }
    private boolean allViewsAreGoneBefore(int p0) { return false; }
    void measureVertical(int p0, int p1) {}
    private void forceUniformWidth(int p0, int p1) {}
    void measureHorizontal(int p0, int p1) {}
    private void forceUniformHeight(int p0, int p1) {}
    int getChildrenSkipCount(android.view.View p0, int p1) { return 0; }
    int measureNullChild(int p0) { return 0; }
    void measureChildBeforeLayout(android.view.View p0, int p1, int p2, int p3, int p4, int p5) {}
    int getLocationOffset(android.view.View p0) { return 0; }
    int getNextLocationOffset(android.view.View p0) { return 0; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    void layoutVertical(int p0, int p1, int p2, int p3) {}
    public void onRtlPropertiesChanged(int p0) {}
    void layoutHorizontal(int p0, int p1, int p2, int p3) {}
    private void setChildFrame(android.view.View p0, int p1, int p2, int p3, int p4) {}
    public void setOrientation(int p0) {}
    public int getOrientation() { return 0; }
    @android.view.RemotableViewMethod
    public void setGravity(int p0) {}
    public int getGravity() { return 0; }
    @android.view.RemotableViewMethod
    public void setHorizontalGravity(int p0) {}
    @android.view.RemotableViewMethod
    public void setVerticalGravity(int p0) {}
    public android.widget.LinearLayout.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() { return null; }
    protected android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DividerMode {
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        @android.view.ViewDebug.ExportedProperty(category="layout")
        public float weight;
        @android.view.ViewDebug.ExportedProperty(category="layout", mapping={@android.view.ViewDebug.IntToString(from=-1, to="NONE"), @android.view.ViewDebug.IntToString(from=0, to="NONE"), @android.view.ViewDebug.IntToString(from=48, to="TOP"), @android.view.ViewDebug.IntToString(from=80, to="BOTTOM"), @android.view.ViewDebug.IntToString(from=3, to="LEFT"), @android.view.ViewDebug.IntToString(from=5, to="RIGHT"), @android.view.ViewDebug.IntToString(from=8388611, to="START"), @android.view.ViewDebug.IntToString(from=8388613, to="END"), @android.view.ViewDebug.IntToString(from=16, to="CENTER_VERTICAL"), @android.view.ViewDebug.IntToString(from=112, to="FILL_VERTICAL"), @android.view.ViewDebug.IntToString(from=1, to="CENTER_HORIZONTAL"), @android.view.ViewDebug.IntToString(from=7, to="FILL_HORIZONTAL"), @android.view.ViewDebug.IntToString(from=17, to="CENTER"), @android.view.ViewDebug.IntToString(from=119, to="FILL")})
        public int gravity;
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(int p0, int p1, float p2) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.widget.LinearLayout.LayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public java.lang.String debug(java.lang.String p0) { return null; }
        protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}

        public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.LinearLayout.LayoutParams> {
            private boolean mPropertiesMapped;
            private int mLayout_gravityId;
            private int mLayout_weightId;
            public InspectionCompanion() {}
            public void mapProperties(android.view.inspector.PropertyMapper p0) {}
            public void readProperties(android.widget.LinearLayout.LayoutParams p0, android.view.inspector.PropertyReader p1) {}
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OrientationMode {
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.LinearLayout> {
        private boolean mPropertiesMapped;
        private int mBaselineAlignedId;
        private int mBaselineAlignedChildIndexId;
        private int mDividerId;
        private int mGravityId;
        private int mMeasureWithLargestChildId;
        private int mOrientationId;
        private int mWeightSumId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.LinearLayout p0, android.view.inspector.PropertyReader p1) {}
    }
}
