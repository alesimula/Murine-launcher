package android.net.wifi.sharedconnectivity.app;

@android.annotation.SystemApi
public final class KnownNetwork implements android.os.Parcelable {
    public static final int NETWORK_SOURCE_UNKNOWN = 0;
    public static final int NETWORK_SOURCE_NEARBY_SELF = 1;
    public static final int NETWORK_SOURCE_CLOUD_SELF = 2;
    public static final android.os.Parcelable.Creator<android.net.wifi.sharedconnectivity.app.KnownNetwork> CREATOR = null;
    public int getNetworkSource() { return 0; }
    public java.lang.String getSsid() { return null; }
    public java.util.Set<java.lang.Integer> getSecurityTypes() { return null; }
    public android.net.wifi.sharedconnectivity.app.NetworkProviderInfo getNetworkProviderInfo() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static android.net.wifi.sharedconnectivity.app.KnownNetwork readFromParcel(android.os.Parcel p0) { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        public android.net.wifi.sharedconnectivity.app.KnownNetwork.Builder setNetworkSource(int p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.KnownNetwork.Builder setSsid(java.lang.String p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.KnownNetwork.Builder addSecurityType(int p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.KnownNetwork.Builder setNetworkProviderInfo(android.net.wifi.sharedconnectivity.app.NetworkProviderInfo p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.KnownNetwork.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.KnownNetwork build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetworkSource {
    }
}
