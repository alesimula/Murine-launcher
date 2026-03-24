package android.telephony;

@android.annotation.SystemApi
public final class CallForwardingInfo implements android.os.Parcelable {
    public static final int REASON_UNCONDITIONAL = 0;
    public static final int REASON_BUSY = 1;
    public static final int REASON_NO_REPLY = 2;
    public static final int REASON_NOT_REACHABLE = 3;
    public static final int REASON_ALL = 4;
    public static final int REASON_ALL_CONDITIONAL = 5;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.CallForwardingInfo> CREATOR = null;
    public CallForwardingInfo(boolean p0, int p1, java.lang.String p2, int p3) {}
    public boolean isEnabled() { return false; }
    public int getReason() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getNumber() { return null; }
    @android.annotation.SuppressLint("MethodNameUnits")
    public int getTimeoutSeconds() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CallForwardingReason {
    }
}
