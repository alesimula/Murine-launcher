package android.bluetooth.le;

public final class PeriodicAdvertisingParameters implements android.os.Parcelable {
    private static final int INTERVAL_MIN = 80;
    private static final int INTERVAL_MAX = 65519;
    private final boolean mIncludeTxPower = false;
    private final int mInterval = 0;
    public static final android.os.Parcelable.Creator<android.bluetooth.le.PeriodicAdvertisingParameters> CREATOR = null;
    private PeriodicAdvertisingParameters(boolean p0, int p1) {}
    private PeriodicAdvertisingParameters(android.os.Parcel p0) {}
    public boolean getIncludeTxPower() { return false; }
    public int getInterval() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mIncludeTxPower;
        private int mInterval;
        public Builder() {}
        public android.bluetooth.le.PeriodicAdvertisingParameters.Builder setIncludeTxPower(boolean p0) { return null; }
        public android.bluetooth.le.PeriodicAdvertisingParameters.Builder setInterval(int p0) { return null; }
        public android.bluetooth.le.PeriodicAdvertisingParameters build() { return null; }
    }
}
