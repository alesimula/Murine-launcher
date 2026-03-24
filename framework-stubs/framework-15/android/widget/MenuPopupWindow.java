package android.widget;

public class MenuPopupWindow extends android.widget.ListPopupWindow implements android.widget.MenuItemHoverListener {
    public MenuPopupWindow(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    android.widget.DropDownListView createDropDownListView(android.content.Context p0, boolean p1) { return null; }
    public void setEnterTransition(android.transition.Transition p0) {}
    public void setExitTransition(android.transition.Transition p0) {}
    public void setHoverListener(android.widget.MenuItemHoverListener p0) {}
    public void setTouchModal(boolean p0) {}
    public void onItemHoverEnter(com.android.internal.view.menu.MenuBuilder p0, android.view.MenuItem p1) {}
    public void onItemHoverExit(com.android.internal.view.menu.MenuBuilder p0, android.view.MenuItem p1) {}

    public static class MenuDropDownListView extends android.widget.DropDownListView {
        final int mAdvanceKey = 0;
        final int mRetreatKey = 0;
        public MenuDropDownListView(android.content.Context p0, boolean p1) { super((android.content.Context)null, false); }
        public void setHoverListener(android.widget.MenuItemHoverListener p0) {}
        public void clearSelection() {}
        public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
        public boolean onHoverEvent(android.view.MotionEvent p0) { return false; }
    }
}
