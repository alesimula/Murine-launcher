package android.telecom;

public abstract class CallScreeningService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.telecom.CallScreeningService";
    private static final int MSG_SCREEN_CALL = 1;
    private final android.os.Handler mHandler = null;
    private com.android.internal.telecom.ICallScreeningAdapter mCallScreeningAdapter;
    public CallScreeningService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public boolean onUnbind(android.content.Intent p0) { return false; }
    public abstract void onScreenCall(android.telecom.Call.Details p0);
    public final void respondToCall(android.telecom.Call.Details p0, android.telecom.CallScreeningService.CallResponse p1) {}

    private final class CallScreeningBinder extends com.android.internal.telecom.ICallScreeningService.Stub {
        private CallScreeningBinder(android.telecom.CallScreeningService p0) { super(); }
        public void screenCall(com.android.internal.telecom.ICallScreeningAdapter p0, android.telecom.ParcelableCall p1) {}
    }

    public static class CallResponse {
        private final boolean mShouldDisallowCall = false;
        private final boolean mShouldRejectCall = false;
        private final boolean mShouldSilenceCall = false;
        private final boolean mShouldSkipCallLog = false;
        private final boolean mShouldSkipNotification = false;
        private CallResponse(boolean p0, boolean p1, boolean p2, boolean p3, boolean p4) {}
        public boolean getDisallowCall() { return false; }
        public boolean getRejectCall() { return false; }
        public boolean getSilenceCall() { return false; }
        public boolean getSkipCallLog() { return false; }
        public boolean getSkipNotification() { return false; }

        public static class Builder {
            private boolean mShouldDisallowCall;
            private boolean mShouldRejectCall;
            private boolean mShouldSilenceCall;
            private boolean mShouldSkipCallLog;
            private boolean mShouldSkipNotification;
            public Builder() {}
            public android.telecom.CallScreeningService.CallResponse.Builder setDisallowCall(boolean p0) { return null; }
            public android.telecom.CallScreeningService.CallResponse.Builder setRejectCall(boolean p0) { return null; }
            public android.telecom.CallScreeningService.CallResponse.Builder setSilenceCall(boolean p0) { return null; }
            public android.telecom.CallScreeningService.CallResponse.Builder setSkipCallLog(boolean p0) { return null; }
            public android.telecom.CallScreeningService.CallResponse.Builder setSkipNotification(boolean p0) { return null; }
            public android.telecom.CallScreeningService.CallResponse build() { return null; }
        }
    }
}
