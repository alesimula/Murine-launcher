package android.security.advancedprotection;

@android.annotation.FlaggedApi("android.security.aapm_api")
public final class AdvancedProtectionManager {
    public static final java.lang.String ADVANCED_PROTECTION_SYSTEM_ENTITY = "android.security.advancedprotection";
    @android.annotation.SystemApi
    public static final int FEATURE_ID_DISALLOW_CELLULAR_2G = 0;
    @android.annotation.SystemApi
    public static final int FEATURE_ID_DISALLOW_INSTALL_UNKNOWN_SOURCES = 1;
    @android.annotation.SystemApi
    public static final int FEATURE_ID_DISALLOW_USB = 2;
    @android.annotation.SystemApi
    public static final int FEATURE_ID_DISALLOW_WEP = 3;
    @android.annotation.SystemApi
    public static final int FEATURE_ID_ENABLE_MTE = 4;
    public static final java.lang.String ACTION_SHOW_ADVANCED_PROTECTION_SUPPORT_DIALOG = "android.security.advancedprotection.action.SHOW_ADVANCED_PROTECTION_SUPPORT_DIALOG";
    public static final java.lang.String EXTRA_SUPPORT_DIALOG_FEATURE = "android.security.advancedprotection.extra.SUPPORT_DIALOG_FEATURE";
    public static final java.lang.String EXTRA_SUPPORT_DIALOG_TYPE = "android.security.advancedprotection.extra.SUPPORT_DIALOG_TYPE";
    public static final int SUPPORT_DIALOG_TYPE_UNKNOWN = 0;
    public static final int SUPPORT_DIALOG_TYPE_BLOCKED_INTERACTION = 1;
    public static final int SUPPORT_DIALOG_TYPE_DISABLED_SETTING = 2;
    public static java.lang.String featureIdToString(int p0) { return null; }
    public static java.lang.String supportDialogTypeToString(int p0) { return null; }
    public AdvancedProtectionManager(android.security.advancedprotection.IAdvancedProtectionService p0) {}
    @android.annotation.RequiresPermission("android.permission.QUERY_ADVANCED_PROTECTION_MODE")
    public boolean isAdvancedProtectionEnabled() { return false; }
    @android.annotation.RequiresPermission("android.permission.QUERY_ADVANCED_PROTECTION_MODE")
    public void registerAdvancedProtectionCallback(java.util.concurrent.Executor p0, android.security.advancedprotection.AdvancedProtectionManager.Callback p1) {}
    @android.annotation.RequiresPermission("android.permission.QUERY_ADVANCED_PROTECTION_MODE")
    public void unregisterAdvancedProtectionCallback(android.security.advancedprotection.AdvancedProtectionManager.Callback p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_ADVANCED_PROTECTION_MODE")
    public void setAdvancedProtectionEnabled(boolean p0) {}
    @android.annotation.SystemApi
    @android.annotation.NonNull
    @android.annotation.RequiresPermission("android.permission.MANAGE_ADVANCED_PROTECTION_MODE")
    public java.util.List<android.security.advancedprotection.AdvancedProtectionFeature> getAdvancedProtectionFeatures() { return null; }
    @android.annotation.NonNull
    public static android.content.Intent createSupportIntent(int p0, int p1) { return null; }
    @android.annotation.NonNull
    public static android.content.Intent createSupportIntentForPolicyIdentifierOrRestriction(java.lang.String p0, int p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ADVANCED_PROTECTION_MODE")
    public void logDialogShown(int p0, int p1, boolean p2) {}

    @android.annotation.FlaggedApi("android.security.aapm_api")
    public static interface Callback {
        public void onAdvancedProtectionChanged(boolean p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FeatureId {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SupportDialogType {
    }
}
