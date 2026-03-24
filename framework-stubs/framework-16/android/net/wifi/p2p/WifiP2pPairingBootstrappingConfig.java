package android.net.wifi.p2p;

@android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
public final class WifiP2pPairingBootstrappingConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pPairingBootstrappingConfig> CREATOR = null;
    public static final int PAIRING_BOOTSTRAPPING_METHOD_DISPLAY_PASSPHRASE = 4;
    public static final int PAIRING_BOOTSTRAPPING_METHOD_DISPLAY_PINCODE = 2;
    public static final int PAIRING_BOOTSTRAPPING_METHOD_KEYPAD_PASSPHRASE = 16;
    public static final int PAIRING_BOOTSTRAPPING_METHOD_KEYPAD_PINCODE = 8;
    public static final int PAIRING_BOOTSTRAPPING_METHOD_OPPORTUNISTIC = 1;
    public static final int PAIRING_BOOTSTRAPPING_METHOD_OUT_OF_BAND = 32;
    public WifiP2pPairingBootstrappingConfig(int p0, java.lang.String p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
