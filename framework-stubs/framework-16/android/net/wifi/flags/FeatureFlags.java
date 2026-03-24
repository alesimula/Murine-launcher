package android.net.wifi.flags;

public interface FeatureFlags {
    public boolean getDeviceCrossAkmRoamingSupport();
    public boolean hotspotNetworkConnectingStateForDetailsPage();
    public boolean hotspotNetworkUnknownStatusResetsConnectingState();
    public boolean legacyKeystoreToWifiBlobstoreMigrationReadOnly();
    public boolean networkProviderBatteryChargingStatus();
    public boolean usd();
    public boolean wifiKeystoreRemoveAllApi();
}
