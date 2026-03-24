package android.content.pm;

public class ArchivedPackageParcel implements android.os.Parcelable {
    public java.lang.String packageName;
    public android.content.pm.SigningDetails signingDetails;
    public int versionCode;
    public int versionCodeMajor;
    public int targetSdkVersion;
    public java.lang.String defaultToDeviceProtectedStorage;
    public java.lang.String requestLegacyExternalStorage;
    public java.lang.String userDataFragile;
    public android.content.pm.ArchivedActivityParcel[] archivedActivities;
    public static final android.os.Parcelable.Creator<android.content.pm.ArchivedPackageParcel> CREATOR = null;
    public ArchivedPackageParcel() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
