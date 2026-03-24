package android.telephony;

@android.annotation.SystemApi
public abstract class NetworkService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.telephony.NetworkService";
    public final android.telephony.NetworkService.INetworkServiceWrapper mBinder = null;
    public NetworkService() { super(); }
    @android.annotation.Nullable
    public abstract android.telephony.NetworkService.NetworkServiceProvider onCreateNetworkServiceProvider(int p0);
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public boolean onUnbind(android.content.Intent p0) { return false; }
    public void onDestroy() {}

    private class INetworkServiceWrapper extends android.telephony.INetworkService.Stub {
        public void createNetworkServiceProvider(int p0) {}
        public void removeNetworkServiceProvider(int p0) {}
        public void requestNetworkRegistrationInfo(int p0, int p1, android.telephony.INetworkServiceCallback p2) {}
        public void registerForNetworkRegistrationInfoChanged(int p0, android.telephony.INetworkServiceCallback p1) {}
        public void unregisterForNetworkRegistrationInfoChanged(int p0, android.telephony.INetworkServiceCallback p1) {}
    }

    private class NetworkServiceHandler extends android.os.Handler {
        NetworkServiceHandler(android.telephony.NetworkService p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public abstract class NetworkServiceProvider implements java.lang.AutoCloseable {
        public NetworkServiceProvider(android.telephony.NetworkService p0, int p1) {}
        public final int getSlotIndex() { return 0; }
        public void requestNetworkRegistrationInfo(int p0, android.telephony.NetworkServiceCallback p1) {}
        public final void notifyNetworkRegistrationInfoChanged() {}
        public abstract void close();
    }
}
