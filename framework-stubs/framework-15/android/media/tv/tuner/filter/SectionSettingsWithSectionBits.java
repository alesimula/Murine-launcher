package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class SectionSettingsWithSectionBits extends android.media.tv.tuner.filter.SectionSettings {
    SectionSettingsWithSectionBits() { super(0, false, false, false, 0); }
    @android.annotation.NonNull
    public byte[] getFilterBytes() { return null; }
    @android.annotation.NonNull
    public byte[] getMask() { return null; }
    @android.annotation.NonNull
    public byte[] getMode() { return null; }
    @android.annotation.NonNull
    public static android.media.tv.tuner.filter.SectionSettingsWithSectionBits.Builder builder(int p0) { return null; }

    public static class Builder extends android.media.tv.tuner.filter.SectionSettings.Builder<android.media.tv.tuner.filter.SectionSettingsWithSectionBits.Builder> {
        Builder() { super(0); }
        @android.annotation.NonNull
        public android.media.tv.tuner.filter.SectionSettingsWithSectionBits.Builder setFilter(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.filter.SectionSettingsWithSectionBits.Builder setMask(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.filter.SectionSettingsWithSectionBits.Builder setMode(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.filter.SectionSettingsWithSectionBits build() { return null; }
        android.media.tv.tuner.filter.SectionSettingsWithSectionBits.Builder self() { return null; }
    }
}
