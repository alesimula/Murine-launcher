package android.view;

public interface ContextMenu extends android.view.Menu {
    public android.view.ContextMenu setHeaderTitle(int p0);
    public android.view.ContextMenu setHeaderTitle(java.lang.CharSequence p0);
    public android.view.ContextMenu setHeaderIcon(int p0);
    public android.view.ContextMenu setHeaderIcon(android.graphics.drawable.Drawable p0);
    public android.view.ContextMenu setHeaderView(android.view.View p0);
    public void clearHeader();

    public static interface ContextMenuInfo {
    }
}
