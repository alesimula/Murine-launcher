package android.net.wifi;

public class WifiManager {
    public static final java.lang.String ACTION_LINK_CONFIGURATION_CHANGED = "android.net.wifi.LINK_CONFIGURATION_CHANGED";
    public static final java.lang.String ACTION_NETWORK_SETTINGS_RESET = "android.net.wifi.action.NETWORK_SETTINGS_RESET";
    public static final java.lang.String ACTION_PASSPOINT_LAUNCH_OSU_VIEW = "android.net.wifi.action.PASSPOINT_LAUNCH_OSU_VIEW";
    public static final java.lang.String ACTION_PICK_WIFI_NETWORK = "android.net.wifi.PICK_WIFI_NETWORK";
    public static final java.lang.String ACTION_REQUEST_DISABLE = "android.net.wifi.action.REQUEST_DISABLE";
    public static final java.lang.String ACTION_REQUEST_ENABLE = "android.net.wifi.action.REQUEST_ENABLE";
    public static final java.lang.String ACTION_REQUEST_SCAN_ALWAYS_AVAILABLE = "android.net.wifi.action.REQUEST_SCAN_ALWAYS_AVAILABLE";
    public static final java.lang.String ACTION_WIFI_NETWORK_SUGGESTION_POST_CONNECTION = "android.net.wifi.action.WIFI_NETWORK_SUGGESTION_POST_CONNECTION";
    public static final java.lang.String ACTION_WIFI_SCAN_AVAILABILITY_CHANGED = "android.net.wifi.action.WIFI_SCAN_AVAILABILITY_CHANGED";
    public static final int CHANGE_REASON_ADDED = 0;
    public static final int CHANGE_REASON_CONFIG_CHANGE = 2;
    public static final int CHANGE_REASON_REMOVED = 1;
    public static final java.lang.String CONFIGURED_NETWORKS_CHANGED_ACTION = "android.net.wifi.CONFIGURED_NETWORKS_CHANGE";
    public static final int DEVICE_MOBILITY_STATE_HIGH_MVMT = 1;
    public static final int DEVICE_MOBILITY_STATE_LOW_MVMT = 2;
    public static final int DEVICE_MOBILITY_STATE_STATIONARY = 3;
    public static final int DEVICE_MOBILITY_STATE_UNKNOWN = 0;
    public static final int EASY_CONNECT_NETWORK_ROLE_AP = 1;
    public static final int EASY_CONNECT_NETWORK_ROLE_STA = 0;
    @java.lang.Deprecated
    public static final int ERROR_AUTHENTICATING = 1;
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_BSSID = "bssid";
    public static final java.lang.String EXTRA_CHANGE_REASON = "changeReason";
    public static final java.lang.String EXTRA_LINK_PROPERTIES = "android.net.wifi.extra.LINK_PROPERTIES";
    public static final java.lang.String EXTRA_MULTIPLE_NETWORKS_CHANGED = "multipleChanges";
    public static final java.lang.String EXTRA_NETWORK_INFO = "networkInfo";
    public static final java.lang.String EXTRA_NETWORK_SUGGESTION = "android.net.wifi.extra.NETWORK_SUGGESTION";
    public static final java.lang.String EXTRA_NEW_RSSI = "newRssi";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_NEW_STATE = "newState";
    public static final java.lang.String EXTRA_OSU_NETWORK = "android.net.wifi.extra.OSU_NETWORK";
    public static final java.lang.String EXTRA_PREVIOUS_WIFI_AP_STATE = "previous_wifi_state";
    public static final java.lang.String EXTRA_PREVIOUS_WIFI_STATE = "previous_wifi_state";
    public static final java.lang.String EXTRA_RESULTS_UPDATED = "resultsUpdated";
    public static final java.lang.String EXTRA_SCAN_AVAILABLE = "android.net.wifi.extra.SCAN_AVAILABLE";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_SUPPLICANT_CONNECTED = "connected";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_SUPPLICANT_ERROR = "supplicantError";
    public static final java.lang.String EXTRA_URL = "android.net.wifi.extra.URL";
    public static final java.lang.String EXTRA_WIFI_AP_FAILURE_REASON = "android.net.wifi.extra.WIFI_AP_FAILURE_REASON";
    public static final java.lang.String EXTRA_WIFI_AP_INTERFACE_NAME = "android.net.wifi.extra.WIFI_AP_INTERFACE_NAME";
    public static final java.lang.String EXTRA_WIFI_AP_MODE = "android.net.wifi.extra.WIFI_AP_MODE";
    public static final java.lang.String EXTRA_WIFI_AP_STATE = "wifi_state";
    public static final java.lang.String EXTRA_WIFI_CONFIGURATION = "wifiConfiguration";
    public static final java.lang.String EXTRA_WIFI_CREDENTIAL_EVENT_TYPE = "et";
    public static final java.lang.String EXTRA_WIFI_CREDENTIAL_SSID = "ssid";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_WIFI_INFO = "wifiInfo";
    public static final java.lang.String EXTRA_WIFI_STATE = "wifi_state";
    public static final int IFACE_IP_MODE_CONFIGURATION_ERROR = 0;
    public static final int IFACE_IP_MODE_LOCAL_ONLY = 2;
    public static final int IFACE_IP_MODE_TETHERED = 1;
    public static final int IFACE_IP_MODE_UNSPECIFIED = -1;
    public static final java.lang.String NETWORK_IDS_CHANGED_ACTION = "android.net.wifi.NETWORK_IDS_CHANGED";
    public static final java.lang.String NETWORK_STATE_CHANGED_ACTION = "android.net.wifi.STATE_CHANGE";
    public static final int PASSPOINT_HOME_NETWORK = 0;
    public static final int PASSPOINT_ROAMING_NETWORK = 1;
    public static final java.lang.String RSSI_CHANGED_ACTION = "android.net.wifi.RSSI_CHANGED";
    public static final int SAP_CLIENT_BLOCK_REASON_CODE_BLOCKED_BY_USER = 0;
    public static final int SAP_CLIENT_BLOCK_REASON_CODE_NO_MORE_STAS = 1;
    public static final int SAP_START_FAILURE_GENERAL = 0;
    public static final int SAP_START_FAILURE_NO_CHANNEL = 1;
    public static final int SAP_START_FAILURE_UNSUPPORTED_CONFIGURATION = 2;
    public static final java.lang.String SCAN_RESULTS_AVAILABLE_ACTION = "android.net.wifi.SCAN_RESULTS";
    public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_ADD_DUPLICATE = 3;
    public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_ADD_EXCEEDS_MAX_PER_APP = 4;
    public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_ADD_INVALID = 7;
    public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_ADD_NOT_ALLOWED = 6;
    public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_APP_DISALLOWED = 2;
    public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_INTERNAL = 1;
    public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_REMOVE_INVALID = 5;
    public static final int STATUS_NETWORK_SUGGESTIONS_SUCCESS = 0;
    public static final int STATUS_SUGGESTION_CONNECTION_FAILURE_ASSOCIATION = 1;
    public static final int STATUS_SUGGESTION_CONNECTION_FAILURE_AUTHENTICATION = 2;
    public static final int STATUS_SUGGESTION_CONNECTION_FAILURE_IP_PROVISIONING = 3;
    public static final int STATUS_SUGGESTION_CONNECTION_FAILURE_UNKNOWN = 0;
    @java.lang.Deprecated
    public static final java.lang.String SUPPLICANT_CONNECTION_CHANGE_ACTION = "android.net.wifi.supplicant.CONNECTION_CHANGE";
    @java.lang.Deprecated
    public static final java.lang.String SUPPLICANT_STATE_CHANGED_ACTION = "android.net.wifi.supplicant.STATE_CHANGE";
    public static final java.lang.String UNKNOWN_SSID = "<unknown ssid>";
    public static final java.lang.String WIFI_AP_STATE_CHANGED_ACTION = "android.net.wifi.WIFI_AP_STATE_CHANGED";
    public static final int WIFI_AP_STATE_DISABLED = 11;
    public static final int WIFI_AP_STATE_DISABLING = 10;
    public static final int WIFI_AP_STATE_ENABLED = 13;
    public static final int WIFI_AP_STATE_ENABLING = 12;
    public static final int WIFI_AP_STATE_FAILED = 14;
    public static final java.lang.String WIFI_CREDENTIAL_CHANGED_ACTION = "android.net.wifi.WIFI_CREDENTIAL_CHANGED";
    public static final int WIFI_CREDENTIAL_FORGOT = 1;
    public static final int WIFI_CREDENTIAL_SAVED = 0;
    @java.lang.Deprecated
    public static final int WIFI_MODE_FULL = 1;
    public static final int WIFI_MODE_FULL_HIGH_PERF = 3;
    public static final int WIFI_MODE_FULL_LOW_LATENCY = 4;
    @java.lang.Deprecated
    public static final int WIFI_MODE_SCAN_ONLY = 2;
    public static final java.lang.String WIFI_STATE_CHANGED_ACTION = "android.net.wifi.WIFI_STATE_CHANGED";
    public static final int WIFI_STATE_DISABLED = 1;
    public static final int WIFI_STATE_DISABLING = 0;
    public static final int WIFI_STATE_ENABLED = 3;
    public static final int WIFI_STATE_ENABLING = 2;
    public static final int WIFI_STATE_UNKNOWN = 4;
    @java.lang.Deprecated
    public static final int WPS_AUTH_FAILURE = 6;
    @java.lang.Deprecated
    public static final int WPS_OVERLAP_ERROR = 3;
    @java.lang.Deprecated
    public static final int WPS_TIMED_OUT = 7;
    @java.lang.Deprecated
    public static final int WPS_TKIP_ONLY_PROHIBITED = 5;
    @java.lang.Deprecated
    public static final int WPS_WEP_PROHIBITED = 4;
    WifiManager() {}
    @java.lang.Deprecated
    public java.util.List<android.net.wifi.WifiConfiguration> getConfiguredNetworks() { return null; }
    public java.util.List<android.net.wifi.WifiConfiguration> getPrivilegedConfiguredNetworks() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.util.Pair<android.net.wifi.WifiConfiguration, java.util.Map<java.lang.Integer, java.util.List<android.net.wifi.ScanResult>>>> getAllMatchingWifiConfigs(java.util.List<android.net.wifi.ScanResult> p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.WifiConfiguration> getWifiConfigForMatchedNetworkSuggestionsSharedWithUser(java.util.List<android.net.wifi.ScanResult> p0) { return null; }
    @android.annotation.NonNull
    public java.util.Map<android.net.wifi.hotspot2.OsuProvider, java.util.List<android.net.wifi.ScanResult>> getMatchingOsuProviders(java.util.List<android.net.wifi.ScanResult> p0) { return null; }
    @android.annotation.NonNull
    public java.util.Map<android.net.wifi.hotspot2.OsuProvider, android.net.wifi.hotspot2.PasspointConfiguration> getMatchingPasspointConfigsForOsuProviders(java.util.Set<android.net.wifi.hotspot2.OsuProvider> p0) { return null; }
    @java.lang.Deprecated
    public int addNetwork(android.net.wifi.WifiConfiguration p0) { return 0; }
    @java.lang.Deprecated
    public int updateNetwork(android.net.wifi.WifiConfiguration p0) { return 0; }
    public void registerNetworkRequestMatchCallback(java.util.concurrent.Executor p0, android.net.wifi.WifiManager.NetworkRequestMatchCallback p1) {}
    public void unregisterNetworkRequestMatchCallback(android.net.wifi.WifiManager.NetworkRequestMatchCallback p0) {}
    public int addNetworkSuggestions(java.util.List<android.net.wifi.WifiNetworkSuggestion> p0) { return 0; }
    public int removeNetworkSuggestions(java.util.List<android.net.wifi.WifiNetworkSuggestion> p0) { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.WifiNetworkSuggestion> getNetworkSuggestions() { return null; }
    public int getMaxNumberOfNetworkSuggestionsPerApp() { return 0; }
    public void addOrUpdatePasspointConfiguration(android.net.wifi.hotspot2.PasspointConfiguration p0) {}
    @java.lang.Deprecated
    public void removePasspointConfiguration(java.lang.String p0) {}
    @java.lang.Deprecated
    public java.util.List<android.net.wifi.hotspot2.PasspointConfiguration> getPasspointConfigurations() { return null; }
    @java.lang.Deprecated
    public boolean removeNetwork(int p0) { return false; }
    @java.lang.Deprecated
    public boolean enableNetwork(int p0, boolean p1) { return false; }
    @java.lang.Deprecated
    public boolean disableNetwork(int p0) { return false; }
    @java.lang.Deprecated
    public boolean disconnect() { return false; }
    @java.lang.Deprecated
    public boolean reconnect() { return false; }
    @java.lang.Deprecated
    public boolean reassociate() { return false; }
    @java.lang.Deprecated
    public boolean pingSupplicant() { return false; }
    public boolean isP2pSupported() { return false; }
    public boolean isPortableHotspotSupported() { return false; }
    public boolean isWifiScannerSupported() { return false; }
    public boolean isStaApConcurrencySupported() { return false; }
    @java.lang.Deprecated
    public boolean isDeviceToDeviceRttSupported() { return false; }
    @java.lang.Deprecated
    public boolean isDeviceToApRttSupported() { return false; }
    public boolean isPreferredNetworkOffloadSupported() { return false; }
    public boolean isTdlsSupported() { return false; }
    public boolean isEnhancedPowerReportingSupported() { return false; }
    public boolean isConnectedMacRandomizationSupported() { return false; }
    public boolean isApMacRandomizationSupported() { return false; }
    public boolean is5GHzBandSupported() { return false; }
    public boolean is6GHzBandSupported() { return false; }
    public boolean isWifiStandardSupported(int p0) { return false; }
    public void getWifiActivityEnergyInfoAsync(java.util.concurrent.Executor p0, android.net.wifi.WifiManager.OnWifiActivityEnergyInfoListener p1) {}
    @java.lang.Deprecated
    public boolean startScan() { return false; }
    public boolean startScan(android.os.WorkSource p0) { return false; }
    public android.net.wifi.WifiInfo getConnectionInfo() { return null; }
    public java.util.List<android.net.wifi.ScanResult> getScanResults() { return null; }
    @android.annotation.NonNull
    public java.util.Map<android.net.wifi.WifiNetworkSuggestion, java.util.List<android.net.wifi.ScanResult>> getMatchingScanResults(java.util.List<android.net.wifi.WifiNetworkSuggestion> p0, java.util.List<android.net.wifi.ScanResult> p1) { return null; }
    public void setScanAlwaysAvailable(boolean p0) {}
    @java.lang.Deprecated
    public boolean isScanAlwaysAvailable() { return false; }
    @java.lang.Deprecated
    public boolean saveConfiguration() { return false; }
    @android.annotation.Nullable
    public java.lang.String getCountryCode() { return null; }
    public android.net.DhcpInfo getDhcpInfo() { return null; }
    @java.lang.Deprecated
    public boolean setWifiEnabled(boolean p0) { return false; }
    public int getWifiState() { return 0; }
    public boolean isWifiEnabled() { return false; }
    @java.lang.Deprecated
    public static int calculateSignalLevel(int p0, int p1) { return 0; }
    public int calculateSignalLevel(int p0) { return 0; }
    public int getMaxSignalLevel() { return 0; }
    public static int compareSignalLevel(int p0, int p1) { return 0; }
    public void updateInterfaceIpState(java.lang.String p0, int p1) {}
    public boolean startTetheredHotspot(android.net.wifi.SoftApConfiguration p0) { return false; }
    public boolean stopSoftAp() { return false; }
    public void startLocalOnlyHotspot(android.net.wifi.WifiManager.LocalOnlyHotspotCallback p0, android.os.Handler p1) {}
    public void startLocalOnlyHotspot(android.net.wifi.SoftApConfiguration p0, java.util.concurrent.Executor p1, android.net.wifi.WifiManager.LocalOnlyHotspotCallback p2) {}
    public int getWifiApState() { return 0; }
    public boolean isWifiApEnabled() { return false; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public android.net.wifi.WifiConfiguration getWifiApConfiguration() { return null; }
    @android.annotation.NonNull
    public android.net.wifi.SoftApConfiguration getSoftApConfiguration() { return null; }
    @java.lang.Deprecated
    public boolean setWifiApConfiguration(android.net.wifi.WifiConfiguration p0) { return false; }
    public boolean setSoftApConfiguration(android.net.wifi.SoftApConfiguration p0) { return false; }
    public void setTdlsEnabled(java.net.InetAddress p0, boolean p1) {}
    public void setTdlsEnabledWithMacAddress(java.lang.String p0, boolean p1) {}
    public void registerSoftApCallback(java.util.concurrent.Executor p0, android.net.wifi.WifiManager.SoftApCallback p1) {}
    public void unregisterSoftApCallback(android.net.wifi.WifiManager.SoftApCallback p0) {}
    public void connect(android.net.wifi.WifiConfiguration p0, android.net.wifi.WifiManager.ActionListener p1) {}
    public void connect(int p0, android.net.wifi.WifiManager.ActionListener p1) {}
    public void save(android.net.wifi.WifiConfiguration p0, android.net.wifi.WifiManager.ActionListener p1) {}
    public void forget(int p0, android.net.wifi.WifiManager.ActionListener p1) {}
    @java.lang.Deprecated
    public void disable(int p0, android.net.wifi.WifiManager.ActionListener p1) {}
    public void allowAutojoinGlobal(boolean p0) {}
    public void allowAutojoin(int p0, boolean p1) {}
    public void allowAutojoinPasspoint(java.lang.String p0, boolean p1) {}
    public void setMacRandomizationSettingPasspointEnabled(java.lang.String p0, boolean p1) {}
    public void setPasspointMeteredOverride(java.lang.String p0, int p1) {}
    public void disableEphemeralNetwork(java.lang.String p0) {}
    @java.lang.Deprecated
    public void startWps(android.net.wifi.WpsInfo p0, android.net.wifi.WifiManager.WpsCallback p1) {}
    @java.lang.Deprecated
    public void cancelWps(android.net.wifi.WifiManager.WpsCallback p0) {}
    public android.net.wifi.WifiManager.WifiLock createWifiLock(int p0, java.lang.String p1) { return null; }
    @java.lang.Deprecated
    public android.net.wifi.WifiManager.WifiLock createWifiLock(java.lang.String p0) { return null; }
    public android.net.wifi.WifiManager.MulticastLock createMulticastLock(java.lang.String p0) { return null; }
    public void setVerboseLoggingEnabled(boolean p0) {}
    public boolean isVerboseLoggingEnabled() { return false; }
    public void factoryReset() {}
    @android.annotation.Nullable
    public android.net.Network getCurrentNetwork() { return null; }
    @android.annotation.NonNull
    public byte[] retrieveBackupData() { return null; }
    public void restoreBackupData(byte[] p0) {}
    @android.annotation.NonNull
    public byte[] retrieveSoftApBackupData() { return null; }
    @android.annotation.Nullable
    public android.net.wifi.SoftApConfiguration restoreSoftApBackupData(byte[] p0) { return null; }
    public void restoreSupplicantBackupData(byte[] p0, byte[] p1) {}
    public void startSubscriptionProvisioning(android.net.wifi.hotspot2.OsuProvider p0, java.util.concurrent.Executor p1, android.net.wifi.hotspot2.ProvisioningCallback p2) {}
    public void registerTrafficStateCallback(java.util.concurrent.Executor p0, android.net.wifi.WifiManager.TrafficStateCallback p1) {}
    public void unregisterTrafficStateCallback(android.net.wifi.WifiManager.TrafficStateCallback p0) {}
    public boolean isWpa3SaeSupported() { return false; }
    public boolean isWpa3SuiteBSupported() { return false; }
    public boolean isEnhancedOpenSupported() { return false; }
    public boolean isEasyConnectSupported() { return false; }
    public boolean isWapiSupported() { return false; }
    @android.annotation.NonNull
    public java.lang.String[] getFactoryMacAddresses() { return null; }
    public void setDeviceMobilityState(int p0) {}
    public void startEasyConnectAsConfiguratorInitiator(java.lang.String p0, int p1, int p2, java.util.concurrent.Executor p3, android.net.wifi.EasyConnectStatusCallback p4) {}
    public void startEasyConnectAsEnrolleeInitiator(java.lang.String p0, java.util.concurrent.Executor p1, android.net.wifi.EasyConnectStatusCallback p2) {}
    public void stopEasyConnectSession() {}
    public void addOnWifiUsabilityStatsListener(java.util.concurrent.Executor p0, android.net.wifi.WifiManager.OnWifiUsabilityStatsListener p1) {}
    public void removeOnWifiUsabilityStatsListener(android.net.wifi.WifiManager.OnWifiUsabilityStatsListener p0) {}
    public void updateWifiUsabilityScore(int p0, int p1, int p2) {}
    public void registerScanResultsCallback(java.util.concurrent.Executor p0, android.net.wifi.WifiManager.ScanResultsCallback p1) {}
    public void unregisterScanResultsCallback(android.net.wifi.WifiManager.ScanResultsCallback p0) {}
    public void addSuggestionConnectionStatusListener(java.util.concurrent.Executor p0, android.net.wifi.WifiManager.SuggestionConnectionStatusListener p1) {}
    public void removeSuggestionConnectionStatusListener(android.net.wifi.WifiManager.SuggestionConnectionStatusListener p0) {}
    public boolean setWifiConnectedNetworkScorer(java.util.concurrent.Executor p0, android.net.wifi.WifiManager.WifiConnectedNetworkScorer p1) { return false; }
    public void clearWifiConnectedNetworkScorer() {}
    public void setScanThrottleEnabled(boolean p0) {}
    public boolean isScanThrottleEnabled() { return false; }
    public void setAutoWakeupEnabled(boolean p0) {}
    public boolean isAutoWakeupEnabled() { return false; }

    public static interface ActionListener {
        public void onSuccess();
        public void onFailure(int p0);
    }

    public static class LocalOnlyHotspotCallback {
        public static final int ERROR_GENERIC = 2;
        public static final int ERROR_INCOMPATIBLE_MODE = 3;
        public static final int ERROR_NO_CHANNEL = 1;
        public static final int ERROR_TETHERING_DISALLOWED = 4;
        public LocalOnlyHotspotCallback() {}
        public void onStarted(android.net.wifi.WifiManager.LocalOnlyHotspotReservation p0) {}
        public void onStopped() {}
        public void onFailed(int p0) {}
    }

    public class LocalOnlyHotspotReservation implements java.lang.AutoCloseable {
        LocalOnlyHotspotReservation(android.net.wifi.WifiManager p0) {}
        @java.lang.Deprecated
        @android.annotation.Nullable
        public android.net.wifi.WifiConfiguration getWifiConfiguration() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration getSoftApConfiguration() { return null; }
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
    }

    public class MulticastLock {
        private MulticastLock(android.net.wifi.WifiManager p0) {}
        public void acquire() {}
        public void release() {}
        public void setReferenceCounted(boolean p0) {}
        public boolean isHeld() { return false; }
        public java.lang.String toString() { return null; }
        protected void finalize() throws java.lang.Throwable {}
    }

    public static interface NetworkRequestMatchCallback {
        default public void onUserSelectionCallbackRegistration(android.net.wifi.WifiManager.NetworkRequestUserSelectionCallback p0) {}
        default public void onAbort() {}
        default public void onMatch(java.util.List<android.net.wifi.ScanResult> p0) {}
        default public void onUserSelectionConnectSuccess(android.net.wifi.WifiConfiguration p0) {}
        default public void onUserSelectionConnectFailure(android.net.wifi.WifiConfiguration p0) {}
    }

    public static interface NetworkRequestUserSelectionCallback {
        default public void select(android.net.wifi.WifiConfiguration p0) {}
        default public void reject() {}
    }

    public static interface OnWifiActivityEnergyInfoListener {
        public void onWifiActivityEnergyInfo(android.os.connectivity.WifiActivityEnergyInfo p0);
    }

    public static interface OnWifiUsabilityStatsListener {
        public void onWifiUsabilityStats(int p0, boolean p1, android.net.wifi.WifiUsabilityStatsEntry p2);
    }

    public static abstract class ScanResultsCallback {
        public ScanResultsCallback() {}
        public abstract void onScanResultsAvailable();
    }

    public static interface ScoreUpdateObserver {
        public void notifyScoreUpdate(int p0, int p1);
        public void triggerUpdateOfWifiUsabilityStats(int p0);
    }

    public static interface SoftApCallback {
        default public void onStateChanged(int p0, int p1) {}
        default public void onConnectedClientsChanged(java.util.List<android.net.wifi.WifiClient> p0) {}
        default public void onInfoChanged(android.net.wifi.SoftApInfo p0) {}
        default public void onCapabilityChanged(android.net.wifi.SoftApCapability p0) {}
        default public void onBlockedClientConnecting(android.net.wifi.WifiClient p0, int p1) {}
    }

    public static interface SuggestionConnectionStatusListener {
        public void onConnectionStatus(android.net.wifi.WifiNetworkSuggestion p0, int p1);
    }

    public static interface TrafficStateCallback {
        public static final int DATA_ACTIVITY_IN = 1;
        public static final int DATA_ACTIVITY_INOUT = 3;
        public static final int DATA_ACTIVITY_NONE = 0;
        public static final int DATA_ACTIVITY_OUT = 2;
        public void onStateChanged(int p0);
    }

    public static interface WifiConnectedNetworkScorer {
        public void onStart(int p0);
        public void onStop(int p0);
        public void onSetScoreUpdateObserver(android.net.wifi.WifiManager.ScoreUpdateObserver p0);
    }

    public class WifiLock {
        private WifiLock(android.net.wifi.WifiManager p0) {}
        public void acquire() {}
        public void release() {}
        public void setReferenceCounted(boolean p0) {}
        public boolean isHeld() { return false; }
        public void setWorkSource(android.os.WorkSource p0) {}
        public java.lang.String toString() { return null; }
        protected void finalize() throws java.lang.Throwable {}
    }

    @java.lang.Deprecated
    public static abstract class WpsCallback {
        @java.lang.Deprecated
        public WpsCallback() {}
        @java.lang.Deprecated
        public abstract void onStarted(java.lang.String p0);
        @java.lang.Deprecated
        public abstract void onSucceeded();
        @java.lang.Deprecated
        public abstract void onFailed(int p0);
    }
}
