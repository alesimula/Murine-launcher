package android.bluetooth;

public final class BluetoothCsipSetCoordinator implements android.bluetooth.BluetoothProfile, java.lang.AutoCloseable {
    public static final java.lang.String ACTION_CSIS_CONNECTION_STATE_CHANGED = "android.bluetooth.action.CSIS_CONNECTION_STATE_CHANGED";
    public static final java.lang.String ACTION_CSIS_DEVICE_AVAILABLE = "android.bluetooth.action.CSIS_DEVICE_AVAILABLE";
    public static final java.lang.String ACTION_CSIS_SET_MEMBER_AVAILABLE = "android.bluetooth.action.CSIS_SET_MEMBER_AVAILABLE";
    public static final java.lang.String EXTRA_CSIS_GROUP_ID = "android.bluetooth.extra.CSIS_GROUP_ID";
    public static final int GROUP_ID_INVALID = -1;
    BluetoothCsipSetCoordinator() {}
    protected void finalize() {}
    public void close() {}
    @android.annotation.Nullable
    public java.util.UUID lockGroup(int p0, java.util.concurrent.Executor p1, android.bluetooth.BluetoothCsipSetCoordinator.ClientLockCallback p2) { return null; }
    public boolean unlockGroup(java.util.UUID p0) { return false; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.Integer, android.os.ParcelUuid> getGroupUuidMapByDevice(android.bluetooth.BluetoothDevice p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getAllGroupIds(android.os.ParcelUuid p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }

    public static interface ClientLockCallback {
        public void onGroupLockSet(int p0, int p1, boolean p2);
    }
}
