package android.net;

public interface IConnectivityManager extends android.os.IInterface {
    public android.net.Network getActiveNetwork() throws android.os.RemoteException;
    public android.net.Network getActiveNetworkForUid(int p0, boolean p1) throws android.os.RemoteException;
    public android.net.NetworkInfo getActiveNetworkInfo() throws android.os.RemoteException;
    public android.net.NetworkInfo getActiveNetworkInfoForUid(int p0, boolean p1) throws android.os.RemoteException;
    public android.net.NetworkInfo getNetworkInfo(int p0) throws android.os.RemoteException;
    public android.net.NetworkInfo getNetworkInfoForUid(android.net.Network p0, int p1, boolean p2) throws android.os.RemoteException;
    public android.net.NetworkInfo[] getAllNetworkInfo() throws android.os.RemoteException;
    public android.net.Network getNetworkForType(int p0) throws android.os.RemoteException;
    public android.net.Network[] getAllNetworks() throws android.os.RemoteException;
    public android.net.NetworkCapabilities[] getDefaultNetworkCapabilitiesForUser(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isNetworkSupported(int p0) throws android.os.RemoteException;
    public android.net.LinkProperties getActiveLinkProperties() throws android.os.RemoteException;
    public android.net.LinkProperties getLinkPropertiesForType(int p0) throws android.os.RemoteException;
    public android.net.LinkProperties getLinkProperties(android.net.Network p0) throws android.os.RemoteException;
    public android.net.NetworkCapabilities getNetworkCapabilities(android.net.Network p0, java.lang.String p1) throws android.os.RemoteException;
    public android.net.NetworkState[] getAllNetworkState() throws android.os.RemoteException;
    public android.net.NetworkQuotaInfo getActiveNetworkQuotaInfo() throws android.os.RemoteException;
    public boolean isActiveNetworkMetered() throws android.os.RemoteException;
    public boolean requestRouteToHostAddress(int p0, byte[] p1) throws android.os.RemoteException;
    public int getLastTetherError(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String[] getTetherableIfaces() throws android.os.RemoteException;
    public java.lang.String[] getTetheredIfaces() throws android.os.RemoteException;
    public java.lang.String[] getTetheringErroredIfaces() throws android.os.RemoteException;
    public java.lang.String[] getTetherableUsbRegexs() throws android.os.RemoteException;
    public java.lang.String[] getTetherableWifiRegexs() throws android.os.RemoteException;
    public void reportInetCondition(int p0, int p1) throws android.os.RemoteException;
    public void reportNetworkConnectivity(android.net.Network p0, boolean p1) throws android.os.RemoteException;
    public android.net.ProxyInfo getGlobalProxy() throws android.os.RemoteException;
    public void setGlobalProxy(android.net.ProxyInfo p0) throws android.os.RemoteException;
    public android.net.ProxyInfo getProxyForNetwork(android.net.Network p0) throws android.os.RemoteException;
    public boolean prepareVpn(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setVpnPackageAuthorization(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor establishVpn(com.android.internal.net.VpnConfig p0) throws android.os.RemoteException;
    public boolean provisionVpnProfile(com.android.internal.net.VpnProfile p0, java.lang.String p1) throws android.os.RemoteException;
    public void deleteVpnProfile(java.lang.String p0) throws android.os.RemoteException;
    public void startVpnProfile(java.lang.String p0) throws android.os.RemoteException;
    public void stopVpnProfile(java.lang.String p0) throws android.os.RemoteException;
    public com.android.internal.net.VpnConfig getVpnConfig(int p0) throws android.os.RemoteException;
    public void startLegacyVpn(com.android.internal.net.VpnProfile p0) throws android.os.RemoteException;
    public com.android.internal.net.LegacyVpnInfo getLegacyVpnInfo(int p0) throws android.os.RemoteException;
    public boolean updateLockdownVpn() throws android.os.RemoteException;
    public boolean isAlwaysOnVpnPackageSupported(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean setAlwaysOnVpnPackage(int p0, java.lang.String p1, boolean p2, java.util.List<java.lang.String> p3) throws android.os.RemoteException;
    public java.lang.String getAlwaysOnVpnPackage(int p0) throws android.os.RemoteException;
    public boolean isVpnLockdownEnabled(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getVpnLockdownWhitelist(int p0) throws android.os.RemoteException;
    public int checkMobileProvisioning(int p0) throws android.os.RemoteException;
    public java.lang.String getMobileProvisioningUrl() throws android.os.RemoteException;
    public void setProvisioningNotificationVisible(boolean p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void setAirplaneMode(boolean p0) throws android.os.RemoteException;
    public boolean requestBandwidthUpdate(android.net.Network p0) throws android.os.RemoteException;
    public int registerNetworkFactory(android.os.Messenger p0, java.lang.String p1) throws android.os.RemoteException;
    public void unregisterNetworkFactory(android.os.Messenger p0) throws android.os.RemoteException;
    public int registerNetworkProvider(android.os.Messenger p0, java.lang.String p1) throws android.os.RemoteException;
    public void unregisterNetworkProvider(android.os.Messenger p0) throws android.os.RemoteException;
    public void declareNetworkRequestUnfulfillable(android.net.NetworkRequest p0) throws android.os.RemoteException;
    public android.net.Network registerNetworkAgent(android.os.Messenger p0, android.net.NetworkInfo p1, android.net.LinkProperties p2, android.net.NetworkCapabilities p3, int p4, android.net.NetworkAgentConfig p5, int p6) throws android.os.RemoteException;
    public android.net.NetworkRequest requestNetwork(android.net.NetworkCapabilities p0, android.os.Messenger p1, int p2, android.os.IBinder p3, int p4, java.lang.String p5) throws android.os.RemoteException;
    public android.net.NetworkRequest pendingRequestForNetwork(android.net.NetworkCapabilities p0, android.app.PendingIntent p1, java.lang.String p2) throws android.os.RemoteException;
    public void releasePendingNetworkRequest(android.app.PendingIntent p0) throws android.os.RemoteException;
    public android.net.NetworkRequest listenForNetwork(android.net.NetworkCapabilities p0, android.os.Messenger p1, android.os.IBinder p2, java.lang.String p3) throws android.os.RemoteException;
    public void pendingListenForNetwork(android.net.NetworkCapabilities p0, android.app.PendingIntent p1, java.lang.String p2) throws android.os.RemoteException;
    public void releaseNetworkRequest(android.net.NetworkRequest p0) throws android.os.RemoteException;
    public void setAcceptUnvalidated(android.net.Network p0, boolean p1, boolean p2) throws android.os.RemoteException;
    public void setAcceptPartialConnectivity(android.net.Network p0, boolean p1, boolean p2) throws android.os.RemoteException;
    public void setAvoidUnvalidated(android.net.Network p0) throws android.os.RemoteException;
    public void startCaptivePortalApp(android.net.Network p0) throws android.os.RemoteException;
    public void startCaptivePortalAppInternal(android.net.Network p0, android.os.Bundle p1) throws android.os.RemoteException;
    public boolean shouldAvoidBadWifi() throws android.os.RemoteException;
    public int getMultipathPreference(android.net.Network p0) throws android.os.RemoteException;
    public android.net.NetworkRequest getDefaultRequest() throws android.os.RemoteException;
    public int getRestoreDefaultNetworkDelay(int p0) throws android.os.RemoteException;
    public boolean addVpnAddress(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean removeVpnAddress(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean setUnderlyingNetworksForVpn(android.net.Network[] p0) throws android.os.RemoteException;
    public void factoryReset() throws android.os.RemoteException;
    public void startNattKeepalive(android.net.Network p0, int p1, android.net.ISocketKeepaliveCallback p2, java.lang.String p3, int p4, java.lang.String p5) throws android.os.RemoteException;
    public void startNattKeepaliveWithFd(android.net.Network p0, java.io.FileDescriptor p1, int p2, int p3, android.net.ISocketKeepaliveCallback p4, java.lang.String p5, java.lang.String p6) throws android.os.RemoteException;
    public void startTcpKeepalive(android.net.Network p0, java.io.FileDescriptor p1, int p2, android.net.ISocketKeepaliveCallback p3) throws android.os.RemoteException;
    public void stopKeepalive(android.net.Network p0, int p1) throws android.os.RemoteException;
    public java.lang.String getCaptivePortalServerUrl() throws android.os.RemoteException;
    public byte[] getNetworkWatchlistConfigHash() throws android.os.RemoteException;
    public int getConnectionOwnerUid(android.net.ConnectionInfo p0) throws android.os.RemoteException;
    public boolean isCallerCurrentAlwaysOnVpnApp() throws android.os.RemoteException;
    public boolean isCallerCurrentAlwaysOnVpnLockdownApp() throws android.os.RemoteException;
    public void registerConnectivityDiagnosticsCallback(android.net.IConnectivityDiagnosticsCallback p0, android.net.NetworkRequest p1, java.lang.String p2) throws android.os.RemoteException;
    public void unregisterConnectivityDiagnosticsCallback(android.net.IConnectivityDiagnosticsCallback p0) throws android.os.RemoteException;
    public android.os.IBinder startOrGetTestNetworkService() throws android.os.RemoteException;
    public void simulateDataStall(int p0, long p1, android.net.Network p2, android.os.PersistableBundle p3) throws android.os.RemoteException;

    public static class Default implements android.net.IConnectivityManager {
        public Default() {}
        public android.net.Network getActiveNetwork() throws android.os.RemoteException { return null; }
        public android.net.Network getActiveNetworkForUid(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public android.net.NetworkInfo getActiveNetworkInfo() throws android.os.RemoteException { return null; }
        public android.net.NetworkInfo getActiveNetworkInfoForUid(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public android.net.NetworkInfo getNetworkInfo(int p0) throws android.os.RemoteException { return null; }
        public android.net.NetworkInfo getNetworkInfoForUid(android.net.Network p0, int p1, boolean p2) throws android.os.RemoteException { return null; }
        public android.net.NetworkInfo[] getAllNetworkInfo() throws android.os.RemoteException { return null; }
        public android.net.Network getNetworkForType(int p0) throws android.os.RemoteException { return null; }
        public android.net.Network[] getAllNetworks() throws android.os.RemoteException { return null; }
        public android.net.NetworkCapabilities[] getDefaultNetworkCapabilitiesForUser(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean isNetworkSupported(int p0) throws android.os.RemoteException { return false; }
        public android.net.LinkProperties getActiveLinkProperties() throws android.os.RemoteException { return null; }
        public android.net.LinkProperties getLinkPropertiesForType(int p0) throws android.os.RemoteException { return null; }
        public android.net.LinkProperties getLinkProperties(android.net.Network p0) throws android.os.RemoteException { return null; }
        public android.net.NetworkCapabilities getNetworkCapabilities(android.net.Network p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.net.NetworkState[] getAllNetworkState() throws android.os.RemoteException { return null; }
        public android.net.NetworkQuotaInfo getActiveNetworkQuotaInfo() throws android.os.RemoteException { return null; }
        public boolean isActiveNetworkMetered() throws android.os.RemoteException { return false; }
        public boolean requestRouteToHostAddress(int p0, byte[] p1) throws android.os.RemoteException { return false; }
        public int getLastTetherError(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public java.lang.String[] getTetherableIfaces() throws android.os.RemoteException { return null; }
        public java.lang.String[] getTetheredIfaces() throws android.os.RemoteException { return null; }
        public java.lang.String[] getTetheringErroredIfaces() throws android.os.RemoteException { return null; }
        public java.lang.String[] getTetherableUsbRegexs() throws android.os.RemoteException { return null; }
        public java.lang.String[] getTetherableWifiRegexs() throws android.os.RemoteException { return null; }
        public void reportInetCondition(int p0, int p1) throws android.os.RemoteException {}
        public void reportNetworkConnectivity(android.net.Network p0, boolean p1) throws android.os.RemoteException {}
        public android.net.ProxyInfo getGlobalProxy() throws android.os.RemoteException { return null; }
        public void setGlobalProxy(android.net.ProxyInfo p0) throws android.os.RemoteException {}
        public android.net.ProxyInfo getProxyForNetwork(android.net.Network p0) throws android.os.RemoteException { return null; }
        public boolean prepareVpn(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public void setVpnPackageAuthorization(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public android.os.ParcelFileDescriptor establishVpn(com.android.internal.net.VpnConfig p0) throws android.os.RemoteException { return null; }
        public boolean provisionVpnProfile(com.android.internal.net.VpnProfile p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void deleteVpnProfile(java.lang.String p0) throws android.os.RemoteException {}
        public void startVpnProfile(java.lang.String p0) throws android.os.RemoteException {}
        public void stopVpnProfile(java.lang.String p0) throws android.os.RemoteException {}
        public com.android.internal.net.VpnConfig getVpnConfig(int p0) throws android.os.RemoteException { return null; }
        public void startLegacyVpn(com.android.internal.net.VpnProfile p0) throws android.os.RemoteException {}
        public com.android.internal.net.LegacyVpnInfo getLegacyVpnInfo(int p0) throws android.os.RemoteException { return null; }
        public boolean updateLockdownVpn() throws android.os.RemoteException { return false; }
        public boolean isAlwaysOnVpnPackageSupported(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean setAlwaysOnVpnPackage(int p0, java.lang.String p1, boolean p2, java.util.List<java.lang.String> p3) throws android.os.RemoteException { return false; }
        public java.lang.String getAlwaysOnVpnPackage(int p0) throws android.os.RemoteException { return null; }
        public boolean isVpnLockdownEnabled(int p0) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getVpnLockdownWhitelist(int p0) throws android.os.RemoteException { return null; }
        public int checkMobileProvisioning(int p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getMobileProvisioningUrl() throws android.os.RemoteException { return null; }
        public void setProvisioningNotificationVisible(boolean p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setAirplaneMode(boolean p0) throws android.os.RemoteException {}
        public boolean requestBandwidthUpdate(android.net.Network p0) throws android.os.RemoteException { return false; }
        public int registerNetworkFactory(android.os.Messenger p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void unregisterNetworkFactory(android.os.Messenger p0) throws android.os.RemoteException {}
        public int registerNetworkProvider(android.os.Messenger p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void unregisterNetworkProvider(android.os.Messenger p0) throws android.os.RemoteException {}
        public void declareNetworkRequestUnfulfillable(android.net.NetworkRequest p0) throws android.os.RemoteException {}
        public android.net.Network registerNetworkAgent(android.os.Messenger p0, android.net.NetworkInfo p1, android.net.LinkProperties p2, android.net.NetworkCapabilities p3, int p4, android.net.NetworkAgentConfig p5, int p6) throws android.os.RemoteException { return null; }
        public android.net.NetworkRequest requestNetwork(android.net.NetworkCapabilities p0, android.os.Messenger p1, int p2, android.os.IBinder p3, int p4, java.lang.String p5) throws android.os.RemoteException { return null; }
        public android.net.NetworkRequest pendingRequestForNetwork(android.net.NetworkCapabilities p0, android.app.PendingIntent p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public void releasePendingNetworkRequest(android.app.PendingIntent p0) throws android.os.RemoteException {}
        public android.net.NetworkRequest listenForNetwork(android.net.NetworkCapabilities p0, android.os.Messenger p1, android.os.IBinder p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public void pendingListenForNetwork(android.net.NetworkCapabilities p0, android.app.PendingIntent p1, java.lang.String p2) throws android.os.RemoteException {}
        public void releaseNetworkRequest(android.net.NetworkRequest p0) throws android.os.RemoteException {}
        public void setAcceptUnvalidated(android.net.Network p0, boolean p1, boolean p2) throws android.os.RemoteException {}
        public void setAcceptPartialConnectivity(android.net.Network p0, boolean p1, boolean p2) throws android.os.RemoteException {}
        public void setAvoidUnvalidated(android.net.Network p0) throws android.os.RemoteException {}
        public void startCaptivePortalApp(android.net.Network p0) throws android.os.RemoteException {}
        public void startCaptivePortalAppInternal(android.net.Network p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public boolean shouldAvoidBadWifi() throws android.os.RemoteException { return false; }
        public int getMultipathPreference(android.net.Network p0) throws android.os.RemoteException { return 0; }
        public android.net.NetworkRequest getDefaultRequest() throws android.os.RemoteException { return null; }
        public int getRestoreDefaultNetworkDelay(int p0) throws android.os.RemoteException { return 0; }
        public boolean addVpnAddress(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean removeVpnAddress(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean setUnderlyingNetworksForVpn(android.net.Network[] p0) throws android.os.RemoteException { return false; }
        public void factoryReset() throws android.os.RemoteException {}
        public void startNattKeepalive(android.net.Network p0, int p1, android.net.ISocketKeepaliveCallback p2, java.lang.String p3, int p4, java.lang.String p5) throws android.os.RemoteException {}
        public void startNattKeepaliveWithFd(android.net.Network p0, java.io.FileDescriptor p1, int p2, int p3, android.net.ISocketKeepaliveCallback p4, java.lang.String p5, java.lang.String p6) throws android.os.RemoteException {}
        public void startTcpKeepalive(android.net.Network p0, java.io.FileDescriptor p1, int p2, android.net.ISocketKeepaliveCallback p3) throws android.os.RemoteException {}
        public void stopKeepalive(android.net.Network p0, int p1) throws android.os.RemoteException {}
        public java.lang.String getCaptivePortalServerUrl() throws android.os.RemoteException { return null; }
        public byte[] getNetworkWatchlistConfigHash() throws android.os.RemoteException { return null; }
        public int getConnectionOwnerUid(android.net.ConnectionInfo p0) throws android.os.RemoteException { return 0; }
        public boolean isCallerCurrentAlwaysOnVpnApp() throws android.os.RemoteException { return false; }
        public boolean isCallerCurrentAlwaysOnVpnLockdownApp() throws android.os.RemoteException { return false; }
        public void registerConnectivityDiagnosticsCallback(android.net.IConnectivityDiagnosticsCallback p0, android.net.NetworkRequest p1, java.lang.String p2) throws android.os.RemoteException {}
        public void unregisterConnectivityDiagnosticsCallback(android.net.IConnectivityDiagnosticsCallback p0) throws android.os.RemoteException {}
        public android.os.IBinder startOrGetTestNetworkService() throws android.os.RemoteException { return null; }
        public void simulateDataStall(int p0, long p1, android.net.Network p2, android.os.PersistableBundle p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.IConnectivityManager {
        private static final java.lang.String DESCRIPTOR = "android.net.IConnectivityManager";
        static final int TRANSACTION_getActiveNetwork = 1;
        static final int TRANSACTION_getActiveNetworkForUid = 2;
        static final int TRANSACTION_getActiveNetworkInfo = 3;
        static final int TRANSACTION_getActiveNetworkInfoForUid = 4;
        static final int TRANSACTION_getNetworkInfo = 5;
        static final int TRANSACTION_getNetworkInfoForUid = 6;
        static final int TRANSACTION_getAllNetworkInfo = 7;
        static final int TRANSACTION_getNetworkForType = 8;
        static final int TRANSACTION_getAllNetworks = 9;
        static final int TRANSACTION_getDefaultNetworkCapabilitiesForUser = 10;
        static final int TRANSACTION_isNetworkSupported = 11;
        static final int TRANSACTION_getActiveLinkProperties = 12;
        static final int TRANSACTION_getLinkPropertiesForType = 13;
        static final int TRANSACTION_getLinkProperties = 14;
        static final int TRANSACTION_getNetworkCapabilities = 15;
        static final int TRANSACTION_getAllNetworkState = 16;
        static final int TRANSACTION_getActiveNetworkQuotaInfo = 17;
        static final int TRANSACTION_isActiveNetworkMetered = 18;
        static final int TRANSACTION_requestRouteToHostAddress = 19;
        static final int TRANSACTION_getLastTetherError = 20;
        static final int TRANSACTION_getTetherableIfaces = 21;
        static final int TRANSACTION_getTetheredIfaces = 22;
        static final int TRANSACTION_getTetheringErroredIfaces = 23;
        static final int TRANSACTION_getTetherableUsbRegexs = 24;
        static final int TRANSACTION_getTetherableWifiRegexs = 25;
        static final int TRANSACTION_reportInetCondition = 26;
        static final int TRANSACTION_reportNetworkConnectivity = 27;
        static final int TRANSACTION_getGlobalProxy = 28;
        static final int TRANSACTION_setGlobalProxy = 29;
        static final int TRANSACTION_getProxyForNetwork = 30;
        static final int TRANSACTION_prepareVpn = 31;
        static final int TRANSACTION_setVpnPackageAuthorization = 32;
        static final int TRANSACTION_establishVpn = 33;
        static final int TRANSACTION_provisionVpnProfile = 34;
        static final int TRANSACTION_deleteVpnProfile = 35;
        static final int TRANSACTION_startVpnProfile = 36;
        static final int TRANSACTION_stopVpnProfile = 37;
        static final int TRANSACTION_getVpnConfig = 38;
        static final int TRANSACTION_startLegacyVpn = 39;
        static final int TRANSACTION_getLegacyVpnInfo = 40;
        static final int TRANSACTION_updateLockdownVpn = 41;
        static final int TRANSACTION_isAlwaysOnVpnPackageSupported = 42;
        static final int TRANSACTION_setAlwaysOnVpnPackage = 43;
        static final int TRANSACTION_getAlwaysOnVpnPackage = 44;
        static final int TRANSACTION_isVpnLockdownEnabled = 45;
        static final int TRANSACTION_getVpnLockdownWhitelist = 46;
        static final int TRANSACTION_checkMobileProvisioning = 47;
        static final int TRANSACTION_getMobileProvisioningUrl = 48;
        static final int TRANSACTION_setProvisioningNotificationVisible = 49;
        static final int TRANSACTION_setAirplaneMode = 50;
        static final int TRANSACTION_requestBandwidthUpdate = 51;
        static final int TRANSACTION_registerNetworkFactory = 52;
        static final int TRANSACTION_unregisterNetworkFactory = 53;
        static final int TRANSACTION_registerNetworkProvider = 54;
        static final int TRANSACTION_unregisterNetworkProvider = 55;
        static final int TRANSACTION_declareNetworkRequestUnfulfillable = 56;
        static final int TRANSACTION_registerNetworkAgent = 57;
        static final int TRANSACTION_requestNetwork = 58;
        static final int TRANSACTION_pendingRequestForNetwork = 59;
        static final int TRANSACTION_releasePendingNetworkRequest = 60;
        static final int TRANSACTION_listenForNetwork = 61;
        static final int TRANSACTION_pendingListenForNetwork = 62;
        static final int TRANSACTION_releaseNetworkRequest = 63;
        static final int TRANSACTION_setAcceptUnvalidated = 64;
        static final int TRANSACTION_setAcceptPartialConnectivity = 65;
        static final int TRANSACTION_setAvoidUnvalidated = 66;
        static final int TRANSACTION_startCaptivePortalApp = 67;
        static final int TRANSACTION_startCaptivePortalAppInternal = 68;
        static final int TRANSACTION_shouldAvoidBadWifi = 69;
        static final int TRANSACTION_getMultipathPreference = 70;
        static final int TRANSACTION_getDefaultRequest = 71;
        static final int TRANSACTION_getRestoreDefaultNetworkDelay = 72;
        static final int TRANSACTION_addVpnAddress = 73;
        static final int TRANSACTION_removeVpnAddress = 74;
        static final int TRANSACTION_setUnderlyingNetworksForVpn = 75;
        static final int TRANSACTION_factoryReset = 76;
        static final int TRANSACTION_startNattKeepalive = 77;
        static final int TRANSACTION_startNattKeepaliveWithFd = 78;
        static final int TRANSACTION_startTcpKeepalive = 79;
        static final int TRANSACTION_stopKeepalive = 80;
        static final int TRANSACTION_getCaptivePortalServerUrl = 81;
        static final int TRANSACTION_getNetworkWatchlistConfigHash = 82;
        static final int TRANSACTION_getConnectionOwnerUid = 83;
        static final int TRANSACTION_isCallerCurrentAlwaysOnVpnApp = 84;
        static final int TRANSACTION_isCallerCurrentAlwaysOnVpnLockdownApp = 85;
        static final int TRANSACTION_registerConnectivityDiagnosticsCallback = 86;
        static final int TRANSACTION_unregisterConnectivityDiagnosticsCallback = 87;
        static final int TRANSACTION_startOrGetTestNetworkService = 88;
        static final int TRANSACTION_simulateDataStall = 89;
        public Stub() { super(); }
        public static android.net.IConnectivityManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.IConnectivityManager p0) { return false; }
        public static android.net.IConnectivityManager getDefaultImpl() { return null; }

        private static class Proxy implements android.net.IConnectivityManager {
            private android.os.IBinder mRemote;
            public static android.net.IConnectivityManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.net.Network getActiveNetwork() throws android.os.RemoteException { return null; }
            public android.net.Network getActiveNetworkForUid(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public android.net.NetworkInfo getActiveNetworkInfo() throws android.os.RemoteException { return null; }
            public android.net.NetworkInfo getActiveNetworkInfoForUid(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public android.net.NetworkInfo getNetworkInfo(int p0) throws android.os.RemoteException { return null; }
            public android.net.NetworkInfo getNetworkInfoForUid(android.net.Network p0, int p1, boolean p2) throws android.os.RemoteException { return null; }
            public android.net.NetworkInfo[] getAllNetworkInfo() throws android.os.RemoteException { return null; }
            public android.net.Network getNetworkForType(int p0) throws android.os.RemoteException { return null; }
            public android.net.Network[] getAllNetworks() throws android.os.RemoteException { return null; }
            public android.net.NetworkCapabilities[] getDefaultNetworkCapabilitiesForUser(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean isNetworkSupported(int p0) throws android.os.RemoteException { return false; }
            public android.net.LinkProperties getActiveLinkProperties() throws android.os.RemoteException { return null; }
            public android.net.LinkProperties getLinkPropertiesForType(int p0) throws android.os.RemoteException { return null; }
            public android.net.LinkProperties getLinkProperties(android.net.Network p0) throws android.os.RemoteException { return null; }
            public android.net.NetworkCapabilities getNetworkCapabilities(android.net.Network p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.net.NetworkState[] getAllNetworkState() throws android.os.RemoteException { return null; }
            public android.net.NetworkQuotaInfo getActiveNetworkQuotaInfo() throws android.os.RemoteException { return null; }
            public boolean isActiveNetworkMetered() throws android.os.RemoteException { return false; }
            public boolean requestRouteToHostAddress(int p0, byte[] p1) throws android.os.RemoteException { return false; }
            public int getLastTetherError(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public java.lang.String[] getTetherableIfaces() throws android.os.RemoteException { return null; }
            public java.lang.String[] getTetheredIfaces() throws android.os.RemoteException { return null; }
            public java.lang.String[] getTetheringErroredIfaces() throws android.os.RemoteException { return null; }
            public java.lang.String[] getTetherableUsbRegexs() throws android.os.RemoteException { return null; }
            public java.lang.String[] getTetherableWifiRegexs() throws android.os.RemoteException { return null; }
            public void reportInetCondition(int p0, int p1) throws android.os.RemoteException {}
            public void reportNetworkConnectivity(android.net.Network p0, boolean p1) throws android.os.RemoteException {}
            public android.net.ProxyInfo getGlobalProxy() throws android.os.RemoteException { return null; }
            public void setGlobalProxy(android.net.ProxyInfo p0) throws android.os.RemoteException {}
            public android.net.ProxyInfo getProxyForNetwork(android.net.Network p0) throws android.os.RemoteException { return null; }
            public boolean prepareVpn(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public void setVpnPackageAuthorization(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public android.os.ParcelFileDescriptor establishVpn(com.android.internal.net.VpnConfig p0) throws android.os.RemoteException { return null; }
            public boolean provisionVpnProfile(com.android.internal.net.VpnProfile p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void deleteVpnProfile(java.lang.String p0) throws android.os.RemoteException {}
            public void startVpnProfile(java.lang.String p0) throws android.os.RemoteException {}
            public void stopVpnProfile(java.lang.String p0) throws android.os.RemoteException {}
            public com.android.internal.net.VpnConfig getVpnConfig(int p0) throws android.os.RemoteException { return null; }
            public void startLegacyVpn(com.android.internal.net.VpnProfile p0) throws android.os.RemoteException {}
            public com.android.internal.net.LegacyVpnInfo getLegacyVpnInfo(int p0) throws android.os.RemoteException { return null; }
            public boolean updateLockdownVpn() throws android.os.RemoteException { return false; }
            public boolean isAlwaysOnVpnPackageSupported(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean setAlwaysOnVpnPackage(int p0, java.lang.String p1, boolean p2, java.util.List<java.lang.String> p3) throws android.os.RemoteException { return false; }
            public java.lang.String getAlwaysOnVpnPackage(int p0) throws android.os.RemoteException { return null; }
            public boolean isVpnLockdownEnabled(int p0) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getVpnLockdownWhitelist(int p0) throws android.os.RemoteException { return null; }
            public int checkMobileProvisioning(int p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getMobileProvisioningUrl() throws android.os.RemoteException { return null; }
            public void setProvisioningNotificationVisible(boolean p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setAirplaneMode(boolean p0) throws android.os.RemoteException {}
            public boolean requestBandwidthUpdate(android.net.Network p0) throws android.os.RemoteException { return false; }
            public int registerNetworkFactory(android.os.Messenger p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void unregisterNetworkFactory(android.os.Messenger p0) throws android.os.RemoteException {}
            public int registerNetworkProvider(android.os.Messenger p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void unregisterNetworkProvider(android.os.Messenger p0) throws android.os.RemoteException {}
            public void declareNetworkRequestUnfulfillable(android.net.NetworkRequest p0) throws android.os.RemoteException {}
            public android.net.Network registerNetworkAgent(android.os.Messenger p0, android.net.NetworkInfo p1, android.net.LinkProperties p2, android.net.NetworkCapabilities p3, int p4, android.net.NetworkAgentConfig p5, int p6) throws android.os.RemoteException { return null; }
            public android.net.NetworkRequest requestNetwork(android.net.NetworkCapabilities p0, android.os.Messenger p1, int p2, android.os.IBinder p3, int p4, java.lang.String p5) throws android.os.RemoteException { return null; }
            public android.net.NetworkRequest pendingRequestForNetwork(android.net.NetworkCapabilities p0, android.app.PendingIntent p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public void releasePendingNetworkRequest(android.app.PendingIntent p0) throws android.os.RemoteException {}
            public android.net.NetworkRequest listenForNetwork(android.net.NetworkCapabilities p0, android.os.Messenger p1, android.os.IBinder p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public void pendingListenForNetwork(android.net.NetworkCapabilities p0, android.app.PendingIntent p1, java.lang.String p2) throws android.os.RemoteException {}
            public void releaseNetworkRequest(android.net.NetworkRequest p0) throws android.os.RemoteException {}
            public void setAcceptUnvalidated(android.net.Network p0, boolean p1, boolean p2) throws android.os.RemoteException {}
            public void setAcceptPartialConnectivity(android.net.Network p0, boolean p1, boolean p2) throws android.os.RemoteException {}
            public void setAvoidUnvalidated(android.net.Network p0) throws android.os.RemoteException {}
            public void startCaptivePortalApp(android.net.Network p0) throws android.os.RemoteException {}
            public void startCaptivePortalAppInternal(android.net.Network p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public boolean shouldAvoidBadWifi() throws android.os.RemoteException { return false; }
            public int getMultipathPreference(android.net.Network p0) throws android.os.RemoteException { return 0; }
            public android.net.NetworkRequest getDefaultRequest() throws android.os.RemoteException { return null; }
            public int getRestoreDefaultNetworkDelay(int p0) throws android.os.RemoteException { return 0; }
            public boolean addVpnAddress(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean removeVpnAddress(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean setUnderlyingNetworksForVpn(android.net.Network[] p0) throws android.os.RemoteException { return false; }
            public void factoryReset() throws android.os.RemoteException {}
            public void startNattKeepalive(android.net.Network p0, int p1, android.net.ISocketKeepaliveCallback p2, java.lang.String p3, int p4, java.lang.String p5) throws android.os.RemoteException {}
            public void startNattKeepaliveWithFd(android.net.Network p0, java.io.FileDescriptor p1, int p2, int p3, android.net.ISocketKeepaliveCallback p4, java.lang.String p5, java.lang.String p6) throws android.os.RemoteException {}
            public void startTcpKeepalive(android.net.Network p0, java.io.FileDescriptor p1, int p2, android.net.ISocketKeepaliveCallback p3) throws android.os.RemoteException {}
            public void stopKeepalive(android.net.Network p0, int p1) throws android.os.RemoteException {}
            public java.lang.String getCaptivePortalServerUrl() throws android.os.RemoteException { return null; }
            public byte[] getNetworkWatchlistConfigHash() throws android.os.RemoteException { return null; }
            public int getConnectionOwnerUid(android.net.ConnectionInfo p0) throws android.os.RemoteException { return 0; }
            public boolean isCallerCurrentAlwaysOnVpnApp() throws android.os.RemoteException { return false; }
            public boolean isCallerCurrentAlwaysOnVpnLockdownApp() throws android.os.RemoteException { return false; }
            public void registerConnectivityDiagnosticsCallback(android.net.IConnectivityDiagnosticsCallback p0, android.net.NetworkRequest p1, java.lang.String p2) throws android.os.RemoteException {}
            public void unregisterConnectivityDiagnosticsCallback(android.net.IConnectivityDiagnosticsCallback p0) throws android.os.RemoteException {}
            public android.os.IBinder startOrGetTestNetworkService() throws android.os.RemoteException { return null; }
            public void simulateDataStall(int p0, long p1, android.net.Network p2, android.os.PersistableBundle p3) throws android.os.RemoteException {}
        }
    }
}
