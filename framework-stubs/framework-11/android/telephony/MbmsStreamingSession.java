package android.telephony;

public class MbmsStreamingSession implements java.lang.AutoCloseable {
    private static final java.lang.String LOG_TAG = "MbmsStreamingSession";
    @android.annotation.SystemApi
    public static final java.lang.String MBMS_STREAMING_SERVICE_ACTION = "android.telephony.action.EmbmsStreaming";
    public static final java.lang.String MBMS_STREAMING_SERVICE_OVERRIDE_METADATA = "mbms-streaming-service-override";
    private static java.util.concurrent.atomic.AtomicBoolean sIsInitialized;
    private java.util.concurrent.atomic.AtomicReference<android.telephony.mbms.vendor.IMbmsStreamingService> mService;
    private android.os.IBinder.DeathRecipient mDeathRecipient;
    private android.telephony.mbms.InternalStreamingSessionCallback mInternalCallback;
    private android.content.ServiceConnection mServiceConnection;
    private java.util.Set<android.telephony.mbms.StreamingService> mKnownActiveStreamingServices;
    private final android.content.Context mContext = null;
    private int mSubscriptionId;
    private MbmsStreamingSession(android.content.Context p0, java.util.concurrent.Executor p1, int p2, android.telephony.mbms.MbmsStreamingSessionCallback p3) {}
    public static android.telephony.MbmsStreamingSession create(android.content.Context p0, java.util.concurrent.Executor p1, int p2, android.telephony.mbms.MbmsStreamingSessionCallback p3) { return null; }
    public static android.telephony.MbmsStreamingSession create(android.content.Context p0, java.util.concurrent.Executor p1, android.telephony.mbms.MbmsStreamingSessionCallback p2) { return null; }
    public void close() {}
    public void requestUpdateStreamingServices(java.util.List<java.lang.String> p0) {}
    public android.telephony.mbms.StreamingService startStreaming(android.telephony.mbms.StreamingServiceInfo p0, java.util.concurrent.Executor p1, android.telephony.mbms.StreamingServiceCallback p2) { return null; }
    public void onStreamingServiceStopped(android.telephony.mbms.StreamingService p0) {}
    private int bindAndInitialize() { return 0; }
    private void sendErrorToApp(int p0, java.lang.String p1) {}
}
