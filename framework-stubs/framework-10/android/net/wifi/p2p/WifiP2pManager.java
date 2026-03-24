package android.net.wifi.p2p;

public class WifiP2pManager {
    private static final java.lang.String TAG = "WifiP2pManager";
    public static final java.lang.String WIFI_P2P_STATE_CHANGED_ACTION = "android.net.wifi.p2p.STATE_CHANGED";
    public static final java.lang.String EXTRA_WIFI_STATE = "wifi_p2p_state";
    public static final int WIFI_P2P_STATE_DISABLED = 1;
    public static final int WIFI_P2P_STATE_ENABLED = 2;
    public static final java.lang.String WIFI_P2P_CONNECTION_CHANGED_ACTION = "android.net.wifi.p2p.CONNECTION_STATE_CHANGE";
    public static final java.lang.String EXTRA_WIFI_P2P_INFO = "wifiP2pInfo";
    public static final java.lang.String EXTRA_NETWORK_INFO = "networkInfo";
    public static final java.lang.String EXTRA_WIFI_P2P_GROUP = "p2pGroupInfo";
    public static final java.lang.String WIFI_P2P_PEERS_CHANGED_ACTION = "android.net.wifi.p2p.PEERS_CHANGED";
    public static final java.lang.String EXTRA_P2P_DEVICE_LIST = "wifiP2pDeviceList";
    public static final java.lang.String WIFI_P2P_DISCOVERY_CHANGED_ACTION = "android.net.wifi.p2p.DISCOVERY_STATE_CHANGE";
    public static final java.lang.String EXTRA_DISCOVERY_STATE = "discoveryState";
    public static final int WIFI_P2P_DISCOVERY_STOPPED = 1;
    public static final int WIFI_P2P_DISCOVERY_STARTED = 2;
    public static final java.lang.String WIFI_P2P_THIS_DEVICE_CHANGED_ACTION = "android.net.wifi.p2p.THIS_DEVICE_CHANGED";
    public static final java.lang.String EXTRA_WIFI_P2P_DEVICE = "wifiP2pDevice";
    public static final java.lang.String WIFI_P2P_PERSISTENT_GROUPS_CHANGED_ACTION = "android.net.wifi.p2p.PERSISTENT_GROUPS_CHANGED";
    public static final java.lang.String EXTRA_HANDOVER_MESSAGE = "android.net.wifi.p2p.EXTRA_HANDOVER_MESSAGE";
    public static final java.lang.String CALLING_PACKAGE = "android.net.wifi.p2p.CALLING_PACKAGE";
    public static final java.lang.String CALLING_BINDER = "android.net.wifi.p2p.CALLING_BINDER";
    android.net.wifi.p2p.IWifiP2pManager mService;
    private static final int BASE = 139264;
    public static final int DISCOVER_PEERS = 139265;
    public static final int DISCOVER_PEERS_FAILED = 139266;
    public static final int DISCOVER_PEERS_SUCCEEDED = 139267;
    public static final int STOP_DISCOVERY = 139268;
    public static final int STOP_DISCOVERY_FAILED = 139269;
    public static final int STOP_DISCOVERY_SUCCEEDED = 139270;
    public static final int CONNECT = 139271;
    public static final int CONNECT_FAILED = 139272;
    public static final int CONNECT_SUCCEEDED = 139273;
    public static final int CANCEL_CONNECT = 139274;
    public static final int CANCEL_CONNECT_FAILED = 139275;
    public static final int CANCEL_CONNECT_SUCCEEDED = 139276;
    @android.annotation.UnsupportedAppUsage
    public static final int CREATE_GROUP = 139277;
    public static final int CREATE_GROUP_FAILED = 139278;
    public static final int CREATE_GROUP_SUCCEEDED = 139279;
    public static final int REMOVE_GROUP = 139280;
    public static final int REMOVE_GROUP_FAILED = 139281;
    public static final int REMOVE_GROUP_SUCCEEDED = 139282;
    public static final int REQUEST_PEERS = 139283;
    public static final int RESPONSE_PEERS = 139284;
    public static final int REQUEST_CONNECTION_INFO = 139285;
    public static final int RESPONSE_CONNECTION_INFO = 139286;
    public static final int REQUEST_GROUP_INFO = 139287;
    public static final int RESPONSE_GROUP_INFO = 139288;
    public static final int ADD_LOCAL_SERVICE = 139292;
    public static final int ADD_LOCAL_SERVICE_FAILED = 139293;
    public static final int ADD_LOCAL_SERVICE_SUCCEEDED = 139294;
    public static final int REMOVE_LOCAL_SERVICE = 139295;
    public static final int REMOVE_LOCAL_SERVICE_FAILED = 139296;
    public static final int REMOVE_LOCAL_SERVICE_SUCCEEDED = 139297;
    public static final int CLEAR_LOCAL_SERVICES = 139298;
    public static final int CLEAR_LOCAL_SERVICES_FAILED = 139299;
    public static final int CLEAR_LOCAL_SERVICES_SUCCEEDED = 139300;
    public static final int ADD_SERVICE_REQUEST = 139301;
    public static final int ADD_SERVICE_REQUEST_FAILED = 139302;
    public static final int ADD_SERVICE_REQUEST_SUCCEEDED = 139303;
    public static final int REMOVE_SERVICE_REQUEST = 139304;
    public static final int REMOVE_SERVICE_REQUEST_FAILED = 139305;
    public static final int REMOVE_SERVICE_REQUEST_SUCCEEDED = 139306;
    public static final int CLEAR_SERVICE_REQUESTS = 139307;
    public static final int CLEAR_SERVICE_REQUESTS_FAILED = 139308;
    public static final int CLEAR_SERVICE_REQUESTS_SUCCEEDED = 139309;
    public static final int DISCOVER_SERVICES = 139310;
    public static final int DISCOVER_SERVICES_FAILED = 139311;
    public static final int DISCOVER_SERVICES_SUCCEEDED = 139312;
    public static final int PING = 139313;
    public static final int RESPONSE_SERVICE = 139314;
    public static final int SET_DEVICE_NAME = 139315;
    public static final int SET_DEVICE_NAME_FAILED = 139316;
    public static final int SET_DEVICE_NAME_SUCCEEDED = 139317;
    public static final int DELETE_PERSISTENT_GROUP = 139318;
    public static final int DELETE_PERSISTENT_GROUP_FAILED = 139319;
    public static final int DELETE_PERSISTENT_GROUP_SUCCEEDED = 139320;
    public static final int REQUEST_PERSISTENT_GROUP_INFO = 139321;
    public static final int RESPONSE_PERSISTENT_GROUP_INFO = 139322;
    public static final int SET_WFD_INFO = 139323;
    public static final int SET_WFD_INFO_FAILED = 139324;
    public static final int SET_WFD_INFO_SUCCEEDED = 139325;
    public static final int START_WPS = 139326;
    public static final int START_WPS_FAILED = 139327;
    public static final int START_WPS_SUCCEEDED = 139328;
    public static final int START_LISTEN = 139329;
    public static final int START_LISTEN_FAILED = 139330;
    public static final int START_LISTEN_SUCCEEDED = 139331;
    public static final int STOP_LISTEN = 139332;
    public static final int STOP_LISTEN_FAILED = 139333;
    public static final int STOP_LISTEN_SUCCEEDED = 139334;
    public static final int SET_CHANNEL = 139335;
    public static final int SET_CHANNEL_FAILED = 139336;
    public static final int SET_CHANNEL_SUCCEEDED = 139337;
    public static final int GET_HANDOVER_REQUEST = 139339;
    public static final int GET_HANDOVER_SELECT = 139340;
    public static final int RESPONSE_GET_HANDOVER_MESSAGE = 139341;
    public static final int INITIATOR_REPORT_NFC_HANDOVER = 139342;
    public static final int RESPONDER_REPORT_NFC_HANDOVER = 139343;
    public static final int REPORT_NFC_HANDOVER_SUCCEEDED = 139344;
    public static final int REPORT_NFC_HANDOVER_FAILED = 139345;
    public static final int FACTORY_RESET = 139346;
    public static final int FACTORY_RESET_FAILED = 139347;
    public static final int FACTORY_RESET_SUCCEEDED = 139348;
    public static final int REQUEST_ONGOING_PEER_CONFIG = 139349;
    public static final int RESPONSE_ONGOING_PEER_CONFIG = 139350;
    public static final int SET_ONGOING_PEER_CONFIG = 139351;
    public static final int SET_ONGOING_PEER_CONFIG_FAILED = 139352;
    public static final int SET_ONGOING_PEER_CONFIG_SUCCEEDED = 139353;
    public static final int REQUEST_P2P_STATE = 139354;
    public static final int RESPONSE_P2P_STATE = 139355;
    public static final int REQUEST_DISCOVERY_STATE = 139356;
    public static final int RESPONSE_DISCOVERY_STATE = 139357;
    public static final int REQUEST_NETWORK_INFO = 139358;
    public static final int RESPONSE_NETWORK_INFO = 139359;
    public static final int UPDATE_CHANNEL_INFO = 139360;
    public static final int REQUEST_DEVICE_INFO = 139361;
    public static final int RESPONSE_DEVICE_INFO = 139362;
    public static final int ERROR = 0;
    public static final int P2P_UNSUPPORTED = 1;
    public static final int BUSY = 2;
    public static final int NO_SERVICE_REQUESTS = 3;
    public static final int MIRACAST_DISABLED = 0;
    public static final int MIRACAST_SOURCE = 1;
    public static final int MIRACAST_SINK = 2;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public WifiP2pManager(android.net.wifi.p2p.IWifiP2pManager p0) {}
    private static void checkChannel(android.net.wifi.p2p.WifiP2pManager.Channel p0) {}
    private static void checkServiceInfo(android.net.wifi.p2p.nsd.WifiP2pServiceInfo p0) {}
    private static void checkServiceRequest(android.net.wifi.p2p.nsd.WifiP2pServiceRequest p0) {}
    private static void checkP2pConfig(android.net.wifi.p2p.WifiP2pConfig p0) {}
    public android.net.wifi.p2p.WifiP2pManager.Channel initialize(android.content.Context p0, android.os.Looper p1, android.net.wifi.p2p.WifiP2pManager.ChannelListener p2) { return null; }
    public android.net.wifi.p2p.WifiP2pManager.Channel initializeInternal(android.content.Context p0, android.os.Looper p1, android.net.wifi.p2p.WifiP2pManager.ChannelListener p2) { return null; }
    private android.net.wifi.p2p.WifiP2pManager.Channel initalizeChannel(android.content.Context p0, android.os.Looper p1, android.net.wifi.p2p.WifiP2pManager.ChannelListener p2, android.os.Messenger p3, android.os.Binder p4) { return null; }
    public void discoverPeers(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void stopPeerDiscovery(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void connect(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pConfig p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void cancelConnect(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void createGroup(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void createGroup(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pConfig p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void removeGroup(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void listen(android.net.wifi.p2p.WifiP2pManager.Channel p0, boolean p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    @android.annotation.UnsupportedAppUsage
    public void setWifiP2pChannels(android.net.wifi.p2p.WifiP2pManager.Channel p0, int p1, int p2, android.net.wifi.p2p.WifiP2pManager.ActionListener p3) {}
    @android.annotation.UnsupportedAppUsage
    public void startWps(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.WpsInfo p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
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
    @android.annotation.UnsupportedAppUsage
    public void setDeviceName(android.net.wifi.p2p.WifiP2pManager.Channel p0, java.lang.String p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    @android.annotation.UnsupportedAppUsage
    public void setWFDInfo(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pWfdInfo p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    @android.annotation.UnsupportedAppUsage
    public void deletePersistentGroup(android.net.wifi.p2p.WifiP2pManager.Channel p0, int p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    @android.annotation.UnsupportedAppUsage
    public void requestPersistentGroupInfo(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.PersistentGroupInfoListener p1) {}
    @android.annotation.UnsupportedAppUsage
    public void setMiracastMode(int p0) {}
    public android.os.Messenger getMessenger(android.os.Binder p0) { return null; }
    public android.os.Messenger getP2pStateMachineMessenger() { return null; }
    public void getNfcHandoverRequest(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.HandoverMessageListener p1) {}
    public void getNfcHandoverSelect(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.HandoverMessageListener p1) {}
    public void initiatorReportNfcHandover(android.net.wifi.p2p.WifiP2pManager.Channel p0, java.lang.String p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void responderReportNfcHandover(android.net.wifi.p2p.WifiP2pManager.Channel p0, java.lang.String p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void factoryReset(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.ActionListener p1) {}
    public void requestOngoingPeerConfig(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.OngoingPeerInfoListener p1) {}
    public void setOngoingPeerConfig(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pConfig p1, android.net.wifi.p2p.WifiP2pManager.ActionListener p2) {}
    public void requestP2pState(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.P2pStateListener p1) {}
    public void requestDiscoveryState(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.DiscoveryStateListener p1) {}
    public void requestNetworkInfo(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.NetworkInfoListener p1) {}
    public void requestDeviceInfo(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.net.wifi.p2p.WifiP2pManager.DeviceInfoListener p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WifiP2pState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WifiP2pDiscoveryState {
    }

    public static interface UpnpServiceResponseListener {
        public void onUpnpServiceAvailable(java.util.List<java.lang.String> p0, android.net.wifi.p2p.WifiP2pDevice p1);
    }

    public static interface ServiceResponseListener {
        public void onServiceAvailable(int p0, byte[] p1, android.net.wifi.p2p.WifiP2pDevice p2);
    }

    public static interface PersistentGroupInfoListener {
        public void onPersistentGroupInfoAvailable(android.net.wifi.p2p.WifiP2pGroupList p0);
    }

    public static interface PeerListListener {
        public void onPeersAvailable(android.net.wifi.p2p.WifiP2pDeviceList p0);
    }

    public static interface P2pStateListener {
        public void onP2pStateAvailable(int p0);
    }

    public static interface OngoingPeerInfoListener {
        public void onOngoingPeerAvailable(android.net.wifi.p2p.WifiP2pConfig p0);
    }

    public static interface NetworkInfoListener {
        public void onNetworkInfoAvailable(android.net.NetworkInfo p0);
    }

    public static interface HandoverMessageListener {
        public void onHandoverMessageAvailable(java.lang.String p0);
    }

    public static interface GroupInfoListener {
        public void onGroupInfoAvailable(android.net.wifi.p2p.WifiP2pGroup p0);
    }

    public static interface DnsSdTxtRecordListener {
        public void onDnsSdTxtRecordAvailable(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1, android.net.wifi.p2p.WifiP2pDevice p2);
    }

    public static interface DnsSdServiceResponseListener {
        public void onDnsSdServiceAvailable(java.lang.String p0, java.lang.String p1, android.net.wifi.p2p.WifiP2pDevice p2);
    }

    public static interface DiscoveryStateListener {
        public void onDiscoveryStateAvailable(int p0);
    }

    public static interface DeviceInfoListener {
        public void onDeviceInfoAvailable(android.net.wifi.p2p.WifiP2pDevice p0);
    }

    public static interface ConnectionInfoListener {
        public void onConnectionInfoAvailable(android.net.wifi.p2p.WifiP2pInfo p0);
    }

    public static interface ChannelListener {
        public void onChannelDisconnected();
    }

    public static class Channel implements java.lang.AutoCloseable {
        private static final int INVALID_LISTENER_KEY = 0;
        private final android.net.wifi.p2p.WifiP2pManager mP2pManager = null;
        private android.net.wifi.p2p.WifiP2pManager.ChannelListener mChannelListener;
        private android.net.wifi.p2p.WifiP2pManager.ServiceResponseListener mServRspListener;
        private android.net.wifi.p2p.WifiP2pManager.DnsSdServiceResponseListener mDnsSdServRspListener;
        private android.net.wifi.p2p.WifiP2pManager.DnsSdTxtRecordListener mDnsSdTxtListener;
        private android.net.wifi.p2p.WifiP2pManager.UpnpServiceResponseListener mUpnpServRspListener;
        private java.util.HashMap<java.lang.Integer, java.lang.Object> mListenerMap;
        private final java.lang.Object mListenerMapLock = null;
        private int mListenerKey;
        final android.os.Binder mBinder = null;
        @android.annotation.UnsupportedAppUsage
        private com.android.internal.util.AsyncChannel mAsyncChannel;
        private android.net.wifi.p2p.WifiP2pManager.Channel.P2pHandler mHandler;
        android.content.Context mContext;
        public Channel(android.content.Context p0, android.os.Looper p1, android.net.wifi.p2p.WifiP2pManager.ChannelListener p2, android.os.Binder p3, android.net.wifi.p2p.WifiP2pManager p4) {}
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
        private void handleServiceResponse(android.net.wifi.p2p.nsd.WifiP2pServiceResponse p0) {}
        private void handleUpnpServiceResponse(android.net.wifi.p2p.nsd.WifiP2pUpnpServiceResponse p0) {}
        private void handleDnsSdServiceResponse(android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceResponse p0) {}
        @android.annotation.UnsupportedAppUsage
        private int putListener(java.lang.Object p0) { return 0; }
        private java.lang.Object getListener(int p0) { return null; }

        class P2pHandler extends android.os.Handler {
            P2pHandler(android.net.wifi.p2p.WifiP2pManager.Channel p0, android.os.Looper p1) { super(); }
            public void handleMessage(android.os.Message p0) {}
        }
    }

    public static interface ActionListener {
        public void onSuccess();
        public void onFailure(int p0);
    }
}
