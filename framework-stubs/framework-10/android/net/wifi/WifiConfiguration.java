package android.net.wifi;

@java.lang.Deprecated
public class WifiConfiguration implements android.os.Parcelable {
    private static final java.lang.String TAG = "WifiConfiguration";
    private static final int BACKUP_VERSION = 3;
    public static final java.lang.String ssidVarName = "ssid";
    public static final java.lang.String bssidVarName = "bssid";
    public static final java.lang.String pskVarName = "psk";
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String[] wepKeyVarNames = null;
    @java.lang.Deprecated
    public static final java.lang.String wepTxKeyIdxVarName = "wep_tx_keyidx";
    public static final java.lang.String priorityVarName = "priority";
    public static final java.lang.String hiddenSSIDVarName = "scan_ssid";
    public static final java.lang.String pmfVarName = "ieee80211w";
    public static final java.lang.String updateIdentiferVarName = "update_identifier";
    public static final int INVALID_NETWORK_ID = -1;
    public static final int LOCAL_ONLY_NETWORK_ID = -2;
    private java.lang.String mPasspointManagementObjectTree;
    private static final int MAXIMUM_RANDOM_MAC_GENERATION_RETRY = 3;
    public static final int SECURITY_TYPE_OPEN = 0;
    public static final int SECURITY_TYPE_WEP = 1;
    public static final int SECURITY_TYPE_PSK = 2;
    public static final int SECURITY_TYPE_EAP = 3;
    public static final int SECURITY_TYPE_SAE = 4;
    public static final int SECURITY_TYPE_EAP_SUITE_B = 5;
    public static final int SECURITY_TYPE_OWE = 6;
    public static final int UNKNOWN_UID = -1;
    public int networkId;
    public int status;
    public java.lang.String SSID;
    public java.lang.String BSSID;
    public static final int AP_BAND_2GHZ = 0;
    public static final int AP_BAND_5GHZ = 1;
    public static final int AP_BAND_ANY = -1;
    @android.annotation.UnsupportedAppUsage
    public int apBand;
    @android.annotation.UnsupportedAppUsage
    public int apChannel;
    public java.lang.String preSharedKey;
    @java.lang.Deprecated
    public java.lang.String[] wepKeys;
    @java.lang.Deprecated
    public int wepTxKeyIndex;
    @java.lang.Deprecated
    public int priority;
    public boolean hiddenSSID;
    public boolean requirePMF;
    public java.lang.String updateIdentifier;
    public java.util.BitSet allowedKeyManagement;
    public java.util.BitSet allowedProtocols;
    public java.util.BitSet allowedAuthAlgorithms;
    public java.util.BitSet allowedPairwiseCiphers;
    public java.util.BitSet allowedGroupCiphers;
    public java.util.BitSet allowedGroupManagementCiphers;
    public java.util.BitSet allowedSuiteBCiphers;
    public android.net.wifi.WifiEnterpriseConfig enterpriseConfig;
    public java.lang.String FQDN;
    public java.lang.String providerFriendlyName;
    public boolean isHomeProviderNetwork;
    public long[] roamingConsortiumIds;
    @android.annotation.UnsupportedAppUsage
    public boolean shared;
    @android.annotation.UnsupportedAppUsage
    private android.net.IpConfiguration mIpConfiguration;
    public java.lang.String dhcpServer;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String defaultGwMacAddress;
    @android.annotation.UnsupportedAppUsage
    public boolean validatedInternetAccess;
    public int dtimInterval;
    public boolean isLegacyPasspointConfig;
    @android.annotation.SystemApi
    public int creatorUid;
    @android.annotation.UnsupportedAppUsage
    public int lastConnectUid;
    @android.annotation.SystemApi
    public int lastUpdateUid;
    @android.annotation.SystemApi
    public java.lang.String creatorName;
    @android.annotation.SystemApi
    public java.lang.String lastUpdateName;
    public int userApproved;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public static int INVALID_RSSI;
    public static final int USER_UNSPECIFIED = 0;
    public static final int USER_APPROVED = 1;
    public static final int USER_BANNED = 2;
    public static final int USER_PENDING = 3;
    @android.annotation.UnsupportedAppUsage
    public int numNoInternetAccessReports;
    public java.lang.String updateTime;
    public java.lang.String creationTime;
    @android.annotation.UnsupportedAppUsage
    public boolean noInternetAccessExpected;
    public boolean osu;
    public long lastConnected;
    public long lastDisconnected;
    @android.annotation.UnsupportedAppUsage
    public boolean selfAdded;
    public boolean didSelfAdd;
    public java.lang.String peerWifiConfiguration;
    public boolean ephemeral;
    public boolean trusted;
    public boolean fromWifiNetworkSuggestion;
    public boolean fromWifiNetworkSpecifier;
    @android.annotation.SystemApi
    public boolean meteredHint;
    public static final int METERED_OVERRIDE_NONE = 0;
    public static final int METERED_OVERRIDE_METERED = 1;
    public static final int METERED_OVERRIDE_NOT_METERED = 2;
    public int meteredOverride;
    @android.annotation.SystemApi
    public boolean useExternalScores;
    @android.annotation.SystemApi
    public int numScorerOverride;
    @android.annotation.SystemApi
    public int numScorerOverrideAndSwitchedNetwork;
    @android.annotation.SystemApi
    public int numAssociation;
    public static final int RANDOMIZATION_NONE = 0;
    public static final int RANDOMIZATION_PERSISTENT = 1;
    public int macRandomizationSetting;
    private android.net.MacAddress mRandomizedMacAddress;
    public static final int HOME_NETWORK_RSSI_BOOST = 5;
    private android.net.wifi.WifiConfiguration.NetworkSelectionStatus mNetworkSelectionStatus;
    public final android.net.wifi.WifiConfiguration.RecentFailure recentFailure = null;
    public java.util.HashMap<java.lang.String, java.lang.Integer> linkedConfigurations;
    java.lang.String mCachedConfigKey;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.Parcelable.Creator<android.net.wifi.WifiConfiguration> CREATOR = null;
    public void setSecurityParams(int p0) {}
    @android.annotation.SystemApi
    public boolean hasNoInternetAccess() { return false; }
    @android.annotation.SystemApi
    public boolean isNoInternetAccessExpected() { return false; }
    @android.annotation.SystemApi
    public boolean isEphemeral() { return false; }
    public static boolean isMetered(android.net.wifi.WifiConfiguration p0, android.net.wifi.WifiInfo p1) { return false; }
    public boolean isOpenNetwork() { return false; }
    public static boolean isValidMacAddressForRandomization(android.net.MacAddress p0) { return false; }
    public android.net.MacAddress getOrCreateRandomizedMacAddress() { return null; }
    public android.net.MacAddress getRandomizedMacAddress() { return null; }
    public void setRandomizedMacAddress(android.net.MacAddress p0) {}
    public android.net.wifi.WifiConfiguration.NetworkSelectionStatus getNetworkSelectionStatus() { return null; }
    public void setNetworkSelectionStatus(android.net.wifi.WifiConfiguration.NetworkSelectionStatus p0) {}
    public WifiConfiguration() {}
    public boolean isPasspoint() { return false; }
    public boolean isLinked(android.net.wifi.WifiConfiguration p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isEnterprise() { return false; }
    public java.lang.String toString() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getPrintableSsid() { return null; }
    public static java.lang.String userApprovedAsString(int p0) { return null; }
    public java.lang.String getKeyIdForCredentials(android.net.wifi.WifiConfiguration p0) { return null; }
    private java.lang.String trimStringForKeyId(java.lang.String p0) { return null; }
    private static java.util.BitSet readBitSet(android.os.Parcel p0) { return null; }
    private static void writeBitSet(android.os.Parcel p0, java.util.BitSet p1) {}
    @android.annotation.UnsupportedAppUsage
    public int getAuthType() { return 0; }
    public java.lang.String configKey(boolean p0) { return null; }
    public java.lang.String getSsidAndSecurityTypeString() { return null; }
    public java.lang.String configKey() { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.net.IpConfiguration getIpConfiguration() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setIpConfiguration(android.net.IpConfiguration p0) {}
    @android.annotation.UnsupportedAppUsage
    public android.net.StaticIpConfiguration getStaticIpConfiguration() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setStaticIpConfiguration(android.net.StaticIpConfiguration p0) {}
    @android.annotation.UnsupportedAppUsage
    public android.net.IpConfiguration.IpAssignment getIpAssignment() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setIpAssignment(android.net.IpConfiguration.IpAssignment p0) {}
    @android.annotation.UnsupportedAppUsage
    public android.net.IpConfiguration.ProxySettings getProxySettings() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setProxySettings(android.net.IpConfiguration.ProxySettings p0) {}
    public android.net.ProxyInfo getHttpProxy() { return null; }
    public void setHttpProxy(android.net.ProxyInfo p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setProxy(android.net.IpConfiguration.ProxySettings p0, android.net.ProxyInfo p1) {}
    public int describeContents() { return 0; }
    public void setPasspointManagementObjectTree(java.lang.String p0) {}
    public java.lang.String getMoTree() { return null; }
    @android.annotation.UnsupportedAppUsage
    public WifiConfiguration(android.net.wifi.WifiConfiguration p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public byte[] getBytesForBackup() throws java.io.IOException { return null; }
    public static android.net.wifi.WifiConfiguration getWifiConfigFromBackup(java.io.DataInputStream p0) throws java.io.IOException, android.util.BackupUtils.BadVersionException { return null; }

    public static class SuiteBCipher {
        public static final int ECDHE_ECDSA = 0;
        public static final int ECDHE_RSA = 1;
        private static final java.lang.String varName = "SuiteB";
        private static final java.lang.String[] strings = null;
        private SuiteBCipher() {}
    }

    public static class Status {
        public static final int CURRENT = 0;
        public static final int DISABLED = 1;
        public static final int ENABLED = 2;
        public static final java.lang.String[] strings = null;
        private Status() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SecurityType {
    }

    public static class RecentFailure {
        public static final int NONE = 0;
        public static final int STATUS_AP_UNABLE_TO_HANDLE_NEW_STA = 17;
        private int mAssociationStatus;
        public RecentFailure() {}
        public void setAssociationStatus(int p0) {}
        public void clear() {}
        public int getAssociationStatus() { return 0; }
    }

    public static class Protocol {
        @java.lang.Deprecated
        public static final int WPA = 0;
        public static final int RSN = 1;
        public static final int OSEN = 2;
        public static final java.lang.String varName = "proto";
        public static final java.lang.String[] strings = null;
        private Protocol() {}
    }

    public static class PairwiseCipher {
        public static final int NONE = 0;
        @java.lang.Deprecated
        public static final int TKIP = 1;
        public static final int CCMP = 2;
        public static final int GCMP_256 = 3;
        public static final java.lang.String varName = "pairwise";
        public static final java.lang.String[] strings = null;
        private PairwiseCipher() {}
    }

    public static class NetworkSelectionStatus {
        public static final int NETWORK_SELECTION_ENABLED = 0;
        public static final int NETWORK_SELECTION_TEMPORARY_DISABLED = 1;
        public static final int NETWORK_SELECTION_PERMANENTLY_DISABLED = 2;
        public static final int NETWORK_SELECTION_STATUS_MAX = 3;
        public static final java.lang.String[] QUALITY_NETWORK_SELECTION_STATUS = null;
        public static final int NETWORK_SELECTION_ENABLE = 0;
        public static final int NETWORK_SELECTION_DISABLED_STARTING_INDEX = 1;
        public static final int DISABLED_BAD_LINK = 1;
        public static final int DISABLED_ASSOCIATION_REJECTION = 2;
        public static final int DISABLED_AUTHENTICATION_FAILURE = 3;
        public static final int DISABLED_DHCP_FAILURE = 4;
        public static final int DISABLED_DNS_FAILURE = 5;
        public static final int DISABLED_NO_INTERNET_TEMPORARY = 6;
        public static final int DISABLED_WPS_START = 7;
        public static final int DISABLED_TLS_VERSION_MISMATCH = 8;
        public static final int DISABLED_AUTHENTICATION_NO_CREDENTIALS = 9;
        public static final int DISABLED_NO_INTERNET_PERMANENT = 10;
        public static final int DISABLED_BY_WIFI_MANAGER = 11;
        public static final int DISABLED_DUE_TO_USER_SWITCH = 12;
        public static final int DISABLED_BY_WRONG_PASSWORD = 13;
        public static final int DISABLED_AUTHENTICATION_NO_SUBSCRIPTION = 14;
        public static final int NETWORK_SELECTION_DISABLED_MAX = 15;
        public static final java.lang.String[] QUALITY_NETWORK_SELECTION_DISABLE_REASON = null;
        public static final long INVALID_NETWORK_SELECTION_DISABLE_TIMESTAMP = -1L;
        private static final int CONNECT_CHOICE_EXISTS = 1;
        private static final int CONNECT_CHOICE_NOT_EXISTS = -1;
        private int mStatus;
        private int mNetworkSelectionDisableReason;
        private long mTemporarilyDisabledTimestamp;
        private int[] mNetworkSeclectionDisableCounter;
        private java.lang.String mConnectChoice;
        private long mConnectChoiceTimestamp;
        private android.net.wifi.ScanResult mCandidate;
        private int mCandidateScore;
        private boolean mSeenInLastQualifiedNetworkSelection;
        private boolean mHasEverConnected;
        private boolean mNotRecommended;
        private java.lang.String mNetworkSelectionBSSID;
        public void setNotRecommended(boolean p0) {}
        public boolean isNotRecommended() { return false; }
        public void setSeenInLastQualifiedNetworkSelection(boolean p0) {}
        public boolean getSeenInLastQualifiedNetworkSelection() { return false; }
        public void setCandidate(android.net.wifi.ScanResult p0) {}
        public android.net.wifi.ScanResult getCandidate() { return null; }
        public void setCandidateScore(int p0) {}
        public int getCandidateScore() { return 0; }
        public java.lang.String getConnectChoice() { return null; }
        public void setConnectChoice(java.lang.String p0) {}
        public long getConnectChoiceTimestamp() { return 0L; }
        public void setConnectChoiceTimestamp(long p0) {}
        public java.lang.String getNetworkStatusString() { return null; }
        public void setHasEverConnected(boolean p0) {}
        public boolean getHasEverConnected() { return false; }
        public NetworkSelectionStatus() {}
        public static java.lang.String getNetworkDisableReasonString(int p0) { return null; }
        public java.lang.String getNetworkDisableReasonString() { return null; }
        public int getNetworkSelectionStatus() { return 0; }
        public boolean isNetworkEnabled() { return false; }
        public boolean isNetworkTemporaryDisabled() { return false; }
        public boolean isNetworkPermanentlyDisabled() { return false; }
        public void setNetworkSelectionStatus(int p0) {}
        public int getNetworkSelectionDisableReason() { return 0; }
        public void setNetworkSelectionDisableReason(int p0) {}
        public boolean isDisabledByReason(int p0) { return false; }
        public void setDisableTime(long p0) {}
        public long getDisableTime() { return 0L; }
        public int getDisableReasonCounter(int p0) { return 0; }
        public void setDisableReasonCounter(int p0, int p1) {}
        public void incrementDisableReasonCounter(int p0) {}
        public void clearDisableReasonCounter(int p0) {}
        public void clearDisableReasonCounter() {}
        public java.lang.String getNetworkSelectionBSSID() { return null; }
        public void setNetworkSelectionBSSID(java.lang.String p0) {}
        public void copy(android.net.wifi.WifiConfiguration.NetworkSelectionStatus p0) {}
        public void writeToParcel(android.os.Parcel p0) {}
        public void readFromParcel(android.os.Parcel p0) {}
    }

    public static class KeyMgmt {
        public static final int NONE = 0;
        public static final int WPA_PSK = 1;
        public static final int WPA_EAP = 2;
        public static final int IEEE8021X = 3;
        @android.annotation.SystemApi
        public static final int WPA2_PSK = 4;
        public static final int OSEN = 5;
        public static final int FT_PSK = 6;
        public static final int FT_EAP = 7;
        public static final int SAE = 8;
        public static final int OWE = 9;
        public static final int SUITE_B_192 = 10;
        public static final int WPA_PSK_SHA256 = 11;
        public static final int WPA_EAP_SHA256 = 12;
        public static final java.lang.String varName = "key_mgmt";
        public static final java.lang.String[] strings = null;
        private KeyMgmt() {}
    }

    public static class GroupMgmtCipher {
        public static final int BIP_CMAC_256 = 0;
        public static final int BIP_GMAC_128 = 1;
        public static final int BIP_GMAC_256 = 2;
        private static final java.lang.String varName = "groupMgmt";
        private static final java.lang.String[] strings = null;
        private GroupMgmtCipher() {}
    }

    public static class GroupCipher {
        @java.lang.Deprecated
        public static final int WEP40 = 0;
        @java.lang.Deprecated
        public static final int WEP104 = 1;
        public static final int TKIP = 2;
        public static final int CCMP = 3;
        public static final int GTK_NOT_USED = 4;
        public static final int GCMP_256 = 5;
        public static final java.lang.String varName = "group";
        public static final java.lang.String[] strings = null;
        private GroupCipher() {}
    }

    public static class AuthAlgorithm {
        public static final int OPEN = 0;
        @java.lang.Deprecated
        public static final int SHARED = 1;
        public static final int LEAP = 2;
        public static final java.lang.String varName = "auth_alg";
        public static final java.lang.String[] strings = null;
        private AuthAlgorithm() {}
    }
}
