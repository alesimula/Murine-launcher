package android.bluetooth;

public final class BluetoothLeBroadcastAssistant implements android.bluetooth.BluetoothProfile, java.lang.AutoCloseable {
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.action.CONNECTION_STATE_CHANGED";
    BluetoothLeBroadcastAssistant() {}
    protected void finalize() {}
    public void close() {}
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    public void registerCallback(java.util.concurrent.Executor p0, android.bluetooth.BluetoothLeBroadcastAssistant.Callback p1) {}
    public void unregisterCallback(android.bluetooth.BluetoothLeBroadcastAssistant.Callback p0) {}
    public void startSearchingForSources(java.util.List<android.bluetooth.le.ScanFilter> p0) {}
    public void stopSearchingForSources() {}
    public boolean isSearchInProgress() { return false; }
    public void addSource(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothLeBroadcastMetadata p1, boolean p2) {}
    public void modifySource(android.bluetooth.BluetoothDevice p0, int p1, android.bluetooth.BluetoothLeBroadcastMetadata p2) {}
    public void removeSource(android.bluetooth.BluetoothDevice p0, int p1) {}
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothLeBroadcastReceiveState> getAllSources(android.bluetooth.BluetoothDevice p0) { return null; }
    public int getMaximumSourceCapacity(android.bluetooth.BluetoothDevice p0) { return 0; }

    public static interface Callback {
        public void onSearchStarted(int p0);
        public void onSearchStartFailed(int p0);
        public void onSearchStopped(int p0);
        public void onSearchStopFailed(int p0);
        public void onSourceFound(android.bluetooth.BluetoothLeBroadcastMetadata p0);
        public void onSourceAdded(android.bluetooth.BluetoothDevice p0, int p1, int p2);
        public void onSourceAddFailed(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothLeBroadcastMetadata p1, int p2);
        public void onSourceModified(android.bluetooth.BluetoothDevice p0, int p1, int p2);
        public void onSourceModifyFailed(android.bluetooth.BluetoothDevice p0, int p1, int p2);
        public void onSourceRemoved(android.bluetooth.BluetoothDevice p0, int p1, int p2);
        public void onSourceRemoveFailed(android.bluetooth.BluetoothDevice p0, int p1, int p2);
        public void onReceiveStateChanged(android.bluetooth.BluetoothDevice p0, int p1, android.bluetooth.BluetoothLeBroadcastReceiveState p2);
    }
}
