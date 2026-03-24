package android.net.wifi.rtt;

public final class RangingRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.rtt.RangingRequest> CREATOR = null;
    private RangingRequest() {}
    public static int getMaxPeers() { return 0; }
    public static int getDefaultRttBurstSize() { return 0; }
    public static int getMinRttBurstSize() { return 0; }
    public static int getMaxRttBurstSize() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.rtt.ResponderConfig> getRttResponders() { return null; }
    public int getRttBurstSize() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingRequest.Builder setRttBurstSize(int p0) { return null; }
        public android.net.wifi.rtt.RangingRequest.Builder addAccessPoint(android.net.wifi.ScanResult p0) { return null; }
        public android.net.wifi.rtt.RangingRequest.Builder addAccessPoints(java.util.List<android.net.wifi.ScanResult> p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingRequest.Builder addNon80211mcCapableAccessPoint(android.net.wifi.ScanResult p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingRequest.Builder addNon80211mcCapableAccessPoints(java.util.List<android.net.wifi.ScanResult> p0) { return null; }
        public android.net.wifi.rtt.RangingRequest.Builder addWifiAwarePeer(android.net.MacAddress p0) { return null; }
        public android.net.wifi.rtt.RangingRequest.Builder addWifiAwarePeer(android.net.wifi.aware.PeerHandle p0) { return null; }
        public android.net.wifi.rtt.RangingRequest.Builder addResponder(android.net.wifi.rtt.ResponderConfig p0) { return null; }
        public android.net.wifi.rtt.RangingRequest build() { return null; }
    }
}
