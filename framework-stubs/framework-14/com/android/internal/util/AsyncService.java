package com.android.internal.util;

public abstract class AsyncService extends android.app.Service {
    protected static final boolean DBG = true;
    public static final int CMD_ASYNC_SERVICE_ON_START_INTENT = 16777215;
    public static final int CMD_ASYNC_SERVICE_DESTROY = 16777216;
    protected android.os.Messenger mMessenger;
    android.os.Handler mHandler;
    com.android.internal.util.AsyncService.AsyncServiceInfo mAsyncServiceInfo;
    public AsyncService() { super(); }
    public abstract com.android.internal.util.AsyncService.AsyncServiceInfo createHandler();
    public android.os.Handler getHandler() { return null; }
    public void onCreate() {}
    public int onStartCommand(android.content.Intent p0, int p1, int p2) { return 0; }
    public void onDestroy() {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }

    public static final class AsyncServiceInfo {
        public android.os.Handler mHandler;
        public int mRestartFlags;
        public AsyncServiceInfo() {}
    }
}
