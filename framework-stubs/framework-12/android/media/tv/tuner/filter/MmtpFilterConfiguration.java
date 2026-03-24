package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public final class MmtpFilterConfiguration extends android.media.tv.tuner.filter.FilterConfiguration {
    private final int mMmtpPid = 0;
    private MmtpFilterConfiguration(android.media.tv.tuner.filter.Settings p0, int p1) { super(null); }
    public int getType() { return 0; }
    public int getMmtpPacketId() { return 0; }
    public static android.media.tv.tuner.filter.MmtpFilterConfiguration.Builder builder() { return null; }

    public static final class Builder {
        private int mMmtpPid;
        private android.media.tv.tuner.filter.Settings mSettings;
        private Builder() {}
        public android.media.tv.tuner.filter.MmtpFilterConfiguration.Builder setMmtpPacketId(int p0) { return null; }
        public android.media.tv.tuner.filter.MmtpFilterConfiguration.Builder setSettings(android.media.tv.tuner.filter.Settings p0) { return null; }
        public android.media.tv.tuner.filter.MmtpFilterConfiguration build() { return null; }
    }
}
