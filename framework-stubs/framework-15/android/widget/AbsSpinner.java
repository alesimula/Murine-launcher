package android.widget;

public abstract class AbsSpinner extends android.widget.AdapterView<android.widget.SpinnerAdapter> {
    android.widget.SpinnerAdapter mAdapter;
    int mHeightMeasureSpec;
    int mWidthMeasureSpec;
    int mSelectionLeftPadding;
    int mSelectionTopPadding;
    int mSelectionRightPadding;
    int mSelectionBottomPadding;
    final android.graphics.Rect mSpinnerPadding = null;
    final android.widget.AbsSpinner.RecycleBin mRecycler = null;
    public AbsSpinner(android.content.Context p0) { super((android.content.Context)null); }
    public AbsSpinner(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public AbsSpinner(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public AbsSpinner(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public void setAdapter(android.widget.SpinnerAdapter p0) {}
    void resetList() {}
    protected void onMeasure(int p0, int p1) {}
    int getChildHeight(android.view.View p0) { return 0; }
    int getChildWidth(android.view.View p0) { return 0; }
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    void recycleAllViews() {}
    public void setSelection(int p0, boolean p1) {}
    public void setSelection(int p0) {}
    void setSelectionInt(int p0, boolean p1) {}
    abstract void layout(int p0, boolean p1);
    public android.view.View getSelectedView() { return null; }
    public void requestLayout() {}
    public android.widget.SpinnerAdapter getAdapter() { return null; }
    public int getCount() { return 0; }
    public int pointToPosition(int p0, int p1) { return 0; }
    protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void autofill(android.view.autofill.AutofillValue p0) {}
    public int getAutofillType() { return 0; }
    public android.view.autofill.AutofillValue getAutofillValue() { return null; }

    class RecycleBin {
        RecycleBin(android.widget.AbsSpinner p0) {}
        public void put(int p0, android.view.View p1) {}
        android.view.View get(int p0) { return null; }
        void clear() {}
    }

    static class SavedState extends android.view.View.BaseSavedState {
        long selectedId;
        int position;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.widget.AbsSpinner.SavedState> CREATOR = null;
        SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }
}
