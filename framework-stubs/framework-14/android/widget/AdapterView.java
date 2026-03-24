package android.widget;

public abstract class AdapterView<T extends android.widget.Adapter> extends android.view.ViewGroup {
    public static final int ITEM_VIEW_TYPE_IGNORE = -1;
    public static final int ITEM_VIEW_TYPE_HEADER_OR_FOOTER = -2;
    @android.view.ViewDebug.ExportedProperty(category="scrolling")
    int mFirstPosition;
    int mSpecificTop;
    int mSyncPosition;
    long mSyncRowId;
    long mSyncHeight;
    boolean mNeedSync;
    int mSyncMode;
    static final int SYNC_SELECTED_POSITION = 0;
    static final int SYNC_FIRST_POSITION = 1;
    static final int SYNC_MAX_DURATION_MILLIS = 100;
    boolean mInLayout;
    android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    android.widget.AdapterView.OnItemClickListener mOnItemClickListener;
    android.widget.AdapterView.OnItemLongClickListener mOnItemLongClickListener;
    boolean mDataChanged;
    @android.view.ViewDebug.ExportedProperty(category="list")
    int mNextSelectedPosition;
    long mNextSelectedRowId;
    @android.view.ViewDebug.ExportedProperty(category="list")
    int mSelectedPosition;
    long mSelectedRowId;
    @android.view.ViewDebug.ExportedProperty(category="list")
    int mItemCount;
    int mOldItemCount;
    public static final int INVALID_POSITION = -1;
    public static final long INVALID_ROW_ID = -9223372036854775808L;
    int mOldSelectedPosition;
    long mOldSelectedRowId;
    boolean mBlockLayoutRequests;
    public AdapterView(android.content.Context p0) { super((android.content.Context)null); }
    public AdapterView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public AdapterView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public AdapterView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener p0) {}
    public final android.widget.AdapterView.OnItemClickListener getOnItemClickListener() { return null; }
    public boolean performItemClick(android.view.View p0, int p1, long p2) { return false; }
    public void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener p0) {}
    public final android.widget.AdapterView.OnItemLongClickListener getOnItemLongClickListener() { return null; }
    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener p0) {}
    public final android.widget.AdapterView.OnItemSelectedListener getOnItemSelectedListener() { return null; }
    public abstract T getAdapter();
    public abstract void setAdapter(T p0);
    public void addView(android.view.View p0) {}
    public void addView(android.view.View p0, int p1) {}
    public void addView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void addView(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) {}
    public void removeView(android.view.View p0) {}
    public void removeViewAt(int p0) {}
    public void removeAllViews() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    @android.view.ViewDebug.CapturedViewProperty
    public int getSelectedItemPosition() { return 0; }
    @android.view.ViewDebug.CapturedViewProperty
    public long getSelectedItemId() { return 0L; }
    public abstract android.view.View getSelectedView();
    public java.lang.Object getSelectedItem() { return null; }
    @android.view.ViewDebug.CapturedViewProperty
    public int getCount() { return 0; }
    public int getPositionForView(android.view.View p0) { return 0; }
    public int getFirstVisiblePosition() { return 0; }
    public int getLastVisiblePosition() { return 0; }
    public abstract void setSelection(int p0);
    @android.view.RemotableViewMethod
    public void setEmptyView(android.view.View p0) {}
    public android.view.View getEmptyView() { return null; }
    boolean isInFilterMode() { return false; }
    public void setFocusable(int p0) {}
    public void setFocusableInTouchMode(boolean p0) {}
    void checkFocus() {}
    public java.lang.Object getItemAtPosition(int p0) { return null; }
    public long getItemIdAtPosition(int p0) { return 0L; }
    public void setOnClickListener(android.view.View.OnClickListener p0) {}
    protected void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    protected void onDetachedFromWindow() {}
    void selectionChanged() {}
    public boolean dispatchPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public boolean onRequestSendAccessibilityEventInternal(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) { return false; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public void onInitializeAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    protected boolean canAnimate() { return false; }
    void handleDataChanged() {}
    void checkSelectionChanged() {}
    int findSyncPosition() { return 0; }
    int lookForSelectablePosition(int p0, boolean p1) { return 0; }
    void setSelectedPositionInt(int p0) {}
    void setNextSelectedPositionInt(int p0) {}
    void rememberSyncState() {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    public void onProvideAutofillStructure(android.view.ViewStructure p0, int p1) {}
    protected void onProvideStructure(android.view.ViewStructure p0, int p1, int p2) {}

    public static class AdapterContextMenuInfo implements android.view.ContextMenu.ContextMenuInfo {
        public android.view.View targetView;
        public int position;
        public long id;
        public AdapterContextMenuInfo(android.view.View p0, int p1, long p2) {}
    }

    public static interface OnItemSelectedListener {
        public void onItemSelected(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3);
        public void onNothingSelected(android.widget.AdapterView<?> p0);
    }

    public static interface OnItemLongClickListener {
        public boolean onItemLongClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3);
    }

    public static interface OnItemClickListener {
        public void onItemClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3);
    }

    class AdapterDataSetObserver extends android.database.DataSetObserver {
        AdapterDataSetObserver(android.widget.AdapterView p0) { super(); }
        public void onChanged() {}
        public void onInvalidated() {}
        public void clearSavedState() {}
    }

    private class SelectionNotifier implements java.lang.Runnable {
        public void run() {}
    }
}
