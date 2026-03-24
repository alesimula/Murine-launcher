package android.inputmethodservice.navigationbar;

class ReverseLinearLayout extends android.widget.LinearLayout {
    ReverseLinearLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    protected void onFinishInflate() {}
    public void addView(android.view.View p0) {}
    public void addView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void onRtlPropertiesChanged(int p0) {}
    public void setAlternativeOrder(boolean p0) {}

    public static class ReverseRelativeLayout extends android.widget.RelativeLayout implements android.inputmethodservice.navigationbar.ReverseLinearLayout.Reversible {
        ReverseRelativeLayout(android.content.Context p0) { super((android.content.Context)null); }
        public void reverse(boolean p0) {}
        public void setDefaultGravity(int p0) {}
        public void updateGravity(boolean p0) {}
    }

    static interface Reversible {
        public void reverse(boolean p0);
    }
}
