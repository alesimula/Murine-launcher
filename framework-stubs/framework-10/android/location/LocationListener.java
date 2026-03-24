package android.location;

public interface LocationListener {
    public void onLocationChanged(android.location.Location p0);
    @java.lang.Deprecated
    public void onStatusChanged(java.lang.String p0, int p1, android.os.Bundle p2);
    public void onProviderEnabled(java.lang.String p0);
    public void onProviderDisabled(java.lang.String p0);
}
