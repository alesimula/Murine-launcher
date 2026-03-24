package android.bluetooth;

public final class BluetoothHapClient implements android.bluetooth.BluetoothProfile, java.lang.AutoCloseable {
    public static final java.lang.String ACTION_HAP_CONNECTION_STATE_CHANGED = "android.bluetooth.action.HAP_CONNECTION_STATE_CHANGED";
    BluetoothHapClient() {}
    protected void finalize() {}
    public void close() {}
    public void registerCallback(java.util.concurrent.Executor p0, android.bluetooth.BluetoothHapClient.Callback p1) {}
    public void unregisterCallback(android.bluetooth.BluetoothHapClient.Callback p0) {}
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.Nullable
    public android.bluetooth.BluetoothHapPresetInfo getActivePresetInfo(android.bluetooth.BluetoothDevice p0) { return null; }
    public void selectPreset(android.bluetooth.BluetoothDevice p0, int p1) {}
    public void selectPresetForGroup(int p0, int p1) {}
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothHapPresetInfo> getAllPresetInfo(android.bluetooth.BluetoothDevice p0) { return null; }
    public void setPresetName(android.bluetooth.BluetoothDevice p0, int p1, java.lang.String p2) {}
    public void setPresetNameForGroup(int p0, int p1, java.lang.String p2) {}

    public static interface Callback {
        public void onPresetSelected(android.bluetooth.BluetoothDevice p0, int p1, int p2);
        public void onPresetSelectionFailed(android.bluetooth.BluetoothDevice p0, int p1);
        public void onPresetSelectionForGroupFailed(int p0, int p1);
        public void onPresetInfoChanged(android.bluetooth.BluetoothDevice p0, java.util.List<android.bluetooth.BluetoothHapPresetInfo> p1, int p2);
        public void onSetPresetNameFailed(android.bluetooth.BluetoothDevice p0, int p1);
        public void onSetPresetNameForGroupFailed(int p0, int p1);
    }
}
