package android.net.wifi.aware;

public final class Characteristics implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.aware.Characteristics> CREATOR = null;
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public static final int SUPPORTED_RX_CHAINS_1 = 1;
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public static final int SUPPORTED_RX_CHAINS_2 = 2;
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public static final int SUPPORTED_RX_CHAINS_3 = 3;
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public static final int SUPPORTED_RX_CHAINS_4 = 4;
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public static final int SUPPORTED_RX_CHAINS_UNSPECIFIED = 0;
    public static final int WIFI_AWARE_CIPHER_SUITE_NCS_PK_128 = 4;
    public static final int WIFI_AWARE_CIPHER_SUITE_NCS_PK_256 = 8;
    public static final int WIFI_AWARE_CIPHER_SUITE_NCS_PK_PASN_128 = 16;
    public static final int WIFI_AWARE_CIPHER_SUITE_NCS_PK_PASN_256 = 32;
    public static final int WIFI_AWARE_CIPHER_SUITE_NCS_SK_128 = 1;
    public static final int WIFI_AWARE_CIPHER_SUITE_NCS_SK_256 = 2;
    public static final int WIFI_AWARE_CIPHER_SUITE_NONE = 0;
    Characteristics() {}
    public int describeContents() { return 0; }
    public int getMaxMatchFilterLength() { return 0; }
    public int getMaxServiceNameLength() { return 0; }
    public int getMaxServiceSpecificInfoLength() { return 0; }
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public int getMaxSupportedRangingPacketBandwidth() { return 0; }
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public int getMaxSupportedRxChains() { return 0; }
    public int getNumberOfSupportedDataInterfaces() { return 0; }
    public int getNumberOfSupportedDataPaths() { return 0; }
    public int getNumberOfSupportedPublishSessions() { return 0; }
    public int getNumberOfSupportedSubscribeSessions() { return 0; }
    public int getSupportedCipherSuites() { return 0; }
    public int getSupportedPairingCipherSuites() { return 0; }
    public boolean isAwarePairingSupported() { return false; }
    public boolean isInstantCommunicationModeSupported() { return false; }
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public boolean isPeriodicRangingSupported() { return false; }
    public boolean isSuspensionSupported() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
