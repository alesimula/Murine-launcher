package android.net.wifi;

public class WifiManager {
    private static final java.lang.String TAG = "WifiManager";
    @java.lang.Deprecated
    public static final int ERROR_AUTHENTICATING = 1;
    @java.lang.Deprecated
    public static final int ERROR_AUTH_FAILURE_NONE = 0;
    @java.lang.Deprecated
    public static final int ERROR_AUTH_FAILURE_TIMEOUT = 1;
    @java.lang.Deprecated
    public static final int ERROR_AUTH_FAILURE_WRONG_PSWD = 2;
    @java.lang.Deprecated
    public static final int ERROR_AUTH_FAILURE_EAP_FAILURE = 3;
    public static final int NETWORK_SUGGESTIONS_MAX_PER_APP = Integer.valueOf(0);
    public static final int STATUS_NETWORK_SUGGESTIONS_SUCCESS = 0;
    public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_INTERNAL = 1;
    public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_APP_DISALLOWED = 2;
    public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_ADD_DUPLICATE = 3;
    public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_ADD_EXCEEDS_MAX_PER_APP = 4;
    public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_REMOVE_INVALID = 5;
    public static final java.lang.String WIFI_SCAN_AVAILABLE = "wifi_scan_available";
    public static final java.lang.String EXTRA_SCAN_AVAILABLE = "scan_enabled";
    @android.annotation.SystemApi
    public static final java.lang.String WIFI_CREDENTIAL_CHANGED_ACTION = "android.net.wifi.WIFI_CREDENTIAL_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_WIFI_CREDENTIAL_EVENT_TYPE = "et";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_WIFI_CREDENTIAL_SSID = "ssid";
    @android.annotation.SystemApi
    public static final int WIFI_CREDENTIAL_SAVED = 0;
    @android.annotation.SystemApi
    public static final int WIFI_CREDENTIAL_FORGOT = 1;
    @android.annotation.SystemApi
    public static final int PASSPOINT_HOME_NETWORK = 0;
    @android.annotation.SystemApi
    public static final int PASSPOINT_ROAMING_NETWORK = 1;
    public static final java.lang.String ACTION_PASSPOINT_ICON = "android.net.wifi.action.PASSPOINT_ICON";
    public static final java.lang.String EXTRA_BSSID_LONG = "android.net.wifi.extra.BSSID_LONG";
    public static final java.lang.String EXTRA_ICON = "android.net.wifi.extra.ICON";
    public static final java.lang.String EXTRA_FILENAME = "android.net.wifi.extra.FILENAME";
    public static final java.lang.String ACTION_PASSPOINT_OSU_PROVIDERS_LIST = "android.net.wifi.action.PASSPOINT_OSU_PROVIDERS_LIST";
    public static final java.lang.String EXTRA_ANQP_ELEMENT_DATA = "android.net.wifi.extra.ANQP_ELEMENT_DATA";
    public static final java.lang.String ACTION_PASSPOINT_DEAUTH_IMMINENT = "android.net.wifi.action.PASSPOINT_DEAUTH_IMMINENT";
    public static final java.lang.String EXTRA_ESS = "android.net.wifi.extra.ESS";
    public static final java.lang.String EXTRA_DELAY = "android.net.wifi.extra.DELAY";
    public static final java.lang.String EXTRA_URL = "android.net.wifi.extra.URL";
    public static final java.lang.String ACTION_PASSPOINT_SUBSCRIPTION_REMEDIATION = "android.net.wifi.action.PASSPOINT_SUBSCRIPTION_REMEDIATION";
    public static final java.lang.String EXTRA_SUBSCRIPTION_REMEDIATION_METHOD = "android.net.wifi.extra.SUBSCRIPTION_REMEDIATION_METHOD";
    public static final java.lang.String ACTION_PASSPOINT_LAUNCH_OSU_VIEW = "android.net.wifi.action.PASSPOINT_LAUNCH_OSU_VIEW";
    public static final java.lang.String EXTRA_OSU_NETWORK = "android.net.wifi.extra.OSU_NETWORK";
    public static final java.lang.String WIFI_STATE_CHANGED_ACTION = "android.net.wifi.WIFI_STATE_CHANGED";
    public static final java.lang.String EXTRA_WIFI_STATE = "wifi_state";
    public static final java.lang.String EXTRA_PREVIOUS_WIFI_STATE = "previous_wifi_state";
    public static final int WIFI_STATE_DISABLING = 0;
    public static final int WIFI_STATE_DISABLED = 1;
    public static final int WIFI_STATE_ENABLING = 2;
    public static final int WIFI_STATE_ENABLED = 3;
    public static final int WIFI_STATE_UNKNOWN = 4;
    @android.annotation.SystemApi
    public static final java.lang.String WIFI_AP_STATE_CHANGED_ACTION = "android.net.wifi.WIFI_AP_STATE_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_WIFI_AP_STATE = "wifi_state";
    public static final java.lang.String EXTRA_WIFI_AP_FAILURE_REASON = "wifi_ap_error_code";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PREVIOUS_WIFI_AP_STATE = "previous_wifi_state";
    public static final java.lang.String EXTRA_WIFI_AP_INTERFACE_NAME = "wifi_ap_interface_name";
    public static final java.lang.String EXTRA_WIFI_AP_MODE = "wifi_ap_mode";
    @android.annotation.SystemApi
    public static final int WIFI_AP_STATE_DISABLING = 10;
    @android.annotation.SystemApi
    public static final int WIFI_AP_STATE_DISABLED = 11;
    @android.annotation.SystemApi
    public static final int WIFI_AP_STATE_ENABLING = 12;
    @android.annotation.SystemApi
    public static final int WIFI_AP_STATE_ENABLED = 13;
    @android.annotation.SystemApi
    public static final int WIFI_AP_STATE_FAILED = 14;
    public static final int SAP_START_FAILURE_GENERAL = 0;
    public static final int SAP_START_FAILURE_NO_CHANNEL = 1;
    public static final int IFACE_IP_MODE_UNSPECIFIED = -1;
    public static final int IFACE_IP_MODE_CONFIGURATION_ERROR = 0;
    public static final int IFACE_IP_MODE_TETHERED = 1;
    public static final int IFACE_IP_MODE_LOCAL_ONLY = 2;
    public static final java.lang.String WIFI_NETWORK_SETTINGS_RESET_ACTION = "android.net.wifi.action.NETWORK_SETTINGS_RESET";
    @java.lang.Deprecated
    public static final java.lang.String SUPPLICANT_CONNECTION_CHANGE_ACTION = "android.net.wifi.supplicant.CONNECTION_CHANGE";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_SUPPLICANT_CONNECTED = "connected";
    public static final java.lang.String NETWORK_STATE_CHANGED_ACTION = "android.net.wifi.STATE_CHANGE";
    public static final java.lang.String EXTRA_NETWORK_INFO = "networkInfo";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_BSSID = "bssid";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_WIFI_INFO = "wifiInfo";
    @java.lang.Deprecated
    public static final java.lang.String SUPPLICANT_STATE_CHANGED_ACTION = "android.net.wifi.supplicant.STATE_CHANGE";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_NEW_STATE = "newState";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_SUPPLICANT_ERROR = "supplicantError";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_SUPPLICANT_ERROR_REASON = "supplicantErrorReason";
    @android.annotation.SystemApi
    public static final java.lang.String CONFIGURED_NETWORKS_CHANGED_ACTION = "android.net.wifi.CONFIGURED_NETWORKS_CHANGE";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_WIFI_CONFIGURATION = "wifiConfiguration";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_MULTIPLE_NETWORKS_CHANGED = "multipleChanges";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_CHANGE_REASON = "changeReason";
    @android.annotation.SystemApi
    public static final int CHANGE_REASON_ADDED = 0;
    @android.annotation.SystemApi
    public static final int CHANGE_REASON_REMOVED = 1;
    @android.annotation.SystemApi
    public static final int CHANGE_REASON_CONFIG_CHANGE = 2;
    public static final java.lang.String SCAN_RESULTS_AVAILABLE_ACTION = "android.net.wifi.SCAN_RESULTS";
    public static final java.lang.String EXTRA_RESULTS_UPDATED = "resultsUpdated";
    @java.lang.Deprecated
    public static final java.lang.String BATCHED_SCAN_RESULTS_AVAILABLE_ACTION = "android.net.wifi.BATCHED_RESULTS";
    public static final java.lang.String RSSI_CHANGED_ACTION = "android.net.wifi.RSSI_CHANGED";
    public static final java.lang.String EXTRA_NEW_RSSI = "newRssi";
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String LINK_CONFIGURATION_CHANGED_ACTION = "android.net.wifi.LINK_CONFIGURATION_CHANGED";
    public static final java.lang.String EXTRA_LINK_PROPERTIES = "linkProperties";
    public static final java.lang.String EXTRA_NETWORK_CAPABILITIES = "networkCapabilities";
    public static final java.lang.String NETWORK_IDS_CHANGED_ACTION = "android.net.wifi.NETWORK_IDS_CHANGED";
    public static final java.lang.String ACTION_REQUEST_SCAN_ALWAYS_AVAILABLE = "android.net.wifi.action.REQUEST_SCAN_ALWAYS_AVAILABLE";
    public static final java.lang.String ACTION_PICK_WIFI_NETWORK = "android.net.wifi.PICK_WIFI_NETWORK";
    public static final java.lang.String ACTION_REQUEST_ENABLE = "android.net.wifi.action.REQUEST_ENABLE";
    public static final java.lang.String ACTION_REQUEST_DISABLE = "android.net.wifi.action.REQUEST_DISABLE";
    public static final java.lang.String ACTION_WIFI_NETWORK_SUGGESTION_POST_CONNECTION = "android.net.wifi.action.WIFI_NETWORK_SUGGESTION_POST_CONNECTION";
    public static final java.lang.String EXTRA_NETWORK_SUGGESTION = "android.net.wifi.extra.NETWORK_SUGGESTION";
    public static final int WIFI_MODE_NO_LOCKS_HELD = 0;
    @java.lang.Deprecated
    public static final int WIFI_MODE_FULL = 1;
    @java.lang.Deprecated
    public static final int WIFI_MODE_SCAN_ONLY = 2;
    public static final int WIFI_MODE_FULL_HIGH_PERF = 3;
    public static final int WIFI_MODE_FULL_LOW_LATENCY = 4;
    @android.annotation.UnsupportedAppUsage
    private static final int MIN_RSSI = -100;
    @android.annotation.UnsupportedAppUsage
    private static final int MAX_RSSI = -55;
    @android.annotation.UnsupportedAppUsage
    public static final int RSSI_LEVELS = 5;
    @android.annotation.UnsupportedAppUsage
    public static final int WIFI_FREQUENCY_BAND_AUTO = 0;
    @android.annotation.UnsupportedAppUsage
    public static final int WIFI_FREQUENCY_BAND_5GHZ = 1;
    @android.annotation.UnsupportedAppUsage
    public static final int WIFI_FREQUENCY_BAND_2GHZ = 2;
    public static final boolean DEFAULT_POOR_NETWORK_AVOIDANCE_ENABLED = false;
    private static final int MAX_ACTIVE_LOCKS = 50;
    @android.annotation.UnsupportedAppUsage
    private int mActiveLockCount;
    private android.content.Context mContext;
    @android.annotation.UnsupportedAppUsage
    android.net.wifi.IWifiManager mService;
    private final int mTargetSdkVersion = 0;
    private static final int INVALID_KEY = 0;
    private int mListenerKey;
    private final android.util.SparseArray mListenerMap = null;
    private final java.lang.Object mListenerMapLock = null;
    private com.android.internal.util.AsyncChannel mAsyncChannel;
    private java.util.concurrent.CountDownLatch mConnected;
    private android.os.Looper mLooper;
    private boolean mVerboseLoggingEnabled;
    public static final int HOTSPOT_STARTED = 0;
    public static final int HOTSPOT_STOPPED = 1;
    public static final int HOTSPOT_FAILED = 2;
    public static final int HOTSPOT_OBSERVER_REGISTERED = 3;
    private final java.lang.Object mLock = null;
    private android.net.wifi.WifiManager.LocalOnlyHotspotCallbackProxy mLOHSCallbackProxy;
    private android.net.wifi.WifiManager.LocalOnlyHotspotObserverProxy mLOHSObserverProxy;
    public static final int WIFI_FEATURE_INFRA = 1;
    public static final int WIFI_FEATURE_INFRA_5G = 2;
    public static final int WIFI_FEATURE_PASSPOINT = 4;
    public static final int WIFI_FEATURE_P2P = 8;
    public static final int WIFI_FEATURE_MOBILE_HOTSPOT = 16;
    public static final int WIFI_FEATURE_SCANNER = 32;
    public static final int WIFI_FEATURE_AWARE = 64;
    public static final int WIFI_FEATURE_D2D_RTT = 128;
    public static final int WIFI_FEATURE_D2AP_RTT = 256;
    public static final int WIFI_FEATURE_BATCH_SCAN = 512;
    public static final int WIFI_FEATURE_PNO = 1024;
    public static final int WIFI_FEATURE_ADDITIONAL_STA = 2048;
    public static final int WIFI_FEATURE_TDLS = 4096;
    public static final int WIFI_FEATURE_TDLS_OFFCHANNEL = 8192;
    public static final int WIFI_FEATURE_EPR = 16384;
    public static final int WIFI_FEATURE_AP_STA = 32768;
    public static final int WIFI_FEATURE_LINK_LAYER_STATS = 65536;
    public static final int WIFI_FEATURE_LOGGER = 131072;
    public static final int WIFI_FEATURE_HAL_EPNO = 262144;
    public static final int WIFI_FEATURE_RSSI_MONITOR = 524288;
    public static final int WIFI_FEATURE_MKEEP_ALIVE = 1048576;
    public static final int WIFI_FEATURE_CONFIG_NDO = 2097152;
    public static final int WIFI_FEATURE_TRANSMIT_POWER = 4194304;
    public static final int WIFI_FEATURE_CONTROL_ROAMING = 8388608;
    public static final int WIFI_FEATURE_IE_WHITELIST = 16777216;
    public static final int WIFI_FEATURE_SCAN_RAND = 33554432;
    public static final int WIFI_FEATURE_TX_POWER_LIMIT = 67108864;
    public static final int WIFI_FEATURE_WPA3_SAE = 134217728;
    public static final int WIFI_FEATURE_WPA3_SUITE_B = 268435456;
    public static final int WIFI_FEATURE_OWE = 536870912;
    public static final int WIFI_FEATURE_LOW_LATENCY = 1073741824;
    public static final int WIFI_FEATURE_DPP = -2147483648;
    public static final long WIFI_FEATURE_P2P_RAND_MAC = 4294967296L;
    private static final int BASE = 151552;
    public static final int CONNECT_NETWORK = 151553;
    public static final int CONNECT_NETWORK_FAILED = 151554;
    public static final int CONNECT_NETWORK_SUCCEEDED = 151555;
    public static final int FORGET_NETWORK = 151556;
    public static final int FORGET_NETWORK_FAILED = 151557;
    public static final int FORGET_NETWORK_SUCCEEDED = 151558;
    public static final int SAVE_NETWORK = 151559;
    public static final int SAVE_NETWORK_FAILED = 151560;
    public static final int SAVE_NETWORK_SUCCEEDED = 151561;
    public static final int START_WPS = 151562;
    public static final int START_WPS_SUCCEEDED = 151563;
    public static final int WPS_FAILED = 151564;
    public static final int WPS_COMPLETED = 151565;
    public static final int CANCEL_WPS = 151566;
    public static final int CANCEL_WPS_FAILED = 151567;
    public static final int CANCEL_WPS_SUCCEDED = 151568;
    public static final int DISABLE_NETWORK = 151569;
    public static final int DISABLE_NETWORK_FAILED = 151570;
    public static final int DISABLE_NETWORK_SUCCEEDED = 151571;
    public static final int RSSI_PKTCNT_FETCH = 151572;
    public static final int RSSI_PKTCNT_FETCH_SUCCEEDED = 151573;
    public static final int RSSI_PKTCNT_FETCH_FAILED = 151574;
    public static final int ERROR = 0;
    public static final int IN_PROGRESS = 1;
    public static final int BUSY = 2;
    public static final int WPS_OVERLAP_ERROR = 3;
    public static final int WPS_WEP_PROHIBITED = 4;
    public static final int WPS_TKIP_ONLY_PROHIBITED = 5;
    public static final int WPS_AUTH_FAILURE = 6;
    public static final int WPS_TIMED_OUT = 7;
    public static final int INVALID_ARGS = 8;
    public static final int NOT_AUTHORIZED = 9;
    private static final java.lang.Object sServiceHandlerDispatchLock = null;
    @android.annotation.SystemApi
    public static final int DEVICE_MOBILITY_STATE_UNKNOWN = 0;
    @android.annotation.SystemApi
    public static final int DEVICE_MOBILITY_STATE_HIGH_MVMT = 1;
    @android.annotation.SystemApi
    public static final int DEVICE_MOBILITY_STATE_LOW_MVMT = 2;
    @android.annotation.SystemApi
    public static final int DEVICE_MOBILITY_STATE_STATIONARY = 3;
    @android.annotation.SystemApi
    public static final int EASY_CONNECT_NETWORK_ROLE_STA = 0;
    @android.annotation.SystemApi
    public static final int EASY_CONNECT_NETWORK_ROLE_AP = 1;
    public WifiManager(android.content.Context p0, android.net.wifi.IWifiManager p1, android.os.Looper p2) {}
    @java.lang.Deprecated
    public java.util.List<android.net.wifi.WifiConfiguration> getConfiguredNetworks() { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.net.wifi.WifiConfiguration> getPrivilegedConfiguredNetworks() { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.util.Pair<android.net.wifi.WifiConfiguration, java.util.Map<java.lang.Integer, java.util.List<android.net.wifi.ScanResult>>>> getAllMatchingWifiConfigs(java.util.List<android.net.wifi.ScanResult> p0) { return null; }
    @android.annotation.SystemApi
    public java.util.Map<android.net.wifi.hotspot2.OsuProvider, java.util.List<android.net.wifi.ScanResult>> getMatchingOsuProviders(java.util.List<android.net.wifi.ScanResult> p0) { return null; }
    @android.annotation.SystemApi
    public java.util.Map<android.net.wifi.hotspot2.OsuProvider, android.net.wifi.hotspot2.PasspointConfiguration> getMatchingPasspointConfigsForOsuProviders(java.util.Set<android.net.wifi.hotspot2.OsuProvider> p0) { return null; }
    @java.lang.Deprecated
    public int addNetwork(android.net.wifi.WifiConfiguration p0) { return 0; }
    @java.lang.Deprecated
    public int updateNetwork(android.net.wifi.WifiConfiguration p0) { return 0; }
    private int addOrUpdateNetwork(android.net.wifi.WifiConfiguration p0) { return 0; }
    public void registerNetworkRequestMatchCallback(android.net.wifi.WifiManager.NetworkRequestMatchCallback p0, android.os.Handler p1) {}
    public void unregisterNetworkRequestMatchCallback(android.net.wifi.WifiManager.NetworkRequestMatchCallback p0) {}
    public int addNetworkSuggestions(java.util.List<android.net.wifi.WifiNetworkSuggestion> p0) { return 0; }
    public int removeNetworkSuggestions(java.util.List<android.net.wifi.WifiNetworkSuggestion> p0) { return 0; }
    public int getMaxNumberOfNetworkSuggestionsPerApp() { return 0; }
    public void addOrUpdatePasspointConfiguration(android.net.wifi.hotspot2.PasspointConfiguration p0) {}
    @java.lang.Deprecated
    public void removePasspointConfiguration(java.lang.String p0) {}
    @java.lang.Deprecated
    public java.util.List<android.net.wifi.hotspot2.PasspointConfiguration> getPasspointConfigurations() { return null; }
    public void queryPasspointIcon(long p0, java.lang.String p1) {}
    public int matchProviderWithCurrentNetwork(java.lang.String p0) { return 0; }
    public void deauthenticateNetwork(long p0, boolean p1) {}
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
    private long getSupportedFeatures() { return 0L; }
    private boolean isFeatureSupported(long p0) { return false; }
    public boolean is5GHzBandSupported() { return false; }
    public boolean isPasspointSupported() { return false; }
    public boolean isP2pSupported() { return false; }
    @android.annotation.SystemApi
    public boolean isPortableHotspotSupported() { return false; }
    @android.annotation.SystemApi
    public boolean isWifiScannerSupported() { return false; }
    public boolean isWifiAwareSupported() { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public boolean isDeviceToDeviceRttSupported() { return false; }
    @java.lang.Deprecated
    public boolean isDeviceToApRttSupported() { return false; }
    public boolean isPreferredNetworkOffloadSupported() { return false; }
    public boolean isAdditionalStaSupported() { return false; }
    public boolean isTdlsSupported() { return false; }
    public boolean isOffChannelTdlsSupported() { return false; }
    public boolean isEnhancedPowerReportingSupported() { return false; }
    public android.net.wifi.WifiActivityEnergyInfo getControllerActivityEnergyInfo() { return null; }
    @java.lang.Deprecated
    public boolean startScan() { return false; }
    @android.annotation.SystemApi
    public boolean startScan(android.os.WorkSource p0) { return false; }
    public java.lang.String getCurrentNetworkWpsNfcConfigurationToken() { return null; }
    public android.net.wifi.WifiInfo getConnectionInfo() { return null; }
    public java.util.List<android.net.wifi.ScanResult> getScanResults() { return null; }
    @java.lang.Deprecated
    public boolean isScanAlwaysAvailable() { return false; }
    @java.lang.Deprecated
    public boolean saveConfiguration() { return false; }
    public void setCountryCode(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getCountryCode() { return null; }
    @android.annotation.UnsupportedAppUsage
    public boolean isDualBandSupported() { return false; }
    public boolean isDualModeSupported() { return false; }
    public android.net.DhcpInfo getDhcpInfo() { return null; }
    @java.lang.Deprecated
    public boolean setWifiEnabled(boolean p0) { return false; }
    public int getWifiState() { return 0; }
    public boolean isWifiEnabled() { return false; }
    public void getTxPacketCount(android.net.wifi.WifiManager.TxPacketCountListener p0) {}
    public static int calculateSignalLevel(int p0, int p1) { return 0; }
    public static int compareSignalLevel(int p0, int p1) { return 0; }
    public void updateInterfaceIpState(java.lang.String p0, int p1) {}
    public boolean startSoftAp(android.net.wifi.WifiConfiguration p0) { return false; }
    public boolean stopSoftAp() { return false; }
    public void startLocalOnlyHotspot(android.net.wifi.WifiManager.LocalOnlyHotspotCallback p0, android.os.Handler p1) {}
    @android.annotation.UnsupportedAppUsage
    public void cancelLocalOnlyHotspotRequest() {}
    private void stopLocalOnlyHotspot() {}
    public void watchLocalOnlyHotspot(android.net.wifi.WifiManager.LocalOnlyHotspotObserver p0, android.os.Handler p1) {}
    public void unregisterLocalOnlyHotspotObserver() {}
    @android.annotation.SystemApi
    public int getWifiApState() { return 0; }
    @android.annotation.SystemApi
    public boolean isWifiApEnabled() { return false; }
    @android.annotation.SystemApi
    public android.net.wifi.WifiConfiguration getWifiApConfiguration() { return null; }
    @android.annotation.SystemApi
    public boolean setWifiApConfiguration(android.net.wifi.WifiConfiguration p0) { return false; }
    public void notifyUserOfApBandConversion() {}
    public void setTdlsEnabled(java.net.InetAddress p0, boolean p1) {}
    public void setTdlsEnabledWithMacAddress(java.lang.String p0, boolean p1) {}
    public void registerSoftApCallback(android.net.wifi.WifiManager.SoftApCallback p0, android.os.Handler p1) {}
    public void unregisterSoftApCallback(android.net.wifi.WifiManager.SoftApCallback p0) {}
    private int putListener(java.lang.Object p0) { return 0; }
    private java.lang.Object removeListener(int p0) { return null; }
    private synchronized com.android.internal.util.AsyncChannel getChannel() { return null; }
    @android.annotation.SystemApi
    public void connect(android.net.wifi.WifiConfiguration p0, android.net.wifi.WifiManager.ActionListener p1) {}
    @android.annotation.SystemApi
    public void connect(int p0, android.net.wifi.WifiManager.ActionListener p1) {}
    @android.annotation.SystemApi
    public void save(android.net.wifi.WifiConfiguration p0, android.net.wifi.WifiManager.ActionListener p1) {}
    @android.annotation.SystemApi
    public void forget(int p0, android.net.wifi.WifiManager.ActionListener p1) {}
    @android.annotation.SystemApi
    public void disable(int p0, android.net.wifi.WifiManager.ActionListener p1) {}
    public void disableEphemeralNetwork(java.lang.String p0) {}
    public void startWps(android.net.wifi.WpsInfo p0, android.net.wifi.WifiManager.WpsCallback p1) {}
    public void cancelWps(android.net.wifi.WifiManager.WpsCallback p0) {}
    @android.annotation.UnsupportedAppUsage
    private android.os.Messenger getWifiServiceMessenger() { return null; }
    public android.net.wifi.WifiManager.WifiLock createWifiLock(int p0, java.lang.String p1) { return null; }
    @java.lang.Deprecated
    public android.net.wifi.WifiManager.WifiLock createWifiLock(java.lang.String p0) { return null; }
    public android.net.wifi.WifiManager.MulticastLock createMulticastLock(java.lang.String p0) { return null; }
    public boolean isMulticastEnabled() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean initializeMulticastFiltering() { return false; }
    protected void finalize() throws java.lang.Throwable {}
    @android.annotation.UnsupportedAppUsage
    public void enableVerboseLogging(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public int getVerboseLoggingLevel() { return 0; }
    public void factoryReset() {}
    @android.annotation.UnsupportedAppUsage
    public android.net.Network getCurrentNetwork() { return null; }
    public boolean setEnableAutoJoinWhenAssociated(boolean p0) { return false; }
    public boolean getEnableAutoJoinWhenAssociated() { return false; }
    public void enableWifiConnectivityManager(boolean p0) {}
    public byte[] retrieveBackupData() { return null; }
    public void restoreBackupData(byte[] p0) {}
    @java.lang.Deprecated
    public void restoreSupplicantBackupData(byte[] p0, byte[] p1) {}
    @android.annotation.SystemApi
    public void startSubscriptionProvisioning(android.net.wifi.hotspot2.OsuProvider p0, java.util.concurrent.Executor p1, android.net.wifi.hotspot2.ProvisioningCallback p2) {}
    public void registerTrafficStateCallback(android.net.wifi.WifiManager.TrafficStateCallback p0, android.os.Handler p1) {}
    public void unregisterTrafficStateCallback(android.net.wifi.WifiManager.TrafficStateCallback p0) {}
    private void updateVerboseLoggingEnabledFromService() {}
    public boolean isWpa3SaeSupported() { return false; }
    public boolean isWpa3SuiteBSupported() { return false; }
    public boolean isEnhancedOpenSupported() { return false; }
    public boolean isEasyConnectSupported() { return false; }
    public java.lang.String[] getFactoryMacAddresses() { return null; }
    @android.annotation.SystemApi
    public void setDeviceMobilityState(int p0) {}
    @android.annotation.SystemApi
    public void startEasyConnectAsConfiguratorInitiator(java.lang.String p0, int p1, int p2, java.util.concurrent.Executor p3, android.net.wifi.EasyConnectStatusCallback p4) {}
    @android.annotation.SystemApi
    public void startEasyConnectAsEnrolleeInitiator(java.lang.String p0, java.util.concurrent.Executor p1, android.net.wifi.EasyConnectStatusCallback p2) {}
    @android.annotation.SystemApi
    public void stopEasyConnectSession() {}
    @android.annotation.SystemApi
    public void addOnWifiUsabilityStatsListener(java.util.concurrent.Executor p0, android.net.wifi.WifiManager.OnWifiUsabilityStatsListener p1) {}
    @android.annotation.SystemApi
    public void removeOnWifiUsabilityStatsListener(android.net.wifi.WifiManager.OnWifiUsabilityStatsListener p0) {}
    @android.annotation.SystemApi
    public void updateWifiUsabilityScore(int p0, int p1, int p2) {}

    public static abstract class WpsCallback {
        public WpsCallback() {}
        public abstract void onStarted(java.lang.String p0);
        public abstract void onSucceeded();
        public abstract void onFailed(int p0);
    }

    public class WifiLock {
        private java.lang.String mTag;
        private final android.os.IBinder mBinder = null;
        private int mRefCount;
        int mLockType;
        private boolean mRefCounted;
        private boolean mHeld;
        private android.os.WorkSource mWorkSource;
        private WifiLock(android.net.wifi.WifiManager p0, int p1, java.lang.String p2) {}
        public void acquire() {}
        public void release() {}
        public void setReferenceCounted(boolean p0) {}
        public boolean isHeld() { return false; }
        public void setWorkSource(android.os.WorkSource p0) {}
        public java.lang.String toString() { return null; }
        protected void finalize() throws java.lang.Throwable {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WifiApState {
    }

    public static interface TxPacketCountListener {
        public void onSuccess(int p0);
        public void onFailure(int p0);
    }

    private class TrafficStateCallbackProxy extends android.net.wifi.ITrafficStateCallback.Stub {
        private final android.os.Handler mHandler = null;
        private final android.net.wifi.WifiManager.TrafficStateCallback mCallback = null;
        TrafficStateCallbackProxy(android.net.wifi.WifiManager p0, android.os.Looper p1, android.net.wifi.WifiManager.TrafficStateCallback p2) { super(); }
        public void onStateChanged(int p0) {}
    }

    public static interface TrafficStateCallback {
        public static final int DATA_ACTIVITY_NONE = 0;
        public static final int DATA_ACTIVITY_IN = 1;
        public static final int DATA_ACTIVITY_OUT = 2;
        public static final int DATA_ACTIVITY_INOUT = 3;
        public void onStateChanged(int p0);
    }

    private class SoftApCallbackProxy extends android.net.wifi.ISoftApCallback.Stub {
        private final android.os.Handler mHandler = null;
        private final android.net.wifi.WifiManager.SoftApCallback mCallback = null;
        SoftApCallbackProxy(android.net.wifi.WifiManager p0, android.os.Looper p1, android.net.wifi.WifiManager.SoftApCallback p2) { super(); }
        public void onStateChanged(int p0, int p1) {}
        public void onNumClientsChanged(int p0) {}
    }

    public static interface SoftApCallback {
        public void onStateChanged(int p0, int p1);
        public void onNumClientsChanged(int p0);
    }

    private class ServiceHandler extends android.os.Handler {
        ServiceHandler(android.net.wifi.WifiManager p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
        private void dispatchMessageToListeners(android.os.Message p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SapStartFailure {
    }

    private static class ProvisioningCallbackProxy extends android.net.wifi.hotspot2.IProvisioningCallback.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.net.wifi.hotspot2.ProvisioningCallback mCallback = null;
        ProvisioningCallbackProxy(java.util.concurrent.Executor p0, android.net.wifi.hotspot2.ProvisioningCallback p1) { super(); }
        public void onProvisioningStatus(int p0) {}
        public void onProvisioningFailure(int p0) {}
        public void onProvisioningComplete() {}
    }

    @android.annotation.SystemApi
    public static interface OnWifiUsabilityStatsListener {
        public void onWifiUsabilityStats(int p0, boolean p1, android.net.wifi.WifiUsabilityStatsEntry p2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetworkSuggestionsStatusCode {
    }

    private class NetworkRequestUserSelectionCallbackProxy implements android.net.wifi.WifiManager.NetworkRequestUserSelectionCallback {
        private final android.net.wifi.INetworkRequestUserSelectionCallback mCallback = null;
        NetworkRequestUserSelectionCallbackProxy(android.net.wifi.WifiManager p0, android.net.wifi.INetworkRequestUserSelectionCallback p1) {}
        public void select(android.net.wifi.WifiConfiguration p0) {}
        public void reject() {}
    }

    public static interface NetworkRequestUserSelectionCallback {
        public void select(android.net.wifi.WifiConfiguration p0);
        public void reject();
    }

    private class NetworkRequestMatchCallbackProxy extends android.net.wifi.INetworkRequestMatchCallback.Stub {
        private final android.os.Handler mHandler = null;
        private final android.net.wifi.WifiManager.NetworkRequestMatchCallback mCallback = null;
        NetworkRequestMatchCallbackProxy(android.net.wifi.WifiManager p0, android.os.Looper p1, android.net.wifi.WifiManager.NetworkRequestMatchCallback p2) { super(); }
        public void onUserSelectionCallbackRegistration(android.net.wifi.INetworkRequestUserSelectionCallback p0) {}
        public void onAbort() {}
        public void onMatch(java.util.List<android.net.wifi.ScanResult> p0) {}
        public void onUserSelectionConnectSuccess(android.net.wifi.WifiConfiguration p0) {}
        public void onUserSelectionConnectFailure(android.net.wifi.WifiConfiguration p0) {}
    }

    public static interface NetworkRequestMatchCallback {
        public void onUserSelectionCallbackRegistration(android.net.wifi.WifiManager.NetworkRequestUserSelectionCallback p0);
        public void onAbort();
        public void onMatch(java.util.List<android.net.wifi.ScanResult> p0);
        public void onUserSelectionConnectSuccess(android.net.wifi.WifiConfiguration p0);
        public void onUserSelectionConnectFailure(android.net.wifi.WifiConfiguration p0);
    }

    public class MulticastLock {
        private java.lang.String mTag;
        private final android.os.IBinder mBinder = null;
        private int mRefCount;
        private boolean mRefCounted;
        private boolean mHeld;
        private MulticastLock(android.net.wifi.WifiManager p0, java.lang.String p1) {}
        public void acquire() {}
        public void release() {}
        public void setReferenceCounted(boolean p0) {}
        public boolean isHeld() { return false; }
        public java.lang.String toString() { return null; }
        protected void finalize() throws java.lang.Throwable {}
    }

    public class LocalOnlyHotspotSubscription implements java.lang.AutoCloseable {
        public LocalOnlyHotspotSubscription(android.net.wifi.WifiManager p0) {}
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
    }

    public class LocalOnlyHotspotReservation implements java.lang.AutoCloseable {
        private final android.net.wifi.WifiConfiguration mConfig = null;
        public LocalOnlyHotspotReservation(android.net.wifi.WifiManager p0, android.net.wifi.WifiConfiguration p1) {}
        public android.net.wifi.WifiConfiguration getWifiConfiguration() { return null; }
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
    }

    private static class LocalOnlyHotspotObserverProxy {
        private final android.os.Handler mHandler = null;
        private final java.lang.ref.WeakReference<android.net.wifi.WifiManager> mWifiManager = null;
        private final android.os.Looper mLooper = null;
        private final android.os.Messenger mMessenger = null;
        LocalOnlyHotspotObserverProxy(android.net.wifi.WifiManager p0, android.os.Looper p1, android.net.wifi.WifiManager.LocalOnlyHotspotObserver p2) {}
        public android.os.Messenger getMessenger() { return null; }
        public void registered() throws android.os.RemoteException {}
    }

    public static class LocalOnlyHotspotObserver {
        public LocalOnlyHotspotObserver() {}
        public void onRegistered(android.net.wifi.WifiManager.LocalOnlyHotspotSubscription p0) {}
        public void onStarted(android.net.wifi.WifiConfiguration p0) {}
        public void onStopped() {}
    }

    private static class LocalOnlyHotspotCallbackProxy {
        private final android.os.Handler mHandler = null;
        private final java.lang.ref.WeakReference<android.net.wifi.WifiManager> mWifiManager = null;
        private final android.os.Looper mLooper = null;
        private final android.os.Messenger mMessenger = null;
        LocalOnlyHotspotCallbackProxy(android.net.wifi.WifiManager p0, android.os.Looper p1, android.net.wifi.WifiManager.LocalOnlyHotspotCallback p2) {}
        public android.os.Messenger getMessenger() { return null; }
        public void notifyFailed(int p0) throws android.os.RemoteException {}
    }

    public static class LocalOnlyHotspotCallback {
        public static final int REQUEST_REGISTERED = 0;
        public static final int ERROR_NO_CHANNEL = 1;
        public static final int ERROR_GENERIC = 2;
        public static final int ERROR_INCOMPATIBLE_MODE = 3;
        public static final int ERROR_TETHERING_DISALLOWED = 4;
        public LocalOnlyHotspotCallback() {}
        public void onStarted(android.net.wifi.WifiManager.LocalOnlyHotspotReservation p0) {}
        public void onStopped() {}
        public void onFailed(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EasyConnectNetworkRole {
    }

    private static class EasyConnectCallbackProxy extends android.net.wifi.IDppCallback.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.net.wifi.EasyConnectStatusCallback mEasyConnectStatusCallback = null;
        EasyConnectCallbackProxy(java.util.concurrent.Executor p0, android.net.wifi.EasyConnectStatusCallback p1) { super(); }
        public void onSuccessConfigReceived(int p0) {}
        public void onSuccess(int p0) {}
        public void onFailure(int p0) {}
        public void onProgress(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceMobilityState {
    }

    @android.annotation.SystemApi
    public static interface ActionListener {
        public void onSuccess();
        public void onFailure(int p0);
    }
}
