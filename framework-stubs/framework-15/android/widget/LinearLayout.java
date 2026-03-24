package android.widget;

@android.widget.RemoteViews.RemoteView
public class LinearLayout extends android.view.ViewGroup {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_END = 4;
    public LinearLayout(android.content.Context p0) { super((android.content.Context)null); }
    public LinearLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public LinearLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public LinearLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
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
    @android.annotation.Nullable
    android.view.View getVirtualChildAt(int p0) { return null; }
    int getVirtualChildCount() { return 0; }
    public float getWeightSum() { return 0.0f; }
    @android.view.RemotableViewMethod
    public void setWeightSum(float p0) {}
    protected void onMeasure(int p0, int p1) {}
    protected boolean hasDividerBeforeChildAt(int p0) { return false; }
    void measureVertical(int p0, int p1) {}
    void measureHorizontal(int p0, int p1) {}
    int getChildrenSkipCount(android.view.View p0, int p1) { return 0; }
    int measureNullChild(int p0) { return 0; }
    void measureChildBeforeLayout(android.view.View p0, int p1, int p2, int p3, int p4, int p5) {}
    int getLocationOffset(android.view.View p0) { return 0; }
    int getNextLocationOffset(android.view.View p0) { return 0; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    void layoutVertical(int p0, int p1, int p2, int p3) {}
    public void onRtlPropertiesChanged(int p0) {}
    void layoutHorizontal(int p0, int p1, int p2, int p3) {}
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
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OrientationMode {
    }
}
