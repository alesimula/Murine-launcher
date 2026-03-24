package android.net;

public final class NetworkStateSnapshot implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.NetworkStateSnapshot> CREATOR = null;
    public NetworkStateSnapshot(android.net.Network p0, android.net.NetworkCapabilities p1, android.net.LinkProperties p2, java.lang.String p3, int p4) {}
    public int describeContents() { return 0; }
    public int getLegacyType() { return 0; }
    @android.annotation.NonNull
    public android.net.LinkProperties getLinkProperties() { return null; }
    @android.annotation.NonNull
    public android.net.Network getNetwork() { return null; }
    @android.annotation.NonNull
    public android.net.NetworkCapabilities getNetworkCapabilities() { return null; }
    public int getSubId() { return 0; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public java.lang.String getSubscriberId() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
