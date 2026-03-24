package android.hardware.tv.tuner;

public final class DemuxTsFilterSettingsFilterSettings implements android.os.Parcelable {
    public static final int noinit = 0;
    public static final int section = 1;
    public static final int av = 2;
    public static final int pesData = 3;
    public static final int record = 4;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxTsFilterSettingsFilterSettings> CREATOR = null;
    public DemuxTsFilterSettingsFilterSettings() {}
    public int getTag() { return 0; }
    public static android.hardware.tv.tuner.DemuxTsFilterSettingsFilterSettings noinit(boolean p0) { return null; }
    public boolean getNoinit() { return false; }
    public void setNoinit(boolean p0) {}
    public static android.hardware.tv.tuner.DemuxTsFilterSettingsFilterSettings section(android.hardware.tv.tuner.DemuxFilterSectionSettings p0) { return null; }
    public android.hardware.tv.tuner.DemuxFilterSectionSettings getSection() { return null; }
    public void setSection(android.hardware.tv.tuner.DemuxFilterSectionSettings p0) {}
    public static android.hardware.tv.tuner.DemuxTsFilterSettingsFilterSettings av(android.hardware.tv.tuner.DemuxFilterAvSettings p0) { return null; }
    public android.hardware.tv.tuner.DemuxFilterAvSettings getAv() { return null; }
    public void setAv(android.hardware.tv.tuner.DemuxFilterAvSettings p0) {}
    public static android.hardware.tv.tuner.DemuxTsFilterSettingsFilterSettings pesData(android.hardware.tv.tuner.DemuxFilterPesDataSettings p0) { return null; }
    public android.hardware.tv.tuner.DemuxFilterPesDataSettings getPesData() { return null; }
    public void setPesData(android.hardware.tv.tuner.DemuxFilterPesDataSettings p0) {}
    public static android.hardware.tv.tuner.DemuxTsFilterSettingsFilterSettings record(android.hardware.tv.tuner.DemuxFilterRecordSettings p0) { return null; }
    public android.hardware.tv.tuner.DemuxFilterRecordSettings getRecord() { return null; }
    public void setRecord(android.hardware.tv.tuner.DemuxFilterRecordSettings p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int noinit = 0;
        public static final int section = 1;
        public static final int av = 2;
        public static final int pesData = 3;
        public static final int record = 4;
    }
}
