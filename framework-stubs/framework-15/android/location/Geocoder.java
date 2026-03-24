package android.location;

public final class Geocoder {
    public static boolean isPresent() { return false; }
    public Geocoder(android.content.Context p0) {}
    public Geocoder(android.content.Context p0, java.util.Locale p1) {}
    @java.lang.Deprecated
    @android.annotation.Nullable
    public java.util.List<android.location.Address> getFromLocation(double p0, double p1, int p2) throws java.io.IOException { return null; }
    public void getFromLocation(double p0, double p1, int p2, android.location.Geocoder.GeocodeListener p3) {}
    @java.lang.Deprecated
    @android.annotation.Nullable
    public java.util.List<android.location.Address> getFromLocationName(java.lang.String p0, int p1) throws java.io.IOException { return null; }
    public void getFromLocationName(java.lang.String p0, int p1, android.location.Geocoder.GeocodeListener p2) {}
    @java.lang.Deprecated
    @android.annotation.Nullable
    public java.util.List<android.location.Address> getFromLocationName(java.lang.String p0, int p1, double p2, double p3, double p4, double p5) throws java.io.IOException { return null; }
    public void getFromLocationName(java.lang.String p0, int p1, double p2, double p3, double p4, double p5, android.location.Geocoder.GeocodeListener p6) {}

    private static class GeocodeCallbackImpl extends android.location.provider.IGeocodeCallback.Stub {
        GeocodeCallbackImpl(android.location.Geocoder.GeocodeListener p0) { super(); }
        public void onError(java.lang.String p0) {}
        public void onResults(java.util.List<android.location.Address> p0) {}
    }

    public static interface GeocodeListener {
        public void onGeocode(java.util.List<android.location.Address> p0);
        default public void onError(java.lang.String p0) {}
    }

    private static class SynchronousGeocoder implements android.location.Geocoder.GeocodeListener {
        SynchronousGeocoder() {}
        public void onGeocode(java.util.List<android.location.Address> p0) {}
        public void onError(java.lang.String p0) {}
        public java.util.List<android.location.Address> getResults() throws java.io.IOException { return null; }
    }
}
