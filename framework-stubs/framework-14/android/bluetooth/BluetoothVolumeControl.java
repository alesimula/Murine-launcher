package android.bluetooth;

public final class BluetoothVolumeControl implements android.bluetooth.BluetoothProfile, java.lang.AutoCloseable {
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.volume-control.profile.action.CONNECTION_STATE_CHANGED";
    BluetoothVolumeControl() {}
    protected void finalize() {}
    public void close() {}
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public void registerCallback(java.util.concurrent.Executor p0, android.bluetooth.BluetoothVolumeControl.Callback p1) {}
    public void unregisterCallback(android.bluetooth.BluetoothVolumeControl.Callback p0) {}
    public void setVolumeOffset(android.bluetooth.BluetoothDevice p0, int p1) {}
    public boolean isVolumeOffsetAvailable(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }

    public static interface Callback {
        public void onVolumeOffsetChanged(android.bluetooth.BluetoothDevice p0, int p1);
    }
}
