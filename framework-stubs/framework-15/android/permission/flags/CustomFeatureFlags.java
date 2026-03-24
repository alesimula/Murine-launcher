package android.permission.flags;

public class CustomFeatureFlags implements android.permission.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.permission.flags.FeatureFlags>> p0) {}
    public boolean apexSignaturePermissionAllowlistEnabled() { return false; }
    public boolean deviceAwareAppOpNewSchemaEnabled() { return false; }
    public boolean deviceAwarePermissionApisEnabled() { return false; }
    public boolean deviceAwarePermissionsEnabled() { return false; }
    public boolean deviceIdInOpProxyInfoEnabled() { return false; }
    public boolean enhancedConfirmationModeApisEnabled() { return false; }
    public boolean factoryResetPrepPermissionApis() { return false; }
    public boolean finishRunningOpsForKilledPackages() { return false; }
    public boolean getEmergencyRoleHolderApiEnabled() { return false; }
    public boolean ignoreProcessText() { return false; }
    public boolean opEnableMobileDataByUser() { return false; }
    public boolean retailDemoRoleEnabled() { return false; }
    public boolean runtimePermissionAppopsMappingEnabled() { return false; }
    public boolean sensitiveContentImprovements() { return false; }
    public boolean sensitiveContentMetricsBugfix() { return false; }
    public boolean sensitiveContentRecentsScreenshotBugfix() { return false; }
    public boolean sensitiveNotificationAppProtection() { return false; }
    public boolean serverSideAttributionRegistration() { return false; }
    public boolean setNextAttributionSource() { return false; }
    public boolean shouldRegisterAttributionSource() { return false; }
    public boolean signaturePermissionAllowlistEnabled() { return false; }
    public boolean systemServerRoleControllerEnabled() { return false; }
    public boolean voiceActivationPermissionApis() { return false; }
    public boolean walletRoleEnabled() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.permission.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
