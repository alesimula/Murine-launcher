package android.bluetooth;

public final class BluetoothHeadsetClient implements java.lang.AutoCloseable, android.bluetooth.BluetoothProfile {
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.headsetclient.profile.action.CONNECTION_STATE_CHANGED";
    public static final java.lang.String ACTION_NETWORK_SERVICE_STATE_CHANGED = "android.bluetooth.headsetclient.profile.action.NETWORK_SERVICE_STATE_CHANGED";
    public static final java.lang.String EXTRA_NETWORK_SERVICE_STATE = "android.bluetooth.headsetclient.extra.EXTRA_NETWORK_SERVICE_STATE";
    BluetoothHeadsetClient() {}
    public void close() {}
    protected void finalize() {}
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    @android.annotation.Nullable
    public android.bluetooth.BluetoothHeadsetClient.NetworkServiceState getNetworkServiceState(android.bluetooth.BluetoothDevice p0) { return null; }
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }

    public static final class NetworkServiceState implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothHeadsetClient.NetworkServiceState> CREATOR = null;
        NetworkServiceState() {}
        public int describeContents() { return 0; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothDevice getDevice() { return null; }
        @android.annotation.Nullable
        public java.lang.String getNetworkOperatorName() { return null; }
        public int getSignalStrength() { return 0; }
        public boolean isRoaming() { return false; }
        public boolean isServiceAvailable() { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
