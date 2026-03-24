package android.net.wifi.sharedconnectivity.app;

@android.annotation.SystemApi
public final class HotspotNetwork implements android.os.Parcelable {
    public static final int NETWORK_TYPE_UNKNOWN = 0;
    public static final int NETWORK_TYPE_CELLULAR = 1;
    public static final int NETWORK_TYPE_WIFI = 2;
    public static final int NETWORK_TYPE_ETHERNET = 3;
    public static final android.os.Parcelable.Creator<android.net.wifi.sharedconnectivity.app.HotspotNetwork> CREATOR = null;
    public long getDeviceId() { return 0L; }
    public android.net.wifi.sharedconnectivity.app.NetworkProviderInfo getNetworkProviderInfo() { return null; }
    public int getHostNetworkType() { return 0; }
    public java.lang.String getNetworkName() { return null; }
    public java.lang.String getHotspotSsid() { return null; }
    public java.lang.String getHotspotBssid() { return null; }
    public java.util.Set<java.lang.Integer> getHotspotSecurityTypes() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static android.net.wifi.sharedconnectivity.app.HotspotNetwork readFromParcel(android.os.Parcel p0) { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        public android.net.wifi.sharedconnectivity.app.HotspotNetwork.Builder setDeviceId(long p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.HotspotNetwork.Builder setNetworkProviderInfo(android.net.wifi.sharedconnectivity.app.NetworkProviderInfo p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.HotspotNetwork.Builder setHostNetworkType(int p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.HotspotNetwork.Builder setNetworkName(java.lang.String p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.HotspotNetwork.Builder setHotspotSsid(java.lang.String p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.HotspotNetwork.Builder setHotspotBssid(java.lang.String p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.HotspotNetwork.Builder addHotspotSecurityType(int p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.HotspotNetwork.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.HotspotNetwork build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetworkType {
    }
}
