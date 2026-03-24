package android.net;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public final class UnderlyingNetworkInfo implements android.os.Parcelable {
    private final int mOwnerUid = 0;
    private final java.lang.String mIface = null;
    private final java.util.List<java.lang.String> mUnderlyingIfaces = null;
    public static final android.os.Parcelable.Creator<android.net.UnderlyingNetworkInfo> CREATOR = null;
    public UnderlyingNetworkInfo(int p0, java.lang.String p1, java.util.List<java.lang.String> p2) {}
    private UnderlyingNetworkInfo(android.os.Parcel p0) {}
    public int getOwnerUid() { return 0; }
    public java.lang.String getInterface() { return null; }
    public java.util.List<java.lang.String> getUnderlyingInterfaces() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
