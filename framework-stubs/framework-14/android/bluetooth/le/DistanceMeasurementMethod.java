package android.bluetooth.le;

public final class DistanceMeasurementMethod implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.le.DistanceMeasurementMethod> CREATOR = null;
    public static final int DISTANCE_MEASUREMENT_METHOD_AUTO = 0;
    public static final int DISTANCE_MEASUREMENT_METHOD_RSSI = 1;
    DistanceMeasurementMethod() {}
    public double getId() { return 0.0; }
    public boolean isAzimuthAngleSupported() { return false; }
    public boolean isAltitudeAngleSupported() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementMethod.Builder setAzimuthAngleSupported(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementMethod.Builder setAltitudeAngleSupported(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementMethod build() { return null; }
    }
}
