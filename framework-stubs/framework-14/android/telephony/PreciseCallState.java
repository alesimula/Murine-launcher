package android.telephony;

@android.annotation.SystemApi
public final class PreciseCallState implements android.os.Parcelable {
    public static final int PRECISE_CALL_STATE_NOT_VALID = -1;
    public static final int PRECISE_CALL_STATE_IDLE = 0;
    public static final int PRECISE_CALL_STATE_ACTIVE = 1;
    public static final int PRECISE_CALL_STATE_HOLDING = 2;
    public static final int PRECISE_CALL_STATE_DIALING = 3;
    public static final int PRECISE_CALL_STATE_ALERTING = 4;
    public static final int PRECISE_CALL_STATE_INCOMING = 5;
    public static final int PRECISE_CALL_STATE_WAITING = 6;
    public static final int PRECISE_CALL_STATE_DISCONNECTED = 7;
    public static final int PRECISE_CALL_STATE_DISCONNECTING = 8;
    public static final int PRECISE_CALL_STATE_INCOMING_SETUP = 9;
    public static final android.os.Parcelable.Creator<android.telephony.PreciseCallState> CREATOR = null;
    @android.annotation.SystemApi
    public PreciseCallState(int p0, int p1, int p2, int p3, int p4) {}
    public PreciseCallState() {}
    public int getRingingCallState() { return 0; }
    public int getForegroundCallState() { return 0; }
    public int getBackgroundCallState() { return 0; }
    public int getDisconnectCause() { return 0; }
    public int getPreciseDisconnectCause() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
}
