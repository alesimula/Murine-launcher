package android.net.wifi.sharedconnectivity.app;

@android.annotation.SystemApi
public final class HotspotNetworkConnectionStatus implements android.os.Parcelable {
    public static final int CONNECTION_STATUS_UNKNOWN = 0;
    public static final int CONNECTION_STATUS_ENABLING_HOTSPOT = 1;
    public static final int CONNECTION_STATUS_UNKNOWN_ERROR = 2;
    public static final int CONNECTION_STATUS_PROVISIONING_FAILED = 3;
    public static final int CONNECTION_STATUS_TETHERING_TIMEOUT = 4;
    public static final int CONNECTION_STATUS_TETHERING_UNSUPPORTED = 5;
    public static final int CONNECTION_STATUS_NO_CELL_DATA = 6;
    public static final int CONNECTION_STATUS_ENABLING_HOTSPOT_FAILED = 7;
    public static final int CONNECTION_STATUS_ENABLING_HOTSPOT_TIMEOUT = 8;
    public static final int CONNECTION_STATUS_CONNECT_TO_HOTSPOT_FAILED = 9;
    public static final android.os.Parcelable.Creator<android.net.wifi.sharedconnectivity.app.HotspotNetworkConnectionStatus> CREATOR = null;
    public int getStatus() { return 0; }
    public android.net.wifi.sharedconnectivity.app.HotspotNetwork getHotspotNetwork() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static android.net.wifi.sharedconnectivity.app.HotspotNetworkConnectionStatus readFromParcel(android.os.Parcel p0) { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        public android.net.wifi.sharedconnectivity.app.HotspotNetworkConnectionStatus.Builder setStatus(int p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.HotspotNetworkConnectionStatus.Builder setHotspotNetwork(android.net.wifi.sharedconnectivity.app.HotspotNetwork p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.HotspotNetworkConnectionStatus.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.HotspotNetworkConnectionStatus build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConnectionStatus {
    }
}
