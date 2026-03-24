package android.hardware.gnss;

public class GnssData implements android.os.Parcelable {
    public android.hardware.gnss.GnssMeasurement[] measurements;
    public android.hardware.gnss.GnssClock clock;
    public android.hardware.gnss.ElapsedRealtime elapsedRealtime;
    public android.hardware.gnss.GnssData.GnssAgc[] gnssAgcs;
    public static final android.os.Parcelable.Creator<android.hardware.gnss.GnssData> CREATOR = null;
    public GnssData() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static class GnssAgc implements android.os.Parcelable {
        public double agcLevelDb;
        public int constellation;
        public long carrierFrequencyHz;
        public static final android.os.Parcelable.Creator<android.hardware.gnss.GnssData.GnssAgc> CREATOR = null;
        public GnssAgc() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }
}
