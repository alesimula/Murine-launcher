package android.app.admin;

public final class SystemUpdateInfo implements android.os.Parcelable {
    public static final int SECURITY_PATCH_STATE_UNKNOWN = 0;
    public static final int SECURITY_PATCH_STATE_FALSE = 1;
    public static final int SECURITY_PATCH_STATE_TRUE = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.admin.SystemUpdateInfo> CREATOR = null;
    @android.annotation.Nullable
    public static android.app.admin.SystemUpdateInfo of(long p0) { return null; }
    @android.annotation.Nullable
    public static android.app.admin.SystemUpdateInfo of(long p0, boolean p1) { return null; }
    public long getReceivedTime() { return 0L; }
    public int getSecurityPatchState() { return 0; }
    public void writeToXml(com.android.modules.utils.TypedXmlSerializer p0, java.lang.String p1) throws java.io.IOException {}
    @android.annotation.Nullable
    public static android.app.admin.SystemUpdateInfo readFromXml(com.android.modules.utils.TypedXmlPullParser p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SecurityPatchState {
    }
}
