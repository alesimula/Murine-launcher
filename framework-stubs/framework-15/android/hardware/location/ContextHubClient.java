package android.hardware.location;

@android.annotation.SystemApi
public class ContextHubClient implements java.io.Closeable {
    ContextHubClient(android.hardware.location.ContextHubInfo p0, boolean p1) {}
    synchronized void setClientProxy(android.hardware.location.IContextHubClient p0) {}
    @android.annotation.NonNull
    public android.hardware.location.ContextHubInfo getAttachedHub() { return null; }
    public int getId() { return 0; }
    public void close() {}
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public int sendMessageToNanoApp(android.hardware.location.NanoAppMessage p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    @android.annotation.NonNull
    @android.annotation.FlaggedApi("android.chre.flags.reliable_message")
    public android.hardware.location.ContextHubTransaction<java.lang.Void> sendReliableMessageToNanoApp(android.hardware.location.NanoAppMessage p0) { return null; }
    protected void finalize() throws java.lang.Throwable {}
    public synchronized void callbackFinished() {}
    public synchronized void reliableMessageCallbackFinished(int p0, byte p1) {}
}
