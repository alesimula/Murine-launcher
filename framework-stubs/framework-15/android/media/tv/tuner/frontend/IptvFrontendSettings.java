package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public final class IptvFrontendSettings extends android.media.tv.tuner.frontend.FrontendSettings {
    public static final int PROTOCOL_UNDEFINED = 0;
    public static final int PROTOCOL_UDP = 1;
    public static final int PROTOCOL_RTP = 2;
    public static final int IGMP_UNDEFINED = 0;
    public static final int IGMP_V1 = 1;
    public static final int IGMP_V2 = 2;
    public static final int IGMP_V3 = 4;
    IptvFrontendSettings() { super(0L); }
    @android.annotation.NonNull
    public byte[] getSrcIpAddress() { return null; }
    @android.annotation.NonNull
    public byte[] getDstIpAddress() { return null; }
    public int getSrcPort() { return 0; }
    public int getDstPort() { return 0; }
    @android.annotation.Nullable
    public android.media.tv.tuner.frontend.IptvFrontendSettingsFec getFec() { return null; }
    public int getProtocol() { return 0; }
    public int getIgmp() { return 0; }
    public long getBitrate() { return 0L; }
    @android.annotation.NonNull
    public java.lang.String getContentUrl() { return null; }
    public int getType() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.IptvFrontendSettings.Builder setSrcIpAddress(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.IptvFrontendSettings.Builder setDstIpAddress(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.IptvFrontendSettings.Builder setSrcPort(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.IptvFrontendSettings.Builder setDstPort(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.IptvFrontendSettings.Builder setFec(android.media.tv.tuner.frontend.IptvFrontendSettingsFec p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.IptvFrontendSettings.Builder setProtocol(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.IptvFrontendSettings.Builder setIgmp(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.IptvFrontendSettings.Builder setBitrate(long p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.IptvFrontendSettings.Builder setContentUrl(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.IptvFrontendSettings build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Igmp {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Protocol {
    }
}
