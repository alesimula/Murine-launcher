package android.net.wifi.rtt;

public final class RangingResult implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.rtt.RangingResult> CREATOR = null;
    public static final int STATUS_FAIL = 1;
    public static final int STATUS_RESPONDER_DOES_NOT_SUPPORT_IEEE80211MC = 2;
    public static final int STATUS_SUCCESS = 0;
    RangingResult() {}
    public int getStatus() { return 0; }
    @android.annotation.Nullable
    public android.net.MacAddress getMacAddress() { return null; }
    @android.annotation.Nullable
    public android.net.wifi.aware.PeerHandle getPeerHandle() { return null; }
    public int getDistanceMm() { return 0; }
    public int getDistanceStdDevMm() { return 0; }
    public int getRssi() { return 0; }
    public int getNumAttemptedMeasurements() { return 0; }
    public int getNumSuccessfulMeasurements() { return 0; }
    @android.annotation.Nullable
    public android.net.wifi.rtt.ResponderLocation getUnverifiedResponderLocation() { return null; }
    @android.annotation.NonNull
    public byte[] getLci() { return null; }
    @android.annotation.NonNull
    public byte[] getLcr() { return null; }
    public long getRangingTimestampMillis() { return 0L; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
