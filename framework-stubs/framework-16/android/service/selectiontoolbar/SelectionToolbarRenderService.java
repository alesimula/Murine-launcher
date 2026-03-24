package android.service.selectiontoolbar;

public abstract class SelectionToolbarRenderService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.selectiontoolbar.SelectionToolbarRenderService";
    public SelectionToolbarRenderService() { super(); }
    public void onCreate() {}
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    protected void transferTouch(android.os.IBinder p0, android.os.IBinder p1) {}
    protected void onPasteAction(int p0) {}
    public abstract void onShow(int p0, android.view.selectiontoolbar.ShowInfo p1, android.service.selectiontoolbar.SelectionToolbarRenderService.RemoteCallbackWrapper p2);
    public abstract void onHide(long p0);
    public abstract void onDismiss(long p0);
    public abstract void onUidDied(int p0);

    public static interface OnPasteActionCallback {
        public void onPasteAction(int p0);
    }

    public static final class RemoteCallbackWrapper implements android.service.selectiontoolbar.SelectionToolbarRenderCallback {
        RemoteCallbackWrapper(android.view.selectiontoolbar.ISelectionToolbarCallback p0, android.os.IBinder.DeathRecipient p1) {}
        public void onShown(android.view.selectiontoolbar.WidgetInfo p0) {}
        public void onWidgetUpdated(android.view.selectiontoolbar.WidgetInfo p0) {}
        public void onMenuItemClicked(int p0) {}
        public void onError(int p0, int p1) {}
    }

    public static interface TransferTouchListener {
        public void onTransferTouch(android.os.IBinder p0, android.os.IBinder p1);
    }
}
