package android.widget;

public class TableRow extends android.widget.LinearLayout {
    public TableRow(android.content.Context p0) { super((android.content.Context)null); }
    public TableRow(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener p0) {}
    void setColumnCollapsed(int p0, boolean p1) {}
    protected void onMeasure(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public android.view.View getVirtualChildAt(int p0) { return null; }
    public int getVirtualChildCount() { return 0; }
    int measureNullChild(int p0) { return 0; }
    void measureChildBeforeLayout(android.view.View p0, int p1, int p2, int p3, int p4, int p5) {}
    int getChildrenSkipCount(android.view.View p0, int p1) { return 0; }
    int getLocationOffset(android.view.View p0) { return 0; }
    int getNextLocationOffset(android.view.View p0) { return 0; }
    int[] getColumnsWidths(int p0, int p1) { return null; }
    void setColumnsWidthConstraints(int[] p0) {}
    public android.widget.TableRow.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() { return null; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    protected android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }

    private class ChildrenTracker implements android.view.ViewGroup.OnHierarchyChangeListener {
        public void onChildViewAdded(android.view.View p0, android.view.View p1) {}
        public void onChildViewRemoved(android.view.View p0, android.view.View p1) {}
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        @android.view.ViewDebug.ExportedProperty(category="layout")
        public int column;
        @android.view.ViewDebug.ExportedProperty(category="layout")
        public int span;
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1, float p2) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams() { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        protected void setBaseAttributes(android.content.res.TypedArray p0, int p1, int p2) {}
        protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    }
}
