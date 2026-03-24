package android.bluetooth.le;

public final class AdvertiseSettings implements android.os.Parcelable {
    public static final int ADVERTISE_MODE_LOW_POWER = 0;
    public static final int ADVERTISE_MODE_BALANCED = 1;
    public static final int ADVERTISE_MODE_LOW_LATENCY = 2;
    public static final int ADVERTISE_TX_POWER_ULTRA_LOW = 0;
    public static final int ADVERTISE_TX_POWER_LOW = 1;
    public static final int ADVERTISE_TX_POWER_MEDIUM = 2;
    public static final int ADVERTISE_TX_POWER_HIGH = 3;
    private static final int LIMITED_ADVERTISING_MAX_MILLIS = 180000;
    private final int mAdvertiseMode = 0;
    private final int mAdvertiseTxPowerLevel = 0;
    private final int mAdvertiseTimeoutMillis = 0;
    private final boolean mAdvertiseConnectable = false;
    public static final android.os.Parcelable.Creator<android.bluetooth.le.AdvertiseSettings> CREATOR = null;
    private AdvertiseSettings(int p0, int p1, boolean p2, int p3) {}
    private AdvertiseSettings(android.os.Parcel p0) {}
    public int getMode() { return 0; }
    public int getTxPowerLevel() { return 0; }
    public boolean isConnectable() { return false; }
    public int getTimeout() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mMode;
        private int mTxPowerLevel;
        private int mTimeoutMillis;
        private boolean mConnectable;
        public Builder() {}
        public android.bluetooth.le.AdvertiseSettings.Builder setAdvertiseMode(int p0) { return null; }
        public android.bluetooth.le.AdvertiseSettings.Builder setTxPowerLevel(int p0) { return null; }
        public android.bluetooth.le.AdvertiseSettings.Builder setConnectable(boolean p0) { return null; }
        public android.bluetooth.le.AdvertiseSettings.Builder setTimeout(int p0) { return null; }
        public android.bluetooth.le.AdvertiseSettings build() { return null; }
    }
}
