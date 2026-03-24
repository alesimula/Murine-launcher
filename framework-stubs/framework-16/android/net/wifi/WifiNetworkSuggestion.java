package android.net.wifi;

public final class WifiNetworkSuggestion implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.WifiNetworkSuggestion> CREATOR = null;
    public static final int RANDOMIZATION_NON_PERSISTENT = 1;
    public static final int RANDOMIZATION_PERSISTENT = 0;
    WifiNetworkSuggestion() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public android.net.MacAddress getBssid() { return null; }
    public int getCarrierId() { return 0; }
    @android.annotation.Nullable
    public android.net.wifi.WifiEnterpriseConfig getEnterpriseConfig() { return null; }
    public int getMacRandomizationSetting() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getPassphrase() { return null; }
    @android.annotation.Nullable
    public android.net.wifi.hotspot2.PasspointConfiguration getPasspointConfig() { return null; }
    public int getPriority() { return 0; }
    public int getPriorityGroup() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getSsid() { return null; }
    @android.annotation.Nullable
    public android.os.ParcelUuid getSubscriptionGroup() { return null; }
    public int getSubscriptionId() { return 0; }
    @android.annotation.NonNull
    public android.net.wifi.WifiConfiguration getWifiConfiguration() { return null; }
    @android.annotation.Nullable
    public android.net.wifi.WifiSsid getWifiSsid() { return null; }
    public boolean isAppInteractionRequired() { return false; }
    public boolean isCarrierMerged() { return false; }
    public boolean isCredentialSharedWithUser() { return false; }
    public boolean isEnhancedOpen() { return false; }
    public boolean isHiddenSsid() { return false; }
    public boolean isInitialAutojoinEnabled() { return false; }
    public boolean isMetered() { return false; }
    public boolean isOemPaid() { return false; }
    public boolean isOemPrivate() { return false; }
    public boolean isRestricted() { return false; }
    public boolean isUntrusted() { return false; }
    public boolean isUserInteractionRequired() { return false; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public boolean isWifi7Enabled() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setBssid(android.net.MacAddress p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setCarrierId(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setCarrierMerged(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setCredentialSharedWithUser(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setIsAppInteractionRequired(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setIsEnhancedOpen(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setIsHiddenSsid(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setIsInitialAutojoinEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setIsMetered(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setIsUserInteractionRequired(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setIsWpa3SaeH2eOnlyModeEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setMacRandomizationSetting(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setOemPaid(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setOemPrivate(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setPasspointConfig(android.net.wifi.hotspot2.PasspointConfiguration p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setPriority(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setPriorityGroup(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setRestricted(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setSsid(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setSubscriptionGroup(android.os.ParcelUuid p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setSubscriptionId(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setUntrusted(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setWapiEnterpriseConfig(android.net.wifi.WifiEnterpriseConfig p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setWapiPassphrase(java.lang.String p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setWifi7Enabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setWifiSsid(android.net.wifi.WifiSsid p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setWpa2EnterpriseConfig(android.net.wifi.WifiEnterpriseConfig p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setWpa2Passphrase(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setWpa3Enterprise192BitModeConfig(android.net.wifi.WifiEnterpriseConfig p0) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setWpa3EnterpriseConfig(android.net.wifi.WifiEnterpriseConfig p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setWpa3EnterpriseStandardModeConfig(android.net.wifi.WifiEnterpriseConfig p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSuggestion.Builder setWpa3Passphrase(java.lang.String p0) { return null; }
    }
}
