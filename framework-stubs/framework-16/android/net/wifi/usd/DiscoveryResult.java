package android.net.wifi.usd;

@android.annotation.FlaggedApi("android.net.wifi.flags.usd")
public class DiscoveryResult {
    DiscoveryResult() {}
    public int getPeerId() { return 0; }
    public int getServiceProtoType() { return 0; }
    @android.annotation.Nullable
    public byte[] getServiceSpecificInfo() { return null; }
    public boolean isFsdEnabled() { return false; }

    @android.annotation.FlaggedApi("android.net.wifi.flags.usd")
    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.net.wifi.usd.DiscoveryResult build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.usd.DiscoveryResult.Builder setFsdEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.usd.DiscoveryResult.Builder setServiceProtoType(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.usd.DiscoveryResult.Builder setServiceSpecificInfo(byte[] p0) { return null; }
    }
}
