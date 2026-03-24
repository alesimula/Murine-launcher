package android.net.wifi;

@android.annotation.FlaggedApi("com.android.wifi.flags.un_deprecated_wificonfiguration")
public class WifiConfiguration implements android.os.Parcelable {
    public java.lang.String BSSID;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.WifiConfiguration> CREATOR = null;
    public java.lang.String FQDN;
    public static final int INVALID_NETWORK_ID = -1;
    public static final int METERED_OVERRIDE_METERED = 1;
    public static final int METERED_OVERRIDE_NONE = 0;
    public static final int METERED_OVERRIDE_NOT_METERED = 2;
    public static final int RANDOMIZATION_AUTO = 3;
    public static final int RANDOMIZATION_NONE = 0;
    public static final int RANDOMIZATION_NON_PERSISTENT = 2;
    public static final int RANDOMIZATION_PERSISTENT = 1;
    public static final int RECENT_FAILURE_AP_UNABLE_TO_HANDLE_NEW_STA = 17;
    public static final int RECENT_FAILURE_DISCONNECTION_AP_BUSY = 1004;
    public static final int RECENT_FAILURE_MBO_ASSOC_DISALLOWED_AIR_INTERFACE_OVERLOADED = 1007;
    public static final int RECENT_FAILURE_MBO_ASSOC_DISALLOWED_AUTH_SERVER_OVERLOADED = 1008;
    public static final int RECENT_FAILURE_MBO_ASSOC_DISALLOWED_INSUFFICIENT_RSSI = 1009;
    public static final int RECENT_FAILURE_MBO_ASSOC_DISALLOWED_MAX_NUM_STA_ASSOCIATED = 1006;
    public static final int RECENT_FAILURE_MBO_ASSOC_DISALLOWED_UNSPECIFIED = 1005;
    public static final int RECENT_FAILURE_NETWORK_NOT_FOUND = 1011;
    public static final int RECENT_FAILURE_NONE = 0;
    public static final int RECENT_FAILURE_OCE_RSSI_BASED_ASSOCIATION_REJECTION = 1010;
    public static final int RECENT_FAILURE_POOR_CHANNEL_CONDITIONS = 1003;
    public static final int RECENT_FAILURE_REFUSED_TEMPORARILY = 1002;
    public static final int SECURITY_TYPE_DPP = 13;
    public static final int SECURITY_TYPE_EAP = 3;
    @java.lang.Deprecated
    public static final int SECURITY_TYPE_EAP_SUITE_B = 5;
    public static final int SECURITY_TYPE_EAP_WPA3_ENTERPRISE = 9;
    public static final int SECURITY_TYPE_EAP_WPA3_ENTERPRISE_192_BIT = 5;
    public static final int SECURITY_TYPE_OPEN = 0;
    public static final int SECURITY_TYPE_OWE = 6;
    public static final int SECURITY_TYPE_PSK = 2;
    public static final int SECURITY_TYPE_SAE = 4;
    public static final int SECURITY_TYPE_WAPI_CERT = 8;
    public static final int SECURITY_TYPE_WAPI_PSK = 7;
    public static final int SECURITY_TYPE_WEP = 1;
    public java.lang.String SSID;
    public boolean allowAutojoin;
    @android.annotation.NonNull
    public java.util.BitSet allowedAuthAlgorithms;
    @android.annotation.NonNull
    public java.util.BitSet allowedGroupCiphers;
    @android.annotation.NonNull
    public java.util.BitSet allowedGroupManagementCiphers;
    @android.annotation.NonNull
    public java.util.BitSet allowedKeyManagement;
    @android.annotation.NonNull
    public java.util.BitSet allowedPairwiseCiphers;
    @android.annotation.NonNull
    public java.util.BitSet allowedProtocols;
    @android.annotation.NonNull
    public java.util.BitSet allowedSuiteBCiphers;
    public int carrierId;
    public boolean carrierMerged;
    public java.lang.String creatorName;
    public int creatorUid;
    public android.net.wifi.WifiEnterpriseConfig enterpriseConfig;
    public boolean fromWifiNetworkSpecifier;
    public boolean fromWifiNetworkSuggestion;
    public boolean hiddenSSID;
    public boolean isHomeProviderNetwork;
    public int lastConnectUid;
    public long lastConnected;
    public java.lang.String lastUpdateName;
    public int lastUpdateUid;
    public int macRandomizationSetting;
    public boolean meteredHint;
    public int meteredOverride;
    public int networkId;
    public int numAssociation;
    public int numRebootsSinceLastUse;
    public int numScorerOverride;
    public int numScorerOverrideAndSwitchedNetwork;
    public java.lang.String preSharedKey;
    @java.lang.Deprecated
    public int priority;
    public java.lang.String providerFriendlyName;
    public boolean requirePmf;
    public long[] roamingConsortiumIds;
    public boolean shared;
    public int status;
    public int subscriptionId;
    public boolean useExternalScores;
    @java.lang.Deprecated
    public java.lang.String[] wepKeys;
    @java.lang.Deprecated
    public int wepTxKeyIndex;
    public WifiConfiguration() {}
    public WifiConfiguration(android.net.wifi.WifiConfiguration p0) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getAllNetworkKeys() { return null; }
    public int getAuthType() { return 0; }
    @android.annotation.Nullable
    public java.util.List<android.net.MacAddress> getBssidAllowlist() { return null; }
    public int getDeletionPriority() { return 0; }
    @android.annotation.NonNull
    public byte[] getDppCSignKey() { return null; }
    @android.annotation.NonNull
    public byte[] getDppConnector() { return null; }
    @android.annotation.NonNull
    public byte[] getDppNetAccessKey() { return null; }
    @android.annotation.NonNull
    public byte[] getDppPrivateEcKey() { return null; }
    public android.net.ProxyInfo getHttpProxy() { return null; }
    @android.annotation.NonNull
    public android.net.IpConfiguration getIpConfiguration() { return null; }
    @android.annotation.NonNull
    public java.lang.String getKey() { return null; }
    public int getMacRandomizationSetting() { return 0; }
    @android.annotation.NonNull
    public android.net.wifi.WifiConfiguration.NetworkSelectionStatus getNetworkSelectionStatus() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPrintableSsid() { return null; }
    @android.annotation.NonNull
    public java.lang.String getProfileKey() { return null; }
    @android.annotation.NonNull
    public android.net.MacAddress getRandomizedMacAddress() { return null; }
    public int getRecentFailureReason() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.OuiKeyedData> getVendorData() { return null; }
    public boolean hasNoInternetAccess() { return false; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.multi_user_wifi_enhancement")
    public boolean isAllowedToUpdateByOtherUsers() { return false; }
    public boolean isDppConfigurator() { return false; }
    public boolean isEphemeral() { return false; }
    public static boolean isMetered(android.net.wifi.WifiConfiguration p0, android.net.wifi.WifiInfo p1) { return false; }
    public boolean isNoInternetAccessExpected() { return false; }
    public boolean isPasspoint() { return false; }
    public boolean isRepeaterEnabled() { return false; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public boolean isSendDhcpHostnameEnabled() { return false; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public boolean isWifi7Enabled() { return false; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.multi_user_wifi_enhancement")
    public void setAllowedToUpdateByOtherUsers(boolean p0) {}
    public void setBssidAllowlist(java.util.List<android.net.MacAddress> p0) {}
    public void setDeletionPriority(int p0) throws java.lang.IllegalArgumentException {}
    public void setHttpProxy(android.net.ProxyInfo p0) {}
    public void setIpConfiguration(android.net.IpConfiguration p0) {}
    public void setMacRandomizationSetting(int p0) {}
    public void setNetworkSelectionStatus(android.net.wifi.WifiConfiguration.NetworkSelectionStatus p0) {}
    public void setRepeaterEnabled(boolean p0) {}
    public void setSecurityParams(int p0) {}
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public void setSendDhcpHostnameEnabled(boolean p0) {}
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public void setVendorData(java.util.List<android.net.wifi.OuiKeyedData> p0) {}
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public void setWifi7Enabled(boolean p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class AuthAlgorithm {
        public static final int LEAP = 2;
        public static final int OPEN = 0;
        public static final int SAE = 3;
        @java.lang.Deprecated
        public static final int SHARED = 1;
        public static final java.lang.String[] strings = null;
        public static final java.lang.String varName = "auth_alg";
        AuthAlgorithm() {}
    }

    public static class GroupCipher {
        public static final int CCMP = 3;
        public static final int GCMP_128 = 7;
        public static final int GCMP_256 = 5;
        public static final int SMS4 = 6;
        public static final int TKIP = 2;
        @java.lang.Deprecated
        public static final int WEP104 = 1;
        @java.lang.Deprecated
        public static final int WEP40 = 0;
        public static final java.lang.String[] strings = null;
        public static final java.lang.String varName = "group";
        GroupCipher() {}
    }

    public static class GroupMgmtCipher {
        public static final int BIP_CMAC_256 = 0;
        public static final int BIP_GMAC_128 = 1;
        public static final int BIP_GMAC_256 = 2;
        GroupMgmtCipher() {}
    }

    public static class KeyMgmt {
        public static final int DPP = 17;
        public static final int FILS_SHA256 = 15;
        public static final int FILS_SHA384 = 16;
        public static final int FT_EAP = 7;
        public static final int FT_PSK = 6;
        public static final int IEEE8021X = 3;
        public static final int NONE = 0;
        public static final int OSEN = 5;
        public static final int OWE = 9;
        public static final int SAE = 8;
        public static final int SUITE_B_192 = 10;
        public static final int WAPI_CERT = 14;
        public static final int WAPI_PSK = 13;
        public static final int WPA2_PSK = 4;
        public static final int WPA_EAP = 2;
        public static final int WPA_EAP_SHA256 = 12;
        public static final int WPA_PSK = 1;
        public static final int WPA_PSK_SHA256 = 11;
        public static final java.lang.String[] strings = null;
        public static final java.lang.String varName = "key_mgmt";
        KeyMgmt() {}
    }

    public static class NetworkSelectionStatus {
        public static final int DISABLED_ASSOCIATION_REJECTION = 1;
        public static final int DISABLED_AUTHENTICATION_FAILURE = 2;
        public static final int DISABLED_AUTHENTICATION_NO_CREDENTIALS = 5;
        public static final int DISABLED_AUTHENTICATION_NO_SUBSCRIPTION = 9;
        public static final int DISABLED_AUTHENTICATION_PRIVATE_EAP_ERROR = 10;
        public static final int DISABLED_BY_WIFI_MANAGER = 7;
        public static final int DISABLED_BY_WRONG_PASSWORD = 8;
        public static final int DISABLED_CONSECUTIVE_FAILURES = 12;
        public static final int DISABLED_DHCP_FAILURE = 3;
        public static final int DISABLED_NETWORK_NOT_FOUND = 11;
        public static final int DISABLED_NONE = 0;
        public static final int DISABLED_NO_INTERNET_PERMANENT = 6;
        public static final int DISABLED_NO_INTERNET_TEMPORARY = 4;
        public static final int DISABLED_TRANSITION_DISABLE_INDICATION = 13;
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        public static final int DISABLED_UNWANTED_LOW_RSSI = 14;
        public static final int NETWORK_SELECTION_ENABLED = 0;
        public static final int NETWORK_SELECTION_PERMANENTLY_DISABLED = 2;
        public static final int NETWORK_SELECTION_TEMPORARY_DISABLED = 1;
        NetworkSelectionStatus() {}
        public int getDisableReasonCounter(int p0) { return 0; }
        public long getDisableTime() { return 0L; }
        public static int getMaxNetworkSelectionDisableReason() { return 0; }
        public int getNetworkSelectionDisableReason() { return 0; }
        @android.annotation.Nullable
        public static java.lang.String getNetworkSelectionDisableReasonString(int p0) { return null; }
        public int getNetworkSelectionStatus() { return 0; }
        @android.annotation.NonNull
        public java.lang.String getNetworkStatusString() { return null; }
        public boolean hasEverConnected() { return false; }

        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.net.wifi.WifiConfiguration.NetworkSelectionStatus build() { return null; }
            @android.annotation.NonNull
            public android.net.wifi.WifiConfiguration.NetworkSelectionStatus.Builder setNetworkSelectionDisableReason(int p0) { return null; }
            @android.annotation.NonNull
            public android.net.wifi.WifiConfiguration.NetworkSelectionStatus.Builder setNetworkSelectionStatus(int p0) { return null; }
        }
    }

    public static class PairwiseCipher {
        public static final int CCMP = 2;
        public static final int GCMP_128 = 5;
        public static final int GCMP_256 = 3;
        public static final int NONE = 0;
        public static final int SMS4 = 4;
        @java.lang.Deprecated
        public static final int TKIP = 1;
        public static final java.lang.String[] strings = null;
        public static final java.lang.String varName = "pairwise";
        PairwiseCipher() {}
    }

    public static class Protocol {
        public static final int RSN = 1;
        public static final int WAPI = 3;
        @java.lang.Deprecated
        public static final int WPA = 0;
        public static final java.lang.String[] strings = null;
        public static final java.lang.String varName = "proto";
        Protocol() {}
    }

    public static class Status {
        public static final int CURRENT = 0;
        public static final int DISABLED = 1;
        public static final int ENABLED = 2;
        public static final java.lang.String[] strings = null;
        Status() {}
    }
}
