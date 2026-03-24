package android.telephony;

public class MbmsGroupCallSession implements java.lang.AutoCloseable {
    private static final java.lang.String LOG_TAG = "MbmsGroupCallSession";
    @android.annotation.SystemApi
    public static final java.lang.String MBMS_GROUP_CALL_SERVICE_ACTION = "android.telephony.action.EmbmsGroupCall";
    public static final java.lang.String MBMS_GROUP_CALL_SERVICE_OVERRIDE_METADATA = "mbms-group-call-service-override";
    private static java.util.concurrent.atomic.AtomicBoolean sIsInitialized;
    private java.util.concurrent.atomic.AtomicReference<android.telephony.mbms.vendor.IMbmsGroupCallService> mService;
    private android.os.IBinder.DeathRecipient mDeathRecipient;
    private android.telephony.mbms.InternalGroupCallSessionCallback mInternalCallback;
    private android.content.ServiceConnection mServiceConnection;
    private java.util.Set<android.telephony.mbms.GroupCall> mKnownActiveGroupCalls;
    private final android.content.Context mContext = null;
    private int mSubscriptionId;
    private MbmsGroupCallSession(android.content.Context p0, java.util.concurrent.Executor p1, int p2, android.telephony.mbms.MbmsGroupCallSessionCallback p3) {}
    public static android.telephony.MbmsGroupCallSession create(android.content.Context p0, int p1, java.util.concurrent.Executor p2, android.telephony.mbms.MbmsGroupCallSessionCallback p3) { return null; }
    public static android.telephony.MbmsGroupCallSession create(android.content.Context p0, java.util.concurrent.Executor p1, android.telephony.mbms.MbmsGroupCallSessionCallback p2) { return null; }
    public void close() {}
    public android.telephony.mbms.GroupCall startGroupCall(long p0, java.util.List<java.lang.Integer> p1, java.util.List<java.lang.Integer> p2, java.util.concurrent.Executor p3, android.telephony.mbms.GroupCallCallback p4) { return null; }
    public void onGroupCallStopped(android.telephony.mbms.GroupCall p0) {}
    private int bindAndInitialize() { return 0; }
}
