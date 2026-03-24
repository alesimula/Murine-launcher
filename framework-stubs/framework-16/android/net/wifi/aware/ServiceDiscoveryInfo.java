package android.net.wifi.aware;

public final class ServiceDiscoveryInfo {
    ServiceDiscoveryInfo() {}
    @android.annotation.NonNull
    public java.util.List<byte[]> getMatchFilters() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPairedAlias() { return null; }
    @android.annotation.Nullable
    public android.net.wifi.aware.AwarePairingConfig getPairingConfig() { return null; }
    public int getPeerCipherSuite() { return 0; }
    @android.annotation.NonNull
    public android.net.wifi.aware.PeerHandle getPeerHandle() { return null; }
    @android.annotation.Nullable
    public byte[] getScid() { return null; }
    @android.annotation.Nullable
    public byte[] getServiceSpecificInfo() { return null; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.OuiKeyedData> getVendorData() { return null; }
}
