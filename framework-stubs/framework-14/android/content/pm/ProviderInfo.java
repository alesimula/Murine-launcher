package android.content.pm;

public final class ProviderInfo extends android.content.pm.ComponentInfo implements android.os.Parcelable {
    public java.lang.String authority;
    public java.lang.String readPermission;
    public java.lang.String writePermission;
    public boolean grantUriPermissions;
    public boolean forceUriPermissions;
    public android.os.PatternMatcher[] uriPermissionPatterns;
    public android.content.pm.PathPermission[] pathPermissions;
    public boolean multiprocess;
    public int initOrder;
    public static final int FLAG_VISIBLE_TO_INSTANT_APP = 1048576;
    public static final int FLAG_SINGLE_USER = 1073741824;
    public int flags;
    @java.lang.Deprecated
    public boolean isSyncable;
    public static final android.os.Parcelable.Creator<android.content.pm.ProviderInfo> CREATOR = null;
    public ProviderInfo() { super(); }
    public ProviderInfo(android.content.pm.ProviderInfo p0) { super(); }
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public void dump(android.util.Printer p0, java.lang.String p1, int p2) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}
