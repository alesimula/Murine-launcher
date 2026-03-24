package android.hardware.tv.tuner;

public final class DemuxTlvFilterSettingsFilterSettings implements android.os.Parcelable {
    public static final int noinit = 0;
    public static final int section = 1;
    public static final int bPassthrough = 2;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxTlvFilterSettingsFilterSettings> CREATOR = null;
    public DemuxTlvFilterSettingsFilterSettings() {}
    public int getTag() { return 0; }
    public static android.hardware.tv.tuner.DemuxTlvFilterSettingsFilterSettings noinit(boolean p0) { return null; }
    public boolean getNoinit() { return false; }
    public void setNoinit(boolean p0) {}
    public static android.hardware.tv.tuner.DemuxTlvFilterSettingsFilterSettings section(android.hardware.tv.tuner.DemuxFilterSectionSettings p0) { return null; }
    public android.hardware.tv.tuner.DemuxFilterSectionSettings getSection() { return null; }
    public void setSection(android.hardware.tv.tuner.DemuxFilterSectionSettings p0) {}
    public static android.hardware.tv.tuner.DemuxTlvFilterSettingsFilterSettings bPassthrough(boolean p0) { return null; }
    public boolean getBPassthrough() { return false; }
    public void setBPassthrough(boolean p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int noinit = 0;
        public static final int section = 1;
        public static final int bPassthrough = 2;
    }
}
