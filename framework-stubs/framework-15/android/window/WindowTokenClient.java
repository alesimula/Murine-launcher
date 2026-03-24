package android.window;

public class WindowTokenClient extends android.os.Binder {
    public WindowTokenClient() { super(); }
    public void attachContext(android.content.Context p0) {}
    @android.annotation.Nullable
    public android.content.Context getContext() { return null; }
    public void onConfigurationChanged(android.content.res.Configuration p0, int p1) {}
    public void postOnConfigurationChanged(android.content.res.Configuration p0, int p1) {}
    public void onConfigurationChanged(android.content.res.Configuration p0, int p1, boolean p2) {}
    public void onConfigurationChangedInner(android.content.Context p0, android.content.res.Configuration p1, int p2, boolean p3) {}
    public void onWindowTokenRemoved() {}
    @android.annotation.NonNull
    public android.app.servertransaction.ClientTransactionListenerController getClientTransactionListenerController() { return null; }
}
