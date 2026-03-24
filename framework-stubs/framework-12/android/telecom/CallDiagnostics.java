package android.telecom;

@android.annotation.SystemApi
public abstract class CallDiagnostics {
    public static final int MESSAGE_CALL_NETWORK_TYPE = 1;
    public static final int MESSAGE_CALL_AUDIO_CODEC = 2;
    public static final int MESSAGE_DEVICE_BATTERY_STATE = 3;
    public static final int MESSAGE_DEVICE_NETWORK_COVERAGE = 4;
    public static final int BATTERY_STATE_LOW = 1;
    public static final int BATTERY_STATE_GOOD = 2;
    public static final int BATTERY_STATE_CHARGING = 3;
    public static final int COVERAGE_POOR = 1;
    public static final int COVERAGE_GOOD = 2;
    private android.telecom.CallDiagnostics.Listener mListener;
    private java.lang.String mCallId;
    public CallDiagnostics() {}
    public void setListener(android.telecom.CallDiagnostics.Listener p0) {}
    public void setCallId(java.lang.String p0) {}
    public java.lang.String getCallId() { return null; }
    public abstract void onCallDetailsChanged(android.telecom.Call.Details p0);
    public abstract void onReceiveDeviceToDeviceMessage(int p0, int p1);
    public final void sendDeviceToDeviceMessage(int p0, int p1) {}
    public abstract java.lang.CharSequence onCallDisconnected(int p0, int p1);
    public abstract java.lang.CharSequence onCallDisconnected(android.telephony.ims.ImsReasonInfo p0);
    public abstract void onCallQualityReceived(android.telephony.CallQuality p0);
    public final void displayDiagnosticMessage(int p0, java.lang.CharSequence p1) {}
    public final void clearDiagnosticMessage(int p0) {}
    public void handleCallUpdated(android.telecom.Call.Details p0) {}

    public static interface Listener {
        public void onSendDeviceToDeviceMessage(android.telecom.CallDiagnostics p0, int p1, int p2);
        public void onDisplayDiagnosticMessage(android.telecom.CallDiagnostics p0, int p1, java.lang.CharSequence p2);
        public void onClearDiagnosticMessage(android.telecom.CallDiagnostics p0, int p1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MessageType {
    }
}
