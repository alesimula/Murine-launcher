package android.net.wifi.flags;

public final class FeatureFlagsImpl implements android.net.wifi.flags.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean getDeviceCrossAkmRoamingSupport() { return false; }
    public boolean hotspotNetworkConnectingStateForDetailsPage() { return false; }
    public boolean hotspotNetworkUnknownStatusResetsConnectingState() { return false; }
    public boolean legacyKeystoreToWifiBlobstoreMigrationReadOnly() { return false; }
    public boolean networkProviderBatteryChargingStatus() { return false; }
    public boolean usd() { return false; }
    public boolean wifiKeystoreRemoveAllApi() { return false; }
}
