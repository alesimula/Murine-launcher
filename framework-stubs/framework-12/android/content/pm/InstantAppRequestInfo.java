package android.content.pm;

@android.annotation.SystemApi
public final class InstantAppRequestInfo implements android.os.Parcelable {
    private final android.content.Intent mIntent = null;
    private final int[] mHostDigestPrefix = null;
    private final android.os.UserHandle mUserHandle = null;
    private final boolean mRequesterInstantApp = false;
    private final java.lang.String mToken = null;
    public static final android.os.Parcelable.Creator<android.content.pm.InstantAppRequestInfo> CREATOR = null;
    public InstantAppRequestInfo(android.content.Intent p0, int[] p1, android.os.UserHandle p2, boolean p3, java.lang.String p4) {}
    public android.content.Intent getIntent() { return null; }
    public int[] getHostDigestPrefix() { return null; }
    public android.os.UserHandle getUserHandle() { return null; }
    public boolean isRequesterInstantApp() { return false; }
    public java.lang.String getToken() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    InstantAppRequestInfo(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
}
