package android.permission;

@android.annotation.SystemApi
public final class AdminPermissionControlParams implements android.os.Parcelable {
    private final java.lang.String mGranteePackageName = null;
    private final java.lang.String mPermission = null;
    private final int mGrantState = 0;
    private final boolean mCanAdminGrantSensorsPermissions = false;
    public static final android.os.Parcelable.Creator<android.permission.AdminPermissionControlParams> CREATOR = null;
    public AdminPermissionControlParams(java.lang.String p0, java.lang.String p1, int p2, boolean p3) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String getGranteePackageName() { return null; }
    public java.lang.String getPermission() { return null; }
    public int getGrantState() { return 0; }
    public boolean canAdminGrantSensorsPermissions() { return false; }
    public java.lang.String toString() { return null; }
}
