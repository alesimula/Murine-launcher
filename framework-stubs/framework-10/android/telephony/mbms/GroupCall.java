package android.telephony.mbms;

public class GroupCall implements java.lang.AutoCloseable {
    private static final java.lang.String LOG_TAG = "MbmsGroupCall";
    public static final int STATE_STOPPED = 1;
    public static final int STATE_STARTED = 2;
    public static final int STATE_STALLED = 3;
    public static final int REASON_NONE = 0;
    public static final int REASON_BY_USER_REQUEST = 1;
    public static final int REASON_FREQUENCY_CONFLICT = 3;
    public static final int REASON_OUT_OF_MEMORY = 4;
    public static final int REASON_NOT_CONNECTED_TO_HOMECARRIER_LTE = 5;
    public static final int REASON_LEFT_MBMS_BROADCAST_AREA = 6;
    private final int mSubscriptionId = 0;
    private final long mTmgi = 0L;
    private final android.telephony.MbmsGroupCallSession mParentSession = null;
    private final android.telephony.mbms.InternalGroupCallCallback mCallback = null;
    private android.telephony.mbms.vendor.IMbmsGroupCallService mService;
    public GroupCall(int p0, android.telephony.mbms.vendor.IMbmsGroupCallService p1, android.telephony.MbmsGroupCallSession p2, long p3, android.telephony.mbms.InternalGroupCallCallback p4) {}
    public long getTmgi() { return 0L; }
    public void updateGroupCall(java.util.List<java.lang.Integer> p0, java.util.List<java.lang.Integer> p1) {}
    public void close() {}
    public android.telephony.mbms.InternalGroupCallCallback getCallback() { return null; }
    private void sendErrorToApp(int p0, java.lang.String p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GroupCallStateChangeReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GroupCallState {
    }
}
