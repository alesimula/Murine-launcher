package android.telephony;

@android.annotation.SystemApi
public abstract class NetworkService extends android.app.Service {
    private final java.lang.String TAG = null;
    public static final java.lang.String SERVICE_INTERFACE = "android.telephony.NetworkService";
    private static final int NETWORK_SERVICE_CREATE_NETWORK_SERVICE_PROVIDER = 1;
    private static final int NETWORK_SERVICE_REMOVE_NETWORK_SERVICE_PROVIDER = 2;
    private static final int NETWORK_SERVICE_REMOVE_ALL_NETWORK_SERVICE_PROVIDERS = 3;
    private static final int NETWORK_SERVICE_GET_REGISTRATION_INFO = 4;
    private static final int NETWORK_SERVICE_REGISTER_FOR_INFO_CHANGE = 5;
    private static final int NETWORK_SERVICE_UNREGISTER_FOR_INFO_CHANGE = 6;
    private static final int NETWORK_SERVICE_INDICATION_NETWORK_INFO_CHANGED = 7;
    private final android.os.HandlerThread mHandlerThread = null;
    private final android.telephony.NetworkService.NetworkServiceHandler mHandler = null;
    private final android.util.SparseArray<android.telephony.NetworkService.NetworkServiceProvider> mServiceMap = null;
    public final android.telephony.NetworkService.INetworkServiceWrapper mBinder = null;
    public NetworkService() { super(); }
    public abstract android.telephony.NetworkService.NetworkServiceProvider onCreateNetworkServiceProvider(int p0);
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public boolean onUnbind(android.content.Intent p0) { return false; }
    public void onDestroy() {}
    private final void log(java.lang.String p0) {}
    private final void loge(java.lang.String p0) {}

    public abstract class NetworkServiceProvider implements java.lang.AutoCloseable {
        private final int mSlotIndex = 0;
        private final java.util.List<android.telephony.INetworkServiceCallback> mNetworkRegistrationInfoChangedCallbacks = null;
        public NetworkServiceProvider(android.telephony.NetworkService p0, int p1) {}
        public final int getSlotIndex() { return 0; }
        public void requestNetworkRegistrationInfo(int p0, android.telephony.NetworkServiceCallback p1) {}
        public final void notifyNetworkRegistrationInfoChanged() {}
        private void registerForInfoChanged(android.telephony.INetworkServiceCallback p0) {}
        private void unregisterForInfoChanged(android.telephony.INetworkServiceCallback p0) {}
        private void notifyInfoChangedToCallbacks() {}
        public abstract void close();
    }

    private class NetworkServiceHandler extends android.os.Handler {
        NetworkServiceHandler(android.telephony.NetworkService p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private class INetworkServiceWrapper extends android.telephony.INetworkService.Stub {
        private INetworkServiceWrapper(android.telephony.NetworkService p0) { super(); }
        public void createNetworkServiceProvider(int p0) {}
        public void removeNetworkServiceProvider(int p0) {}
        public void requestNetworkRegistrationInfo(int p0, int p1, android.telephony.INetworkServiceCallback p2) {}
        public void registerForNetworkRegistrationInfoChanged(int p0, android.telephony.INetworkServiceCallback p1) {}
        public void unregisterForNetworkRegistrationInfoChanged(int p0, android.telephony.INetworkServiceCallback p1) {}
    }
}
