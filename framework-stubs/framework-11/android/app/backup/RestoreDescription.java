package android.app.backup;

@android.annotation.SystemApi
public class RestoreDescription implements android.os.Parcelable {
    private final java.lang.String mPackageName = null;
    private final int mDataType = 0;
    private static final java.lang.String NO_MORE_PACKAGES_SENTINEL = "NO_MORE_PACKAGES";
    public static final android.app.backup.RestoreDescription NO_MORE_PACKAGES = null;
    public static final int TYPE_KEY_VALUE = 1;
    public static final int TYPE_FULL_STREAM = 2;
    public static final android.os.Parcelable.Creator<android.app.backup.RestoreDescription> CREATOR = null;
    public java.lang.String toString() { return null; }
    public RestoreDescription(java.lang.String p0, int p1) {}
    public java.lang.String getPackageName() { return null; }
    public int getDataType() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private RestoreDescription(android.os.Parcel p0) {}
}
