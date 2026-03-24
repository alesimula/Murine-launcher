package android.view.selectiontoolbar;

public final class SelectionToolbarManager {
    public static final java.lang.String LOG_TAG = "SelectionToolbar";
    public static final long NO_TOOLBAR_ID = 0L;
    public static final int ERROR_DO_NOT_ALLOW_MULTIPLE_TOOL_BAR = 1;
    public SelectionToolbarManager(android.content.Context p0, android.view.selectiontoolbar.ISelectionToolbarManager p1) {}
    public void showToolbar(android.view.selectiontoolbar.ShowInfo p0, android.view.selectiontoolbar.ISelectionToolbarCallback p1) {}
    public void hideToolbar(long p0) {}
    public void dismissToolbar(long p0) {}
    public static boolean isRemoteSelectionToolbarEnabled(android.content.Context p0) { return false; }
}
