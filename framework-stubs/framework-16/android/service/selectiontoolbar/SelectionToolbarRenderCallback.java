package android.service.selectiontoolbar;

public interface SelectionToolbarRenderCallback {
    public void onShown(android.view.selectiontoolbar.WidgetInfo p0);
    public void onWidgetUpdated(android.view.selectiontoolbar.WidgetInfo p0);
    public void onMenuItemClicked(int p0);
    public void onError(int p0, int p1);
}
