package android.app;

@java.lang.Deprecated
public class FragmentBreadCrumbs extends android.view.ViewGroup implements android.app.FragmentManager.OnBackStackChangedListener {
    android.app.Activity mActivity;
    android.view.LayoutInflater mInflater;
    android.widget.LinearLayout mContainer;
    int mMaxVisible;
    android.app.BackStackRecord mTopEntry;
    android.app.BackStackRecord mParentEntry;
    private android.view.View.OnClickListener mParentClickListener;
    private android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener mOnBreadCrumbClickListener;
    private int mGravity;
    private int mLayoutResId;
    private int mTextColor;
    private static final int DEFAULT_GRAVITY = 8388627;
    private android.view.View.OnClickListener mOnClickListener;
    public FragmentBreadCrumbs(android.content.Context p0) { super((android.content.Context)null); }
    public FragmentBreadCrumbs(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public FragmentBreadCrumbs(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public FragmentBreadCrumbs(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public void setActivity(android.app.Activity p0) {}
    public void setMaxVisible(int p0) {}
    public void setParentTitle(java.lang.CharSequence p0, java.lang.CharSequence p1, android.view.View.OnClickListener p2) {}
    public void setOnBreadCrumbClickListener(android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener p0) {}
    private android.app.BackStackRecord createBackStackEntry(java.lang.CharSequence p0, java.lang.CharSequence p1) { return null; }
    public void setTitle(java.lang.CharSequence p0, java.lang.CharSequence p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public void onBackStackChanged() {}
    private int getPreEntryCount() { return 0; }
    private android.app.FragmentManager.BackStackEntry getPreEntry(int p0) { return null; }
    void updateCrumbs() {}

    @java.lang.Deprecated
    public static interface OnBreadCrumbClickListener {
        public boolean onBreadCrumbClick(android.app.FragmentManager.BackStackEntry p0, int p1);
    }
}
