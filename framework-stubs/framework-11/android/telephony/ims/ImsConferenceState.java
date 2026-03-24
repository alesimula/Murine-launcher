package android.telephony.ims;

@android.annotation.SystemApi
public final class ImsConferenceState implements android.os.Parcelable {
    private static final java.lang.String TAG = "ImsConferenceState";
    public static final java.lang.String USER = "user";
    public static final java.lang.String DISPLAY_TEXT = "display-text";
    public static final java.lang.String ENDPOINT = "endpoint";
    public static final java.lang.String STATUS = "status";
    public static final java.lang.String STATUS_PENDING = "pending";
    public static final java.lang.String STATUS_DIALING_OUT = "dialing-out";
    public static final java.lang.String STATUS_DIALING_IN = "dialing-in";
    public static final java.lang.String STATUS_ALERTING = "alerting";
    public static final java.lang.String STATUS_ON_HOLD = "on-hold";
    public static final java.lang.String STATUS_CONNECTED = "connected";
    public static final java.lang.String STATUS_DISCONNECTING = "disconnecting";
    public static final java.lang.String STATUS_DISCONNECTED = "disconnected";
    public static final java.lang.String STATUS_MUTED_VIA_FOCUS = "muted-via-focus";
    public static final java.lang.String STATUS_CONNECT_FAIL = "connect-fail";
    public static final java.lang.String STATUS_SEND_ONLY = "sendonly";
    public static final java.lang.String STATUS_SEND_RECV = "sendrecv";
    public static final java.lang.String SIP_STATUS_CODE = "sipstatuscode";
    public final java.util.HashMap<java.lang.String, android.os.Bundle> mParticipants = null;
    public static final android.os.Parcelable.Creator<android.telephony.ims.ImsConferenceState> CREATOR = null;
    public ImsConferenceState() {}
    private ImsConferenceState(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private void readFromParcel(android.os.Parcel p0) {}
    public static int getConnectionStateForStatus(java.lang.String p0) { return 0; }
    public java.lang.String toString() { return null; }
}
