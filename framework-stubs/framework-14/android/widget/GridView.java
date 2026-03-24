package android.widget;

@android.widget.RemoteViews.RemoteView
public class GridView extends android.widget.AbsListView {
    public static final int NO_STRETCH = 0;
    public static final int STRETCH_SPACING = 1;
    public static final int STRETCH_COLUMN_WIDTH = 2;
    public static final int STRETCH_SPACING_UNIFORM = 3;
    public static final int AUTO_FIT = -1;
    public GridView(android.content.Context p0) { super((android.content.Context)null); }
    public GridView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public GridView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public GridView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public android.widget.ListAdapter getAdapter() { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setRemoteViewsAdapterAsync")
    public void setRemoteViewsAdapter(android.content.Intent p0) {}
    public void setAdapter(android.widget.ListAdapter p0) {}
    int lookForSelectablePosition(int p0, boolean p1) { return 0; }
    void fillGap(boolean p0) {}
    int findMotionRow(int p0) { return 0; }
    @android.view.RemotableViewMethod
    public void smoothScrollToPosition(int p0) {}
    @android.view.RemotableViewMethod
    public void smoothScrollByOffset(int p0) {}
    protected void onMeasure(int p0, int p1) {}
    protected void attachLayoutAnimationParameters(android.view.View p0, android.view.ViewGroup.LayoutParams p1, int p2, int p3) {}
    protected void layoutChildren() {}
    public void setSelection(int p0) {}
    void setSelectionInt(int p0) {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    boolean pageScroll(int p0) { return false; }
    boolean fullScroll(int p0) { return false; }
    boolean arrowScroll(int p0) { return false; }
    boolean sequenceScroll(int p0) { return false; }
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    @android.view.RemotableViewMethod
    public void setGravity(int p0) {}
    public int getGravity() { return 0; }
    @android.view.RemotableViewMethod
    public void setHorizontalSpacing(int p0) {}
    public int getHorizontalSpacing() { return 0; }
    public int getRequestedHorizontalSpacing() { return 0; }
    @android.view.RemotableViewMethod
    public void setVerticalSpacing(int p0) {}
    public int getVerticalSpacing() { return 0; }
    @android.view.RemotableViewMethod
    public void setStretchMode(int p0) {}
    public int getStretchMode() { return 0; }
    @android.view.RemotableViewMethod
    public void setColumnWidth(int p0) {}
    public int getColumnWidth() { return 0; }
    public int getRequestedColumnWidth() { return 0; }
    @android.view.RemotableViewMethod
    public void setNumColumns(int p0) {}
    @android.view.ViewDebug.ExportedProperty
    public int getNumColumns() { return 0; }
    protected int computeVerticalScrollExtent() { return 0; }
    protected int computeVerticalScrollOffset() { return 0; }
    protected int computeVerticalScrollRange() { return 0; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    public void onInitializeAccessibilityNodeInfoForItem(android.view.View p0, int p1, android.view.accessibility.AccessibilityNodeInfo p2) {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StretchMode {
    }
}
