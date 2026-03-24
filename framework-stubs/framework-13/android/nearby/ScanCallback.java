package android.nearby;

public interface ScanCallback {
    public void onDiscovered(android.nearby.NearbyDevice p0);
    public void onUpdated(android.nearby.NearbyDevice p0);
    public void onLost(android.nearby.NearbyDevice p0);
}
