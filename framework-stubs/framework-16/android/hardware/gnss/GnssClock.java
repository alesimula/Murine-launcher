package android.hardware.gnss;

public class GnssClock implements android.os.Parcelable {
    public int gnssClockFlags;
    public int leapSecond;
    public long timeNs;
    public double timeUncertaintyNs;
    public long fullBiasNs;
    public double biasNs;
    public double biasUncertaintyNs;
    public double driftNsps;
    public double driftUncertaintyNsps;
    public int hwClockDiscontinuityCount;
    public android.hardware.gnss.GnssSignalType referenceSignalTypeForIsb;
    public static final android.os.Parcelable.Creator<android.hardware.gnss.GnssClock> CREATOR = null;
    public static final int HAS_LEAP_SECOND = 1;
    public static final int HAS_TIME_UNCERTAINTY = 2;
    public static final int HAS_FULL_BIAS = 4;
    public static final int HAS_BIAS = 8;
    public static final int HAS_BIAS_UNCERTAINTY = 16;
    public static final int HAS_DRIFT = 32;
    public static final int HAS_DRIFT_UNCERTAINTY = 64;
    public GnssClock() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
