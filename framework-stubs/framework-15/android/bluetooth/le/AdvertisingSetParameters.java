package android.bluetooth.le;

public final class AdvertisingSetParameters implements android.os.Parcelable {
    public static final int ADDRESS_TYPE_DEFAULT = -1;
    public static final int ADDRESS_TYPE_PUBLIC = 0;
    public static final int ADDRESS_TYPE_RANDOM = 1;
    public static final int ADDRESS_TYPE_RANDOM_NON_RESOLVABLE = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.le.AdvertisingSetParameters> CREATOR = null;
    public static final int INTERVAL_HIGH = 1600;
    public static final int INTERVAL_LOW = 160;
    public static final int INTERVAL_MAX = 16777215;
    public static final int INTERVAL_MEDIUM = 400;
    public static final int INTERVAL_MIN = 160;
    public static final int TX_POWER_HIGH = 1;
    public static final int TX_POWER_LOW = -15;
    public static final int TX_POWER_MAX = 1;
    public static final int TX_POWER_MEDIUM = -7;
    public static final int TX_POWER_MIN = -127;
    public static final int TX_POWER_ULTRA_LOW = -21;
    AdvertisingSetParameters() {}
    public int describeContents() { return 0; }
    public int getInterval() { return 0; }
    public int getPrimaryPhy() { return 0; }
    public int getSecondaryPhy() { return 0; }
    public int getTxPowerLevel() { return 0; }
    public boolean includeTxPower() { return false; }
    public boolean isAnonymous() { return false; }
    public boolean isConnectable() { return false; }
    public boolean isDiscoverable() { return false; }
    public boolean isLegacy() { return false; }
    public boolean isScannable() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getOwnAddressType() { return 0; }

    public static final class Builder {
        public Builder() {}
        public android.bluetooth.le.AdvertisingSetParameters build() { return null; }
        public android.bluetooth.le.AdvertisingSetParameters.Builder setAnonymous(boolean p0) { return null; }
        public android.bluetooth.le.AdvertisingSetParameters.Builder setConnectable(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.AdvertisingSetParameters.Builder setDiscoverable(boolean p0) { return null; }
        public android.bluetooth.le.AdvertisingSetParameters.Builder setIncludeTxPower(boolean p0) { return null; }
        public android.bluetooth.le.AdvertisingSetParameters.Builder setInterval(int p0) { return null; }
        public android.bluetooth.le.AdvertisingSetParameters.Builder setLegacyMode(boolean p0) { return null; }
        public android.bluetooth.le.AdvertisingSetParameters.Builder setPrimaryPhy(int p0) { return null; }
        public android.bluetooth.le.AdvertisingSetParameters.Builder setScannable(boolean p0) { return null; }
        public android.bluetooth.le.AdvertisingSetParameters.Builder setSecondaryPhy(int p0) { return null; }
        public android.bluetooth.le.AdvertisingSetParameters.Builder setTxPowerLevel(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.AdvertisingSetParameters.Builder setOwnAddressType(int p0) { return null; }
    }
}
