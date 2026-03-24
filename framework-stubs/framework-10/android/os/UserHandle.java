package android.os;

public final class UserHandle implements android.os.Parcelable {
    @android.annotation.UnsupportedAppUsage
    public static final int PER_USER_RANGE = 100000;
    @android.annotation.UnsupportedAppUsage
    public static final int USER_ALL = -1;
    @android.annotation.SystemApi
    public static final android.os.UserHandle ALL = null;
    @android.annotation.UnsupportedAppUsage
    public static final int USER_CURRENT = -2;
    @android.annotation.SystemApi
    public static final android.os.UserHandle CURRENT = null;
    @android.annotation.UnsupportedAppUsage
    public static final int USER_CURRENT_OR_SELF = -3;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.UserHandle CURRENT_OR_SELF = null;
    @android.annotation.UnsupportedAppUsage
    public static final int USER_NULL = -10000;
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static final int USER_OWNER = 0;
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static final android.os.UserHandle OWNER = null;
    @android.annotation.UnsupportedAppUsage
    public static final int USER_SYSTEM = 0;
    @android.annotation.UnsupportedAppUsage
    public static final int USER_SERIAL_SYSTEM = 0;
    @android.annotation.SystemApi
    public static final android.os.UserHandle SYSTEM = null;
    @android.annotation.UnsupportedAppUsage
    public static final boolean MU_ENABLED = true;
    @android.annotation.UnsupportedAppUsage
    public static final int ERR_GID = -1;
    @android.annotation.UnsupportedAppUsage
    public static final int AID_ROOT = 0;
    @android.annotation.UnsupportedAppUsage
    public static final int AID_APP_START = 10000;
    @android.annotation.UnsupportedAppUsage
    public static final int AID_APP_END = 19999;
    @android.annotation.UnsupportedAppUsage
    public static final int AID_SHARED_GID_START = 50000;
    @android.annotation.UnsupportedAppUsage
    public static final int AID_CACHE_GID_START = 20000;
    @android.annotation.UnsupportedAppUsage
    final int mHandle = 0;
    public static final android.os.Parcelable.Creator<android.os.UserHandle> CREATOR = null;
    public static boolean isSameUser(int p0, int p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean isSameApp(int p0, int p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean isIsolated(int p0) { return false; }
    public static boolean isApp(int p0) { return false; }
    public static boolean isCore(int p0) { return false; }
    public static android.os.UserHandle getUserHandleForUid(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static int getUserId(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static int getCallingUserId() { return 0; }
    public static int getCallingAppId() { return 0; }
    @android.annotation.SystemApi
    public static android.os.UserHandle of(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static int getUid(int p0, int p1) { return 0; }
    @android.annotation.SystemApi
    public static int getAppId(int p0) { return 0; }
    public static int getUserGid(int p0) { return 0; }
    public static int getSharedAppGid(int p0) { return 0; }
    public static int getSharedAppGid(int p0, int p1) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static int getAppIdFromSharedAppGid(int p0) { return 0; }
    public static int getCacheAppGid(int p0) { return 0; }
    public static int getCacheAppGid(int p0, int p1) { return 0; }
    public static void formatUid(java.lang.StringBuilder p0, int p1) {}
    public static java.lang.String formatUid(int p0) { return null; }
    public static void formatUid(java.io.PrintWriter p0, int p1) {}
    public static int parseUserArg(java.lang.String p0) { return 0; }
    @android.annotation.SystemApi
    public static int myUserId() { return 0; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public boolean isOwner() { return false; }
    @android.annotation.SystemApi
    public boolean isSystem() { return false; }
    @android.annotation.UnsupportedAppUsage
    public UserHandle(int p0) {}
    @android.annotation.SystemApi
    public int getIdentifier() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static void writeToParcel(android.os.UserHandle p0, android.os.Parcel p1) {}
    public static android.os.UserHandle readFromParcel(android.os.Parcel p0) { return null; }
    public UserHandle(android.os.Parcel p0) {}
}
