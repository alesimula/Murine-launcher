package android.app.admin;

public abstract class DevicePolicyManagerInternal {
    public DevicePolicyManagerInternal() {}
    public abstract java.util.List<java.lang.String> getCrossProfileWidgetProviders(int p0);
    public abstract void addOnCrossProfileWidgetProvidersChangeListener(android.app.admin.DevicePolicyManagerInternal.OnCrossProfileWidgetProvidersChangeListener p0);
    public abstract boolean isActiveAdminWithPolicy(int p0, int p1);
    public abstract android.content.Intent createShowAdminSupportIntent(int p0, boolean p1);
    public abstract android.content.Intent createUserRestrictionSupportIntent(int p0, java.lang.String p1);
    public abstract boolean isUserAffiliatedWithDevice(int p0);
    public abstract boolean canSilentlyInstallPackage(java.lang.String p0, int p1);
    public abstract void reportSeparateProfileChallengeChanged(int p0);
    public abstract boolean canUserHaveUntrustedCredentialReset(int p0);
    public abstract java.lang.CharSequence getPrintingDisabledReasonForUser(int p0);
    protected abstract android.app.admin.DevicePolicyCache getDevicePolicyCache();

    public static interface OnCrossProfileWidgetProvidersChangeListener {
        public void onCrossProfileWidgetProvidersChanged(int p0, java.util.List<java.lang.String> p1);
    }
}
