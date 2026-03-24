package android.bluetooth.le;

public final class DistanceMeasurementResult implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.le.DistanceMeasurementResult> CREATOR = null;
    public static final int NADM_ATTACK_IS_EXTREMELY_LIKELY = 6;
    public static final int NADM_ATTACK_IS_EXTREMELY_UNLIKELY = 0;
    public static final int NADM_ATTACK_IS_LIKELY = 4;
    public static final int NADM_ATTACK_IS_POSSIBLE = 3;
    public static final int NADM_ATTACK_IS_UNLIKELY = 2;
    public static final int NADM_ATTACK_IS_VERY_LIKELY = 5;
    public static final int NADM_ATTACK_IS_VERY_UNLIKELY = 1;
    public static final int NADM_UNKNOWN = 255;
    DistanceMeasurementResult() {}
    public int describeContents() { return 0; }
    public double getAltitudeAngle() { return 0.0; }
    public double getAzimuthAngle() { return 0.0; }
    public double getConfidenceLevel() { return 0.0; }
    public double getDelaySpreadMeters() { return 0.0; }
    public int getDetectedAttackLevel() { return 0; }
    public double getErrorAltitudeAngle() { return 0.0; }
    public double getErrorAzimuthAngle() { return 0.0; }
    public double getErrorMeters() { return 0.0; }
    public double getResultMeters() { return 0.0; }
    public double getVelocityMetersPerSecond() { return 0.0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(double p0, double p1) {}
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementResult build() { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementResult.Builder setAltitudeAngle(double p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementResult.Builder setAzimuthAngle(double p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementResult.Builder setConfidenceLevel(double p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementResult.Builder setDelaySpreadMeters(double p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementResult.Builder setDetectedAttackLevel(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementResult.Builder setErrorAltitudeAngle(double p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementResult.Builder setErrorAzimuthAngle(double p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementResult.Builder setVelocityMetersPerSecond(double p0) { return null; }
    }
}
