package android.permission;

@android.annotation.SystemApi
public final class PermissionGroupUsage implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.permission.PermissionGroupUsage> CREATOR = null;
    public PermissionGroupUsage(java.lang.String p0, int p1, long p2, java.lang.String p3, boolean p4, boolean p5, java.lang.CharSequence p6, java.lang.CharSequence p7, java.lang.CharSequence p8, java.lang.String p9) {}
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    public int getUid() { return 0; }
    public long getLastAccessTimeMillis() { return 0L; }
    @android.annotation.NonNull
    public java.lang.String getPermissionGroupName() { return null; }
    public boolean isActive() { return false; }
    public boolean isPhoneCall() { return false; }
    @android.annotation.Nullable
    public java.lang.CharSequence getAttributionTag() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getAttributionLabel() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getProxyLabel() { return null; }
    @android.annotation.FlaggedApi("android.permission.flags.device_aware_permission_apis_enabled")
    @android.annotation.NonNull
    public java.lang.String getPersistentDeviceId() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    PermissionGroupUsage(android.os.Parcel p0) {}
}
