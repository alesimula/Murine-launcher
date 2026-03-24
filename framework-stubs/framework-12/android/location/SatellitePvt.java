package android.location;

@android.annotation.SystemApi
public final class SatellitePvt implements android.os.Parcelable {
    private static final int HAS_POSITION_VELOCITY_CLOCK_INFO = 1;
    private static final int HAS_IONO = 2;
    private static final int HAS_TROPO = 4;
    private final int mFlags = 0;
    private final android.location.SatellitePvt.PositionEcef mPositionEcef = null;
    private final android.location.SatellitePvt.VelocityEcef mVelocityEcef = null;
    private final android.location.SatellitePvt.ClockInfo mClockInfo = null;
    private final double mIonoDelayMeters = 0.0;
    private final double mTropoDelayMeters = 0.0;
    public static final android.os.Parcelable.Creator<android.location.SatellitePvt> CREATOR = null;
    private SatellitePvt(int p0, android.location.SatellitePvt.PositionEcef p1, android.location.SatellitePvt.VelocityEcef p2, android.location.SatellitePvt.ClockInfo p3, double p4, double p5) {}
    public android.location.SatellitePvt.PositionEcef getPositionEcef() { return null; }
    public android.location.SatellitePvt.VelocityEcef getVelocityEcef() { return null; }
    public android.location.SatellitePvt.ClockInfo getClockInfo() { return null; }
    public double getIonoDelayMeters() { return 0.0; }
    public double getTropoDelayMeters() { return 0.0; }
    public boolean hasPositionVelocityClockInfo() { return false; }
    public boolean hasIono() { return false; }
    public boolean hasTropo() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private int mFlags;
        private android.location.SatellitePvt.PositionEcef mPositionEcef;
        private android.location.SatellitePvt.VelocityEcef mVelocityEcef;
        private android.location.SatellitePvt.ClockInfo mClockInfo;
        private double mIonoDelayMeters;
        private double mTropoDelayMeters;
        public Builder() {}
        public android.location.SatellitePvt.Builder setPositionEcef(android.location.SatellitePvt.PositionEcef p0) { return null; }
        public android.location.SatellitePvt.Builder setVelocityEcef(android.location.SatellitePvt.VelocityEcef p0) { return null; }
        public android.location.SatellitePvt.Builder setClockInfo(android.location.SatellitePvt.ClockInfo p0) { return null; }
        private void updateFlags() {}
        public android.location.SatellitePvt.Builder setIonoDelayMeters(double p0) { return null; }
        public android.location.SatellitePvt.Builder setTropoDelayMeters(double p0) { return null; }
        public android.location.SatellitePvt build() { return null; }
    }

    public static final class ClockInfo implements android.os.Parcelable {
        private final double mHardwareCodeBiasMeters = 0.0;
        private final double mTimeCorrectionMeters = 0.0;
        private final double mClockDriftMetersPerSecond = 0.0;
        public static final android.os.Parcelable.Creator<android.location.SatellitePvt.ClockInfo> CREATOR = null;
        public ClockInfo(double p0, double p1, double p2) {}
        public double getHardwareCodeBiasMeters() { return 0.0; }
        public double getTimeCorrectionMeters() { return 0.0; }
        public double getClockDriftMetersPerSecond() { return 0.0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    public static final class PositionEcef implements android.os.Parcelable {
        private final double mXMeters = 0.0;
        private final double mYMeters = 0.0;
        private final double mZMeters = 0.0;
        private final double mUreMeters = 0.0;
        public static final android.os.Parcelable.Creator<android.location.SatellitePvt.PositionEcef> CREATOR = null;
        public PositionEcef(double p0, double p1, double p2, double p3) {}
        public double getXMeters() { return 0.0; }
        public double getYMeters() { return 0.0; }
        public double getZMeters() { return 0.0; }
        public double getUreMeters() { return 0.0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    public static final class VelocityEcef implements android.os.Parcelable {
        private final double mXMetersPerSecond = 0.0;
        private final double mYMetersPerSecond = 0.0;
        private final double mZMetersPerSecond = 0.0;
        private final double mUreRateMetersPerSecond = 0.0;
        public static final android.os.Parcelable.Creator<android.location.SatellitePvt.VelocityEcef> CREATOR = null;
        public VelocityEcef(double p0, double p1, double p2, double p3) {}
        public double getXMetersPerSecond() { return 0.0; }
        public double getYMetersPerSecond() { return 0.0; }
        public double getZMetersPerSecond() { return 0.0; }
        public double getUreRateMetersPerSecond() { return 0.0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }
}
