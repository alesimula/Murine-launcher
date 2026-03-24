package android.app.admin;

@android.annotation.SuppressLint("UseIcu")
public class DevicePolicyManager {
    public static final java.lang.String ACTION_PROVISION_MANAGED_PROFILE = "android.app.action.PROVISION_MANAGED_PROFILE";
    public static final java.lang.String ACTION_PROVISION_MANAGED_USER = "android.app.action.PROVISION_MANAGED_USER";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_PROVISION_MANAGED_DEVICE = "android.app.action.PROVISION_MANAGED_DEVICE";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_STATE_USER_SETUP_COMPLETE = "android.app.action.STATE_USER_SETUP_COMPLETE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_PROVISION_MANAGED_DEVICE_FROM_TRUSTED_SOURCE = "android.app.action.PROVISION_MANAGED_DEVICE_FROM_TRUSTED_SOURCE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_PROVISION_FINANCED_DEVICE = "android.app.action.PROVISION_FINANCED_DEVICE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_PROVISION_FINALIZATION = "android.app.action.PROVISION_FINALIZATION";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.LAUNCH_DEVICE_MANAGER_SETUP")
    public static final java.lang.String ACTION_ROLE_HOLDER_PROVISION_MANAGED_PROFILE = "android.app.action.ROLE_HOLDER_PROVISION_MANAGED_PROFILE";
    @android.annotation.SystemApi
    public static final int RESULT_WORK_PROFILE_CREATED = 122;
    @android.annotation.SystemApi
    public static final int RESULT_DEVICE_OWNER_SET = 123;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.LAUNCH_DEVICE_MANAGER_SETUP")
    public static final java.lang.String ACTION_ROLE_HOLDER_PROVISION_MANAGED_DEVICE_FROM_TRUSTED_SOURCE = "android.app.action.ROLE_HOLDER_PROVISION_MANAGED_DEVICE_FROM_TRUSTED_SOURCE";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.LAUNCH_DEVICE_MANAGER_SETUP")
    public static final java.lang.String ACTION_ROLE_HOLDER_PROVISION_FINALIZATION = "android.app.action.ROLE_HOLDER_PROVISION_FINALIZATION";
    @android.annotation.SystemApi
    public static final int RESULT_UPDATE_ROLE_HOLDER = 2;
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ROLE_HOLDER_STATE = "android.app.extra.ROLE_HOLDER_STATE";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_FORCE_UPDATE_ROLE_HOLDER = "android.app.extra.FORCE_UPDATE_ROLE_HOLDER";
    public static final java.lang.String EXTRA_PROVISIONING_ALLOW_OFFLINE = "android.app.extra.PROVISIONING_ALLOW_OFFLINE";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PROVISIONING_ROLE_HOLDER_PACKAGE_DOWNLOAD_LOCATION = "android.app.extra.PROVISIONING_ROLE_HOLDER_PACKAGE_DOWNLOAD_LOCATION";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PROVISIONING_ROLE_HOLDER_SIGNATURE_CHECKSUM = "android.app.extra.PROVISIONING_ROLE_HOLDER_SIGNATURE_CHECKSUM";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PROVISIONING_ROLE_HOLDER_PACKAGE_DOWNLOAD_COOKIE_HEADER = "android.app.extra.PROVISIONING_ROLE_HOLDER_PACKAGE_DOWNLOAD_COOKIE_HEADER";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PROVISIONING_ROLE_HOLDER_EXTRAS_BUNDLE = "android.app.extra.PROVISIONING_ROLE_HOLDER_EXTRAS_BUNDLE";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ROLE_HOLDER_PROVISIONING_INITIATOR_PACKAGE = "android.app.extra.ROLE_HOLDER_PROVISIONING_INITIATOR_PACKAGE";
    public static final java.lang.String EXTRA_RESULT_LAUNCH_INTENT = "android.app.extra.RESULT_LAUNCH_INTENT";
    public static final java.lang.String EXTRA_PROVISIONING_SHOULD_LAUNCH_RESULT_INTENT = "android.app.extra.PROVISIONING_SHOULD_LAUNCH_RESULT_INTENT";
    public static final java.lang.String ACTION_BUGREPORT_SHARING_ACCEPTED = "com.android.server.action.REMOTE_BUGREPORT_SHARING_ACCEPTED";
    public static final java.lang.String ACTION_BUGREPORT_SHARING_DECLINED = "com.android.server.action.REMOTE_BUGREPORT_SHARING_DECLINED";
    public static final java.lang.String ACTION_REMOTE_BUGREPORT_DISPATCH = "android.intent.action.REMOTE_BUGREPORT_DISPATCH";
    public static final java.lang.String EXTRA_REMOTE_BUGREPORT_HASH = "android.intent.extra.REMOTE_BUGREPORT_HASH";
    public static final java.lang.String EXTRA_REMOTE_BUGREPORT_NONCE = "android.intent.extra.REMOTE_BUGREPORT_NONCE";
    public static final java.lang.String EXTRA_BUGREPORT_NOTIFICATION_TYPE = "android.app.extra.bugreport_notification_type";
    public static final boolean PREFERENTIAL_NETWORK_SERVICE_ENABLED_DEFAULT = false;
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
    @java.lang.Deprecated
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
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_LABEL = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_LABEL";
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_ICON_URI = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_ICON_URI";
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_MINIMUM_VERSION_CODE = "android.app.extra.PROVISIONING_DEVICE_ADMIN_MINIMUM_VERSION_CODE";
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_COOKIE_HEADER = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_COOKIE_HEADER";
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_CHECKSUM = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_CHECKSUM";
    public static final java.lang.String EXTRA_PROVISIONING_SENSORS_PERMISSION_GRANT_OPT_OUT = "android.app.extra.PROVISIONING_SENSORS_PERMISSION_GRANT_OPT_OUT";
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_SIGNATURE_CHECKSUM = "android.app.extra.PROVISIONING_DEVICE_ADMIN_SIGNATURE_CHECKSUM";
    public static final java.lang.String ACTION_MANAGED_PROFILE_PROVISIONED = "android.app.action.MANAGED_PROFILE_PROVISIONED";
    public static final java.lang.String ACTION_PROVISIONING_SUCCESSFUL = "android.app.action.PROVISIONING_SUCCESSFUL";
    public static final java.lang.String EXTRA_PROVISIONING_SKIP_ENCRYPTION = "android.app.extra.PROVISIONING_SKIP_ENCRYPTION";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_PROVISIONING_LOGO_URI = "android.app.extra.PROVISIONING_LOGO_URI";
    public static final java.lang.String EXTRA_PROVISIONING_DISCLAIMERS = "android.app.extra.PROVISIONING_DISCLAIMERS";
    public static final java.lang.String EXTRA_PROVISIONING_DISCLAIMER_HEADER = "android.app.extra.PROVISIONING_DISCLAIMER_HEADER";
    public static final java.lang.String EXTRA_PROVISIONING_DISCLAIMER_CONTENT = "android.app.extra.PROVISIONING_DISCLAIMER_CONTENT";
    @java.lang.Deprecated
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
    @java.lang.Deprecated
    public static final int PROVISIONING_TRIGGER_PERSISTENT_DEVICE_OWNER = 3;
    @android.annotation.SystemApi
    public static final int PROVISIONING_TRIGGER_MANAGED_ACCOUNT = 4;
    @android.annotation.SystemApi
    public static final int PROVISIONING_TRIGGER_NFC = 5;
    @android.annotation.SystemApi
    public static final int FLAG_SUPPORTED_MODES_ORGANIZATION_OWNED = 1;
    @android.annotation.SystemApi
    public static final int FLAG_SUPPORTED_MODES_PERSONALLY_OWNED = 2;
    @android.annotation.SystemApi
    public static final int FLAG_SUPPORTED_MODES_DEVICE_OWNER = 4;
    public static final int WIFI_SECURITY_OPEN = 0;
    public static final int WIFI_SECURITY_PERSONAL = 1;
    public static final int WIFI_SECURITY_ENTERPRISE_EAP = 2;
    public static final int WIFI_SECURITY_ENTERPRISE_192 = 3;
    public static final java.lang.String MIME_TYPE_PROVISIONING_NFC = "application/com.android.managedprovisioning";
    public static final java.lang.String ACTION_ADD_DEVICE_ADMIN = "android.app.action.ADD_DEVICE_ADMIN";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_SET_PROFILE_OWNER = "android.app.action.SET_PROFILE_OWNER";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PROFILE_OWNER_NAME = "android.app.extra.PROFILE_OWNER_NAME";
    public static final java.lang.String ACTION_DEVICE_POLICY_MANAGER_STATE_CHANGED = "android.app.action.DEVICE_POLICY_MANAGER_STATE_CHANGED";
    public static final java.lang.String ACTION_DEVICE_OWNER_CHANGED = "android.app.action.DEVICE_OWNER_CHANGED";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_FACTORY_RESET_PROTECTION")
    public static final java.lang.String ACTION_RESET_PROTECTION_POLICY_CHANGED = "android.app.action.RESET_PROTECTION_POLICY_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_LOST_MODE_LOCATION_UPDATE = "android.app.action.LOST_MODE_LOCATION_UPDATE";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_LOST_MODE_LOCATION = "android.app.extra.LOST_MODE_LOCATION";
    public static final java.lang.String EXTRA_DEVICE_ADMIN = "android.app.extra.DEVICE_ADMIN";
    public static final java.lang.String EXTRA_ADD_EXPLANATION = "android.app.extra.ADD_EXPLANATION";
    public static final java.lang.String POLICY_DISABLE_CAMERA = "policy_disable_camera";
    public static final java.lang.String POLICY_DISABLE_SCREEN_CAPTURE = "policy_disable_screen_capture";
    public static final java.lang.String POLICY_SUSPEND_PACKAGES = "policy_suspend_packages";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_RESTRICTION = "android.app.extra.RESTRICTION";
    public static final java.lang.String ACTION_SET_NEW_PASSWORD = "android.app.action.SET_NEW_PASSWORD";
    @android.annotation.RequiresPermission("android.permission.REQUEST_PASSWORD_COMPLEXITY")
    public static final java.lang.String EXTRA_PASSWORD_COMPLEXITY = "android.app.extra.PASSWORD_COMPLEXITY";
    public static final int PASSWORD_COMPLEXITY_NONE = 0;
    public static final int PASSWORD_COMPLEXITY_LOW = 65536;
    public static final int PASSWORD_COMPLEXITY_MEDIUM = 196608;
    public static final int PASSWORD_COMPLEXITY_HIGH = 327680;
    public static final java.lang.String EXTRA_DEVICE_PASSWORD_REQUIREMENT_ONLY = "android.app.extra.DEVICE_PASSWORD_REQUIREMENT_ONLY";
    public static final int NEARBY_STREAMING_NOT_CONTROLLED_BY_POLICY = 0;
    public static final int NEARBY_STREAMING_DISABLED = 1;
    public static final int NEARBY_STREAMING_ENABLED = 2;
    public static final int NEARBY_STREAMING_SAME_MANAGED_ACCOUNT_ONLY = 3;
    public static final java.lang.String ACTION_SET_NEW_PARENT_PROFILE_PASSWORD = "android.app.action.SET_NEW_PARENT_PROFILE_PASSWORD";
    public static final java.lang.String ACTION_SHOW_DEVICE_MONITORING_DIALOG = "android.app.action.SHOW_DEVICE_MONITORING_DIALOG";
    public static final java.lang.String ACTION_APPLICATION_DELEGATION_SCOPES_CHANGED = "android.app.action.APPLICATION_DELEGATION_SCOPES_CHANGED";
    public static final java.lang.String EXTRA_DELEGATION_SCOPES = "android.app.extra.DELEGATION_SCOPES";
    public static final int FLAG_PARENT_CAN_ACCESS_MANAGED = 1;
    public static final int FLAG_MANAGED_CAN_ACCESS_PARENT = 2;
    public static final java.lang.String ACTION_SYSTEM_UPDATE_POLICY_CHANGED = "android.app.action.SYSTEM_UPDATE_POLICY_CHANGED";
    public static final java.lang.String ACTION_DATA_SHARING_RESTRICTION_APPLIED = "android.app.action.DATA_SHARING_RESTRICTION_APPLIED";
    public static final java.lang.String ACTION_DEVICE_POLICY_CONSTANTS_CHANGED = "android.app.action.DEVICE_POLICY_CONSTANTS_CHANGED";
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
    public static final java.lang.String DELEGATION_SECURITY_LOGGING = "delegation-security-logging";
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
    @android.annotation.SystemApi
    public static final int STATE_USER_PROFILE_FINALIZED = 5;
    @android.annotation.SystemApi
    public static final int STATUS_UNKNOWN_ERROR = -1;
    @android.annotation.SystemApi
    public static final int STATUS_OK = 0;
    @android.annotation.SystemApi
    public static final int STATUS_HAS_DEVICE_OWNER = 1;
    @android.annotation.SystemApi
    public static final int STATUS_USER_HAS_PROFILE_OWNER = 2;
    @android.annotation.SystemApi
    public static final int STATUS_USER_NOT_RUNNING = 3;
    @android.annotation.SystemApi
    public static final int STATUS_USER_SETUP_COMPLETED = 4;
    @android.annotation.SystemApi
    public static final int STATUS_NONSYSTEM_USER_EXISTS = 5;
    @android.annotation.SystemApi
    public static final int STATUS_ACCOUNTS_NOT_EMPTY = 6;
    @android.annotation.SystemApi
    public static final int STATUS_NOT_SYSTEM_USER = 7;
    @android.annotation.SystemApi
    public static final int STATUS_HAS_PAIRED = 8;
    @android.annotation.SystemApi
    public static final int STATUS_MANAGED_USERS_NOT_SUPPORTED = 9;
    @android.annotation.SystemApi
    public static final int STATUS_SYSTEM_USER = 10;
    @android.annotation.SystemApi
    public static final int STATUS_CANNOT_ADD_MANAGED_PROFILE = 11;
    @android.annotation.SystemApi
    public static final int STATUS_DEVICE_ADMIN_NOT_SUPPORTED = 13;
    @java.lang.Deprecated
    public static final int STATUS_SPLIT_SYSTEM_USER_DEVICE_SYSTEM_USER = 14;
    @android.annotation.SystemApi
    public static final int STATUS_PROVISIONING_NOT_ALLOWED_FOR_NON_DEVELOPER_USERS = 15;
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
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PROVISIONING_SUPPORTED_MODES = "android.app.extra.PROVISIONING_SUPPORTED_MODES";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PROVISIONING_SKIP_OWNERSHIP_DISCLAIMER = "android.app.extra.PROVISIONING_SKIP_OWNERSHIP_DISCLAIMER";
    public static final java.lang.String EXTRA_PROVISIONING_ALLOWED_PROVISIONING_MODES = "android.app.extra.PROVISIONING_ALLOWED_PROVISIONING_MODES";
    public static final int PROVISIONING_MODE_FULLY_MANAGED_DEVICE = 1;
    public static final int PROVISIONING_MODE_MANAGED_PROFILE = 2;
    public static final int PROVISIONING_MODE_MANAGED_PROFILE_ON_PERSONAL_DEVICE = 3;
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PROVISIONING_RETURN_BEFORE_POLICY_COMPLIANCE = "android.app.extra.PROVISIONING_RETURN_BEFORE_POLICY_COMPLIANCE";
    public static final java.lang.String EXTRA_PROVISIONING_KEEP_SCREEN_ON = "android.app.extra.PROVISIONING_KEEP_SCREEN_ON";
    public static final java.lang.String ACTION_ADMIN_POLICY_COMPLIANCE = "android.app.action.ADMIN_POLICY_COMPLIANCE";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.LAUNCH_DEVICE_MANAGER_SETUP")
    public static final java.lang.String ACTION_UPDATE_DEVICE_POLICY_MANAGEMENT_ROLE_HOLDER = "android.app.action.UPDATE_DEVICE_POLICY_MANAGEMENT_ROLE_HOLDER";
    @android.annotation.SystemApi
    public static final int RESULT_UPDATE_DEVICE_POLICY_MANAGEMENT_ROLE_HOLDER_RECOVERABLE_ERROR = 1;
    @android.annotation.SystemApi
    public static final int RESULT_UPDATE_DEVICE_POLICY_MANAGEMENT_ROLE_HOLDER_UNRECOVERABLE_ERROR = 2;
    @android.annotation.SystemApi
    public static final int RESULT_UPDATE_DEVICE_POLICY_MANAGEMENT_ROLE_HOLDER_PROVISIONING_DISABLED = 3;
    public static final java.lang.String EXTRA_ROLE_HOLDER_UPDATE_FAILURE_STRATEGY = "android.app.extra.ROLE_HOLDER_UPDATE_FAILURE_STRATEGY";
    public static final int ROLE_HOLDER_UPDATE_FAILURE_STRATEGY_FAIL_PROVISIONING = 1;
    public static final int ROLE_HOLDER_UPDATE_FAILURE_STRATEGY_FALLBACK_TO_PLATFORM_PROVISIONING = 2;
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ROLE_HOLDER_UPDATE_RESULT_CODE = "android.app.extra.ROLE_HOLDER_UPDATE_RESULT_CODE";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PROVISIONING_ROLE_HOLDER_CUSTOM_USER_CONSENT_INTENT = "android.app.extra.PROVISIONING_ROLE_HOLDER_CUSTOM_USER_CONSENT_INTENT";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.DISPATCH_PROVISIONING_MESSAGE")
    public static final java.lang.String ACTION_ESTABLISH_NETWORK_CONNECTION = "android.app.action.ESTABLISH_NETWORK_CONNECTION";
    public static final int MAX_PASSWORD_LENGTH = 16;
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_BIND_SECONDARY_LOCKSCREEN_SERVICE = "android.app.action.BIND_SECONDARY_LOCKSCREEN_SERVICE";
    public static final int PERSONAL_APPS_NOT_SUSPENDED = 0;
    public static final int PERSONAL_APPS_SUSPENDED_EXPLICITLY = 1;
    public static final int PERSONAL_APPS_SUSPENDED_PROFILE_TIMEOUT = 2;
    public static final int DEVICE_OWNER_TYPE_DEFAULT = 0;
    public static final int DEVICE_OWNER_TYPE_FINANCED = 1;
    public static final int OPERATION_LOCK_NOW = 1;
    public static final int OPERATION_SWITCH_USER = 2;
    public static final int OPERATION_START_USER_IN_BACKGROUND = 3;
    public static final int OPERATION_STOP_USER = 4;
    public static final int OPERATION_CREATE_AND_MANAGE_USER = 5;
    public static final int OPERATION_REMOVE_USER = 6;
    public static final int OPERATION_REBOOT = 7;
    public static final int OPERATION_WIPE_DATA = 8;
    public static final int OPERATION_LOGOUT_USER = 9;
    public static final int OPERATION_SET_USER_RESTRICTION = 10;
    public static final int OPERATION_SET_SYSTEM_SETTING = 11;
    public static final int OPERATION_SET_KEYGUARD_DISABLED = 12;
    public static final int OPERATION_SET_STATUS_BAR_DISABLED = 13;
    public static final int OPERATION_SET_SYSTEM_UPDATE_POLICY = 14;
    public static final int OPERATION_SET_APPLICATION_HIDDEN = 15;
    public static final int OPERATION_SET_APPLICATION_RESTRICTIONS = 16;
    public static final int OPERATION_SET_KEEP_UNINSTALLED_PACKAGES = 17;
    public static final int OPERATION_SET_LOCK_TASK_FEATURES = 18;
    public static final int OPERATION_SET_LOCK_TASK_PACKAGES = 19;
    public static final int OPERATION_SET_PACKAGES_SUSPENDED = 20;
    public static final int OPERATION_SET_TRUST_AGENT_CONFIGURATION = 21;
    public static final int OPERATION_SET_USER_CONTROL_DISABLED_PACKAGES = 22;
    public static final int OPERATION_CLEAR_APPLICATION_USER_DATA = 23;
    public static final int OPERATION_INSTALL_CA_CERT = 24;
    public static final int OPERATION_INSTALL_KEY_PAIR = 25;
    public static final int OPERATION_INSTALL_SYSTEM_UPDATE = 26;
    public static final int OPERATION_REMOVE_ACTIVE_ADMIN = 27;
    public static final int OPERATION_REMOVE_KEY_PAIR = 28;
    public static final int OPERATION_REQUEST_BUGREPORT = 29;
    public static final int OPERATION_SET_ALWAYS_ON_VPN_PACKAGE = 30;
    public static final int OPERATION_SET_CAMERA_DISABLED = 31;
    public static final int OPERATION_SET_FACTORY_RESET_PROTECTION_POLICY = 32;
    public static final int OPERATION_SET_GLOBAL_PRIVATE_DNS = 33;
    public static final int OPERATION_SET_LOGOUT_ENABLED = 34;
    public static final int OPERATION_SET_MASTER_VOLUME_MUTED = 35;
    public static final int OPERATION_SET_OVERRIDE_APNS_ENABLED = 36;
    public static final int OPERATION_SET_PERMISSION_GRANT_STATE = 37;
    public static final int OPERATION_SET_PERMISSION_POLICY = 38;
    public static final int OPERATION_SET_RESTRICTIONS_PROVIDER = 39;
    public static final int OPERATION_UNINSTALL_CA_CERT = 40;
    public static final int OPERATION_SAFETY_REASON_NONE = -1;
    public static final int OPERATION_SAFETY_REASON_DRIVING_DISTRACTION = 1;
    public static final java.lang.String ACTION_DEVICE_POLICY_RESOURCE_UPDATED = "android.app.action.DEVICE_POLICY_RESOURCE_UPDATED";
    public static final java.lang.String EXTRA_RESOURCE_TYPE = "android.app.extra.RESOURCE_TYPE";
    public static final int EXTRA_RESOURCE_TYPE_DRAWABLE = 1;
    public static final int EXTRA_RESOURCE_TYPE_STRING = 2;
    public static final java.lang.String EXTRA_RESOURCE_IDS = "android.app.extra.RESOURCE_IDS";
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
    @android.annotation.SystemApi
    public static final java.lang.String REQUIRED_APP_MANAGED_USER = "android.app.REQUIRED_APP_MANAGED_USER";
    @android.annotation.SystemApi
    public static final java.lang.String REQUIRED_APP_MANAGED_DEVICE = "android.app.REQUIRED_APP_MANAGED_DEVICE";
    @android.annotation.SystemApi
    public static final java.lang.String REQUIRED_APP_MANAGED_PROFILE = "android.app.REQUIRED_APP_MANAGED_PROFILE";
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
    public static final java.lang.String ACTION_PROVISIONING_COMPLETED = "android.app.action.PROVISIONING_COMPLETED";
    public static final java.lang.String EXTRA_PROVISIONING_ACTION = "android.app.extra.PROVISIONING_ACTION";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final java.lang.String ACTION_SHOW_NEW_USER_DISCLAIMER = "android.app.action.SHOW_NEW_USER_DISCLAIMER";
    public static final int KEYGUARD_DISABLE_FEATURES_NONE = 0;
    public static final int KEYGUARD_DISABLE_WIDGETS_ALL = 1;
    public static final int KEYGUARD_DISABLE_SECURE_CAMERA = 2;
    public static final int KEYGUARD_DISABLE_SECURE_NOTIFICATIONS = 4;
    public static final int KEYGUARD_DISABLE_UNREDACTED_NOTIFICATIONS = 8;
    public static final int KEYGUARD_DISABLE_TRUST_AGENTS = 16;
    public static final int KEYGUARD_DISABLE_FINGERPRINT = 32;
    @java.lang.Deprecated
    public static final int KEYGUARD_DISABLE_REMOTE_INPUT = 64;
    public static final int KEYGUARD_DISABLE_FACE = 128;
    public static final int KEYGUARD_DISABLE_IRIS = 256;
    public static final int KEYGUARD_DISABLE_SHORTCUTS_ALL = 512;
    public static final int KEYGUARD_DISABLE_BIOMETRICS = 416;
    public static final int KEYGUARD_DISABLE_FEATURES_ALL = 2147483647;
    public static final int NON_ORG_OWNED_PROFILE_KEYGUARD_FEATURES_AFFECT_OWNER = 432;
    public static final int ORG_OWNED_PROFILE_KEYGUARD_FEATURES_PARENT_ONLY = 518;
    public static final int PROFILE_KEYGUARD_FEATURES_AFFECT_OWNER = 950;
    public static final int ERROR_VPN_PACKAGE_NOT_FOUND = 1;
    public static final int SKIP_SETUP_WIZARD = 1;
    public static final int MAKE_USER_EPHEMERAL = 2;
    public static final int MAKE_USER_DEMO = 4;
    public static final int LEAVE_ALL_SYSTEM_APPS_ENABLED = 16;
    public DevicePolicyManager(android.content.Context p0, android.app.admin.IDevicePolicyManager p1) {}
    protected DevicePolicyManager(android.content.Context p0, android.app.admin.IDevicePolicyManager p1, boolean p2) {}
    protected int myUserId() { return 0; }
    public static java.lang.String operationToString(int p0) { return null; }
    public static void invalidateBinderCaches() {}
    public static void disableLocalCaches() {}
    public static java.lang.String operationSafetyReasonToString(int p0) { return null; }
    public static boolean isValidOperationSafetyReason(int p0) { return false; }
    public boolean isSafeOperation(int p0) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.INTERACT_ACROSS_USERS"})
    public void acknowledgeNewUserDisclaimer() {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.INTERACT_ACROSS_USERS"})
    public boolean isNewUserDisclaimerAcknowledged() { return false; }
    public boolean isAdminActive(android.content.ComponentName p0) { return false; }
    public boolean isAdminActiveAsUser(android.content.ComponentName p0, int p1) { return false; }
    public boolean isRemovingAdmin(android.content.ComponentName p0, int p1) { return false; }
    public java.util.List<android.content.ComponentName> getActiveAdmins() { return null; }
    public java.util.List<android.content.ComponentName> getActiveAdminsAsUser(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS_FULL")
    public boolean packageHasActiveAdmins(java.lang.String p0) { return false; }
    public boolean packageHasActiveAdmins(java.lang.String p0, int p1) { return false; }
    public void removeActiveAdmin(android.content.ComponentName p0) {}
    public boolean hasGrantedPolicy(android.content.ComponentName p0, int p1) { return false; }
    @java.lang.Deprecated
    public void setPasswordQuality(android.content.ComponentName p0, int p1) {}
    @java.lang.Deprecated
    public int getPasswordQuality(android.content.ComponentName p0) { return 0; }
    public int getPasswordQuality(android.content.ComponentName p0, int p1) { return 0; }
    @java.lang.Deprecated
    public void setPasswordMinimumLength(android.content.ComponentName p0, int p1) {}
    @java.lang.Deprecated
    public int getPasswordMinimumLength(android.content.ComponentName p0) { return 0; }
    public int getPasswordMinimumLength(android.content.ComponentName p0, int p1) { return 0; }
    @java.lang.Deprecated
    public void setPasswordMinimumUpperCase(android.content.ComponentName p0, int p1) {}
    @java.lang.Deprecated
    public int getPasswordMinimumUpperCase(android.content.ComponentName p0) { return 0; }
    public int getPasswordMinimumUpperCase(android.content.ComponentName p0, int p1) { return 0; }
    @java.lang.Deprecated
    public void setPasswordMinimumLowerCase(android.content.ComponentName p0, int p1) {}
    @java.lang.Deprecated
    public int getPasswordMinimumLowerCase(android.content.ComponentName p0) { return 0; }
    public int getPasswordMinimumLowerCase(android.content.ComponentName p0, int p1) { return 0; }
    @java.lang.Deprecated
    public void setPasswordMinimumLetters(android.content.ComponentName p0, int p1) {}
    @java.lang.Deprecated
    public int getPasswordMinimumLetters(android.content.ComponentName p0) { return 0; }
    public int getPasswordMinimumLetters(android.content.ComponentName p0, int p1) { return 0; }
    @java.lang.Deprecated
    public void setPasswordMinimumNumeric(android.content.ComponentName p0, int p1) {}
    @java.lang.Deprecated
    public int getPasswordMinimumNumeric(android.content.ComponentName p0) { return 0; }
    public int getPasswordMinimumNumeric(android.content.ComponentName p0, int p1) { return 0; }
    @java.lang.Deprecated
    public void setPasswordMinimumSymbols(android.content.ComponentName p0, int p1) {}
    @java.lang.Deprecated
    public int getPasswordMinimumSymbols(android.content.ComponentName p0) { return 0; }
    public int getPasswordMinimumSymbols(android.content.ComponentName p0, int p1) { return 0; }
    @java.lang.Deprecated
    public void setPasswordMinimumNonLetter(android.content.ComponentName p0, int p1) {}
    @java.lang.Deprecated
    public int getPasswordMinimumNonLetter(android.content.ComponentName p0) { return 0; }
    public int getPasswordMinimumNonLetter(android.content.ComponentName p0, int p1) { return 0; }
    public android.app.admin.PasswordMetrics getPasswordMinimumMetrics(int p0) { return null; }
    public android.app.admin.PasswordMetrics getPasswordMinimumMetrics(int p0, boolean p1) { return null; }
    public void setPasswordHistoryLength(android.content.ComponentName p0, int p1) {}
    public void setPasswordExpirationTimeout(android.content.ComponentName p0, long p1) {}
    public long getPasswordExpirationTimeout(android.content.ComponentName p0) { return 0L; }
    public long getPasswordExpiration(android.content.ComponentName p0) { return 0L; }
    public int getPasswordHistoryLength(android.content.ComponentName p0) { return 0; }
    public int getPasswordHistoryLength(android.content.ComponentName p0, int p1) { return 0; }
    public int getPasswordMaximumLength(int p0) { return 0; }
    public boolean isActivePasswordSufficient() { return false; }
    public boolean isActivePasswordSufficientForDeviceRequirement() { return false; }
    @android.annotation.RequiresPermission("android.permission.REQUEST_PASSWORD_COMPLEXITY")
    public int getPasswordComplexity() { return 0; }
    public void setRequiredPasswordComplexity(int p0) {}
    public int getRequiredPasswordComplexity() { return 0; }
    public int getAggregatedPasswordComplexityForUser(int p0) { return 0; }
    public int getAggregatedPasswordComplexityForUser(int p0, boolean p1) { return 0; }
    public boolean isUsingUnifiedPassword(android.content.ComponentName p0) { return false; }
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
    public void setFactoryResetProtectionPolicy(android.content.ComponentName p0, android.app.admin.FactoryResetProtectionPolicy p1) {}
    public android.app.admin.FactoryResetProtectionPolicy getFactoryResetProtectionPolicy(android.content.ComponentName p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.TRIGGER_LOST_MODE")
    public void sendLostModeLocationUpdate(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Boolean> p1) {}
    public android.content.ComponentName setGlobalProxy(android.content.ComponentName p0, java.net.Proxy p1, java.util.List<java.lang.String> p2) { return null; }
    public android.util.Pair<java.lang.String, java.lang.String> getProxyParameters(java.net.Proxy p0, java.util.List<java.lang.String> p1) { return null; }
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
    public boolean hasKeyPair(java.lang.String p0) { return false; }
    public android.security.AttestedKeyPair generateKeyPair(android.content.ComponentName p0, java.lang.String p1, android.security.keystore.KeyGenParameterSpec p2, int p3) { return null; }
    public boolean grantKeyPairToApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) { return false; }
    public java.util.Map<java.lang.Integer, java.util.Set<java.lang.String>> getKeyPairGrants(java.lang.String p0) { return null; }
    public boolean revokeKeyPairFromApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) { return false; }
    public boolean grantKeyPairToWifiAuth(java.lang.String p0) { return false; }
    public boolean revokeKeyPairFromWifiAuth(java.lang.String p0) { return false; }
    public boolean isKeyPairGrantedToWifiAuth(java.lang.String p0) { return false; }
    public boolean isDeviceIdAttestationSupported() { return false; }
    public boolean isUniqueDeviceAttestationSupported() { return false; }
    public boolean setKeyPairCertificate(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.security.cert.Certificate> p2, boolean p3) { return false; }
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
    public void setScreenCaptureDisabled(android.content.ComponentName p0, boolean p1) {}
    public boolean getScreenCaptureDisabled(android.content.ComponentName p0) { return false; }
    public boolean getScreenCaptureDisabled(android.content.ComponentName p0, int p1) { return false; }
    public void setNearbyNotificationStreamingPolicy(int p0) {}
    @android.annotation.RequiresPermission(value="android.permission.READ_NEARBY_STREAMING_POLICY", conditional=true)
    public int getNearbyNotificationStreamingPolicy() { return 0; }
    public int getNearbyNotificationStreamingPolicy(int p0) { return 0; }
    public void setNearbyAppStreamingPolicy(int p0) {}
    @android.annotation.RequiresPermission(value="android.permission.READ_NEARBY_STREAMING_POLICY", conditional=true)
    public int getNearbyAppStreamingPolicy() { return 0; }
    public int getNearbyAppStreamingPolicy(int p0) { return 0; }
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
    @android.annotation.RequiresPermission(allOf={"android.permission.MANAGE_DEVICE_ADMINS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public void setActiveAdmin(android.content.ComponentName p0, boolean p1, int p2) {}
    public void setActiveAdmin(android.content.ComponentName p0, boolean p1) {}
    public void getRemoveWarning(android.content.ComponentName p0, android.os.RemoteCallback p1) {}
    public void reportPasswordChanged(android.app.admin.PasswordMetrics p0, int p1) {}
    public void reportFailedPasswordAttempt(int p0) {}
    public void reportSuccessfulPasswordAttempt(int p0) {}
    public void reportFailedBiometricAttempt(int p0) {}
    public void reportSuccessfulBiometricAttempt(int p0) {}
    public void reportKeyguardDismissed(int p0) {}
    public void reportKeyguardSecured(int p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS")
    public boolean setDeviceOwner(android.content.ComponentName p0, java.lang.String p1, int p2) { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS")
    public boolean setDeviceOwnerOnly(android.content.ComponentName p0, java.lang.String p1, int p2) { return false; }
    public boolean isDeviceOwnerApp(java.lang.String p0) { return false; }
    public boolean isDeviceOwnerAppOnCallingUser(java.lang.String p0) { return false; }
    public boolean isDeviceOwnerAppOnAnyUser(java.lang.String p0) { return false; }
    public android.content.ComponentName getDeviceOwnerComponentOnCallingUser() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS"})
    public android.content.ComponentName getDeviceOwnerComponentOnAnyUser() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_USERS")
    public android.os.UserHandle getDeviceOwnerUser() { return null; }
    public int getDeviceOwnerUserId() { return 0; }
    @java.lang.Deprecated
    public void clearDeviceOwnerApp(java.lang.String p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_USERS")
    public java.lang.String getDeviceOwner() { return null; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("RequiresPermission")
    public boolean isDeviceManaged() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS"})
    public java.lang.String getDeviceOwnerNameOnAnyUser() { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_DEVICE_ADMINS")
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
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS", conditional=true)
    public android.content.ComponentName getProfileOwnerAsUser(android.os.UserHandle p0) { return null; }
    public android.content.ComponentName getProfileOwnerAsUser(int p0) { return null; }
    public android.content.ComponentName getProfileOwnerOrDeviceOwnerSupervisionComponent(android.os.UserHandle p0) { return null; }
    public boolean isSupervisionComponent(android.content.ComponentName p0) { return false; }
    public java.lang.String getProfileOwnerName() throws java.lang.IllegalArgumentException { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS"})
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
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS")
    public boolean getBluetoothContactSharingDisabled(android.os.UserHandle p0) { return false; }
    public void addCrossProfileIntentFilter(android.content.ComponentName p0, android.content.IntentFilter p1, int p2) {}
    public void clearCrossProfileIntentFilters(android.content.ComponentName p0) {}
    public boolean setPermittedAccessibilityServices(android.content.ComponentName p0, java.util.List<java.lang.String> p1) { return false; }
    public java.util.List<java.lang.String> getPermittedAccessibilityServices(android.content.ComponentName p0) { return null; }
    public boolean isAccessibilityServicePermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.QUERY_ADMIN_POLICY"})
    public java.util.List<java.lang.String> getPermittedAccessibilityServices(int p0) { return null; }
    public boolean setPermittedInputMethods(android.content.ComponentName p0, java.util.List<java.lang.String> p1) { return false; }
    public java.util.List<java.lang.String> getPermittedInputMethods(android.content.ComponentName p0) { return null; }
    public boolean isInputMethodPermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.QUERY_ADMIN_POLICY"})
    public java.util.List<java.lang.String> getPermittedInputMethodsForCurrentUser() { return null; }
    @android.annotation.RequiresPermission(allOf={"android.permission.INTERACT_ACROSS_USERS_FULL", "android.permission.MANAGE_USERS"}, conditional=true)
    public java.util.List<java.lang.String> getPermittedInputMethods() { return null; }
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
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.INTERACT_ACROSS_USERS"})
    public int logoutUser() { return 0; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.INTERACT_ACROSS_USERS"})
    public android.os.UserHandle getLogoutUser() { return null; }
    public java.util.List<android.os.UserHandle> getSecondaryUsers(android.content.ComponentName p0) { return null; }
    public boolean isEphemeralUser(android.content.ComponentName p0) { return false; }
    public android.os.Bundle getApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1) { return null; }
    public void addUserRestriction(android.content.ComponentName p0, java.lang.String p1) {}
    public void clearUserRestriction(android.content.ComponentName p0, java.lang.String p1) {}
    public android.os.Bundle getUserRestrictions(android.content.ComponentName p0) { return null; }
    public android.content.Intent createAdminSupportIntent(java.lang.String p0) { return null; }
    public android.os.Bundle getEnforcingAdminAndUserDetails(int p0, java.lang.String p1) { return null; }
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
    public void setPreferentialNetworkServiceEnabled(boolean p0) {}
    public boolean isPreferentialNetworkServiceEnabled() { return false; }
    public void setPreferentialNetworkServiceConfigs(java.util.List<android.app.admin.PreferentialNetworkServiceConfig> p0) {}
    public java.util.List<android.app.admin.PreferentialNetworkServiceConfig> getPreferentialNetworkServiceConfigs() { return null; }
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
    @android.annotation.RequiresPermission("android.permission.CLEAR_FREEZE_PERIOD")
    public void clearSystemUpdatePolicyFreezePeriodRecord() {}
    public boolean setKeyguardDisabled(android.content.ComponentName p0, boolean p1) { return false; }
    public boolean setStatusBarDisabled(android.content.ComponentName p0, boolean p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.NOTIFY_PENDING_SYSTEM_UPDATE")
    public void notifyPendingSystemUpdate(long p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.NOTIFY_PENDING_SYSTEM_UPDATE")
    public void notifyPendingSystemUpdate(long p0, boolean p1) {}
    public android.app.admin.SystemUpdateInfo getPendingSystemUpdate(android.content.ComponentName p0) { return null; }
    public void setPermissionPolicy(android.content.ComponentName p0, int p1) {}
    public int getPermissionPolicy(android.content.ComponentName p0) { return 0; }
    public boolean setPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, int p3) { return false; }
    public int getPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) { return 0; }
    public boolean isProvisioningAllowed(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS")
    public int checkProvisioningPrecondition(java.lang.String p0, java.lang.String p1) { return 0; }
    public boolean isManagedProfile(android.content.ComponentName p0) { return false; }
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
    @android.annotation.SuppressLint("NullableCollection")
    public java.util.List<android.app.admin.SecurityLog.SecurityEvent> retrieveSecurityLogs(android.content.ComponentName p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.FORCE_DEVICE_POLICY_MANAGER_LOGS")
    public long forceNetworkLogs() { return 0L; }
    @android.annotation.RequiresPermission("android.permission.FORCE_DEVICE_POLICY_MANAGER_LOGS")
    public long forceSecurityLogs() { return 0L; }
    public android.app.admin.DevicePolicyManager getParentProfileInstance(android.content.pm.UserInfo p0) { return null; }
    public java.util.List<java.lang.String> setMeteredDataDisabledPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) { return null; }
    public java.util.List<java.lang.String> getMeteredDataDisabledPackages(android.content.ComponentName p0) { return null; }
    public boolean isMeteredDataDisabledPackageForUser(android.content.ComponentName p0, java.lang.String p1, int p2) { return false; }
    @android.annotation.SuppressLint("NullableCollection")
    public java.util.List<android.app.admin.SecurityLog.SecurityEvent> retrievePreRebootSecurityLogs(android.content.ComponentName p0) { return null; }
    @java.lang.Deprecated
    public void setOrganizationColor(android.content.ComponentName p0, int p1) {}
    @java.lang.Deprecated
    public void setOrganizationColorForUser(int p0, int p1) {}
    @java.lang.Deprecated
    public int getOrganizationColor(android.content.ComponentName p0) { return 0; }
    @java.lang.Deprecated
    public int getOrganizationColorForUser(int p0) { return 0; }
    public void setOrganizationName(android.content.ComponentName p0, java.lang.CharSequence p1) {}
    public java.lang.CharSequence getOrganizationName(android.content.ComponentName p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("RequiresPermission")
    public java.lang.CharSequence getDeviceOwnerOrganizationName() { return null; }
    public java.lang.CharSequence getOrganizationNameForUser(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS"})
    public int getUserProvisioningState() { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS")
    public void setUserProvisioningState(int p0, int p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS")
    public void setUserProvisioningState(int p0, android.os.UserHandle p1) {}
    public void setAffiliationIds(android.content.ComponentName p0, java.util.Set<java.lang.String> p1) {}
    public java.util.Set<java.lang.String> getAffiliationIds(android.content.ComponentName p0) { return null; }
    public boolean isAffiliatedUser() { return false; }
    public boolean isAffiliatedUser(int p0) { return false; }
    public boolean isUninstallInQueue(java.lang.String p0) { return false; }
    public void uninstallPackageWithActiveAdmins(java.lang.String p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS")
    public void forceRemoveActiveAdmin(android.content.ComponentName p0, int p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_USERS")
    public boolean isDeviceProvisioned() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_USERS")
    public void setDeviceProvisioningConfigApplied() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_USERS")
    public boolean isDeviceProvisioningConfigApplied() { return false; }
    public void forceUpdateUserSetupComplete(int p0) {}
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
    public int getGlobalPrivateDnsMode(android.content.ComponentName p0) { return 0; }
    public java.lang.String getGlobalPrivateDnsHost(android.content.ComponentName p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(value="android.permission.GRANT_PROFILE_OWNER_DEVICE_IDS_ACCESS", conditional=true)
    public void setProfileOwnerCanAccessDeviceIds(android.content.ComponentName p0) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.MARK_DEVICE_ORGANIZATION_OWNED", "android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS"}, conditional=true)
    public void setProfileOwnerOnOrganizationOwnedDevice(android.content.ComponentName p0, boolean p1) {}
    public void setCrossProfileCalendarPackages(android.content.ComponentName p0, java.util.Set<java.lang.String> p1) {}
    public java.util.Set<java.lang.String> getCrossProfileCalendarPackages(android.content.ComponentName p0) { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_USERS_FULL", "android.permission.INTERACT_ACROSS_USERS"}, conditional=true)
    public boolean isPackageAllowedToAccessCalendar(java.lang.String p0) { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_USERS_FULL", "android.permission.INTERACT_ACROSS_USERS"})
    public java.util.Set<java.lang.String> getCrossProfileCalendarPackages() { return null; }
    public void setCrossProfilePackages(android.content.ComponentName p0, java.util.Set<java.lang.String> p1) {}
    public java.util.Set<java.lang.String> getCrossProfilePackages(android.content.ComponentName p0) { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_USERS_FULL", "android.permission.INTERACT_ACROSS_USERS", "android.permission.INTERACT_ACROSS_PROFILES"})
    public java.util.Set<java.lang.String> getAllCrossProfilePackages() { return null; }
    public java.util.Set<java.lang.String> getDefaultCrossProfilePackages() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS"})
    public boolean isManagedKiosk() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS"})
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
    public void acknowledgeDeviceCompliant() {}
    public boolean isComplianceAcknowledgementRequired() { return false; }
    public boolean canProfileOwnerResetPasswordWhenLocked(int p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_DEVICE_ADMINS")
    public void setNextOperationSafety(int p0, int p1) {}
    public java.lang.String getEnrollmentSpecificId() { return null; }
    public void setOrganizationId(java.lang.String p0) {}
    public void setOrganizationIdForUser(java.lang.String p0, java.lang.String p1, int p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS")
    public void clearOrganizationId() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS")
    public android.os.UserHandle createAndProvisionManagedProfile(android.app.admin.ManagedProfileProvisioningParams p0) throws android.app.admin.ProvisioningException { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS")
    public void finalizeWorkProfileProvisioning(android.os.UserHandle p0, android.accounts.Account p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS", "android.permission.PROVISION_DEMO_DEVICE"})
    public void provisionFullyManagedDevice(android.app.admin.FullyManagedDeviceProvisioningParams p0) throws android.app.admin.ProvisioningException {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS")
    public void resetDefaultCrossProfileIntentFilters(int p0) {}
    public boolean canAdminGrantSensorsPermissions() { return false; }
    public void setDeviceOwnerType(android.content.ComponentName p0, int p1) {}
    public int getDeviceOwnerType(android.content.ComponentName p0) { return 0; }
    public void setUsbDataSignalingEnabled(boolean p0) {}
    public boolean isUsbDataSignalingEnabled() { return false; }
    public boolean isUsbDataSignalingEnabledForUser(int p0) { return false; }
    public boolean canUsbDataSignalingBeDisabled() { return false; }
    public java.util.List<android.os.UserHandle> listForegroundAffiliatedUsers() { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_DEVICE_ADMINS")
    public java.util.Set<java.lang.String> getPolicyExemptApps() { return null; }
    @android.annotation.SystemApi
    public android.content.Intent createProvisioningIntentFromNfcIntent(android.content.Intent p0) { return null; }
    public void setMinimumRequiredWifiSecurityLevel(int p0) {}
    public int getMinimumRequiredWifiSecurityLevel() { return 0; }
    public void setWifiSsidPolicy(android.app.admin.WifiSsidPolicy p0) {}
    public android.app.admin.WifiSsidPolicy getWifiSsidPolicy() { return null; }
    public android.app.admin.DevicePolicyResourcesManager getResources() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS")
    public boolean isDpcDownloaded() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS")
    public void setDpcDownloaded(boolean p0) {}
    public java.lang.String getDevicePolicyManagementRoleHolderPackage() { return null; }
    public java.lang.String getDevicePolicyManagementRoleHolderUpdaterPackage() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS")
    public java.util.List<android.os.UserHandle> getPolicyManagedProfiles(android.os.UserHandle p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_ROLE_HOLDERS")
    public boolean shouldAllowBypassingDevicePolicyManagementRoleQualification() { return false; }
    public boolean requireSecureKeyguard() { return false; }
    public boolean requireSecureKeyguard(int p0) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttestationIdType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CreateAndManageUserFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceOwnerType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DevicePolicyOperation {
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

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NearbyStreamingPolicy {
    }

    public static interface OnClearApplicationUserDataListener {
        public void onApplicationUserDataCleared(java.lang.String p0, boolean p1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OperationSafetyReason {
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
    public static @interface ProvisioningConfiguration {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProvisioningPrecondition {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProvisioningTrigger {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RoleHolderUpdateFailureStrategy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SystemSettingsWhitelist {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserProvisioningState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WifiSecurity {
    }
}
