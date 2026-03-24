package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public final class IpFilterConfiguration extends android.media.tv.tuner.filter.FilterConfiguration {
    public static final int INVALID_IP_FILTER_CONTEXT_ID = -1;
    IpFilterConfiguration() { super(null); }
    public int getType() { return 0; }
    public byte[] getSrcIpAddress() { return null; }
    public byte[] getDstIpAddress() { return null; }
    public int getSrcPort() { return 0; }
    public int getDstPort() { return 0; }
    public boolean isPassthrough() { return false; }
    public int getIpFilterContextId() { return 0; }
    public static android.media.tv.tuner.filter.IpFilterConfiguration.Builder builder() { return null; }

    public static final class Builder {
        public android.media.tv.tuner.filter.IpFilterConfiguration.Builder setSrcIpAddress(byte[] p0) { return null; }
        public android.media.tv.tuner.filter.IpFilterConfiguration.Builder setDstIpAddress(byte[] p0) { return null; }
        public android.media.tv.tuner.filter.IpFilterConfiguration.Builder setSrcPort(int p0) { return null; }
        public android.media.tv.tuner.filter.IpFilterConfiguration.Builder setDstPort(int p0) { return null; }
        public android.media.tv.tuner.filter.IpFilterConfiguration.Builder setPassthrough(boolean p0) { return null; }
        public android.media.tv.tuner.filter.IpFilterConfiguration.Builder setSettings(android.media.tv.tuner.filter.Settings p0) { return null; }
        public android.media.tv.tuner.filter.IpFilterConfiguration.Builder setIpFilterContextId(int p0) { return null; }
        public android.media.tv.tuner.filter.IpFilterConfiguration build() { return null; }
    }
}
