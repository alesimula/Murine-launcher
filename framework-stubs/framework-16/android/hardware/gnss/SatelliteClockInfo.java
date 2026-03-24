package android.hardware.gnss;

public class SatelliteClockInfo implements android.os.Parcelable {
    public double satHardwareCodeBiasMeters;
    public double satTimeCorrectionMeters;
    public double satClkDriftMps;
    public static final android.os.Parcelable.Creator<android.hardware.gnss.SatelliteClockInfo> CREATOR = null;
    public SatelliteClockInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
