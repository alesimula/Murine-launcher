package android.net;

public class NetworkState implements android.os.Parcelable {
    private static final boolean SANITY_CHECK_ROAMING = false;
    public static final android.net.NetworkState EMPTY = null;
    public final android.net.NetworkInfo networkInfo = null;
    public final android.net.LinkProperties linkProperties = null;
    public final android.net.NetworkCapabilities networkCapabilities = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public final android.net.Network network = null;
    public final java.lang.String subscriberId = null;
    public final java.lang.String networkId = null;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.Parcelable.Creator<android.net.NetworkState> CREATOR = null;
    public NetworkState(android.net.NetworkInfo p0, android.net.LinkProperties p1, android.net.NetworkCapabilities p2, android.net.Network p3, java.lang.String p4, java.lang.String p5) {}
    @android.annotation.UnsupportedAppUsage
    public NetworkState(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
