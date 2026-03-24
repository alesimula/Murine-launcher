package android.content.pm;

@android.annotation.SystemApi
public final class InstantAppInfo implements android.os.Parcelable {
    private final android.content.pm.ApplicationInfo mApplicationInfo = null;
    private final java.lang.String mPackageName = null;
    private final java.lang.CharSequence mLabelText = null;
    private final java.lang.String[] mRequestedPermissions = null;
    private final java.lang.String[] mGrantedPermissions = null;
    public static final android.os.Parcelable.Creator<android.content.pm.InstantAppInfo> CREATOR = null;
    public InstantAppInfo(android.content.pm.ApplicationInfo p0, java.lang.String[] p1, java.lang.String[] p2) {}
    public InstantAppInfo(java.lang.String p0, java.lang.CharSequence p1, java.lang.String[] p2, java.lang.String[] p3) {}
    private InstantAppInfo(android.os.Parcel p0) {}
    public android.content.pm.ApplicationInfo getApplicationInfo() { return null; }
    public java.lang.String getPackageName() { return null; }
    public java.lang.CharSequence loadLabel(android.content.pm.PackageManager p0) { return null; }
    public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager p0) { return null; }
    public java.lang.String[] getRequestedPermissions() { return null; }
    public java.lang.String[] getGrantedPermissions() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
