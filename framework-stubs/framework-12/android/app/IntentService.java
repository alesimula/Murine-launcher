package android.app;

@java.lang.Deprecated
public abstract class IntentService extends android.app.Service {
    private volatile android.os.Looper mServiceLooper;
    private volatile android.app.IntentService.ServiceHandler mServiceHandler;
    private java.lang.String mName;
    private boolean mRedelivery;
    public IntentService(java.lang.String p0) { super(); }
    public void setIntentRedelivery(boolean p0) {}
    public void onCreate() {}
    public void onStart(android.content.Intent p0, int p1) {}
    public int onStartCommand(android.content.Intent p0, int p1, int p2) { return 0; }
    public void onDestroy() {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    protected abstract void onHandleIntent(android.content.Intent p0);

    private final class ServiceHandler extends android.os.Handler {
        public ServiceHandler(android.app.IntentService p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
