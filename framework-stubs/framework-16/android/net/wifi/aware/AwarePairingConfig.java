package android.net.wifi.aware;

public final class AwarePairingConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.aware.AwarePairingConfig> CREATOR = null;
    public static final int PAIRING_BOOTSTRAPPING_NFC_READER = 256;
    public static final int PAIRING_BOOTSTRAPPING_NFC_TAG = 16;
    public static final int PAIRING_BOOTSTRAPPING_OPPORTUNISTIC = 1;
    public static final int PAIRING_BOOTSTRAPPING_PASSPHRASE_DISPLAY = 4;
    public static final int PAIRING_BOOTSTRAPPING_PASSPHRASE_KEYPAD = 64;
    public static final int PAIRING_BOOTSTRAPPING_PIN_CODE_DISPLAY = 2;
    public static final int PAIRING_BOOTSTRAPPING_PIN_CODE_KEYPAD = 32;
    public static final int PAIRING_BOOTSTRAPPING_QR_DISPLAY = 8;
    public static final int PAIRING_BOOTSTRAPPING_QR_SCAN = 128;
    AwarePairingConfig() {}
    public int describeContents() { return 0; }
    public int getBootstrappingMethods() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.aware_pairing")
    public int getSupportedCipherSuites() { return 0; }
    public boolean isPairingCacheEnabled() { return false; }
    public boolean isPairingSetupEnabled() { return false; }
    public boolean isPairingVerificationEnabled() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.wifi.aware.AwarePairingConfig build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.AwarePairingConfig.Builder setBootstrappingMethods(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.AwarePairingConfig.Builder setPairingCacheEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.AwarePairingConfig.Builder setPairingSetupEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.AwarePairingConfig.Builder setPairingVerificationEnabled(boolean p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.aware_pairing")
        @android.annotation.NonNull
        public android.net.wifi.aware.AwarePairingConfig.Builder setSupportedCipherSuites(int p0) { return null; }
    }
}
