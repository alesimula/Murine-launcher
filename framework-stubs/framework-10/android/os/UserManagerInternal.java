package android.os;

public abstract class UserManagerInternal {
    public static final int CAMERA_NOT_DISABLED = 0;
    public static final int CAMERA_DISABLED_LOCALLY = 1;
    public static final int CAMERA_DISABLED_GLOBALLY = 2;
    public UserManagerInternal() {}
    public abstract void setDevicePolicyUserRestrictions(int p0, android.os.Bundle p1, boolean p2, int p3);
    public abstract android.os.Bundle getBaseUserRestrictions(int p0);
    public abstract void setBaseUserRestrictionsByDpmsForMigration(int p0, android.os.Bundle p1);
    public abstract boolean getUserRestriction(int p0, java.lang.String p1);
    public abstract void addUserRestrictionsListener(android.os.UserManagerInternal.UserRestrictionsListener p0);
    public abstract void removeUserRestrictionsListener(android.os.UserManagerInternal.UserRestrictionsListener p0);
    public abstract void setDeviceManaged(boolean p0);
    public abstract void setUserManaged(int p0, boolean p1);
    public abstract void setUserIcon(int p0, android.graphics.Bitmap p1);
    public abstract void setForceEphemeralUsers(boolean p0);
    public abstract void removeAllUsers();
    public abstract void onEphemeralUserStop(int p0);
    public abstract android.content.pm.UserInfo createUserEvenWhenDisallowed(java.lang.String p0, int p1, java.lang.String[] p2);
    public abstract boolean removeUserEvenWhenDisallowed(int p0);
    public abstract boolean isUserUnlockingOrUnlocked(int p0);
    public abstract boolean isUserUnlocked(int p0);
    public abstract boolean isUserRunning(int p0);
    public abstract boolean isUserInitialized(int p0);
    public abstract boolean exists(int p0);
    public abstract void setUserState(int p0, int p1);
    public abstract void removeUserState(int p0);
    public abstract int[] getUserIds();
    public abstract boolean isProfileAccessible(int p0, int p1, java.lang.String p2, boolean p3);
    public abstract int getProfileParentId(int p0);
    public abstract boolean isSettingRestrictedForUser(java.lang.String p0, int p1, java.lang.String p2, int p3);

    public static interface UserRestrictionsListener {
        public void onUserRestrictionsChanged(int p0, android.os.Bundle p1, android.os.Bundle p2);
    }
}
