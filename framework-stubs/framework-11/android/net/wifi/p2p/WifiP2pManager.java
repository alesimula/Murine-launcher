package android.net.wifi.p2p;

public class WifiP2pManager {
    public static final java.lang.String ACTION_WIFI_P2P_PERSISTENT_GROUPS_CHANGED = "android.net.wifi.p2p.action.WIFI_P2P_PERSISTENT_GROUPS_CHANGED";
    public static final int BUSY = 2;
    public static final int ERROR = 0;
    public static final java.lang.String EXTRA_DISCOVERY_STATE = "discoveryState";
    public static final java.lang.String EXTRA_NETWORK_INFO = "networkInfo";
    public static final java.lang.String EXTRA_P2P_DEVICE_LIST = "wifiP2pDeviceList";
    public static final java.lang.String EXTRA_WIFI_P2P_DEVICE = "wifiP2pDevice";
    public static final java.lang.String EXTRA_WIFI_P2P_GROUP = "p2pGroupInfo";
    public static final java.lang.String EXTRA_WIFI_P2P_INFO = "wifiP2pInfo";
    public static final java.lang.String EXTRA_WIFI_STATE = "wifi_p2p_state";
    public static final int MIRACAST_DISABLED = 0;
    public static final int MIRACAST_SINK = 2;
    public static final int MIRACAST_SOURCE = 1;
    public static final int NO_SERVICE_REQUESTS = 3;
    public static final int P2P_UNSUPPORTED = 1;
    public static final java.lang.String WIFI_P2P_CONNECTION_CHANGED_ACTION = "android.net.wifi.p2p.CONNECTION_STATE_CHANGE";
    public static final java.lang.String WIFI_P2P_DISCOVERY_CHANGED_ACTION = "android.net.wifi.p2p.DISCOVERY_STATE_CHANGE";
    public static final int WIFI_P2P_DISCOVERY_STARTED = 2;
    public static final int WIFI_P2P_DISCOVERY_STOPPED = 1;
    public static final java.lang.String WIFI_P2P_PEERS_CHANGED_ACTION = "android.net.wifi.p2p.PEERS_CHANGED";
    public static final java.lang.String WIFI_P2P_STATE_CHANGED_ACTION = "android.net.wifi.p2p.STATE_CHANGED";
    public static final int WIFI_P2P_STATE_DISABLED = 1;
    public static final int WIFI_P2P_STATE_ENABLED = 2;
    public static final java.lang.String WIFI_P2P_THIS_DEVICE_CHANGED_ACTION = "android.net.wifi.p2p.THIS_DEVICE_CHANGED";
    WifiP2pManager() {}
    public android.net.wifi.p2p.WifiP2pManager.Channel initialize(android.content.Context p0, android.os.Looper p1, android.net.wifi.p2p.WifiP2pManager.ChannelListener p2) { return null; }
    public void discoverPeers(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void stopPeerDiscovery(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void connect(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pConfig p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void cancelConnect(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void createGroup(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void createGroup(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pConfig p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void removeGroup(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void startListening(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void stopListening(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void setWifiP2pChannels(android.net.wifi.p2p.WifiP2pManager.Channel p0, int p1, int p2, android.net.wifi.p2p.WifiP2pManager.ActionListener p3) {}
    public void addLocalService(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.nsd.WifiP2pServiceInfo p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void removeLocalService(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.nsd.WifiP2pServiceInfo p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void clearLocalServices(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void setServiceResponseListener(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ServiceResponseListener p1) {}
    public void setDnsSdResponseListeners(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.DnsSdServiceResponseListener p1, android.net.wifi.p2p.WifiP2pManager.DnsSdTxtRecordListener p2) {}
    public void setUpnpServiceResponseListener(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.UpnpServiceResponseListener p1) {}
    public void discoverServices(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void addServiceRequest(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.nsd.WifiP2pServiceRequest p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void removeServiceRequest(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.nsd.WifiP2pServiceRequest p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void clearServiceRequests(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void requestPeers(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.PeerListListener p1) {}
    public void requestConnectionInfo(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ConnectionInfoListener p1) {}
    public void requestGroupInfo(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.GroupInfoListener p1) {}
    public void setDeviceName(android.net.wifi.p2p.WifiP2pManager.Channel p0, java.lang.String p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void setWfdInfo(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pWfdInfo p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void deletePersistentGroup(android.net.wifi.p2p.WifiP2pManager.Channel p0, int p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void requestPersistentGroupInfo(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.PersistentGroupInfoListener p1) {}
    public void setMiracastMode(int p0) {}
    public void factoryReset(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void requestP2pState(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.P2pStateListener p1) {}
    public void requestDiscoveryState(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.DiscoveryStateListener p1) {}
    public void requestNetworkInfo(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.NetworkInfoListener p1) {}
    public void requestDeviceInfo(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.DeviceInfoListener p1) {}

    public static interface ActionListener {
        public void onSuccess();
        public void onFailure(int p0);
    }

    public static class Channel implements java.lang.AutoCloseable {
        Channel() {}
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
    }

    public static interface ChannelListener {
        public void onChannelDisconnected();
    }

    public static interface ConnectionInfoListener {
        public void onConnectionInfoAvailable(android.net.wifi.p2p.WifiP2pInfo p0);
    }

    public static interface DeviceInfoListener {
        public void onDeviceInfoAvailable(android.net.wifi.p2p.WifiP2pDevice p0);
    }

    public static interface DiscoveryStateListener {
        public void onDiscoveryStateAvailable(int p0);
    }

    public static interface DnsSdServiceResponseListener {
        public void onDnsSdServiceAvailable(java.lang.String p0, java.lang.String p1, android.net.wifi.p2p.WifiP2pDevice p2);
    }

    public static interface DnsSdTxtRecordListener {
        public void onDnsSdTxtRecordAvailable(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1, android.net.wifi.p2p.WifiP2pDevice p2);
    }

    public static interface GroupInfoListener {
        public void onGroupInfoAvailable(android.net.wifi.p2p.WifiP2pGroup p0);
    }

    public static interface NetworkInfoListener {
        public void onNetworkInfoAvailable(android.net.NetworkInfo p0);
    }

    public static interface P2pStateListener {
        public void onP2pStateAvailable(int p0);
    }

    public static interface PeerListListener {
        public void onPeersAvailable(android.net.wifi.p2p.WifiP2pDeviceList p0);
    }

    public static interface PersistentGroupInfoListener {
        public void onPersistentGroupInfoAvailable(android.net.wifi.p2p.WifiP2pGroupList p0);
    }

    public static interface ServiceResponseListener {
        public void onServiceAvailable(int p0, byte[] p1, android.net.wifi.p2p.WifiP2pDevice p2);
    }

    public static interface UpnpServiceResponseListener {
        public void onUpnpServiceAvailable(java.util.List<java.lang.String> p0, android.net.wifi.p2p.WifiP2pDevice p1);
    }
}
