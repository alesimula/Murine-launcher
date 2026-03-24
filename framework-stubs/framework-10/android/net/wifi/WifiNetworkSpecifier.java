package android.net.wifi;

public final class WifiNetworkSpecifier extends android.net.NetworkSpecifier implements android.os.Parcelable {
    public final android.os.PatternMatcher ssidPatternMatcher = null;
    public final android.util.Pair<android.net.MacAddress, android.net.MacAddress> bssidPatternMatcher = null;
    public final android.net.wifi.WifiConfiguration wifiConfiguration = null;
    public final int requestorUid = 0;
    public final java.lang.String requestorPackageName = null;
    public static final android.os.Parcelable.Creator<android.net.wifi.WifiNetworkSpecifier> CREATOR = null;
    public WifiNetworkSpecifier() throws java.lang.IllegalAccessException { super(); }
    public WifiNetworkSpecifier(android.os.PatternMatcher p0, android.util.Pair<android.net.MacAddress, android.net.MacAddress> p1, android.net.wifi.WifiConfiguration p2, int p3, java.lang.String p4) { super(); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public boolean satisfiedBy(android.net.NetworkSpecifier p0) { return false; }
    public void assertValidFromUid(int p0) {}

    public static final class Builder {
        private static final java.lang.String MATCH_ALL_SSID_PATTERN_PATH = ".*";
        private static final java.lang.String MATCH_EMPTY_SSID_PATTERN_PATH = "";
        private static final android.util.Pair<android.net.MacAddress, android.net.MacAddress> MATCH_NO_BSSID_PATTERN1 = null;
        private static final android.util.Pair<android.net.MacAddress, android.net.MacAddress> MATCH_NO_BSSID_PATTERN2 = null;
        private static final android.util.Pair<android.net.MacAddress, android.net.MacAddress> MATCH_ALL_BSSID_PATTERN = null;
        private static final android.net.MacAddress MATCH_EXACT_BSSID_PATTERN_MASK = null;
        private android.os.PatternMatcher mSsidPatternMatcher;
        private android.util.Pair<android.net.MacAddress, android.net.MacAddress> mBssidPatternMatcher;
        private boolean mIsEnhancedOpen;
        private java.lang.String mWpa2PskPassphrase;
        private java.lang.String mWpa3SaePassphrase;
        private android.net.wifi.WifiEnterpriseConfig mWpa2EnterpriseConfig;
        private android.net.wifi.WifiEnterpriseConfig mWpa3EnterpriseConfig;
        private boolean mIsHiddenSSID;
        public Builder() {}
        public android.net.wifi.WifiNetworkSpecifier.Builder setSsidPattern(android.os.PatternMatcher p0) { return null; }
        public android.net.wifi.WifiNetworkSpecifier.Builder setSsid(java.lang.String p0) { return null; }
        public android.net.wifi.WifiNetworkSpecifier.Builder setBssidPattern(android.net.MacAddress p0, android.net.MacAddress p1) { return null; }
        public android.net.wifi.WifiNetworkSpecifier.Builder setBssid(android.net.MacAddress p0) { return null; }
        public android.net.wifi.WifiNetworkSpecifier.Builder setIsEnhancedOpen(boolean p0) { return null; }
        public android.net.wifi.WifiNetworkSpecifier.Builder setWpa2Passphrase(java.lang.String p0) { return null; }
        public android.net.wifi.WifiNetworkSpecifier.Builder setWpa3Passphrase(java.lang.String p0) { return null; }
        public android.net.wifi.WifiNetworkSpecifier.Builder setWpa2EnterpriseConfig(android.net.wifi.WifiEnterpriseConfig p0) { return null; }
        public android.net.wifi.WifiNetworkSpecifier.Builder setWpa3EnterpriseConfig(android.net.wifi.WifiEnterpriseConfig p0) { return null; }
        public android.net.wifi.WifiNetworkSpecifier.Builder setIsHiddenSsid(boolean p0) { return null; }
        private void setSecurityParamsInWifiConfiguration(android.net.wifi.WifiConfiguration p0) {}
        private android.net.wifi.WifiConfiguration buildWifiConfiguration() { return null; }
        private boolean hasSetAnyPattern() { return false; }
        private void setMatchAnyPatternIfUnset() {}
        private boolean hasSetMatchNonePattern() { return false; }
        private boolean hasSetMatchAllPattern() { return false; }
        private void validateSecurityParams() {}
        public android.net.wifi.WifiNetworkSpecifier build() { return null; }
    }
}
