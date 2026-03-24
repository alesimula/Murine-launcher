package android.location;

public final class Geocoder {
    private static final long TIMEOUT_MS = 60000L;
    private final android.location.GeocoderParams mParams = null;
    private final android.location.ILocationManager mService = null;
    public static boolean isPresent() { return false; }
    public Geocoder(android.content.Context p0, java.util.Locale p1) {}
    public Geocoder(android.content.Context p0) {}
    public java.util.List<android.location.Address> getFromLocation(double p0, double p1, int p2) throws java.io.IOException { return null; }
    public java.util.List<android.location.Address> getFromLocationName(java.lang.String p0, int p1) throws java.io.IOException { return null; }
    public java.util.List<android.location.Address> getFromLocationName(java.lang.String p0, int p1, double p2, double p3, double p4, double p5) throws java.io.IOException { return null; }

    private static class GeocodeListener extends android.location.IGeocodeListener.Stub {
        private final java.util.concurrent.CountDownLatch mLatch = null;
        private java.lang.String mError;
        private java.util.List<android.location.Address> mResults;
        GeocodeListener() { super(); }
        public void onResults(java.lang.String p0, java.util.List<android.location.Address> p1) {}
        public java.util.List<android.location.Address> getResults() throws java.io.IOException { return null; }
    }
}
