package com.android.internal.app;

public class AlertController {
    public static final int MICRO = 1;
    protected final android.view.Window mWindow = null;
    protected java.lang.CharSequence mMessage;
    protected android.widget.ListView mListView;
    protected android.widget.ScrollView mScrollView;
    protected android.widget.TextView mMessageView;
    public static final com.android.internal.app.AlertController create(android.content.Context p0, android.content.DialogInterface p1, android.view.Window p2) { return null; }
    protected AlertController(android.content.Context p0, android.content.DialogInterface p1, android.view.Window p2) {}
    static boolean canTextInput(android.view.View p0) { return false; }
    public void installContent(com.android.internal.app.AlertController.AlertParams p0) {}
    public void installContent() {}
    public void setTitle(java.lang.CharSequence p0) {}
    public void setCustomTitle(android.view.View p0) {}
    public void setMessage(java.lang.CharSequence p0) {}
    public void setMessageMovementMethod(android.text.method.MovementMethod p0) {}
    public void setMessageHyphenationFrequency(int p0) {}
    public void setView(int p0) {}
    public void setView(android.view.View p0) {}
    public void setView(android.view.View p0, int p1, int p2, int p3, int p4) {}
    public void setButtonPanelLayoutHint(int p0) {}
    public void setButton(int p0, java.lang.CharSequence p1, android.content.DialogInterface.OnClickListener p2, android.os.Message p3) {}
    public void setIcon(int p0) {}
    public void setIcon(android.graphics.drawable.Drawable p0) {}
    public int getIconAttributeResId(int p0) { return 0; }
    public void setInverseBackgroundForced(boolean p0) {}
    public android.widget.ListView getListView() { return null; }
    public android.widget.Button getButton(int p0) { return null; }
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    protected void setupTitle(android.view.ViewGroup p0) {}
    protected void setupContent(android.view.ViewGroup p0) {}
    protected void setupButtons(android.view.ViewGroup p0) {}

    public static class AlertParams {
        public final android.content.Context mContext = null;
        public final android.view.LayoutInflater mInflater = null;
        public int mIconId;
        public android.graphics.drawable.Drawable mIcon;
        public int mIconAttrId;
        public java.lang.CharSequence mTitle;
        public android.view.View mCustomTitleView;
        public java.lang.CharSequence mMessage;
        public java.lang.CharSequence mPositiveButtonText;
        public android.content.DialogInterface.OnClickListener mPositiveButtonListener;
        public java.lang.CharSequence mNegativeButtonText;
        public android.content.DialogInterface.OnClickListener mNegativeButtonListener;
        public java.lang.CharSequence mNeutralButtonText;
        public android.content.DialogInterface.OnClickListener mNeutralButtonListener;
        public boolean mCancelable;
        public android.content.DialogInterface.OnCancelListener mOnCancelListener;
        public android.content.DialogInterface.OnDismissListener mOnDismissListener;
        public android.content.DialogInterface.OnKeyListener mOnKeyListener;
        public java.lang.CharSequence[] mItems;
        public android.widget.ListAdapter mAdapter;
        public android.content.DialogInterface.OnClickListener mOnClickListener;
        public int mViewLayoutResId;
        public android.view.View mView;
        public int mViewSpacingLeft;
        public int mViewSpacingTop;
        public int mViewSpacingRight;
        public int mViewSpacingBottom;
        public boolean mViewSpacingSpecified;
        public boolean[] mCheckedItems;
        public boolean mIsMultiChoice;
        public boolean mIsSingleChoice;
        public int mCheckedItem;
        public android.content.DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
        public android.database.Cursor mCursor;
        public java.lang.String mLabelColumn;
        public java.lang.String mIsCheckedColumn;
        public boolean mForceInverseBackground;
        public android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener;
        public com.android.internal.app.AlertController.AlertParams.OnPrepareListViewListener mOnPrepareListViewListener;
        public boolean mRecycleOnMeasure;
        public AlertParams(android.content.Context p0) {}
        public void apply(com.android.internal.app.AlertController p0) {}

        public static interface OnPrepareListViewListener {
            public void onPrepareListView(android.widget.ListView p0);
        }
    }

    private static final class ButtonHandler extends android.os.Handler {
        public ButtonHandler(android.content.DialogInterface p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private static class CheckedItemAdapter extends android.widget.ArrayAdapter<java.lang.CharSequence> {
        public CheckedItemAdapter(android.content.Context p0, int p1, int p2, java.lang.CharSequence[] p3) { super((android.content.Context)null, 0); }
        public boolean hasStableIds() { return false; }
        public long getItemId(int p0) { return 0L; }
    }

    public static class RecycleListView extends android.widget.ListView {
        boolean mRecycleOnMeasure;
        public RecycleListView(android.content.Context p0) { super((android.content.Context)null); }
        public RecycleListView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
        public void setHasDecor(boolean p0, boolean p1) {}
        protected boolean recycleOnMeasure() { return false; }
    }
}
