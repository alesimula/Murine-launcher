package android.window;

public abstract class WindowContainerTransactionCallback {
    final android.window.IWindowContainerTransactionCallback mInterface = null;
    public WindowContainerTransactionCallback() {}
    public abstract void onTransactionReady(int p0, android.view.SurfaceControl.Transaction p1);
}
