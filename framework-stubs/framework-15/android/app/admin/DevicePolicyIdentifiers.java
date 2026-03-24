package android.app.admin;

public final class DevicePolicyIdentifiers {
    public static final java.lang.String AUTO_TIMEZONE_POLICY = "autoTimezone";
    public static final java.lang.String PERMISSION_GRANT_POLICY = "permissionGrant";
    @android.annotation.FlaggedApi("android.app.admin.flags.security_log_v2_enabled")
    public static final java.lang.String SECURITY_LOGGING_POLICY = "securityLogging";
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.app.admin.flags.security_log_v2_enabled")
    public static final java.lang.String AUDIT_LOGGING_POLICY = "auditLogging";
    public static final java.lang.String LOCK_TASK_POLICY = "lockTask";
    public static final java.lang.String USER_CONTROL_DISABLED_PACKAGES_POLICY = "userControlDisabledPackages";
    public static final java.lang.String PERSISTENT_PREFERRED_ACTIVITY_POLICY = "persistentPreferredActivity";
    public static final java.lang.String PACKAGE_UNINSTALL_BLOCKED_POLICY = "packageUninstallBlocked";
    public static final java.lang.String APPLICATION_RESTRICTIONS_POLICY = "applicationRestrictions";
    public static final java.lang.String RESET_PASSWORD_TOKEN_POLICY = "resetPasswordToken";
    public static final java.lang.String ACCOUNT_MANAGEMENT_DISABLED_POLICY = "accountManagementDisabled";
    public static final java.lang.String APPLICATION_HIDDEN_POLICY = "applicationHidden";
    public static final java.lang.String CAMERA_DISABLED_POLICY = "cameraDisabled";
    public static final java.lang.String STATUS_BAR_DISABLED_POLICY = "statusBarDisabled";
    public static final java.lang.String PACKAGES_SUSPENDED_POLICY = "packagesSuspended";
    public static final java.lang.String KEYGUARD_DISABLED_FEATURES_POLICY = "keyguardDisabledFeatures";
    public static final java.lang.String AUTO_TIME_POLICY = "autoTime";
    public static final java.lang.String BACKUP_SERVICE_POLICY = "backupService";
    public static final java.lang.String PERMITTED_INPUT_METHODS_POLICY = "permittedInputMethods";
    public static final java.lang.String PERSONAL_APPS_SUSPENDED_POLICY = "personalAppsSuspended";
    public static final java.lang.String SCREEN_CAPTURE_DISABLED_POLICY = "screenCaptureDisabled";
    public static final java.lang.String TRUST_AGENT_CONFIGURATION_POLICY = "trustAgentConfiguration";
    public static final java.lang.String CROSS_PROFILE_INTENT_FILTER_POLICY = "crossProfileIntentFilter";
    public static final java.lang.String CROSS_PROFILE_WIDGET_PROVIDER_POLICY = "crossProfileWidgetProvider";
    @android.annotation.FlaggedApi("android.view.contentprotection.flags.manage_device_policy_enabled")
    public static final java.lang.String CONTENT_PROTECTION_POLICY = "contentProtection";
    @android.annotation.FlaggedApi("android.app.admin.flags.policy_engine_migration_v2_enabled")
    public static final java.lang.String USB_DATA_SIGNALING_POLICY = "usbDataSignaling";
    @android.annotation.FlaggedApi("android.app.admin.flags.policy_engine_migration_v2_enabled")
    public static final java.lang.String PASSWORD_COMPLEXITY_POLICY = "passwordComplexity";
    public static final java.lang.String USER_RESTRICTION_PREFIX = "userRestriction_";
    @android.annotation.NonNull
    public static java.lang.String getIdentifierForUserRestriction(java.lang.String p0) { return null; }
}
