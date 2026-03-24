package android.ranging.ble.rssi;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public final class BleRssiRangingParams implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.ble.rssi.BleRssiRangingParams> CREATOR = null;
    BleRssiRangingParams() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getPeerBluetoothAddress() { return null; }
    public int getRangingUpdateRate() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.ranging.ble.rssi.BleRssiRangingParams build() { return null; }
        @android.annotation.NonNull
        public android.ranging.ble.rssi.BleRssiRangingParams.Builder setRangingUpdateRate(int p0) { return null; }
    }
}
