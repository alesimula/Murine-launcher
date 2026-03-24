package android.hardware.tv.tuner;

public final class DemuxFilterSectionSettingsCondition implements android.os.Parcelable {
    public static final int sectionBits = 0;
    public static final int tableInfo = 1;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterSectionSettingsCondition> CREATOR = null;
    public DemuxFilterSectionSettingsCondition() {}
    public int getTag() { return 0; }
    public static android.hardware.tv.tuner.DemuxFilterSectionSettingsCondition sectionBits(android.hardware.tv.tuner.DemuxFilterSectionBits p0) { return null; }
    public android.hardware.tv.tuner.DemuxFilterSectionBits getSectionBits() { return null; }
    public void setSectionBits(android.hardware.tv.tuner.DemuxFilterSectionBits p0) {}
    public static android.hardware.tv.tuner.DemuxFilterSectionSettingsCondition tableInfo(android.hardware.tv.tuner.DemuxFilterSectionSettingsConditionTableInfo p0) { return null; }
    public android.hardware.tv.tuner.DemuxFilterSectionSettingsConditionTableInfo getTableInfo() { return null; }
    public void setTableInfo(android.hardware.tv.tuner.DemuxFilterSectionSettingsConditionTableInfo p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int sectionBits = 0;
        public static final int tableInfo = 1;
    }
}
