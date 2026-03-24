package android.telecom;

public abstract class CallRedirectionService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.telecom.CallRedirectionService";
    private com.android.internal.telecom.ICallRedirectionAdapter mCallRedirectionAdapter;
    private static final int MSG_PLACE_CALL = 1;
    private final android.os.Handler mHandler = null;
    public CallRedirectionService() { super(); }
    public abstract void onPlaceCall(android.net.Uri p0, android.telecom.PhoneAccountHandle p1, boolean p2);
    public final void placeCallUnmodified() {}
    public final void redirectCall(android.net.Uri p0, android.telecom.PhoneAccountHandle p1, boolean p2) {}
    public final void cancelCall() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public final boolean onUnbind(android.content.Intent p0) { return false; }

    private final class CallRedirectionBinder extends com.android.internal.telecom.ICallRedirectionService.Stub {
        private CallRedirectionBinder(android.telecom.CallRedirectionService p0) { super(); }
        public void placeCall(com.android.internal.telecom.ICallRedirectionAdapter p0, android.net.Uri p1, android.telecom.PhoneAccountHandle p2, boolean p3) {}
    }
}
