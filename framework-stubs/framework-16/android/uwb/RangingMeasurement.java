package android.uwb;

public final class RangingMeasurement implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.uwb.RangingMeasurement> CREATOR = null;
    public static final int LOS = 0;
    public static final int LOS_UNDETERMINED = 255;
    public static final int MEASUREMENT_FOCUS_ANGLE_OF_ARRIVAL_AZIMUTH = 2;
    public static final int MEASUREMENT_FOCUS_ANGLE_OF_ARRIVAL_ELEVATION = 3;
    public static final int MEASUREMENT_FOCUS_NONE = 0;
    public static final int MEASUREMENT_FOCUS_RANGE = 1;
    public static final int NLOS = 1;
    @android.annotation.FlaggedApi("com.android.uwb.flags.uwb_fira_3_0_25q4")
    public static final int NON_HYBRID_UWB_SESSION_ID = 0;
    public static final int RANGING_STATUS_FAILURE_OUT_OF_RANGE = 1;
    public static final int RANGING_STATUS_FAILURE_UNKNOWN_ERROR = -1;
    public static final int RANGING_STATUS_SUCCESS = 0;
    public static final int RSSI_MAX = -1;
    public static final int RSSI_MIN = -127;
    public static final int RSSI_UNKNOWN = -128;
    RangingMeasurement() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public android.uwb.AngleOfArrivalMeasurement getAngleOfArrivalMeasurement() { return null; }
    @android.annotation.Nullable
    public android.uwb.AngleOfArrivalMeasurement getDestinationAngleOfArrivalMeasurement() { return null; }
    @android.annotation.Nullable
    public android.uwb.DistanceMeasurement getDistanceMeasurement() { return null; }
    public long getElapsedRealtimeNanos() { return 0L; }
    @android.annotation.FlaggedApi("com.android.uwb.flags.uwb_fira_3_0_25q4")
    public long getHusPrimarySessionId() { return 0L; }
    public int getLineOfSight() { return 0; }
    public int getMeasurementFocus() { return 0; }
    @android.annotation.NonNull
    public android.os.PersistableBundle getRangingMeasurementMetadata() { return null; }
    @android.annotation.NonNull
    public android.uwb.UwbAddress getRemoteDeviceAddress() { return null; }
    public int getRssiDbm() { return 0; }
    public int getStatus() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.uwb.RangingMeasurement build() { return null; }
        @android.annotation.NonNull
        public android.uwb.RangingMeasurement.Builder setAngleOfArrivalMeasurement(android.uwb.AngleOfArrivalMeasurement p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.RangingMeasurement.Builder setDestinationAngleOfArrivalMeasurement(android.uwb.AngleOfArrivalMeasurement p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.RangingMeasurement.Builder setDistanceMeasurement(android.uwb.DistanceMeasurement p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.RangingMeasurement.Builder setElapsedRealtimeNanos(long p0) { return null; }
        @android.annotation.FlaggedApi("com.android.uwb.flags.uwb_fira_3_0_25q4")
        @android.annotation.NonNull
        public android.uwb.RangingMeasurement.Builder setHusPrimarySessionId(long p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.RangingMeasurement.Builder setLineOfSight(int p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.RangingMeasurement.Builder setMeasurementFocus(int p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.RangingMeasurement.Builder setRangingMeasurementMetadata(android.os.PersistableBundle p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.RangingMeasurement.Builder setRemoteDeviceAddress(android.uwb.UwbAddress p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.RangingMeasurement.Builder setRssiDbm(int p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.RangingMeasurement.Builder setStatus(int p0) { return null; }
    }
}
