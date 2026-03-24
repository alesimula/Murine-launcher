package android.hardware.location;

@android.annotation.SystemApi
public class ContextHubClient implements java.io.Closeable {
    private static final java.lang.String TAG = "ContextHubClient";
    private android.hardware.location.IContextHubClient mClientProxy;
    private final android.hardware.location.ContextHubInfo mAttachedHub = null;
    private final java.util.concurrent.atomic.AtomicBoolean mIsClosed = null;
    private final boolean mPersistent = false;
    ContextHubClient(android.hardware.location.ContextHubInfo p0, boolean p1) {}
    void setClientProxy(android.hardware.location.IContextHubClient p0) {}
    public android.hardware.location.ContextHubInfo getAttachedHub() { return null; }
    public void close() {}
    public int sendMessageToNanoApp(android.hardware.location.NanoAppMessage p0) { return 0; }
    protected void finalize() throws java.lang.Throwable {}
}
