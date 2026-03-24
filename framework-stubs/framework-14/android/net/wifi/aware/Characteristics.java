package android.net.wifi.aware;

public final class Characteristics implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.aware.Characteristics> CREATOR = null;
    public static final int WIFI_AWARE_CIPHER_SUITE_NCS_PK_128 = 4;
    public static final int WIFI_AWARE_CIPHER_SUITE_NCS_PK_256 = 8;
    public static final int WIFI_AWARE_CIPHER_SUITE_NCS_PK_PASN_128 = 16;
    public static final int WIFI_AWARE_CIPHER_SUITE_NCS_PK_PASN_256 = 32;
    public static final int WIFI_AWARE_CIPHER_SUITE_NCS_SK_128 = 1;
    public static final int WIFI_AWARE_CIPHER_SUITE_NCS_SK_256 = 2;
    public static final int WIFI_AWARE_CIPHER_SUITE_NONE = 0;
    Characteristics() {}
    public int getMaxServiceNameLength() { return 0; }
    public int getMaxServiceSpecificInfoLength() { return 0; }
    public int getMaxMatchFilterLength() { return 0; }
    public int getNumberOfSupportedDataInterfaces() { return 0; }
    public int getNumberOfSupportedPublishSessions() { return 0; }
    public int getNumberOfSupportedSubscribeSessions() { return 0; }
    public int getNumberOfSupportedDataPaths() { return 0; }
    public boolean isInstantCommunicationModeSupported() { return false; }
    public boolean isAwarePairingSupported() { return false; }
    public boolean isSuspensionSupported() { return false; }
    public int getSupportedCipherSuites() { return 0; }
    public int getSupportedPairingCipherSuites() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
