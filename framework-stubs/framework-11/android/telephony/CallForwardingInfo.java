package android.telephony;

public final class CallForwardingInfo implements android.os.Parcelable {
    private static final java.lang.String TAG = "CallForwardingInfo";
    public static final int STATUS_INACTIVE = 0;
    public static final int STATUS_ACTIVE = 1;
    public static final int STATUS_FDN_CHECK_FAILURE = 2;
    public static final int STATUS_UNKNOWN_ERROR = 3;
    public static final int STATUS_NOT_SUPPORTED = 4;
    public static final int REASON_UNCONDITIONAL = 0;
    public static final int REASON_BUSY = 1;
    public static final int REASON_NO_REPLY = 2;
    public static final int REASON_NOT_REACHABLE = 3;
    public static final int REASON_ALL = 4;
    public static final int REASON_ALL_CONDITIONAL = 5;
    private int mStatus;
    private int mReason;
    private java.lang.String mNumber;
    private int mTimeSeconds;
    public static final android.os.Parcelable.Creator<android.telephony.CallForwardingInfo> CREATOR = null;
    public CallForwardingInfo(int p0, int p1, java.lang.String p2, int p3) {}
    public int getStatus() { return 0; }
    public int getReason() { return 0; }
    public java.lang.String getNumber() { return null; }
    @android.annotation.SuppressLint("MethodNameUnits")
    public int getTimeoutSeconds() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private CallForwardingInfo(android.os.Parcel p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CallForwardingReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CallForwardingStatus {
    }
}
