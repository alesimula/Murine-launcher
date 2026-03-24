package android.companion.virtual;

@android.annotation.SystemApi
public final class VirtualDeviceParams implements android.os.Parcelable {
    public static final int LOCK_STATE_DEFAULT = 0;
    public static final int LOCK_STATE_ALWAYS_UNLOCKED = 1;
    public static final int ACTIVITY_POLICY_DEFAULT_ALLOWED = 0;
    public static final int ACTIVITY_POLICY_DEFAULT_BLOCKED = 1;
    public static final int NAVIGATION_POLICY_DEFAULT_ALLOWED = 0;
    public static final int NAVIGATION_POLICY_DEFAULT_BLOCKED = 1;
    public static final android.os.Parcelable.Creator<android.companion.virtual.VirtualDeviceParams> CREATOR = null;
    public int getLockState() { return 0; }
    public java.util.Set<android.os.UserHandle> getUsersWithMatchingAccounts() { return null; }
    public java.util.Set<android.content.ComponentName> getAllowedCrossTaskNavigations() { return null; }
    public java.util.Set<android.content.ComponentName> getBlockedCrossTaskNavigations() { return null; }
    public int getDefaultNavigationPolicy() { return 0; }
    public java.util.Set<android.content.ComponentName> getAllowedActivities() { return null; }
    public java.util.Set<android.content.ComponentName> getBlockedActivities() { return null; }
    public int getDefaultActivityPolicy() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface ActivityPolicy {
    }

    public static final class Builder {
        public Builder() {}
        @android.annotation.RequiresPermission(value="android.permission.ADD_ALWAYS_UNLOCKED_DISPLAY", conditional=true)
        public android.companion.virtual.VirtualDeviceParams.Builder setLockState(int p0) { return null; }
        public android.companion.virtual.VirtualDeviceParams.Builder setUsersWithMatchingAccounts(java.util.Set<android.os.UserHandle> p0) { return null; }
        public android.companion.virtual.VirtualDeviceParams.Builder setAllowedCrossTaskNavigations(java.util.Set<android.content.ComponentName> p0) { return null; }
        public android.companion.virtual.VirtualDeviceParams.Builder setBlockedCrossTaskNavigations(java.util.Set<android.content.ComponentName> p0) { return null; }
        public android.companion.virtual.VirtualDeviceParams.Builder setAllowedActivities(java.util.Set<android.content.ComponentName> p0) { return null; }
        public android.companion.virtual.VirtualDeviceParams.Builder setBlockedActivities(java.util.Set<android.content.ComponentName> p0) { return null; }
        public android.companion.virtual.VirtualDeviceParams build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface LockState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface NavigationPolicy {
    }
}
