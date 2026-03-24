package android.net.wifi.rtt;

public final class RangingRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.rtt.RangingRequest> CREATOR = null;
    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    public static final int SECURITY_MODE_OPEN = 0;
    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    public static final int SECURITY_MODE_OPPORTUNISTIC = 1;
    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    public static final int SECURITY_MODE_SECURE_AUTH = 2;
    RangingRequest() {}
    public int describeContents() { return 0; }
    public static int getDefaultRttBurstSize() { return 0; }
    public static int getMaxPeers() { return 0; }
    public static int getMaxRttBurstSize() { return 0; }
    public static int getMinRttBurstSize() { return 0; }
    public int getRttBurstSize() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.rtt.ResponderConfig> getRttResponders() { return null; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    public int getSecurityMode() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.OuiKeyedData> getVendorData() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingRequest.Builder addAccessPoint(android.net.wifi.ScanResult p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingRequest.Builder addAccessPoints(java.util.List<android.net.wifi.ScanResult> p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingRequest.Builder addNon80211mcCapableAccessPoint(android.net.wifi.ScanResult p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingRequest.Builder addNon80211mcCapableAccessPoints(java.util.List<android.net.wifi.ScanResult> p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingRequest.Builder addResponder(android.net.wifi.rtt.ResponderConfig p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingRequest.Builder addResponders(java.util.List<android.net.wifi.rtt.ResponderConfig> p0) { return null; }
        public android.net.wifi.rtt.RangingRequest.Builder addWifiAwarePeer(android.net.MacAddress p0) { return null; }
        public android.net.wifi.rtt.RangingRequest.Builder addWifiAwarePeer(android.net.wifi.aware.PeerHandle p0) { return null; }
        public android.net.wifi.rtt.RangingRequest build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingRequest.Builder setRttBurstSize(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingRequest.Builder setSecurityMode(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingRequest.Builder setVendorData(java.util.List<android.net.wifi.OuiKeyedData> p0) { return null; }
    }
}
