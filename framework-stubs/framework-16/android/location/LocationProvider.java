package android.location;

@java.lang.Deprecated
public class LocationProvider {
    @java.lang.Deprecated
    public static final int OUT_OF_SERVICE = 0;
    @java.lang.Deprecated
    public static final int TEMPORARILY_UNAVAILABLE = 1;
    @java.lang.Deprecated
    public static final int AVAILABLE = 2;
    LocationProvider(java.lang.String p0, android.location.provider.ProviderProperties p1) {}
    public java.lang.String getName() { return null; }
    public boolean meetsCriteria(android.location.Criteria p0) { return false; }
    public static boolean propertiesMeetCriteria(java.lang.String p0, android.location.provider.ProviderProperties p1, android.location.Criteria p2) { return false; }
    public boolean requiresNetwork() { return false; }
    public boolean requiresSatellite() { return false; }
    public boolean requiresCell() { return false; }
    public boolean hasMonetaryCost() { return false; }
    public boolean supportsAltitude() { return false; }
    public boolean supportsSpeed() { return false; }
    public boolean supportsBearing() { return false; }
    public int getPowerRequirement() { return 0; }
    public int getAccuracy() { return 0; }
}
