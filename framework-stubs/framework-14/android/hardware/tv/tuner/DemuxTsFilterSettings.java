package android.hardware.tv.tuner;

public class DemuxTsFilterSettings implements android.os.Parcelable {
    public int tpid;
    public android.hardware.tv.tuner.DemuxTsFilterSettingsFilterSettings filterSettings;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxTsFilterSettings> CREATOR = null;
    public DemuxTsFilterSettings() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
