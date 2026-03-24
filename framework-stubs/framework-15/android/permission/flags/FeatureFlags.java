package android.permission.flags;

public interface FeatureFlags {
    public boolean apexSignaturePermissionAllowlistEnabled();
    public boolean deviceAwareAppOpNewSchemaEnabled();
    public boolean deviceAwarePermissionApisEnabled();
    public boolean deviceAwarePermissionsEnabled();
    public boolean deviceIdInOpProxyInfoEnabled();
    public boolean enhancedConfirmationModeApisEnabled();
    public boolean factoryResetPrepPermissionApis();
    public boolean finishRunningOpsForKilledPackages();
    public boolean getEmergencyRoleHolderApiEnabled();
    public boolean ignoreProcessText();
    public boolean opEnableMobileDataByUser();
    public boolean retailDemoRoleEnabled();
    public boolean runtimePermissionAppopsMappingEnabled();
    public boolean sensitiveContentImprovements();
    public boolean sensitiveContentMetricsBugfix();
    public boolean sensitiveContentRecentsScreenshotBugfix();
    public boolean sensitiveNotificationAppProtection();
    public boolean serverSideAttributionRegistration();
    public boolean setNextAttributionSource();
    public boolean shouldRegisterAttributionSource();
    public boolean signaturePermissionAllowlistEnabled();
    public boolean systemServerRoleControllerEnabled();
    public boolean voiceActivationPermissionApis();
    public boolean walletRoleEnabled();
}
