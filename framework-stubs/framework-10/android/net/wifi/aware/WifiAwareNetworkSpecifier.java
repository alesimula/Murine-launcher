package android.net.wifi.aware;

public final class WifiAwareNetworkSpecifier extends android.net.NetworkSpecifier implements android.os.Parcelable {
    public static final int NETWORK_SPECIFIER_TYPE_IB = 0;
    public static final int NETWORK_SPECIFIER_TYPE_IB_ANY_PEER = 1;
    public static final int NETWORK_SPECIFIER_TYPE_OOB = 2;
    public static final int NETWORK_SPECIFIER_TYPE_OOB_ANY_PEER = 3;
    public static final int NETWORK_SPECIFIER_TYPE_MAX_VALID = 3;
    public final int type = 0;
    public final int role = 0;
    public final int clientId = 0;
    public final int sessionId = 0;
    public final int peerId = 0;
    public final byte[] peerMac = null;
    public final byte[] pmk = null;
    public final java.lang.String passphrase = null;
    public final int port = 0;
    public final int transportProtocol = 0;
    public final int requestorUid = 0;
    public static final android.os.Parcelable.Creator<android.net.wifi.aware.WifiAwareNetworkSpecifier> CREATOR = null;
    public WifiAwareNetworkSpecifier(int p0, int p1, int p2, int p3, int p4, byte[] p5, byte[] p6, java.lang.String p7, int p8, int p9, int p10) { super(); }
    public boolean isOutOfBand() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean satisfiedBy(android.net.NetworkSpecifier p0) { return false; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void assertValidFromUid(int p0) {}

    public static final class Builder {
        private android.net.wifi.aware.DiscoverySession mDiscoverySession;
        private android.net.wifi.aware.PeerHandle mPeerHandle;
        private java.lang.String mPskPassphrase;
        private byte[] mPmk;
        private int mPort;
        private int mTransportProtocol;
        public Builder(android.net.wifi.aware.DiscoverySession p0, android.net.wifi.aware.PeerHandle p1) {}
        public android.net.wifi.aware.WifiAwareNetworkSpecifier.Builder setPskPassphrase(java.lang.String p0) { return null; }
        @android.annotation.SystemApi
        public android.net.wifi.aware.WifiAwareNetworkSpecifier.Builder setPmk(byte[] p0) { return null; }
        public android.net.wifi.aware.WifiAwareNetworkSpecifier.Builder setPort(int p0) { return null; }
        public android.net.wifi.aware.WifiAwareNetworkSpecifier.Builder setTransportProtocol(int p0) { return null; }
        public android.net.wifi.aware.WifiAwareNetworkSpecifier build() { return null; }
    }
}
