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
    @android.annotation.EnforcePermission("android.permission.SHUTDOWN")
    public void shutdown() throws android.os.RemoteException;
    public boolean getIpForwardingEnabled() throws android.os.RemoteException;
    public void setIpForwardingEnabled(boolean p0) throws android.os.RemoteException;
    public void startTethering(java.lang.String[] p0) throws android.os.RemoteException;
    public void stopTethering() throws android.os.RemoteException;
    public boolean isTetheringStarted() throws android.os.RemoteException;
    public void tetherInterface(java.lang.String p0) throws android.os.RemoteException;
    public void untetherInterface(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String[] listTetheredInterfaces() throws android.os.RemoteException;
    public void enableNat(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void disableNat(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void setInterfaceQuota(java.lang.String p0, long p1) throws android.os.RemoteException;
    public void removeInterfaceQuota(java.lang.String p0) throws android.os.RemoteException;
    public void setInterfaceAlert(java.lang.String p0, long p1) throws android.os.RemoteException;
    public void removeInterfaceAlert(java.lang.String p0) throws android.os.RemoteException;
    public void setUidOnMeteredNetworkDenylist(int p0, boolean p1) throws android.os.RemoteException;
    public void setUidOnMeteredNetworkAllowlist(int p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.NETWORK_SETTINGS")
    public boolean setDataSaverModeEnabled(boolean p0) throws android.os.RemoteException;
    public void setUidCleartextNetworkPolicy(int p0, int p1) throws android.os.RemoteException;
    public boolean isBandwidthControlEnabled() throws android.os.RemoteException;
    public void setFirewallEnabled(boolean p0) throws android.os.RemoteException;
    public boolean isFirewallEnabled() throws android.os.RemoteException;
    public void setFirewallUidRule(int p0, int p1, int p2) throws android.os.RemoteException;
    public void setFirewallUidRules(int p0, int[] p1, int[] p2) throws android.os.RemoteException;
    public void setFirewallChainEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public void allowProtect(int p0) throws android.os.RemoteException;
    public void denyProtect(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.OBSERVE_NETWORK_POLICY")
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
        public void shutdown() throws android.os.RemoteException {}
        public boolean getIpForwardingEnabled() throws android.os.RemoteException { return false; }
        public void setIpForwardingEnabled(boolean p0) throws android.os.RemoteException {}
        public void startTethering(java.lang.String[] p0) throws android.os.RemoteException {}
        public void stopTethering() throws android.os.RemoteException {}
        public boolean isTetheringStarted() throws android.os.RemoteException { return false; }
        public void tetherInterface(java.lang.String p0) throws android.os.RemoteException {}
        public void untetherInterface(java.lang.String p0) throws android.os.RemoteException {}
        public java.lang.String[] listTetheredInterfaces() throws android.os.RemoteException { return null; }
        public void enableNat(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void disableNat(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setInterfaceQuota(java.lang.String p0, long p1) throws android.os.RemoteException {}
        public void removeInterfaceQuota(java.lang.String p0) throws android.os.RemoteException {}
        public void setInterfaceAlert(java.lang.String p0, long p1) throws android.os.RemoteException {}
        public void removeInterfaceAlert(java.lang.String p0) throws android.os.RemoteException {}
        public void setUidOnMeteredNetworkDenylist(int p0, boolean p1) throws android.os.RemoteException {}
        public void setUidOnMeteredNetworkAllowlist(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean setDataSaverModeEnabled(boolean p0) throws android.os.RemoteException { return false; }
        public void setUidCleartextNetworkPolicy(int p0, int p1) throws android.os.RemoteException {}
        public boolean isBandwidthControlEnabled() throws android.os.RemoteException { return false; }
        public void setFirewallEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean isFirewallEnabled() throws android.os.RemoteException { return false; }
        public void setFirewallUidRule(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void setFirewallUidRules(int p0, int[] p1, int[] p2) throws android.os.RemoteException {}
        public void setFirewallChainEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public void allowProtect(int p0) throws android.os.RemoteException {}
        public void denyProtect(int p0) throws android.os.RemoteException {}
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
        static final int TRANSACTION_shutdown = 13;
        static final int TRANSACTION_getIpForwardingEnabled = 14;
        static final int TRANSACTION_setIpForwardingEnabled = 15;
        static final int TRANSACTION_startTethering = 16;
        static final int TRANSACTION_stopTethering = 17;
        static final int TRANSACTION_isTetheringStarted = 18;
        static final int TRANSACTION_tetherInterface = 19;
        static final int TRANSACTION_untetherInterface = 20;
        static final int TRANSACTION_listTetheredInterfaces = 21;
        static final int TRANSACTION_enableNat = 22;
        static final int TRANSACTION_disableNat = 23;
        static final int TRANSACTION_setInterfaceQuota = 24;
        static final int TRANSACTION_removeInterfaceQuota = 25;
        static final int TRANSACTION_setInterfaceAlert = 26;
        static final int TRANSACTION_removeInterfaceAlert = 27;
        static final int TRANSACTION_setUidOnMeteredNetworkDenylist = 28;
        static final int TRANSACTION_setUidOnMeteredNetworkAllowlist = 29;
        static final int TRANSACTION_setDataSaverModeEnabled = 30;
        static final int TRANSACTION_setUidCleartextNetworkPolicy = 31;
        static final int TRANSACTION_isBandwidthControlEnabled = 32;
        static final int TRANSACTION_setFirewallEnabled = 33;
        static final int TRANSACTION_isFirewallEnabled = 34;
        static final int TRANSACTION_setFirewallUidRule = 35;
        static final int TRANSACTION_setFirewallUidRules = 36;
        static final int TRANSACTION_setFirewallChainEnabled = 37;
        static final int TRANSACTION_allowProtect = 38;
        static final int TRANSACTION_denyProtect = 39;
        static final int TRANSACTION_isNetworkRestricted = 40;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.os.INetworkManagementService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void shutdown_enforcePermission() throws java.lang.SecurityException {}
        protected void setDataSaverModeEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void isNetworkRestricted_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.INetworkManagementService {
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
            public void shutdown() throws android.os.RemoteException {}
            public boolean getIpForwardingEnabled() throws android.os.RemoteException { return false; }
            public void setIpForwardingEnabled(boolean p0) throws android.os.RemoteException {}
            public void startTethering(java.lang.String[] p0) throws android.os.RemoteException {}
            public void stopTethering() throws android.os.RemoteException {}
            public boolean isTetheringStarted() throws android.os.RemoteException { return false; }
            public void tetherInterface(java.lang.String p0) throws android.os.RemoteException {}
            public void untetherInterface(java.lang.String p0) throws android.os.RemoteException {}
            public java.lang.String[] listTetheredInterfaces() throws android.os.RemoteException { return null; }
            public void enableNat(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void disableNat(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setInterfaceQuota(java.lang.String p0, long p1) throws android.os.RemoteException {}
            public void removeInterfaceQuota(java.lang.String p0) throws android.os.RemoteException {}
            public void setInterfaceAlert(java.lang.String p0, long p1) throws android.os.RemoteException {}
            public void removeInterfaceAlert(java.lang.String p0) throws android.os.RemoteException {}
            public void setUidOnMeteredNetworkDenylist(int p0, boolean p1) throws android.os.RemoteException {}
            public void setUidOnMeteredNetworkAllowlist(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean setDataSaverModeEnabled(boolean p0) throws android.os.RemoteException { return false; }
            public void setUidCleartextNetworkPolicy(int p0, int p1) throws android.os.RemoteException {}
            public boolean isBandwidthControlEnabled() throws android.os.RemoteException { return false; }
            public void setFirewallEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean isFirewallEnabled() throws android.os.RemoteException { return false; }
            public void setFirewallUidRule(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void setFirewallUidRules(int p0, int[] p1, int[] p2) throws android.os.RemoteException {}
            public void setFirewallChainEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public void allowProtect(int p0) throws android.os.RemoteException {}
            public void denyProtect(int p0) throws android.os.RemoteException {}
            public boolean isNetworkRestricted(int p0) throws android.os.RemoteException { return false; }
        }
    }
}
