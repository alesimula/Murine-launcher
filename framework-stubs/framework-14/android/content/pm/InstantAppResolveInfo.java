package android.content.pm;

@android.annotation.SystemApi
public final class InstantAppResolveInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.InstantAppResolveInfo> CREATOR = null;
    public InstantAppResolveInfo(android.content.pm.InstantAppResolveInfo.InstantAppDigest p0, java.lang.String p1, java.util.List<android.content.pm.InstantAppIntentFilter> p2, int p3) {}
    public InstantAppResolveInfo(android.content.pm.InstantAppResolveInfo.InstantAppDigest p0, java.lang.String p1, java.util.List<android.content.pm.InstantAppIntentFilter> p2, long p3, android.os.Bundle p4) {}
    public InstantAppResolveInfo(java.lang.String p0, java.lang.String p1, java.util.List<android.content.pm.InstantAppIntentFilter> p2) {}
    public InstantAppResolveInfo(android.os.Bundle p0) {}
    InstantAppResolveInfo(android.os.Parcel p0) {}
    public boolean shouldLetInstallerDecide() { return false; }
    public byte[] getDigestBytes() { return null; }
    public int getDigestPrefix() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public java.util.List<android.content.pm.InstantAppIntentFilter> getIntentFilters() { return null; }
    @java.lang.Deprecated
    public int getVersionCode() { return 0; }
    public long getLongVersionCode() { return 0L; }
    public android.os.Bundle getExtras() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class InstantAppDigest implements android.os.Parcelable {
        static final int DIGEST_MASK = -4096;
        public static final android.content.pm.InstantAppResolveInfo.InstantAppDigest UNDEFINED = null;
        public static final android.os.Parcelable.Creator<android.content.pm.InstantAppResolveInfo.InstantAppDigest> CREATOR = null;
        public InstantAppDigest(java.lang.String p0) {}
        public InstantAppDigest(java.lang.String p0, int p1) {}
        InstantAppDigest(android.os.Parcel p0) {}
        public byte[][] getDigestBytes() { return null; }
        public int[] getDigestPrefix() { return null; }
        public int[] getDigestPrefixSecure() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
