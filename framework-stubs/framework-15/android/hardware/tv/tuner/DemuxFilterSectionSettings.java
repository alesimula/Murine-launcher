package android.hardware.tv.tuner;

public class DemuxFilterSectionSettings implements android.os.Parcelable {
    public android.hardware.tv.tuner.DemuxFilterSectionSettingsCondition condition;
    public boolean isCheckCrc;
    public boolean isRepeat;
    public boolean isRaw;
    public int bitWidthOfLengthField;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterSectionSettings> CREATOR = null;
    public DemuxFilterSectionSettings() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
