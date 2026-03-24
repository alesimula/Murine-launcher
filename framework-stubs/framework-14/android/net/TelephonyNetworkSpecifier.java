package android.net;

public final class TelephonyNetworkSpecifier extends android.net.NetworkSpecifier implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.net.TelephonyNetworkSpecifier> CREATOR = null;
    public int getSubscriptionId() { return 0; }
    public TelephonyNetworkSpecifier(int p0) { super(); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public boolean canBeSatisfiedBy(android.net.NetworkSpecifier p0) { return false; }

    public static final class Builder {
        public Builder() {}
        public android.net.TelephonyNetworkSpecifier.Builder setSubscriptionId(int p0) { return null; }
        public android.net.TelephonyNetworkSpecifier build() { return null; }
    }
}
