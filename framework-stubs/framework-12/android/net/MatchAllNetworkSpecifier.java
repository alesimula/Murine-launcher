package android.net;

@android.annotation.SystemApi
public final class MatchAllNetworkSpecifier extends android.net.NetworkSpecifier implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.net.MatchAllNetworkSpecifier> CREATOR = null;
    public MatchAllNetworkSpecifier() { super(); }
    public boolean canBeSatisfiedBy(android.net.NetworkSpecifier p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
