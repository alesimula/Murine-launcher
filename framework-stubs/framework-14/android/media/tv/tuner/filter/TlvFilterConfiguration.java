package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public final class TlvFilterConfiguration extends android.media.tv.tuner.filter.FilterConfiguration {
    public static final int PACKET_TYPE_IPV4 = 1;
    public static final int PACKET_TYPE_IPV6 = 2;
    public static final int PACKET_TYPE_COMPRESSED = 3;
    public static final int PACKET_TYPE_SIGNALING = 254;
    public static final int PACKET_TYPE_NULL = 255;
    TlvFilterConfiguration() { super(null); }
    public int getType() { return 0; }
    public int getPacketType() { return 0; }
    public boolean isCompressedIpPacket() { return false; }
    public boolean isPassthrough() { return false; }
    public static android.media.tv.tuner.filter.TlvFilterConfiguration.Builder builder() { return null; }

    public static final class Builder {
        public android.media.tv.tuner.filter.TlvFilterConfiguration.Builder setPacketType(int p0) { return null; }
        public android.media.tv.tuner.filter.TlvFilterConfiguration.Builder setCompressedIpPacket(boolean p0) { return null; }
        public android.media.tv.tuner.filter.TlvFilterConfiguration.Builder setPassthrough(boolean p0) { return null; }
        public android.media.tv.tuner.filter.TlvFilterConfiguration.Builder setSettings(android.media.tv.tuner.filter.Settings p0) { return null; }
        public android.media.tv.tuner.filter.TlvFilterConfiguration build() { return null; }
    }
}
