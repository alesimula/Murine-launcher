package android.net.wifi;

public final class WifiNetworkSuggestion implements android.os.Parcelable {
    public final android.net.wifi.WifiConfiguration wifiConfiguration = null;
    public final boolean isAppInteractionRequired = false;
    public final boolean isUserInteractionRequired = false;
    public final int suggestorUid = 0;
    public final java.lang.String suggestorPackageName = null;
    public static final android.os.Parcelable.Creator<android.net.wifi.WifiNetworkSuggestion> CREATOR = null;
    public WifiNetworkSuggestion() {}
    public WifiNetworkSuggestion(android.net.wifi.WifiConfiguration p0, boolean p1, boolean p2, int p3, java.lang.String p4) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private static final int UNASSIGNED_PRIORITY = -1;
        private java.lang.String mSsid;
        private android.net.MacAddress mBssid;
        private boolean mIsEnhancedOpen;
        private java.lang.String mWpa2PskPassphrase;
        private java.lang.String mWpa3SaePassphrase;
        private android.net.wifi.WifiEnterpriseConfig mWpa2EnterpriseConfig;
        private android.net.wifi.WifiEnterpriseConfig mWpa3EnterpriseConfig;
        private boolean mIsHiddenSSID;
        private boolean mIsAppInteractionRequired;
        private boolean mIsUserInteractionRequired;
        private boolean mIsMetered;
        private int mPriority;
        public Builder() {}
        public android.net.wifi.WifiNetworkSuggestion.Builder setSsid(java.lang.String p0) { return null; }
        public android.net.wifi.WifiNetworkSuggestion.Builder setBssid(android.net.MacAddress p0) { return null; }
        public android.net.wifi.WifiNetworkSuggestion.Builder setIsEnhancedOpen(boolean p0) { return null; }
        public android.net.wifi.WifiNetworkSuggestion.Builder setWpa2Passphrase(java.lang.String p0) { return null; }
        public android.net.wifi.WifiNetworkSuggestion.Builder setWpa3Passphrase(java.lang.String p0) { return null; }
        public android.net.wifi.WifiNetworkSuggestion.Builder setWpa2EnterpriseConfig(android.net.wifi.WifiEnterpriseConfig p0) { return null; }
        public android.net.wifi.WifiNetworkSuggestion.Builder setWpa3EnterpriseConfig(android.net.wifi.WifiEnterpriseConfig p0) { return null; }
        public android.net.wifi.WifiNetworkSuggestion.Builder setIsHiddenSsid(boolean p0) { return null; }
        public android.net.wifi.WifiNetworkSuggestion.Builder setIsAppInteractionRequired(boolean p0) { return null; }
        public android.net.wifi.WifiNetworkSuggestion.Builder setIsUserInteractionRequired(boolean p0) { return null; }
        public android.net.wifi.WifiNetworkSuggestion.Builder setPriority(int p0) { return null; }
        public android.net.wifi.WifiNetworkSuggestion.Builder setIsMetered(boolean p0) { return null; }
        private void setSecurityParamsInWifiConfiguration(android.net.wifi.WifiConfiguration p0) {}
        private android.net.wifi.WifiConfiguration buildWifiConfiguration() { return null; }
        private void validateSecurityParams() {}
        public android.net.wifi.WifiNetworkSuggestion build() { return null; }
    }
}
