package android.net.nsd;

public final class NsdManager {
    public static final java.lang.String ACTION_NSD_STATE_CHANGED = "android.net.nsd.STATE_CHANGED";
    public static final java.lang.String EXTRA_NSD_STATE = "nsd_state";
    public static final int FAILURE_ALREADY_ACTIVE = 3;
    public static final int FAILURE_INTERNAL_ERROR = 0;
    public static final int FAILURE_MAX_LIMIT = 4;
    public static final int NSD_STATE_DISABLED = 1;
    public static final int NSD_STATE_ENABLED = 2;
    public static final int PROTOCOL_DNS_SD = 1;
    NsdManager() {}
    public void registerService(android.net.nsd.NsdServiceInfo p0, int p1, android.net.nsd.NsdManager.RegistrationListener p2) {}
    public void registerService(android.net.nsd.NsdServiceInfo p0, int p1, java.util.concurrent.Executor p2, android.net.nsd.NsdManager.RegistrationListener p3) {}
    public void unregisterService(android.net.nsd.NsdManager.RegistrationListener p0) {}
    public void discoverServices(java.lang.String p0, int p1, android.net.nsd.NsdManager.DiscoveryListener p2) {}
    public void discoverServices(java.lang.String p0, int p1, android.net.Network p2, java.util.concurrent.Executor p3, android.net.nsd.NsdManager.DiscoveryListener p4) {}
    public void discoverServices(java.lang.String p0, int p1, android.net.NetworkRequest p2, java.util.concurrent.Executor p3, android.net.nsd.NsdManager.DiscoveryListener p4) {}
    public void stopServiceDiscovery(android.net.nsd.NsdManager.DiscoveryListener p0) {}
    public void resolveService(android.net.nsd.NsdServiceInfo p0, android.net.nsd.NsdManager.ResolveListener p1) {}
    public void resolveService(android.net.nsd.NsdServiceInfo p0, java.util.concurrent.Executor p1, android.net.nsd.NsdManager.ResolveListener p2) {}

    public static interface DiscoveryListener {
        public void onStartDiscoveryFailed(java.lang.String p0, int p1);
        public void onStopDiscoveryFailed(java.lang.String p0, int p1);
        public void onDiscoveryStarted(java.lang.String p0);
        public void onDiscoveryStopped(java.lang.String p0);
        public void onServiceFound(android.net.nsd.NsdServiceInfo p0);
        public void onServiceLost(android.net.nsd.NsdServiceInfo p0);
    }

    public static interface RegistrationListener {
        public void onRegistrationFailed(android.net.nsd.NsdServiceInfo p0, int p1);
        public void onUnregistrationFailed(android.net.nsd.NsdServiceInfo p0, int p1);
        public void onServiceRegistered(android.net.nsd.NsdServiceInfo p0);
        public void onServiceUnregistered(android.net.nsd.NsdServiceInfo p0);
    }

    public static interface ResolveListener {
        public void onResolveFailed(android.net.nsd.NsdServiceInfo p0, int p1);
        public void onServiceResolved(android.net.nsd.NsdServiceInfo p0);
    }
}
