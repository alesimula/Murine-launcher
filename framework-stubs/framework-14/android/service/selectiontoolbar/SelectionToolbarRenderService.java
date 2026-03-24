package android.service.selectiontoolbar;

public abstract class SelectionToolbarRenderService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.selectiontoolbar.SelectionToolbarRenderService";
    public SelectionToolbarRenderService() { super(); }
    public void onCreate() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    protected void transferTouch(android.os.IBinder p0, android.os.IBinder p1) {}
    public abstract void onShow(int p0, android.view.selectiontoolbar.ShowInfo p1, android.service.selectiontoolbar.SelectionToolbarRenderService.RemoteCallbackWrapper p2);
    public abstract void onHide(long p0);
    public abstract void onDismiss(long p0);
    public void onToolbarShowTimeout(int p0) {}

    private class CleanCacheRunnable implements java.lang.Runnable {
        int mCleanUid;
        CleanCacheRunnable(android.service.selectiontoolbar.SelectionToolbarRenderService p0, int p1) {}
        public void run() {}
    }

    public static final class RemoteCallbackWrapper implements android.service.selectiontoolbar.SelectionToolbarRenderCallback {
        RemoteCallbackWrapper(android.view.selectiontoolbar.ISelectionToolbarCallback p0) {}
        public void onShown(android.view.selectiontoolbar.WidgetInfo p0) {}
        public void onToolbarShowTimeout() {}
        public void onWidgetUpdated(android.view.selectiontoolbar.WidgetInfo p0) {}
        public void onMenuItemClicked(android.view.selectiontoolbar.ToolbarMenuItem p0) {}
        public void onError(int p0) {}
    }

    public static interface TransferTouchListener {
        public void onTransferTouch(android.os.IBinder p0, android.os.IBinder p1);
    }
}
