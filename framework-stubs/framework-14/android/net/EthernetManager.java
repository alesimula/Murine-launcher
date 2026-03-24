package android.net;

public class EthernetManager {
    public static final int ETHERNET_STATE_DISABLED = 0;
    public static final int ETHERNET_STATE_ENABLED = 1;
    public static final int ROLE_CLIENT = 1;
    public static final int ROLE_NONE = 0;
    public static final int ROLE_SERVER = 2;
    public static final int STATE_ABSENT = 0;
    public static final int STATE_LINK_DOWN = 1;
    public static final int STATE_LINK_UP = 2;
    EthernetManager() {}
    public void addInterfaceStateListener(java.util.concurrent.Executor p0, android.net.EthernetManager.InterfaceStateListener p1) {}
    public void removeInterfaceStateListener(android.net.EthernetManager.InterfaceStateListener p0) {}
    public void setIncludeTestInterfaces(boolean p0) {}
    @android.annotation.NonNull
    public android.net.EthernetManager.TetheredInterfaceRequest requestTetheredInterface(java.util.concurrent.Executor p0, android.net.EthernetManager.TetheredInterfaceCallback p1) { return null; }
    public void updateConfiguration(java.lang.String p0, android.net.EthernetNetworkUpdateRequest p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<java.lang.String, android.net.EthernetNetworkManagementException> p3) {}
    public void enableInterface(java.lang.String p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.String, android.net.EthernetNetworkManagementException> p2) {}
    public void disableInterface(java.lang.String p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.String, android.net.EthernetNetworkManagementException> p2) {}
    public void setEthernetEnabled(boolean p0) {}
    public void addEthernetStateListener(java.util.concurrent.Executor p0, java.util.function.IntConsumer p1) {}
    public void removeEthernetStateListener(java.util.function.IntConsumer p0) {}
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getInterfaceList() { return null; }

    public static interface InterfaceStateListener {
        public void onInterfaceStateChanged(java.lang.String p0, int p1, int p2, android.net.IpConfiguration p3);
    }

    public static interface TetheredInterfaceCallback {
        public void onAvailable(java.lang.String p0);
        public void onUnavailable();
    }

    public static class TetheredInterfaceRequest {
        TetheredInterfaceRequest() {}
        public void release() {}
    }
}
