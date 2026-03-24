package android.service.selectiontoolbar;

public interface SelectionToolbarRenderCallback {
    public void onShown(android.view.selectiontoolbar.WidgetInfo p0);
    public void onWidgetUpdated(android.view.selectiontoolbar.WidgetInfo p0);
    public void onMenuItemClicked(android.view.selectiontoolbar.ToolbarMenuItem p0);
    public void onToolbarShowTimeout();
    public void onError(int p0);
}
