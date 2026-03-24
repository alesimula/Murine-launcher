package android.telecom;

public final class DisconnectCause implements android.os.Parcelable {
    public static final int UNKNOWN = 0;
    public static final int ERROR = 1;
    public static final int LOCAL = 2;
    public static final int REMOTE = 3;
    public static final int CANCELED = 4;
    public static final int MISSED = 5;
    public static final int REJECTED = 6;
    public static final int BUSY = 7;
    public static final int RESTRICTED = 8;
    public static final int OTHER = 9;
    public static final int CONNECTION_MANAGER_NOT_SUPPORTED = 10;
    public static final int ANSWERED_ELSEWHERE = 11;
    public static final int CALL_PULLED = 12;
    public static final java.lang.String REASON_WIFI_ON_BUT_WFC_OFF = "REASON_WIFI_ON_BUT_WFC_OFF";
    public static final java.lang.String REASON_IMS_ACCESS_BLOCKED = "REASON_IMS_ACCESS_BLOCKED";
    public static final java.lang.String REASON_EMULATING_SINGLE_CALL = "EMULATING_SINGLE_CALL";
    private int mDisconnectCode;
    private java.lang.CharSequence mDisconnectLabel;
    private java.lang.CharSequence mDisconnectDescription;
    private java.lang.String mDisconnectReason;
    private int mToneToPlay;
    public static final android.os.Parcelable.Creator<android.telecom.DisconnectCause> CREATOR = null;
    public DisconnectCause(int p0) {}
    public DisconnectCause(int p0, java.lang.String p1) {}
    public DisconnectCause(int p0, java.lang.CharSequence p1, java.lang.CharSequence p2, java.lang.String p3) {}
    public DisconnectCause(int p0, java.lang.CharSequence p1, java.lang.CharSequence p2, java.lang.String p3, int p4) {}
    public int getCode() { return 0; }
    public java.lang.CharSequence getLabel() { return null; }
    public java.lang.CharSequence getDescription() { return null; }
    public java.lang.String getReason() { return null; }
    public int getTone() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
}
