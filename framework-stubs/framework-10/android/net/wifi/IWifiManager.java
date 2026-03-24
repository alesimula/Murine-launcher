package android.net.wifi;

public interface IWifiManager extends android.os.IInterface {
    public long getSupportedFeatures() throws android.os.RemoteException;
    public android.net.wifi.WifiActivityEnergyInfo reportActivityInfo() throws android.os.RemoteException;
    public void requestActivityInfo(android.os.ResultReceiver p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getConfiguredNetworks(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getPrivilegedConfiguredNetworks(java.lang.String p0) throws android.os.RemoteException;
    public java.util.Map getAllMatchingFqdnsForScanResults(java.util.List<android.net.wifi.ScanResult> p0) throws android.os.RemoteException;
    public java.util.Map getMatchingOsuProviders(java.util.List<android.net.wifi.ScanResult> p0) throws android.os.RemoteException;
    public java.util.Map getMatchingPasspointConfigsForOsuProviders(java.util.List<android.net.wifi.hotspot2.OsuProvider> p0) throws android.os.RemoteException;
    public int addOrUpdateNetwork(android.net.wifi.WifiConfiguration p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean addOrUpdatePasspointConfiguration(android.net.wifi.hotspot2.PasspointConfiguration p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean removePasspointConfiguration(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<android.net.wifi.hotspot2.PasspointConfiguration> getPasspointConfigurations(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<android.net.wifi.WifiConfiguration> getWifiConfigsForPasspointProfiles(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public void queryPasspointIcon(long p0, java.lang.String p1) throws android.os.RemoteException;
    public int matchProviderWithCurrentNetwork(java.lang.String p0) throws android.os.RemoteException;
    public void deauthenticateNetwork(long p0, boolean p1) throws android.os.RemoteException;
    public boolean removeNetwork(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean enableNetwork(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean disableNetwork(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean startScan(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<android.net.wifi.ScanResult> getScanResults(java.lang.String p0) throws android.os.RemoteException;
    public boolean disconnect(java.lang.String p0) throws android.os.RemoteException;
    public boolean reconnect(java.lang.String p0) throws android.os.RemoteException;
    public boolean reassociate(java.lang.String p0) throws android.os.RemoteException;
    public android.net.wifi.WifiInfo getConnectionInfo(java.lang.String p0) throws android.os.RemoteException;
    public boolean setWifiEnabled(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public int getWifiEnabledState() throws android.os.RemoteException;
    public void setCountryCode(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getCountryCode() throws android.os.RemoteException;
    public boolean isDualBandSupported() throws android.os.RemoteException;
    public boolean needs5GHzToAnyApBandConversion() throws android.os.RemoteException;
    public android.net.DhcpInfo getDhcpInfo() throws android.os.RemoteException;
    public boolean isScanAlwaysAvailable() throws android.os.RemoteException;
    public boolean acquireWifiLock(android.os.IBinder p0, int p1, java.lang.String p2, android.os.WorkSource p3) throws android.os.RemoteException;
    public void updateWifiLockWorkSource(android.os.IBinder p0, android.os.WorkSource p1) throws android.os.RemoteException;
    public boolean releaseWifiLock(android.os.IBinder p0) throws android.os.RemoteException;
    public void initializeMulticastFiltering() throws android.os.RemoteException;
    public boolean isMulticastEnabled() throws android.os.RemoteException;
    public void acquireMulticastLock(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException;
    public void releaseMulticastLock(java.lang.String p0) throws android.os.RemoteException;
    public void updateInterfaceIpState(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean startSoftAp(android.net.wifi.WifiConfiguration p0) throws android.os.RemoteException;
    public boolean stopSoftAp() throws android.os.RemoteException;
    public int startLocalOnlyHotspot(android.os.Messenger p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException;
    public void stopLocalOnlyHotspot() throws android.os.RemoteException;
    public void startWatchLocalOnlyHotspot(android.os.Messenger p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void stopWatchLocalOnlyHotspot() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int getWifiApEnabledState() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.net.wifi.WifiConfiguration getWifiApConfiguration() throws android.os.RemoteException;
    public boolean setWifiApConfiguration(android.net.wifi.WifiConfiguration p0, java.lang.String p1) throws android.os.RemoteException;
    public void notifyUserOfApBandConversion(java.lang.String p0) throws android.os.RemoteException;
    public android.os.Messenger getWifiServiceMessenger(java.lang.String p0) throws android.os.RemoteException;
    public void enableTdls(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void enableTdlsWithMacAddress(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public java.lang.String getCurrentNetworkWpsNfcConfigurationToken() throws android.os.RemoteException;
    public void enableVerboseLogging(int p0) throws android.os.RemoteException;
    public int getVerboseLoggingLevel() throws android.os.RemoteException;
    public void enableWifiConnectivityManager(boolean p0) throws android.os.RemoteException;
    public void disableEphemeralNetwork(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void factoryReset(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.net.Network getCurrentNetwork() throws android.os.RemoteException;
    public byte[] retrieveBackupData() throws android.os.RemoteException;
    public void restoreBackupData(byte[] p0) throws android.os.RemoteException;
    public void restoreSupplicantBackupData(byte[] p0, byte[] p1) throws android.os.RemoteException;
    public void startSubscriptionProvisioning(android.net.wifi.hotspot2.OsuProvider p0, android.net.wifi.hotspot2.IProvisioningCallback p1) throws android.os.RemoteException;
    public void registerSoftApCallback(android.os.IBinder p0, android.net.wifi.ISoftApCallback p1, int p2) throws android.os.RemoteException;
    public void unregisterSoftApCallback(int p0) throws android.os.RemoteException;
    public void addOnWifiUsabilityStatsListener(android.os.IBinder p0, android.net.wifi.IOnWifiUsabilityStatsListener p1, int p2) throws android.os.RemoteException;
    public void removeOnWifiUsabilityStatsListener(int p0) throws android.os.RemoteException;
    public void registerTrafficStateCallback(android.os.IBinder p0, android.net.wifi.ITrafficStateCallback p1, int p2) throws android.os.RemoteException;
    public void unregisterTrafficStateCallback(int p0) throws android.os.RemoteException;
    public void registerNetworkRequestMatchCallback(android.os.IBinder p0, android.net.wifi.INetworkRequestMatchCallback p1, int p2) throws android.os.RemoteException;
    public void unregisterNetworkRequestMatchCallback(int p0) throws android.os.RemoteException;
    public int addNetworkSuggestions(java.util.List<android.net.wifi.WifiNetworkSuggestion> p0, java.lang.String p1) throws android.os.RemoteException;
    public int removeNetworkSuggestions(java.util.List<android.net.wifi.WifiNetworkSuggestion> p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String[] getFactoryMacAddresses() throws android.os.RemoteException;
    public void setDeviceMobilityState(int p0) throws android.os.RemoteException;
    public void startDppAsConfiguratorInitiator(android.os.IBinder p0, java.lang.String p1, int p2, int p3, android.net.wifi.IDppCallback p4) throws android.os.RemoteException;
    public void startDppAsEnrolleeInitiator(android.os.IBinder p0, java.lang.String p1, android.net.wifi.IDppCallback p2) throws android.os.RemoteException;
    public void stopDppSession() throws android.os.RemoteException;
    public void updateWifiUsabilityScore(int p0, int p1, int p2) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.IWifiManager {
        private static final java.lang.String DESCRIPTOR = "android.net.wifi.IWifiManager";
        static final int TRANSACTION_getSupportedFeatures = 1;
        static final int TRANSACTION_reportActivityInfo = 2;
        static final int TRANSACTION_requestActivityInfo = 3;
        static final int TRANSACTION_getConfiguredNetworks = 4;
        static final int TRANSACTION_getPrivilegedConfiguredNetworks = 5;
        static final int TRANSACTION_getAllMatchingFqdnsForScanResults = 6;
        static final int TRANSACTION_getMatchingOsuProviders = 7;
        static final int TRANSACTION_getMatchingPasspointConfigsForOsuProviders = 8;
        static final int TRANSACTION_addOrUpdateNetwork = 9;
        static final int TRANSACTION_addOrUpdatePasspointConfiguration = 10;
        static final int TRANSACTION_removePasspointConfiguration = 11;
        static final int TRANSACTION_getPasspointConfigurations = 12;
        static final int TRANSACTION_getWifiConfigsForPasspointProfiles = 13;
        static final int TRANSACTION_queryPasspointIcon = 14;
        static final int TRANSACTION_matchProviderWithCurrentNetwork = 15;
        static final int TRANSACTION_deauthenticateNetwork = 16;
        static final int TRANSACTION_removeNetwork = 17;
        static final int TRANSACTION_enableNetwork = 18;
        static final int TRANSACTION_disableNetwork = 19;
        static final int TRANSACTION_startScan = 20;
        static final int TRANSACTION_getScanResults = 21;
        static final int TRANSACTION_disconnect = 22;
        static final int TRANSACTION_reconnect = 23;
        static final int TRANSACTION_reassociate = 24;
        static final int TRANSACTION_getConnectionInfo = 25;
        static final int TRANSACTION_setWifiEnabled = 26;
        static final int TRANSACTION_getWifiEnabledState = 27;
        static final int TRANSACTION_setCountryCode = 28;
        static final int TRANSACTION_getCountryCode = 29;
        static final int TRANSACTION_isDualBandSupported = 30;
        static final int TRANSACTION_needs5GHzToAnyApBandConversion = 31;
        static final int TRANSACTION_getDhcpInfo = 32;
        static final int TRANSACTION_isScanAlwaysAvailable = 33;
        static final int TRANSACTION_acquireWifiLock = 34;
        static final int TRANSACTION_updateWifiLockWorkSource = 35;
        static final int TRANSACTION_releaseWifiLock = 36;
        static final int TRANSACTION_initializeMulticastFiltering = 37;
        static final int TRANSACTION_isMulticastEnabled = 38;
        static final int TRANSACTION_acquireMulticastLock = 39;
        static final int TRANSACTION_releaseMulticastLock = 40;
        static final int TRANSACTION_updateInterfaceIpState = 41;
        static final int TRANSACTION_startSoftAp = 42;
        static final int TRANSACTION_stopSoftAp = 43;
        static final int TRANSACTION_startLocalOnlyHotspot = 44;
        static final int TRANSACTION_stopLocalOnlyHotspot = 45;
        static final int TRANSACTION_startWatchLocalOnlyHotspot = 46;
        static final int TRANSACTION_stopWatchLocalOnlyHotspot = 47;
        static final int TRANSACTION_getWifiApEnabledState = 48;
        static final int TRANSACTION_getWifiApConfiguration = 49;
        static final int TRANSACTION_setWifiApConfiguration = 50;
        static final int TRANSACTION_notifyUserOfApBandConversion = 51;
        static final int TRANSACTION_getWifiServiceMessenger = 52;
        static final int TRANSACTION_enableTdls = 53;
        static final int TRANSACTION_enableTdlsWithMacAddress = 54;
        static final int TRANSACTION_getCurrentNetworkWpsNfcConfigurationToken = 55;
        static final int TRANSACTION_enableVerboseLogging = 56;
        static final int TRANSACTION_getVerboseLoggingLevel = 57;
        static final int TRANSACTION_enableWifiConnectivityManager = 58;
        static final int TRANSACTION_disableEphemeralNetwork = 59;
        static final int TRANSACTION_factoryReset = 60;
        static final int TRANSACTION_getCurrentNetwork = 61;
        static final int TRANSACTION_retrieveBackupData = 62;
        static final int TRANSACTION_restoreBackupData = 63;
        static final int TRANSACTION_restoreSupplicantBackupData = 64;
        static final int TRANSACTION_startSubscriptionProvisioning = 65;
        static final int TRANSACTION_registerSoftApCallback = 66;
        static final int TRANSACTION_unregisterSoftApCallback = 67;
        static final int TRANSACTION_addOnWifiUsabilityStatsListener = 68;
        static final int TRANSACTION_removeOnWifiUsabilityStatsListener = 69;
        static final int TRANSACTION_registerTrafficStateCallback = 70;
        static final int TRANSACTION_unregisterTrafficStateCallback = 71;
        static final int TRANSACTION_registerNetworkRequestMatchCallback = 72;
        static final int TRANSACTION_unregisterNetworkRequestMatchCallback = 73;
        static final int TRANSACTION_addNetworkSuggestions = 74;
        static final int TRANSACTION_removeNetworkSuggestions = 75;
        static final int TRANSACTION_getFactoryMacAddresses = 76;
        static final int TRANSACTION_setDeviceMobilityState = 77;
        static final int TRANSACTION_startDppAsConfiguratorInitiator = 78;
        static final int TRANSACTION_startDppAsEnrolleeInitiator = 79;
        static final int TRANSACTION_stopDppSession = 80;
        static final int TRANSACTION_updateWifiUsabilityScore = 81;
        public Stub() { super(); }
        public static android.net.wifi.IWifiManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.wifi.IWifiManager p0) { return false; }
        public static android.net.wifi.IWifiManager getDefaultImpl() { return null; }

        private static class Proxy implements android.net.wifi.IWifiManager {
            private android.os.IBinder mRemote;
            public static android.net.wifi.IWifiManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public long getSupportedFeatures() throws android.os.RemoteException { return 0L; }
            public android.net.wifi.WifiActivityEnergyInfo reportActivityInfo() throws android.os.RemoteException { return null; }
            public void requestActivityInfo(android.os.ResultReceiver p0) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getConfiguredNetworks(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getPrivilegedConfiguredNetworks(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.util.Map getAllMatchingFqdnsForScanResults(java.util.List<android.net.wifi.ScanResult> p0) throws android.os.RemoteException { return null; }
            public java.util.Map getMatchingOsuProviders(java.util.List<android.net.wifi.ScanResult> p0) throws android.os.RemoteException { return null; }
            public java.util.Map getMatchingPasspointConfigsForOsuProviders(java.util.List<android.net.wifi.hotspot2.OsuProvider> p0) throws android.os.RemoteException { return null; }
            public int addOrUpdateNetwork(android.net.wifi.WifiConfiguration p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public boolean addOrUpdatePasspointConfiguration(android.net.wifi.hotspot2.PasspointConfiguration p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean removePasspointConfiguration(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public java.util.List<android.net.wifi.hotspot2.PasspointConfiguration> getPasspointConfigurations(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.net.wifi.WifiConfiguration> getWifiConfigsForPasspointProfiles(java.util.List<java.lang.String> p0) throws android.os.RemoteException { return null; }
            public void queryPasspointIcon(long p0, java.lang.String p1) throws android.os.RemoteException {}
            public int matchProviderWithCurrentNetwork(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public void deauthenticateNetwork(long p0, boolean p1) throws android.os.RemoteException {}
            public boolean removeNetwork(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean enableNetwork(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean disableNetwork(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean startScan(java.lang.String p0) throws android.os.RemoteException { return false; }
            public java.util.List<android.net.wifi.ScanResult> getScanResults(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean disconnect(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean reconnect(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean reassociate(java.lang.String p0) throws android.os.RemoteException { return false; }
            public android.net.wifi.WifiInfo getConnectionInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean setWifiEnabled(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
            public int getWifiEnabledState() throws android.os.RemoteException { return 0; }
            public void setCountryCode(java.lang.String p0) throws android.os.RemoteException {}
            public java.lang.String getCountryCode() throws android.os.RemoteException { return null; }
            public boolean isDualBandSupported() throws android.os.RemoteException { return false; }
            public boolean needs5GHzToAnyApBandConversion() throws android.os.RemoteException { return false; }
            public android.net.DhcpInfo getDhcpInfo() throws android.os.RemoteException { return null; }
            public boolean isScanAlwaysAvailable() throws android.os.RemoteException { return false; }
            public boolean acquireWifiLock(android.os.IBinder p0, int p1, java.lang.String p2, android.os.WorkSource p3) throws android.os.RemoteException { return false; }
            public void updateWifiLockWorkSource(android.os.IBinder p0, android.os.WorkSource p1) throws android.os.RemoteException {}
            public boolean releaseWifiLock(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public void initializeMulticastFiltering() throws android.os.RemoteException {}
            public boolean isMulticastEnabled() throws android.os.RemoteException { return false; }
            public void acquireMulticastLock(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
            public void releaseMulticastLock(java.lang.String p0) throws android.os.RemoteException {}
            public void updateInterfaceIpState(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean startSoftAp(android.net.wifi.WifiConfiguration p0) throws android.os.RemoteException { return false; }
            public boolean stopSoftAp() throws android.os.RemoteException { return false; }
            public int startLocalOnlyHotspot(android.os.Messenger p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public void stopLocalOnlyHotspot() throws android.os.RemoteException {}
            public void startWatchLocalOnlyHotspot(android.os.Messenger p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void stopWatchLocalOnlyHotspot() throws android.os.RemoteException {}
            public int getWifiApEnabledState() throws android.os.RemoteException { return 0; }
            public android.net.wifi.WifiConfiguration getWifiApConfiguration() throws android.os.RemoteException { return null; }
            public boolean setWifiApConfiguration(android.net.wifi.WifiConfiguration p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void notifyUserOfApBandConversion(java.lang.String p0) throws android.os.RemoteException {}
            public android.os.Messenger getWifiServiceMessenger(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void enableTdls(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void enableTdlsWithMacAddress(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public java.lang.String getCurrentNetworkWpsNfcConfigurationToken() throws android.os.RemoteException { return null; }
            public void enableVerboseLogging(int p0) throws android.os.RemoteException {}
            public int getVerboseLoggingLevel() throws android.os.RemoteException { return 0; }
            public void enableWifiConnectivityManager(boolean p0) throws android.os.RemoteException {}
            public void disableEphemeralNetwork(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void factoryReset(java.lang.String p0) throws android.os.RemoteException {}
            public android.net.Network getCurrentNetwork() throws android.os.RemoteException { return null; }
            public byte[] retrieveBackupData() throws android.os.RemoteException { return null; }
            public void restoreBackupData(byte[] p0) throws android.os.RemoteException {}
            public void restoreSupplicantBackupData(byte[] p0, byte[] p1) throws android.os.RemoteException {}
            public void startSubscriptionProvisioning(android.net.wifi.hotspot2.OsuProvider p0, android.net.wifi.hotspot2.IProvisioningCallback p1) throws android.os.RemoteException {}
            public void registerSoftApCallback(android.os.IBinder p0, android.net.wifi.ISoftApCallback p1, int p2) throws android.os.RemoteException {}
            public void unregisterSoftApCallback(int p0) throws android.os.RemoteException {}
            public void addOnWifiUsabilityStatsListener(android.os.IBinder p0, android.net.wifi.IOnWifiUsabilityStatsListener p1, int p2) throws android.os.RemoteException {}
            public void removeOnWifiUsabilityStatsListener(int p0) throws android.os.RemoteException {}
            public void registerTrafficStateCallback(android.os.IBinder p0, android.net.wifi.ITrafficStateCallback p1, int p2) throws android.os.RemoteException {}
            public void unregisterTrafficStateCallback(int p0) throws android.os.RemoteException {}
            public void registerNetworkRequestMatchCallback(android.os.IBinder p0, android.net.wifi.INetworkRequestMatchCallback p1, int p2) throws android.os.RemoteException {}
            public void unregisterNetworkRequestMatchCallback(int p0) throws android.os.RemoteException {}
            public int addNetworkSuggestions(java.util.List<android.net.wifi.WifiNetworkSuggestion> p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int removeNetworkSuggestions(java.util.List<android.net.wifi.WifiNetworkSuggestion> p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public java.lang.String[] getFactoryMacAddresses() throws android.os.RemoteException { return null; }
            public void setDeviceMobilityState(int p0) throws android.os.RemoteException {}
            public void startDppAsConfiguratorInitiator(android.os.IBinder p0, java.lang.String p1, int p2, int p3, android.net.wifi.IDppCallback p4) throws android.os.RemoteException {}
            public void startDppAsEnrolleeInitiator(android.os.IBinder p0, java.lang.String p1, android.net.wifi.IDppCallback p2) throws android.os.RemoteException {}
            public void stopDppSession() throws android.os.RemoteException {}
            public void updateWifiUsabilityScore(int p0, int p1, int p2) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.net.wifi.IWifiManager {
        public Default() {}
        public long getSupportedFeatures() throws android.os.RemoteException { return 0L; }
        public android.net.wifi.WifiActivityEnergyInfo reportActivityInfo() throws android.os.RemoteException { return null; }
        public void requestActivityInfo(android.os.ResultReceiver p0) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getConfiguredNetworks(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getPrivilegedConfiguredNetworks(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.util.Map getAllMatchingFqdnsForScanResults(java.util.List<android.net.wifi.ScanResult> p0) throws android.os.RemoteException { return null; }
        public java.util.Map getMatchingOsuProviders(java.util.List<android.net.wifi.ScanResult> p0) throws android.os.RemoteException { return null; }
        public java.util.Map getMatchingPasspointConfigsForOsuProviders(java.util.List<android.net.wifi.hotspot2.OsuProvider> p0) throws android.os.RemoteException { return null; }
        public int addOrUpdateNetwork(android.net.wifi.WifiConfiguration p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public boolean addOrUpdatePasspointConfiguration(android.net.wifi.hotspot2.PasspointConfiguration p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean removePasspointConfiguration(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public java.util.List<android.net.wifi.hotspot2.PasspointConfiguration> getPasspointConfigurations(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.net.wifi.WifiConfiguration> getWifiConfigsForPasspointProfiles(java.util.List<java.lang.String> p0) throws android.os.RemoteException { return null; }
        public void queryPasspointIcon(long p0, java.lang.String p1) throws android.os.RemoteException {}
        public int matchProviderWithCurrentNetwork(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public void deauthenticateNetwork(long p0, boolean p1) throws android.os.RemoteException {}
        public boolean removeNetwork(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean enableNetwork(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean disableNetwork(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean startScan(java.lang.String p0) throws android.os.RemoteException { return false; }
        public java.util.List<android.net.wifi.ScanResult> getScanResults(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean disconnect(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean reconnect(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean reassociate(java.lang.String p0) throws android.os.RemoteException { return false; }
        public android.net.wifi.WifiInfo getConnectionInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean setWifiEnabled(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
        public int getWifiEnabledState() throws android.os.RemoteException { return 0; }
        public void setCountryCode(java.lang.String p0) throws android.os.RemoteException {}
        public java.lang.String getCountryCode() throws android.os.RemoteException { return null; }
        public boolean isDualBandSupported() throws android.os.RemoteException { return false; }
        public boolean needs5GHzToAnyApBandConversion() throws android.os.RemoteException { return false; }
        public android.net.DhcpInfo getDhcpInfo() throws android.os.RemoteException { return null; }
        public boolean isScanAlwaysAvailable() throws android.os.RemoteException { return false; }
        public boolean acquireWifiLock(android.os.IBinder p0, int p1, java.lang.String p2, android.os.WorkSource p3) throws android.os.RemoteException { return false; }
        public void updateWifiLockWorkSource(android.os.IBinder p0, android.os.WorkSource p1) throws android.os.RemoteException {}
        public boolean releaseWifiLock(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public void initializeMulticastFiltering() throws android.os.RemoteException {}
        public boolean isMulticastEnabled() throws android.os.RemoteException { return false; }
        public void acquireMulticastLock(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
        public void releaseMulticastLock(java.lang.String p0) throws android.os.RemoteException {}
        public void updateInterfaceIpState(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean startSoftAp(android.net.wifi.WifiConfiguration p0) throws android.os.RemoteException { return false; }
        public boolean stopSoftAp() throws android.os.RemoteException { return false; }
        public int startLocalOnlyHotspot(android.os.Messenger p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public void stopLocalOnlyHotspot() throws android.os.RemoteException {}
        public void startWatchLocalOnlyHotspot(android.os.Messenger p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void stopWatchLocalOnlyHotspot() throws android.os.RemoteException {}
        public int getWifiApEnabledState() throws android.os.RemoteException { return 0; }
        public android.net.wifi.WifiConfiguration getWifiApConfiguration() throws android.os.RemoteException { return null; }
        public boolean setWifiApConfiguration(android.net.wifi.WifiConfiguration p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void notifyUserOfApBandConversion(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.Messenger getWifiServiceMessenger(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void enableTdls(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void enableTdlsWithMacAddress(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public java.lang.String getCurrentNetworkWpsNfcConfigurationToken() throws android.os.RemoteException { return null; }
        public void enableVerboseLogging(int p0) throws android.os.RemoteException {}
        public int getVerboseLoggingLevel() throws android.os.RemoteException { return 0; }
        public void enableWifiConnectivityManager(boolean p0) throws android.os.RemoteException {}
        public void disableEphemeralNetwork(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void factoryReset(java.lang.String p0) throws android.os.RemoteException {}
        public android.net.Network getCurrentNetwork() throws android.os.RemoteException { return null; }
        public byte[] retrieveBackupData() throws android.os.RemoteException { return null; }
        public void restoreBackupData(byte[] p0) throws android.os.RemoteException {}
        public void restoreSupplicantBackupData(byte[] p0, byte[] p1) throws android.os.RemoteException {}
        public void startSubscriptionProvisioning(android.net.wifi.hotspot2.OsuProvider p0, android.net.wifi.hotspot2.IProvisioningCallback p1) throws android.os.RemoteException {}
        public void registerSoftApCallback(android.os.IBinder p0, android.net.wifi.ISoftApCallback p1, int p2) throws android.os.RemoteException {}
        public void unregisterSoftApCallback(int p0) throws android.os.RemoteException {}
        public void addOnWifiUsabilityStatsListener(android.os.IBinder p0, android.net.wifi.IOnWifiUsabilityStatsListener p1, int p2) throws android.os.RemoteException {}
        public void removeOnWifiUsabilityStatsListener(int p0) throws android.os.RemoteException {}
        public void registerTrafficStateCallback(android.os.IBinder p0, android.net.wifi.ITrafficStateCallback p1, int p2) throws android.os.RemoteException {}
        public void unregisterTrafficStateCallback(int p0) throws android.os.RemoteException {}
        public void registerNetworkRequestMatchCallback(android.os.IBinder p0, android.net.wifi.INetworkRequestMatchCallback p1, int p2) throws android.os.RemoteException {}
        public void unregisterNetworkRequestMatchCallback(int p0) throws android.os.RemoteException {}
        public int addNetworkSuggestions(java.util.List<android.net.wifi.WifiNetworkSuggestion> p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int removeNetworkSuggestions(java.util.List<android.net.wifi.WifiNetworkSuggestion> p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public java.lang.String[] getFactoryMacAddresses() throws android.os.RemoteException { return null; }
        public void setDeviceMobilityState(int p0) throws android.os.RemoteException {}
        public void startDppAsConfiguratorInitiator(android.os.IBinder p0, java.lang.String p1, int p2, int p3, android.net.wifi.IDppCallback p4) throws android.os.RemoteException {}
        public void startDppAsEnrolleeInitiator(android.os.IBinder p0, java.lang.String p1, android.net.wifi.IDppCallback p2) throws android.os.RemoteException {}
        public void stopDppSession() throws android.os.RemoteException {}
        public void updateWifiUsabilityScore(int p0, int p1, int p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
