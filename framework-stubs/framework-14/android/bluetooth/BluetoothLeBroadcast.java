package android.bluetooth;

public final class BluetoothLeBroadcast implements java.lang.AutoCloseable, android.bluetooth.BluetoothProfile {
    BluetoothLeBroadcast() {}
    protected void finalize() {}
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public void registerCallback(java.util.concurrent.Executor p0, android.bluetooth.BluetoothLeBroadcast.Callback p1) {}
    public void unregisterCallback(android.bluetooth.BluetoothLeBroadcast.Callback p0) {}
    public void startBroadcast(android.bluetooth.BluetoothLeAudioContentMetadata p0, byte[] p1) {}
    public void startBroadcast(android.bluetooth.BluetoothLeBroadcastSettings p0) {}
    public void updateBroadcast(int p0, android.bluetooth.BluetoothLeAudioContentMetadata p1) {}
    public void updateBroadcast(int p0, android.bluetooth.BluetoothLeBroadcastSettings p1) {}
    public void stopBroadcast(int p0) {}
    public boolean isPlaying(int p0) { return false; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothLeBroadcastMetadata> getAllBroadcastMetadata() { return null; }
    public int getMaximumNumberOfBroadcasts() { return 0; }
    public int getMaximumStreamsPerBroadcast() { return 0; }
    public int getMaximumSubgroupsPerBroadcast() { return 0; }
    public void close() {}

    public static interface Callback {
        public void onBroadcastStarted(int p0, int p1);
        public void onBroadcastStartFailed(int p0);
        public void onBroadcastStopped(int p0, int p1);
        public void onBroadcastStopFailed(int p0);
        public void onPlaybackStarted(int p0, int p1);
        public void onPlaybackStopped(int p0, int p1);
        public void onBroadcastUpdated(int p0, int p1);
        public void onBroadcastUpdateFailed(int p0, int p1);
        public void onBroadcastMetadataChanged(int p0, android.bluetooth.BluetoothLeBroadcastMetadata p1);
    }
}
