package android.bluetooth.le;

public final class DistanceMeasurementResult implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.le.DistanceMeasurementResult> CREATOR = null;
    DistanceMeasurementResult() {}
    public double getResultMeters() { return 0.0; }
    public double getErrorMeters() { return 0.0; }
    public double getAzimuthAngle() { return 0.0; }
    public double getErrorAzimuthAngle() { return 0.0; }
    public double getAltitudeAngle() { return 0.0; }
    public double getErrorAltitudeAngle() { return 0.0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(double p0, double p1) {}
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementResult.Builder setAzimuthAngle(double p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementResult.Builder setErrorAzimuthAngle(double p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementResult.Builder setAltitudeAngle(double p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementResult.Builder setErrorAltitudeAngle(double p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementResult build() { return null; }
    }
}
