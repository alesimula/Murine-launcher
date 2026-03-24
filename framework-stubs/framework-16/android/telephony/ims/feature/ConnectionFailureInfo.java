package android.telephony.ims.feature;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.support_ims_mmtel_interface")
public final class ConnectionFailureInfo implements android.os.Parcelable {
    public static final int REASON_NONE = 0;
    public static final int REASON_ACCESS_DENIED = 1;
    public static final int REASON_NAS_FAILURE = 2;
    public static final int REASON_RACH_FAILURE = 3;
    public static final int REASON_RLC_FAILURE = 4;
    public static final int REASON_RRC_REJECT = 5;
    public static final int REASON_RRC_TIMEOUT = 6;
    public static final int REASON_NO_SERVICE = 7;
    public static final int REASON_PDN_NOT_AVAILABLE = 8;
    public static final int REASON_RF_BUSY = 9;
    public static final int REASON_UNSPECIFIED = 65535;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.ims.feature.ConnectionFailureInfo> CREATOR = null;
    public ConnectionFailureInfo(int p0, int p1, int p2) {}
    public int getReason() { return 0; }
    public int getCauseCode() { return 0; }
    public int getWaitTimeMillis() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FailureReason {
    }
}
