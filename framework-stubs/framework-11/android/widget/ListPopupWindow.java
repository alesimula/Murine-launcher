package android.widget;

public class ListPopupWindow implements com.android.internal.view.menu.ShowableListMenu {
    private static final java.lang.String TAG = "ListPopupWindow";
    private static final boolean DEBUG = false;
    private static final int EXPAND_LIST_TIMEOUT = 250;
    private android.content.Context mContext;
    private android.widget.ListAdapter mAdapter;
    private android.widget.DropDownListView mDropDownList;
    private int mDropDownHeight;
    private int mDropDownWidth;
    private int mDropDownHorizontalOffset;
    private int mDropDownVerticalOffset;
    private int mDropDownWindowLayoutType;
    private boolean mDropDownVerticalOffsetSet;
    private boolean mIsAnimatedFromAnchor;
    private boolean mOverlapAnchor;
    private boolean mOverlapAnchorSet;
    private int mDropDownGravity;
    private boolean mDropDownAlwaysVisible;
    private boolean mForceIgnoreOutsideTouch;
    int mListItemExpandMaximum;
    private android.view.View mPromptView;
    private int mPromptPosition;
    private android.database.DataSetObserver mObserver;
    private android.view.View mDropDownAnchorView;
    private android.graphics.drawable.Drawable mDropDownListHighlight;
    private android.widget.AdapterView.OnItemClickListener mItemClickListener;
    private android.widget.AdapterView.OnItemSelectedListener mItemSelectedListener;
    private final android.widget.ListPopupWindow.ResizePopupRunnable mResizePopupRunnable = null;
    private final android.widget.ListPopupWindow.PopupTouchInterceptor mTouchInterceptor = null;
    private final android.widget.ListPopupWindow.PopupScrollListener mScrollListener = null;
    private final android.widget.ListPopupWindow.ListSelectorHider mHideSelector = null;
    private java.lang.Runnable mShowDropDownRunnable;
    private final android.os.Handler mHandler = null;
    private final android.graphics.Rect mTempRect = null;
    private android.graphics.Rect mEpicenterBounds;
    private boolean mModal;
    android.widget.PopupWindow mPopup;
    public static final int POSITION_PROMPT_ABOVE = 0;
    public static final int POSITION_PROMPT_BELOW = 1;
    public static final int MATCH_PARENT = -1;
    public static final int WRAP_CONTENT = -2;
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    public ListPopupWindow(android.content.Context p0) {}
    public ListPopupWindow(android.content.Context p0, android.util.AttributeSet p1) {}
    public ListPopupWindow(android.content.Context p0, android.util.AttributeSet p1, int p2) {}
    public ListPopupWindow(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) {}
    public void setAdapter(android.widget.ListAdapter p0) {}
    public void setPromptPosition(int p0) {}
    public int getPromptPosition() { return 0; }
    public void setModal(boolean p0) {}
    public boolean isModal() { return false; }
    public void setForceIgnoreOutsideTouch(boolean p0) {}
    public void setDropDownAlwaysVisible(boolean p0) {}
    public boolean isDropDownAlwaysVisible() { return false; }
    public void setSoftInputMode(int p0) {}
    public int getSoftInputMode() { return 0; }
    public void setListSelector(android.graphics.drawable.Drawable p0) {}
    public android.graphics.drawable.Drawable getBackground() { return null; }
    public void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public void setAnimationStyle(int p0) {}
    public int getAnimationStyle() { return 0; }
    public android.view.View getAnchorView() { return null; }
    public void setAnchorView(android.view.View p0) {}
    public int getHorizontalOffset() { return 0; }
    public void setHorizontalOffset(int p0) {}
    public int getVerticalOffset() { return 0; }
    public void setVerticalOffset(int p0) {}
    public void setEpicenterBounds(android.graphics.Rect p0) {}
    public android.graphics.Rect getEpicenterBounds() { return null; }
    public void setDropDownGravity(int p0) {}
    public int getWidth() { return 0; }
    public void setWidth(int p0) {}
    public void setContentWidth(int p0) {}
    public int getHeight() { return 0; }
    public void setHeight(int p0) {}
    public void setWindowLayoutType(int p0) {}
    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener p0) {}
    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener p0) {}
    public void setPromptView(android.view.View p0) {}
    public void postShow() {}
    public void show() {}
    public void dismiss() {}
    public void dismissImmediate() {}
    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener p0) {}
    private void removePromptView() {}
    public void setInputMethodMode(int p0) {}
    public int getInputMethodMode() { return 0; }
    public void setSelection(int p0) {}
    public void clearListSelection() {}
    public boolean isShowing() { return false; }
    public boolean isInputMethodNotNeeded() { return false; }
    public boolean performItemClick(int p0) { return false; }
    public java.lang.Object getSelectedItem() { return null; }
    public int getSelectedItemPosition() { return 0; }
    public long getSelectedItemId() { return 0L; }
    public android.view.View getSelectedView() { return null; }
    public android.widget.ListView getListView() { return null; }
    android.widget.DropDownListView createDropDownListView(android.content.Context p0, boolean p1) { return null; }
    void setListItemExpandMax(int p0) {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyPreIme(int p0, android.view.KeyEvent p1) { return false; }
    public android.view.View.OnTouchListener createDragToOpenListener(android.view.View p0) { return null; }
    private int buildDropDown() { return 0; }
    public void setOverlapAnchor(boolean p0) {}

    private class ListSelectorHider implements java.lang.Runnable {
        private ListSelectorHider(android.widget.ListPopupWindow p0) {}
        public void run() {}
    }

    private class PopupDataSetObserver extends android.database.DataSetObserver {
        private PopupDataSetObserver(android.widget.ListPopupWindow p0) { super(); }
        public void onChanged() {}
        public void onInvalidated() {}
    }

    private class PopupScrollListener implements android.widget.AbsListView.OnScrollListener {
        private PopupScrollListener(android.widget.ListPopupWindow p0) {}
        public void onScroll(android.widget.AbsListView p0, int p1, int p2, int p3) {}
        public void onScrollStateChanged(android.widget.AbsListView p0, int p1) {}
    }

    private class PopupTouchInterceptor implements android.view.View.OnTouchListener {
        private PopupTouchInterceptor(android.widget.ListPopupWindow p0) {}
        public boolean onTouch(android.view.View p0, android.view.MotionEvent p1) { return false; }
    }

    private class ResizePopupRunnable implements java.lang.Runnable {
        private ResizePopupRunnable(android.widget.ListPopupWindow p0) {}
        public void run() {}
    }
}
