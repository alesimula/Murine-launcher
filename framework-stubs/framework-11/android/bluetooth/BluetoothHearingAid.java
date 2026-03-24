package android.bluetooth;

public final class BluetoothHearingAid implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = "BluetoothHearingAid";
    private static final boolean DBG = true;
    private static final boolean VDBG = false;
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.hearingaid.profile.action.CONNECTION_STATE_CHANGED";
    public static final java.lang.String ACTION_ACTIVE_DEVICE_CHANGED = "android.bluetooth.hearingaid.profile.action.ACTIVE_DEVICE_CHANGED";
    public static final int SIDE_LEFT = 0;
    public static final int SIDE_RIGHT = 1;
    public static final int MODE_MONAURAL = 0;
    public static final int MODE_BINAURAL = 1;
    public static final long HI_SYNC_ID_INVALID = 0L;
    private android.bluetooth.BluetoothAdapter mAdapter;
    private final android.bluetooth.BluetoothProfileConnector<android.bluetooth.IBluetoothHearingAid> mProfileConnector = null;
    BluetoothHearingAid(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1) {}
    void close() {}
    private android.bluetooth.IBluetoothHearingAid getService() { return null; }
    public boolean connect(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) { return false; }
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0) { return false; }
    public java.util.List<android.bluetooth.BluetoothDevice> getActiveDevices() { return null; }
    public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    @android.annotation.SystemApi
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public int getPriority(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.SystemApi
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    public static java.lang.String stateToString(int p0) { return null; }
    public void setVolume(int p0) {}
    @android.annotation.SystemApi
    public long getHiSyncId(android.bluetooth.BluetoothDevice p0) { return 0L; }
    public int getDeviceSide(android.bluetooth.BluetoothDevice p0) { return 0; }
    public int getDeviceMode(android.bluetooth.BluetoothDevice p0) { return 0; }
    private boolean isEnabled() { return false; }
    private void verifyDeviceNotNull(android.bluetooth.BluetoothDevice p0, java.lang.String p1) {}
    private boolean isValidDevice(android.bluetooth.BluetoothDevice p0) { return false; }
    private static void log(java.lang.String p0) {}
}
