package android.content.pm;

public class PermissionGroupInfo extends android.content.pm.PackageItemInfo implements android.os.Parcelable {
    public int descriptionRes;
    @android.annotation.SystemApi
    public int requestRes;
    @android.annotation.SystemApi
    public final int requestDetailResourceId = 0;
    @android.annotation.SystemApi
    public final int backgroundRequestResourceId = 0;
    @android.annotation.SystemApi
    public final int backgroundRequestDetailResourceId = 0;
    @android.annotation.Nullable
    public java.lang.CharSequence nonLocalizedDescription;
    public static final int FLAG_PERSONAL_INFO = 1;
    public int flags;
    public int priority;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.pm.PermissionGroupInfo> CREATOR = null;
    public PermissionGroupInfo(int p0, int p1, int p2) { super(); }
    @java.lang.Deprecated
    public PermissionGroupInfo() { super(); }
    @java.lang.Deprecated
    public PermissionGroupInfo(android.content.pm.PermissionGroupInfo p0) { super(); }
    @android.annotation.Nullable
    public java.lang.CharSequence loadDescription(android.content.pm.PackageManager p0) { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }
}
