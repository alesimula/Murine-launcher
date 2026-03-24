package android.hardware.gnss;

public class SatellitePvt implements android.os.Parcelable {
    public int flags;
    public android.hardware.gnss.SatellitePositionEcef satPosEcef;
    public android.hardware.gnss.SatelliteVelocityEcef satVelEcef;
    public android.hardware.gnss.SatelliteClockInfo satClockInfo;
    public double ionoDelayMeters;
    public double tropoDelayMeters;
    public long timeOfClockSeconds;
    public int issueOfDataClock;
    public long timeOfEphemerisSeconds;
    public int issueOfDataEphemeris;
    public int ephemerisSource;
    public static final android.os.Parcelable.Creator<android.hardware.gnss.SatellitePvt> CREATOR = null;
    public static final int HAS_POSITION_VELOCITY_CLOCK_INFO = 1;
    public static final int HAS_IONO = 2;
    public static final int HAS_TROPO = 4;
    public SatellitePvt() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface SatelliteEphemerisSource {
        public static final int DEMODULATED = 0;
        public static final int SERVER_NORMAL = 1;
        public static final int SERVER_LONG_TERM = 2;
        public static final int OTHER = 3;
    }
}
