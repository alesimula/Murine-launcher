package android.widget;

public class ViewSwitcher extends android.widget.ViewAnimator {
    android.widget.ViewSwitcher.ViewFactory mFactory;
    public ViewSwitcher(android.content.Context p0) { super((android.content.Context)null); }
    public ViewSwitcher(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public void addView(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public android.view.View getNextView() { return null; }
    public void setFactory(android.widget.ViewSwitcher.ViewFactory p0) {}
    public void reset() {}

    public static interface ViewFactory {
        public android.view.View makeView();
    }
}
