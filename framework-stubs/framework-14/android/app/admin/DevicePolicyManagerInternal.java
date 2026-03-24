package android.app.admin;

public abstract class DevicePolicyManagerInternal {
    public DevicePolicyManagerInternal() {}
    public abstract java.util.List<java.lang.String> getCrossProfileWidgetProviders(int p0);
    public abstract void addOnCrossProfileWidgetProvidersChangeListener(android.app.admin.DevicePolicyManagerInternal.OnCrossProfileWidgetProvidersChangeListener p0);
    public abstract android.content.ComponentName getProfileOwnerOrDeviceOwnerSupervisionComponent(android.os.UserHandle p0);
    public abstract boolean isActiveDeviceOwner(int p0);
    public abstract boolean isActiveProfileOwner(int p0);
    public abstract boolean isActiveSupervisionApp(int p0);
    public abstract android.content.Intent createShowAdminSupportIntent(int p0, boolean p1);
    public abstract android.content.Intent createUserRestrictionSupportIntent(int p0, java.lang.String p1);
    public abstract boolean isUserAffiliatedWithDevice(int p0);
    public abstract boolean canSilentlyInstallPackage(java.lang.String p0, int p1);
    public abstract void reportSeparateProfileChallengeChanged(int p0);
    public abstract java.lang.CharSequence getPrintingDisabledReasonForUser(int p0);
    protected abstract android.app.admin.DevicePolicyCache getDevicePolicyCache();
    protected abstract android.app.admin.DeviceStateCache getDeviceStateCache();
    public abstract java.util.List<java.lang.String> getAllCrossProfilePackages(int p0);
    public abstract java.util.List<java.lang.String> getDefaultCrossProfilePackages();
    public abstract void broadcastIntentToManifestReceivers(android.content.Intent p0, android.os.UserHandle p1, boolean p2);
    public abstract android.content.ComponentName getProfileOwnerAsUser(int p0);
    public abstract int getDeviceOwnerUserId();
    public abstract boolean isDeviceOrProfileOwnerInCallingUser(java.lang.String p0);
    public abstract boolean supportsResetOp(int p0);
    public abstract void resetOp(int p0, java.lang.String p1, int p2);
    public abstract void enforcePermission(java.lang.String p0, java.lang.String p1, int p2);
    public abstract boolean hasPermission(java.lang.String p0, java.lang.String p1, int p2);
    public abstract boolean isKeepProfilesRunningEnabled();
    public abstract boolean isUserOrganizationManaged(int p0);
    public abstract java.util.Set<java.lang.String> getPackagesSuspendedByAdmin(int p0);
    public abstract boolean isApplicationExemptionsFlagEnabled();
    public abstract java.util.List<android.os.Bundle> getApplicationRestrictionsPerAdminForUser(java.lang.String p0, int p1);
    public abstract java.util.List<android.os.UserManager.EnforcingUser> getUserRestrictionSources(java.lang.String p0, int p1);

    public static interface OnCrossProfileWidgetProvidersChangeListener {
        public void onCrossProfileWidgetProvidersChanged(int p0, java.util.List<java.lang.String> p1);
    }
}
