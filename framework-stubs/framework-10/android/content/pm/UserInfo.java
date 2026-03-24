package android.content.pm;

public class UserInfo implements android.os.Parcelable {
    public static final int FLAG_MASK_USER_TYPE = 65535;
    @android.annotation.UnsupportedAppUsage
    public static final int FLAG_PRIMARY = 1;
    public static final int FLAG_ADMIN = 2;
    public static final int FLAG_GUEST = 4;
    public static final int FLAG_RESTRICTED = 8;
    public static final int FLAG_INITIALIZED = 16;
    public static final int FLAG_MANAGED_PROFILE = 32;
    public static final int FLAG_DISABLED = 64;
    public static final int FLAG_QUIET_MODE = 128;
    public static final int FLAG_EPHEMERAL = 256;
    public static final int FLAG_DEMO = 512;
    public static final int NO_PROFILE_GROUP_ID = -10000;
    @android.annotation.UnsupportedAppUsage
    public int id;
    @android.annotation.UnsupportedAppUsage
    public int serialNumber;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String name;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String iconPath;
    @android.annotation.UnsupportedAppUsage
    public int flags;
    @android.annotation.UnsupportedAppUsage
    public long creationTime;
    @android.annotation.UnsupportedAppUsage
    public long lastLoggedInTime;
    public java.lang.String lastLoggedInFingerprint;
    @android.annotation.UnsupportedAppUsage
    public int profileGroupId;
    public int restrictedProfileParentId;
    public int profileBadge;
    @android.annotation.UnsupportedAppUsage
    public boolean partial;
    @android.annotation.UnsupportedAppUsage
    public boolean guestToRemove;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.Parcelable.Creator<android.content.pm.UserInfo> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public UserInfo(int p0, java.lang.String p1, int p2) {}
    @android.annotation.UnsupportedAppUsage
    public UserInfo(int p0, java.lang.String p1, java.lang.String p2, int p3) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isPrimary() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isAdmin() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isGuest() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isRestricted() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isManagedProfile() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isEnabled() { return false; }
    public boolean isQuietModeEnabled() { return false; }
    public boolean isEphemeral() { return false; }
    public boolean isInitialized() { return false; }
    public boolean isDemo() { return false; }
    public boolean isSystemOnly() { return false; }
    public static boolean isSystemOnly(int p0) { return false; }
    public boolean supportsSwitchTo() { return false; }
    public boolean supportsSwitchToByUser() { return false; }
    public boolean canHaveProfile() { return false; }
    public UserInfo() {}
    public UserInfo(android.content.pm.UserInfo p0) {}
    @android.annotation.UnsupportedAppUsage
    public android.os.UserHandle getUserHandle() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private UserInfo(android.os.Parcel p0) {}
}
