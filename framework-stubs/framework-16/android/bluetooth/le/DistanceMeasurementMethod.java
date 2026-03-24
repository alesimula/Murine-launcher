package android.bluetooth.le;

public final class DistanceMeasurementMethod implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.le.DistanceMeasurementMethod> CREATOR = null;
    public static final int DISTANCE_MEASUREMENT_METHOD_AUTO = 0;
    public static final int DISTANCE_MEASUREMENT_METHOD_CHANNEL_SOUNDING = 2;
    public static final int DISTANCE_MEASUREMENT_METHOD_RSSI = 1;
    DistanceMeasurementMethod() {}
    public int describeContents() { return 0; }
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.channel_sounding_25q2_apis")
    public double getId() { return 0.0; }
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.channel_sounding_25q2_apis")
    public int getMethodId() { return 0; }
    public boolean isAltitudeAngleSupported() { return false; }
    public boolean isAzimuthAngleSupported() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementMethod build() { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementMethod.Builder setAltitudeAngleSupported(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementMethod.Builder setAzimuthAngleSupported(boolean p0) { return null; }
    }
}
