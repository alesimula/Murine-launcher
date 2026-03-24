package android.content.pm;

public class UserInfo implements android.os.Parcelable {
    @java.lang.Deprecated
    public static final int FLAG_PRIMARY = 1;
    public static final int FLAG_ADMIN = 2;
    @java.lang.Deprecated
    public static final int FLAG_GUEST = 4;
    @java.lang.Deprecated
    public static final int FLAG_RESTRICTED = 8;
    public static final int FLAG_INITIALIZED = 16;
    @java.lang.Deprecated
    public static final int FLAG_MANAGED_PROFILE = 32;
    public static final int FLAG_DISABLED = 64;
    public static final int FLAG_QUIET_MODE = 128;
    public static final int FLAG_EPHEMERAL = 256;
    @java.lang.Deprecated
    public static final int FLAG_DEMO = 512;
    public static final int FLAG_FULL = 1024;
    public static final int FLAG_SYSTEM = 2048;
    public static final int FLAG_PROFILE = 4096;
    public static final int FLAG_EPHEMERAL_ON_CREATE = 8192;
    public static final int FLAG_MAIN = 16384;
    public static final int FLAG_FOR_TESTING = 32768;
    public static final int NO_PROFILE_GROUP_ID = -10000;
    public int id;
    public int serialNumber;
    @android.annotation.Nullable
    public java.lang.String name;
    public java.lang.String iconPath;
    public int flags;
    public long creationTime;
    public long lastLoggedInTime;
    public java.lang.String lastLoggedInFingerprint;
    public java.lang.String userType;
    public int profileGroupId;
    public int restrictedProfileParentId;
    public int profileBadge;
    public boolean partial;
    public boolean guestToRemove;
    public boolean preCreated;
    public boolean convertedFromPreCreated;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.pm.UserInfo> CREATOR = null;
    public UserInfo(int p0, java.lang.String p1, int p2) {}
    public UserInfo(int p0, java.lang.String p1, java.lang.String p2, int p3) {}
    public UserInfo(int p0, java.lang.String p1, java.lang.String p2, int p3, java.lang.String p4) {}
    @android.annotation.NonNull
    public static java.lang.String getDefaultUserType(int p0) { return null; }
    @java.lang.Deprecated
    public boolean isPrimary() { return false; }
    public boolean isAdmin() { return false; }
    public boolean isGuest() { return false; }
    public boolean isRestricted() { return false; }
    public boolean isProfile() { return false; }
    public boolean isManagedProfile() { return false; }
    public boolean isCloneProfile() { return false; }
    @android.annotation.FlaggedApi("android.multiuser.support_communal_profile")
    public boolean isCommunalProfile() { return false; }
    @android.annotation.FlaggedApi("android.os.allow_private_profile")
    public boolean isPrivateProfile() { return false; }
    @android.annotation.FlaggedApi("android.multiuser.allow_supervising_profile")
    public boolean isSupervisingProfile() { return false; }
    public boolean isEnabled() { return false; }
    public boolean isQuietModeEnabled() { return false; }
    public boolean isEphemeral() { return false; }
    public boolean isForTesting() { return false; }
    public boolean isInitialized() { return false; }
    public boolean isDemo() { return false; }
    public boolean isFull() { return false; }
    public boolean isMain() { return false; }
    public boolean supportsSwitchTo() { return false; }
    public boolean supportsSwitchToByUser() { return false; }
    public boolean canHaveProfile() { return false; }
    public boolean canHaveProfile(java.lang.String p0) { return false; }
    @java.lang.Deprecated
    public UserInfo() {}
    public UserInfo(android.content.pm.UserInfo p0) {}
    public android.os.UserHandle getUserHandle() { return null; }
    public java.lang.String toString() { return null; }
    public java.lang.String toFullString() { return null; }
    public static java.lang.String flagsToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserInfoFlag {
    }
}
