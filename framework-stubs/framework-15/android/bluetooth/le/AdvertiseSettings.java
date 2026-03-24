package android.bluetooth.le;

public final class AdvertiseSettings implements android.os.Parcelable {
    public static final int ADVERTISE_MODE_BALANCED = 1;
    public static final int ADVERTISE_MODE_LOW_LATENCY = 2;
    public static final int ADVERTISE_MODE_LOW_POWER = 0;
    public static final int ADVERTISE_TX_POWER_HIGH = 3;
    public static final int ADVERTISE_TX_POWER_LOW = 1;
    public static final int ADVERTISE_TX_POWER_MEDIUM = 2;
    public static final int ADVERTISE_TX_POWER_ULTRA_LOW = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.le.AdvertiseSettings> CREATOR = null;
    AdvertiseSettings() {}
    public int describeContents() { return 0; }
    public int getMode() { return 0; }
    public int getTimeout() { return 0; }
    public int getTxPowerLevel() { return 0; }
    public boolean isConnectable() { return false; }
    public boolean isDiscoverable() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getOwnAddressType() { return 0; }

    public static final class Builder {
        public Builder() {}
        public android.bluetooth.le.AdvertiseSettings build() { return null; }
        public android.bluetooth.le.AdvertiseSettings.Builder setAdvertiseMode(int p0) { return null; }
        public android.bluetooth.le.AdvertiseSettings.Builder setConnectable(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.AdvertiseSettings.Builder setDiscoverable(boolean p0) { return null; }
        public android.bluetooth.le.AdvertiseSettings.Builder setTimeout(int p0) { return null; }
        public android.bluetooth.le.AdvertiseSettings.Builder setTxPowerLevel(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.AdvertiseSettings.Builder setOwnAddressType(int p0) { return null; }
    }
}
