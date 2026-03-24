package android.net.wifi.rtt;

public final class RangingResult implements android.os.Parcelable {
    private static final java.lang.String TAG = "RangingResult";
    private static final byte[] EMPTY_BYTE_ARRAY = null;
    public static final int STATUS_SUCCESS = 0;
    public static final int STATUS_FAIL = 1;
    public static final int STATUS_RESPONDER_DOES_NOT_SUPPORT_IEEE80211MC = 2;
    private final int mStatus = 0;
    private final android.net.MacAddress mMac = null;
    private final android.net.wifi.aware.PeerHandle mPeerHandle = null;
    private final int mDistanceMm = 0;
    private final int mDistanceStdDevMm = 0;
    private final int mRssi = 0;
    private final int mNumAttemptedMeasurements = 0;
    private final int mNumSuccessfulMeasurements = 0;
    private final byte[] mLci = null;
    private final byte[] mLcr = null;
    private final android.net.wifi.rtt.ResponderLocation mResponderLocation = null;
    private final long mTimestamp = 0L;
    public static final android.os.Parcelable.Creator<android.net.wifi.rtt.RangingResult> CREATOR = null;
    public RangingResult(int p0, android.net.MacAddress p1, int p2, int p3, int p4, int p5, int p6, byte[] p7, byte[] p8, android.net.wifi.rtt.ResponderLocation p9, long p10) {}
    public RangingResult(int p0, android.net.wifi.aware.PeerHandle p1, int p2, int p3, int p4, int p5, int p6, byte[] p7, byte[] p8, android.net.wifi.rtt.ResponderLocation p9, long p10) {}
    public int getStatus() { return 0; }
    public android.net.MacAddress getMacAddress() { return null; }
    public android.net.wifi.aware.PeerHandle getPeerHandle() { return null; }
    public int getDistanceMm() { return 0; }
    public int getDistanceStdDevMm() { return 0; }
    public int getRssi() { return 0; }
    public int getNumAttemptedMeasurements() { return 0; }
    public int getNumSuccessfulMeasurements() { return 0; }
    public android.net.wifi.rtt.ResponderLocation getUnverifiedResponderLocation() { return null; }
    @android.annotation.SystemApi
    public byte[] getLci() { return null; }
    @android.annotation.SystemApi
    public byte[] getLcr() { return null; }
    public long getRangingTimestampMillis() { return 0L; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RangeResultStatus {
    }
}
