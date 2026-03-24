package android.bluetooth.le;

public final class PeriodicAdvertisingParameters implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.bluetooth.le.PeriodicAdvertisingParameters> CREATOR = null;
    PeriodicAdvertisingParameters() {}
    public boolean getIncludeTxPower() { return false; }
    public int getInterval() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public android.bluetooth.le.PeriodicAdvertisingParameters.Builder setIncludeTxPower(boolean p0) { return null; }
        public android.bluetooth.le.PeriodicAdvertisingParameters.Builder setInterval(int p0) { return null; }
        public android.bluetooth.le.PeriodicAdvertisingParameters build() { return null; }
    }
}
