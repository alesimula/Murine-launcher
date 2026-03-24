package android.widget;

class YearPickerView extends android.widget.ListView {
    private final android.widget.YearPickerView.YearAdapter mAdapter = null;
    private final int mViewSize = 0;
    private final int mChildSize = 0;
    private android.widget.YearPickerView.OnYearSelectedListener mOnYearSelectedListener;
    public YearPickerView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public YearPickerView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public YearPickerView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public void setOnYearSelectedListener(android.widget.YearPickerView.OnYearSelectedListener p0) {}
    public void setYear(int p0) {}
    public void setSelectionCentered(int p0) {}
    public void setRange(android.icu.util.Calendar p0, android.icu.util.Calendar p1) {}
    public int getFirstPositionOffset() { return 0; }
    public void onInitializeAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}

    private static class YearAdapter extends android.widget.BaseAdapter {
        private static final int ITEM_LAYOUT = 17367342;
        private static final int ITEM_TEXT_APPEARANCE = 16974767;
        private static final int ITEM_TEXT_ACTIVATED_APPEARANCE = 16974768;
        private final android.view.LayoutInflater mInflater = null;
        private int mActivatedYear;
        private int mMinYear;
        private int mCount;
        public YearAdapter(android.content.Context p0) { super(); }
        public void setRange(android.icu.util.Calendar p0, android.icu.util.Calendar p1) {}
        public boolean setSelection(int p0) { return false; }
        public int getCount() { return 0; }
        public java.lang.Integer getItem(int p0) { return null; }
        public long getItemId(int p0) { return 0L; }
        public int getPositionForYear(int p0) { return 0; }
        public int getYearForPosition(int p0) { return 0; }
        public boolean hasStableIds() { return false; }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
        public int getItemViewType(int p0) { return 0; }
        public int getViewTypeCount() { return 0; }
        public boolean isEmpty() { return false; }
        public boolean areAllItemsEnabled() { return false; }
        public boolean isEnabled(int p0) { return false; }
    }

    public static interface OnYearSelectedListener {
        public void onYearChanged(android.widget.YearPickerView p0, int p1);
    }
}
