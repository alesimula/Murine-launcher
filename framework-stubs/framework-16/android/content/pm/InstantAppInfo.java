package android.content.pm;

@android.annotation.SystemApi
public final class InstantAppInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.pm.InstantAppInfo> CREATOR = null;
    public InstantAppInfo(android.content.pm.ApplicationInfo p0, java.lang.String[] p1, java.lang.String[] p2) {}
    public InstantAppInfo(java.lang.String p0, java.lang.CharSequence p1, java.lang.String[] p2, java.lang.String[] p3) {}
    @android.annotation.Nullable
    public android.content.pm.ApplicationInfo getApplicationInfo() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.NonNull
    public java.lang.CharSequence loadLabel(android.content.pm.PackageManager p0) { return null; }
    @android.annotation.NonNull
    public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager p0) { return null; }
    @android.annotation.Nullable
    public java.lang.String[] getRequestedPermissions() { return null; }
    @android.annotation.Nullable
    public java.lang.String[] getGrantedPermissions() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
