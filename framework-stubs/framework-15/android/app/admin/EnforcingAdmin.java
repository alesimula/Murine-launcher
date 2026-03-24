package android.app.admin;

@android.annotation.SystemApi
public final class EnforcingAdmin implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.admin.EnforcingAdmin> CREATOR = null;
    public EnforcingAdmin(java.lang.String p0, android.app.admin.Authority p1, android.os.UserHandle p2) {}
    @android.annotation.FlaggedApi("android.app.admin.flags.device_policy_size_tracking_internal_bug_fix_enabled")
    public EnforcingAdmin(java.lang.String p0, android.app.admin.Authority p1, android.os.UserHandle p2, android.content.ComponentName p3) {}
    @android.annotation.NonNull
    public android.app.admin.Authority getAuthority() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.NonNull
    public android.os.UserHandle getUserHandle() { return null; }
    @android.annotation.Nullable
    public android.content.ComponentName getComponentName() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
