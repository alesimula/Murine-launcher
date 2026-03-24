package android.hardware.tv.tuner;

public class DemuxCapabilities implements android.os.Parcelable {
    public int numDemux;
    public int numRecord;
    public int numPlayback;
    public int numTsFilter;
    public int numSectionFilter;
    public int numAudioFilter;
    public int numVideoFilter;
    public int numPesFilter;
    public int numPcrFilter;
    public long numBytesInSectionFilter;
    public int filterCaps;
    public int[] linkCaps;
    public boolean bTimeFilter;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxCapabilities> CREATOR = null;
    public DemuxCapabilities() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
