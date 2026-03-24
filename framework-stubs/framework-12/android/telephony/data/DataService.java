package android.telephony.data;

@android.annotation.SystemApi
public abstract class DataService extends android.app.Service {
    private static final java.lang.String TAG = null;
    public static final java.lang.String SERVICE_INTERFACE = "android.telephony.data.DataService";
    public static final int REQUEST_REASON_UNKNOWN = 0;
    public static final int REQUEST_REASON_NORMAL = 1;
    public static final int REQUEST_REASON_SHUTDOWN = 2;
    public static final int REQUEST_REASON_HANDOVER = 3;
    private static final int DATA_SERVICE_CREATE_DATA_SERVICE_PROVIDER = 1;
    private static final int DATA_SERVICE_REMOVE_DATA_SERVICE_PROVIDER = 2;
    private static final int DATA_SERVICE_REMOVE_ALL_DATA_SERVICE_PROVIDERS = 3;
    private static final int DATA_SERVICE_REQUEST_SETUP_DATA_CALL = 4;
    private static final int DATA_SERVICE_REQUEST_DEACTIVATE_DATA_CALL = 5;
    private static final int DATA_SERVICE_REQUEST_SET_INITIAL_ATTACH_APN = 6;
    private static final int DATA_SERVICE_REQUEST_SET_DATA_PROFILE = 7;
    private static final int DATA_SERVICE_REQUEST_REQUEST_DATA_CALL_LIST = 8;
    private static final int DATA_SERVICE_REQUEST_REGISTER_DATA_CALL_LIST_CHANGED = 9;
    private static final int DATA_SERVICE_REQUEST_UNREGISTER_DATA_CALL_LIST_CHANGED = 10;
    private static final int DATA_SERVICE_INDICATION_DATA_CALL_LIST_CHANGED = 11;
    private static final int DATA_SERVICE_REQUEST_START_HANDOVER = 12;
    private static final int DATA_SERVICE_REQUEST_CANCEL_HANDOVER = 13;
    private static final int DATA_SERVICE_REQUEST_REGISTER_APN_UNTHROTTLED = 14;
    private static final int DATA_SERVICE_REQUEST_UNREGISTER_APN_UNTHROTTLED = 15;
    private static final int DATA_SERVICE_INDICATION_APN_UNTHROTTLED = 16;
    private final android.os.HandlerThread mHandlerThread = null;
    private final android.telephony.data.DataService.DataServiceHandler mHandler = null;
    private final android.util.SparseArray<android.telephony.data.DataService.DataServiceProvider> mServiceMap = null;
    public final android.telephony.data.DataService.IDataServiceWrapper mBinder = null;
    public DataService() { super(); }
    public abstract android.telephony.data.DataService.DataServiceProvider onCreateDataServiceProvider(int p0);
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public boolean onUnbind(android.content.Intent p0) { return false; }
    public void onDestroy() {}
    private void log(java.lang.String p0) {}
    private void loge(java.lang.String p0) {}

    private static final class ApnUnthrottledIndication {
        public final java.lang.String apn = null;
        public final android.telephony.data.IDataServiceCallback callback = null;
        ApnUnthrottledIndication(java.lang.String p0, android.telephony.data.IDataServiceCallback p1) {}
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
        private final int mSlotIndex = 0;
        private final java.util.List<android.telephony.data.IDataServiceCallback> mDataCallListChangedCallbacks = null;
        private final java.util.List<android.telephony.data.IDataServiceCallback> mApnUnthrottledCallbacks = null;
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
        private void registerForDataCallListChanged(android.telephony.data.IDataServiceCallback p0) {}
        private void unregisterForDataCallListChanged(android.telephony.data.IDataServiceCallback p0) {}
        private void registerForApnUnthrottled(android.telephony.data.IDataServiceCallback p0) {}
        private void unregisterForApnUnthrottled(android.telephony.data.IDataServiceCallback p0) {}
        public final void notifyDataCallListChanged(java.util.List<android.telephony.data.DataCallResponse> p0) {}
        public final void notifyApnUnthrottled(java.lang.String p0) {}
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
        private IDataServiceWrapper(android.telephony.data.DataService p0) { super(); }
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
}
