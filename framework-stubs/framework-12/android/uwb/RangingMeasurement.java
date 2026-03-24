package android.uwb;

@android.annotation.SystemApi
public final class RangingMeasurement implements android.os.Parcelable {
    private final android.uwb.UwbAddress mRemoteDeviceAddress = null;
    private final int mStatus = 0;
    private final long mElapsedRealtimeNanos = 0L;
    private final android.uwb.DistanceMeasurement mDistanceMeasurement = null;
    private final android.uwb.AngleOfArrivalMeasurement mAngleOfArrivalMeasurement = null;
    public static final int RANGING_STATUS_SUCCESS = 0;
    public static final int RANGING_STATUS_FAILURE_OUT_OF_RANGE = 1;
    public static final int RANGING_STATUS_FAILURE_UNKNOWN_ERROR = -1;
    public static final android.os.Parcelable.Creator<android.uwb.RangingMeasurement> CREATOR = null;
    private RangingMeasurement(android.uwb.UwbAddress p0, int p1, long p2, android.uwb.DistanceMeasurement p3, android.uwb.AngleOfArrivalMeasurement p4) {}
    public android.uwb.UwbAddress getRemoteDeviceAddress() { return null; }
    public int getStatus() { return 0; }
    @android.annotation.SuppressLint("MethodNameUnits")
    public long getElapsedRealtimeNanos() { return 0L; }
    public android.uwb.DistanceMeasurement getDistanceMeasurement() { return null; }
    public android.uwb.AngleOfArrivalMeasurement getAngleOfArrivalMeasurement() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.uwb.UwbAddress mRemoteDeviceAddress;
        private int mStatus;
        private long mElapsedRealtimeNanos;
        private android.uwb.DistanceMeasurement mDistanceMeasurement;
        private android.uwb.AngleOfArrivalMeasurement mAngleOfArrivalMeasurement;
        public Builder() {}
        public android.uwb.RangingMeasurement.Builder setRemoteDeviceAddress(android.uwb.UwbAddress p0) { return null; }
        public android.uwb.RangingMeasurement.Builder setStatus(int p0) { return null; }
        public android.uwb.RangingMeasurement.Builder setElapsedRealtimeNanos(long p0) { return null; }
        public android.uwb.RangingMeasurement.Builder setDistanceMeasurement(android.uwb.DistanceMeasurement p0) { return null; }
        public android.uwb.RangingMeasurement.Builder setAngleOfArrivalMeasurement(android.uwb.AngleOfArrivalMeasurement p0) { return null; }
        public android.uwb.RangingMeasurement build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }
}
