package android.stats.connectivity;

public final class ConnectivityServiceProto {
    public static final int RT_UNKNOWN = 0;
    public static final int RT_SYSTEM = 1;
    public static final int RT_APP = 2;
    public static final int RT_SYSTEM_ON_BEHALF_OF_APP = 3;
    public static final int METERED_UNKNOWN = 0;
    public static final int METERED_NO = 1;
    public static final int METERED_YES = 2;
    public static final int METERED_TEMPORARILY_UNMETERED = 3;
    public static final int VS_UNKNOWN = 0;
    public static final int VS_VALID = 1;
    public static final int VS_INVALID = 2;
    public static final int VS_PARTIAL = 3;
    public static final int VS_PORTAL = 4;
    public static final int RMR_UNKNOWN = 0;
    public static final int RMR_NETWORK_CONNECTED = 1;
    public static final int RMR_NETWORK_DISCONNECTED = 2;
    public static final int RMR_NETWORK_UPDATED_CAPS = 3;
    public static final int RMR_NETWORK_UPDATED_SCORE = 4;
    public static final int NET_UNKNOWN = 0;
    public static final int NET_REGISTER = 1;
    public static final int NET_DISCOVER = 2;
    public static final int NET_RESOLVE = 3;
    public static final int MQR_UNKNOWN = 0;
    public static final int MQR_SERVICE_REGISTERED = 1;
    public static final int MQR_SERVICE_UNREGISTERED = 2;
    public static final int MQR_SERVICE_REGISTRATION_FAILED = 3;
    public static final int MQR_SERVICE_DISCOVERY_STARTED = 4;
    public static final int MQR_SERVICE_DISCOVERY_FAILED = 5;
    public static final int MQR_SERVICE_DISCOVERY_STOP = 6;
    public static final int MQR_SERVICE_RESOLVED = 7;
    public static final int MQR_SERVICE_RESOLUTION_FAILED = 8;
    public ConnectivityServiceProto() {}
}
