package android.net.wifi.p2p;

public final class WifiP2pExtListenParams implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pExtListenParams> CREATOR = null;
    WifiP2pExtListenParams() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.OuiKeyedData> getVendorData() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pExtListenParams build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pExtListenParams.Builder setVendorData(java.util.List<android.net.wifi.OuiKeyedData> p0) { return null; }
    }
}
