package android.location.flags;

public interface FeatureFlags {
    public boolean changeGetAdasAllowlistFromHiddenToSystem();
    public boolean densityBasedCoarseLocations();
    public boolean deprecateProviderRequestApis();
    public boolean disableStationaryThrottling();
    public boolean enableLocationBypass();
    public boolean enableNiSuplMessageInjectionByCarrierConfigBugfix();
    public boolean fixIsInEmergencyAnr();
    public boolean fixNoSetPositionModeWhenHalRestarts();
    public boolean fixServiceWatcher();
    public boolean geoidHeightsViaAltitudeHal();
    public boolean gnssApiMeasurementRequestWorkSource();
    public boolean gnssApiNavicL1();
    public boolean gnssAssistanceInterface();
    public boolean gnssAssistanceInterfaceJni();
    public boolean gnssConfigurationFromResource();
    public boolean gnssLocationProviderOverlay2025Devices();
    public boolean keepGnssStationaryThrottling();
    public boolean limitFusedGps();
    public boolean locationBypass();
    public boolean locationIndicatorsEnabled();
    public boolean missingAttributionTagsInOverlay();
    public boolean newGeocoder();
    public boolean populationDensityProvider();
    public boolean serviceWatcherUnstableFallback();
    public boolean updateMinLocationRequestInterval();
}
