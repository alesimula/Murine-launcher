package android.widget;

public class RadioGroup extends android.widget.LinearLayout {
    private static final java.lang.String LOG_TAG = null;
    private int mCheckedId;
    private android.widget.CompoundButton.OnCheckedChangeListener mChildOnCheckedChangeListener;
    private boolean mProtectFromCheckedChange;
    private android.widget.RadioGroup.OnCheckedChangeListener mOnCheckedChangeListener;
    private android.widget.RadioGroup.PassThroughHierarchyChangeListener mPassThroughListener;
    private int mInitialCheckedId;
    public RadioGroup(android.content.Context p0) { super((android.content.Context)null); }
    public RadioGroup(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private void init() {}
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener p0) {}
    protected void onFinishInflate() {}
    public void addView(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) {}
    public void check(int p0) {}
    private void setCheckedId(int p0) {}
    private void setCheckedStateForView(int p0, boolean p1) {}
    public int getCheckedRadioButtonId() { return 0; }
    public void clearCheck() {}
    public void setOnCheckedChangeListener(android.widget.RadioGroup.OnCheckedChangeListener p0) {}
    public android.widget.RadioGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    protected android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() { return null; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    protected void onProvideStructure(android.view.ViewStructure p0, int p1, int p2) {}
    public void autofill(android.view.autofill.AutofillValue p0) {}
    public int getAutofillType() { return 0; }
    public android.view.autofill.AutofillValue getAutofillValue() { return null; }
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) {}
    private int getVisibleChildWithTextCount() { return 0; }
    int getIndexWithinVisibleButtons(android.view.View p0) { return 0; }
    private boolean isVisibleWithText(android.widget.RadioButton p0) { return false; }

    private class CheckedStateTracker implements android.widget.CompoundButton.OnCheckedChangeListener {
        private CheckedStateTracker(android.widget.RadioGroup p0) {}
        public void onCheckedChanged(android.widget.CompoundButton p0, boolean p1) {}
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1, float p2) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        protected void setBaseAttributes(android.content.res.TypedArray p0, int p1, int p2) {}
    }

    public static interface OnCheckedChangeListener {
        public void onCheckedChanged(android.widget.RadioGroup p0, int p1);
    }

    private class PassThroughHierarchyChangeListener implements android.view.ViewGroup.OnHierarchyChangeListener {
        private android.view.ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
        private PassThroughHierarchyChangeListener(android.widget.RadioGroup p0) {}
        public void onChildViewAdded(android.view.View p0, android.view.View p1) {}
        public void onChildViewRemoved(android.view.View p0, android.view.View p1) {}
    }
}
