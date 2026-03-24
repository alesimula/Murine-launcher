package com.android.internal.hidden_from_bootclasspath.android.location.flags;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.android.location.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.location.flags.FeatureFlags>> p0) {}
    public boolean changeGetAdasAllowlistFromHiddenToSystem() { return false; }
    public boolean densityBasedCoarseLocations() { return false; }
    public boolean deprecateProviderRequestApis() { return false; }
    public boolean disableStationaryThrottling() { return false; }
    public boolean enableLocationBypass() { return false; }
    public boolean enableNiSuplMessageInjectionByCarrierConfigBugfix() { return false; }
    public boolean fixIsInEmergencyAnr() { return false; }
    public boolean fixNoSetPositionModeWhenHalRestarts() { return false; }
    public boolean fixServiceWatcher() { return false; }
    public boolean geoidHeightsViaAltitudeHal() { return false; }
    public boolean gnssApiMeasurementRequestWorkSource() { return false; }
    public boolean gnssApiNavicL1() { return false; }
    public boolean gnssAssistanceInterface() { return false; }
    public boolean gnssAssistanceInterfaceJni() { return false; }
    public boolean gnssConfigurationFromResource() { return false; }
    public boolean gnssLocationProviderOverlay2025Devices() { return false; }
    public boolean keepGnssStationaryThrottling() { return false; }
    public boolean limitFusedGps() { return false; }
    public boolean locationBypass() { return false; }
    public boolean locationIndicatorsEnabled() { return false; }
    public boolean missingAttributionTagsInOverlay() { return false; }
    public boolean newGeocoder() { return false; }
    public boolean populationDensityProvider() { return false; }
    public boolean serviceWatcherUnstableFallback() { return false; }
    public boolean updateMinLocationRequestInterval() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.location.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
