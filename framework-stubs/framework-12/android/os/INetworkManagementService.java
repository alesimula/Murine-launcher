package android.os;

public interface INetworkManagementService extends android.os.IInterface {
    public void registerObserver(android.net.INetworkManagementEventObserver p0) throws android.os.RemoteException;
    public void unregisterObserver(android.net.INetworkManagementEventObserver p0) throws android.os.RemoteException;
    public java.lang.String[] listInterfaces() throws android.os.RemoteException;
    public android.net.InterfaceConfiguration getInterfaceConfig(java.lang.String p0) throws android.os.RemoteException;
    public void setInterfaceConfig(java.lang.String p0, android.net.InterfaceConfiguration p1) throws android.os.RemoteException;
    public void clearInterfaceAddresses(java.lang.String p0) throws android.os.RemoteException;
    public void setInterfaceDown(java.lang.String p0) throws android.os.RemoteException;
    public void setInterfaceUp(java.lang.String p0) throws android.os.RemoteException;
    public void setInterfaceIpv6PrivacyExtensions(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void disableIpv6(java.lang.String p0) throws android.os.RemoteException;
    public void enableIpv6(java.lang.String p0) throws android.os.RemoteException;
    public void setIPv6AddrGenMode(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void addRoute(int p0, android.net.RouteInfo p1) throws android.os.RemoteException;
    public void removeRoute(int p0, android.net.RouteInfo p1) throws android.os.RemoteException;
    public void shutdown() throws android.os.RemoteException;
    public boolean getIpForwardingEnabled() throws android.os.RemoteException;
    public void setIpForwardingEnabled(boolean p0) throws android.os.RemoteException;
    public void startTethering(java.lang.String[] p0) throws android.os.RemoteException;
    public void startTetheringWithConfiguration(boolean p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void stopTethering() throws android.os.RemoteException;
    public boolean isTetheringStarted() throws android.os.RemoteException;
    public void tetherInterface(java.lang.String p0) throws android.os.RemoteException;
    public void untetherInterface(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String[] listTetheredInterfaces() throws android.os.RemoteException;
    public java.lang.String[] getDnsForwarders() throws android.os.RemoteException;
    public void startInterfaceForwarding(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void stopInterfaceForwarding(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void enableNat(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void disableNat(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void registerTetheringStatsProvider(android.net.ITetheringStatsProvider p0, java.lang.String p1) throws android.os.RemoteException;
    public void unregisterTetheringStatsProvider(android.net.ITetheringStatsProvider p0) throws android.os.RemoteException;
    public void tetherLimitReached(android.net.ITetheringStatsProvider p0) throws android.os.RemoteException;
    public android.net.NetworkStats getNetworkStatsTethering(int p0) throws android.os.RemoteException;
    public void setInterfaceQuota(java.lang.String p0, long p1) throws android.os.RemoteException;
    public void removeInterfaceQuota(java.lang.String p0) throws android.os.RemoteException;
    public void setInterfaceAlert(java.lang.String p0, long p1) throws android.os.RemoteException;
    public void removeInterfaceAlert(java.lang.String p0) throws android.os.RemoteException;
    public void setGlobalAlert(long p0) throws android.os.RemoteException;
    public void setUidOnMeteredNetworkDenylist(int p0, boolean p1) throws android.os.RemoteException;
    public void setUidOnMeteredNetworkAllowlist(int p0, boolean p1) throws android.os.RemoteException;
    public boolean setDataSaverModeEnabled(boolean p0) throws android.os.RemoteException;
    public void setUidCleartextNetworkPolicy(int p0, int p1) throws android.os.RemoteException;
    public boolean isBandwidthControlEnabled() throws android.os.RemoteException;
    public void setFirewallEnabled(boolean p0) throws android.os.RemoteException;
    public boolean isFirewallEnabled() throws android.os.RemoteException;
    public void setFirewallInterfaceRule(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void setFirewallUidRule(int p0, int p1, int p2) throws android.os.RemoteException;
    public void setFirewallUidRules(int p0, int[] p1, int[] p2) throws android.os.RemoteException;
    public void setFirewallChainEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public void allowProtect(int p0) throws android.os.RemoteException;
    public void denyProtect(int p0) throws android.os.RemoteException;
    public void addInterfaceToLocalNetwork(java.lang.String p0, java.util.List<android.net.RouteInfo> p1) throws android.os.RemoteException;
    public void removeInterfaceFromLocalNetwork(java.lang.String p0) throws android.os.RemoteException;
    public int removeRoutesFromLocalNetwork(java.util.List<android.net.RouteInfo> p0) throws android.os.RemoteException;
    public boolean isNetworkRestricted(int p0) throws android.os.RemoteException;

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
        public void shutdown() throws android.os.RemoteException {}
        public boolean getIpForwardingEnabled() throws android.os.RemoteException { return false; }
        public void setIpForwardingEnabled(boolean p0) throws android.os.RemoteException {}
        public void startTethering(java.lang.String[] p0) throws android.os.RemoteException {}
        public void startTetheringWithConfiguration(boolean p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void stopTethering() throws android.os.RemoteException {}
        public boolean isTetheringStarted() throws android.os.RemoteException { return false; }
        public void tetherInterface(java.lang.String p0) throws android.os.RemoteException {}
        public void untetherInterface(java.lang.String p0) throws android.os.RemoteException {}
        public java.lang.String[] listTetheredInterfaces() throws android.os.RemoteException { return null; }
        public java.lang.String[] getDnsForwarders() throws android.os.RemoteException { return null; }
        public void startInterfaceForwarding(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void stopInterfaceForwarding(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void enableNat(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void disableNat(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void registerTetheringStatsProvider(android.net.ITetheringStatsProvider p0, java.lang.String p1) throws android.os.RemoteException {}
        public void unregisterTetheringStatsProvider(android.net.ITetheringStatsProvider p0) throws android.os.RemoteException {}
        public void tetherLimitReached(android.net.ITetheringStatsProvider p0) throws android.os.RemoteException {}
        public android.net.NetworkStats getNetworkStatsTethering(int p0) throws android.os.RemoteException { return null; }
        public void setInterfaceQuota(java.lang.String p0, long p1) throws android.os.RemoteException {}
        public void removeInterfaceQuota(java.lang.String p0) throws android.os.RemoteException {}
        public void setInterfaceAlert(java.lang.String p0, long p1) throws android.os.RemoteException {}
        public void removeInterfaceAlert(java.lang.String p0) throws android.os.RemoteException {}
        public void setGlobalAlert(long p0) throws android.os.RemoteException {}
        public void setUidOnMeteredNetworkDenylist(int p0, boolean p1) throws android.os.RemoteException {}
        public void setUidOnMeteredNetworkAllowlist(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean setDataSaverModeEnabled(boolean p0) throws android.os.RemoteException { return false; }
        public void setUidCleartextNetworkPolicy(int p0, int p1) throws android.os.RemoteException {}
        public boolean isBandwidthControlEnabled() throws android.os.RemoteException { return false; }
        public void setFirewallEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean isFirewallEnabled() throws android.os.RemoteException { return false; }
        public void setFirewallInterfaceRule(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void setFirewallUidRule(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void setFirewallUidRules(int p0, int[] p1, int[] p2) throws android.os.RemoteException {}
        public void setFirewallChainEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public void allowProtect(int p0) throws android.os.RemoteException {}
        public void denyProtect(int p0) throws android.os.RemoteException {}
        public void addInterfaceToLocalNetwork(java.lang.String p0, java.util.List<android.net.RouteInfo> p1) throws android.os.RemoteException {}
        public void removeInterfaceFromLocalNetwork(java.lang.String p0) throws android.os.RemoteException {}
        public int removeRoutesFromLocalNetwork(java.util.List<android.net.RouteInfo> p0) throws android.os.RemoteException { return 0; }
        public boolean isNetworkRestricted(int p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.INetworkManagementService {
        public static final java.lang.String DESCRIPTOR = "android.os.INetworkManagementService";
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
        static final int TRANSACTION_shutdown = 15;
        static final int TRANSACTION_getIpForwardingEnabled = 16;
        static final int TRANSACTION_setIpForwardingEnabled = 17;
        static final int TRANSACTION_startTethering = 18;
        static final int TRANSACTION_startTetheringWithConfiguration = 19;
        static final int TRANSACTION_stopTethering = 20;
        static final int TRANSACTION_isTetheringStarted = 21;
        static final int TRANSACTION_tetherInterface = 22;
        static final int TRANSACTION_untetherInterface = 23;
        static final int TRANSACTION_listTetheredInterfaces = 24;
        static final int TRANSACTION_getDnsForwarders = 25;
        static final int TRANSACTION_startInterfaceForwarding = 26;
        static final int TRANSACTION_stopInterfaceForwarding = 27;
        static final int TRANSACTION_enableNat = 28;
        static final int TRANSACTION_disableNat = 29;
        static final int TRANSACTION_registerTetheringStatsProvider = 30;
        static final int TRANSACTION_unregisterTetheringStatsProvider = 31;
        static final int TRANSACTION_tetherLimitReached = 32;
        static final int TRANSACTION_getNetworkStatsTethering = 33;
        static final int TRANSACTION_setInterfaceQuota = 34;
        static final int TRANSACTION_removeInterfaceQuota = 35;
        static final int TRANSACTION_setInterfaceAlert = 36;
        static final int TRANSACTION_removeInterfaceAlert = 37;
        static final int TRANSACTION_setGlobalAlert = 38;
        static final int TRANSACTION_setUidOnMeteredNetworkDenylist = 39;
        static final int TRANSACTION_setUidOnMeteredNetworkAllowlist = 40;
        static final int TRANSACTION_setDataSaverModeEnabled = 41;
        static final int TRANSACTION_setUidCleartextNetworkPolicy = 42;
        static final int TRANSACTION_isBandwidthControlEnabled = 43;
        static final int TRANSACTION_setFirewallEnabled = 44;
        static final int TRANSACTION_isFirewallEnabled = 45;
        static final int TRANSACTION_setFirewallInterfaceRule = 46;
        static final int TRANSACTION_setFirewallUidRule = 47;
        static final int TRANSACTION_setFirewallUidRules = 48;
        static final int TRANSACTION_setFirewallChainEnabled = 49;
        static final int TRANSACTION_allowProtect = 50;
        static final int TRANSACTION_denyProtect = 51;
        static final int TRANSACTION_addInterfaceToLocalNetwork = 52;
        static final int TRANSACTION_removeInterfaceFromLocalNetwork = 53;
        static final int TRANSACTION_removeRoutesFromLocalNetwork = 54;
        static final int TRANSACTION_isNetworkRestricted = 55;
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
            public void shutdown() throws android.os.RemoteException {}
            public boolean getIpForwardingEnabled() throws android.os.RemoteException { return false; }
            public void setIpForwardingEnabled(boolean p0) throws android.os.RemoteException {}
            public void startTethering(java.lang.String[] p0) throws android.os.RemoteException {}
            public void startTetheringWithConfiguration(boolean p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void stopTethering() throws android.os.RemoteException {}
            public boolean isTetheringStarted() throws android.os.RemoteException { return false; }
            public void tetherInterface(java.lang.String p0) throws android.os.RemoteException {}
            public void untetherInterface(java.lang.String p0) throws android.os.RemoteException {}
            public java.lang.String[] listTetheredInterfaces() throws android.os.RemoteException { return null; }
            public java.lang.String[] getDnsForwarders() throws android.os.RemoteException { return null; }
            public void startInterfaceForwarding(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void stopInterfaceForwarding(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void enableNat(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void disableNat(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void registerTetheringStatsProvider(android.net.ITetheringStatsProvider p0, java.lang.String p1) throws android.os.RemoteException {}
            public void unregisterTetheringStatsProvider(android.net.ITetheringStatsProvider p0) throws android.os.RemoteException {}
            public void tetherLimitReached(android.net.ITetheringStatsProvider p0) throws android.os.RemoteException {}
            public android.net.NetworkStats getNetworkStatsTethering(int p0) throws android.os.RemoteException { return null; }
            public void setInterfaceQuota(java.lang.String p0, long p1) throws android.os.RemoteException {}
            public void removeInterfaceQuota(java.lang.String p0) throws android.os.RemoteException {}
            public void setInterfaceAlert(java.lang.String p0, long p1) throws android.os.RemoteException {}
            public void removeInterfaceAlert(java.lang.String p0) throws android.os.RemoteException {}
            public void setGlobalAlert(long p0) throws android.os.RemoteException {}
            public void setUidOnMeteredNetworkDenylist(int p0, boolean p1) throws android.os.RemoteException {}
            public void setUidOnMeteredNetworkAllowlist(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean setDataSaverModeEnabled(boolean p0) throws android.os.RemoteException { return false; }
            public void setUidCleartextNetworkPolicy(int p0, int p1) throws android.os.RemoteException {}
            public boolean isBandwidthControlEnabled() throws android.os.RemoteException { return false; }
            public void setFirewallEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean isFirewallEnabled() throws android.os.RemoteException { return false; }
            public void setFirewallInterfaceRule(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void setFirewallUidRule(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void setFirewallUidRules(int p0, int[] p1, int[] p2) throws android.os.RemoteException {}
            public void setFirewallChainEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public void allowProtect(int p0) throws android.os.RemoteException {}
            public void denyProtect(int p0) throws android.os.RemoteException {}
            public void addInterfaceToLocalNetwork(java.lang.String p0, java.util.List<android.net.RouteInfo> p1) throws android.os.RemoteException {}
            public void removeInterfaceFromLocalNetwork(java.lang.String p0) throws android.os.RemoteException {}
            public int removeRoutesFromLocalNetwork(java.util.List<android.net.RouteInfo> p0) throws android.os.RemoteException { return 0; }
            public boolean isNetworkRestricted(int p0) throws android.os.RemoteException { return false; }
        }
    }
}
