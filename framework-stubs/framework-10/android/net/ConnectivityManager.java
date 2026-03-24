package android.net;

public class ConnectivityManager {
    private static final java.lang.String TAG = "ConnectivityManager";
    private static final boolean DEBUG = Boolean.valueOf(false);
    @java.lang.Deprecated
    public static final java.lang.String CONNECTIVITY_ACTION = "android.net.conn.CONNECTIVITY_CHANGE";
    public static final java.lang.String CONNECTIVITY_ACTION_SUPL = "android.net.conn.CONNECTIVITY_CHANGE_SUPL";
    public static final java.lang.String ACTION_CAPTIVE_PORTAL_SIGN_IN = "android.net.conn.CAPTIVE_PORTAL";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_NETWORK_INFO = "networkInfo";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_NETWORK_TYPE = "networkType";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_IS_FAILOVER = "isFailover";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_OTHER_NETWORK_INFO = "otherNetwork";
    public static final java.lang.String EXTRA_NO_CONNECTIVITY = "noConnectivity";
    public static final java.lang.String EXTRA_REASON = "reason";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_EXTRA_INFO = "extraInfo";
    public static final java.lang.String EXTRA_INET_CONDITION = "inetCondition";
    public static final java.lang.String EXTRA_CAPTIVE_PORTAL = "android.net.extra.CAPTIVE_PORTAL";
    public static final java.lang.String EXTRA_CAPTIVE_PORTAL_URL = "android.net.extra.CAPTIVE_PORTAL_URL";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_CAPTIVE_PORTAL_PROBE_SPEC = "android.net.extra.CAPTIVE_PORTAL_PROBE_SPEC";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_CAPTIVE_PORTAL_USER_AGENT = "android.net.extra.CAPTIVE_PORTAL_USER_AGENT";
    public static final java.lang.String ACTION_DATA_ACTIVITY_CHANGE = "android.net.conn.DATA_ACTIVITY_CHANGE";
    public static final java.lang.String EXTRA_DEVICE_TYPE = "deviceType";
    public static final java.lang.String EXTRA_IS_ACTIVE = "isActive";
    public static final java.lang.String EXTRA_REALTIME_NS = "tsNanos";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_BACKGROUND_DATA_SETTING_CHANGED = "android.net.conn.BACKGROUND_DATA_SETTING_CHANGED";
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String INET_CONDITION_ACTION = "android.net.conn.INET_CONDITION_ACTION";
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String ACTION_TETHER_STATE_CHANGED = "android.net.conn.TETHER_STATE_CHANGED";
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String EXTRA_AVAILABLE_TETHER = "availableArray";
    public static final java.lang.String EXTRA_ACTIVE_LOCAL_ONLY = "localOnlyArray";
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String EXTRA_ACTIVE_TETHER = "tetherArray";
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String EXTRA_ERRORED_TETHER = "erroredArray";
    public static final java.lang.String ACTION_CAPTIVE_PORTAL_TEST_COMPLETED = "android.net.conn.CAPTIVE_PORTAL_TEST_COMPLETED";
    public static final java.lang.String EXTRA_IS_CAPTIVE_PORTAL = "captivePortal";
    public static final java.lang.String ACTION_PROMPT_UNVALIDATED = "android.net.conn.PROMPT_UNVALIDATED";
    public static final java.lang.String ACTION_PROMPT_LOST_VALIDATION = "android.net.conn.PROMPT_LOST_VALIDATION";
    public static final java.lang.String ACTION_PROMPT_PARTIAL_CONNECTIVITY = "android.net.conn.PROMPT_PARTIAL_CONNECTIVITY";
    public static final int TETHERING_INVALID = -1;
    @android.annotation.SystemApi
    public static final int TETHERING_WIFI = 0;
    @android.annotation.SystemApi
    public static final int TETHERING_USB = 1;
    @android.annotation.SystemApi
    public static final int TETHERING_BLUETOOTH = 2;
    public static final java.lang.String EXTRA_ADD_TETHER_TYPE = "extraAddTetherType";
    public static final java.lang.String EXTRA_REM_TETHER_TYPE = "extraRemTetherType";
    public static final java.lang.String EXTRA_SET_ALARM = "extraSetAlarm";
    public static final java.lang.String EXTRA_RUN_PROVISION = "extraRunProvision";
    public static final java.lang.String EXTRA_PROVISION_CALLBACK = "extraProvisionCallback";
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=130143562L)
    public static final int TYPE_NONE = -1;
    @java.lang.Deprecated
    public static final int TYPE_MOBILE = 0;
    @java.lang.Deprecated
    public static final int TYPE_WIFI = 1;
    @java.lang.Deprecated
    public static final int TYPE_MOBILE_MMS = 2;
    @java.lang.Deprecated
    public static final int TYPE_MOBILE_SUPL = 3;
    @java.lang.Deprecated
    public static final int TYPE_MOBILE_DUN = 4;
    @java.lang.Deprecated
    public static final int TYPE_MOBILE_HIPRI = 5;
    @java.lang.Deprecated
    public static final int TYPE_WIMAX = 6;
    @java.lang.Deprecated
    public static final int TYPE_BLUETOOTH = 7;
    @java.lang.Deprecated
    public static final int TYPE_DUMMY = 8;
    @java.lang.Deprecated
    public static final int TYPE_ETHERNET = 9;
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=130143562L)
    public static final int TYPE_MOBILE_FOTA = 10;
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static final int TYPE_MOBILE_IMS = 11;
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=130143562L)
    public static final int TYPE_MOBILE_CBS = 12;
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static final int TYPE_WIFI_P2P = 13;
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static final int TYPE_MOBILE_IA = 14;
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=130143562L)
    public static final int TYPE_MOBILE_EMERGENCY = 15;
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static final int TYPE_PROXY = 16;
    @java.lang.Deprecated
    public static final int TYPE_VPN = 17;
    @java.lang.Deprecated
    public static final int TYPE_TEST = 18;
    public static final int MAX_RADIO_TYPE = 18;
    public static final int MAX_NETWORK_TYPE = 18;
    private static final int MIN_NETWORK_TYPE = 0;
    @java.lang.Deprecated
    public static final int DEFAULT_NETWORK_PREFERENCE = 1;
    public static final int REQUEST_ID_UNSET = 0;
    private static final android.net.NetworkRequest ALREADY_UNREGISTERED = null;
    public static final int NETID_UNSET = 0;
    public static final java.lang.String PRIVATE_DNS_MODE_OFF = "off";
    public static final java.lang.String PRIVATE_DNS_MODE_OPPORTUNISTIC = "opportunistic";
    public static final java.lang.String PRIVATE_DNS_MODE_PROVIDER_HOSTNAME = "hostname";
    public static final java.lang.String PRIVATE_DNS_DEFAULT_MODE_FALLBACK = "opportunistic";
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=130143562L)
    private final android.net.IConnectivityManager mService = null;
    private static android.net.ConnectivityManager sInstance;
    private final android.content.Context mContext = null;
    private android.os.INetworkManagementService mNMService;
    private android.net.INetworkPolicyManager mNPManager;
    @android.annotation.UnsupportedAppUsage
    private static final java.util.HashMap<android.net.NetworkCapabilities, android.net.ConnectivityManager.LegacyRequest> sLegacyRequests = null;
    private static final android.util.SparseIntArray sLegacyTypeToTransport = null;
    private static final android.util.SparseIntArray sLegacyTypeToCapability = null;
    private final android.util.ArrayMap<android.net.ConnectivityManager.OnNetworkActiveListener, android.os.INetworkActivityListener> mNetworkActivityListeners = null;
    private final android.util.ArrayMap<android.net.ConnectivityManager.OnTetheringEventCallback, android.net.ITetheringEventCallback> mTetheringEventCallbacks = null;
    @android.annotation.SystemApi
    public static final int TETHER_ERROR_NO_ERROR = 0;
    public static final int TETHER_ERROR_UNKNOWN_IFACE = 1;
    public static final int TETHER_ERROR_SERVICE_UNAVAIL = 2;
    public static final int TETHER_ERROR_UNSUPPORTED = 3;
    public static final int TETHER_ERROR_UNAVAIL_IFACE = 4;
    public static final int TETHER_ERROR_MASTER_ERROR = 5;
    public static final int TETHER_ERROR_TETHER_IFACE_ERROR = 6;
    public static final int TETHER_ERROR_UNTETHER_IFACE_ERROR = 7;
    public static final int TETHER_ERROR_ENABLE_NAT_ERROR = 8;
    public static final int TETHER_ERROR_DISABLE_NAT_ERROR = 9;
    public static final int TETHER_ERROR_IFACE_CFG_ERROR = 10;
    @android.annotation.SystemApi
    public static final int TETHER_ERROR_PROVISION_FAILED = 11;
    public static final int TETHER_ERROR_DHCPSERVER_ERROR = 12;
    @android.annotation.SystemApi
    public static final int TETHER_ERROR_ENTITLEMENT_UNKONWN = 13;
    private static final int BASE = 524288;
    public static final int CALLBACK_PRECHECK = 524289;
    public static final int CALLBACK_AVAILABLE = 524290;
    public static final int CALLBACK_LOSING = 524291;
    public static final int CALLBACK_LOST = 524292;
    public static final int CALLBACK_UNAVAIL = 524293;
    public static final int CALLBACK_CAP_CHANGED = 524294;
    public static final int CALLBACK_IP_CHANGED = 524295;
    private static final int EXPIRE_LEGACY_REQUEST = 524296;
    public static final int CALLBACK_SUSPENDED = 524297;
    public static final int CALLBACK_RESUMED = 524298;
    public static final int CALLBACK_BLK_CHANGED = 524299;
    private static final java.util.HashMap<android.net.NetworkRequest, android.net.ConnectivityManager.NetworkCallback> sCallbacks = null;
    private static android.net.ConnectivityManager.CallbackHandler sCallbackHandler;
    private static final int LISTEN = 1;
    private static final int REQUEST = 2;
    public static final java.lang.String EXTRA_NETWORK = "android.net.extra.NETWORK";
    public static final java.lang.String EXTRA_NETWORK_REQUEST = "android.net.extra.NETWORK_REQUEST";
    public static final int MULTIPATH_PREFERENCE_HANDOVER = 1;
    public static final int MULTIPATH_PREFERENCE_RELIABILITY = 2;
    public static final int MULTIPATH_PREFERENCE_PERFORMANCE = 4;
    public static final int MULTIPATH_PREFERENCE_UNMETERED = 7;
    public static final int RESTRICT_BACKGROUND_STATUS_DISABLED = 1;
    public static final int RESTRICT_BACKGROUND_STATUS_WHITELISTED = 2;
    public static final int RESTRICT_BACKGROUND_STATUS_ENABLED = 3;
    public static final java.lang.String ACTION_RESTRICT_BACKGROUND_CHANGED = "android.net.conn.RESTRICT_BACKGROUND_CHANGED";
    @java.lang.Deprecated
    public static boolean isNetworkTypeValid(int p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String getNetworkTypeName(int p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=130143562L)
    public static boolean isNetworkTypeMobile(int p0) { return false; }
    @java.lang.Deprecated
    public static boolean isNetworkTypeWifi(int p0) { return false; }
    @java.lang.Deprecated
    public void setNetworkPreference(int p0) {}
    @java.lang.Deprecated
    public int getNetworkPreference() { return 0; }
    @java.lang.Deprecated
    public android.net.NetworkInfo getActiveNetworkInfo() { return null; }
    public android.net.Network getActiveNetwork() { return null; }
    public android.net.Network getActiveNetworkForUid(int p0) { return null; }
    public android.net.Network getActiveNetworkForUid(int p0, boolean p1) { return null; }
    public boolean isAlwaysOnVpnPackageSupportedForUser(int p0, java.lang.String p1) { return false; }
    public boolean setAlwaysOnVpnPackageForUser(int p0, java.lang.String p1, boolean p2, java.util.List<java.lang.String> p3) { return false; }
    public java.lang.String getAlwaysOnVpnPackageForUser(int p0) { return null; }
    public boolean isVpnLockdownEnabled(int p0) { return false; }
    public java.util.List<java.lang.String> getVpnLockdownWhitelist(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.net.NetworkInfo getActiveNetworkInfoForUid(int p0) { return null; }
    public android.net.NetworkInfo getActiveNetworkInfoForUid(int p0, boolean p1) { return null; }
    @java.lang.Deprecated
    public android.net.NetworkInfo getNetworkInfo(int p0) { return null; }
    @java.lang.Deprecated
    public android.net.NetworkInfo getNetworkInfo(android.net.Network p0) { return null; }
    public android.net.NetworkInfo getNetworkInfoForUid(android.net.Network p0, int p1, boolean p2) { return null; }
    @java.lang.Deprecated
    public android.net.NetworkInfo[] getAllNetworkInfo() { return null; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public android.net.Network getNetworkForType(int p0) { return null; }
    public android.net.Network[] getAllNetworks() { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.net.NetworkCapabilities[] getDefaultNetworkCapabilitiesForUser(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=109783091L)
    public android.net.LinkProperties getActiveLinkProperties() { return null; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=130143562L)
    public android.net.LinkProperties getLinkProperties(int p0) { return null; }
    public android.net.LinkProperties getLinkProperties(android.net.Network p0) { return null; }
    public android.net.NetworkCapabilities getNetworkCapabilities(android.net.Network p0) { return null; }
    @android.annotation.SystemApi
    public java.lang.String getCaptivePortalServerUrl() { return null; }
    @java.lang.Deprecated
    public int startUsingNetworkFeature(int p0, java.lang.String p1) { return 0; }
    @java.lang.Deprecated
    public int stopUsingNetworkFeature(int p0, java.lang.String p1) { return 0; }
    @android.annotation.UnsupportedAppUsage
    private android.net.NetworkCapabilities networkCapabilitiesForFeature(int p0, java.lang.String p1) { return null; }
    private int inferLegacyTypeForNetworkCapabilities(android.net.NetworkCapabilities p0) { return 0; }
    private int legacyTypeForNetworkCapabilities(android.net.NetworkCapabilities p0) { return 0; }
    private android.net.NetworkRequest findRequestForFeature(android.net.NetworkCapabilities p0) { return null; }
    private void renewRequestLocked(android.net.ConnectivityManager.LegacyRequest p0) {}
    private void expireRequest(android.net.NetworkCapabilities p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    private android.net.NetworkRequest requestNetworkForFeatureLocked(android.net.NetworkCapabilities p0) { return null; }
    private void sendExpireMsgForFeature(android.net.NetworkCapabilities p0, int p1, int p2) {}
    @android.annotation.UnsupportedAppUsage
    private boolean removeRequestForFeature(android.net.NetworkCapabilities p0) { return false; }
    public static android.net.NetworkCapabilities networkCapabilitiesForType(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.net.ConnectivityManager.PacketKeepalive startNattKeepalive(android.net.Network p0, int p1, android.net.ConnectivityManager.PacketKeepaliveCallback p2, java.net.InetAddress p3, int p4, java.net.InetAddress p5) { return null; }
    public android.net.SocketKeepalive createSocketKeepalive(android.net.Network p0, android.net.IpSecManager.UdpEncapsulationSocket p1, java.net.InetAddress p2, java.net.InetAddress p3, java.util.concurrent.Executor p4, android.net.SocketKeepalive.Callback p5) { return null; }
    @android.annotation.SystemApi
    public android.net.SocketKeepalive createNattKeepalive(android.net.Network p0, android.os.ParcelFileDescriptor p1, java.net.InetAddress p2, java.net.InetAddress p3, java.util.concurrent.Executor p4, android.net.SocketKeepalive.Callback p5) { return null; }
    @android.annotation.SystemApi
    public android.net.SocketKeepalive createSocketKeepalive(android.net.Network p0, java.net.Socket p1, java.util.concurrent.Executor p2, android.net.SocketKeepalive.Callback p3) { return null; }
    @java.lang.Deprecated
    public boolean requestRouteToHost(int p0, int p1) { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public boolean requestRouteToHostAddress(int p0, java.net.InetAddress p1) { return false; }
    @java.lang.Deprecated
    public boolean getBackgroundDataSetting() { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public void setBackgroundDataSetting(boolean p0) {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public android.net.NetworkQuotaInfo getActiveNetworkQuotaInfo() { return null; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public boolean getMobileDataEnabled() { return false; }
    private android.os.INetworkManagementService getNetworkManagementService() { return null; }
    public void addDefaultNetworkActiveListener(android.net.ConnectivityManager.OnNetworkActiveListener p0) {}
    public void removeDefaultNetworkActiveListener(android.net.ConnectivityManager.OnNetworkActiveListener p0) {}
    public boolean isDefaultNetworkActive() { return false; }
    public ConnectivityManager(android.content.Context p0, android.net.IConnectivityManager p1) {}
    @android.annotation.UnsupportedAppUsage
    public static android.net.ConnectivityManager from(android.content.Context p0) { return null; }
    public android.net.NetworkRequest getDefaultRequest() { return null; }
    public static final void enforceChangePermission(android.content.Context p0) {}
    public static final void enforceTetherChangePermission(android.content.Context p0, java.lang.String p1) {}
    @java.lang.Deprecated
    static android.net.ConnectivityManager getInstanceOrNull() { return null; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    private static android.net.ConnectivityManager getInstance() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] getTetherableIfaces() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] getTetheredIfaces() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] getTetheringErroredIfaces() { return null; }
    public java.lang.String[] getTetheredDhcpRanges() { return null; }
    @android.annotation.UnsupportedAppUsage
    public int tether(java.lang.String p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int untether(java.lang.String p0) { return 0; }
    @android.annotation.SystemApi
    public boolean isTetheringSupported() { return false; }
    @android.annotation.SystemApi
    public void startTethering(int p0, boolean p1, android.net.ConnectivityManager.OnStartTetheringCallback p2) {}
    @android.annotation.SystemApi
    public void startTethering(int p0, boolean p1, android.net.ConnectivityManager.OnStartTetheringCallback p2, android.os.Handler p3) {}
    @android.annotation.SystemApi
    public void stopTethering(int p0) {}
    @android.annotation.SystemApi
    public void registerTetheringEventCallback(java.util.concurrent.Executor p0, android.net.ConnectivityManager.OnTetheringEventCallback p1) {}
    @android.annotation.SystemApi
    public void unregisterTetheringEventCallback(android.net.ConnectivityManager.OnTetheringEventCallback p0) {}
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] getTetherableUsbRegexs() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] getTetherableWifiRegexs() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] getTetherableBluetoothRegexs() { return null; }
    @android.annotation.UnsupportedAppUsage
    public int setUsbTethering(boolean p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getLastTetherError(java.lang.String p0) { return 0; }
    @android.annotation.SystemApi
    public void getLatestTetheringEntitlementResult(int p0, boolean p1, java.util.concurrent.Executor p2, android.net.ConnectivityManager.OnTetheringEntitlementResultListener p3) {}
    public void reportInetCondition(int p0, int p1) {}
    @java.lang.Deprecated
    public void reportBadNetwork(android.net.Network p0) {}
    public void reportNetworkConnectivity(android.net.Network p0, boolean p1) {}
    public void setGlobalProxy(android.net.ProxyInfo p0) {}
    public android.net.ProxyInfo getGlobalProxy() { return null; }
    public android.net.ProxyInfo getProxyForNetwork(android.net.Network p0) { return null; }
    public android.net.ProxyInfo getDefaultProxy() { return null; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=130143562L)
    public boolean isNetworkSupported(int p0) { return false; }
    public boolean isActiveNetworkMetered() { return false; }
    public boolean updateLockdownVpn() { return false; }
    public int checkMobileProvisioning(int p0) { return 0; }
    public java.lang.String getMobileProvisioningUrl() { return null; }
    @java.lang.Deprecated
    public void setProvisioningNotificationVisible(boolean p0, int p1, java.lang.String p2) {}
    @android.annotation.SystemApi
    public void setAirplaneMode(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public int registerNetworkFactory(android.os.Messenger p0, java.lang.String p1) { return 0; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void unregisterNetworkFactory(android.os.Messenger p0) {}
    public int registerNetworkAgent(android.os.Messenger p0, android.net.NetworkInfo p1, android.net.LinkProperties p2, android.net.NetworkCapabilities p3, int p4, android.net.NetworkMisc p5) { return 0; }
    public int registerNetworkAgent(android.os.Messenger p0, android.net.NetworkInfo p1, android.net.LinkProperties p2, android.net.NetworkCapabilities p3, int p4, android.net.NetworkMisc p5, int p6) { return 0; }
    private static java.lang.RuntimeException convertServiceException(android.os.ServiceSpecificException p0) { return null; }
    public static java.lang.String getCallbackName(int p0) { return null; }
    private android.net.ConnectivityManager.CallbackHandler getDefaultHandler() { return null; }
    private android.net.NetworkRequest sendRequestForNetwork(android.net.NetworkCapabilities p0, android.net.ConnectivityManager.NetworkCallback p1, int p2, int p3, int p4, android.net.ConnectivityManager.CallbackHandler p5) { return null; }
    public void requestNetwork(android.net.NetworkRequest p0, android.net.ConnectivityManager.NetworkCallback p1, int p2, int p3, android.os.Handler p4) {}
    public void requestNetwork(android.net.NetworkRequest p0, android.net.ConnectivityManager.NetworkCallback p1) {}
    public void requestNetwork(android.net.NetworkRequest p0, android.net.ConnectivityManager.NetworkCallback p1, android.os.Handler p2) {}
    public void requestNetwork(android.net.NetworkRequest p0, android.net.ConnectivityManager.NetworkCallback p1, int p2) {}
    public void requestNetwork(android.net.NetworkRequest p0, android.net.ConnectivityManager.NetworkCallback p1, android.os.Handler p2, int p3) {}
    public void requestNetwork(android.net.NetworkRequest p0, android.app.PendingIntent p1) {}
    public void releaseNetworkRequest(android.app.PendingIntent p0) {}
    private static void checkPendingIntentNotNull(android.app.PendingIntent p0) {}
    private static void checkCallbackNotNull(android.net.ConnectivityManager.NetworkCallback p0) {}
    private static void checkTimeout(int p0) {}
    public void registerNetworkCallback(android.net.NetworkRequest p0, android.net.ConnectivityManager.NetworkCallback p1) {}
    public void registerNetworkCallback(android.net.NetworkRequest p0, android.net.ConnectivityManager.NetworkCallback p1, android.os.Handler p2) {}
    public void registerNetworkCallback(android.net.NetworkRequest p0, android.app.PendingIntent p1) {}
    public void registerDefaultNetworkCallback(android.net.ConnectivityManager.NetworkCallback p0) {}
    public void registerDefaultNetworkCallback(android.net.ConnectivityManager.NetworkCallback p0, android.os.Handler p1) {}
    public boolean requestBandwidthUpdate(android.net.Network p0) { return false; }
    public void unregisterNetworkCallback(android.net.ConnectivityManager.NetworkCallback p0) {}
    public void unregisterNetworkCallback(android.app.PendingIntent p0) {}
    public void setAcceptUnvalidated(android.net.Network p0, boolean p1, boolean p2) {}
    public void setAcceptPartialConnectivity(android.net.Network p0, boolean p1, boolean p2) {}
    public void setAvoidUnvalidated(android.net.Network p0) {}
    public void startCaptivePortalApp(android.net.Network p0) {}
    @android.annotation.SystemApi
    public void startCaptivePortalApp(android.net.Network p0, android.os.Bundle p1) {}
    @android.annotation.SystemApi
    public boolean shouldAvoidBadWifi() { return false; }
    public int getMultipathPreference(android.net.Network p0) { return 0; }
    public void factoryReset() {}
    public boolean bindProcessToNetwork(android.net.Network p0) { return false; }
    @java.lang.Deprecated
    public static boolean setProcessDefaultNetwork(android.net.Network p0) { return false; }
    public android.net.Network getBoundNetworkForProcess() { return null; }
    @java.lang.Deprecated
    public static android.net.Network getProcessDefaultNetwork() { return null; }
    private void unsupportedStartingFrom(int p0) {}
    private void checkLegacyRoutingApiAccess() {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static boolean setProcessDefaultNetworkForHostResolution(android.net.Network p0) { return false; }
    private android.net.INetworkPolicyManager getNetworkPolicyManager() { return null; }
    public int getRestrictBackgroundStatus() { return 0; }
    public byte[] getNetworkWatchlistConfigHash() { return null; }
    public int getConnectionOwnerUid(int p0, java.net.InetSocketAddress p1, java.net.InetSocketAddress p2) { return 0; }
    private void printStackTrace() {}

    public static class TooManyRequestsException extends java.lang.RuntimeException {
        public TooManyRequestsException() { super(); }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RestrictBackgroundStatus {
    }

    public static class PacketKeepaliveCallback {
        public PacketKeepaliveCallback() {}
        @android.annotation.UnsupportedAppUsage
        public void onStarted() {}
        @android.annotation.UnsupportedAppUsage
        public void onStopped() {}
        @android.annotation.UnsupportedAppUsage
        public void onError(int p0) {}
    }

    public class PacketKeepalive {
        private static final java.lang.String TAG = "PacketKeepalive";
        public static final int SUCCESS = 0;
        public static final int NO_KEEPALIVE = -1;
        public static final int BINDER_DIED = -10;
        public static final int ERROR_INVALID_NETWORK = -20;
        public static final int ERROR_INVALID_IP_ADDRESS = -21;
        public static final int ERROR_INVALID_PORT = -22;
        public static final int ERROR_INVALID_LENGTH = -23;
        public static final int ERROR_INVALID_INTERVAL = -24;
        public static final int ERROR_HARDWARE_UNSUPPORTED = -30;
        public static final int ERROR_HARDWARE_ERROR = -31;
        public static final int NATT_PORT = 4500;
        public static final int MIN_INTERVAL = 10;
        private final android.net.Network mNetwork = null;
        private final android.net.ISocketKeepaliveCallback mCallback = null;
        private final java.util.concurrent.ExecutorService mExecutor = null;
        private volatile java.lang.Integer mSlot;
        @android.annotation.UnsupportedAppUsage
        public void stop() {}
        private PacketKeepalive(android.net.ConnectivityManager p0, android.net.Network p1, android.net.ConnectivityManager.PacketKeepaliveCallback p2) {}
    }

    @android.annotation.SystemApi
    public static abstract class OnTetheringEventCallback {
        public OnTetheringEventCallback() {}
        public void onUpstreamChanged(android.net.Network p0) {}
    }

    @android.annotation.SystemApi
    public static interface OnTetheringEntitlementResultListener {
        public void onTetheringEntitlementResult(int p0);
    }

    @android.annotation.SystemApi
    public static abstract class OnStartTetheringCallback {
        public OnStartTetheringCallback() {}
        public void onTetheringStarted() {}
        public void onTetheringFailed() {}
    }

    public static interface OnNetworkActiveListener {
        public void onNetworkActive();
    }

    public static class NetworkCallback {
        private android.net.NetworkRequest networkRequest;
        public NetworkCallback() {}
        public void onPreCheck(android.net.Network p0) {}
        public void onAvailable(android.net.Network p0, android.net.NetworkCapabilities p1, android.net.LinkProperties p2, boolean p3) {}
        public void onAvailable(android.net.Network p0) {}
        public void onLosing(android.net.Network p0, int p1) {}
        public void onLost(android.net.Network p0) {}
        public void onUnavailable() {}
        public void onCapabilitiesChanged(android.net.Network p0, android.net.NetworkCapabilities p1) {}
        public void onLinkPropertiesChanged(android.net.Network p0, android.net.LinkProperties p1) {}
        public void onNetworkSuspended(android.net.Network p0) {}
        public void onNetworkResumed(android.net.Network p0) {}
        public void onBlockedStatusChanged(android.net.Network p0, boolean p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MultipathPreference {
    }

    private static class LegacyRequest {
        android.net.NetworkCapabilities networkCapabilities;
        android.net.NetworkRequest networkRequest;
        int expireSequenceNumber;
        android.net.Network currentNetwork;
        int delay;
        android.net.ConnectivityManager.NetworkCallback networkCallback;
        private LegacyRequest() {}
        private void clearDnsBinding() {}
    }

    public static interface Errors {
        public static final int TOO_MANY_REQUESTS = 1;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EntitlementResultCode {
    }

    private class CallbackHandler extends android.os.Handler {
        private static final java.lang.String TAG = "ConnectivityManager.CallbackHandler";
        private static final boolean DBG = false;
        CallbackHandler(android.net.ConnectivityManager p0, android.os.Looper p1) { super(); }
        CallbackHandler(android.net.ConnectivityManager p0, android.os.Handler p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
        private <T extends java.lang.Object> T getObject(android.os.Message p0, java.lang.Class<T> p1) { return null; }
    }
}
