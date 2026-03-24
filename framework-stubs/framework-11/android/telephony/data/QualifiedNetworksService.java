package android.telephony.data;

@android.annotation.SystemApi
public abstract class QualifiedNetworksService extends android.app.Service {
    private static final java.lang.String TAG = null;
    public static final java.lang.String QUALIFIED_NETWORKS_SERVICE_INTERFACE = "android.telephony.data.QualifiedNetworksService";
    private static final int QNS_CREATE_NETWORK_AVAILABILITY_PROVIDER = 1;
    private static final int QNS_REMOVE_NETWORK_AVAILABILITY_PROVIDER = 2;
    private static final int QNS_REMOVE_ALL_NETWORK_AVAILABILITY_PROVIDERS = 3;
    private static final int QNS_UPDATE_QUALIFIED_NETWORKS = 4;
    private final android.os.HandlerThread mHandlerThread = null;
    private final android.telephony.data.QualifiedNetworksService.QualifiedNetworksServiceHandler mHandler = null;
    private final android.util.SparseArray<android.telephony.data.QualifiedNetworksService.NetworkAvailabilityProvider> mProviders = null;
    public final android.telephony.data.QualifiedNetworksService.IQualifiedNetworksServiceWrapper mBinder = null;
    public QualifiedNetworksService() { super(); }
    public abstract android.telephony.data.QualifiedNetworksService.NetworkAvailabilityProvider onCreateNetworkAvailabilityProvider(int p0);
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public boolean onUnbind(android.content.Intent p0) { return false; }
    public void onDestroy() {}
    private void log(java.lang.String p0) {}
    private void loge(java.lang.String p0) {}

    private class IQualifiedNetworksServiceWrapper extends android.telephony.data.IQualifiedNetworksService.Stub {
        private IQualifiedNetworksServiceWrapper(android.telephony.data.QualifiedNetworksService p0) { super(); }
        public void createNetworkAvailabilityProvider(int p0, android.telephony.data.IQualifiedNetworksServiceCallback p1) {}
        public void removeNetworkAvailabilityProvider(int p0) {}
    }

    public abstract class NetworkAvailabilityProvider implements java.lang.AutoCloseable {
        private final int mSlotIndex = 0;
        private android.telephony.data.IQualifiedNetworksServiceCallback mCallback;
        private android.util.SparseArray<int[]> mQualifiedNetworkTypesList;
        public NetworkAvailabilityProvider(android.telephony.data.QualifiedNetworksService p0, int p1) {}
        public final int getSlotIndex() { return 0; }
        private void registerForQualifiedNetworkTypesChanged(android.telephony.data.IQualifiedNetworksServiceCallback p0) {}
        public final void updateQualifiedNetworkTypes(int p0, java.util.List<java.lang.Integer> p1) {}
        private void onUpdateQualifiedNetworkTypes(int p0, int[] p1) {}
        public abstract void close();
    }

    private class QualifiedNetworksServiceHandler extends android.os.Handler {
        QualifiedNetworksServiceHandler(android.telephony.data.QualifiedNetworksService p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
