package com.android.server.wifi;

public class BaseWifiService extends android.net.wifi.IWifiManager.Stub {
    private static final java.lang.String TAG = null;
    public BaseWifiService() { super(); }
    public long getSupportedFeatures() { return 0L; }
    public android.net.wifi.WifiActivityEnergyInfo reportActivityInfo() { return null; }
    public void requestActivityInfo(android.os.ResultReceiver p0) {}
    public android.content.pm.ParceledListSlice getConfiguredNetworks(java.lang.String p0) { return null; }
    public android.content.pm.ParceledListSlice getPrivilegedConfiguredNetworks(java.lang.String p0) { return null; }
    public java.util.Map<java.lang.String, java.util.Map<java.lang.Integer, java.util.List<android.net.wifi.ScanResult>>> getAllMatchingFqdnsForScanResults(java.util.List<android.net.wifi.ScanResult> p0) { return null; }
    public java.util.Map<android.net.wifi.hotspot2.OsuProvider, java.util.List<android.net.wifi.ScanResult>> getMatchingOsuProviders(java.util.List<android.net.wifi.ScanResult> p0) { return null; }
    public java.util.Map<android.net.wifi.hotspot2.OsuProvider, android.net.wifi.hotspot2.PasspointConfiguration> getMatchingPasspointConfigsForOsuProviders(java.util.List<android.net.wifi.hotspot2.OsuProvider> p0) { return null; }
    public int addOrUpdateNetwork(android.net.wifi.WifiConfiguration p0, java.lang.String p1) { return 0; }
    public boolean addOrUpdatePasspointConfiguration(android.net.wifi.hotspot2.PasspointConfiguration p0, java.lang.String p1) { return false; }
    public boolean removePasspointConfiguration(java.lang.String p0, java.lang.String p1) { return false; }
    public java.util.List<android.net.wifi.hotspot2.PasspointConfiguration> getPasspointConfigurations(java.lang.String p0) { return null; }
    public java.util.List<android.net.wifi.WifiConfiguration> getWifiConfigsForPasspointProfiles(java.util.List<java.lang.String> p0) { return null; }
    public void queryPasspointIcon(long p0, java.lang.String p1) {}
    public int matchProviderWithCurrentNetwork(java.lang.String p0) { return 0; }
    public void deauthenticateNetwork(long p0, boolean p1) {}
    public boolean removeNetwork(int p0, java.lang.String p1) { return false; }
    public boolean enableNetwork(int p0, boolean p1, java.lang.String p2) { return false; }
    public boolean disableNetwork(int p0, java.lang.String p1) { return false; }
    public boolean startScan(java.lang.String p0) { return false; }
    public java.util.List<android.net.wifi.ScanResult> getScanResults(java.lang.String p0) { return null; }
    public boolean disconnect(java.lang.String p0) { return false; }
    public boolean reconnect(java.lang.String p0) { return false; }
    public boolean reassociate(java.lang.String p0) { return false; }
    public android.net.wifi.WifiInfo getConnectionInfo(java.lang.String p0) { return null; }
    public boolean setWifiEnabled(java.lang.String p0, boolean p1) { return false; }
    public int getWifiEnabledState() { return 0; }
    public void setCountryCode(java.lang.String p0) {}
    public java.lang.String getCountryCode() { return null; }
    public boolean isDualBandSupported() { return false; }
    public boolean needs5GHzToAnyApBandConversion() { return false; }
    public android.net.DhcpInfo getDhcpInfo() { return null; }
    public boolean isScanAlwaysAvailable() { return false; }
    public boolean acquireWifiLock(android.os.IBinder p0, int p1, java.lang.String p2, android.os.WorkSource p3) { return false; }
    public void updateWifiLockWorkSource(android.os.IBinder p0, android.os.WorkSource p1) {}
    public boolean releaseWifiLock(android.os.IBinder p0) { return false; }
    public void initializeMulticastFiltering() {}
    public boolean isMulticastEnabled() { return false; }
    public void acquireMulticastLock(android.os.IBinder p0, java.lang.String p1) {}
    public void releaseMulticastLock(java.lang.String p0) {}
    public void updateInterfaceIpState(java.lang.String p0, int p1) {}
    public boolean startSoftAp(android.net.wifi.WifiConfiguration p0) { return false; }
    public boolean stopSoftAp() { return false; }
    public int startLocalOnlyHotspot(android.os.Messenger p0, android.os.IBinder p1, java.lang.String p2) { return 0; }
    public void stopLocalOnlyHotspot() {}
    public void startWatchLocalOnlyHotspot(android.os.Messenger p0, android.os.IBinder p1) {}
    public void stopWatchLocalOnlyHotspot() {}
    public int getWifiApEnabledState() { return 0; }
    public android.net.wifi.WifiConfiguration getWifiApConfiguration() { return null; }
    public boolean setWifiApConfiguration(android.net.wifi.WifiConfiguration p0, java.lang.String p1) { return false; }
    public void notifyUserOfApBandConversion(java.lang.String p0) {}
    public android.os.Messenger getWifiServiceMessenger(java.lang.String p0) { return null; }
    public void enableTdls(java.lang.String p0, boolean p1) {}
    public void enableTdlsWithMacAddress(java.lang.String p0, boolean p1) {}
    public java.lang.String getCurrentNetworkWpsNfcConfigurationToken() { return null; }
    public void enableVerboseLogging(int p0) {}
    public int getVerboseLoggingLevel() { return 0; }
    public void enableWifiConnectivityManager(boolean p0) {}
    public void disableEphemeralNetwork(java.lang.String p0, java.lang.String p1) {}
    public void factoryReset(java.lang.String p0) {}
    public android.net.Network getCurrentNetwork() { return null; }
    public byte[] retrieveBackupData() { return null; }
    public void restoreBackupData(byte[] p0) {}
    public void restoreSupplicantBackupData(byte[] p0, byte[] p1) {}
    public void startSubscriptionProvisioning(android.net.wifi.hotspot2.OsuProvider p0, android.net.wifi.hotspot2.IProvisioningCallback p1) {}
    public void registerSoftApCallback(android.os.IBinder p0, android.net.wifi.ISoftApCallback p1, int p2) {}
    public void unregisterSoftApCallback(int p0) {}
    public void registerTrafficStateCallback(android.os.IBinder p0, android.net.wifi.ITrafficStateCallback p1, int p2) {}
    public void unregisterTrafficStateCallback(int p0) {}
    public void registerNetworkRequestMatchCallback(android.os.IBinder p0, android.net.wifi.INetworkRequestMatchCallback p1, int p2) {}
    public void unregisterNetworkRequestMatchCallback(int p0) {}
    public int addNetworkSuggestions(java.util.List<android.net.wifi.WifiNetworkSuggestion> p0, java.lang.String p1) { return 0; }
    public int removeNetworkSuggestions(java.util.List<android.net.wifi.WifiNetworkSuggestion> p0, java.lang.String p1) { return 0; }
    public java.lang.String[] getFactoryMacAddresses() { return null; }
    public void setDeviceMobilityState(int p0) {}
    public void startDppAsConfiguratorInitiator(android.os.IBinder p0, java.lang.String p1, int p2, int p3, android.net.wifi.IDppCallback p4) {}
    public void startDppAsEnrolleeInitiator(android.os.IBinder p0, java.lang.String p1, android.net.wifi.IDppCallback p2) {}
    public void stopDppSession() throws android.os.RemoteException {}
    public void addOnWifiUsabilityStatsListener(android.os.IBinder p0, android.net.wifi.IOnWifiUsabilityStatsListener p1, int p2) {}
    public void removeOnWifiUsabilityStatsListener(int p0) {}
    public void updateWifiUsabilityScore(int p0, int p1, int p2) {}
}
