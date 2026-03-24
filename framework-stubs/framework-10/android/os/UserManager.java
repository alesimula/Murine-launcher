package android.os;

public class UserManager {
    private static final java.lang.String TAG = "UserManager";
    @android.annotation.UnsupportedAppUsage
    private final android.os.IUserManager mService = null;
    private final android.content.Context mContext = null;
    private java.lang.Boolean mIsManagedProfileCached;
    @android.annotation.SystemApi
    public static final int RESTRICTION_NOT_SET = 0;
    @android.annotation.SystemApi
    public static final int RESTRICTION_SOURCE_SYSTEM = 1;
    @android.annotation.SystemApi
    public static final int RESTRICTION_SOURCE_DEVICE_OWNER = 2;
    @android.annotation.SystemApi
    public static final int RESTRICTION_SOURCE_PROFILE_OWNER = 4;
    public static final java.lang.String DISALLOW_MODIFY_ACCOUNTS = "no_modify_accounts";
    public static final java.lang.String DISALLOW_CONFIG_WIFI = "no_config_wifi";
    public static final java.lang.String DISALLOW_CONFIG_LOCALE = "no_config_locale";
    public static final java.lang.String DISALLOW_INSTALL_APPS = "no_install_apps";
    public static final java.lang.String DISALLOW_UNINSTALL_APPS = "no_uninstall_apps";
    public static final java.lang.String DISALLOW_SHARE_LOCATION = "no_share_location";
    public static final java.lang.String DISALLOW_AIRPLANE_MODE = "no_airplane_mode";
    public static final java.lang.String DISALLOW_CONFIG_BRIGHTNESS = "no_config_brightness";
    public static final java.lang.String DISALLOW_AMBIENT_DISPLAY = "no_ambient_display";
    public static final java.lang.String DISALLOW_CONFIG_SCREEN_TIMEOUT = "no_config_screen_timeout";
    public static final java.lang.String DISALLOW_INSTALL_UNKNOWN_SOURCES = "no_install_unknown_sources";
    public static final java.lang.String DISALLOW_INSTALL_UNKNOWN_SOURCES_GLOBALLY = "no_install_unknown_sources_globally";
    public static final java.lang.String DISALLOW_CONFIG_BLUETOOTH = "no_config_bluetooth";
    public static final java.lang.String DISALLOW_BLUETOOTH = "no_bluetooth";
    public static final java.lang.String DISALLOW_BLUETOOTH_SHARING = "no_bluetooth_sharing";
    public static final java.lang.String DISALLOW_USB_FILE_TRANSFER = "no_usb_file_transfer";
    public static final java.lang.String DISALLOW_CONFIG_CREDENTIALS = "no_config_credentials";
    public static final java.lang.String DISALLOW_REMOVE_USER = "no_remove_user";
    public static final java.lang.String DISALLOW_REMOVE_MANAGED_PROFILE = "no_remove_managed_profile";
    public static final java.lang.String DISALLOW_DEBUGGING_FEATURES = "no_debugging_features";
    public static final java.lang.String DISALLOW_CONFIG_VPN = "no_config_vpn";
    public static final java.lang.String DISALLOW_CONFIG_LOCATION = "no_config_location";
    public static final java.lang.String DISALLOW_CONFIG_DATE_TIME = "no_config_date_time";
    public static final java.lang.String DISALLOW_CONFIG_TETHERING = "no_config_tethering";
    public static final java.lang.String DISALLOW_NETWORK_RESET = "no_network_reset";
    public static final java.lang.String DISALLOW_FACTORY_RESET = "no_factory_reset";
    public static final java.lang.String DISALLOW_ADD_USER = "no_add_user";
    public static final java.lang.String DISALLOW_ADD_MANAGED_PROFILE = "no_add_managed_profile";
    public static final java.lang.String ENSURE_VERIFY_APPS = "ensure_verify_apps";
    public static final java.lang.String DISALLOW_CONFIG_CELL_BROADCASTS = "no_config_cell_broadcasts";
    public static final java.lang.String DISALLOW_CONFIG_MOBILE_NETWORKS = "no_config_mobile_networks";
    public static final java.lang.String DISALLOW_APPS_CONTROL = "no_control_apps";
    public static final java.lang.String DISALLOW_MOUNT_PHYSICAL_MEDIA = "no_physical_media";
    public static final java.lang.String DISALLOW_UNMUTE_MICROPHONE = "no_unmute_microphone";
    public static final java.lang.String DISALLOW_ADJUST_VOLUME = "no_adjust_volume";
    public static final java.lang.String DISALLOW_OUTGOING_CALLS = "no_outgoing_calls";
    public static final java.lang.String DISALLOW_SMS = "no_sms";
    public static final java.lang.String DISALLOW_FUN = "no_fun";
    public static final java.lang.String DISALLOW_CREATE_WINDOWS = "no_create_windows";
    public static final java.lang.String DISALLOW_SYSTEM_ERROR_DIALOGS = "no_system_error_dialogs";
    public static final java.lang.String DISALLOW_CROSS_PROFILE_COPY_PASTE = "no_cross_profile_copy_paste";
    public static final java.lang.String DISALLOW_OUTGOING_BEAM = "no_outgoing_beam";
    public static final java.lang.String DISALLOW_WALLPAPER = "no_wallpaper";
    public static final java.lang.String DISALLOW_SET_WALLPAPER = "no_set_wallpaper";
    public static final java.lang.String DISALLOW_SAFE_BOOT = "no_safe_boot";
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String DISALLOW_RECORD_AUDIO = "no_record_audio";
    @android.annotation.SystemApi
    public static final java.lang.String DISALLOW_RUN_IN_BACKGROUND = "no_run_in_background";
    public static final java.lang.String DISALLOW_CAMERA = "no_camera";
    public static final java.lang.String DISALLOW_UNMUTE_DEVICE = "disallow_unmute_device";
    public static final java.lang.String DISALLOW_DATA_ROAMING = "no_data_roaming";
    public static final java.lang.String DISALLOW_SET_USER_ICON = "no_set_user_icon";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String DISALLOW_OEM_UNLOCK = "no_oem_unlock";
    public static final java.lang.String DISALLOW_UNIFIED_PASSWORD = "no_unified_password";
    public static final java.lang.String ALLOW_PARENT_PROFILE_APP_LINKING = "allow_parent_profile_app_linking";
    public static final java.lang.String DISALLOW_AUTOFILL = "no_autofill";
    public static final java.lang.String DISALLOW_CONTENT_CAPTURE = "no_content_capture";
    public static final java.lang.String DISALLOW_CONTENT_SUGGESTIONS = "no_content_suggestions";
    public static final java.lang.String DISALLOW_USER_SWITCH = "no_user_switch";
    public static final java.lang.String DISALLOW_SHARE_INTO_MANAGED_PROFILE = "no_sharing_into_profile";
    public static final java.lang.String DISALLOW_PRINTING = "no_printing";
    public static final java.lang.String DISALLOW_CONFIG_PRIVATE_DNS = "disallow_config_private_dns";
    public static final java.lang.String KEY_RESTRICTIONS_PENDING = "restrictions_pending";
    private static final java.lang.String ACTION_CREATE_USER = "android.os.action.CREATE_USER";
    public static final java.lang.String EXTRA_USER_NAME = "android.os.extra.USER_NAME";
    public static final java.lang.String EXTRA_USER_ACCOUNT_NAME = "android.os.extra.USER_ACCOUNT_NAME";
    public static final java.lang.String EXTRA_USER_ACCOUNT_TYPE = "android.os.extra.USER_ACCOUNT_TYPE";
    public static final java.lang.String EXTRA_USER_ACCOUNT_OPTIONS = "android.os.extra.USER_ACCOUNT_OPTIONS";
    public static final int PIN_VERIFICATION_FAILED_INCORRECT = -3;
    public static final int PIN_VERIFICATION_FAILED_NOT_SET = -2;
    public static final int PIN_VERIFICATION_SUCCESS = -1;
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_USER_RESTRICTIONS_CHANGED = "android.os.action.USER_RESTRICTIONS_CHANGED";
    public static final int USER_CREATION_FAILED_NOT_PERMITTED = 1;
    public static final int USER_CREATION_FAILED_NO_MORE_USERS = 2;
    @android.annotation.SystemApi
    public static final int SWITCHABILITY_STATUS_OK = 0;
    @android.annotation.SystemApi
    public static final int SWITCHABILITY_STATUS_USER_IN_CALL = 1;
    @android.annotation.SystemApi
    public static final int SWITCHABILITY_STATUS_USER_SWITCH_DISALLOWED = 2;
    @android.annotation.SystemApi
    public static final int SWITCHABILITY_STATUS_SYSTEM_USER_LOCKED = 4;
    public static final int USER_OPERATION_SUCCESS = 0;
    public static final int USER_OPERATION_ERROR_UNKNOWN = 1;
    public static final int USER_OPERATION_ERROR_MANAGED_PROFILE = 2;
    public static final int USER_OPERATION_ERROR_MAX_RUNNING_USERS = 3;
    public static final int USER_OPERATION_ERROR_CURRENT_USER = 4;
    public static final int USER_OPERATION_ERROR_LOW_STORAGE = 5;
    public static final int USER_OPERATION_ERROR_MAX_USERS = 6;
    @android.annotation.UnsupportedAppUsage
    public static android.os.UserManager get(android.content.Context p0) { return null; }
    public UserManager(android.content.Context p0, android.os.IUserManager p1) {}
    public static boolean supportsMultipleUsers() { return false; }
    public static boolean isSplitSystemUser() { return false; }
    public static boolean isGuestUserEphemeral() { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public boolean canSwitchUsers() { return false; }
    @android.annotation.SystemApi
    public int getUserSwitchability() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getUserHandle() { return 0; }
    public java.lang.String getUserName() { return null; }
    public boolean isUserNameSet() { return false; }
    public boolean isUserAGoat() { return false; }
    @android.annotation.SystemApi
    public boolean isPrimaryUser() { return false; }
    public boolean isSystemUser() { return false; }
    @android.annotation.SystemApi
    public boolean isAdminUser() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isUserAdmin(int p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public boolean isLinkedUser() { return false; }
    @android.annotation.SystemApi
    public boolean isRestrictedProfile() { return false; }
    @android.annotation.SystemApi
    public boolean isRestrictedProfile(android.os.UserHandle p0) { return false; }
    public boolean canHaveRestrictedProfile(int p0) { return false; }
    @android.annotation.SystemApi
    public boolean hasRestrictedProfiles() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isGuestUser(int p0) { return false; }
    @android.annotation.SystemApi
    public boolean isGuestUser() { return false; }
    public boolean isDemoUser() { return false; }
    @android.annotation.SystemApi
    public boolean isManagedProfile() { return false; }
    @android.annotation.SystemApi
    public boolean isManagedProfile(int p0) { return false; }
    public int getManagedProfileBadge(int p0) { return 0; }
    public boolean isEphemeralUser() { return false; }
    public boolean isUserEphemeral(int p0) { return false; }
    public boolean isUserRunning(android.os.UserHandle p0) { return false; }
    public boolean isUserRunning(int p0) { return false; }
    public boolean isUserRunningOrStopping(android.os.UserHandle p0) { return false; }
    public boolean isUserUnlocked() { return false; }
    public boolean isUserUnlocked(android.os.UserHandle p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isUserUnlocked(int p0) { return false; }
    public boolean isUserUnlockingOrUnlocked(android.os.UserHandle p0) { return false; }
    public boolean isUserUnlockingOrUnlocked(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public long getUserStartRealtime() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long getUserUnlockRealtime() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.UserInfo getUserInfo(int p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public int getUserRestrictionSource(java.lang.String p0, android.os.UserHandle p1) { return 0; }
    @android.annotation.SystemApi
    public java.util.List<android.os.UserManager.EnforcingUser> getUserRestrictionSources(java.lang.String p0, android.os.UserHandle p1) { return null; }
    public android.os.Bundle getUserRestrictions() { return null; }
    public android.os.Bundle getUserRestrictions(android.os.UserHandle p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public boolean hasBaseUserRestriction(java.lang.String p0, android.os.UserHandle p1) { return false; }
    @java.lang.Deprecated
    public void setUserRestrictions(android.os.Bundle p0) {}
    @java.lang.Deprecated
    public void setUserRestrictions(android.os.Bundle p0, android.os.UserHandle p1) {}
    @java.lang.Deprecated
    public void setUserRestriction(java.lang.String p0, boolean p1) {}
    @java.lang.Deprecated
    public void setUserRestriction(java.lang.String p0, boolean p1, android.os.UserHandle p2) {}
    public boolean hasUserRestriction(java.lang.String p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean hasUserRestriction(java.lang.String p0, android.os.UserHandle p1) { return false; }
    public boolean hasUserRestrictionOnAnyUser(java.lang.String p0) { return false; }
    public long getSerialNumberForUser(android.os.UserHandle p0) { return 0L; }
    public android.os.UserHandle getUserForSerialNumber(long p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.UserInfo createUser(java.lang.String p0, int p1) { return null; }
    public android.content.pm.UserInfo createGuest(android.content.Context p0, java.lang.String p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.UserInfo createProfileForUser(java.lang.String p0, int p1, int p2) { return null; }
    public android.content.pm.UserInfo createProfileForUser(java.lang.String p0, int p1, int p2, java.lang.String[] p3) { return null; }
    public android.content.pm.UserInfo createProfileForUserEvenWhenDisallowed(java.lang.String p0, int p1, int p2, java.lang.String[] p3) { return null; }
    public android.content.pm.UserInfo createRestrictedProfile(java.lang.String p0) { return null; }
    public static android.content.Intent createUserCreationIntent(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.PersistableBundle p3) { return null; }
    @android.annotation.SystemApi
    public java.lang.String getSeedAccountName() { return null; }
    @android.annotation.SystemApi
    public java.lang.String getSeedAccountType() { return null; }
    @android.annotation.SystemApi
    public android.os.PersistableBundle getSeedAccountOptions() { return null; }
    public void setSeedAccountData(int p0, java.lang.String p1, java.lang.String p2, android.os.PersistableBundle p3) {}
    @android.annotation.SystemApi
    public void clearSeedAccountData() {}
    public boolean markGuestForDeletion(int p0) { return false; }
    public void setUserEnabled(int p0) {}
    public void setUserAdmin(int p0) {}
    public void evictCredentialEncryptionKey(int p0) {}
    public int getUserCount() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public java.util.List<android.content.pm.UserInfo> getUsers() { return null; }
    @android.annotation.SystemApi
    public long[] getSerialNumbersOfUsers(boolean p0) { return null; }
    public java.lang.String getUserAccount(int p0) { return null; }
    public void setUserAccount(int p0, java.lang.String p1) {}
    public android.content.pm.UserInfo getPrimaryUser() { return null; }
    public boolean canAddMoreUsers() { return false; }
    public boolean canAddMoreManagedProfiles(int p0, boolean p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public java.util.List<android.content.pm.UserInfo> getProfiles(int p0) { return null; }
    public boolean isSameProfileGroup(int p0, int p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public java.util.List<android.content.pm.UserInfo> getEnabledProfiles(int p0) { return null; }
    public java.util.List<android.os.UserHandle> getUserProfiles() { return null; }
    public int[] getProfileIds(int p0, boolean p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public int[] getProfileIdsWithDisabled(int p0) { return null; }
    public int[] getEnabledProfileIds(int p0) { return null; }
    public int getCredentialOwnerProfile(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.UserInfo getProfileParent(int p0) { return null; }
    @android.annotation.SystemApi
    public android.os.UserHandle getProfileParent(android.os.UserHandle p0) { return null; }
    public boolean requestQuietModeEnabled(boolean p0, android.os.UserHandle p1) { return false; }
    public boolean requestQuietModeEnabled(boolean p0, android.os.UserHandle p1, android.content.IntentSender p2) { return false; }
    public boolean isQuietModeEnabled(android.os.UserHandle p0) { return false; }
    public android.graphics.drawable.Drawable getBadgedIconForUser(android.graphics.drawable.Drawable p0, android.os.UserHandle p1) { return null; }
    public android.graphics.drawable.Drawable getBadgedDrawableForUser(android.graphics.drawable.Drawable p0, android.os.UserHandle p1, android.graphics.Rect p2, int p3) { return null; }
    public java.lang.CharSequence getBadgedLabelForUser(java.lang.CharSequence p0, android.os.UserHandle p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.util.List<android.content.pm.UserInfo> getUsers(boolean p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public boolean removeUser(int p0) { return false; }
    @android.annotation.SystemApi
    public boolean removeUser(android.os.UserHandle p0) { return false; }
    public boolean removeUserEvenWhenDisallowed(int p0) { return false; }
    public void setUserName(int p0, java.lang.String p1) {}
    @android.annotation.SystemApi
    public void setUserName(java.lang.String p0) {}
    public void setUserIcon(int p0, android.graphics.Bitmap p1) {}
    @android.annotation.SystemApi
    public void setUserIcon(android.graphics.Bitmap p0) {}
    @android.annotation.UnsupportedAppUsage
    public android.graphics.Bitmap getUserIcon(int p0) { return null; }
    @android.annotation.SystemApi
    public android.graphics.Bitmap getUserIcon() { return null; }
    @android.annotation.UnsupportedAppUsage
    public static int getMaxSupportedUsers() { return 0; }
    public boolean isUserSwitcherEnabled() { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean isDeviceInDemoMode(android.content.Context p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public int getUserSerialNumber(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getUserHandle(int p0) { return 0; }
    public android.os.Bundle getApplicationRestrictions(java.lang.String p0) { return null; }
    public android.os.Bundle getApplicationRestrictions(java.lang.String p0, android.os.UserHandle p1) { return null; }
    public void setApplicationRestrictions(java.lang.String p0, android.os.Bundle p1, android.os.UserHandle p2) {}
    @java.lang.Deprecated
    public boolean setRestrictionsChallenge(java.lang.String p0) { return false; }
    public void setDefaultGuestRestrictions(android.os.Bundle p0) {}
    public android.os.Bundle getDefaultGuestRestrictions() { return null; }
    public long getUserCreationTime(android.os.UserHandle p0) { return 0L; }
    public boolean someUserHasSeedAccount(java.lang.String p0, java.lang.String p1) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserSwitchabilityResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @android.annotation.SystemApi
    public static @interface UserRestrictionSource {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserOperationResult {
    }

    public static class UserOperationException extends java.lang.RuntimeException {
        private final int mUserOperationResult = 0;
        public UserOperationException(java.lang.String p0, int p1) { super(); }
        public int getUserOperationResult() { return 0; }
    }

    @android.annotation.SystemApi
    public static final class EnforcingUser implements android.os.Parcelable {
        private final int userId = 0;
        private final int userRestrictionSource = 0;
        public static final android.os.Parcelable.Creator<android.os.UserManager.EnforcingUser> CREATOR = null;
        public EnforcingUser(int p0, int p1) {}
        private EnforcingUser(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public android.os.UserHandle getUserHandle() { return null; }
        public int getUserRestrictionSource() { return 0; }
    }
}
