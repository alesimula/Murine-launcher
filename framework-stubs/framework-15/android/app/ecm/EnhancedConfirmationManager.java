package android.app.ecm;

public final class EnhancedConfirmationManager {
    public static final java.lang.String ACTION_SHOW_ECM_RESTRICTED_SETTING_DIALOG = "android.app.ecm.action.SHOW_ECM_RESTRICTED_SETTING_DIALOG";
    EnhancedConfirmationManager() {}
    public void clearRestriction(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException {}
    @android.annotation.NonNull
    public android.content.Intent createRestrictedSettingDialogIntent(java.lang.String p0, java.lang.String p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public boolean isClearRestrictionAllowed(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return false; }
    public boolean isRestricted(java.lang.String p0, java.lang.String p1) throws android.content.pm.PackageManager.NameNotFoundException { return false; }
    public void setClearRestrictionAllowed(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException {}
}
