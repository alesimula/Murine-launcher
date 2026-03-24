package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class SectionSettingsWithSectionBits extends android.media.tv.tuner.filter.SectionSettings {
    private final byte[] mFilter = null;
    private final byte[] mMask = null;
    private final byte[] mMode = null;
    private SectionSettingsWithSectionBits(int p0, boolean p1, boolean p2, boolean p3, byte[] p4, byte[] p5, byte[] p6) { super(0, false, false, false); }
    public byte[] getFilterBytes() { return null; }
    public byte[] getMask() { return null; }
    public byte[] getMode() { return null; }
    public static android.media.tv.tuner.filter.SectionSettingsWithSectionBits.Builder builder(int p0) { return null; }

    public static class Builder extends android.media.tv.tuner.filter.SectionSettings.Builder<android.media.tv.tuner.filter.SectionSettingsWithSectionBits.Builder> {
        private byte[] mFilter;
        private byte[] mMask;
        private byte[] mMode;
        private Builder(int p0) { super(0); }
        public android.media.tv.tuner.filter.SectionSettingsWithSectionBits.Builder setFilter(byte[] p0) { return null; }
        public android.media.tv.tuner.filter.SectionSettingsWithSectionBits.Builder setMask(byte[] p0) { return null; }
        public android.media.tv.tuner.filter.SectionSettingsWithSectionBits.Builder setMode(byte[] p0) { return null; }
        public android.media.tv.tuner.filter.SectionSettingsWithSectionBits build() { return null; }
        android.media.tv.tuner.filter.SectionSettingsWithSectionBits.Builder self() { return null; }
    }
}
