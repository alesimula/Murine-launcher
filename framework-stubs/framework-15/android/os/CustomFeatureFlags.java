package android.os;

public class CustomFeatureFlags implements android.os.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.os.FeatureFlags>> p0) {}
    public boolean adpfFmqEagerSend() { return false; }
    public boolean adpfGpuReportActualWorkDuration() { return false; }
    public boolean adpfHwuiGpu() { return false; }
    public boolean adpfMeasureDuringInputEventBoost() { return false; }
    public boolean adpfObtainviewBoost() { return false; }
    public boolean adpfPlatformPowerEfficiency() { return false; }
    public boolean adpfPreferPowerEfficiency() { return false; }
    public boolean adpfUseFmqChannel() { return false; }
    public boolean adpfUseFmqChannelFixed() { return false; }
    public boolean allowPrivateProfile() { return false; }
    public boolean allowThermalHeadroomThresholds() { return false; }
    public boolean androidOsBuildVanillaIceCream() { return false; }
    public boolean batteryPartStatusApi() { return false; }
    public boolean batterySaverSupportedCheckApi() { return false; }
    public boolean batteryServiceSupportCurrentAdbCommand() { return false; }
    public boolean bugreportModeMaxValue() { return false; }
    public boolean disallowCellularNullCiphersRestriction() { return false; }
    public boolean messageQueueTailTracking() { return false; }
    public boolean perfettoSdkTracing() { return false; }
    public boolean removeAppProfilerPssCollection() { return false; }
    public boolean securityStateService() { return false; }
    public boolean stateOfHealthPublic() { return false; }
    public boolean storageLifetimeApi() { return false; }
    public boolean strictModeRestrictedNetwork() { return false; }
    public boolean telemetryApisFrameworkInitialization() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.os.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
