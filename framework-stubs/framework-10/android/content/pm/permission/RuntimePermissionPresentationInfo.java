package android.content.pm.permission;

@java.lang.Deprecated
@android.annotation.SystemApi
public final class RuntimePermissionPresentationInfo implements android.os.Parcelable {
    private static final int FLAG_GRANTED = 1;
    private static final int FLAG_STANDARD = 2;
    private final java.lang.CharSequence mLabel = null;
    private final int mFlags = 0;
    public static final android.os.Parcelable.Creator<android.content.pm.permission.RuntimePermissionPresentationInfo> CREATOR = null;
    public RuntimePermissionPresentationInfo(java.lang.CharSequence p0, boolean p1, boolean p2) {}
    private RuntimePermissionPresentationInfo(android.os.Parcel p0) {}
    public boolean isGranted() { return false; }
    public boolean isStandard() { return false; }
    public java.lang.CharSequence getLabel() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
