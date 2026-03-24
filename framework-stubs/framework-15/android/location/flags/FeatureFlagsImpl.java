package android.location.flags;

public final class FeatureFlagsImpl implements android.location.flags.FeatureFlags {
    public FeatureFlagsImpl() {}
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
}
