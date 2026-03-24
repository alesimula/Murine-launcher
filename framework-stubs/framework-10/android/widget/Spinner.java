package android.widget;

public class Spinner extends android.widget.AbsSpinner implements android.content.DialogInterface.OnClickListener {
    private static final java.lang.String TAG = "Spinner";
    private static final int MAX_ITEMS_MEASURED = 15;
    public static final int MODE_DIALOG = 0;
    public static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private final android.graphics.Rect mTempRect = null;
    private final android.content.Context mPopupContext = null;
    @android.annotation.UnsupportedAppUsage
    private android.widget.ForwardingListener mForwardingListener;
    private android.widget.SpinnerAdapter mTempAdapter;
    @android.annotation.UnsupportedAppUsage
    private android.widget.Spinner.SpinnerPopup mPopup;
    int mDropDownWidth;
    private int mGravity;
    private boolean mDisableChildrenWhenDisabled;
    public Spinner(android.content.Context p0) { super((android.content.Context)null); }
    public Spinner(android.content.Context p0, int p1) { super((android.content.Context)null); }
    public Spinner(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public Spinner(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public Spinner(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public Spinner(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3, int p4) { super((android.content.Context)null); }
    public Spinner(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3, int p4, android.content.res.Resources.Theme p5) { super((android.content.Context)null); }
    public android.content.Context getPopupContext() { return null; }
    public void setPopupBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public void setPopupBackgroundResource(int p0) {}
    public android.graphics.drawable.Drawable getPopupBackground() { return null; }
    public boolean isPopupShowing() { return false; }
    public void setDropDownVerticalOffset(int p0) {}
    public int getDropDownVerticalOffset() { return 0; }
    public void setDropDownHorizontalOffset(int p0) {}
    public int getDropDownHorizontalOffset() { return 0; }
    public void setDropDownWidth(int p0) {}
    public int getDropDownWidth() { return 0; }
    public void setEnabled(boolean p0) {}
    public void setGravity(int p0) {}
    public int getGravity() { return 0; }
    public void setAdapter(android.widget.SpinnerAdapter p0) {}
    public int getBaseline() { return 0; }
    protected void onDetachedFromWindow() {}
    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setOnItemClickListenerInt(android.widget.AdapterView.OnItemClickListener p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    protected void onMeasure(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    void layout(int p0, boolean p1) {}
    private android.view.View makeView(int p0, boolean p1) { return null; }
    private void setUpChild(android.view.View p0, boolean p1) {}
    public boolean performClick() { return false; }
    public void onClick(android.content.DialogInterface p0, int p1) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public void setPrompt(java.lang.CharSequence p0) {}
    public void setPromptId(int p0) {}
    public java.lang.CharSequence getPrompt() { return null; }
    int measureContentWidth(android.widget.SpinnerAdapter p0, android.graphics.drawable.Drawable p1) { return 0; }
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent p0, int p1) { return null; }

    private static interface SpinnerPopup {
        public void setAdapter(android.widget.ListAdapter p0);
        public void show(int p0, int p1);
        public void dismiss();
        @android.annotation.UnsupportedAppUsage
        public boolean isShowing();
        public void setPromptText(java.lang.CharSequence p0);
        public java.lang.CharSequence getHintText();
        public void setBackgroundDrawable(android.graphics.drawable.Drawable p0);
        public void setVerticalOffset(int p0);
        public void setHorizontalOffset(int p0);
        public android.graphics.drawable.Drawable getBackground();
        public int getVerticalOffset();
        public int getHorizontalOffset();
    }

    static class SavedState extends android.widget.AbsSpinner.SavedState {
        boolean showDropdown;
        public static final android.os.Parcelable.Creator<android.widget.Spinner.SavedState> CREATOR = null;
        SavedState(android.os.Parcelable p0) { super((android.os.Parcelable)null); }
        private SavedState(android.os.Parcel p0) { super((android.os.Parcelable)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private class DropdownPopup extends android.widget.ListPopupWindow implements android.widget.Spinner.SpinnerPopup {
        private java.lang.CharSequence mHintText;
        private android.widget.ListAdapter mAdapter;
        public DropdownPopup(android.widget.Spinner p0, android.content.Context p1, android.util.AttributeSet p2, int p3, int p4) { super((android.content.Context)null); }
        public void setAdapter(android.widget.ListAdapter p0) {}
        public java.lang.CharSequence getHintText() { return null; }
        public void setPromptText(java.lang.CharSequence p0) {}
        void computeContentWidth() {}
        public void show(int p0, int p1) {}
    }

    private static class DropDownAdapter implements android.widget.ListAdapter, android.widget.SpinnerAdapter {
        private android.widget.SpinnerAdapter mAdapter;
        private android.widget.ListAdapter mListAdapter;
        public DropDownAdapter(android.widget.SpinnerAdapter p0, android.content.res.Resources.Theme p1) {}
        public int getCount() { return 0; }
        public java.lang.Object getItem(int p0) { return null; }
        public long getItemId(int p0) { return 0L; }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
        public android.view.View getDropDownView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
        public boolean hasStableIds() { return false; }
        public void registerDataSetObserver(android.database.DataSetObserver p0) {}
        public void unregisterDataSetObserver(android.database.DataSetObserver p0) {}
        public boolean areAllItemsEnabled() { return false; }
        public boolean isEnabled(int p0) { return false; }
        public int getItemViewType(int p0) { return 0; }
        public int getViewTypeCount() { return 0; }
        public boolean isEmpty() { return false; }
    }

    private class DialogPopup implements android.widget.Spinner.SpinnerPopup, android.content.DialogInterface.OnClickListener {
        private android.app.AlertDialog mPopup;
        private android.widget.ListAdapter mListAdapter;
        private java.lang.CharSequence mPrompt;
        private DialogPopup(android.widget.Spinner p0) {}
        public void dismiss() {}
        @android.annotation.UnsupportedAppUsage
        public boolean isShowing() { return false; }
        public void setAdapter(android.widget.ListAdapter p0) {}
        public void setPromptText(java.lang.CharSequence p0) {}
        public java.lang.CharSequence getHintText() { return null; }
        public void show(int p0, int p1) {}
        public void onClick(android.content.DialogInterface p0, int p1) {}
        public void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
        public void setVerticalOffset(int p0) {}
        public void setHorizontalOffset(int p0) {}
        public android.graphics.drawable.Drawable getBackground() { return null; }
        public int getVerticalOffset() { return 0; }
        public int getHorizontalOffset() { return 0; }
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.Spinner> {
        private boolean mPropertiesMapped;
        private int mDropDownHorizontalOffsetId;
        private int mDropDownVerticalOffsetId;
        private int mDropDownWidthId;
        private int mGravityId;
        private int mPopupBackgroundId;
        private int mPromptId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.Spinner p0, android.view.inspector.PropertyReader p1) {}
    }
}
