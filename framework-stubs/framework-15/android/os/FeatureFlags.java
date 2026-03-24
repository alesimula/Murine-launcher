package android.os;

public interface FeatureFlags {
    public boolean adpfFmqEagerSend();
    public boolean adpfGpuReportActualWorkDuration();
    public boolean adpfHwuiGpu();
    public boolean adpfMeasureDuringInputEventBoost();
    public boolean adpfObtainviewBoost();
    public boolean adpfPlatformPowerEfficiency();
    public boolean adpfPreferPowerEfficiency();
    public boolean adpfUseFmqChannel();
    public boolean adpfUseFmqChannelFixed();
    public boolean allowPrivateProfile();
    public boolean allowThermalHeadroomThresholds();
    public boolean androidOsBuildVanillaIceCream();
    public boolean batteryPartStatusApi();
    public boolean batterySaverSupportedCheckApi();
    public boolean batteryServiceSupportCurrentAdbCommand();
    public boolean bugreportModeMaxValue();
    public boolean disallowCellularNullCiphersRestriction();
    public boolean messageQueueTailTracking();
    public boolean perfettoSdkTracing();
    public boolean removeAppProfilerPssCollection();
    public boolean securityStateService();
    public boolean stateOfHealthPublic();
    public boolean storageLifetimeApi();
    public boolean strictModeRestrictedNetwork();
    public boolean telemetryApisFrameworkInitialization();
}
