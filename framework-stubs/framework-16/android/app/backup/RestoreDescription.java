package android.app.backup;

@android.annotation.SystemApi
public class RestoreDescription implements android.os.Parcelable {
    public static final android.app.backup.RestoreDescription NO_MORE_PACKAGES = null;
    public static final int TYPE_KEY_VALUE = 1;
    public static final int TYPE_FULL_STREAM = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.backup.RestoreDescription> CREATOR = null;
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public RestoreDescription(java.lang.String p0, int p1) {}
    public java.lang.String getPackageName() { return null; }
    public int getDataType() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
