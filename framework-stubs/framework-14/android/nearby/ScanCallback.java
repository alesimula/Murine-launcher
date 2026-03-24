package android.nearby;

public interface ScanCallback {
    public static final int ERROR_INVALID_ARGUMENT = 2;
    public static final int ERROR_PERMISSION_DENIED = 3;
    public static final int ERROR_RESOURCE_EXHAUSTED = 4;
    public static final int ERROR_UNKNOWN = 0;
    public static final int ERROR_UNSUPPORTED = 1;
    public void onDiscovered(android.nearby.NearbyDevice p0);
    public void onUpdated(android.nearby.NearbyDevice p0);
    public void onLost(android.nearby.NearbyDevice p0);
    default public void onError(int p0) {}
}
