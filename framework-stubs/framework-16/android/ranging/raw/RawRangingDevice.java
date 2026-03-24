package android.ranging.raw;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public final class RawRangingDevice implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.raw.RawRangingDevice> CREATOR = null;
    public static final int UPDATE_RATE_FREQUENT = 3;
    public static final int UPDATE_RATE_INFREQUENT = 2;
    public static final int UPDATE_RATE_NORMAL = 1;
    RawRangingDevice() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public android.ranging.ble.rssi.BleRssiRangingParams getBleRssiRangingParams() { return null; }
    @android.annotation.Nullable
    public android.ranging.ble.cs.BleCsRangingParams getCsRangingParams() { return null; }
    @android.annotation.NonNull
    public android.ranging.RangingDevice getRangingDevice() { return null; }
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_updates_25q4")
    @android.annotation.NonNull
    public java.util.Map<java.lang.Integer, java.time.Duration> getRangingIntervalValues() { return null; }
    @android.annotation.Nullable
    public android.ranging.wifi.rtt.RttRangingParams getRttRangingParams() { return null; }
    @android.annotation.Nullable
    public android.ranging.uwb.UwbRangingParams getUwbRangingParams() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.ranging.raw.RawRangingDevice build() { return null; }
        @android.annotation.NonNull
        public android.ranging.raw.RawRangingDevice.Builder setBleRssiRangingParams(android.ranging.ble.rssi.BleRssiRangingParams p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.raw.RawRangingDevice.Builder setCsRangingParams(android.ranging.ble.cs.BleCsRangingParams p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.raw.RawRangingDevice.Builder setRangingDevice(android.ranging.RangingDevice p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.raw.RawRangingDevice.Builder setRttRangingParams(android.ranging.wifi.rtt.RttRangingParams p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.raw.RawRangingDevice.Builder setUwbRangingParams(android.ranging.uwb.UwbRangingParams p0) { return null; }
    }
}
