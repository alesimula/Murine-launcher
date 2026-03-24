package android.bluetooth;

public final class BluetoothMapClient implements java.lang.AutoCloseable, android.bluetooth.BluetoothProfile {
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.mapmce.profile.action.CONNECTION_STATE_CHANGED";
    BluetoothMapClient() {}
    public void close() {}
    protected void finalize() {}
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    public boolean sendMessage(android.bluetooth.BluetoothDevice p0, java.util.Collection<android.net.Uri> p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4) { return false; }
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
}
