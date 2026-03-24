package android.location.flags;

public class CustomFeatureFlags implements android.location.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.location.flags.FeatureFlags>> p0) {}
    public boolean enableLocationBypass() { return false; }
    public boolean fixServiceWatcher() { return false; }
    public boolean geoidHeightsViaAltitudeHal() { return false; }
    public boolean gnssApiMeasurementRequestWorkSource() { return false; }
    public boolean gnssApiNavicL1() { return false; }
    public boolean gnssCallStopBeforeSetPositionMode() { return false; }
    public boolean gnssConfigurationFromResource() { return false; }
    public boolean locationBypass() { return false; }
    public boolean locationValidation() { return false; }
    public boolean newGeocoder() { return false; }
    public boolean releaseSuplConnectionOnTimeout() { return false; }
    public boolean replaceFutureElapsedRealtimeJni() { return false; }
    public boolean subscriptionsChangedListenerThread() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.location.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
