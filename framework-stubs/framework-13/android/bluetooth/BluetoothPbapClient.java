package android.bluetooth;

public final class BluetoothPbapClient implements android.bluetooth.BluetoothProfile, java.lang.AutoCloseable {
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.pbapclient.profile.action.CONNECTION_STATE_CHANGED";
    BluetoothPbapClient() {}
    protected void finalize() {}
    public synchronized void close() {}
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
}
