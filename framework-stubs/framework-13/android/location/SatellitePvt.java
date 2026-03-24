package android.location;

@android.annotation.SystemApi
public final class SatellitePvt implements android.os.Parcelable {
    public static final int EPHEMERIS_SOURCE_DEMODULATED = 0;
    public static final int EPHEMERIS_SOURCE_SERVER_NORMAL = 1;
    public static final int EPHEMERIS_SOURCE_SERVER_LONG_TERM = 2;
    public static final int EPHEMERIS_SOURCE_OTHER = 3;
    public static final android.os.Parcelable.Creator<android.location.SatellitePvt> CREATOR = null;
    public android.location.SatellitePvt.PositionEcef getPositionEcef() { return null; }
    public android.location.SatellitePvt.VelocityEcef getVelocityEcef() { return null; }
    public android.location.SatellitePvt.ClockInfo getClockInfo() { return null; }
    public double getIonoDelayMeters() { return 0.0; }
    public double getTropoDelayMeters() { return 0.0; }
    public int getIssueOfDataClock() { return 0; }
    public int getIssueOfDataEphemeris() { return 0; }
    public long getTimeOfClockSeconds() { return 0L; }
    public long getTimeOfEphemerisSeconds() { return 0L; }
    public int getEphemerisSource() { return 0; }
    public boolean hasPositionVelocityClockInfo() { return false; }
    public boolean hasIono() { return false; }
    public boolean hasTropo() { return false; }
    public boolean hasIssueOfDataClock() { return false; }
    public boolean hasIssueOfDataEphemeris() { return false; }
    public boolean hasTimeOfClockSeconds() { return false; }
    public boolean hasTimeOfEphemerisSeconds() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        public android.location.SatellitePvt.Builder setPositionEcef(android.location.SatellitePvt.PositionEcef p0) { return null; }
        public android.location.SatellitePvt.Builder setVelocityEcef(android.location.SatellitePvt.VelocityEcef p0) { return null; }
        public android.location.SatellitePvt.Builder setClockInfo(android.location.SatellitePvt.ClockInfo p0) { return null; }
        public android.location.SatellitePvt.Builder setIonoDelayMeters(double p0) { return null; }
        public android.location.SatellitePvt.Builder setTropoDelayMeters(double p0) { return null; }
        public android.location.SatellitePvt.Builder setTimeOfClockSeconds(long p0) { return null; }
        public android.location.SatellitePvt.Builder setTimeOfEphemerisSeconds(long p0) { return null; }
        public android.location.SatellitePvt.Builder setIssueOfDataClock(int p0) { return null; }
        public android.location.SatellitePvt.Builder setIssueOfDataEphemeris(int p0) { return null; }
        public android.location.SatellitePvt.Builder setEphemerisSource(int p0) { return null; }
        public android.location.SatellitePvt build() { return null; }
    }

    public static final class ClockInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.location.SatellitePvt.ClockInfo> CREATOR = null;
        public ClockInfo(double p0, double p1, double p2) {}
        public double getHardwareCodeBiasMeters() { return 0.0; }
        public double getTimeCorrectionMeters() { return 0.0; }
        public double getClockDriftMetersPerSecond() { return 0.0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EphemerisSource {
    }

    public static final class PositionEcef implements android.os.Parcelable {
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
