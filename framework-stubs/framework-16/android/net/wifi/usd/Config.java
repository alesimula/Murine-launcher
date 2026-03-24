package android.net.wifi.usd;

@android.annotation.FlaggedApi("android.net.wifi.flags.usd")
public abstract class Config {
    public static final int SERVICE_PROTO_TYPE_CSA_MATTER = 1;
    public static final int SERVICE_PROTO_TYPE_GENERIC = 0;
    public static final int SUBSCRIBE_TYPE_ACTIVE = 1;
    public static final int SUBSCRIBE_TYPE_PASSIVE = 0;
    public static final int TRANSMISSION_TYPE_MULTICAST = 1;
    public static final int TRANSMISSION_TYPE_UNICAST = 0;
    Config() {}
    @android.annotation.Nullable
    public int[] getOperatingFrequenciesMhz() { return null; }
    @android.annotation.NonNull
    public java.util.List<byte[]> getRxMatchFilter() { return null; }
    @android.annotation.NonNull
    public byte[] getServiceName() { return null; }
    public int getServiceProtoType() { return 0; }
    @android.annotation.Nullable
    public byte[] getServiceSpecificInfo() { return null; }
    public int getTtlSeconds() { return 0; }
    @android.annotation.NonNull
    public java.util.List<byte[]> getTxMatchFilter() { return null; }
}
