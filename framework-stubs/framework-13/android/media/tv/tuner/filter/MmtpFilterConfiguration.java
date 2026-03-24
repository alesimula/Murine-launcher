package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public final class MmtpFilterConfiguration extends android.media.tv.tuner.filter.FilterConfiguration {
    MmtpFilterConfiguration() { super(null); }
    public int getType() { return 0; }
    public int getMmtpPacketId() { return 0; }
    public static android.media.tv.tuner.filter.MmtpFilterConfiguration.Builder builder() { return null; }

    public static final class Builder {
        public android.media.tv.tuner.filter.MmtpFilterConfiguration.Builder setMmtpPacketId(int p0) { return null; }
        public android.media.tv.tuner.filter.MmtpFilterConfiguration.Builder setSettings(android.media.tv.tuner.filter.Settings p0) { return null; }
        public android.media.tv.tuner.filter.MmtpFilterConfiguration build() { return null; }
    }
}
