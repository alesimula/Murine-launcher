package android.location.flags;

public interface FeatureFlags {
    public boolean enableLocationBypass();
    public boolean fixServiceWatcher();
    public boolean geoidHeightsViaAltitudeHal();
    public boolean gnssApiMeasurementRequestWorkSource();
    public boolean gnssApiNavicL1();
    public boolean gnssCallStopBeforeSetPositionMode();
    public boolean gnssConfigurationFromResource();
    public boolean locationBypass();
    public boolean locationValidation();
    public boolean newGeocoder();
    public boolean releaseSuplConnectionOnTimeout();
    public boolean replaceFutureElapsedRealtimeJni();
    public boolean subscriptionsChangedListenerThread();
}
