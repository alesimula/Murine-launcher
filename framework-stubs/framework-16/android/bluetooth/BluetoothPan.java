package android.bluetooth;

public final class BluetoothPan implements android.bluetooth.BluetoothProfile {
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.pan.profile.action.CONNECTION_STATE_CHANGED";
    public static final java.lang.String ACTION_TETHERING_STATE_CHANGED = "android.bluetooth.action.TETHERING_STATE_CHANGED";
    public static final java.lang.String EXTRA_LOCAL_ROLE = "android.bluetooth.pan.extra.LOCAL_ROLE";
    public static final java.lang.String EXTRA_TETHERING_STATE = "android.bluetooth.extra.TETHERING_STATE";
    public static final int LOCAL_NAP_ROLE = 1;
    public static final int LOCAL_PANU_ROLE = 2;
    public static final int PAN_ROLE_NONE = 0;
    public static final int REMOTE_NAP_ROLE = 1;
    public static final int REMOTE_PANU_ROLE = 2;
    public static final int TETHERING_STATE_OFF = 1;
    public static final int TETHERING_STATE_ON = 2;
    BluetoothPan() {}
    protected void finalize() {}
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    public boolean isTetheringOn() { return false; }
    @android.annotation.Nullable
    public android.net.TetheringManager.TetheredInterfaceRequest requestTetheredInterface(java.util.concurrent.Executor p0, android.net.TetheringManager.TetheredInterfaceCallback p1) { return null; }
    @java.lang.Deprecated
    public void setBluetoothTethering(boolean p0) {}
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
}
