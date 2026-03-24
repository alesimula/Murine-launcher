package android.bluetooth;

public final class BluetoothHearingAid implements android.bluetooth.BluetoothProfile {
    public static final java.lang.String ACTION_ACTIVE_DEVICE_CHANGED = "android.bluetooth.hearingaid.profile.action.ACTIVE_DEVICE_CHANGED";
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.hearingaid.profile.action.CONNECTION_STATE_CHANGED";
    public static final long HI_SYNC_ID_INVALID = 0L;
    BluetoothHearingAid() {}
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    public void setVolume(int p0) {}
    public long getHiSyncId(android.bluetooth.BluetoothDevice p0) { return 0L; }
}
