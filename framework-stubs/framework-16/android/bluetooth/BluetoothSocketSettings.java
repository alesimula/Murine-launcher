package android.bluetooth;

@android.annotation.FlaggedApi("com.android.bluetooth.flags.socket_settings_api")
public final class BluetoothSocketSettings {
    public static final int DATA_PATH_HARDWARE_OFFLOAD = 1;
    public static final int DATA_PATH_NO_OFFLOAD = 0;
    BluetoothSocketSettings() {}
    public int getDataPath() { return 0; }
    public long getEndpointId() { return 0L; }
    public long getHubId() { return 0L; }
    public int getL2capPsm() { return 0; }
    public int getRequestedMaximumPacketSize() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getRfcommServiceName() { return null; }
    @android.annotation.Nullable
    public java.util.UUID getRfcommUuid() { return null; }
    @android.annotation.NonNull
    public java.lang.String getSocketName() { return null; }
    public int getSocketType() { return 0; }
    public boolean isAuthenticationRequired() { return false; }
    public boolean isEncryptionRequired() { return false; }

    @android.annotation.FlaggedApi("com.android.bluetooth.flags.socket_settings_api")
    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.bluetooth.BluetoothSocketSettings build() { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothSocketSettings.Builder setAuthenticationRequired(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothSocketSettings.Builder setDataPath(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothSocketSettings.Builder setEncryptionRequired(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothSocketSettings.Builder setEndpointId(long p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothSocketSettings.Builder setHubId(long p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothSocketSettings.Builder setL2capPsm(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothSocketSettings.Builder setRequestedMaximumPacketSize(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothSocketSettings.Builder setRfcommServiceName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothSocketSettings.Builder setRfcommUuid(java.util.UUID p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothSocketSettings.Builder setSocketName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothSocketSettings.Builder setSocketType(int p0) { return null; }
    }
}
