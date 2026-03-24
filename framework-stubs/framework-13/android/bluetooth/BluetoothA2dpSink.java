package android.bluetooth;

public final class BluetoothA2dpSink implements android.bluetooth.BluetoothProfile {
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.a2dp-sink.profile.action.CONNECTION_STATE_CHANGED";
    BluetoothA2dpSink() {}
    public void finalize() {}
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    public boolean isAudioPlaying(android.bluetooth.BluetoothDevice p0) { return false; }
}
