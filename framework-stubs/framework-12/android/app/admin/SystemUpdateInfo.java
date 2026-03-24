package android.app.admin;

public final class SystemUpdateInfo implements android.os.Parcelable {
    private static final java.lang.String TAG = "SystemUpdateInfo";
    public static final int SECURITY_PATCH_STATE_UNKNOWN = 0;
    public static final int SECURITY_PATCH_STATE_FALSE = 1;
    public static final int SECURITY_PATCH_STATE_TRUE = 2;
    private static final java.lang.String ATTR_RECEIVED_TIME = "received-time";
    private static final java.lang.String ATTR_SECURITY_PATCH_STATE = "security-patch-state";
    private static final java.lang.String ATTR_ORIGINAL_BUILD = "original-build";
    private final long mReceivedTime = 0L;
    private final int mSecurityPatchState = 0;
    public static final android.os.Parcelable.Creator<android.app.admin.SystemUpdateInfo> CREATOR = null;
    private SystemUpdateInfo(long p0, int p1) {}
    private SystemUpdateInfo(android.os.Parcel p0) {}
    public static android.app.admin.SystemUpdateInfo of(long p0) { return null; }
    public static android.app.admin.SystemUpdateInfo of(long p0, boolean p1) { return null; }
    public long getReceivedTime() { return 0L; }
    public int getSecurityPatchState() { return 0; }
    public void writeToXml(android.util.TypedXmlSerializer p0, java.lang.String p1) throws java.io.IOException {}
    public static android.app.admin.SystemUpdateInfo readFromXml(android.util.TypedXmlPullParser p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    private static java.lang.String securityPatchStateToString(int p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SecurityPatchState {
    }
}
