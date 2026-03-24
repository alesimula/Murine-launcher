package android.bluetooth;

public final class BluetoothSinkAudioPolicy implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothSinkAudioPolicy> CREATOR = null;
    public static final int POLICY_ALLOWED = 1;
    public static final int POLICY_NOT_ALLOWED = 2;
    public static final int POLICY_UNCONFIGURED = 0;
    BluetoothSinkAudioPolicy() {}
    public int describeContents() { return 0; }
    public int getActiveDevicePolicyAfterConnection() { return 0; }
    public int getCallEstablishPolicy() { return 0; }
    public int getInBandRingtonePolicy() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public Builder(android.bluetooth.BluetoothSinkAudioPolicy p0) {}
        @android.annotation.NonNull
        public android.bluetooth.BluetoothSinkAudioPolicy build() { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothSinkAudioPolicy.Builder setActiveDevicePolicyAfterConnection(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothSinkAudioPolicy.Builder setCallEstablishPolicy(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothSinkAudioPolicy.Builder setInBandRingtonePolicy(int p0) { return null; }
    }
}
