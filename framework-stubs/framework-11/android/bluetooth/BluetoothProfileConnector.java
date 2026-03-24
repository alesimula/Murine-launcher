package android.bluetooth;

public abstract class BluetoothProfileConnector<T extends java.lang.Object> {
    private final int mProfileId = 0;
    private android.bluetooth.BluetoothProfile.ServiceListener mServiceListener;
    private final android.bluetooth.BluetoothProfile mProfileProxy = null;
    private android.content.Context mContext;
    private final java.lang.String mProfileName = null;
    private final java.lang.String mServiceName = null;
    private volatile T mService;
    private final android.bluetooth.IBluetoothStateChangeCallback mBluetoothStateChangeCallback = null;
    private final android.content.ServiceConnection mConnection = null;
    BluetoothProfileConnector(android.bluetooth.BluetoothProfile p0, int p1, java.lang.String p2, java.lang.String p3) {}
    private boolean doBind() { return false; }
    private void doUnbind() {}
    void connect(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1) {}
    void disconnect() {}
    T getService() { return null; }
    public abstract T getServiceInterface(android.os.IBinder p0);
    private void logDebug(java.lang.String p0) {}
    private void logError(java.lang.String p0) {}
}
