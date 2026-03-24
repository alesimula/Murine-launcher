package android.widget;

public class PopupMenu {
    private final android.content.Context mContext = null;
    private final com.android.internal.view.menu.MenuBuilder mMenu = null;
    private final android.view.View mAnchor = null;
    private final com.android.internal.view.menu.MenuPopupHelper mPopup = null;
    private android.widget.PopupMenu.OnMenuItemClickListener mMenuItemClickListener;
    private android.widget.PopupMenu.OnDismissListener mOnDismissListener;
    private android.view.View.OnTouchListener mDragListener;
    public PopupMenu(android.content.Context p0, android.view.View p1) {}
    public PopupMenu(android.content.Context p0, android.view.View p1, int p2) {}
    public PopupMenu(android.content.Context p0, android.view.View p1, int p2, int p3, int p4) {}
    public void setGravity(int p0) {}
    public int getGravity() { return 0; }
    public android.view.View.OnTouchListener getDragToOpenListener() { return null; }
    public android.view.Menu getMenu() { return null; }
    public android.view.MenuInflater getMenuInflater() { return null; }
    public void inflate(int p0) {}
    public void show() {}
    public void dismiss() {}
    public void setOnMenuItemClickListener(android.widget.PopupMenu.OnMenuItemClickListener p0) {}
    public void setOnDismissListener(android.widget.PopupMenu.OnDismissListener p0) {}
    public void setForceShowIcon(boolean p0) {}
    public android.widget.ListView getMenuListView() { return null; }

    public static interface OnDismissListener {
        public void onDismiss(android.widget.PopupMenu p0);
    }

    public static interface OnMenuItemClickListener {
        public boolean onMenuItemClick(android.view.MenuItem p0);
    }
}
