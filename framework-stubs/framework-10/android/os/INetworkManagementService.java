package android.os;

public interface INetworkManagementService extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public void registerObserver(android.net.INetworkManagementEventObserver p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void unregisterObserver(android.net.INetworkManagementEventObserver p0) throws android.os.RemoteException;
    public java.lang.String[] listInterfaces() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.net.InterfaceConfiguration getInterfaceConfig(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setInterfaceConfig(java.lang.String p0, android.net.InterfaceConfiguration p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void clearInterfaceAddresses(java.lang.String p0) throws android.os.RemoteException;
    public void setInterfaceDown(java.lang.String p0) throws android.os.RemoteException;
    public void setInterfaceUp(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setInterfaceIpv6PrivacyExtensions(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void disableIpv6(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void enableIpv6(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setIPv6AddrGenMode(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void addRoute(int p0, android.net.RouteInfo p1) throws android.os.RemoteException;
    public void removeRoute(int p0, android.net.RouteInfo p1) throws android.os.RemoteException;
    public void setMtu(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void shutdown() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean getIpForwardingEnabled() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setIpForwardingEnabled(boolean p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void startTethering(java.lang.String[] p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void stopTethering() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean isTetheringStarted() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void tetherInterface(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void untetherInterface(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String[] listTetheredInterfaces() throws android.os.RemoteException;
    public void setDnsForwarders(android.net.Network p0, java.lang.String[] p1) throws android.os.RemoteException;
    public java.lang.String[] getDnsForwarders() throws android.os.RemoteException;
    public void startInterfaceForwarding(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void stopInterfaceForwarding(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void enableNat(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void disableNat(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void registerTetheringStatsProvider(android.net.ITetheringStatsProvider p0, java.lang.String p1) throws android.os.RemoteException;
    public void unregisterTetheringStatsProvider(android.net.ITetheringStatsProvider p0) throws android.os.RemoteException;
    public void tetherLimitReached(android.net.ITetheringStatsProvider p0) throws android.os.RemoteException;
    public android.net.NetworkStats getNetworkStatsSummaryDev() throws android.os.RemoteException;
    public android.net.NetworkStats getNetworkStatsSummaryXt() throws android.os.RemoteException;
    public android.net.NetworkStats getNetworkStatsDetail() throws android.os.RemoteException;
    public android.net.NetworkStats getNetworkStatsUidDetail(int p0, java.lang.String[] p1) throws android.os.RemoteException;
    public android.net.NetworkStats getNetworkStatsTethering(int p0) throws android.os.RemoteException;
    public void setInterfaceQuota(java.lang.String p0, long p1) throws android.os.RemoteException;
    public void removeInterfaceQuota(java.lang.String p0) throws android.os.RemoteException;
    public void setInterfaceAlert(java.lang.String p0, long p1) throws android.os.RemoteException;
    public void removeInterfaceAlert(java.lang.String p0) throws android.os.RemoteException;
    public void setGlobalAlert(long p0) throws android.os.RemoteException;
    public void setUidMeteredNetworkBlacklist(int p0, boolean p1) throws android.os.RemoteException;
    public void setUidMeteredNetworkWhitelist(int p0, boolean p1) throws android.os.RemoteException;
    public boolean setDataSaverModeEnabled(boolean p0) throws android.os.RemoteException;
    public void setUidCleartextNetworkPolicy(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean isBandwidthControlEnabled() throws android.os.RemoteException;
    public void addIdleTimer(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void removeIdleTimer(java.lang.String p0) throws android.os.RemoteException;
    public void setFirewallEnabled(boolean p0) throws android.os.RemoteException;
    public boolean isFirewallEnabled() throws android.os.RemoteException;
    public void setFirewallInterfaceRule(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void setFirewallUidRule(int p0, int p1, int p2) throws android.os.RemoteException;
    public void setFirewallUidRules(int p0, int[] p1, int[] p2) throws android.os.RemoteException;
    public void setFirewallChainEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public void addVpnUidRanges(int p0, android.net.UidRange[] p1) throws android.os.RemoteException;
    public void removeVpnUidRanges(int p0, android.net.UidRange[] p1) throws android.os.RemoteException;
    public void registerNetworkActivityListener(android.os.INetworkActivityListener p0) throws android.os.RemoteException;
    public void unregisterNetworkActivityListener(android.os.INetworkActivityListener p0) throws android.os.RemoteException;
    public boolean isNetworkActive() throws android.os.RemoteException;
    public void addInterfaceToNetwork(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void removeInterfaceFromNetwork(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void addLegacyRouteForNetId(int p0, android.net.RouteInfo p1, int p2) throws android.os.RemoteException;
    public void setDefaultNetId(int p0) throws android.os.RemoteException;
    public void clearDefaultNetId() throws android.os.RemoteException;
    public void setNetworkPermission(int p0, int p1) throws android.os.RemoteException;
    public void allowProtect(int p0) throws android.os.RemoteException;
    public void denyProtect(int p0) throws android.os.RemoteException;
    public void addInterfaceToLocalNetwork(java.lang.String p0, java.util.List<android.net.RouteInfo> p1) throws android.os.RemoteException;
    public void removeInterfaceFromLocalNetwork(java.lang.String p0) throws android.os.RemoteException;
    public int removeRoutesFromLocalNetwork(java.util.List<android.net.RouteInfo> p0) throws android.os.RemoteException;
    public void setAllowOnlyVpnForUids(boolean p0, android.net.UidRange[] p1) throws android.os.RemoteException;
    public boolean isNetworkRestricted(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.os.INetworkManagementService {
        private static final java.lang.String DESCRIPTOR = "android.os.INetworkManagementService";
        static final int TRANSACTION_registerObserver = 1;
        static final int TRANSACTION_unregisterObserver = 2;
        static final int TRANSACTION_listInterfaces = 3;
        static final int TRANSACTION_getInterfaceConfig = 4;
        static final int TRANSACTION_setInterfaceConfig = 5;
        static final int TRANSACTION_clearInterfaceAddresses = 6;
        static final int TRANSACTION_setInterfaceDown = 7;
        static final int TRANSACTION_setInterfaceUp = 8;
        static final int TRANSACTION_setInterfaceIpv6PrivacyExtensions = 9;
        static final int TRANSACTION_disableIpv6 = 10;
        static final int TRANSACTION_enableIpv6 = 11;
        static final int TRANSACTION_setIPv6AddrGenMode = 12;
        static final int TRANSACTION_addRoute = 13;
        static final int TRANSACTION_removeRoute = 14;
        static final int TRANSACTION_setMtu = 15;
        static final int TRANSACTION_shutdown = 16;
        static final int TRANSACTION_getIpForwardingEnabled = 17;
        static final int TRANSACTION_setIpForwardingEnabled = 18;
        static final int TRANSACTION_startTethering = 19;
        static final int TRANSACTION_stopTethering = 20;
        static final int TRANSACTION_isTetheringStarted = 21;
        static final int TRANSACTION_tetherInterface = 22;
        static final int TRANSACTION_untetherInterface = 23;
        static final int TRANSACTION_listTetheredInterfaces = 24;
        static final int TRANSACTION_setDnsForwarders = 25;
        static final int TRANSACTION_getDnsForwarders = 26;
        static final int TRANSACTION_startInterfaceForwarding = 27;
        static final int TRANSACTION_stopInterfaceForwarding = 28;
        static final int TRANSACTION_enableNat = 29;
        static final int TRANSACTION_disableNat = 30;
        static final int TRANSACTION_registerTetheringStatsProvider = 31;
        static final int TRANSACTION_unregisterTetheringStatsProvider = 32;
        static final int TRANSACTION_tetherLimitReached = 33;
        static final int TRANSACTION_getNetworkStatsSummaryDev = 34;
        static final int TRANSACTION_getNetworkStatsSummaryXt = 35;
        static final int TRANSACTION_getNetworkStatsDetail = 36;
        static final int TRANSACTION_getNetworkStatsUidDetail = 37;
        static final int TRANSACTION_getNetworkStatsTethering = 38;
        static final int TRANSACTION_setInterfaceQuota = 39;
        static final int TRANSACTION_removeInterfaceQuota = 40;
        static final int TRANSACTION_setInterfaceAlert = 41;
        static final int TRANSACTION_removeInterfaceAlert = 42;
        static final int TRANSACTION_setGlobalAlert = 43;
        static final int TRANSACTION_setUidMeteredNetworkBlacklist = 44;
        static final int TRANSACTION_setUidMeteredNetworkWhitelist = 45;
        static final int TRANSACTION_setDataSaverModeEnabled = 46;
        static final int TRANSACTION_setUidCleartextNetworkPolicy = 47;
        static final int TRANSACTION_isBandwidthControlEnabled = 48;
        static final int TRANSACTION_addIdleTimer = 49;
        static final int TRANSACTION_removeIdleTimer = 50;
        static final int TRANSACTION_setFirewallEnabled = 51;
        static final int TRANSACTION_isFirewallEnabled = 52;
        static final int TRANSACTION_setFirewallInterfaceRule = 53;
        static final int TRANSACTION_setFirewallUidRule = 54;
        static final int TRANSACTION_setFirewallUidRules = 55;
        static final int TRANSACTION_setFirewallChainEnabled = 56;
        static final int TRANSACTION_addVpnUidRanges = 57;
        static final int TRANSACTION_removeVpnUidRanges = 58;
        static final int TRANSACTION_registerNetworkActivityListener = 59;
        static final int TRANSACTION_unregisterNetworkActivityListener = 60;
        static final int TRANSACTION_isNetworkActive = 61;
        static final int TRANSACTION_addInterfaceToNetwork = 62;
        static final int TRANSACTION_removeInterfaceFromNetwork = 63;
        static final int TRANSACTION_addLegacyRouteForNetId = 64;
        static final int TRANSACTION_setDefaultNetId = 65;
        static final int TRANSACTION_clearDefaultNetId = 66;
        static final int TRANSACTION_setNetworkPermission = 67;
        static final int TRANSACTION_allowProtect = 68;
        static final int TRANSACTION_denyProtect = 69;
        static final int TRANSACTION_addInterfaceToLocalNetwork = 70;
        static final int TRANSACTION_removeInterfaceFromLocalNetwork = 71;
        static final int TRANSACTION_removeRoutesFromLocalNetwork = 72;
        static final int TRANSACTION_setAllowOnlyVpnForUids = 73;
        static final int TRANSACTION_isNetworkRestricted = 74;
        public Stub() { super(); }
        public static android.os.INetworkManagementService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.INetworkManagementService p0) { return false; }
        public static android.os.INetworkManagementService getDefaultImpl() { return null; }

        private static class Proxy implements android.os.INetworkManagementService {
            private android.os.IBinder mRemote;
            public static android.os.INetworkManagementService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerObserver(android.net.INetworkManagementEventObserver p0) throws android.os.RemoteException {}
            public void unregisterObserver(android.net.INetworkManagementEventObserver p0) throws android.os.RemoteException {}
            public java.lang.String[] listInterfaces() throws android.os.RemoteException { return null; }
            public android.net.InterfaceConfiguration getInterfaceConfig(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void setInterfaceConfig(java.lang.String p0, android.net.InterfaceConfiguration p1) throws android.os.RemoteException {}
            public void clearInterfaceAddresses(java.lang.String p0) throws android.os.RemoteException {}
            public void setInterfaceDown(java.lang.String p0) throws android.os.RemoteException {}
            public void setInterfaceUp(java.lang.String p0) throws android.os.RemoteException {}
            public void setInterfaceIpv6PrivacyExtensions(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void disableIpv6(java.lang.String p0) throws android.os.RemoteException {}
            public void enableIpv6(java.lang.String p0) throws android.os.RemoteException {}
            public void setIPv6AddrGenMode(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void addRoute(int p0, android.net.RouteInfo p1) throws android.os.RemoteException {}
            public void removeRoute(int p0, android.net.RouteInfo p1) throws android.os.RemoteException {}
            public void setMtu(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void shutdown() throws android.os.RemoteException {}
            public boolean getIpForwardingEnabled() throws android.os.RemoteException { return false; }
            public void setIpForwardingEnabled(boolean p0) throws android.os.RemoteException {}
            public void startTethering(java.lang.String[] p0) throws android.os.RemoteException {}
            public void stopTethering() throws android.os.RemoteException {}
            public boolean isTetheringStarted() throws android.os.RemoteException { return false; }
            public void tetherInterface(java.lang.String p0) throws android.os.RemoteException {}
            public void untetherInterface(java.lang.String p0) throws android.os.RemoteException {}
            public java.lang.String[] listTetheredInterfaces() throws android.os.RemoteException { return null; }
            public void setDnsForwarders(android.net.Network p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public java.lang.String[] getDnsForwarders() throws android.os.RemoteException { return null; }
            public void startInterfaceForwarding(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void stopInterfaceForwarding(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void enableNat(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void disableNat(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void registerTetheringStatsProvider(android.net.ITetheringStatsProvider p0, java.lang.String p1) throws android.os.RemoteException {}
            public void unregisterTetheringStatsProvider(android.net.ITetheringStatsProvider p0) throws android.os.RemoteException {}
            public void tetherLimitReached(android.net.ITetheringStatsProvider p0) throws android.os.RemoteException {}
            public android.net.NetworkStats getNetworkStatsSummaryDev() throws android.os.RemoteException { return null; }
            public android.net.NetworkStats getNetworkStatsSummaryXt() throws android.os.RemoteException { return null; }
            public android.net.NetworkStats getNetworkStatsDetail() throws android.os.RemoteException { return null; }
            public android.net.NetworkStats getNetworkStatsUidDetail(int p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
            public android.net.NetworkStats getNetworkStatsTethering(int p0) throws android.os.RemoteException { return null; }
            public void setInterfaceQuota(java.lang.String p0, long p1) throws android.os.RemoteException {}
            public void removeInterfaceQuota(java.lang.String p0) throws android.os.RemoteException {}
            public void setInterfaceAlert(java.lang.String p0, long p1) throws android.os.RemoteException {}
            public void removeInterfaceAlert(java.lang.String p0) throws android.os.RemoteException {}
            public void setGlobalAlert(long p0) throws android.os.RemoteException {}
            public void setUidMeteredNetworkBlacklist(int p0, boolean p1) throws android.os.RemoteException {}
            public void setUidMeteredNetworkWhitelist(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean setDataSaverModeEnabled(boolean p0) throws android.os.RemoteException { return false; }
            public void setUidCleartextNetworkPolicy(int p0, int p1) throws android.os.RemoteException {}
            public boolean isBandwidthControlEnabled() throws android.os.RemoteException { return false; }
            public void addIdleTimer(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void removeIdleTimer(java.lang.String p0) throws android.os.RemoteException {}
            public void setFirewallEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean isFirewallEnabled() throws android.os.RemoteException { return false; }
            public void setFirewallInterfaceRule(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void setFirewallUidRule(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void setFirewallUidRules(int p0, int[] p1, int[] p2) throws android.os.RemoteException {}
            public void setFirewallChainEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public void addVpnUidRanges(int p0, android.net.UidRange[] p1) throws android.os.RemoteException {}
            public void removeVpnUidRanges(int p0, android.net.UidRange[] p1) throws android.os.RemoteException {}
            public void registerNetworkActivityListener(android.os.INetworkActivityListener p0) throws android.os.RemoteException {}
            public void unregisterNetworkActivityListener(android.os.INetworkActivityListener p0) throws android.os.RemoteException {}
            public boolean isNetworkActive() throws android.os.RemoteException { return false; }
            public void addInterfaceToNetwork(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void removeInterfaceFromNetwork(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void addLegacyRouteForNetId(int p0, android.net.RouteInfo p1, int p2) throws android.os.RemoteException {}
            public void setDefaultNetId(int p0) throws android.os.RemoteException {}
            public void clearDefaultNetId() throws android.os.RemoteException {}
            public void setNetworkPermission(int p0, int p1) throws android.os.RemoteException {}
            public void allowProtect(int p0) throws android.os.RemoteException {}
            public void denyProtect(int p0) throws android.os.RemoteException {}
            public void addInterfaceToLocalNetwork(java.lang.String p0, java.util.List<android.net.RouteInfo> p1) throws android.os.RemoteException {}
            public void removeInterfaceFromLocalNetwork(java.lang.String p0) throws android.os.RemoteException {}
            public int removeRoutesFromLocalNetwork(java.util.List<android.net.RouteInfo> p0) throws android.os.RemoteException { return 0; }
            public void setAllowOnlyVpnForUids(boolean p0, android.net.UidRange[] p1) throws android.os.RemoteException {}
            public boolean isNetworkRestricted(int p0) throws android.os.RemoteException { return false; }
        }
    }

    public static class Default implements android.os.INetworkManagementService {
        public Default() {}
        public void registerObserver(android.net.INetworkManagementEventObserver p0) throws android.os.RemoteException {}
        public void unregisterObserver(android.net.INetworkManagementEventObserver p0) throws android.os.RemoteException {}
        public java.lang.String[] listInterfaces() throws android.os.RemoteException { return null; }
        public android.net.InterfaceConfiguration getInterfaceConfig(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void setInterfaceConfig(java.lang.String p0, android.net.InterfaceConfiguration p1) throws android.os.RemoteException {}
        public void clearInterfaceAddresses(java.lang.String p0) throws android.os.RemoteException {}
        public void setInterfaceDown(java.lang.String p0) throws android.os.RemoteException {}
        public void setInterfaceUp(java.lang.String p0) throws android.os.RemoteException {}
        public void setInterfaceIpv6PrivacyExtensions(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void disableIpv6(java.lang.String p0) throws android.os.RemoteException {}
        public void enableIpv6(java.lang.String p0) throws android.os.RemoteException {}
        public void setIPv6AddrGenMode(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void addRoute(int p0, android.net.RouteInfo p1) throws android.os.RemoteException {}
        public void removeRoute(int p0, android.net.RouteInfo p1) throws android.os.RemoteException {}
        public void setMtu(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void shutdown() throws android.os.RemoteException {}
        public boolean getIpForwardingEnabled() throws android.os.RemoteException { return false; }
        public void setIpForwardingEnabled(boolean p0) throws android.os.RemoteException {}
        public void startTethering(java.lang.String[] p0) throws android.os.RemoteException {}
        public void stopTethering() throws android.os.RemoteException {}
        public boolean isTetheringStarted() throws android.os.RemoteException { return false; }
        public void tetherInterface(java.lang.String p0) throws android.os.RemoteException {}
        public void untetherInterface(java.lang.String p0) throws android.os.RemoteException {}
        public java.lang.String[] listTetheredInterfaces() throws android.os.RemoteException { return null; }
        public void setDnsForwarders(android.net.Network p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public java.lang.String[] getDnsForwarders() throws android.os.RemoteException { return null; }
        public void startInterfaceForwarding(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void stopInterfaceForwarding(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void enableNat(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void disableNat(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void registerTetheringStatsProvider(android.net.ITetheringStatsProvider p0, java.lang.String p1) throws android.os.RemoteException {}
        public void unregisterTetheringStatsProvider(android.net.ITetheringStatsProvider p0) throws android.os.RemoteException {}
        public void tetherLimitReached(android.net.ITetheringStatsProvider p0) throws android.os.RemoteException {}
        public android.net.NetworkStats getNetworkStatsSummaryDev() throws android.os.RemoteException { return null; }
        public android.net.NetworkStats getNetworkStatsSummaryXt() throws android.os.RemoteException { return null; }
        public android.net.NetworkStats getNetworkStatsDetail() throws android.os.RemoteException { return null; }
        public android.net.NetworkStats getNetworkStatsUidDetail(int p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
        public android.net.NetworkStats getNetworkStatsTethering(int p0) throws android.os.RemoteException { return null; }
        public void setInterfaceQuota(java.lang.String p0, long p1) throws android.os.RemoteException {}
        public void removeInterfaceQuota(java.lang.String p0) throws android.os.RemoteException {}
        public void setInterfaceAlert(java.lang.String p0, long p1) throws android.os.RemoteException {}
        public void removeInterfaceAlert(java.lang.String p0) throws android.os.RemoteException {}
        public void setGlobalAlert(long p0) throws android.os.RemoteException {}
        public void setUidMeteredNetworkBlacklist(int p0, boolean p1) throws android.os.RemoteException {}
        public void setUidMeteredNetworkWhitelist(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean setDataSaverModeEnabled(boolean p0) throws android.os.RemoteException { return false; }
        public void setUidCleartextNetworkPolicy(int p0, int p1) throws android.os.RemoteException {}
        public boolean isBandwidthControlEnabled() throws android.os.RemoteException { return false; }
        public void addIdleTimer(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void removeIdleTimer(java.lang.String p0) throws android.os.RemoteException {}
        public void setFirewallEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean isFirewallEnabled() throws android.os.RemoteException { return false; }
        public void setFirewallInterfaceRule(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void setFirewallUidRule(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void setFirewallUidRules(int p0, int[] p1, int[] p2) throws android.os.RemoteException {}
        public void setFirewallChainEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public void addVpnUidRanges(int p0, android.net.UidRange[] p1) throws android.os.RemoteException {}
        public void removeVpnUidRanges(int p0, android.net.UidRange[] p1) throws android.os.RemoteException {}
        public void registerNetworkActivityListener(android.os.INetworkActivityListener p0) throws android.os.RemoteException {}
        public void unregisterNetworkActivityListener(android.os.INetworkActivityListener p0) throws android.os.RemoteException {}
        public boolean isNetworkActive() throws android.os.RemoteException { return false; }
        public void addInterfaceToNetwork(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void removeInterfaceFromNetwork(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void addLegacyRouteForNetId(int p0, android.net.RouteInfo p1, int p2) throws android.os.RemoteException {}
        public void setDefaultNetId(int p0) throws android.os.RemoteException {}
        public void clearDefaultNetId() throws android.os.RemoteException {}
        public void setNetworkPermission(int p0, int p1) throws android.os.RemoteException {}
        public void allowProtect(int p0) throws android.os.RemoteException {}
        public void denyProtect(int p0) throws android.os.RemoteException {}
        public void addInterfaceToLocalNetwork(java.lang.String p0, java.util.List<android.net.RouteInfo> p1) throws android.os.RemoteException {}
        public void removeInterfaceFromLocalNetwork(java.lang.String p0) throws android.os.RemoteException {}
        public int removeRoutesFromLocalNetwork(java.util.List<android.net.RouteInfo> p0) throws android.os.RemoteException { return 0; }
        public void setAllowOnlyVpnForUids(boolean p0, android.net.UidRange[] p1) throws android.os.RemoteException {}
        public boolean isNetworkRestricted(int p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }
}
