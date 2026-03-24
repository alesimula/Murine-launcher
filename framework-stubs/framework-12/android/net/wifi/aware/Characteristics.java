package android.net.wifi.aware;

public final class Characteristics implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.aware.Characteristics> CREATOR = null;
    public static final int WIFI_AWARE_CIPHER_SUITE_NCS_SK_128 = 1;
    public static final int WIFI_AWARE_CIPHER_SUITE_NCS_SK_256 = 2;
    Characteristics() {}
    public int getMaxServiceNameLength() { return 0; }
    public int getMaxServiceSpecificInfoLength() { return 0; }
    public int getMaxMatchFilterLength() { return 0; }
    public boolean isInstantCommunicationModeSupported() { return false; }
    public int getSupportedCipherSuites() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
