package android.telephony;

public class MbmsGroupCallSession implements java.lang.AutoCloseable {
    @android.annotation.SystemApi
    public static final java.lang.String MBMS_GROUP_CALL_SERVICE_ACTION = "android.telephony.action.EmbmsGroupCall";
    public static final java.lang.String MBMS_GROUP_CALL_SERVICE_OVERRIDE_METADATA = "mbms-group-call-service-override";
    @android.annotation.Nullable
    public static android.telephony.MbmsGroupCallSession create(android.content.Context p0, int p1, java.util.concurrent.Executor p2, android.telephony.mbms.MbmsGroupCallSessionCallback p3) { return null; }
    @android.annotation.Nullable
    public static android.telephony.MbmsGroupCallSession create(android.content.Context p0, java.util.concurrent.Executor p1, android.telephony.mbms.MbmsGroupCallSessionCallback p2) { return null; }
    public void close() {}
    @android.annotation.Nullable
    public android.telephony.mbms.GroupCall startGroupCall(long p0, java.util.List<java.lang.Integer> p1, java.util.List<java.lang.Integer> p2, java.util.concurrent.Executor p3, android.telephony.mbms.GroupCallCallback p4) { return null; }
    public void onGroupCallStopped(android.telephony.mbms.GroupCall p0) {}
}
