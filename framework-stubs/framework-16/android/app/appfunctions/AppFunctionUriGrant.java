package android.app.appfunctions;

@android.annotation.FlaggedApi("android.permission.flags.app_function_access_api_enabled")
public final class AppFunctionUriGrant implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appfunctions.AppFunctionUriGrant> CREATOR = null;
    public AppFunctionUriGrant(android.net.Uri p0, int p1) {}
    @android.annotation.NonNull
    public android.net.Uri getUri() { return null; }
    public int getModeFlags() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GrantUriMode {
    }
}
