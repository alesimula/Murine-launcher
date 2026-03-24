package android.net.wifi.p2p.nsd;

@android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
public final class WifiP2pUsdBasedServiceConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.nsd.WifiP2pUsdBasedServiceConfig> CREATOR = null;
    public static final int SERVICE_PROTOCOL_TYPE_BONJOUR = 1;
    public static final int SERVICE_PROTOCOL_TYPE_GENERIC = 2;
    public WifiP2pUsdBasedServiceConfig() {}
    public int describeContents() { return 0; }
    public static int getMaxAllowedServiceSpecificInfoLength() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getServiceName() { return null; }
    public int getServiceProtocolType() { return 0; }
    @android.annotation.Nullable
    public byte[] getServiceSpecificInfo() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.net.wifi.p2p.nsd.WifiP2pUsdBasedServiceConfig build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.nsd.WifiP2pUsdBasedServiceConfig.Builder setServiceProtocolType(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.nsd.WifiP2pUsdBasedServiceConfig.Builder setServiceSpecificInfo(byte[] p0) { return null; }
    }
}
