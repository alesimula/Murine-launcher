package android.bluetooth.le;

public final class AdvertisingSetParameters implements android.os.Parcelable {
    public static final int INTERVAL_HIGH = 1600;
    public static final int INTERVAL_MEDIUM = 400;
    public static final int INTERVAL_LOW = 160;
    public static final int INTERVAL_MIN = 160;
    public static final int INTERVAL_MAX = 16777215;
    public static final int TX_POWER_ULTRA_LOW = -21;
    public static final int TX_POWER_LOW = -15;
    public static final int TX_POWER_MEDIUM = -7;
    public static final int TX_POWER_HIGH = 1;
    public static final int TX_POWER_MIN = -127;
    public static final int TX_POWER_MAX = 1;
    private static final int LIMITED_ADVERTISING_MAX_MILLIS = 180000;
    private final boolean mIsLegacy = false;
    private final boolean mIsAnonymous = false;
    private final boolean mIncludeTxPower = false;
    private final int mPrimaryPhy = 0;
    private final int mSecondaryPhy = 0;
    private final boolean mConnectable = false;
    private final boolean mScannable = false;
    private final int mInterval = 0;
    private final int mTxPowerLevel = 0;
    public static final android.os.Parcelable.Creator<android.bluetooth.le.AdvertisingSetParameters> CREATOR = null;
    private AdvertisingSetParameters(boolean p0, boolean p1, boolean p2, boolean p3, boolean p4, int p5, int p6, int p7, int p8) {}
    private AdvertisingSetParameters(android.os.Parcel p0) {}
    public boolean isConnectable() { return false; }
    public boolean isScannable() { return false; }
    public boolean isLegacy() { return false; }
    public boolean isAnonymous() { return false; }
    public boolean includeTxPower() { return false; }
    public int getPrimaryPhy() { return 0; }
    public int getSecondaryPhy() { return 0; }
    public int getInterval() { return 0; }
    public int getTxPowerLevel() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mConnectable;
        private boolean mScannable;
        private boolean mIsLegacy;
        private boolean mIsAnonymous;
        private boolean mIncludeTxPower;
        private int mPrimaryPhy;
        private int mSecondaryPhy;
        private int mInterval;
        private int mTxPowerLevel;
        public Builder() {}
        public android.bluetooth.le.AdvertisingSetParameters.Builder setConnectable(boolean p0) { return null; }
        public android.bluetooth.le.AdvertisingSetParameters.Builder setScannable(boolean p0) { return null; }
        public android.bluetooth.le.AdvertisingSetParameters.Builder setLegacyMode(boolean p0) { return null; }
        public android.bluetooth.le.AdvertisingSetParameters.Builder setAnonymous(boolean p0) { return null; }
        public android.bluetooth.le.AdvertisingSetParameters.Builder setIncludeTxPower(boolean p0) { return null; }
        public android.bluetooth.le.AdvertisingSetParameters.Builder setPrimaryPhy(int p0) { return null; }
        public android.bluetooth.le.AdvertisingSetParameters.Builder setSecondaryPhy(int p0) { return null; }
        public android.bluetooth.le.AdvertisingSetParameters.Builder setInterval(int p0) { return null; }
        public android.bluetooth.le.AdvertisingSetParameters.Builder setTxPowerLevel(int p0) { return null; }
        public android.bluetooth.le.AdvertisingSetParameters build() { return null; }
    }
}
