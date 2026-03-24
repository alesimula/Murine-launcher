package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class SectionSettingsWithTableInfo extends android.media.tv.tuner.filter.SectionSettings {
    public static final int INVALID_TABLE_INFO_VERSION = -1;
    SectionSettingsWithTableInfo() { super(0, false, false, false, 0); }
    public int getTableId() { return 0; }
    public int getVersion() { return 0; }
    @android.annotation.NonNull
    public static android.media.tv.tuner.filter.SectionSettingsWithTableInfo.Builder builder(int p0) { return null; }

    public static class Builder extends android.media.tv.tuner.filter.SectionSettings.Builder<android.media.tv.tuner.filter.SectionSettingsWithTableInfo.Builder> {
        Builder() { super(0); }
        @android.annotation.NonNull
        public android.media.tv.tuner.filter.SectionSettingsWithTableInfo.Builder setTableId(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.filter.SectionSettingsWithTableInfo.Builder setVersion(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.filter.SectionSettingsWithTableInfo build() { return null; }
        android.media.tv.tuner.filter.SectionSettingsWithTableInfo.Builder self() { return null; }
    }
}
