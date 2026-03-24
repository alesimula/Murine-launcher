package android.net.lowpan;

public class LowpanInterface {
    public static final java.lang.String ROLE_DETACHED = "detached";
    public static final java.lang.String ROLE_END_DEVICE = "end-device";
    public static final java.lang.String ROLE_ROUTER = "router";
    public static final java.lang.String ROLE_SLEEPY_END_DEVICE = "sleepy-end-device";
    public static final java.lang.String ROLE_SLEEPY_ROUTER = "sleepy-router";
    public static final java.lang.String ROLE_LEADER = "leader";
    public static final java.lang.String ROLE_COORDINATOR = "coordinator";
    public static final java.lang.String STATE_OFFLINE = "offline";
    public static final java.lang.String STATE_COMMISSIONING = "commissioning";
    public static final java.lang.String STATE_ATTACHING = "attaching";
    public static final java.lang.String STATE_ATTACHED = "attached";
    public static final java.lang.String STATE_FAULT = "fault";
    public static final java.lang.String NETWORK_TYPE_THREAD_V1 = "org.threadgroup.thread.v1";
    public static final java.lang.String EMPTY_PARTITION_ID = "";
    public LowpanInterface(android.content.Context p0, android.net.lowpan.ILowpanInterface p1, android.os.Looper p2) {}
    public android.net.lowpan.ILowpanInterface getService() { return null; }
    public void form(android.net.lowpan.LowpanProvision p0) throws android.net.lowpan.LowpanException {}
    public void join(android.net.lowpan.LowpanProvision p0) throws android.net.lowpan.LowpanException {}
    public void attach(android.net.lowpan.LowpanProvision p0) throws android.net.lowpan.LowpanException {}
    public void leave() throws android.net.lowpan.LowpanException {}
    public android.net.lowpan.LowpanCommissioningSession startCommissioningSession(android.net.lowpan.LowpanBeaconInfo p0) throws android.net.lowpan.LowpanException { return null; }
    public void reset() throws android.net.lowpan.LowpanException {}
    public java.lang.String getName() { return null; }
    public boolean isEnabled() { return false; }
    public void setEnabled(boolean p0) throws android.net.lowpan.LowpanException {}
    public boolean isUp() { return false; }
    public boolean isConnected() { return false; }
    public boolean isCommissioned() { return false; }
    public java.lang.String getState() { return null; }
    public java.lang.String getPartitionId() { return null; }
    public android.net.lowpan.LowpanIdentity getLowpanIdentity() { return null; }
    public java.lang.String getRole() { return null; }
    public android.net.lowpan.LowpanCredential getLowpanCredential() { return null; }
    public java.lang.String[] getSupportedNetworkTypes() throws android.net.lowpan.LowpanException { return null; }
    public android.net.lowpan.LowpanChannelInfo[] getSupportedChannels() throws android.net.lowpan.LowpanException { return null; }
    public void registerCallback(android.net.lowpan.LowpanInterface.Callback p0, android.os.Handler p1) {}
    public void registerCallback(android.net.lowpan.LowpanInterface.Callback p0) {}
    public void unregisterCallback(android.net.lowpan.LowpanInterface.Callback p0) {}
    public android.net.lowpan.LowpanScanner createScanner() { return null; }
    public android.net.LinkAddress[] getLinkAddresses() throws android.net.lowpan.LowpanException { return null; }
    public android.net.IpPrefix[] getLinkNetworks() throws android.net.lowpan.LowpanException { return null; }
    public void addOnMeshPrefix(android.net.IpPrefix p0, int p1) throws android.net.lowpan.LowpanException {}
    public void removeOnMeshPrefix(android.net.IpPrefix p0) {}
    public void addExternalRoute(android.net.IpPrefix p0, int p1) throws android.net.lowpan.LowpanException {}
    public void removeExternalRoute(android.net.IpPrefix p0) {}

    public static abstract class Callback {
        public Callback() {}
        public void onConnectedChanged(boolean p0) {}
        public void onEnabledChanged(boolean p0) {}
        public void onUpChanged(boolean p0) {}
        public void onRoleChanged(java.lang.String p0) {}
        public void onStateChanged(java.lang.String p0) {}
        public void onLowpanIdentityChanged(android.net.lowpan.LowpanIdentity p0) {}
        public void onLinkNetworkAdded(android.net.IpPrefix p0) {}
        public void onLinkNetworkRemoved(android.net.IpPrefix p0) {}
        public void onLinkAddressAdded(android.net.LinkAddress p0) {}
        public void onLinkAddressRemoved(android.net.LinkAddress p0) {}
    }
}
