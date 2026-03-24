package android.location;

public final class Geocoder {
    private static final java.lang.String TAG = "Geocoder";
    private android.location.GeocoderParams mParams;
    private android.location.ILocationManager mService;
    public static boolean isPresent() { return false; }
    public Geocoder(android.content.Context p0, java.util.Locale p1) {}
    public Geocoder(android.content.Context p0) {}
    public java.util.List<android.location.Address> getFromLocation(double p0, double p1, int p2) throws java.io.IOException { return null; }
    public java.util.List<android.location.Address> getFromLocationName(java.lang.String p0, int p1) throws java.io.IOException { return null; }
    public java.util.List<android.location.Address> getFromLocationName(java.lang.String p0, int p1, double p2, double p3, double p4, double p5) throws java.io.IOException { return null; }
}
