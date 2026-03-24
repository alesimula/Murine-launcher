package android.telephony.data;

@android.annotation.SystemApi
public abstract class DataService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.telephony.data.DataService";
    public static final int REQUEST_REASON_UNKNOWN = 0;
    public static final int REQUEST_REASON_NORMAL = 1;
    public static final int REQUEST_REASON_SHUTDOWN = 2;
    public static final int REQUEST_REASON_HANDOVER = 3;
    public final android.telephony.data.DataService.IDataServiceWrapper mBinder = null;
    public DataService() { super(); }
    @android.annotation.Nullable
    public abstract android.telephony.data.DataService.DataServiceProvider onCreateDataServiceProvider(int p0);
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public boolean onUnbind(android.content.Intent p0) { return false; }
    public void onDestroy() {}

    private static final class ApnUnthrottledIndication {
        public final android.telephony.data.DataProfile dataProfile = null;
        public final java.lang.String apn = null;
        public final android.telephony.data.IDataServiceCallback callback = null;
        ApnUnthrottledIndication(java.lang.String p0, android.telephony.data.IDataServiceCallback p1) {}
        ApnUnthrottledIndication(android.telephony.data.DataProfile p0, android.telephony.data.IDataServiceCallback p1) {}
    }

    private static final class BeginCancelHandoverRequest {
        public final int cid = 0;
        public final android.telephony.data.IDataServiceCallback callback = null;
        BeginCancelHandoverRequest(int p0, android.telephony.data.IDataServiceCallback p1) {}
    }

    private static final class DataCallListChangedIndication {
        public final java.util.List<android.telephony.data.DataCallResponse> dataCallList = null;
        public final android.telephony.data.IDataServiceCallback callback = null;
        DataCallListChangedIndication(java.util.List<android.telephony.data.DataCallResponse> p0, android.telephony.data.IDataServiceCallback p1) {}
    }

    private class DataServiceHandler extends android.os.Handler {
        DataServiceHandler(android.telephony.data.DataService p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public abstract class DataServiceProvider implements java.lang.AutoCloseable {
        public DataServiceProvider(android.telephony.data.DataService p0, int p1) {}
        public final int getSlotIndex() { return 0; }
        public void setupDataCall(int p0, android.telephony.data.DataProfile p1, boolean p2, boolean p3, int p4, android.net.LinkProperties p5, android.telephony.data.DataServiceCallback p6) {}
        public void setupDataCall(int p0, android.telephony.data.DataProfile p1, boolean p2, boolean p3, int p4, android.net.LinkProperties p5, int p6, android.telephony.data.NetworkSliceInfo p7, android.telephony.data.TrafficDescriptor p8, boolean p9, android.telephony.data.DataServiceCallback p10) {}
        public void deactivateDataCall(int p0, int p1, android.telephony.data.DataServiceCallback p2) {}
        public void setInitialAttachApn(android.telephony.data.DataProfile p0, boolean p1, android.telephony.data.DataServiceCallback p2) {}
        public void setDataProfile(java.util.List<android.telephony.data.DataProfile> p0, boolean p1, android.telephony.data.DataServiceCallback p2) {}
        public void startHandover(int p0, android.telephony.data.DataServiceCallback p1) {}
        public void cancelHandover(int p0, android.telephony.data.DataServiceCallback p1) {}
        public void requestDataCallList(android.telephony.data.DataServiceCallback p0) {}
        @android.annotation.FlaggedApi("com.android.internal.telephony.flags.network_validation")
        public void requestNetworkValidation(int p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
        public final void notifyDataCallListChanged(java.util.List<android.telephony.data.DataCallResponse> p0) {}
        public final void notifyApnUnthrottled(java.lang.String p0) {}
        public final void notifyDataProfileUnthrottled(android.telephony.data.DataProfile p0) {}
        public abstract void close();
    }

    private static final class DeactivateDataCallRequest {
        public final int cid = 0;
        public final int reason = 0;
        public final android.telephony.data.IDataServiceCallback callback = null;
        DeactivateDataCallRequest(int p0, int p1, android.telephony.data.IDataServiceCallback p2) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeactivateDataReason {
    }

    private class IDataServiceWrapper extends android.telephony.data.IDataService.Stub {
        public void createDataServiceProvider(int p0) {}
        public void removeDataServiceProvider(int p0) {}
        public void setupDataCall(int p0, int p1, android.telephony.data.DataProfile p2, boolean p3, boolean p4, int p5, android.net.LinkProperties p6, int p7, android.telephony.data.NetworkSliceInfo p8, android.telephony.data.TrafficDescriptor p9, boolean p10, android.telephony.data.IDataServiceCallback p11) {}
        public void deactivateDataCall(int p0, int p1, int p2, android.telephony.data.IDataServiceCallback p3) {}
        public void setInitialAttachApn(int p0, android.telephony.data.DataProfile p1, boolean p2, android.telephony.data.IDataServiceCallback p3) {}
        public void setDataProfile(int p0, java.util.List<android.telephony.data.DataProfile> p1, boolean p2, android.telephony.data.IDataServiceCallback p3) {}
        public void requestDataCallList(int p0, android.telephony.data.IDataServiceCallback p1) {}
        public void registerForDataCallListChanged(int p0, android.telephony.data.IDataServiceCallback p1) {}
        public void unregisterForDataCallListChanged(int p0, android.telephony.data.IDataServiceCallback p1) {}
        public void startHandover(int p0, int p1, android.telephony.data.IDataServiceCallback p2) {}
        public void cancelHandover(int p0, int p1, android.telephony.data.IDataServiceCallback p2) {}
        public void registerForUnthrottleApn(int p0, android.telephony.data.IDataServiceCallback p1) {}
        public void unregisterForUnthrottleApn(int p0, android.telephony.data.IDataServiceCallback p1) {}
        public void requestNetworkValidation(int p0, int p1, com.android.internal.telephony.IIntegerConsumer p2) {}
    }

    private static final class SetDataProfileRequest {
        public final java.util.List<android.telephony.data.DataProfile> dps = null;
        public final boolean isRoaming = false;
        public final android.telephony.data.IDataServiceCallback callback = null;
        SetDataProfileRequest(java.util.List<android.telephony.data.DataProfile> p0, boolean p1, android.telephony.data.IDataServiceCallback p2) {}
    }

    private static final class SetInitialAttachApnRequest {
        public final android.telephony.data.DataProfile dataProfile = null;
        public final boolean isRoaming = false;
        public final android.telephony.data.IDataServiceCallback callback = null;
        SetInitialAttachApnRequest(android.telephony.data.DataProfile p0, boolean p1, android.telephony.data.IDataServiceCallback p2) {}
    }

    private static final class SetupDataCallRequest {
        public final int accessNetworkType = 0;
        public final android.telephony.data.DataProfile dataProfile = null;
        public final boolean isRoaming = false;
        public final boolean allowRoaming = false;
        public final int reason = 0;
        public final android.net.LinkProperties linkProperties = null;
        public final int pduSessionId = 0;
        public final android.telephony.data.NetworkSliceInfo sliceInfo = null;
        public final android.telephony.data.TrafficDescriptor trafficDescriptor = null;
        public final boolean matchAllRuleAllowed = false;
        public final android.telephony.data.IDataServiceCallback callback = null;
        SetupDataCallRequest(int p0, android.telephony.data.DataProfile p1, boolean p2, boolean p3, int p4, android.net.LinkProperties p5, int p6, android.telephony.data.NetworkSliceInfo p7, android.telephony.data.TrafficDescriptor p8, boolean p9, android.telephony.data.IDataServiceCallback p10) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SetupDataReason {
    }

    private static final class ValidationRequest {
        public final int cid = 0;
        public final java.util.concurrent.Executor executor = null;
        public final com.android.internal.telephony.IIntegerConsumer callback = null;
        ValidationRequest(int p0, java.util.concurrent.Executor p1, com.android.internal.telephony.IIntegerConsumer p2) {}
    }
}
