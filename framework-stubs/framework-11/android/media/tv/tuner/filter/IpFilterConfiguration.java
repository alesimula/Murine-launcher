package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public final class IpFilterConfiguration extends android.media.tv.tuner.filter.FilterConfiguration {
    private final byte[] mSrcIpAddress = null;
    private final byte[] mDstIpAddress = null;
    private final int mSrcPort = 0;
    private final int mDstPort = 0;
    private final boolean mPassthrough = false;
    private IpFilterConfiguration(android.media.tv.tuner.filter.Settings p0, byte[] p1, byte[] p2, int p3, int p4, boolean p5) { super(null); }
    public int getType() { return 0; }
    public byte[] getSrcIpAddress() { return null; }
    public byte[] getDstIpAddress() { return null; }
    public int getSrcPort() { return 0; }
    public int getDstPort() { return 0; }
    public boolean isPassthrough() { return false; }
    public static android.media.tv.tuner.filter.IpFilterConfiguration.Builder builder() { return null; }

    public static final class Builder {
        private byte[] mSrcIpAddress;
        private byte[] mDstIpAddress;
        private int mSrcPort;
        private int mDstPort;
        private boolean mPassthrough;
        private android.media.tv.tuner.filter.Settings mSettings;
        private Builder() {}
        public android.media.tv.tuner.filter.IpFilterConfiguration.Builder setSrcIpAddress(byte[] p0) { return null; }
        public android.media.tv.tuner.filter.IpFilterConfiguration.Builder setDstIpAddress(byte[] p0) { return null; }
        public android.media.tv.tuner.filter.IpFilterConfiguration.Builder setSrcPort(int p0) { return null; }
        public android.media.tv.tuner.filter.IpFilterConfiguration.Builder setDstPort(int p0) { return null; }
        public android.media.tv.tuner.filter.IpFilterConfiguration.Builder setPassthrough(boolean p0) { return null; }
        public android.media.tv.tuner.filter.IpFilterConfiguration.Builder setSettings(android.media.tv.tuner.filter.Settings p0) { return null; }
        public android.media.tv.tuner.filter.IpFilterConfiguration build() { return null; }
    }
}
