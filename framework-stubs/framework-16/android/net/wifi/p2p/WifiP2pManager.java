package android.net.wifi.p2p;

public class WifiP2pManager {
    public static final java.lang.String ACTION_WIFI_P2P_LISTEN_STATE_CHANGED = "android.net.wifi.p2p.action.WIFI_P2P_LISTEN_STATE_CHANGED";
    public static final java.lang.String ACTION_WIFI_P2P_PERSISTENT_GROUPS_CHANGED = "android.net.wifi.p2p.action.WIFI_P2P_PERSISTENT_GROUPS_CHANGED";
    public static final java.lang.String ACTION_WIFI_P2P_REQUEST_RESPONSE_CHANGED = "android.net.wifi.p2p.action.WIFI_P2P_REQUEST_RESPONSE_CHANGED";
    public static final int BUSY = 2;
    public static final int CONNECTION_REQUEST_ACCEPT = 0;
    public static final int CONNECTION_REQUEST_DEFER_SHOW_PIN_TO_SERVICE = 3;
    public static final int CONNECTION_REQUEST_DEFER_TO_SERVICE = 2;
    public static final int CONNECTION_REQUEST_REJECT = 1;
    public static final int ERROR = 0;
    public static final java.lang.String EXTRA_DISCOVERY_STATE = "discoveryState";
    public static final java.lang.String EXTRA_LISTEN_STATE = "android.net.wifi.p2p.extra.LISTEN_STATE";
    public static final java.lang.String EXTRA_NETWORK_INFO = "networkInfo";
    public static final java.lang.String EXTRA_P2P_DEVICE_LIST = "wifiP2pDeviceList";
    public static final java.lang.String EXTRA_REQUEST_CONFIG = "android.net.wifi.p2p.extra.REQUEST_CONFIG";
    public static final java.lang.String EXTRA_REQUEST_RESPONSE = "android.net.wifi.p2p.extra.REQUEST_RESPONSE";
    public static final java.lang.String EXTRA_WIFI_P2P_DEVICE = "wifiP2pDevice";
    public static final java.lang.String EXTRA_WIFI_P2P_GROUP = "p2pGroupInfo";
    public static final java.lang.String EXTRA_WIFI_P2P_INFO = "wifiP2pInfo";
    public static final java.lang.String EXTRA_WIFI_STATE = "wifi_p2p_state";
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int GROUP_CREATION_FAILURE_REASON_CONNECTION_CANCELLED = 0;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int GROUP_CREATION_FAILURE_REASON_GROUP_REMOVED = 4;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int GROUP_CREATION_FAILURE_REASON_INVITATION_FAILED = 5;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int GROUP_CREATION_FAILURE_REASON_PROVISION_DISCOVERY_FAILED = 3;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int GROUP_CREATION_FAILURE_REASON_TIMED_OUT = 1;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int GROUP_CREATION_FAILURE_REASON_USER_REJECTED = 2;
    public static final int MIRACAST_DISABLED = 0;
    public static final int MIRACAST_SINK = 2;
    public static final int MIRACAST_SOURCE = 1;
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public static final int NO_PERMISSION = 4;
    public static final int NO_SERVICE_REQUESTS = 3;
    public static final int P2P_UNSUPPORTED = 1;
    public static final java.lang.String WIFI_P2P_CONNECTION_CHANGED_ACTION = "android.net.wifi.p2p.CONNECTION_STATE_CHANGE";
    public static final java.lang.String WIFI_P2P_DISCOVERY_CHANGED_ACTION = "android.net.wifi.p2p.DISCOVERY_STATE_CHANGE";
    public static final int WIFI_P2P_DISCOVERY_STARTED = 2;
    public static final int WIFI_P2P_DISCOVERY_STOPPED = 1;
    public static final int WIFI_P2P_LISTEN_STARTED = 2;
    public static final int WIFI_P2P_LISTEN_STOPPED = 1;
    public static final java.lang.String WIFI_P2P_PEERS_CHANGED_ACTION = "android.net.wifi.p2p.PEERS_CHANGED";
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int WIFI_P2P_SCAN_FULL = 0;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int WIFI_P2P_SCAN_SINGLE_FREQ = 2;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int WIFI_P2P_SCAN_SOCIAL = 1;
    public static final java.lang.String WIFI_P2P_STATE_CHANGED_ACTION = "android.net.wifi.p2p.STATE_CHANGED";
    public static final int WIFI_P2P_STATE_DISABLED = 1;
    public static final int WIFI_P2P_STATE_ENABLED = 2;
    public static final java.lang.String WIFI_P2P_THIS_DEVICE_CHANGED_ACTION = "android.net.wifi.p2p.THIS_DEVICE_CHANGED";
    WifiP2pManager() {}
    public void addExternalApprover(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.MacAddress p1, android.net.wifi.p2p.WifiP2pManager.ExternalApproverRequestListener p2) {}
    public void addLocalService(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.nsd.WifiP2pServiceInfo p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void addServiceRequest(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.nsd.WifiP2pServiceRequest p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void cancelConnect(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void clearLocalServices(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void clearServiceRequests(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void connect(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pConfig p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void createGroup(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pConfig p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void createGroup(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void deletePersistentGroup(android.net.wifi.p2p.WifiP2pManager.Channel p0, int p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void discoverPeers(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void discoverPeersOnSocialChannels(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void discoverPeersOnSpecificFrequency(android.net.wifi.p2p.WifiP2pManager.Channel p0, int p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void discoverServices(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public void discoverUsdBasedServices(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pUsdBasedServiceDiscoveryConfig p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void factoryReset(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void getListenState(android.net.wifi.p2p.WifiP2pManager.Channel p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    public static int getP2pMaxAllowedVendorElementsLengthBytes() { return 0; }
    public android.net.wifi.p2p.WifiP2pManager.Channel initialize(android.content.Context p0, android.os.Looper p1, android.net.wifi.p2p.WifiP2pManager.ChannelListener p2) { return null; }
    public boolean isChannelConstrainedDiscoverySupported() { return false; }
    public boolean isGroupClientRemovalSupported() { return false; }
    public boolean isGroupOwnerIPv6LinkLocalAddressProvided() { return false; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public boolean isPccModeSupported() { return false; }
    public boolean isSetVendorElementsSupported() { return false; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public boolean isWiFiDirectR2Supported() { return false; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public void registerWifiP2pListener(java.util.concurrent.Executor p0, android.net.wifi.p2p.WifiP2pManager.WifiP2pListener p1) {}
    public void removeClient(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.MacAddress p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void removeExternalApprover(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.MacAddress p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void removeGroup(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void removeLocalService(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.nsd.WifiP2pServiceInfo p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void removeServiceRequest(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.nsd.WifiP2pServiceRequest p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void requestConnectionInfo(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ConnectionInfoListener p1) {}
    public void requestDeviceInfo(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.DeviceInfoListener p1) {}
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public void requestDirInfo(android.net.wifi.p2p.WifiP2pManager.Channel p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.net.wifi.p2p.WifiP2pDirInfo, java.lang.Exception> p2) {}
    public void requestDiscoveryState(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.DiscoveryStateListener p1) {}
    public void requestGroupInfo(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.GroupInfoListener p1) {}
    public void requestNetworkInfo(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.NetworkInfoListener p1) {}
    public void requestP2pState(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.P2pStateListener p1) {}
    public void requestPeers(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.PeerListListener p1) {}
    public void requestPersistentGroupInfo(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.PersistentGroupInfoListener p1) {}
    public void setConnectionRequestResult(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.MacAddress p1, int p2, android.net.wifi.p2p.WifiP2pManager.ActionListener p3) {}
    public void setConnectionRequestResult(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.MacAddress p1, int p2, java.lang.String p3, android.net.wifi.p2p.WifiP2pManager.ActionListener p4) {}
    public void setDeviceName(android.net.wifi.p2p.WifiP2pManager.Channel p0, java.lang.String p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void setDnsSdResponseListeners(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.DnsSdServiceResponseListener p1, android.net.wifi.p2p.WifiP2pManager.DnsSdTxtRecordListener p2) {}
    public void setMiracastMode(int p0) {}
    public void setServiceResponseListener(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ServiceResponseListener p1) {}
    public void setUpnpServiceResponseListener(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.UpnpServiceResponseListener p1) {}
    public void setVendorElements(android.net.wifi.p2p.WifiP2pManager.Channel p0, java.util.List<android.net.wifi.ScanResult.InformationElement> p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void setWfdInfo(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pWfdInfo p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void setWifiP2pChannels(android.net.wifi.p2p.WifiP2pManager.Channel p0, int p1, int p2, android.net.wifi.p2p.WifiP2pManager.ActionListener p3) {}
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public void startListening(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pExtListenParams p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void startListening(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public void startPeerDiscovery(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pDiscoveryConfig p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public void startUsdBasedLocalServiceAdvertisement(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.nsd.WifiP2pServiceInfo p1, android.net.wifi.p2p.WifiP2pUsdBasedLocalServiceAdvertisementConfig p2, android.net.wifi.p2p.WifiP2pManager.ActionListener p3) {}
    public void stopListening(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void stopPeerDiscovery(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public void unregisterWifiP2pListener(android.net.wifi.p2p.WifiP2pManager.WifiP2pListener p0) {}
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public void validateDirInfo(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pDirInfo p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<java.lang.Boolean, java.lang.Exception> p3) {}

    public static interface ActionListener {
        public void onFailure(int p0);
        public void onSuccess();
    }

    public static class Channel implements java.lang.AutoCloseable {
        Channel() {}
        public void close() {}
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

    public static interface ExternalApproverRequestListener {
        public static final int APPROVER_DETACH_REASON_CLOSE = 3;
        public static final int APPROVER_DETACH_REASON_FAILURE = 1;
        public static final int APPROVER_DETACH_REASON_REMOVE = 0;
        public static final int APPROVER_DETACH_REASON_REPLACE = 2;
        public static final int REQUEST_TYPE_INVITATION = 1;
        public static final int REQUEST_TYPE_JOIN = 2;
        public static final int REQUEST_TYPE_NEGOTIATION = 0;
        public void onAttached(android.net.MacAddress p0);
        public void onConnectionRequested(int p0, android.net.wifi.p2p.WifiP2pConfig p1, android.net.wifi.p2p.WifiP2pDevice p2);
        public void onDetached(android.net.MacAddress p0, int p1);
        public void onPinGenerated(android.net.MacAddress p0, java.lang.String p1);
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
        @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
        default public void onUsdBasedServiceAvailable(android.net.wifi.p2p.WifiP2pDevice p0, android.net.wifi.p2p.nsd.WifiP2pUsdBasedServiceResponse p1) {}
    }

    public static interface UpnpServiceResponseListener {
        public void onUpnpServiceAvailable(java.util.List<java.lang.String> p0, android.net.wifi.p2p.WifiP2pDevice p1);
    }

    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static interface WifiP2pListener {
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        default public void onDeviceConfigurationChanged(android.net.wifi.p2p.WifiP2pDevice p0) {}
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        default public void onDiscoveryStateChanged(int p0) {}
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        default public void onFrequencyChanged(android.net.wifi.p2p.WifiP2pInfo p0, android.net.wifi.p2p.WifiP2pGroup p1) {}
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        default public void onGroupCreated(android.net.wifi.p2p.WifiP2pInfo p0, android.net.wifi.p2p.WifiP2pGroup p1) {}
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        default public void onGroupCreating() {}
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        default public void onGroupCreationFailed(int p0) {}
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        default public void onGroupNegotiationRejectedByUser() {}
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        default public void onGroupRemoved() {}
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        default public void onListenStateChanged(int p0) {}
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        default public void onP2pStateChanged(int p0) {}
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        default public void onPeerClientDisconnected(android.net.wifi.p2p.WifiP2pInfo p0, android.net.wifi.p2p.WifiP2pGroup p1) {}
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        default public void onPeerClientJoined(android.net.wifi.p2p.WifiP2pInfo p0, android.net.wifi.p2p.WifiP2pGroup p1) {}
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        default public void onPeerListChanged(android.net.wifi.p2p.WifiP2pDeviceList p0) {}
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        default public void onPersistentGroupsChanged(android.net.wifi.p2p.WifiP2pGroupList p0) {}
    }
}
