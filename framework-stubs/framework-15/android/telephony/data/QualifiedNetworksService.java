package android.telephony.data;

@android.annotation.SystemApi
public abstract class QualifiedNetworksService extends android.app.Service {
    public static final java.lang.String QUALIFIED_NETWORKS_SERVICE_INTERFACE = "android.telephony.data.QualifiedNetworksService";
    public final android.telephony.data.QualifiedNetworksService.IQualifiedNetworksServiceWrapper mBinder = null;
    public QualifiedNetworksService() { super(); }
    @android.annotation.NonNull
    public abstract android.telephony.data.QualifiedNetworksService.NetworkAvailabilityProvider onCreateNetworkAvailabilityProvider(int p0);
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public boolean onUnbind(android.content.Intent p0) { return false; }
    public void onDestroy() {}

    private class IQualifiedNetworksServiceWrapper extends android.telephony.data.IQualifiedNetworksService.Stub {
        public void createNetworkAvailabilityProvider(int p0, android.telephony.data.IQualifiedNetworksServiceCallback p1) {}
        public void removeNetworkAvailabilityProvider(int p0) {}
        public void reportThrottleStatusChanged(int p0, java.util.List<android.telephony.data.ThrottleStatus> p1) {}
        public void reportEmergencyDataNetworkPreferredTransportChanged(int p0, int p1) {}
    }

    public abstract class NetworkAvailabilityProvider implements java.lang.AutoCloseable {
        public NetworkAvailabilityProvider(android.telephony.data.QualifiedNetworksService p0, int p1) {}
        public final int getSlotIndex() { return 0; }
        public final void updateQualifiedNetworkTypes(int p0, java.util.List<java.lang.Integer> p1) {}
        public final void reconnectQualifiedNetworkType(int p0, int p1) {}
        public void reportThrottleStatusChanged(java.util.List<android.telephony.data.ThrottleStatus> p0) {}
        public void reportEmergencyDataNetworkPreferredTransportChanged(int p0) {}
        @android.annotation.FlaggedApi("com.android.internal.telephony.flags.network_validation")
        public void requestNetworkValidation(int p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
        public abstract void close();
    }

    private static final class NetworkValidationRequestData {
        final int mNetworkCapability = 0;
        final com.android.internal.telephony.IIntegerConsumer mCallback = null;
    }

    private class QualifiedNetworksServiceHandler extends android.os.Handler {
        QualifiedNetworksServiceHandler(android.telephony.data.QualifiedNetworksService p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
