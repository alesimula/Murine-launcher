package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public final class AlpFilterConfiguration extends android.media.tv.tuner.filter.FilterConfiguration {
    public static final int PACKET_TYPE_IPV4 = 0;
    public static final int PACKET_TYPE_COMPRESSED = 2;
    public static final int PACKET_TYPE_SIGNALING = 4;
    public static final int PACKET_TYPE_EXTENSION = 6;
    public static final int PACKET_TYPE_MPEG2_TS = 7;
    public static final int LENGTH_TYPE_UNDEFINED = 0;
    public static final int LENGTH_TYPE_WITHOUT_ADDITIONAL_HEADER = 1;
    public static final int LENGTH_TYPE_WITH_ADDITIONAL_HEADER = 2;
    AlpFilterConfiguration() { super(null); }
    public int getType() { return 0; }
    public int getPacketType() { return 0; }
    public int getLengthType() { return 0; }
    public static android.media.tv.tuner.filter.AlpFilterConfiguration.Builder builder() { return null; }

    public static final class Builder {
        public android.media.tv.tuner.filter.AlpFilterConfiguration.Builder setPacketType(int p0) { return null; }
        public android.media.tv.tuner.filter.AlpFilterConfiguration.Builder setLengthType(int p0) { return null; }
        public android.media.tv.tuner.filter.AlpFilterConfiguration.Builder setSettings(android.media.tv.tuner.filter.Settings p0) { return null; }
        public android.media.tv.tuner.filter.AlpFilterConfiguration build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LengthType {
    }
}
