package android.net.wifi.aware;

public final class WifiAwareNetworkSpecifier extends android.net.NetworkSpecifier implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.aware.WifiAwareNetworkSpecifier> CREATOR = null;
    WifiAwareNetworkSpecifier() { super(); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean canBeSatisfiedBy(android.net.NetworkSpecifier p0) { return false; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(android.net.wifi.aware.DiscoverySession p0, android.net.wifi.aware.PeerHandle p1) {}
        public Builder(android.net.wifi.aware.PublishDiscoverySession p0) {}
        @android.annotation.NonNull
        public android.net.wifi.aware.WifiAwareNetworkSpecifier.Builder setPskPassphrase(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.WifiAwareNetworkSpecifier.Builder setPmk(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.WifiAwareNetworkSpecifier.Builder setPort(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.WifiAwareNetworkSpecifier.Builder setTransportProtocol(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.WifiAwareNetworkSpecifier build() { return null; }
    }
}
