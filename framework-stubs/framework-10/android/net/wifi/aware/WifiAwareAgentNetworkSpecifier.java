package android.net.wifi.aware;

public class WifiAwareAgentNetworkSpecifier extends android.net.NetworkSpecifier implements android.os.Parcelable {
    private static final java.lang.String TAG = "WifiAwareAgentNs";
    private static final boolean VDBG = false;
    private java.util.Set<android.net.wifi.aware.WifiAwareAgentNetworkSpecifier.ByteArrayWrapper> mNetworkSpecifiers;
    private java.security.MessageDigest mDigester;
    public static final android.os.Parcelable.Creator<android.net.wifi.aware.WifiAwareAgentNetworkSpecifier> CREATOR = null;
    public WifiAwareAgentNetworkSpecifier() { super(); }
    public WifiAwareAgentNetworkSpecifier(android.net.wifi.aware.WifiAwareNetworkSpecifier p0) { super(); }
    public WifiAwareAgentNetworkSpecifier(android.net.wifi.aware.WifiAwareNetworkSpecifier[] p0) { super(); }
    public boolean isEmpty() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public boolean satisfiedBy(android.net.NetworkSpecifier p0) { return false; }
    public boolean satisfiesAwareNetworkSpecifier(android.net.wifi.aware.WifiAwareNetworkSpecifier p0) { return false; }
    public void assertValidFromUid(int p0) {}
    public android.net.NetworkSpecifier redact() { return null; }
    private void initialize() {}
    private android.net.wifi.aware.WifiAwareAgentNetworkSpecifier.ByteArrayWrapper convert(android.net.wifi.aware.WifiAwareNetworkSpecifier p0) { return null; }

    private static class ByteArrayWrapper implements android.os.Parcelable {
        private byte[] mData;
        public static final android.os.Parcelable.Creator<android.net.wifi.aware.WifiAwareAgentNetworkSpecifier.ByteArrayWrapper> CREATOR = null;
        ByteArrayWrapper(byte[] p0) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }
}
