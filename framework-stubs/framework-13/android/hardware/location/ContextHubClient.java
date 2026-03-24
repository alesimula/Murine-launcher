package android.hardware.location;

@android.annotation.SystemApi
public class ContextHubClient implements java.io.Closeable {
    ContextHubClient(android.hardware.location.ContextHubInfo p0, boolean p1) {}
    void setClientProxy(android.hardware.location.IContextHubClient p0) {}
    public android.hardware.location.ContextHubInfo getAttachedHub() { return null; }
    public int getId() { return 0; }
    public void close() {}
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public int sendMessageToNanoApp(android.hardware.location.NanoAppMessage p0) { return 0; }
    protected void finalize() throws java.lang.Throwable {}
}
