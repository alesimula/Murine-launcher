package android.net;

public interface IConnectivityManager extends android.os.IInterface {
    public android.net.Network getActiveNetwork() throws android.os.RemoteException;
    public android.net.Network getActiveNetworkForUid(int p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.net.NetworkInfo getActiveNetworkInfo() throws android.os.RemoteException;
    public android.net.NetworkInfo getActiveNetworkInfoForUid(int p0, boolean p1) throws android.os.RemoteException;
    public android.net.NetworkInfo getNetworkInfo(int p0) throws android.os.RemoteException;
    public android.net.NetworkInfo getNetworkInfoForUid(android.net.Network p0, int p1, boolean p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.net.NetworkInfo[] getAllNetworkInfo() throws android.os.RemoteException;
    public android.net.Network getNetworkForType(int p0) throws android.os.RemoteException;
    public android.net.Network[] getAllNetworks() throws android.os.RemoteException;
    public android.net.NetworkCapabilities[] getDefaultNetworkCapabilitiesForUser(int p0) throws android.os.RemoteException;
    public boolean isNetworkSupported(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.net.LinkProperties getActiveLinkProperties() throws android.os.RemoteException;
    public android.net.LinkProperties getLinkPropertiesForType(int p0) throws android.os.RemoteException;
    public android.net.LinkProperties getLinkProperties(android.net.Network p0) throws android.os.RemoteException;
    public android.net.NetworkCapabilities getNetworkCapabilities(android.net.Network p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.net.NetworkState[] getAllNetworkState() throws android.os.RemoteException;
    public android.net.NetworkQuotaInfo getActiveNetworkQuotaInfo() throws android.os.RemoteException;
    public boolean isActiveNetworkMetered() throws android.os.RemoteException;
    public boolean requestRouteToHostAddress(int p0, byte[] p1) throws android.os.RemoteException;
    public int tether(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int untether(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int getLastTetherError(java.lang.String p0) throws android.os.RemoteException;
    public boolean isTetheringSupported(java.lang.String p0) throws android.os.RemoteException;
    public void startTethering(int p0, android.os.ResultReceiver p1, boolean p2, java.lang.String p3) throws android.os.RemoteException;
    public void stopTethering(int p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] getTetherableIfaces() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] getTetheredIfaces() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] getTetheringErroredIfaces() throws android.os.RemoteException;
    public java.lang.String[] getTetheredDhcpRanges() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] getTetherableUsbRegexs() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] getTetherableWifiRegexs() throws android.os.RemoteException;
    public java.lang.String[] getTetherableBluetoothRegexs() throws android.os.RemoteException;
    public int setUsbTethering(boolean p0, java.lang.String p1) throws android.os.RemoteException;
    public void reportInetCondition(int p0, int p1) throws android.os.RemoteException;
    public void reportNetworkConnectivity(android.net.Network p0, boolean p1) throws android.os.RemoteException;
    public android.net.ProxyInfo getGlobalProxy() throws android.os.RemoteException;
    public void setGlobalProxy(android.net.ProxyInfo p0) throws android.os.RemoteException;
    public android.net.ProxyInfo getProxyForNetwork(android.net.Network p0) throws android.os.RemoteException;
    public boolean prepareVpn(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setVpnPackageAuthorization(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor establishVpn(com.android.internal.net.VpnConfig p0) throws android.os.RemoteException;
    public com.android.internal.net.VpnConfig getVpnConfig(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
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
    public int registerNetworkFactory(android.os.Messenger p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean requestBandwidthUpdate(android.net.Network p0) throws android.os.RemoteException;
    public void unregisterNetworkFactory(android.os.Messenger p0) throws android.os.RemoteException;
    public int registerNetworkAgent(android.os.Messenger p0, android.net.NetworkInfo p1, android.net.LinkProperties p2, android.net.NetworkCapabilities p3, int p4, android.net.NetworkMisc p5, int p6) throws android.os.RemoteException;
    public android.net.NetworkRequest requestNetwork(android.net.NetworkCapabilities p0, android.os.Messenger p1, int p2, android.os.IBinder p3, int p4) throws android.os.RemoteException;
    public android.net.NetworkRequest pendingRequestForNetwork(android.net.NetworkCapabilities p0, android.app.PendingIntent p1) throws android.os.RemoteException;
    public void releasePendingNetworkRequest(android.app.PendingIntent p0) throws android.os.RemoteException;
    public android.net.NetworkRequest listenForNetwork(android.net.NetworkCapabilities p0, android.os.Messenger p1, android.os.IBinder p2) throws android.os.RemoteException;
    public void pendingListenForNetwork(android.net.NetworkCapabilities p0, android.app.PendingIntent p1) throws android.os.RemoteException;
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
    public void getLatestTetheringEntitlementResult(int p0, android.os.ResultReceiver p1, boolean p2, java.lang.String p3) throws android.os.RemoteException;
    public void registerTetheringEventCallback(android.net.ITetheringEventCallback p0, java.lang.String p1) throws android.os.RemoteException;
    public void unregisterTetheringEventCallback(android.net.ITetheringEventCallback p0, java.lang.String p1) throws android.os.RemoteException;
    public android.os.IBinder startOrGetTestNetworkService() throws android.os.RemoteException;

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
        static final int TRANSACTION_tether = 20;
        static final int TRANSACTION_untether = 21;
        static final int TRANSACTION_getLastTetherError = 22;
        static final int TRANSACTION_isTetheringSupported = 23;
        static final int TRANSACTION_startTethering = 24;
        static final int TRANSACTION_stopTethering = 25;
        static final int TRANSACTION_getTetherableIfaces = 26;
        static final int TRANSACTION_getTetheredIfaces = 27;
        static final int TRANSACTION_getTetheringErroredIfaces = 28;
        static final int TRANSACTION_getTetheredDhcpRanges = 29;
        static final int TRANSACTION_getTetherableUsbRegexs = 30;
        static final int TRANSACTION_getTetherableWifiRegexs = 31;
        static final int TRANSACTION_getTetherableBluetoothRegexs = 32;
        static final int TRANSACTION_setUsbTethering = 33;
        static final int TRANSACTION_reportInetCondition = 34;
        static final int TRANSACTION_reportNetworkConnectivity = 35;
        static final int TRANSACTION_getGlobalProxy = 36;
        static final int TRANSACTION_setGlobalProxy = 37;
        static final int TRANSACTION_getProxyForNetwork = 38;
        static final int TRANSACTION_prepareVpn = 39;
        static final int TRANSACTION_setVpnPackageAuthorization = 40;
        static final int TRANSACTION_establishVpn = 41;
        static final int TRANSACTION_getVpnConfig = 42;
        static final int TRANSACTION_startLegacyVpn = 43;
        static final int TRANSACTION_getLegacyVpnInfo = 44;
        static final int TRANSACTION_updateLockdownVpn = 45;
        static final int TRANSACTION_isAlwaysOnVpnPackageSupported = 46;
        static final int TRANSACTION_setAlwaysOnVpnPackage = 47;
        static final int TRANSACTION_getAlwaysOnVpnPackage = 48;
        static final int TRANSACTION_isVpnLockdownEnabled = 49;
        static final int TRANSACTION_getVpnLockdownWhitelist = 50;
        static final int TRANSACTION_checkMobileProvisioning = 51;
        static final int TRANSACTION_getMobileProvisioningUrl = 52;
        static final int TRANSACTION_setProvisioningNotificationVisible = 53;
        static final int TRANSACTION_setAirplaneMode = 54;
        static final int TRANSACTION_registerNetworkFactory = 55;
        static final int TRANSACTION_requestBandwidthUpdate = 56;
        static final int TRANSACTION_unregisterNetworkFactory = 57;
        static final int TRANSACTION_registerNetworkAgent = 58;
        static final int TRANSACTION_requestNetwork = 59;
        static final int TRANSACTION_pendingRequestForNetwork = 60;
        static final int TRANSACTION_releasePendingNetworkRequest = 61;
        static final int TRANSACTION_listenForNetwork = 62;
        static final int TRANSACTION_pendingListenForNetwork = 63;
        static final int TRANSACTION_releaseNetworkRequest = 64;
        static final int TRANSACTION_setAcceptUnvalidated = 65;
        static final int TRANSACTION_setAcceptPartialConnectivity = 66;
        static final int TRANSACTION_setAvoidUnvalidated = 67;
        static final int TRANSACTION_startCaptivePortalApp = 68;
        static final int TRANSACTION_startCaptivePortalAppInternal = 69;
        static final int TRANSACTION_shouldAvoidBadWifi = 70;
        static final int TRANSACTION_getMultipathPreference = 71;
        static final int TRANSACTION_getDefaultRequest = 72;
        static final int TRANSACTION_getRestoreDefaultNetworkDelay = 73;
        static final int TRANSACTION_addVpnAddress = 74;
        static final int TRANSACTION_removeVpnAddress = 75;
        static final int TRANSACTION_setUnderlyingNetworksForVpn = 76;
        static final int TRANSACTION_factoryReset = 77;
        static final int TRANSACTION_startNattKeepalive = 78;
        static final int TRANSACTION_startNattKeepaliveWithFd = 79;
        static final int TRANSACTION_startTcpKeepalive = 80;
        static final int TRANSACTION_stopKeepalive = 81;
        static final int TRANSACTION_getCaptivePortalServerUrl = 82;
        static final int TRANSACTION_getNetworkWatchlistConfigHash = 83;
        static final int TRANSACTION_getConnectionOwnerUid = 84;
        static final int TRANSACTION_isCallerCurrentAlwaysOnVpnApp = 85;
        static final int TRANSACTION_isCallerCurrentAlwaysOnVpnLockdownApp = 86;
        static final int TRANSACTION_getLatestTetheringEntitlementResult = 87;
        static final int TRANSACTION_registerTetheringEventCallback = 88;
        static final int TRANSACTION_unregisterTetheringEventCallback = 89;
        static final int TRANSACTION_startOrGetTestNetworkService = 90;
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
            public android.net.NetworkCapabilities[] getDefaultNetworkCapabilitiesForUser(int p0) throws android.os.RemoteException { return null; }
            public boolean isNetworkSupported(int p0) throws android.os.RemoteException { return false; }
            public android.net.LinkProperties getActiveLinkProperties() throws android.os.RemoteException { return null; }
            public android.net.LinkProperties getLinkPropertiesForType(int p0) throws android.os.RemoteException { return null; }
            public android.net.LinkProperties getLinkProperties(android.net.Network p0) throws android.os.RemoteException { return null; }
            public android.net.NetworkCapabilities getNetworkCapabilities(android.net.Network p0) throws android.os.RemoteException { return null; }
            public android.net.NetworkState[] getAllNetworkState() throws android.os.RemoteException { return null; }
            public android.net.NetworkQuotaInfo getActiveNetworkQuotaInfo() throws android.os.RemoteException { return null; }
            public boolean isActiveNetworkMetered() throws android.os.RemoteException { return false; }
            public boolean requestRouteToHostAddress(int p0, byte[] p1) throws android.os.RemoteException { return false; }
            public int tether(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int untether(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int getLastTetherError(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public boolean isTetheringSupported(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void startTethering(int p0, android.os.ResultReceiver p1, boolean p2, java.lang.String p3) throws android.os.RemoteException {}
            public void stopTethering(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public java.lang.String[] getTetherableIfaces() throws android.os.RemoteException { return null; }
            public java.lang.String[] getTetheredIfaces() throws android.os.RemoteException { return null; }
            public java.lang.String[] getTetheringErroredIfaces() throws android.os.RemoteException { return null; }
            public java.lang.String[] getTetheredDhcpRanges() throws android.os.RemoteException { return null; }
            public java.lang.String[] getTetherableUsbRegexs() throws android.os.RemoteException { return null; }
            public java.lang.String[] getTetherableWifiRegexs() throws android.os.RemoteException { return null; }
            public java.lang.String[] getTetherableBluetoothRegexs() throws android.os.RemoteException { return null; }
            public int setUsbTethering(boolean p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void reportInetCondition(int p0, int p1) throws android.os.RemoteException {}
            public void reportNetworkConnectivity(android.net.Network p0, boolean p1) throws android.os.RemoteException {}
            public android.net.ProxyInfo getGlobalProxy() throws android.os.RemoteException { return null; }
            public void setGlobalProxy(android.net.ProxyInfo p0) throws android.os.RemoteException {}
            public android.net.ProxyInfo getProxyForNetwork(android.net.Network p0) throws android.os.RemoteException { return null; }
            public boolean prepareVpn(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public void setVpnPackageAuthorization(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public android.os.ParcelFileDescriptor establishVpn(com.android.internal.net.VpnConfig p0) throws android.os.RemoteException { return null; }
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
            public int registerNetworkFactory(android.os.Messenger p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public boolean requestBandwidthUpdate(android.net.Network p0) throws android.os.RemoteException { return false; }
            public void unregisterNetworkFactory(android.os.Messenger p0) throws android.os.RemoteException {}
            public int registerNetworkAgent(android.os.Messenger p0, android.net.NetworkInfo p1, android.net.LinkProperties p2, android.net.NetworkCapabilities p3, int p4, android.net.NetworkMisc p5, int p6) throws android.os.RemoteException { return 0; }
            public android.net.NetworkRequest requestNetwork(android.net.NetworkCapabilities p0, android.os.Messenger p1, int p2, android.os.IBinder p3, int p4) throws android.os.RemoteException { return null; }
            public android.net.NetworkRequest pendingRequestForNetwork(android.net.NetworkCapabilities p0, android.app.PendingIntent p1) throws android.os.RemoteException { return null; }
            public void releasePendingNetworkRequest(android.app.PendingIntent p0) throws android.os.RemoteException {}
            public android.net.NetworkRequest listenForNetwork(android.net.NetworkCapabilities p0, android.os.Messenger p1, android.os.IBinder p2) throws android.os.RemoteException { return null; }
            public void pendingListenForNetwork(android.net.NetworkCapabilities p0, android.app.PendingIntent p1) throws android.os.RemoteException {}
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
            public void getLatestTetheringEntitlementResult(int p0, android.os.ResultReceiver p1, boolean p2, java.lang.String p3) throws android.os.RemoteException {}
            public void registerTetheringEventCallback(android.net.ITetheringEventCallback p0, java.lang.String p1) throws android.os.RemoteException {}
            public void unregisterTetheringEventCallback(android.net.ITetheringEventCallback p0, java.lang.String p1) throws android.os.RemoteException {}
            public android.os.IBinder startOrGetTestNetworkService() throws android.os.RemoteException { return null; }
        }
    }

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
        public android.net.NetworkCapabilities[] getDefaultNetworkCapabilitiesForUser(int p0) throws android.os.RemoteException { return null; }
        public boolean isNetworkSupported(int p0) throws android.os.RemoteException { return false; }
        public android.net.LinkProperties getActiveLinkProperties() throws android.os.RemoteException { return null; }
        public android.net.LinkProperties getLinkPropertiesForType(int p0) throws android.os.RemoteException { return null; }
        public android.net.LinkProperties getLinkProperties(android.net.Network p0) throws android.os.RemoteException { return null; }
        public android.net.NetworkCapabilities getNetworkCapabilities(android.net.Network p0) throws android.os.RemoteException { return null; }
        public android.net.NetworkState[] getAllNetworkState() throws android.os.RemoteException { return null; }
        public android.net.NetworkQuotaInfo getActiveNetworkQuotaInfo() throws android.os.RemoteException { return null; }
        public boolean isActiveNetworkMetered() throws android.os.RemoteException { return false; }
        public boolean requestRouteToHostAddress(int p0, byte[] p1) throws android.os.RemoteException { return false; }
        public int tether(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int untether(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int getLastTetherError(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public boolean isTetheringSupported(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void startTethering(int p0, android.os.ResultReceiver p1, boolean p2, java.lang.String p3) throws android.os.RemoteException {}
        public void stopTethering(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public java.lang.String[] getTetherableIfaces() throws android.os.RemoteException { return null; }
        public java.lang.String[] getTetheredIfaces() throws android.os.RemoteException { return null; }
        public java.lang.String[] getTetheringErroredIfaces() throws android.os.RemoteException { return null; }
        public java.lang.String[] getTetheredDhcpRanges() throws android.os.RemoteException { return null; }
        public java.lang.String[] getTetherableUsbRegexs() throws android.os.RemoteException { return null; }
        public java.lang.String[] getTetherableWifiRegexs() throws android.os.RemoteException { return null; }
        public java.lang.String[] getTetherableBluetoothRegexs() throws android.os.RemoteException { return null; }
        public int setUsbTethering(boolean p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void reportInetCondition(int p0, int p1) throws android.os.RemoteException {}
        public void reportNetworkConnectivity(android.net.Network p0, boolean p1) throws android.os.RemoteException {}
        public android.net.ProxyInfo getGlobalProxy() throws android.os.RemoteException { return null; }
        public void setGlobalProxy(android.net.ProxyInfo p0) throws android.os.RemoteException {}
        public android.net.ProxyInfo getProxyForNetwork(android.net.Network p0) throws android.os.RemoteException { return null; }
        public boolean prepareVpn(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public void setVpnPackageAuthorization(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public android.os.ParcelFileDescriptor establishVpn(com.android.internal.net.VpnConfig p0) throws android.os.RemoteException { return null; }
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
        public int registerNetworkFactory(android.os.Messenger p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public boolean requestBandwidthUpdate(android.net.Network p0) throws android.os.RemoteException { return false; }
        public void unregisterNetworkFactory(android.os.Messenger p0) throws android.os.RemoteException {}
        public int registerNetworkAgent(android.os.Messenger p0, android.net.NetworkInfo p1, android.net.LinkProperties p2, android.net.NetworkCapabilities p3, int p4, android.net.NetworkMisc p5, int p6) throws android.os.RemoteException { return 0; }
        public android.net.NetworkRequest requestNetwork(android.net.NetworkCapabilities p0, android.os.Messenger p1, int p2, android.os.IBinder p3, int p4) throws android.os.RemoteException { return null; }
        public android.net.NetworkRequest pendingRequestForNetwork(android.net.NetworkCapabilities p0, android.app.PendingIntent p1) throws android.os.RemoteException { return null; }
        public void releasePendingNetworkRequest(android.app.PendingIntent p0) throws android.os.RemoteException {}
        public android.net.NetworkRequest listenForNetwork(android.net.NetworkCapabilities p0, android.os.Messenger p1, android.os.IBinder p2) throws android.os.RemoteException { return null; }
        public void pendingListenForNetwork(android.net.NetworkCapabilities p0, android.app.PendingIntent p1) throws android.os.RemoteException {}
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
        public void getLatestTetheringEntitlementResult(int p0, android.os.ResultReceiver p1, boolean p2, java.lang.String p3) throws android.os.RemoteException {}
        public void registerTetheringEventCallback(android.net.ITetheringEventCallback p0, java.lang.String p1) throws android.os.RemoteException {}
        public void unregisterTetheringEventCallback(android.net.ITetheringEventCallback p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.os.IBinder startOrGetTestNetworkService() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }
}
