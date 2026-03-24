package android.bluetooth;

public final class BluetoothAdapter {
    private static final java.lang.String TAG = "BluetoothAdapter";
    private static final boolean DBG = true;
    private static final boolean VDBG = false;
    public static final java.lang.String DEFAULT_MAC_ADDRESS = "02:00:00:00:00:00";
    public static final int ERROR = -2147483648;
    public static final java.lang.String ACTION_STATE_CHANGED = "android.bluetooth.adapter.action.STATE_CHANGED";
    public static final java.lang.String EXTRA_STATE = "android.bluetooth.adapter.extra.STATE";
    public static final java.lang.String EXTRA_PREVIOUS_STATE = "android.bluetooth.adapter.extra.PREVIOUS_STATE";
    public static final int STATE_OFF = 10;
    public static final int STATE_TURNING_ON = 11;
    public static final int STATE_ON = 12;
    public static final int STATE_TURNING_OFF = 13;
    public static final int STATE_BLE_TURNING_ON = 14;
    public static final int STATE_BLE_ON = 15;
    public static final int STATE_BLE_TURNING_OFF = 16;
    public static final java.util.UUID LE_PSM_CHARACTERISTIC_UUID = null;
    public static final java.lang.String ACTION_REQUEST_DISCOVERABLE = "android.bluetooth.adapter.action.REQUEST_DISCOVERABLE";
    public static final java.lang.String EXTRA_DISCOVERABLE_DURATION = "android.bluetooth.adapter.extra.DISCOVERABLE_DURATION";
    public static final java.lang.String ACTION_REQUEST_ENABLE = "android.bluetooth.adapter.action.REQUEST_ENABLE";
    public static final java.lang.String ACTION_REQUEST_DISABLE = "android.bluetooth.adapter.action.REQUEST_DISABLE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_REQUEST_BLE_SCAN_ALWAYS_AVAILABLE = "android.bluetooth.adapter.action.REQUEST_BLE_SCAN_ALWAYS_AVAILABLE";
    public static final java.lang.String ACTION_SCAN_MODE_CHANGED = "android.bluetooth.adapter.action.SCAN_MODE_CHANGED";
    public static final java.lang.String EXTRA_SCAN_MODE = "android.bluetooth.adapter.extra.SCAN_MODE";
    public static final java.lang.String EXTRA_PREVIOUS_SCAN_MODE = "android.bluetooth.adapter.extra.PREVIOUS_SCAN_MODE";
    public static final int SCAN_MODE_NONE = 20;
    public static final int SCAN_MODE_CONNECTABLE = 21;
    public static final int SCAN_MODE_CONNECTABLE_DISCOVERABLE = 23;
    public static final int IO_CAPABILITY_OUT = 0;
    public static final int IO_CAPABILITY_IO = 1;
    public static final int IO_CAPABILITY_IN = 2;
    public static final int IO_CAPABILITY_NONE = 3;
    public static final int IO_CAPABILITY_KBDISP = 4;
    public static final int IO_CAPABILITY_MAX = 5;
    public static final int IO_CAPABILITY_UNKNOWN = 255;
    public static final java.lang.String ACTION_DISCOVERY_STARTED = "android.bluetooth.adapter.action.DISCOVERY_STARTED";
    public static final java.lang.String ACTION_DISCOVERY_FINISHED = "android.bluetooth.adapter.action.DISCOVERY_FINISHED";
    public static final java.lang.String ACTION_LOCAL_NAME_CHANGED = "android.bluetooth.adapter.action.LOCAL_NAME_CHANGED";
    public static final java.lang.String EXTRA_LOCAL_NAME = "android.bluetooth.adapter.extra.LOCAL_NAME";
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED";
    public static final java.lang.String EXTRA_CONNECTION_STATE = "android.bluetooth.adapter.extra.CONNECTION_STATE";
    public static final java.lang.String EXTRA_PREVIOUS_CONNECTION_STATE = "android.bluetooth.adapter.extra.PREVIOUS_CONNECTION_STATE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_BLE_STATE_CHANGED = "android.bluetooth.adapter.action.BLE_STATE_CHANGED";
    public static final java.lang.String ACTION_BLUETOOTH_ADDRESS_CHANGED = "android.bluetooth.adapter.action.BLUETOOTH_ADDRESS_CHANGED";
    public static final java.lang.String EXTRA_BLUETOOTH_ADDRESS = "android.bluetooth.adapter.extra.BLUETOOTH_ADDRESS";
    public static final java.lang.String ACTION_BLE_ACL_CONNECTED = "android.bluetooth.adapter.action.BLE_ACL_CONNECTED";
    public static final java.lang.String ACTION_BLE_ACL_DISCONNECTED = "android.bluetooth.adapter.action.BLE_ACL_DISCONNECTED";
    public static final int STATE_DISCONNECTED = 0;
    public static final int STATE_CONNECTING = 1;
    public static final int STATE_CONNECTED = 2;
    public static final int STATE_DISCONNECTING = 3;
    public static final java.lang.String BLUETOOTH_MANAGER_SERVICE = "bluetooth_manager";
    private final android.os.IBinder mToken = null;
    public static final int SOCKET_CHANNEL_AUTO_STATIC_NO_SDP = -2;
    private static final int ADDRESS_LENGTH = 17;
    private static android.bluetooth.BluetoothAdapter sAdapter;
    private static android.bluetooth.le.BluetoothLeScanner sBluetoothLeScanner;
    private static android.bluetooth.le.BluetoothLeAdvertiser sBluetoothLeAdvertiser;
    private static android.bluetooth.le.PeriodicAdvertisingManager sPeriodicAdvertisingManager;
    private final android.bluetooth.IBluetoothManager mManagerService = null;
    @android.annotation.UnsupportedAppUsage
    private android.bluetooth.IBluetooth mService;
    private android.content.Context mContext;
    private final java.util.concurrent.locks.ReentrantReadWriteLock mServiceLock = null;
    private final java.lang.Object mLock = null;
    private final java.util.Map<android.bluetooth.BluetoothAdapter.LeScanCallback, android.bluetooth.le.ScanCallback> mLeScanClients = null;
    private static final java.util.Map<android.bluetooth.BluetoothDevice, java.util.List<android.util.Pair<android.bluetooth.BluetoothAdapter.OnMetadataChangedListener, java.util.concurrent.Executor>>> sMetadataListeners = null;
    private static final android.bluetooth.IBluetoothMetadataListener sBluetoothMetadataListener = null;
    private final android.bluetooth.IBluetoothManagerCallback mManagerCallback = null;
    private final java.util.ArrayList<android.bluetooth.IBluetoothManagerCallback> mProxyServiceStateCallbacks = null;
    public static java.lang.String nameForState(int p0) { return null; }
    public static synchronized android.bluetooth.BluetoothAdapter getDefaultAdapter() { return null; }
    BluetoothAdapter(android.bluetooth.IBluetoothManager p0) {}
    public android.bluetooth.BluetoothDevice getRemoteDevice(java.lang.String p0) { return null; }
    public android.bluetooth.BluetoothDevice getRemoteDevice(byte[] p0) { return null; }
    public android.bluetooth.le.BluetoothLeAdvertiser getBluetoothLeAdvertiser() { return null; }
    public android.bluetooth.le.PeriodicAdvertisingManager getPeriodicAdvertisingManager() { return null; }
    public android.bluetooth.le.BluetoothLeScanner getBluetoothLeScanner() { return null; }
    public boolean isEnabled() { return false; }
    @android.annotation.SystemApi
    public boolean isLeEnabled() { return false; }
    @android.annotation.SystemApi
    public boolean disableBLE() { return false; }
    @android.annotation.SystemApi
    public boolean enableBLE() { return false; }
    public int getState() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getLeState() { return 0; }
    boolean getLeAccess() { return false; }
    public boolean enable() { return false; }
    public boolean disable() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean disable(boolean p0) { return false; }
    public java.lang.String getAddress() { return null; }
    public java.lang.String getName() { return null; }
    @android.annotation.UnsupportedAppUsage
    public boolean factoryReset() { return false; }
    @android.annotation.UnsupportedAppUsage
    public android.os.ParcelUuid[] getUuids() { return null; }
    public boolean setName(java.lang.String p0) { return false; }
    public android.bluetooth.BluetoothClass getBluetoothClass() { return null; }
    public boolean setBluetoothClass(android.bluetooth.BluetoothClass p0) { return false; }
    public int getIoCapability() { return 0; }
    public boolean setIoCapability(int p0) { return false; }
    public int getLeIoCapability() { return 0; }
    public boolean setLeIoCapability(int p0) { return false; }
    public int getScanMode() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public boolean setScanMode(int p0, int p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean setScanMode(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public int getDiscoverableTimeout() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setDiscoverableTimeout(int p0) {}
    public long getDiscoveryEndMillis() { return 0L; }
    public void setContext(android.content.Context p0) {}
    private java.lang.String getOpPackageName() { return null; }
    public boolean startDiscovery() { return false; }
    public boolean cancelDiscovery() { return false; }
    public boolean isDiscovering() { return false; }
    public boolean isMultipleAdvertisementSupported() { return false; }
    @android.annotation.SystemApi
    public boolean isBleScanAlwaysAvailable() { return false; }
    public boolean isOffloadedFilteringSupported() { return false; }
    public boolean isOffloadedScanBatchingSupported() { return false; }
    public boolean isLe2MPhySupported() { return false; }
    public boolean isLeCodedPhySupported() { return false; }
    public boolean isLeExtendedAdvertisingSupported() { return false; }
    public boolean isLePeriodicAdvertisingSupported() { return false; }
    public int getLeMaximumAdvertisingDataLength() { return 0; }
    private boolean isHearingAidProfileSupported() { return false; }
    public int getMaxConnectedAudioDevices() { return 0; }
    public boolean isHardwareTrackingFiltersAvailable() { return false; }
    @java.lang.Deprecated
    public android.bluetooth.BluetoothActivityEnergyInfo getControllerActivityEnergyInfo(int p0) { return null; }
    public void requestControllerActivityEnergyInfo(android.os.ResultReceiver p0) {}
    public java.util.Set<android.bluetooth.BluetoothDevice> getBondedDevices() { return null; }
    public java.util.List<java.lang.Integer> getSupportedProfiles() { return null; }
    @android.annotation.UnsupportedAppUsage
    public int getConnectionState() { return 0; }
    public int getProfileConnectionState(int p0) { return 0; }
    public android.bluetooth.BluetoothServerSocket listenUsingRfcommOn(int p0) throws java.io.IOException { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.bluetooth.BluetoothServerSocket listenUsingRfcommOn(int p0, boolean p1, boolean p2) throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothServerSocket listenUsingRfcommWithServiceRecord(java.lang.String p0, java.util.UUID p1) throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothServerSocket listenUsingInsecureRfcommWithServiceRecord(java.lang.String p0, java.util.UUID p1) throws java.io.IOException { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.bluetooth.BluetoothServerSocket listenUsingEncryptedRfcommWithServiceRecord(java.lang.String p0, java.util.UUID p1) throws java.io.IOException { return null; }
    private android.bluetooth.BluetoothServerSocket createNewRfcommSocketAndRecord(java.lang.String p0, java.util.UUID p1, boolean p2, boolean p3) throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothServerSocket listenUsingInsecureRfcommOn(int p0) throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothServerSocket listenUsingEncryptedRfcommOn(int p0) throws java.io.IOException { return null; }
    public static android.bluetooth.BluetoothServerSocket listenUsingScoOn() throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothServerSocket listenUsingL2capOn(int p0, boolean p1, boolean p2) throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothServerSocket listenUsingL2capOn(int p0) throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothServerSocket listenUsingInsecureL2capOn(int p0) throws java.io.IOException { return null; }
    public android.util.Pair<byte[], byte[]> readOutOfBandData() { return null; }
    public boolean getProfileProxy(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1, int p2) { return false; }
    public void closeProfileProxy(int p0, android.bluetooth.BluetoothProfile p1) {}
    @android.annotation.SystemApi
    public boolean enableNoAutoConnect() { return false; }
    public boolean changeApplicationBluetoothState(boolean p0, android.bluetooth.BluetoothAdapter.BluetoothStateChangeCallback p1) { return false; }
    private java.util.Set<android.bluetooth.BluetoothDevice> toDeviceSet(android.bluetooth.BluetoothDevice[] p0) { return null; }
    protected void finalize() throws java.lang.Throwable {}
    public static boolean checkBluetoothAddress(java.lang.String p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    android.bluetooth.IBluetoothManager getBluetoothManager() { return null; }
    @android.annotation.UnsupportedAppUsage
    android.bluetooth.IBluetooth getBluetoothService(android.bluetooth.IBluetoothManagerCallback p0) { return null; }
    void removeServiceStateCallback(android.bluetooth.IBluetoothManagerCallback p0) {}
    @java.lang.Deprecated
    public boolean startLeScan(android.bluetooth.BluetoothAdapter.LeScanCallback p0) { return false; }
    @java.lang.Deprecated
    public boolean startLeScan(java.util.UUID[] p0, android.bluetooth.BluetoothAdapter.LeScanCallback p1) { return false; }
    @java.lang.Deprecated
    public void stopLeScan(android.bluetooth.BluetoothAdapter.LeScanCallback p0) {}
    public android.bluetooth.BluetoothServerSocket listenUsingL2capChannel() throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothServerSocket listenUsingL2capCoc(int p0) throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothServerSocket listenUsingInsecureL2capChannel() throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothServerSocket listenUsingInsecureL2capCoc(int p0) throws java.io.IOException { return null; }
    @android.annotation.SystemApi
    public boolean addOnMetadataChangedListener(android.bluetooth.BluetoothDevice p0, java.util.concurrent.Executor p1, android.bluetooth.BluetoothAdapter.OnMetadataChangedListener p2) { return false; }
    @android.annotation.SystemApi
    public boolean removeOnMetadataChangedListener(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothAdapter.OnMetadataChangedListener p1) { return false; }

    public class StateChangeCallbackWrapper extends android.bluetooth.IBluetoothStateChangeCallback.Stub {
        private android.bluetooth.BluetoothAdapter.BluetoothStateChangeCallback mCallback;
        StateChangeCallbackWrapper(android.bluetooth.BluetoothAdapter p0, android.bluetooth.BluetoothAdapter.BluetoothStateChangeCallback p1) { super(); }
        public void onBluetoothStateChange(boolean p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScanMode {
    }

    @android.annotation.SystemApi
    public static interface OnMetadataChangedListener {
        public void onMetadataChanged(android.bluetooth.BluetoothDevice p0, int p1, byte[] p2);
    }

    public static interface LeScanCallback {
        public void onLeScan(android.bluetooth.BluetoothDevice p0, int p1, byte[] p2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IoCapability {
    }

    public static interface BluetoothStateChangeCallback {
        public void onBluetoothStateChange(boolean p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AdapterState {
    }
}
