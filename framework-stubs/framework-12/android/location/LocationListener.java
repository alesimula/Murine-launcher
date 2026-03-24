package android.location;

public interface LocationListener {
    public void onLocationChanged(android.location.Location p0);
    default public void onLocationChanged(java.util.List<android.location.Location> p0) {}
    default public void onFlushComplete(int p0) {}
    @java.lang.Deprecated
    default public void onStatusChanged(java.lang.String p0, int p1, android.os.Bundle p2) {}
    default public void onProviderEnabled(java.lang.String p0) {}
    default public void onProviderDisabled(java.lang.String p0) {}
}
