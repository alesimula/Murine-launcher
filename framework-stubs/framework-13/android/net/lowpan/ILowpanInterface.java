package android.net.lowpan;

public interface ILowpanInterface extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.lowpan.ILowpanInterface";
    public static final java.lang.String PERM_ACCESS_LOWPAN_STATE = "android.permission.ACCESS_LOWPAN_STATE";
    public static final java.lang.String PERM_CHANGE_LOWPAN_STATE = "android.permission.CHANGE_LOWPAN_STATE";
    public static final java.lang.String PERM_READ_LOWPAN_CREDENTIAL = "android.permission.READ_LOWPAN_CREDENTIAL";
    public static final java.lang.String KEY_CHANNEL_MASK = "android.net.lowpan.property.CHANNEL_MASK";
    public static final java.lang.String KEY_MAX_TX_POWER = "android.net.lowpan.property.MAX_TX_POWER";
    public static final java.lang.String STATE_OFFLINE = "offline";
    public static final java.lang.String STATE_COMMISSIONING = "commissioning";
    public static final java.lang.String STATE_ATTACHING = "attaching";
    public static final java.lang.String STATE_ATTACHED = "attached";
    public static final java.lang.String STATE_FAULT = "fault";
    public static final java.lang.String ROLE_END_DEVICE = "end-device";
    public static final java.lang.String ROLE_ROUTER = "router";
    public static final java.lang.String ROLE_SLEEPY_END_DEVICE = "sleepy-end-device";
    public static final java.lang.String ROLE_SLEEPY_ROUTER = "sleepy-router";
    public static final java.lang.String ROLE_LEADER = "leader";
    public static final java.lang.String ROLE_COORDINATOR = "coordinator";
    public static final java.lang.String ROLE_DETACHED = "detached";
    public static final java.lang.String NETWORK_TYPE_UNKNOWN = "unknown";
    public static final java.lang.String NETWORK_TYPE_THREAD_V1 = "org.threadgroup.thread.v1";
    public static final int ERROR_UNSPECIFIED = 1;
    public static final int ERROR_INVALID_ARGUMENT = 2;
    public static final int ERROR_DISABLED = 3;
    public static final int ERROR_WRONG_STATE = 4;
    public static final int ERROR_TIMEOUT = 5;
    public static final int ERROR_IO_FAILURE = 6;
    public static final int ERROR_NCP_PROBLEM = 7;
    public static final int ERROR_BUSY = 8;
    public static final int ERROR_ALREADY = 9;
    public static final int ERROR_CANCELED = 10;
    public static final int ERROR_FEATURE_NOT_SUPPORTED = 11;
    public static final int ERROR_JOIN_FAILED_UNKNOWN = 12;
    public static final int ERROR_JOIN_FAILED_AT_SCAN = 13;
    public static final int ERROR_JOIN_FAILED_AT_AUTH = 14;
    public static final int ERROR_FORM_FAILED_AT_SCAN = 15;
    public java.lang.String getName() throws android.os.RemoteException;
    public java.lang.String getNcpVersion() throws android.os.RemoteException;
    public java.lang.String getDriverVersion() throws android.os.RemoteException;
    public android.net.lowpan.LowpanChannelInfo[] getSupportedChannels() throws android.os.RemoteException;
    public java.lang.String[] getSupportedNetworkTypes() throws android.os.RemoteException;
    public byte[] getMacAddress() throws android.os.RemoteException;
    public boolean isEnabled() throws android.os.RemoteException;
    public void setEnabled(boolean p0) throws android.os.RemoteException;
    public boolean isUp() throws android.os.RemoteException;
    public boolean isCommissioned() throws android.os.RemoteException;
    public boolean isConnected() throws android.os.RemoteException;
    public java.lang.String getState() throws android.os.RemoteException;
    public java.lang.String getRole() throws android.os.RemoteException;
    public java.lang.String getPartitionId() throws android.os.RemoteException;
    public byte[] getExtendedAddress() throws android.os.RemoteException;
    public android.net.lowpan.LowpanIdentity getLowpanIdentity() throws android.os.RemoteException;
    public android.net.lowpan.LowpanCredential getLowpanCredential() throws android.os.RemoteException;
    public java.lang.String[] getLinkAddresses() throws android.os.RemoteException;
    public android.net.IpPrefix[] getLinkNetworks() throws android.os.RemoteException;
    public void join(android.net.lowpan.LowpanProvision p0) throws android.os.RemoteException;
    public void form(android.net.lowpan.LowpanProvision p0) throws android.os.RemoteException;
    public void attach(android.net.lowpan.LowpanProvision p0) throws android.os.RemoteException;
    public void leave() throws android.os.RemoteException;
    public void reset() throws android.os.RemoteException;
    public void startCommissioningSession(android.net.lowpan.LowpanBeaconInfo p0) throws android.os.RemoteException;
    public void closeCommissioningSession() throws android.os.RemoteException;
    public void sendToCommissioner(byte[] p0) throws android.os.RemoteException;
    public void beginLowPower() throws android.os.RemoteException;
    public void pollForData() throws android.os.RemoteException;
    public void onHostWake() throws android.os.RemoteException;
    public void addListener(android.net.lowpan.ILowpanInterfaceListener p0) throws android.os.RemoteException;
    public void removeListener(android.net.lowpan.ILowpanInterfaceListener p0) throws android.os.RemoteException;
    public void startNetScan(java.util.Map p0, android.net.lowpan.ILowpanNetScanCallback p1) throws android.os.RemoteException;
    public void stopNetScan() throws android.os.RemoteException;
    public void startEnergyScan(java.util.Map p0, android.net.lowpan.ILowpanEnergyScanCallback p1) throws android.os.RemoteException;
    public void stopEnergyScan() throws android.os.RemoteException;
    public void addOnMeshPrefix(android.net.IpPrefix p0, int p1) throws android.os.RemoteException;
    public void removeOnMeshPrefix(android.net.IpPrefix p0) throws android.os.RemoteException;
    public void addExternalRoute(android.net.IpPrefix p0, int p1) throws android.os.RemoteException;
    public void removeExternalRoute(android.net.IpPrefix p0) throws android.os.RemoteException;

    public static class Default implements android.net.lowpan.ILowpanInterface {
        public Default() {}
        public java.lang.String getName() throws android.os.RemoteException { return null; }
        public java.lang.String getNcpVersion() throws android.os.RemoteException { return null; }
        public java.lang.String getDriverVersion() throws android.os.RemoteException { return null; }
        public android.net.lowpan.LowpanChannelInfo[] getSupportedChannels() throws android.os.RemoteException { return null; }
        public java.lang.String[] getSupportedNetworkTypes() throws android.os.RemoteException { return null; }
        public byte[] getMacAddress() throws android.os.RemoteException { return null; }
        public boolean isEnabled() throws android.os.RemoteException { return false; }
        public void setEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean isUp() throws android.os.RemoteException { return false; }
        public boolean isCommissioned() throws android.os.RemoteException { return false; }
        public boolean isConnected() throws android.os.RemoteException { return false; }
        public java.lang.String getState() throws android.os.RemoteException { return null; }
        public java.lang.String getRole() throws android.os.RemoteException { return null; }
        public java.lang.String getPartitionId() throws android.os.RemoteException { return null; }
        public byte[] getExtendedAddress() throws android.os.RemoteException { return null; }
        public android.net.lowpan.LowpanIdentity getLowpanIdentity() throws android.os.RemoteException { return null; }
        public android.net.lowpan.LowpanCredential getLowpanCredential() throws android.os.RemoteException { return null; }
        public java.lang.String[] getLinkAddresses() throws android.os.RemoteException { return null; }
        public android.net.IpPrefix[] getLinkNetworks() throws android.os.RemoteException { return null; }
        public void join(android.net.lowpan.LowpanProvision p0) throws android.os.RemoteException {}
        public void form(android.net.lowpan.LowpanProvision p0) throws android.os.RemoteException {}
        public void attach(android.net.lowpan.LowpanProvision p0) throws android.os.RemoteException {}
        public void leave() throws android.os.RemoteException {}
        public void reset() throws android.os.RemoteException {}
        public void startCommissioningSession(android.net.lowpan.LowpanBeaconInfo p0) throws android.os.RemoteException {}
        public void closeCommissioningSession() throws android.os.RemoteException {}
        public void sendToCommissioner(byte[] p0) throws android.os.RemoteException {}
        public void beginLowPower() throws android.os.RemoteException {}
        public void pollForData() throws android.os.RemoteException {}
        public void onHostWake() throws android.os.RemoteException {}
        public void addListener(android.net.lowpan.ILowpanInterfaceListener p0) throws android.os.RemoteException {}
        public void removeListener(android.net.lowpan.ILowpanInterfaceListener p0) throws android.os.RemoteException {}
        public void startNetScan(java.util.Map p0, android.net.lowpan.ILowpanNetScanCallback p1) throws android.os.RemoteException {}
        public void stopNetScan() throws android.os.RemoteException {}
        public void startEnergyScan(java.util.Map p0, android.net.lowpan.ILowpanEnergyScanCallback p1) throws android.os.RemoteException {}
        public void stopEnergyScan() throws android.os.RemoteException {}
        public void addOnMeshPrefix(android.net.IpPrefix p0, int p1) throws android.os.RemoteException {}
        public void removeOnMeshPrefix(android.net.IpPrefix p0) throws android.os.RemoteException {}
        public void addExternalRoute(android.net.IpPrefix p0, int p1) throws android.os.RemoteException {}
        public void removeExternalRoute(android.net.IpPrefix p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.lowpan.ILowpanInterface {
        static final int TRANSACTION_getName = 1;
        static final int TRANSACTION_getNcpVersion = 2;
        static final int TRANSACTION_getDriverVersion = 3;
        static final int TRANSACTION_getSupportedChannels = 4;
        static final int TRANSACTION_getSupportedNetworkTypes = 5;
        static final int TRANSACTION_getMacAddress = 6;
        static final int TRANSACTION_isEnabled = 7;
        static final int TRANSACTION_setEnabled = 8;
        static final int TRANSACTION_isUp = 9;
        static final int TRANSACTION_isCommissioned = 10;
        static final int TRANSACTION_isConnected = 11;
        static final int TRANSACTION_getState = 12;
        static final int TRANSACTION_getRole = 13;
        static final int TRANSACTION_getPartitionId = 14;
        static final int TRANSACTION_getExtendedAddress = 15;
        static final int TRANSACTION_getLowpanIdentity = 16;
        static final int TRANSACTION_getLowpanCredential = 17;
        static final int TRANSACTION_getLinkAddresses = 18;
        static final int TRANSACTION_getLinkNetworks = 19;
        static final int TRANSACTION_join = 20;
        static final int TRANSACTION_form = 21;
        static final int TRANSACTION_attach = 22;
        static final int TRANSACTION_leave = 23;
        static final int TRANSACTION_reset = 24;
        static final int TRANSACTION_startCommissioningSession = 25;
        static final int TRANSACTION_closeCommissioningSession = 26;
        static final int TRANSACTION_sendToCommissioner = 27;
        static final int TRANSACTION_beginLowPower = 28;
        static final int TRANSACTION_pollForData = 29;
        static final int TRANSACTION_onHostWake = 30;
        static final int TRANSACTION_addListener = 31;
        static final int TRANSACTION_removeListener = 32;
        static final int TRANSACTION_startNetScan = 33;
        static final int TRANSACTION_stopNetScan = 34;
        static final int TRANSACTION_startEnergyScan = 35;
        static final int TRANSACTION_stopEnergyScan = 36;
        static final int TRANSACTION_addOnMeshPrefix = 37;
        static final int TRANSACTION_removeOnMeshPrefix = 38;
        static final int TRANSACTION_addExternalRoute = 39;
        static final int TRANSACTION_removeExternalRoute = 40;
        public Stub() { super(); }
        public static android.net.lowpan.ILowpanInterface asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.net.lowpan.ILowpanInterface {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getName() throws android.os.RemoteException { return null; }
            public java.lang.String getNcpVersion() throws android.os.RemoteException { return null; }
            public java.lang.String getDriverVersion() throws android.os.RemoteException { return null; }
            public android.net.lowpan.LowpanChannelInfo[] getSupportedChannels() throws android.os.RemoteException { return null; }
            public java.lang.String[] getSupportedNetworkTypes() throws android.os.RemoteException { return null; }
            public byte[] getMacAddress() throws android.os.RemoteException { return null; }
            public boolean isEnabled() throws android.os.RemoteException { return false; }
            public void setEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean isUp() throws android.os.RemoteException { return false; }
            public boolean isCommissioned() throws android.os.RemoteException { return false; }
            public boolean isConnected() throws android.os.RemoteException { return false; }
            public java.lang.String getState() throws android.os.RemoteException { return null; }
            public java.lang.String getRole() throws android.os.RemoteException { return null; }
            public java.lang.String getPartitionId() throws android.os.RemoteException { return null; }
            public byte[] getExtendedAddress() throws android.os.RemoteException { return null; }
            public android.net.lowpan.LowpanIdentity getLowpanIdentity() throws android.os.RemoteException { return null; }
            public android.net.lowpan.LowpanCredential getLowpanCredential() throws android.os.RemoteException { return null; }
            public java.lang.String[] getLinkAddresses() throws android.os.RemoteException { return null; }
            public android.net.IpPrefix[] getLinkNetworks() throws android.os.RemoteException { return null; }
            public void join(android.net.lowpan.LowpanProvision p0) throws android.os.RemoteException {}
            public void form(android.net.lowpan.LowpanProvision p0) throws android.os.RemoteException {}
            public void attach(android.net.lowpan.LowpanProvision p0) throws android.os.RemoteException {}
            public void leave() throws android.os.RemoteException {}
            public void reset() throws android.os.RemoteException {}
            public void startCommissioningSession(android.net.lowpan.LowpanBeaconInfo p0) throws android.os.RemoteException {}
            public void closeCommissioningSession() throws android.os.RemoteException {}
            public void sendToCommissioner(byte[] p0) throws android.os.RemoteException {}
            public void beginLowPower() throws android.os.RemoteException {}
            public void pollForData() throws android.os.RemoteException {}
            public void onHostWake() throws android.os.RemoteException {}
            public void addListener(android.net.lowpan.ILowpanInterfaceListener p0) throws android.os.RemoteException {}
            public void removeListener(android.net.lowpan.ILowpanInterfaceListener p0) throws android.os.RemoteException {}
            public void startNetScan(java.util.Map p0, android.net.lowpan.ILowpanNetScanCallback p1) throws android.os.RemoteException {}
            public void stopNetScan() throws android.os.RemoteException {}
            public void startEnergyScan(java.util.Map p0, android.net.lowpan.ILowpanEnergyScanCallback p1) throws android.os.RemoteException {}
            public void stopEnergyScan() throws android.os.RemoteException {}
            public void addOnMeshPrefix(android.net.IpPrefix p0, int p1) throws android.os.RemoteException {}
            public void removeOnMeshPrefix(android.net.IpPrefix p0) throws android.os.RemoteException {}
            public void addExternalRoute(android.net.IpPrefix p0, int p1) throws android.os.RemoteException {}
            public void removeExternalRoute(android.net.IpPrefix p0) throws android.os.RemoteException {}
        }
    }
}
