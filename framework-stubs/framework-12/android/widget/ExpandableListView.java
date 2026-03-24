package android.widget;

public class ExpandableListView extends android.widget.ListView {
    public static final int PACKED_POSITION_TYPE_GROUP = 0;
    public static final int PACKED_POSITION_TYPE_CHILD = 1;
    public static final int PACKED_POSITION_TYPE_NULL = 2;
    public static final long PACKED_POSITION_VALUE_NULL = 4294967295L;
    private static final long PACKED_POSITION_MASK_CHILD = 4294967295L;
    private static final long PACKED_POSITION_MASK_GROUP = 9223372032559808512L;
    private static final long PACKED_POSITION_MASK_TYPE = -9223372036854775808L;
    private static final long PACKED_POSITION_SHIFT_GROUP = 32L;
    private static final long PACKED_POSITION_SHIFT_TYPE = 63L;
    private static final long PACKED_POSITION_INT_MASK_CHILD = -1L;
    private static final long PACKED_POSITION_INT_MASK_GROUP = 2147483647L;
    private android.widget.ExpandableListConnector mConnector;
    private android.widget.ExpandableListAdapter mAdapter;
    private int mIndicatorLeft;
    private int mIndicatorRight;
    private int mIndicatorStart;
    private int mIndicatorEnd;
    private int mChildIndicatorLeft;
    private int mChildIndicatorRight;
    private int mChildIndicatorStart;
    private int mChildIndicatorEnd;
    public static final int CHILD_INDICATOR_INHERIT = -1;
    private static final int INDICATOR_UNDEFINED = -2;
    private android.graphics.drawable.Drawable mGroupIndicator;
    private android.graphics.drawable.Drawable mChildIndicator;
    private static final int[] EMPTY_STATE_SET = null;
    private static final int[] GROUP_EXPANDED_STATE_SET = null;
    private static final int[] GROUP_EMPTY_STATE_SET = null;
    private static final int[] GROUP_EXPANDED_EMPTY_STATE_SET = null;
    private static final int[][] GROUP_STATE_SETS = null;
    private static final int[] CHILD_LAST_STATE_SET = null;
    private android.graphics.drawable.Drawable mChildDivider;
    private final android.graphics.Rect mIndicatorRect = null;
    private android.widget.ExpandableListView.OnGroupCollapseListener mOnGroupCollapseListener;
    private android.widget.ExpandableListView.OnGroupExpandListener mOnGroupExpandListener;
    private android.widget.ExpandableListView.OnGroupClickListener mOnGroupClickListener;
    private android.widget.ExpandableListView.OnChildClickListener mOnChildClickListener;
    public ExpandableListView(android.content.Context p0) { super((android.content.Context)null); }
    public ExpandableListView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ExpandableListView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ExpandableListView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private boolean isRtlCompatibilityMode() { return false; }
    private boolean hasRtlSupport() { return false; }
    public void onRtlPropertiesChanged(int p0) {}
    private void resolveIndicator() {}
    private void resolveChildIndicator() {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    private android.graphics.drawable.Drawable getIndicator(android.widget.ExpandableListConnector.PositionMetadata p0) { return null; }
    public void setChildDivider(android.graphics.drawable.Drawable p0) {}
    void drawDivider(android.graphics.Canvas p0, android.graphics.Rect p1, int p2) {}
    public void setAdapter(android.widget.ListAdapter p0) {}
    public android.widget.ListAdapter getAdapter() { return null; }
    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener p0) {}
    public void setAdapter(android.widget.ExpandableListAdapter p0) {}
    public android.widget.ExpandableListAdapter getExpandableListAdapter() { return null; }
    private boolean isHeaderOrFooterPosition(int p0) { return false; }
    private int getFlatPositionForConnector(int p0) { return 0; }
    private int getAbsoluteFlatPosition(int p0) { return 0; }
    public boolean performItemClick(android.view.View p0, int p1, long p2) { return false; }
    boolean handleItemClick(android.view.View p0, int p1, long p2) { return false; }
    public boolean expandGroup(int p0) { return false; }
    public boolean expandGroup(int p0, boolean p1) { return false; }
    public boolean collapseGroup(int p0) { return false; }
    public void setOnGroupCollapseListener(android.widget.ExpandableListView.OnGroupCollapseListener p0) {}
    public void setOnGroupExpandListener(android.widget.ExpandableListView.OnGroupExpandListener p0) {}
    public void setOnGroupClickListener(android.widget.ExpandableListView.OnGroupClickListener p0) {}
    public void setOnChildClickListener(android.widget.ExpandableListView.OnChildClickListener p0) {}
    public long getExpandableListPosition(int p0) { return 0L; }
    public int getFlatListPosition(long p0) { return 0; }
    public long getSelectedPosition() { return 0L; }
    public long getSelectedId() { return 0L; }
    public void setSelectedGroup(int p0) {}
    public boolean setSelectedChild(int p0, int p1, boolean p2) { return false; }
    public boolean isGroupExpanded(int p0) { return false; }
    public static int getPackedPositionType(long p0) { return 0; }
    public static int getPackedPositionGroup(long p0) { return 0; }
    public static int getPackedPositionChild(long p0) { return 0; }
    public static long getPackedPositionForChild(int p0, int p1) { return 0L; }
    public static long getPackedPositionForGroup(int p0) { return 0L; }
    android.view.ContextMenu.ContextMenuInfo createContextMenuInfo(android.view.View p0, int p1, long p2) { return null; }
    private long getChildOrGroupId(android.widget.ExpandableListPosition p0) { return 0L; }
    public void setChildIndicator(android.graphics.drawable.Drawable p0) {}
    public void setChildIndicatorBounds(int p0, int p1) {}
    public void setChildIndicatorBoundsRelative(int p0, int p1) {}
    public void setGroupIndicator(android.graphics.drawable.Drawable p0) {}
    public void setIndicatorBounds(int p0, int p1) {}
    public void setIndicatorBoundsRelative(int p0, int p1) {}
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }

    public static class ExpandableListContextMenuInfo implements android.view.ContextMenu.ContextMenuInfo {
        public android.view.View targetView;
        public long packedPosition;
        public long id;
        public ExpandableListContextMenuInfo(android.view.View p0, long p1, long p2) {}
    }

    public static interface OnChildClickListener {
        public boolean onChildClick(android.widget.ExpandableListView p0, android.view.View p1, int p2, int p3, long p4);
    }

    public static interface OnGroupClickListener {
        public boolean onGroupClick(android.widget.ExpandableListView p0, android.view.View p1, int p2, long p3);
    }

    public static interface OnGroupCollapseListener {
        public void onGroupCollapse(int p0);
    }

    public static interface OnGroupExpandListener {
        public void onGroupExpand(int p0);
    }

    static class SavedState extends android.view.View.BaseSavedState {
        java.util.ArrayList<android.widget.ExpandableListConnector.GroupMetadata> expandedGroupMetadataList;
        public static final android.os.Parcelable.Creator<android.widget.ExpandableListView.SavedState> CREATOR = null;
        SavedState(android.os.Parcelable p0, java.util.ArrayList<android.widget.ExpandableListConnector.GroupMetadata> p1) { super((android.os.Parcel)null); }
        private SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
