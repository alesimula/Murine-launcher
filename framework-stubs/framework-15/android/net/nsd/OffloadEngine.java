package android.net.nsd;

public interface OffloadEngine {
    public static final int OFFLOAD_CAPABILITY_BYPASS_MULTICAST_LOCK = 1;
    public static final int OFFLOAD_TYPE_FILTER_QUERIES = 2;
    public static final int OFFLOAD_TYPE_FILTER_REPLIES = 4;
    public static final int OFFLOAD_TYPE_REPLY = 1;
    public void onOffloadServiceRemoved(android.net.nsd.OffloadServiceInfo p0);
    public void onOffloadServiceUpdated(android.net.nsd.OffloadServiceInfo p0);
}
