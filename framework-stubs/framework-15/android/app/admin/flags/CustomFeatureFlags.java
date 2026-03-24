package android.app.admin.flags;

public class CustomFeatureFlags implements android.app.admin.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.app.admin.flags.FeatureFlags>> p0) {}
    public boolean allowQueryingProfileType() { return false; }
    public boolean allowScreenBrightnessControlOnCope() { return false; }
    public boolean alwaysPersistDo() { return false; }
    public boolean assistContentUserRestrictionEnabled() { return false; }
    public boolean backupConnectedAppsSettings() { return false; }
    public boolean backupServiceSecurityLogEventEnabled() { return false; }
    public boolean coexistenceMigrationForNonEmmManagementEnabled() { return false; }
    public boolean copyAccountWithRetryEnabled() { return false; }
    public boolean crossUserSuspensionEnabledRo() { return false; }
    public boolean dedicatedDeviceControlApiEnabled() { return false; }
    public boolean dedicatedDeviceControlEnabled() { return false; }
    public boolean defaultSmsPersonalAppSuspensionFixEnabled() { return false; }
    public boolean deletePrivateSpaceUnderRestriction() { return false; }
    public boolean devicePolicySizeTrackingEnabled() { return false; }
    public boolean devicePolicySizeTrackingInternalBugFixEnabled() { return false; }
    public boolean devicePolicySizeTrackingInternalEnabled() { return false; }
    public boolean deviceTheftApiEnabled() { return false; }
    public boolean deviceTheftImplEnabled() { return false; }
    public boolean disallowUserControlBgUsageFix() { return false; }
    public boolean disallowUserControlStoppedStateFix() { return false; }
    public boolean dmrhSetAppRestrictions() { return false; }
    public boolean dumpsysPolicyEngineMigrationEnabled() { return false; }
    public boolean esimManagementEnabled() { return false; }
    public boolean esimManagementUxEnabled() { return false; }
    public boolean headlessDeviceOwnerDelegateSecurityLoggingBugFix() { return false; }
    public boolean headlessDeviceOwnerProvisioningFixEnabled() { return false; }
    public boolean headlessDeviceOwnerSingleUserEnabled() { return false; }
    public boolean headlessSingleMinTargetSdk() { return false; }
    public boolean headlessSingleUserBadDeviceAdminStateFix() { return false; }
    public boolean headlessSingleUserCompatibilityFix() { return false; }
    public boolean headlessSingleUserFixes() { return false; }
    public boolean hsumUnlockNotificationFix() { return false; }
    public boolean isMtePolicyEnforced() { return false; }
    public boolean isRecursiveRequiredAppMergingEnabled() { return false; }
    public boolean onboardingBugreportStorageBugFix() { return false; }
    public boolean onboardingBugreportV2Enabled() { return false; }
    public boolean onboardingConsentlessBugreports() { return false; }
    public boolean permissionMigrationForZeroTrustApiEnabled() { return false; }
    public boolean permissionMigrationForZeroTrustImplEnabled() { return false; }
    public boolean policyEngineMigrationV2Enabled() { return false; }
    public boolean powerExemptionBgUsageFix() { return false; }
    public boolean quietModeCredentialBugFix() { return false; }
    public boolean securityLogV2Enabled() { return false; }
    public boolean unmanagedModeMigration() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.app.admin.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
