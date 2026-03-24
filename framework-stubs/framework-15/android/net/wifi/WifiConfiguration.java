package android.net.wifi;

@java.lang.Deprecated
public class WifiConfiguration implements android.os.Parcelable {
    @java.lang.Deprecated
    public java.lang.String BSSID;
    @java.lang.Deprecated
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.WifiConfiguration> CREATOR = null;
    @java.lang.Deprecated
    public java.lang.String FQDN;
    @java.lang.Deprecated
    public static final int INVALID_NETWORK_ID = -1;
    @java.lang.Deprecated
    public static final int METERED_OVERRIDE_METERED = 1;
    @java.lang.Deprecated
    public static final int METERED_OVERRIDE_NONE = 0;
    @java.lang.Deprecated
    public static final int METERED_OVERRIDE_NOT_METERED = 2;
    @java.lang.Deprecated
    public static final int RANDOMIZATION_AUTO = 3;
    @java.lang.Deprecated
    public static final int RANDOMIZATION_NONE = 0;
    @java.lang.Deprecated
    public static final int RANDOMIZATION_NON_PERSISTENT = 2;
    @java.lang.Deprecated
    public static final int RANDOMIZATION_PERSISTENT = 1;
    @java.lang.Deprecated
    public static final int RECENT_FAILURE_AP_UNABLE_TO_HANDLE_NEW_STA = 17;
    @java.lang.Deprecated
    public static final int RECENT_FAILURE_DISCONNECTION_AP_BUSY = 1004;
    @java.lang.Deprecated
    public static final int RECENT_FAILURE_MBO_ASSOC_DISALLOWED_AIR_INTERFACE_OVERLOADED = 1007;
    @java.lang.Deprecated
    public static final int RECENT_FAILURE_MBO_ASSOC_DISALLOWED_AUTH_SERVER_OVERLOADED = 1008;
    @java.lang.Deprecated
    public static final int RECENT_FAILURE_MBO_ASSOC_DISALLOWED_INSUFFICIENT_RSSI = 1009;
    @java.lang.Deprecated
    public static final int RECENT_FAILURE_MBO_ASSOC_DISALLOWED_MAX_NUM_STA_ASSOCIATED = 1006;
    @java.lang.Deprecated
    public static final int RECENT_FAILURE_MBO_ASSOC_DISALLOWED_UNSPECIFIED = 1005;
    @java.lang.Deprecated
    public static final int RECENT_FAILURE_NETWORK_NOT_FOUND = 1011;
    @java.lang.Deprecated
    public static final int RECENT_FAILURE_NONE = 0;
    @java.lang.Deprecated
    public static final int RECENT_FAILURE_OCE_RSSI_BASED_ASSOCIATION_REJECTION = 1010;
    @java.lang.Deprecated
    public static final int RECENT_FAILURE_POOR_CHANNEL_CONDITIONS = 1003;
    @java.lang.Deprecated
    public static final int RECENT_FAILURE_REFUSED_TEMPORARILY = 1002;
    @java.lang.Deprecated
    public static final int SECURITY_TYPE_DPP = 13;
    @java.lang.Deprecated
    public static final int SECURITY_TYPE_EAP = 3;
    @java.lang.Deprecated
    public static final int SECURITY_TYPE_EAP_SUITE_B = 5;
    @java.lang.Deprecated
    public static final int SECURITY_TYPE_EAP_WPA3_ENTERPRISE = 9;
    @java.lang.Deprecated
    public static final int SECURITY_TYPE_EAP_WPA3_ENTERPRISE_192_BIT = 5;
    @java.lang.Deprecated
    public static final int SECURITY_TYPE_OPEN = 0;
    @java.lang.Deprecated
    public static final int SECURITY_TYPE_OWE = 6;
    @java.lang.Deprecated
    public static final int SECURITY_TYPE_PSK = 2;
    @java.lang.Deprecated
    public static final int SECURITY_TYPE_SAE = 4;
    @java.lang.Deprecated
    public static final int SECURITY_TYPE_WAPI_CERT = 8;
    @java.lang.Deprecated
    public static final int SECURITY_TYPE_WAPI_PSK = 7;
    @java.lang.Deprecated
    public static final int SECURITY_TYPE_WEP = 1;
    @java.lang.Deprecated
    public java.lang.String SSID;
    @java.lang.Deprecated
    public boolean allowAutojoin;
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.util.BitSet allowedAuthAlgorithms;
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.util.BitSet allowedGroupCiphers;
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.util.BitSet allowedGroupManagementCiphers;
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.util.BitSet allowedKeyManagement;
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.util.BitSet allowedPairwiseCiphers;
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.util.BitSet allowedProtocols;
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.util.BitSet allowedSuiteBCiphers;
    @java.lang.Deprecated
    public int carrierId;
    @java.lang.Deprecated
    public boolean carrierMerged;
    @java.lang.Deprecated
    public java.lang.String creatorName;
    @java.lang.Deprecated
    public int creatorUid;
    @java.lang.Deprecated
    public android.net.wifi.WifiEnterpriseConfig enterpriseConfig;
    @java.lang.Deprecated
    public boolean fromWifiNetworkSpecifier;
    @java.lang.Deprecated
    public boolean fromWifiNetworkSuggestion;
    @java.lang.Deprecated
    public boolean hiddenSSID;
    @java.lang.Deprecated
    public boolean isHomeProviderNetwork;
    @java.lang.Deprecated
    public int lastConnectUid;
    @java.lang.Deprecated
    public long lastConnected;
    @java.lang.Deprecated
    public java.lang.String lastUpdateName;
    @java.lang.Deprecated
    public int lastUpdateUid;
    @java.lang.Deprecated
    public int macRandomizationSetting;
    @java.lang.Deprecated
    public boolean meteredHint;
    @java.lang.Deprecated
    public int meteredOverride;
    @java.lang.Deprecated
    public int networkId;
    @java.lang.Deprecated
    public int numAssociation;
    @java.lang.Deprecated
    public int numRebootsSinceLastUse;
    @java.lang.Deprecated
    public int numScorerOverride;
    @java.lang.Deprecated
    public int numScorerOverrideAndSwitchedNetwork;
    @java.lang.Deprecated
    public java.lang.String preSharedKey;
    @java.lang.Deprecated
    public int priority;
    @java.lang.Deprecated
    public java.lang.String providerFriendlyName;
    @java.lang.Deprecated
    public boolean requirePmf;
    @java.lang.Deprecated
    public long[] roamingConsortiumIds;
    @java.lang.Deprecated
    public boolean shared;
    @java.lang.Deprecated
    public int status;
    @java.lang.Deprecated
    public int subscriptionId;
    @java.lang.Deprecated
    public boolean useExternalScores;
    @java.lang.Deprecated
    public java.lang.String[] wepKeys;
    @java.lang.Deprecated
    public int wepTxKeyIndex;
    @java.lang.Deprecated
    public WifiConfiguration() {}
    @java.lang.Deprecated
    public WifiConfiguration(android.net.wifi.WifiConfiguration p0) {}
    @java.lang.Deprecated
    public int describeContents() { return 0; }
    @java.lang.Deprecated
    public android.net.ProxyInfo getHttpProxy() { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.lang.String getKey() { return null; }
    @java.lang.Deprecated
    public int getMacRandomizationSetting() { return 0; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public android.net.MacAddress getRandomizedMacAddress() { return null; }
    @java.lang.Deprecated
    public boolean isDppConfigurator() { return false; }
    @java.lang.Deprecated
    public boolean isPasspoint() { return false; }
    @java.lang.Deprecated
    public void setHttpProxy(android.net.ProxyInfo p0) {}
    @java.lang.Deprecated
    public void setIpConfiguration(android.net.IpConfiguration p0) {}
    @java.lang.Deprecated
    public void setMacRandomizationSetting(int p0) {}
    @java.lang.Deprecated
    public void setSecurityParams(int p0) {}
    @java.lang.Deprecated
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getAllNetworkKeys() { return null; }
    @java.lang.Deprecated
    public int getAuthType() { return 0; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public java.util.List<android.net.MacAddress> getBssidAllowlist() { return null; }
    @java.lang.Deprecated
    public int getDeletionPriority() { return 0; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public byte[] getDppCSignKey() { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public byte[] getDppConnector() { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public byte[] getDppNetAccessKey() { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public byte[] getDppPrivateEcKey() { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public android.net.IpConfiguration getIpConfiguration() { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public android.net.wifi.WifiConfiguration.NetworkSelectionStatus getNetworkSelectionStatus() { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.lang.String getPrintableSsid() { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.lang.String getProfileKey() { return null; }
    @java.lang.Deprecated
    public int getRecentFailureReason() { return 0; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.OuiKeyedData> getVendorData() { return null; }
    @java.lang.Deprecated
    public boolean hasNoInternetAccess() { return false; }
    @java.lang.Deprecated
    public boolean isEphemeral() { return false; }
    @java.lang.Deprecated
    public static boolean isMetered(android.net.wifi.WifiConfiguration p0, android.net.wifi.WifiInfo p1) { return false; }
    @java.lang.Deprecated
    public boolean isNoInternetAccessExpected() { return false; }
    @java.lang.Deprecated
    public boolean isRepeaterEnabled() { return false; }
    @java.lang.Deprecated
    public boolean isSendDhcpHostnameEnabled() { return false; }
    @java.lang.Deprecated
    public boolean isWifi7Enabled() { return false; }
    @java.lang.Deprecated
    public void setBssidAllowlist(java.util.List<android.net.MacAddress> p0) {}
    @java.lang.Deprecated
    public void setDeletionPriority(int p0) throws java.lang.IllegalArgumentException {}
    @java.lang.Deprecated
    public void setNetworkSelectionStatus(android.net.wifi.WifiConfiguration.NetworkSelectionStatus p0) {}
    @java.lang.Deprecated
    public void setRepeaterEnabled(boolean p0) {}
    @java.lang.Deprecated
    public void setSendDhcpHostnameEnabled(boolean p0) {}
    @java.lang.Deprecated
    public void setVendorData(java.util.List<android.net.wifi.OuiKeyedData> p0) {}
    @java.lang.Deprecated
    public void setWifi7Enabled(boolean p0) {}

    @java.lang.Deprecated
    public static class AuthAlgorithm {
        @java.lang.Deprecated
        public static final int LEAP = 2;
        @java.lang.Deprecated
        public static final int OPEN = 0;
        @java.lang.Deprecated
        public static final int SAE = 3;
        @java.lang.Deprecated
        public static final int SHARED = 1;
        @java.lang.Deprecated
        public static final java.lang.String[] strings = null;
        @java.lang.Deprecated
        public static final java.lang.String varName = "auth_alg";
        @java.lang.Deprecated
        AuthAlgorithm() {}
    }

    @java.lang.Deprecated
    public static class GroupCipher {
        @java.lang.Deprecated
        public static final int CCMP = 3;
        @java.lang.Deprecated
        public static final int GCMP_128 = 7;
        @java.lang.Deprecated
        public static final int GCMP_256 = 5;
        @java.lang.Deprecated
        public static final int SMS4 = 6;
        @java.lang.Deprecated
        public static final int TKIP = 2;
        @java.lang.Deprecated
        public static final int WEP104 = 1;
        @java.lang.Deprecated
        public static final int WEP40 = 0;
        @java.lang.Deprecated
        public static final java.lang.String[] strings = null;
        @java.lang.Deprecated
        public static final java.lang.String varName = "group";
        @java.lang.Deprecated
        GroupCipher() {}
    }

    @java.lang.Deprecated
    public static class GroupMgmtCipher {
        @java.lang.Deprecated
        public static final int BIP_CMAC_256 = 0;
        @java.lang.Deprecated
        public static final int BIP_GMAC_128 = 1;
        @java.lang.Deprecated
        public static final int BIP_GMAC_256 = 2;
        @java.lang.Deprecated
        GroupMgmtCipher() {}
    }

    @java.lang.Deprecated
    public static class KeyMgmt {
        @java.lang.Deprecated
        public static final int DPP = 17;
        @java.lang.Deprecated
        public static final int FILS_SHA256 = 15;
        @java.lang.Deprecated
        public static final int FILS_SHA384 = 16;
        @java.lang.Deprecated
        public static final int FT_EAP = 7;
        @java.lang.Deprecated
        public static final int FT_PSK = 6;
        @java.lang.Deprecated
        public static final int IEEE8021X = 3;
        @java.lang.Deprecated
        public static final int NONE = 0;
        @java.lang.Deprecated
        public static final int OSEN = 5;
        @java.lang.Deprecated
        public static final int OWE = 9;
        @java.lang.Deprecated
        public static final int SAE = 8;
        @java.lang.Deprecated
        public static final int SUITE_B_192 = 10;
        @java.lang.Deprecated
        public static final int WAPI_CERT = 14;
        @java.lang.Deprecated
        public static final int WAPI_PSK = 13;
        @java.lang.Deprecated
        public static final int WPA2_PSK = 4;
        @java.lang.Deprecated
        public static final int WPA_EAP = 2;
        @java.lang.Deprecated
        public static final int WPA_EAP_SHA256 = 12;
        @java.lang.Deprecated
        public static final int WPA_PSK = 1;
        @java.lang.Deprecated
        public static final int WPA_PSK_SHA256 = 11;
        @java.lang.Deprecated
        public static final java.lang.String[] strings = null;
        @java.lang.Deprecated
        public static final java.lang.String varName = "key_mgmt";
        @java.lang.Deprecated
        KeyMgmt() {}
    }

    @java.lang.Deprecated
    public static class NetworkSelectionStatus {
        @java.lang.Deprecated
        public static final int DISABLED_ASSOCIATION_REJECTION = 1;
        @java.lang.Deprecated
        public static final int DISABLED_AUTHENTICATION_FAILURE = 2;
        @java.lang.Deprecated
        public static final int DISABLED_AUTHENTICATION_NO_CREDENTIALS = 5;
        @java.lang.Deprecated
        public static final int DISABLED_AUTHENTICATION_NO_SUBSCRIPTION = 9;
        @java.lang.Deprecated
        public static final int DISABLED_AUTHENTICATION_PRIVATE_EAP_ERROR = 10;
        @java.lang.Deprecated
        public static final int DISABLED_BY_WIFI_MANAGER = 7;
        @java.lang.Deprecated
        public static final int DISABLED_BY_WRONG_PASSWORD = 8;
        @java.lang.Deprecated
        public static final int DISABLED_CONSECUTIVE_FAILURES = 12;
        @java.lang.Deprecated
        public static final int DISABLED_DHCP_FAILURE = 3;
        @java.lang.Deprecated
        public static final int DISABLED_NETWORK_NOT_FOUND = 11;
        @java.lang.Deprecated
        public static final int DISABLED_NONE = 0;
        @java.lang.Deprecated
        public static final int DISABLED_NO_INTERNET_PERMANENT = 6;
        @java.lang.Deprecated
        public static final int DISABLED_NO_INTERNET_TEMPORARY = 4;
        @java.lang.Deprecated
        public static final int DISABLED_TRANSITION_DISABLE_INDICATION = 13;
        @java.lang.Deprecated
        public static final int DISABLED_UNWANTED_LOW_RSSI = 14;
        @java.lang.Deprecated
        public static final int NETWORK_SELECTION_ENABLED = 0;
        @java.lang.Deprecated
        public static final int NETWORK_SELECTION_PERMANENTLY_DISABLED = 2;
        @java.lang.Deprecated
        public static final int NETWORK_SELECTION_TEMPORARY_DISABLED = 1;
        @java.lang.Deprecated
        NetworkSelectionStatus() {}
        @java.lang.Deprecated
        public int getDisableReasonCounter(int p0) { return 0; }
        @java.lang.Deprecated
        public long getDisableTime() { return 0L; }
        @java.lang.Deprecated
        public static int getMaxNetworkSelectionDisableReason() { return 0; }
        @java.lang.Deprecated
        public int getNetworkSelectionDisableReason() { return 0; }
        @java.lang.Deprecated
        @android.annotation.Nullable
        public static java.lang.String getNetworkSelectionDisableReasonString(int p0) { return null; }
        @java.lang.Deprecated
        public int getNetworkSelectionStatus() { return 0; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public java.lang.String getNetworkStatusString() { return null; }
        @java.lang.Deprecated
        public boolean hasEverConnected() { return false; }

        @java.lang.Deprecated
        public static final class Builder {
            @java.lang.Deprecated
            public Builder() {}
            @java.lang.Deprecated
            @android.annotation.NonNull
            public android.net.wifi.WifiConfiguration.NetworkSelectionStatus build() { return null; }
            @java.lang.Deprecated
            @android.annotation.NonNull
            public android.net.wifi.WifiConfiguration.NetworkSelectionStatus.Builder setNetworkSelectionDisableReason(int p0) { return null; }
            @java.lang.Deprecated
            @android.annotation.NonNull
            public android.net.wifi.WifiConfiguration.NetworkSelectionStatus.Builder setNetworkSelectionStatus(int p0) { return null; }
        }
    }

    @java.lang.Deprecated
    public static class PairwiseCipher {
        @java.lang.Deprecated
        public static final int CCMP = 2;
        @java.lang.Deprecated
        public static final int GCMP_128 = 5;
        @java.lang.Deprecated
        public static final int GCMP_256 = 3;
        @java.lang.Deprecated
        public static final int NONE = 0;
        @java.lang.Deprecated
        public static final int SMS4 = 4;
        @java.lang.Deprecated
        public static final int TKIP = 1;
        @java.lang.Deprecated
        public static final java.lang.String[] strings = null;
        @java.lang.Deprecated
        public static final java.lang.String varName = "pairwise";
        @java.lang.Deprecated
        PairwiseCipher() {}
    }

    @java.lang.Deprecated
    public static class Protocol {
        @java.lang.Deprecated
        public static final int RSN = 1;
        @java.lang.Deprecated
        public static final int WAPI = 3;
        @java.lang.Deprecated
        public static final int WPA = 0;
        @java.lang.Deprecated
        public static final java.lang.String[] strings = null;
        @java.lang.Deprecated
        public static final java.lang.String varName = "proto";
        @java.lang.Deprecated
        Protocol() {}
    }

    @java.lang.Deprecated
    public static class Status {
        @java.lang.Deprecated
        public static final int CURRENT = 0;
        @java.lang.Deprecated
        public static final int DISABLED = 1;
        @java.lang.Deprecated
        public static final int ENABLED = 2;
        @java.lang.Deprecated
        public static final java.lang.String[] strings = null;
        @java.lang.Deprecated
        Status() {}
    }
}
