package android.app.servertransaction;

public class ClientTransactionListenerController {
    @android.annotation.NonNull
    public static android.app.servertransaction.ClientTransactionListenerController getInstance() { return null; }
    @android.annotation.NonNull
    public static android.app.servertransaction.ClientTransactionListenerController createInstanceForTesting(android.hardware.display.DisplayManagerGlobal p0) { return null; }
    public void registerActivityWindowInfoChangedListener(java.util.function.BiConsumer<android.os.IBinder, android.window.ActivityWindowInfo> p0) {}
    public void unregisterActivityWindowInfoChangedListener(java.util.function.BiConsumer<android.os.IBinder, android.window.ActivityWindowInfo> p0) {}
    public void onActivityWindowInfoChanged(android.os.IBinder p0, android.window.ActivityWindowInfo p1) {}
    public void onClientTransactionStarted() {}
    public void onClientTransactionFinished() {}
    public void onContextConfigurationPreChanged(android.content.Context p0) {}
    public void onContextConfigurationPostChanged(android.content.Context p0) {}
    public void onDisplayChanged(int p0) throws java.util.concurrent.RejectedExecutionException {}
}
