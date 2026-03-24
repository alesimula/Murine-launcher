package android.bluetooth;

public final class BluetoothVolumeControl implements java.lang.AutoCloseable, android.bluetooth.BluetoothProfile {
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.volume-control.profile.action.CONNECTION_STATE_CHANGED";
    BluetoothVolumeControl() {}
    public void close() {}
    protected void finalize() {}
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.aics_api")
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.AudioInputControl> getAudioInputControlServices(android.bluetooth.BluetoothDevice p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    public int getNumberOfVolumeOffsetInstances(android.bluetooth.BluetoothDevice p0) { return 0; }
    public boolean isVolumeOffsetAvailable(android.bluetooth.BluetoothDevice p0) { return false; }
    public void registerCallback(java.util.concurrent.Executor p0, android.bluetooth.BluetoothVolumeControl.Callback p1) {}
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public void setDeviceVolume(android.bluetooth.BluetoothDevice p0, int p1, boolean p2) {}
    @java.lang.Deprecated
    public void setVolumeOffset(android.bluetooth.BluetoothDevice p0, int p1) {}
    public void setVolumeOffset(android.bluetooth.BluetoothDevice p0, int p1, int p2) {}
    public void unregisterCallback(android.bluetooth.BluetoothVolumeControl.Callback p0) {}

    public static interface Callback {
        default public void onDeviceVolumeChanged(android.bluetooth.BluetoothDevice p0, int p1) {}
        default public void onVolumeOffsetAudioDescriptionChanged(android.bluetooth.BluetoothDevice p0, int p1, java.lang.String p2) {}
        default public void onVolumeOffsetAudioLocationChanged(android.bluetooth.BluetoothDevice p0, int p1, int p2) {}
        @java.lang.Deprecated
        default public void onVolumeOffsetChanged(android.bluetooth.BluetoothDevice p0, int p1) {}
        default public void onVolumeOffsetChanged(android.bluetooth.BluetoothDevice p0, int p1, int p2) {}
    }
}
