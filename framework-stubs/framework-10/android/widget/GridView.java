package android.widget;

@android.widget.RemoteViews.RemoteView
public class GridView extends android.widget.AbsListView {
    public static final int NO_STRETCH = 0;
    public static final int STRETCH_SPACING = 1;
    public static final int STRETCH_COLUMN_WIDTH = 2;
    public static final int STRETCH_SPACING_UNIFORM = 3;
    public static final int AUTO_FIT = -1;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=117521080L)
    private int mNumColumns;
    @android.annotation.UnsupportedAppUsage
    private int mHorizontalSpacing;
    @android.annotation.UnsupportedAppUsage
    private int mRequestedHorizontalSpacing;
    @android.annotation.UnsupportedAppUsage
    private int mVerticalSpacing;
    private int mStretchMode;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=117521079L)
    private int mColumnWidth;
    @android.annotation.UnsupportedAppUsage
    private int mRequestedColumnWidth;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=123769395L)
    private int mRequestedNumColumns;
    private android.view.View mReferenceView;
    private android.view.View mReferenceViewInSelectedRow;
    private int mGravity;
    private final android.graphics.Rect mTempRect = null;
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
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private android.view.View fillDown(int p0, int p1) { return null; }
    private android.view.View makeRow(int p0, int p1, boolean p2) { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private android.view.View fillUp(int p0, int p1) { return null; }
    private android.view.View fillFromTop(int p0) { return null; }
    private android.view.View fillFromBottom(int p0, int p1) { return null; }
    private android.view.View fillSelection(int p0, int p1) { return null; }
    private void pinToTop(int p0) {}
    private void pinToBottom(int p0) {}
    int findMotionRow(int p0) { return 0; }
    private android.view.View fillSpecific(int p0, int p1) { return null; }
    private void correctTooHigh(int p0, int p1, int p2) {}
    private void correctTooLow(int p0, int p1, int p2) {}
    private android.view.View fillFromSelection(int p0, int p1, int p2) { return null; }
    private int getBottomSelectionPixel(int p0, int p1, int p2, int p3) { return 0; }
    private int getTopSelectionPixel(int p0, int p1, int p2) { return 0; }
    private void adjustForBottomFadingEdge(android.view.View p0, int p1, int p2) {}
    private void adjustForTopFadingEdge(android.view.View p0, int p1, int p2) {}
    @android.view.RemotableViewMethod
    public void smoothScrollToPosition(int p0) {}
    @android.view.RemotableViewMethod
    public void smoothScrollByOffset(int p0) {}
    private android.view.View moveSelection(int p0, int p1, int p2) { return null; }
    @android.annotation.UnsupportedAppUsage
    private boolean determineColumns(int p0) { return false; }
    protected void onMeasure(int p0, int p1) {}
    protected void attachLayoutAnimationParameters(android.view.View p0, android.view.ViewGroup.LayoutParams p1, int p2, int p3) {}
    protected void layoutChildren() {}
    private android.view.View makeAndAddView(int p0, int p1, boolean p2, int p3, boolean p4, int p5) { return null; }
    private void setupChild(android.view.View p0, int p1, int p2, boolean p3, int p4, boolean p5, boolean p6, int p7) {}
    public void setSelection(int p0) {}
    void setSelectionInt(int p0) {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    private boolean commonKey(int p0, int p1, android.view.KeyEvent p2) { return false; }
    boolean pageScroll(int p0) { return false; }
    boolean fullScroll(int p0) { return false; }
    boolean arrowScroll(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    boolean sequenceScroll(int p0) { return false; }
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    private boolean isCandidateSelection(int p0, int p1) { return false; }
    public void setGravity(int p0) {}
    public int getGravity() { return 0; }
    public void setHorizontalSpacing(int p0) {}
    public int getHorizontalSpacing() { return 0; }
    public int getRequestedHorizontalSpacing() { return 0; }
    public void setVerticalSpacing(int p0) {}
    public int getVerticalSpacing() { return 0; }
    public void setStretchMode(int p0) {}
    public int getStretchMode() { return 0; }
    public void setColumnWidth(int p0) {}
    public int getColumnWidth() { return 0; }
    public int getRequestedColumnWidth() { return 0; }
    public void setNumColumns(int p0) {}
    @android.view.ViewDebug.ExportedProperty
    public int getNumColumns() { return 0; }
    private void adjustViewsUpOrDown() {}
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

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.GridView> {
        private boolean mPropertiesMapped;
        private int mColumnWidthId;
        private int mGravityId;
        private int mHorizontalSpacingId;
        private int mNumColumnsId;
        private int mStretchModeId;
        private int mVerticalSpacingId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.GridView p0, android.view.inspector.PropertyReader p1) {}
    }
}
