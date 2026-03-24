package android.net.metrics;

@java.lang.Deprecated
@android.annotation.SystemApi
public final class NetworkEvent implements android.net.metrics.IpConnectivityLog.Event {
    public static final int NETWORK_CONNECTED = 1;
    public static final int NETWORK_VALIDATED = 2;
    public static final int NETWORK_VALIDATION_FAILED = 3;
    public static final int NETWORK_CAPTIVE_PORTAL_FOUND = 4;
    public static final int NETWORK_LINGER = 5;
    public static final int NETWORK_UNLINGER = 6;
    public static final int NETWORK_DISCONNECTED = 7;
    public static final int NETWORK_FIRST_VALIDATION_SUCCESS = 8;
    public static final int NETWORK_REVALIDATION_SUCCESS = 9;
    public static final int NETWORK_FIRST_VALIDATION_PORTAL_FOUND = 10;
    public static final int NETWORK_REVALIDATION_PORTAL_FOUND = 11;
    public static final int NETWORK_CONSECUTIVE_DNS_TIMEOUT_FOUND = 12;
    public static final int NETWORK_PARTIAL_CONNECTIVITY = 13;
    public final int eventType = 0;
    public final long durationMs = 0L;
    public static final android.os.Parcelable.Creator<android.net.metrics.NetworkEvent> CREATOR = null;
    public NetworkEvent(int p0, long p1) {}
    public NetworkEvent(int p0) {}
    private NetworkEvent(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }

    static final class Decoder {
        static final android.util.SparseArray<java.lang.String> constants = null;
        Decoder() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventType {
    }
}
