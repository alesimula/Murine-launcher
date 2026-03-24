package android.net.nsd;

public final class NsdManager {
    private static final java.lang.String TAG = null;
    private static final boolean DBG = false;
    public static final java.lang.String ACTION_NSD_STATE_CHANGED = "android.net.nsd.STATE_CHANGED";
    public static final java.lang.String EXTRA_NSD_STATE = "nsd_state";
    public static final int NSD_STATE_DISABLED = 1;
    public static final int NSD_STATE_ENABLED = 2;
    private static final int BASE = 393216;
    public static final int DISCOVER_SERVICES = 393217;
    public static final int DISCOVER_SERVICES_STARTED = 393218;
    public static final int DISCOVER_SERVICES_FAILED = 393219;
    public static final int SERVICE_FOUND = 393220;
    public static final int SERVICE_LOST = 393221;
    public static final int STOP_DISCOVERY = 393222;
    public static final int STOP_DISCOVERY_FAILED = 393223;
    public static final int STOP_DISCOVERY_SUCCEEDED = 393224;
    public static final int REGISTER_SERVICE = 393225;
    public static final int REGISTER_SERVICE_FAILED = 393226;
    public static final int REGISTER_SERVICE_SUCCEEDED = 393227;
    public static final int UNREGISTER_SERVICE = 393228;
    public static final int UNREGISTER_SERVICE_FAILED = 393229;
    public static final int UNREGISTER_SERVICE_SUCCEEDED = 393230;
    public static final int RESOLVE_SERVICE = 393234;
    public static final int RESOLVE_SERVICE_FAILED = 393235;
    public static final int RESOLVE_SERVICE_SUCCEEDED = 393236;
    public static final int ENABLE = 393240;
    public static final int DISABLE = 393241;
    public static final int NATIVE_DAEMON_EVENT = 393242;
    public static final int PROTOCOL_DNS_SD = 1;
    private static final android.util.SparseArray<java.lang.String> EVENT_NAMES = null;
    private static final int FIRST_LISTENER_KEY = 1;
    private final android.net.nsd.INsdManager mService = null;
    private final android.content.Context mContext = null;
    private int mListenerKey;
    private final android.util.SparseArray mListenerMap = null;
    private final android.util.SparseArray<android.net.nsd.NsdServiceInfo> mServiceMap = null;
    private final java.lang.Object mMapLock = null;
    private final com.android.internal.util.AsyncChannel mAsyncChannel = null;
    private android.net.nsd.NsdManager.ServiceHandler mHandler;
    private final java.util.concurrent.CountDownLatch mConnected = null;
    public static final int FAILURE_INTERNAL_ERROR = 0;
    public static final int FAILURE_ALREADY_ACTIVE = 3;
    public static final int FAILURE_MAX_LIMIT = 4;
    public static java.lang.String nameOf(int p0) { return null; }
    public NsdManager(android.content.Context p0, android.net.nsd.INsdManager p1) {}
    public void disconnect() {}
    private int nextListenerKey() { return 0; }
    private int putListener(java.lang.Object p0, android.net.nsd.NsdServiceInfo p1) { return 0; }
    private void removeListener(int p0) {}
    private int getListenerKey(java.lang.Object p0) { return 0; }
    private static java.lang.String getNsdServiceInfoType(android.net.nsd.NsdServiceInfo p0) { return null; }
    private void init() {}
    private static void fatal(java.lang.String p0) {}
    public void registerService(android.net.nsd.NsdServiceInfo p0, int p1, android.net.nsd.NsdManager.RegistrationListener p2) {}
    public void unregisterService(android.net.nsd.NsdManager.RegistrationListener p0) {}
    public void discoverServices(java.lang.String p0, int p1, android.net.nsd.NsdManager.DiscoveryListener p2) {}
    public void stopServiceDiscovery(android.net.nsd.NsdManager.DiscoveryListener p0) {}
    public void resolveService(android.net.nsd.NsdServiceInfo p0, android.net.nsd.NsdManager.ResolveListener p1) {}
    public void setEnabled(boolean p0) {}
    private android.os.Messenger getMessenger() { return null; }
    private static void checkListener(java.lang.Object p0) {}
    private static void checkProtocol(int p0) {}
    private static void checkServiceInfo(android.net.nsd.NsdServiceInfo p0) {}

    class ServiceHandler extends android.os.Handler {
        ServiceHandler(android.net.nsd.NsdManager p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static interface ResolveListener {
        public void onResolveFailed(android.net.nsd.NsdServiceInfo p0, int p1);
        public void onServiceResolved(android.net.nsd.NsdServiceInfo p0);
    }

    public static interface RegistrationListener {
        public void onRegistrationFailed(android.net.nsd.NsdServiceInfo p0, int p1);
        public void onUnregistrationFailed(android.net.nsd.NsdServiceInfo p0, int p1);
        public void onServiceRegistered(android.net.nsd.NsdServiceInfo p0);
        public void onServiceUnregistered(android.net.nsd.NsdServiceInfo p0);
    }

    public static interface DiscoveryListener {
        public void onStartDiscoveryFailed(java.lang.String p0, int p1);
        public void onStopDiscoveryFailed(java.lang.String p0, int p1);
        public void onDiscoveryStarted(java.lang.String p0);
        public void onDiscoveryStopped(java.lang.String p0);
        public void onServiceFound(android.net.nsd.NsdServiceInfo p0);
        public void onServiceLost(android.net.nsd.NsdServiceInfo p0);
    }
}
