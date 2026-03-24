package android.net.wifi.rtt;

public final class RangingRequest implements android.os.Parcelable {
    private static final int MAX_PEERS = 10;
    public final java.util.List<android.net.wifi.rtt.ResponderConfig> mRttPeers = null;
    public static final android.os.Parcelable.Creator<android.net.wifi.rtt.RangingRequest> CREATOR = null;
    public static int getMaxPeers() { return 0; }
    private RangingRequest(java.util.List<android.net.wifi.rtt.ResponderConfig> p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public void enforceValidity(boolean p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        private java.util.List<android.net.wifi.rtt.ResponderConfig> mRttPeers;
        public Builder() {}
        public android.net.wifi.rtt.RangingRequest.Builder addAccessPoint(android.net.wifi.ScanResult p0) { return null; }
        public android.net.wifi.rtt.RangingRequest.Builder addAccessPoints(java.util.List<android.net.wifi.ScanResult> p0) { return null; }
        public android.net.wifi.rtt.RangingRequest.Builder addWifiAwarePeer(android.net.MacAddress p0) { return null; }
        public android.net.wifi.rtt.RangingRequest.Builder addWifiAwarePeer(android.net.wifi.aware.PeerHandle p0) { return null; }
        @android.annotation.SystemApi
        public android.net.wifi.rtt.RangingRequest.Builder addResponder(android.net.wifi.rtt.ResponderConfig p0) { return null; }
        public android.net.wifi.rtt.RangingRequest build() { return null; }
    }
}
