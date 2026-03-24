package android.widget;

public class DropDownListView extends android.widget.ListView {
    private boolean mListSelectionHidden;
    private boolean mHijackFocus;
    private boolean mDrawsInPressedState;
    private com.android.internal.widget.AutoScrollHelper.AbsListViewAutoScroller mScrollHelper;
    private android.widget.DropDownListView.ResolveHoverRunnable mResolveHoverRunnable;
    public DropDownListView(android.content.Context p0, boolean p1) { super((android.content.Context)null); }
    public DropDownListView(android.content.Context p0, boolean p1, int p2) { super((android.content.Context)null); }
    boolean shouldShowSelector() { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onHoverEvent(android.view.MotionEvent p0) { return false; }
    protected void drawableStateChanged() {}
    public boolean onForwardedEvent(android.view.MotionEvent p0, int p1) { return false; }
    public void setListSelectionHidden(boolean p0) {}
    private void clearPressedItem() {}
    private void setPressedItem(android.view.View p0, int p1, float p2, float p3) {}
    boolean touchModeDrawsInPressedState() { return false; }
    android.view.View obtainView(int p0, boolean[] p1) { return null; }
    public boolean isInTouchMode() { return false; }
    public boolean hasWindowFocus() { return false; }
    public boolean isFocused() { return false; }
    public boolean hasFocus() { return false; }

    private class ResolveHoverRunnable implements java.lang.Runnable {
        private ResolveHoverRunnable(android.widget.DropDownListView p0) {}
        public void run() {}
        public void cancel() {}
        public void post() {}
    }
}
