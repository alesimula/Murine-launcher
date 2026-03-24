package android.net;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public final class NetworkStateSnapshot implements android.os.Parcelable {
    private final android.net.Network mNetwork = null;
    private final android.net.NetworkCapabilities mNetworkCapabilities = null;
    private final android.net.LinkProperties mLinkProperties = null;
    private final java.lang.String mSubscriberId = null;
    private final int mLegacyType = 0;
    public static final android.os.Parcelable.Creator<android.net.NetworkStateSnapshot> CREATOR = null;
    public NetworkStateSnapshot(android.net.Network p0, android.net.NetworkCapabilities p1, android.net.LinkProperties p2, java.lang.String p3, int p4) {}
    public NetworkStateSnapshot(android.os.Parcel p0) {}
    public android.net.Network getNetwork() { return null; }
    public android.net.NetworkCapabilities getNetworkCapabilities() { return null; }
    public android.net.LinkProperties getLinkProperties() { return null; }
    public java.lang.String getSubscriberId() { return null; }
    public int getLegacyType() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}
