package android.hardware.radio.ims;

public class ConnectionFailureInfo implements android.os.Parcelable {
    public int failureReason;
    public int causeCode;
    public int waitTimeMillis;
    public static final android.os.Parcelable.Creator<android.hardware.radio.ims.ConnectionFailureInfo> CREATOR = null;
    public ConnectionFailureInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }

    public static @interface ConnectionFailureReason {
        public static final int INVALID = 0;
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
    }
}
