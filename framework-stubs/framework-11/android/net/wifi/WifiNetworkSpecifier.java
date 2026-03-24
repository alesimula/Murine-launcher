package android.net.wifi;

public final class WifiNetworkSpecifier extends android.net.NetworkSpecifier implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.WifiNetworkSpecifier> CREATOR = null;
    WifiNetworkSpecifier() { super(); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public boolean canBeSatisfiedBy(android.net.NetworkSpecifier p0) { return false; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSpecifier.Builder setSsidPattern(android.os.PatternMatcher p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSpecifier.Builder setSsid(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSpecifier.Builder setBssidPattern(android.net.MacAddress p0, android.net.MacAddress p1) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSpecifier.Builder setBssid(android.net.MacAddress p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSpecifier.Builder setIsEnhancedOpen(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSpecifier.Builder setWpa2Passphrase(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSpecifier.Builder setWpa3Passphrase(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSpecifier.Builder setWpa2EnterpriseConfig(android.net.wifi.WifiEnterpriseConfig p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSpecifier.Builder setWpa3EnterpriseConfig(android.net.wifi.WifiEnterpriseConfig p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSpecifier.Builder setIsHiddenSsid(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSpecifier build() { return null; }
    }
}
