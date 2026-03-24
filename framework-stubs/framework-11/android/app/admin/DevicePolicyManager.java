package android.app.admin;

public class DevicePolicyManager {
    private static java.lang.String TAG;
    private final android.content.Context mContext = null;
    private final android.app.admin.IDevicePolicyManager mService = null;
    private final boolean mParentInstance = false;
    public static final java.lang.String ACTION_PROVISION_MANAGED_PROFILE = "android.app.action.PROVISION_MANAGED_PROFILE";
    public static final java.lang.String ACTION_PROVISION_MANAGED_USER = "android.app.action.PROVISION_MANAGED_USER";
    public static final java.lang.String ACTION_PROVISION_MANAGED_DEVICE = "android.app.action.PROVISION_MANAGED_DEVICE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_STATE_USER_SETUP_COMPLETE = "android.app.action.STATE_USER_SETUP_COMPLETE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_PROVISION_MANAGED_DEVICE_FROM_TRUSTED_SOURCE = "android.app.action.PROVISION_MANAGED_DEVICE_FROM_TRUSTED_SOURCE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_PROVISION_FINANCED_DEVICE = "android.app.action.PROVISION_FINANCED_DEVICE";
    public static final java.lang.String ACTION_PROVISION_MANAGED_SHAREABLE_DEVICE = "android.app.action.PROVISION_MANAGED_SHAREABLE_DEVICE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_PROVISION_FINALIZATION = "android.app.action.PROVISION_FINALIZATION";
    public static final java.lang.String ACTION_BUGREPORT_SHARING_ACCEPTED = "com.android.server.action.REMOTE_BUGREPORT_SHARING_ACCEPTED";
    public static final java.lang.String ACTION_BUGREPORT_SHARING_DECLINED = "com.android.server.action.REMOTE_BUGREPORT_SHARING_DECLINED";
    public static final java.lang.String ACTION_REMOTE_BUGREPORT_DISPATCH = "android.intent.action.REMOTE_BUGREPORT_DISPATCH";
    public static final java.lang.String EXTRA_REMOTE_BUGREPORT_HASH = "android.intent.extra.REMOTE_BUGREPORT_HASH";
    public static final java.lang.String EXTRA_BUGREPORT_NOTIFICATION_TYPE = "android.app.extra.bugreport_notification_type";
    public static final int NOTIFICATION_BUGREPORT_STARTED = 1;
    public static final int NOTIFICATION_BUGREPORT_ACCEPTED_NOT_FINISHED = 2;
    public static final int NOTIFICATION_BUGREPORT_FINISHED_NOT_ACCEPTED = 3;
    public static final long DEFAULT_STRONG_AUTH_TIMEOUT_MS = 259200000L;
    public static final java.lang.String EXTRA_PROVISIONING_ADMIN_EXTRAS_BUNDLE = "android.app.extra.PROVISIONING_ADMIN_EXTRAS_BUNDLE";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_NAME = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_NAME";
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_COMPONENT_NAME = "android.app.extra.PROVISIONING_DEVICE_ADMIN_COMPONENT_NAME";
    public static final java.lang.String EXTRA_PROVISIONING_ACCOUNT_TO_MIGRATE = "android.app.extra.PROVISIONING_ACCOUNT_TO_MIGRATE";
    public static final java.lang.String EXTRA_PROVISIONING_KEEP_ACCOUNT_ON_MIGRATION = "android.app.extra.PROVISIONING_KEEP_ACCOUNT_ON_MIGRATION";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_PROVISIONING_EMAIL_ADDRESS = "android.app.extra.PROVISIONING_EMAIL_ADDRESS";
    public static final java.lang.String EXTRA_PROVISIONING_MAIN_COLOR = "android.app.extra.PROVISIONING_MAIN_COLOR";
    public static final java.lang.String EXTRA_PROVISIONING_LEAVE_ALL_SYSTEM_APPS_ENABLED = "android.app.extra.PROVISIONING_LEAVE_ALL_SYSTEM_APPS_ENABLED";
    public static final java.lang.String EXTRA_PROVISIONING_TIME_ZONE = "android.app.extra.PROVISIONING_TIME_ZONE";
    public static final java.lang.String EXTRA_PROVISIONING_LOCAL_TIME = "android.app.extra.PROVISIONING_LOCAL_TIME";
    public static final java.lang.String EXTRA_PROVISIONING_LOCALE = "android.app.extra.PROVISIONING_LOCALE";
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_SSID = "android.app.extra.PROVISIONING_WIFI_SSID";
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_HIDDEN = "android.app.extra.PROVISIONING_WIFI_HIDDEN";
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_SECURITY_TYPE = "android.app.extra.PROVISIONING_WIFI_SECURITY_TYPE";
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_PASSWORD = "android.app.extra.PROVISIONING_WIFI_PASSWORD";
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_EAP_METHOD = "android.app.extra.PROVISIONING_WIFI_EAP_METHOD";
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_PHASE2_AUTH = "android.app.extra.PROVISIONING_WIFI_PHASE2_AUTH";
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_CA_CERTIFICATE = "android.app.extra.PROVISIONING_WIFI_CA_CERTIFICATE";
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_USER_CERTIFICATE = "android.app.extra.PROVISIONING_WIFI_USER_CERTIFICATE";
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_IDENTITY = "android.app.extra.PROVISIONING_WIFI_IDENTITY";
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_ANONYMOUS_IDENTITY = "android.app.extra.PROVISIONING_WIFI_ANONYMOUS_IDENTITY";
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_DOMAIN = "android.app.extra.PROVISIONING_WIFI_DOMAIN";
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_PROXY_HOST = "android.app.extra.PROVISIONING_WIFI_PROXY_HOST";
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_PROXY_PORT = "android.app.extra.PROVISIONING_WIFI_PROXY_PORT";
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_PROXY_BYPASS = "android.app.extra.PROVISIONING_WIFI_PROXY_BYPASS";
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_PAC_URL = "android.app.extra.PROVISIONING_WIFI_PAC_URL";
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_LOCATION = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_LOCATION";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PROVISIONING_ORGANIZATION_NAME = "android.app.extra.PROVISIONING_ORGANIZATION_NAME";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PROVISIONING_SUPPORT_URL = "android.app.extra.PROVISIONING_SUPPORT_URL";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_LABEL = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_LABEL";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_ICON_URI = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_ICON_URI";
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_MINIMUM_VERSION_CODE = "android.app.extra.PROVISIONING_DEVICE_ADMIN_MINIMUM_VERSION_CODE";
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_COOKIE_HEADER = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_COOKIE_HEADER";
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_CHECKSUM = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_CHECKSUM";
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_SIGNATURE_CHECKSUM = "android.app.extra.PROVISIONING_DEVICE_ADMIN_SIGNATURE_CHECKSUM";
    public static final java.lang.String ACTION_MANAGED_PROFILE_PROVISIONED = "android.app.action.MANAGED_PROFILE_PROVISIONED";
    public static final java.lang.String ACTION_PROVISIONING_SUCCESSFUL = "android.app.action.PROVISIONING_SUCCESSFUL";
    public static final java.lang.String EXTRA_PROVISIONING_SKIP_ENCRYPTION = "android.app.extra.PROVISIONING_SKIP_ENCRYPTION";
    public static final java.lang.String EXTRA_PROVISIONING_LOGO_URI = "android.app.extra.PROVISIONING_LOGO_URI";
    public static final java.lang.String EXTRA_PROVISIONING_DISCLAIMERS = "android.app.extra.PROVISIONING_DISCLAIMERS";
    public static final java.lang.String EXTRA_PROVISIONING_DISCLAIMER_HEADER = "android.app.extra.PROVISIONING_DISCLAIMER_HEADER";
    public static final java.lang.String EXTRA_PROVISIONING_DISCLAIMER_CONTENT = "android.app.extra.PROVISIONING_DISCLAIMER_CONTENT";
    public static final java.lang.String EXTRA_PROVISIONING_SKIP_USER_SETUP = "android.app.extra.PROVISIONING_SKIP_USER_SETUP";
    public static final java.lang.String EXTRA_PROVISIONING_SKIP_USER_CONSENT = "android.app.extra.PROVISIONING_SKIP_USER_CONSENT";
    public static final java.lang.String EXTRA_PROVISIONING_SKIP_EDUCATION_SCREENS = "android.app.extra.PROVISIONING_SKIP_EDUCATION_SCREENS";
    public static final java.lang.String EXTRA_PROVISIONING_USE_MOBILE_DATA = "android.app.extra.PROVISIONING_USE_MOBILE_DATA";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PROVISIONING_TRIGGER = "android.app.extra.PROVISIONING_TRIGGER";
    @android.annotation.SystemApi
    public static final int PROVISIONING_TRIGGER_UNSPECIFIED = 0;
    @android.annotation.SystemApi
    public static final int PROVISIONING_TRIGGER_CLOUD_ENROLLMENT = 1;
    @android.annotation.SystemApi
    public static final int PROVISIONING_TRIGGER_QR_CODE = 2;
    @android.annotation.SystemApi
    public static final int PROVISIONING_TRIGGER_PERSISTENT_DEVICE_OWNER = 3;
    public static final java.lang.String MIME_TYPE_PROVISIONING_NFC = "application/com.android.managedprovisioning";
    public static final java.lang.String ACTION_ADD_DEVICE_ADMIN = "android.app.action.ADD_DEVICE_ADMIN";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_SET_PROFILE_OWNER = "android.app.action.SET_PROFILE_OWNER";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PROFILE_OWNER_NAME = "android.app.extra.PROFILE_OWNER_NAME";
    public static final java.lang.String ACTION_DEVICE_POLICY_MANAGER_STATE_CHANGED = "android.app.action.DEVICE_POLICY_MANAGER_STATE_CHANGED";
    public static final java.lang.String ACTION_DEVICE_OWNER_CHANGED = "android.app.action.DEVICE_OWNER_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_RESET_PROTECTION_POLICY_CHANGED = "android.app.action.RESET_PROTECTION_POLICY_CHANGED";
    public static final java.lang.String EXTRA_DEVICE_ADMIN = "android.app.extra.DEVICE_ADMIN";
    public static final java.lang.String EXTRA_ADD_EXPLANATION = "android.app.extra.ADD_EXPLANATION";
    public static final java.lang.String POLICY_DISABLE_CAMERA = "policy_disable_camera";
    public static final java.lang.String POLICY_DISABLE_SCREEN_CAPTURE = "policy_disable_screen_capture";
    public static final java.lang.String POLICY_SUSPEND_PACKAGES = "policy_suspend_packages";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_RESTRICTION = "android.app.extra.RESTRICTION";
    public static final java.lang.String ACTION_SET_NEW_PASSWORD = "android.app.action.SET_NEW_PASSWORD";
    public static final java.lang.String EXTRA_PASSWORD_COMPLEXITY = "android.app.extra.PASSWORD_COMPLEXITY";
    public static final int PASSWORD_COMPLEXITY_NONE = 0;
    public static final int PASSWORD_COMPLEXITY_LOW = 65536;
    public static final int PASSWORD_COMPLEXITY_MEDIUM = 196608;
    public static final int PASSWORD_COMPLEXITY_HIGH = 327680;
    public static final java.lang.String ACTION_SET_NEW_PARENT_PROFILE_PASSWORD = "android.app.action.SET_NEW_PARENT_PROFILE_PASSWORD";
    public static final java.lang.String ACTION_SHOW_DEVICE_MONITORING_DIALOG = "android.app.action.SHOW_DEVICE_MONITORING_DIALOG";
    public static final java.lang.String ACTION_APPLICATION_DELEGATION_SCOPES_CHANGED = "android.app.action.APPLICATION_DELEGATION_SCOPES_CHANGED";
    public static final java.lang.String EXTRA_DELEGATION_SCOPES = "android.app.extra.DELEGATION_SCOPES";
    public static final int FLAG_PARENT_CAN_ACCESS_MANAGED = 1;
    public static final int FLAG_MANAGED_CAN_ACCESS_PARENT = 2;
    public static final java.lang.String ACTION_SYSTEM_UPDATE_POLICY_CHANGED = "android.app.action.SYSTEM_UPDATE_POLICY_CHANGED";
    public static final java.lang.String ACTION_DATA_SHARING_RESTRICTION_CHANGED = "android.app.action.DATA_SHARING_RESTRICTION_CHANGED";
    public static final java.lang.String ACTION_DATA_SHARING_RESTRICTION_APPLIED = "android.app.action.DATA_SHARING_RESTRICTION_APPLIED";
    public static final int PERMISSION_POLICY_PROMPT = 0;
    public static final int PERMISSION_POLICY_AUTO_GRANT = 1;
    public static final int PERMISSION_POLICY_AUTO_DENY = 2;
    public static final int PERMISSION_GRANT_STATE_DEFAULT = 0;
    public static final int PERMISSION_GRANT_STATE_GRANTED = 1;
    public static final int PERMISSION_GRANT_STATE_DENIED = 2;
    public static final java.lang.String DELEGATION_CERT_INSTALL = "delegation-cert-install";
    public static final java.lang.String DELEGATION_APP_RESTRICTIONS = "delegation-app-restrictions";
    public static final java.lang.String DELEGATION_BLOCK_UNINSTALL = "delegation-block-uninstall";
    public static final java.lang.String DELEGATION_PERMISSION_GRANT = "delegation-permission-grant";
    public static final java.lang.String DELEGATION_PACKAGE_ACCESS = "delegation-package-access";
    public static final java.lang.String DELEGATION_ENABLE_SYSTEM_APP = "delegation-enable-system-app";
    public static final java.lang.String DELEGATION_INSTALL_EXISTING_PACKAGE = "delegation-install-existing-package";
    public static final java.lang.String DELEGATION_KEEP_UNINSTALLED_PACKAGES = "delegation-keep-uninstalled-packages";
    public static final java.lang.String DELEGATION_NETWORK_LOGGING = "delegation-network-logging";
    public static final java.lang.String DELEGATION_CERT_SELECTION = "delegation-cert-selection";
    @android.annotation.SystemApi
    public static final int STATE_USER_UNMANAGED = 0;
    @android.annotation.SystemApi
    public static final int STATE_USER_SETUP_INCOMPLETE = 1;
    @android.annotation.SystemApi
    public static final int STATE_USER_SETUP_COMPLETE = 2;
    @android.annotation.SystemApi
    public static final int STATE_USER_SETUP_FINALIZED = 3;
    @android.annotation.SystemApi
    public static final int STATE_USER_PROFILE_COMPLETE = 4;
    public static final int CODE_OK = 0;
    public static final int CODE_HAS_DEVICE_OWNER = 1;
    public static final int CODE_USER_HAS_PROFILE_OWNER = 2;
    public static final int CODE_USER_NOT_RUNNING = 3;
    public static final int CODE_USER_SETUP_COMPLETED = 4;
    public static final int CODE_NONSYSTEM_USER_EXISTS = 5;
    public static final int CODE_ACCOUNTS_NOT_EMPTY = 6;
    public static final int CODE_NOT_SYSTEM_USER = 7;
    public static final int CODE_HAS_PAIRED = 8;
    public static final int CODE_MANAGED_USERS_NOT_SUPPORTED = 9;
    public static final int CODE_SYSTEM_USER = 10;
    public static final int CODE_CANNOT_ADD_MANAGED_PROFILE = 11;
    public static final int CODE_NOT_SYSTEM_USER_SPLIT = 12;
    public static final int CODE_DEVICE_ADMIN_NOT_SUPPORTED = 13;
    public static final int CODE_SPLIT_SYSTEM_USER_DEVICE_SYSTEM_USER = 14;
    public static final int LOCK_TASK_FEATURE_NONE = 0;
    public static final int LOCK_TASK_FEATURE_SYSTEM_INFO = 1;
    public static final int LOCK_TASK_FEATURE_NOTIFICATIONS = 2;
    public static final int LOCK_TASK_FEATURE_HOME = 4;
    public static final int LOCK_TASK_FEATURE_OVERVIEW = 8;
    public static final int LOCK_TASK_FEATURE_GLOBAL_ACTIONS = 16;
    public static final int LOCK_TASK_FEATURE_KEYGUARD = 32;
    public static final int LOCK_TASK_FEATURE_BLOCK_ACTIVITY_START_IN_TASK = 64;
    public static final java.lang.String ACTION_DEVICE_ADMIN_SERVICE = "android.app.action.DEVICE_ADMIN_SERVICE";
    public static final int ID_TYPE_BASE_INFO = 1;
    public static final int ID_TYPE_SERIAL = 2;
    public static final int ID_TYPE_IMEI = 4;
    public static final int ID_TYPE_MEID = 8;
    public static final int ID_TYPE_INDIVIDUAL_ATTESTATION = 16;
    public static final int KEY_GEN_STRONGBOX_UNAVAILABLE = 1;
    public static final int INSTALLKEY_REQUEST_CREDENTIALS_ACCESS = 1;
    public static final int INSTALLKEY_SET_USER_SELECTABLE = 2;
    public static final java.lang.String ACTION_PROFILE_OWNER_CHANGED = "android.app.action.PROFILE_OWNER_CHANGED";
    public static final int PRIVATE_DNS_MODE_UNKNOWN = 0;
    public static final int PRIVATE_DNS_MODE_OFF = 1;
    public static final int PRIVATE_DNS_MODE_OPPORTUNISTIC = 2;
    public static final int PRIVATE_DNS_MODE_PROVIDER_HOSTNAME = 3;
    public static final int PRIVATE_DNS_SET_NO_ERROR = 0;
    public static final int PRIVATE_DNS_SET_ERROR_HOST_NOT_SERVING = 1;
    public static final int PRIVATE_DNS_SET_ERROR_FAILURE_SETTING = 2;
    public static final java.lang.String ACTION_GET_PROVISIONING_MODE = "android.app.action.GET_PROVISIONING_MODE";
    public static final java.lang.String EXTRA_PROVISIONING_IMEI = "android.app.extra.PROVISIONING_IMEI";
    public static final java.lang.String EXTRA_PROVISIONING_SERIAL_NUMBER = "android.app.extra.PROVISIONING_SERIAL_NUMBER";
    public static final java.lang.String EXTRA_PROVISIONING_MODE = "android.app.extra.PROVISIONING_MODE";
    public static final int PROVISIONING_MODE_FULLY_MANAGED_DEVICE = 1;
    public static final int PROVISIONING_MODE_MANAGED_PROFILE = 2;
    public static final java.lang.String ACTION_ADMIN_POLICY_COMPLIANCE = "android.app.action.ADMIN_POLICY_COMPLIANCE";
    public static final int MAX_PASSWORD_LENGTH = 16;
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_BIND_SECONDARY_LOCKSCREEN_SERVICE = "android.app.action.BIND_SECONDARY_LOCKSCREEN_SERVICE";
    public static final int PERSONAL_APPS_NOT_SUSPENDED = 0;
    public static final int PERSONAL_APPS_SUSPENDED_EXPLICITLY = 1;
    public static final int PERSONAL_APPS_SUSPENDED_PROFILE_TIMEOUT = 2;
    public static final int PASSWORD_QUALITY_UNSPECIFIED = 0;
    public static final int PASSWORD_QUALITY_BIOMETRIC_WEAK = 32768;
    public static final int PASSWORD_QUALITY_SOMETHING = 65536;
    public static final int PASSWORD_QUALITY_NUMERIC = 131072;
    public static final int PASSWORD_QUALITY_NUMERIC_COMPLEX = 196608;
    public static final int PASSWORD_QUALITY_ALPHABETIC = 262144;
    public static final int PASSWORD_QUALITY_ALPHANUMERIC = 327680;
    public static final int PASSWORD_QUALITY_COMPLEX = 393216;
    public static final int PASSWORD_QUALITY_MANAGED = 524288;
    @android.annotation.SystemApi
    public static final java.lang.String ACCOUNT_FEATURE_DEVICE_OR_PROFILE_OWNER_ALLOWED = "android.account.DEVICE_OR_PROFILE_OWNER_ALLOWED";
    @android.annotation.SystemApi
    public static final java.lang.String ACCOUNT_FEATURE_DEVICE_OR_PROFILE_OWNER_DISALLOWED = "android.account.DEVICE_OR_PROFILE_OWNER_DISALLOWED";
    public static final int RESET_PASSWORD_REQUIRE_ENTRY = 1;
    public static final int RESET_PASSWORD_DO_NOT_ASK_CREDENTIALS_ON_BOOT = 2;
    public static final int FLAG_EVICT_CREDENTIAL_ENCRYPTION_KEY = 1;
    public static final int WIPE_EXTERNAL_STORAGE = 1;
    public static final int WIPE_RESET_PROTECTION_DATA = 2;
    public static final int WIPE_EUICC = 4;
    public static final int WIPE_SILENTLY = 8;
    public static final int ENCRYPTION_STATUS_UNSUPPORTED = 0;
    public static final int ENCRYPTION_STATUS_INACTIVE = 1;
    public static final int ENCRYPTION_STATUS_ACTIVATING = 2;
    public static final int ENCRYPTION_STATUS_ACTIVE = 3;
    public static final int ENCRYPTION_STATUS_ACTIVE_DEFAULT_KEY = 4;
    public static final int ENCRYPTION_STATUS_ACTIVE_PER_USER = 5;
    public static final java.lang.String ACTION_START_ENCRYPTION = "android.app.action.START_ENCRYPTION";
    public static final java.lang.String ACTION_CHECK_POLICY_COMPLIANCE = "android.app.action.CHECK_POLICY_COMPLIANCE";
    public static final java.lang.String ACTION_MANAGED_USER_CREATED = "android.app.action.MANAGED_USER_CREATED";
    public static final int KEYGUARD_DISABLE_FEATURES_NONE = 0;
    public static final int KEYGUARD_DISABLE_WIDGETS_ALL = 1;
    public static final int KEYGUARD_DISABLE_SECURE_CAMERA = 2;
    public static final int KEYGUARD_DISABLE_SECURE_NOTIFICATIONS = 4;
    public static final int KEYGUARD_DISABLE_UNREDACTED_NOTIFICATIONS = 8;
    public static final int KEYGUARD_DISABLE_TRUST_AGENTS = 16;
    public static final int KEYGUARD_DISABLE_FINGERPRINT = 32;
    public static final int KEYGUARD_DISABLE_REMOTE_INPUT = 64;
    public static final int KEYGUARD_DISABLE_FACE = 128;
    public static final int KEYGUARD_DISABLE_IRIS = 256;
    public static final int KEYGUARD_DISABLE_BIOMETRICS = 416;
    public static final int KEYGUARD_DISABLE_FEATURES_ALL = 2147483647;
    public static final int NON_ORG_OWNED_PROFILE_KEYGUARD_FEATURES_AFFECT_OWNER = 432;
    public static final int ORG_OWNED_PROFILE_KEYGUARD_FEATURES_PARENT_ONLY = 6;
    public static final int PROFILE_KEYGUARD_FEATURES_AFFECT_OWNER = 438;
    public static final int ERROR_VPN_PACKAGE_NOT_FOUND = 1;
    public static final int SKIP_SETUP_WIZARD = 1;
    public static final int MAKE_USER_EPHEMERAL = 2;
    public static final int MAKE_USER_DEMO = 4;
    public static final int LEAVE_ALL_SYSTEM_APPS_ENABLED = 16;
    public DevicePolicyManager(android.content.Context p0, android.app.admin.IDevicePolicyManager p1) {}
    protected DevicePolicyManager(android.content.Context p0, android.app.admin.IDevicePolicyManager p1, boolean p2) {}
    protected int myUserId() { return 0; }
    public boolean isAdminActive(android.content.ComponentName p0) { return false; }
    public boolean isAdminActiveAsUser(android.content.ComponentName p0, int p1) { return false; }
    public boolean isRemovingAdmin(android.content.ComponentName p0, int p1) { return false; }
    public java.util.List<android.content.ComponentName> getActiveAdmins() { return null; }
    public java.util.List<android.content.ComponentName> getActiveAdminsAsUser(int p0) { return null; }
    @android.annotation.SystemApi
    public boolean packageHasActiveAdmins(java.lang.String p0) { return false; }
    public boolean packageHasActiveAdmins(java.lang.String p0, int p1) { return false; }
    public void removeActiveAdmin(android.content.ComponentName p0) {}
    public boolean hasGrantedPolicy(android.content.ComponentName p0, int p1) { return false; }
    public boolean isSeparateProfileChallengeAllowed(int p0) { return false; }
    public void setPasswordQuality(android.content.ComponentName p0, int p1) {}
    public int getPasswordQuality(android.content.ComponentName p0) { return 0; }
    public int getPasswordQuality(android.content.ComponentName p0, int p1) { return 0; }
    public void setPasswordMinimumLength(android.content.ComponentName p0, int p1) {}
    public int getPasswordMinimumLength(android.content.ComponentName p0) { return 0; }
    public int getPasswordMinimumLength(android.content.ComponentName p0, int p1) { return 0; }
    public void setPasswordMinimumUpperCase(android.content.ComponentName p0, int p1) {}
    public int getPasswordMinimumUpperCase(android.content.ComponentName p0) { return 0; }
    public int getPasswordMinimumUpperCase(android.content.ComponentName p0, int p1) { return 0; }
    public void setPasswordMinimumLowerCase(android.content.ComponentName p0, int p1) {}
    public int getPasswordMinimumLowerCase(android.content.ComponentName p0) { return 0; }
    public int getPasswordMinimumLowerCase(android.content.ComponentName p0, int p1) { return 0; }
    public void setPasswordMinimumLetters(android.content.ComponentName p0, int p1) {}
    public int getPasswordMinimumLetters(android.content.ComponentName p0) { return 0; }
    public int getPasswordMinimumLetters(android.content.ComponentName p0, int p1) { return 0; }
    public void setPasswordMinimumNumeric(android.content.ComponentName p0, int p1) {}
    public int getPasswordMinimumNumeric(android.content.ComponentName p0) { return 0; }
    public int getPasswordMinimumNumeric(android.content.ComponentName p0, int p1) { return 0; }
    public void setPasswordMinimumSymbols(android.content.ComponentName p0, int p1) {}
    public int getPasswordMinimumSymbols(android.content.ComponentName p0) { return 0; }
    public int getPasswordMinimumSymbols(android.content.ComponentName p0, int p1) { return 0; }
    public void setPasswordMinimumNonLetter(android.content.ComponentName p0, int p1) {}
    public int getPasswordMinimumNonLetter(android.content.ComponentName p0) { return 0; }
    public int getPasswordMinimumNonLetter(android.content.ComponentName p0, int p1) { return 0; }
    public android.app.admin.PasswordMetrics getPasswordMinimumMetrics(int p0) { return null; }
    public void setPasswordHistoryLength(android.content.ComponentName p0, int p1) {}
    public void setPasswordExpirationTimeout(android.content.ComponentName p0, long p1) {}
    public long getPasswordExpirationTimeout(android.content.ComponentName p0) { return 0L; }
    public long getPasswordExpiration(android.content.ComponentName p0) { return 0L; }
    public int getPasswordHistoryLength(android.content.ComponentName p0) { return 0; }
    public int getPasswordHistoryLength(android.content.ComponentName p0, int p1) { return 0; }
    public int getPasswordMaximumLength(int p0) { return 0; }
    public boolean isActivePasswordSufficient() { return false; }
    public int getPasswordComplexity() { return 0; }
    public boolean isUsingUnifiedPassword(android.content.ComponentName p0) { return false; }
    public boolean isProfileActivePasswordSufficientForParent(int p0) { return false; }
    public boolean isPasswordSufficientAfterProfileUnification(int p0, int p1) { return false; }
    public int getCurrentFailedPasswordAttempts() { return 0; }
    public int getCurrentFailedPasswordAttempts(int p0) { return 0; }
    public boolean getDoNotAskCredentialsOnBoot() { return false; }
    public void setMaximumFailedPasswordsForWipe(android.content.ComponentName p0, int p1) {}
    public int getMaximumFailedPasswordsForWipe(android.content.ComponentName p0) { return 0; }
    public int getMaximumFailedPasswordsForWipe(android.content.ComponentName p0, int p1) { return 0; }
    public int getProfileWithMinimumFailedPasswordsForWipe(int p0) { return 0; }
    @java.lang.Deprecated
    public boolean resetPassword(java.lang.String p0, int p1) { return false; }
    public boolean setResetPasswordToken(android.content.ComponentName p0, byte[] p1) { return false; }
    public boolean clearResetPasswordToken(android.content.ComponentName p0) { return false; }
    public boolean isResetPasswordTokenActive(android.content.ComponentName p0) { return false; }
    public boolean resetPasswordWithToken(android.content.ComponentName p0, java.lang.String p1, byte[] p2, int p3) { return false; }
    public void setMaximumTimeToLock(android.content.ComponentName p0, long p1) {}
    public long getMaximumTimeToLock(android.content.ComponentName p0) { return 0L; }
    public long getMaximumTimeToLock(android.content.ComponentName p0, int p1) { return 0L; }
    public void setRequiredStrongAuthTimeout(android.content.ComponentName p0, long p1) {}
    public long getRequiredStrongAuthTimeout(android.content.ComponentName p0) { return 0L; }
    public long getRequiredStrongAuthTimeout(android.content.ComponentName p0, int p1) { return 0L; }
    public void lockNow() {}
    public void lockNow(int p0) {}
    public void wipeData(int p0) {}
    public void wipeData(int p0, java.lang.CharSequence p1) {}
    private void wipeDataInternal(int p0, java.lang.String p1) {}
    public void setFactoryResetProtectionPolicy(android.content.ComponentName p0, android.app.admin.FactoryResetProtectionPolicy p1) {}
    public android.app.admin.FactoryResetProtectionPolicy getFactoryResetProtectionPolicy(android.content.ComponentName p0) { return null; }
    public android.content.ComponentName setGlobalProxy(android.content.ComponentName p0, java.net.Proxy p1, java.util.List<java.lang.String> p2) { return null; }
    public void setRecommendedGlobalProxy(android.content.ComponentName p0, android.net.ProxyInfo p1) {}
    public android.content.ComponentName getGlobalProxyAdmin() { return null; }
    @java.lang.Deprecated
    public int setStorageEncryption(android.content.ComponentName p0, boolean p1) { return 0; }
    @java.lang.Deprecated
    public boolean getStorageEncryption(android.content.ComponentName p0) { return false; }
    public int getStorageEncryptionStatus() { return 0; }
    public int getStorageEncryptionStatus(int p0) { return 0; }
    public boolean approveCaCert(java.lang.String p0, int p1, boolean p2) { return false; }
    public boolean isCaCertApproved(java.lang.String p0, int p1) { return false; }
    public boolean installCaCert(android.content.ComponentName p0, byte[] p1) { return false; }
    public void uninstallCaCert(android.content.ComponentName p0, byte[] p1) {}
    public java.util.List<byte[]> getInstalledCaCerts(android.content.ComponentName p0) { return null; }
    public void uninstallAllUserCaCerts(android.content.ComponentName p0) {}
    public boolean hasCaCertInstalled(android.content.ComponentName p0, byte[] p1) { return false; }
    public boolean installKeyPair(android.content.ComponentName p0, java.security.PrivateKey p1, java.security.cert.Certificate p2, java.lang.String p3) { return false; }
    public boolean installKeyPair(android.content.ComponentName p0, java.security.PrivateKey p1, java.security.cert.Certificate[] p2, java.lang.String p3, boolean p4) { return false; }
    public boolean installKeyPair(android.content.ComponentName p0, java.security.PrivateKey p1, java.security.cert.Certificate[] p2, java.lang.String p3, int p4) { return false; }
    public boolean removeKeyPair(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public android.security.AttestedKeyPair generateKeyPair(android.content.ComponentName p0, java.lang.String p1, android.security.keystore.KeyGenParameterSpec p2, int p3) { return null; }
    public boolean grantKeyPairToApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) { return false; }
    public boolean revokeKeyPairFromApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) { return false; }
    public boolean isDeviceIdAttestationSupported() { return false; }
    public boolean isUniqueDeviceAttestationSupported() { return false; }
    public boolean setKeyPairCertificate(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.security.cert.Certificate> p2, boolean p3) { return false; }
    private static java.lang.String getCaCertAlias(byte[] p0) throws java.security.cert.CertificateException { return null; }
    @java.lang.Deprecated
    public void setCertInstallerPackage(android.content.ComponentName p0, java.lang.String p1) throws java.lang.SecurityException {}
    @java.lang.Deprecated
    public java.lang.String getCertInstallerPackage(android.content.ComponentName p0) throws java.lang.SecurityException { return null; }
    public void setDelegatedScopes(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) {}
    public java.util.List<java.lang.String> getDelegatedScopes(android.content.ComponentName p0, java.lang.String p1) { return null; }
    public java.util.List<java.lang.String> getDelegatePackages(android.content.ComponentName p0, java.lang.String p1) { return null; }
    public void setAlwaysOnVpnPackage(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.content.pm.PackageManager.NameNotFoundException {}
    public void setAlwaysOnVpnPackage(android.content.ComponentName p0, java.lang.String p1, boolean p2, java.util.Set<java.lang.String> p3) throws android.content.pm.PackageManager.NameNotFoundException {}
    public boolean isAlwaysOnVpnLockdownEnabled(android.content.ComponentName p0) { return false; }
    public boolean isAlwaysOnVpnLockdownEnabled() { return false; }
    public java.util.Set<java.lang.String> getAlwaysOnVpnLockdownWhitelist(android.content.ComponentName p0) { return null; }
    public java.lang.String getAlwaysOnVpnPackage(android.content.ComponentName p0) { return null; }
    public java.lang.String getAlwaysOnVpnPackage() { return null; }
    public void setCameraDisabled(android.content.ComponentName p0, boolean p1) {}
    public boolean getCameraDisabled(android.content.ComponentName p0) { return false; }
    public boolean getCameraDisabled(android.content.ComponentName p0, int p1) { return false; }
    public boolean requestBugreport(android.content.ComponentName p0) { return false; }
    public boolean getGuestUserDisabled(android.content.ComponentName p0) { return false; }
    public void setScreenCaptureDisabled(android.content.ComponentName p0, boolean p1) {}
    public boolean getScreenCaptureDisabled(android.content.ComponentName p0) { return false; }
    public boolean getScreenCaptureDisabled(android.content.ComponentName p0, int p1) { return false; }
    @java.lang.Deprecated
    public void setAutoTimeRequired(android.content.ComponentName p0, boolean p1) {}
    @java.lang.Deprecated
    public boolean getAutoTimeRequired() { return false; }
    public void setAutoTimeEnabled(android.content.ComponentName p0, boolean p1) {}
    public boolean getAutoTimeEnabled(android.content.ComponentName p0) { return false; }
    public void setAutoTimeZoneEnabled(android.content.ComponentName p0, boolean p1) {}
    public boolean getAutoTimeZoneEnabled(android.content.ComponentName p0) { return false; }
    public void setForceEphemeralUsers(android.content.ComponentName p0, boolean p1) {}
    public boolean getForceEphemeralUsers(android.content.ComponentName p0) { return false; }
    public void setKeyguardDisabledFeatures(android.content.ComponentName p0, int p1) {}
    public int getKeyguardDisabledFeatures(android.content.ComponentName p0) { return 0; }
    public int getKeyguardDisabledFeatures(android.content.ComponentName p0, int p1) { return 0; }
    public void setActiveAdmin(android.content.ComponentName p0, boolean p1, int p2) {}
    public void setActiveAdmin(android.content.ComponentName p0, boolean p1) {}
    public void getRemoveWarning(android.content.ComponentName p0, android.os.RemoteCallback p1) {}
    public void reportPasswordChanged(int p0) {}
    public void reportFailedPasswordAttempt(int p0) {}
    public void reportSuccessfulPasswordAttempt(int p0) {}
    public void reportFailedBiometricAttempt(int p0) {}
    public void reportSuccessfulBiometricAttempt(int p0) {}
    public void reportKeyguardDismissed(int p0) {}
    public void reportKeyguardSecured(int p0) {}
    public boolean setDeviceOwner(android.content.ComponentName p0) { return false; }
    public boolean setDeviceOwner(android.content.ComponentName p0, int p1) { return false; }
    public boolean setDeviceOwner(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public boolean setDeviceOwner(android.content.ComponentName p0, java.lang.String p1, int p2) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException { return false; }
    public boolean isDeviceOwnerApp(java.lang.String p0) { return false; }
    public boolean isDeviceOwnerAppOnCallingUser(java.lang.String p0) { return false; }
    public boolean isDeviceOwnerAppOnAnyUser(java.lang.String p0) { return false; }
    public android.content.ComponentName getDeviceOwnerComponentOnCallingUser() { return null; }
    @android.annotation.SystemApi
    public android.content.ComponentName getDeviceOwnerComponentOnAnyUser() { return null; }
    private boolean isDeviceOwnerAppOnAnyUserInner(java.lang.String p0, boolean p1) { return false; }
    private android.content.ComponentName getDeviceOwnerComponentInner(boolean p0) { return null; }
    @android.annotation.SystemApi
    public android.os.UserHandle getDeviceOwnerUser() { return null; }
    public int getDeviceOwnerUserId() { return 0; }
    @java.lang.Deprecated
    public void clearDeviceOwnerApp(java.lang.String p0) {}
    @android.annotation.SystemApi
    public java.lang.String getDeviceOwner() { return null; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("Doclava125")
    public boolean isDeviceManaged() { return false; }
    @android.annotation.SystemApi
    public java.lang.String getDeviceOwnerNameOnAnyUser() { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public boolean setActiveProfileOwner(android.content.ComponentName p0, java.lang.String p1) throws java.lang.IllegalArgumentException { return false; }
    @java.lang.Deprecated
    public void clearProfileOwner(android.content.ComponentName p0) {}
    public boolean hasUserSetupCompleted() { return false; }
    public boolean setProfileOwner(android.content.ComponentName p0, java.lang.String p1, int p2) throws java.lang.IllegalArgumentException { return false; }
    public void setDeviceOwnerLockScreenInfo(android.content.ComponentName p0, java.lang.CharSequence p1) {}
    public java.lang.CharSequence getDeviceOwnerLockScreenInfo() { return null; }
    public java.lang.String[] setPackagesSuspended(android.content.ComponentName p0, java.lang.String[] p1, boolean p2) { return null; }
    public boolean isPackageSuspended(android.content.ComponentName p0, java.lang.String p1) throws android.content.pm.PackageManager.NameNotFoundException { return false; }
    public void setProfileEnabled(android.content.ComponentName p0) {}
    public void setProfileName(android.content.ComponentName p0, java.lang.String p1) {}
    public boolean isProfileOwnerApp(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    public android.content.ComponentName getProfileOwner() throws java.lang.IllegalArgumentException { return null; }
    public android.content.ComponentName getProfileOwnerAsUser(android.os.UserHandle p0) { return null; }
    public android.content.ComponentName getProfileOwnerAsUser(int p0) { return null; }
    public android.content.ComponentName getProfileOwnerOrDeviceOwnerSupervisionComponent(android.os.UserHandle p0) { return null; }
    public java.lang.String getProfileOwnerName() throws java.lang.IllegalArgumentException { return null; }
    @android.annotation.SystemApi
    public java.lang.String getProfileOwnerNameAsUser(int p0) throws java.lang.IllegalArgumentException { return null; }
    public boolean isOrganizationOwnedDeviceWithManagedProfile() { return false; }
    public boolean hasDeviceIdentifierAccess(java.lang.String p0, int p1, int p2) { return false; }
    public void addPersistentPreferredActivity(android.content.ComponentName p0, android.content.IntentFilter p1, android.content.ComponentName p2) {}
    public void clearPackagePersistentPreferredActivities(android.content.ComponentName p0, java.lang.String p1) {}
    public void setDefaultSmsApplication(android.content.ComponentName p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public void setApplicationRestrictionsManagingPackage(android.content.ComponentName p0, java.lang.String p1) throws android.content.pm.PackageManager.NameNotFoundException {}
    @java.lang.Deprecated
    public java.lang.String getApplicationRestrictionsManagingPackage(android.content.ComponentName p0) { return null; }
    @java.lang.Deprecated
    public boolean isCallerApplicationRestrictionsManagingPackage() { return false; }
    public void setApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, android.os.Bundle p2) {}
    public void setTrustAgentConfiguration(android.content.ComponentName p0, android.content.ComponentName p1, android.os.PersistableBundle p2) {}
    public java.util.List<android.os.PersistableBundle> getTrustAgentConfiguration(android.content.ComponentName p0, android.content.ComponentName p1) { return null; }
    public java.util.List<android.os.PersistableBundle> getTrustAgentConfiguration(android.content.ComponentName p0, android.content.ComponentName p1, int p2) { return null; }
    public void setCrossProfileCallerIdDisabled(android.content.ComponentName p0, boolean p1) {}
    public boolean getCrossProfileCallerIdDisabled(android.content.ComponentName p0) { return false; }
    public boolean getCrossProfileCallerIdDisabled(android.os.UserHandle p0) { return false; }
    public void setCrossProfileContactsSearchDisabled(android.content.ComponentName p0, boolean p1) {}
    public boolean getCrossProfileContactsSearchDisabled(android.content.ComponentName p0) { return false; }
    public boolean getCrossProfileContactsSearchDisabled(android.os.UserHandle p0) { return false; }
    public void startManagedQuickContact(java.lang.String p0, long p1, boolean p2, long p3, android.content.Intent p4) {}
    public void startManagedQuickContact(java.lang.String p0, long p1, android.content.Intent p2) {}
    public void setBluetoothContactSharingDisabled(android.content.ComponentName p0, boolean p1) {}
    public boolean getBluetoothContactSharingDisabled(android.content.ComponentName p0) { return false; }
    @android.annotation.SystemApi
    public boolean getBluetoothContactSharingDisabled(android.os.UserHandle p0) { return false; }
    public void addCrossProfileIntentFilter(android.content.ComponentName p0, android.content.IntentFilter p1, int p2) {}
    public void clearCrossProfileIntentFilters(android.content.ComponentName p0) {}
    public boolean setPermittedAccessibilityServices(android.content.ComponentName p0, java.util.List<java.lang.String> p1) { return false; }
    public java.util.List<java.lang.String> getPermittedAccessibilityServices(android.content.ComponentName p0) { return null; }
    public boolean isAccessibilityServicePermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2) { return false; }
    @android.annotation.SystemApi
    public java.util.List<java.lang.String> getPermittedAccessibilityServices(int p0) { return null; }
    public boolean setPermittedInputMethods(android.content.ComponentName p0, java.util.List<java.lang.String> p1) { return false; }
    public java.util.List<java.lang.String> getPermittedInputMethods(android.content.ComponentName p0) { return null; }
    public boolean isInputMethodPermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2) { return false; }
    @android.annotation.SystemApi
    public java.util.List<java.lang.String> getPermittedInputMethodsForCurrentUser() { return null; }
    public boolean setPermittedCrossProfileNotificationListeners(android.content.ComponentName p0, java.util.List<java.lang.String> p1) { return false; }
    public java.util.List<java.lang.String> getPermittedCrossProfileNotificationListeners(android.content.ComponentName p0) { return null; }
    public boolean isNotificationListenerServicePermitted(java.lang.String p0, int p1) { return false; }
    public java.util.List<java.lang.String> getKeepUninstalledPackages(android.content.ComponentName p0) { return null; }
    public void setKeepUninstalledPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) {}
    public android.os.UserHandle createAndManageUser(android.content.ComponentName p0, java.lang.String p1, android.content.ComponentName p2, android.os.PersistableBundle p3, int p4) { return null; }
    public boolean removeUser(android.content.ComponentName p0, android.os.UserHandle p1) { return false; }
    public boolean switchUser(android.content.ComponentName p0, android.os.UserHandle p1) { return false; }
    public int startUserInBackground(android.content.ComponentName p0, android.os.UserHandle p1) { return 0; }
    public int stopUser(android.content.ComponentName p0, android.os.UserHandle p1) { return 0; }
    public int logoutUser(android.content.ComponentName p0) { return 0; }
    public java.util.List<android.os.UserHandle> getSecondaryUsers(android.content.ComponentName p0) { return null; }
    public boolean isEphemeralUser(android.content.ComponentName p0) { return false; }
    public android.os.Bundle getApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1) { return null; }
    public void addUserRestriction(android.content.ComponentName p0, java.lang.String p1) {}
    public void clearUserRestriction(android.content.ComponentName p0, java.lang.String p1) {}
    public android.os.Bundle getUserRestrictions(android.content.ComponentName p0) { return null; }
    public android.content.Intent createAdminSupportIntent(java.lang.String p0) { return null; }
    public boolean setApplicationHidden(android.content.ComponentName p0, java.lang.String p1, boolean p2) { return false; }
    public boolean isApplicationHidden(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public void enableSystemApp(android.content.ComponentName p0, java.lang.String p1) {}
    public int enableSystemApp(android.content.ComponentName p0, android.content.Intent p1) { return 0; }
    public boolean installExistingPackage(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public void setAccountManagementDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) {}
    public java.lang.String[] getAccountTypesWithManagementDisabled() { return null; }
    public java.lang.String[] getAccountTypesWithManagementDisabledAsUser(int p0) { return null; }
    public java.lang.String[] getAccountTypesWithManagementDisabledAsUser(int p0, boolean p1) { return null; }
    @android.annotation.SystemApi
    public void setSecondaryLockscreenEnabled(android.content.ComponentName p0, boolean p1) {}
    @android.annotation.SystemApi
    public boolean isSecondaryLockscreenEnabled(android.os.UserHandle p0) { return false; }
    public void setLockTaskPackages(android.content.ComponentName p0, java.lang.String[] p1) throws java.lang.SecurityException {}
    public java.lang.String[] getLockTaskPackages(android.content.ComponentName p0) { return null; }
    public boolean isLockTaskPermitted(java.lang.String p0) { return false; }
    public void setLockTaskFeatures(android.content.ComponentName p0, int p1) {}
    public int getLockTaskFeatures(android.content.ComponentName p0) { return 0; }
    public void setGlobalSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) {}
    public void setSystemSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) {}
    public void setConfiguredNetworksLockdownState(android.content.ComponentName p0, boolean p1) {}
    public boolean hasLockdownAdminConfiguredNetworks(android.content.ComponentName p0) { return false; }
    public boolean setTime(android.content.ComponentName p0, long p1) { return false; }
    public boolean setTimeZone(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public void setLocationEnabled(android.content.ComponentName p0, boolean p1) {}
    public void setSecureSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) {}
    public void setRestrictionsProvider(android.content.ComponentName p0, android.content.ComponentName p1) {}
    public void setMasterVolumeMuted(android.content.ComponentName p0, boolean p1) {}
    public boolean isMasterVolumeMuted(android.content.ComponentName p0) { return false; }
    public void setUninstallBlocked(android.content.ComponentName p0, java.lang.String p1, boolean p2) {}
    public boolean isUninstallBlocked(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public boolean addCrossProfileWidgetProvider(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public boolean removeCrossProfileWidgetProvider(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public java.util.List<java.lang.String> getCrossProfileWidgetProviders(android.content.ComponentName p0) { return null; }
    public void setUserIcon(android.content.ComponentName p0, android.graphics.Bitmap p1) {}
    public void setSystemUpdatePolicy(android.content.ComponentName p0, android.app.admin.SystemUpdatePolicy p1) {}
    public android.app.admin.SystemUpdatePolicy getSystemUpdatePolicy() { return null; }
    public void clearSystemUpdatePolicyFreezePeriodRecord() {}
    public boolean setKeyguardDisabled(android.content.ComponentName p0, boolean p1) { return false; }
    public boolean setStatusBarDisabled(android.content.ComponentName p0, boolean p1) { return false; }
    @android.annotation.SystemApi
    public void notifyPendingSystemUpdate(long p0) {}
    @android.annotation.SystemApi
    public void notifyPendingSystemUpdate(long p0, boolean p1) {}
    public android.app.admin.SystemUpdateInfo getPendingSystemUpdate(android.content.ComponentName p0) { return null; }
    public void setPermissionPolicy(android.content.ComponentName p0, int p1) {}
    public int getPermissionPolicy(android.content.ComponentName p0) { return 0; }
    public boolean setPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, int p3) { return false; }
    public int getPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) { return 0; }
    public boolean isProvisioningAllowed(java.lang.String p0) { return false; }
    public int checkProvisioningPreCondition(java.lang.String p0, java.lang.String p1) { return 0; }
    public boolean isManagedProfile(android.content.ComponentName p0) { return false; }
    public boolean isSystemOnlyUser(android.content.ComponentName p0) { return false; }
    public java.lang.String getWifiMacAddress(android.content.ComponentName p0) { return null; }
    public void reboot(android.content.ComponentName p0) {}
    public void setShortSupportMessage(android.content.ComponentName p0, java.lang.CharSequence p1) {}
    public java.lang.CharSequence getShortSupportMessage(android.content.ComponentName p0) { return null; }
    public void setLongSupportMessage(android.content.ComponentName p0, java.lang.CharSequence p1) {}
    public java.lang.CharSequence getLongSupportMessage(android.content.ComponentName p0) { return null; }
    public java.lang.CharSequence getShortSupportMessageForUser(android.content.ComponentName p0, int p1) { return null; }
    public java.lang.CharSequence getLongSupportMessageForUser(android.content.ComponentName p0, int p1) { return null; }
    public android.app.admin.DevicePolicyManager getParentProfileInstance(android.content.ComponentName p0) { return null; }
    public void setSecurityLoggingEnabled(android.content.ComponentName p0, boolean p1) {}
    public boolean isSecurityLoggingEnabled(android.content.ComponentName p0) { return false; }
    public java.util.List<android.app.admin.SecurityLog.SecurityEvent> retrieveSecurityLogs(android.content.ComponentName p0) { return null; }
    public long forceNetworkLogs() { return 0L; }
    public long forceSecurityLogs() { return 0L; }
    public android.app.admin.DevicePolicyManager getParentProfileInstance(android.content.pm.UserInfo p0) { return null; }
    public java.util.List<java.lang.String> setMeteredDataDisabledPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) { return null; }
    public java.util.List<java.lang.String> getMeteredDataDisabledPackages(android.content.ComponentName p0) { return null; }
    public boolean isMeteredDataDisabledPackageForUser(android.content.ComponentName p0, java.lang.String p1, int p2) { return false; }
    public java.util.List<android.app.admin.SecurityLog.SecurityEvent> retrievePreRebootSecurityLogs(android.content.ComponentName p0) { return null; }
    public void setOrganizationColor(android.content.ComponentName p0, int p1) {}
    public void setOrganizationColorForUser(int p0, int p1) {}
    public int getOrganizationColor(android.content.ComponentName p0) { return 0; }
    public int getOrganizationColorForUser(int p0) { return 0; }
    public void setOrganizationName(android.content.ComponentName p0, java.lang.CharSequence p1) {}
    public java.lang.CharSequence getOrganizationName(android.content.ComponentName p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("Doclava125")
    public java.lang.CharSequence getDeviceOwnerOrganizationName() { return null; }
    public java.lang.CharSequence getOrganizationNameForUser(int p0) { return null; }
    @android.annotation.SystemApi
    public int getUserProvisioningState() { return 0; }
    public void setUserProvisioningState(int p0, int p1) {}
    public void setAffiliationIds(android.content.ComponentName p0, java.util.Set<java.lang.String> p1) {}
    public java.util.Set<java.lang.String> getAffiliationIds(android.content.ComponentName p0) { return null; }
    public boolean isAffiliatedUser() { return false; }
    public boolean isUninstallInQueue(java.lang.String p0) { return false; }
    public void uninstallPackageWithActiveAdmins(java.lang.String p0) {}
    public void forceRemoveActiveAdmin(android.content.ComponentName p0, int p1) {}
    @android.annotation.SystemApi
    public boolean isDeviceProvisioned() { return false; }
    @android.annotation.SystemApi
    public void setDeviceProvisioningConfigApplied() {}
    @android.annotation.SystemApi
    public boolean isDeviceProvisioningConfigApplied() { return false; }
    public void forceUpdateUserSetupComplete() {}
    private void throwIfParentInstance(java.lang.String p0) {}
    public void setBackupServiceEnabled(android.content.ComponentName p0, boolean p1) {}
    public boolean isBackupServiceEnabled(android.content.ComponentName p0) { return false; }
    public void setNetworkLoggingEnabled(android.content.ComponentName p0, boolean p1) {}
    public boolean isNetworkLoggingEnabled(android.content.ComponentName p0) { return false; }
    public java.util.List<android.app.admin.NetworkEvent> retrieveNetworkLogs(android.content.ComponentName p0, long p1) { return null; }
    public boolean bindDeviceAdminServiceAsUser(android.content.ComponentName p0, android.content.Intent p1, android.content.ServiceConnection p2, int p3, android.os.UserHandle p4) { return false; }
    public java.util.List<android.os.UserHandle> getBindDeviceAdminTargetUsers(android.content.ComponentName p0) { return null; }
    public long getLastSecurityLogRetrievalTime() { return 0L; }
    public long getLastBugReportRequestTime() { return 0L; }
    public long getLastNetworkLogRetrievalTime() { return 0L; }
    public boolean isCurrentInputMethodSetByOwner() { return false; }
    public java.util.List<java.lang.String> getOwnerInstalledCaCerts(android.os.UserHandle p0) { return null; }
    public boolean isFactoryResetProtectionPolicySupported() { return false; }
    public void clearApplicationUserData(android.content.ComponentName p0, java.lang.String p1, java.util.concurrent.Executor p2, android.app.admin.DevicePolicyManager.OnClearApplicationUserDataListener p3) {}
    public void setLogoutEnabled(android.content.ComponentName p0, boolean p1) {}
    public boolean isLogoutEnabled() { return false; }
    public java.util.Set<java.lang.String> getDisallowedSystemApps(android.content.ComponentName p0, int p1, java.lang.String p2) { return null; }
    public void transferOwnership(android.content.ComponentName p0, android.content.ComponentName p1, android.os.PersistableBundle p2) {}
    public void setStartUserSessionMessage(android.content.ComponentName p0, java.lang.CharSequence p1) {}
    public void setEndUserSessionMessage(android.content.ComponentName p0, java.lang.CharSequence p1) {}
    public java.lang.CharSequence getStartUserSessionMessage(android.content.ComponentName p0) { return null; }
    public java.lang.CharSequence getEndUserSessionMessage(android.content.ComponentName p0) { return null; }
    public int addOverrideApn(android.content.ComponentName p0, android.telephony.data.ApnSetting p1) { return 0; }
    public boolean updateOverrideApn(android.content.ComponentName p0, int p1, android.telephony.data.ApnSetting p2) { return false; }
    public boolean removeOverrideApn(android.content.ComponentName p0, int p1) { return false; }
    public java.util.List<android.telephony.data.ApnSetting> getOverrideApns(android.content.ComponentName p0) { return null; }
    public void setOverrideApnsEnabled(android.content.ComponentName p0, boolean p1) {}
    public boolean isOverrideApnEnabled(android.content.ComponentName p0) { return false; }
    public android.os.PersistableBundle getTransferOwnershipBundle() { return null; }
    public int setGlobalPrivateDnsModeOpportunistic(android.content.ComponentName p0) { return 0; }
    public int setGlobalPrivateDnsModeSpecifiedHost(android.content.ComponentName p0, java.lang.String p1) { return 0; }
    public void installSystemUpdate(android.content.ComponentName p0, android.net.Uri p1, java.util.concurrent.Executor p2, android.app.admin.DevicePolicyManager.InstallSystemUpdateCallback p3) {}
    private void executeCallback(int p0, java.lang.String p1, java.util.concurrent.Executor p2, android.app.admin.DevicePolicyManager.InstallSystemUpdateCallback p3) {}
    public int getGlobalPrivateDnsMode(android.content.ComponentName p0) { return 0; }
    public java.lang.String getGlobalPrivateDnsHost(android.content.ComponentName p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public void setProfileOwnerCanAccessDeviceIds(android.content.ComponentName p0) {}
    public void markProfileOwnerOnOrganizationOwnedDevice(android.content.ComponentName p0) {}
    public void setCrossProfileCalendarPackages(android.content.ComponentName p0, java.util.Set<java.lang.String> p1) {}
    public java.util.Set<java.lang.String> getCrossProfileCalendarPackages(android.content.ComponentName p0) { return null; }
    public boolean isPackageAllowedToAccessCalendar(java.lang.String p0) { return false; }
    public java.util.Set<java.lang.String> getCrossProfileCalendarPackages() { return null; }
    public void setCrossProfilePackages(android.content.ComponentName p0, java.util.Set<java.lang.String> p1) {}
    public java.util.Set<java.lang.String> getCrossProfilePackages(android.content.ComponentName p0) { return null; }
    public java.util.Set<java.lang.String> getAllCrossProfilePackages() { return null; }
    public java.util.Set<java.lang.String> getDefaultCrossProfilePackages() { return null; }
    @android.annotation.SystemApi
    public boolean isManagedKiosk() { return false; }
    @android.annotation.SystemApi
    public boolean isUnattendedManagedKiosk() { return false; }
    public boolean startViewCalendarEventInManagedProfile(long p0, long p1, long p2, boolean p3, int p4) { return false; }
    public void setUserControlDisabledPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) {}
    public java.util.List<java.lang.String> getUserControlDisabledPackages(android.content.ComponentName p0) { return null; }
    public void setCommonCriteriaModeEnabled(android.content.ComponentName p0, boolean p1) {}
    public boolean isCommonCriteriaModeEnabled(android.content.ComponentName p0) { return false; }
    public int getPersonalAppsSuspendedReasons(android.content.ComponentName p0) { return 0; }
    public void setPersonalAppsSuspended(android.content.ComponentName p0, boolean p1) {}
    public void setManagedProfileMaximumTimeOff(android.content.ComponentName p0, long p1) {}
    public long getManagedProfileMaximumTimeOff(android.content.ComponentName p0) { return 0L; }
    public boolean canProfileOwnerResetPasswordWhenLocked(int p0) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttestationIdType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CreateAndManageUserFlags {
    }

    public static abstract class InstallSystemUpdateCallback {
        public static final int UPDATE_ERROR_UNKNOWN = 1;
        public static final int UPDATE_ERROR_INCORRECT_OS_VERSION = 2;
        public static final int UPDATE_ERROR_UPDATE_FILE_INVALID = 3;
        public static final int UPDATE_ERROR_FILE_NOT_FOUND = 4;
        public static final int UPDATE_ERROR_BATTERY_LOW = 5;
        public InstallSystemUpdateCallback() {}
        public void onInstallUpdateError(int p0, java.lang.String p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InstallUpdateCallbackErrorConstants {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LockNowFlag {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LockTaskFeature {
    }

    public static interface OnClearApplicationUserDataListener {
        public void onApplicationUserDataCleared(java.lang.String p0, boolean p1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PasswordComplexity {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PermissionGrantState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PersonalAppsSuspensionReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PrivateDnsMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PrivateDnsModeErrorCodes {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProvisioningPreCondition {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SystemSettingsWhitelist {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserProvisioningState {
    }
}
