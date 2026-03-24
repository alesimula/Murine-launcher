package android.widget;

@java.lang.Deprecated
@android.widget.RemoteViews.RemoteView
public class AbsoluteLayout extends android.view.ViewGroup {
    public AbsoluteLayout(android.content.Context p0) { super((android.content.Context)null); }
    public AbsoluteLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public AbsoluteLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public AbsoluteLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onMeasure(int p0, int p1) {}
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public boolean shouldDelayChildPressedState() { return false; }

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        public int x;
        public int y;
        public LayoutParams(int p0, int p1, int p2, int p3) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public java.lang.String debug(java.lang.String p0) { return null; }
    }
}
