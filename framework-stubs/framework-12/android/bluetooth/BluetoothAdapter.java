package android.bluetooth;

public final class BluetoothAdapter {
    private static final java.lang.String TAG = "BluetoothAdapter";
    private static final java.lang.String DESCRIPTOR = "android.bluetooth.BluetoothAdapter";
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
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_ADVERTISE")
    public static final java.lang.String ACTION_REQUEST_DISCOVERABLE = "android.bluetooth.adapter.action.REQUEST_DISCOVERABLE";
    public static final java.lang.String EXTRA_DISCOVERABLE_DURATION = "android.bluetooth.adapter.extra.DISCOVERABLE_DURATION";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_REQUEST_ENABLE = "android.bluetooth.adapter.action.REQUEST_ENABLE";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_REQUEST_DISABLE = "android.bluetooth.adapter.action.REQUEST_DISABLE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_REQUEST_BLE_SCAN_ALWAYS_AVAILABLE = "android.bluetooth.adapter.action.REQUEST_BLE_SCAN_ALWAYS_AVAILABLE";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
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
    @android.annotation.SystemApi
    public static final int ACTIVE_DEVICE_AUDIO = 0;
    @android.annotation.SystemApi
    public static final int ACTIVE_DEVICE_PHONE_CALL = 1;
    @android.annotation.SystemApi
    public static final int ACTIVE_DEVICE_ALL = 2;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public static final java.lang.String ACTION_DISCOVERY_STARTED = "android.bluetooth.adapter.action.DISCOVERY_STARTED";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public static final java.lang.String ACTION_DISCOVERY_FINISHED = "android.bluetooth.adapter.action.DISCOVERY_FINISHED";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_LOCAL_NAME_CHANGED = "android.bluetooth.adapter.action.LOCAL_NAME_CHANGED";
    public static final java.lang.String EXTRA_LOCAL_NAME = "android.bluetooth.adapter.extra.LOCAL_NAME";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED";
    public static final java.lang.String EXTRA_CONNECTION_STATE = "android.bluetooth.adapter.extra.CONNECTION_STATE";
    public static final java.lang.String EXTRA_PREVIOUS_CONNECTION_STATE = "android.bluetooth.adapter.extra.PREVIOUS_CONNECTION_STATE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_BLE_STATE_CHANGED = "android.bluetooth.adapter.action.BLE_STATE_CHANGED";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_BLUETOOTH_ADDRESS_CHANGED = "android.bluetooth.adapter.action.BLUETOOTH_ADDRESS_CHANGED";
    public static final java.lang.String EXTRA_BLUETOOTH_ADDRESS = "android.bluetooth.adapter.extra.BLUETOOTH_ADDRESS";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_BLE_ACL_CONNECTED = "android.bluetooth.adapter.action.BLE_ACL_CONNECTED";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
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
    private android.bluetooth.le.BluetoothLeScanner mBluetoothLeScanner;
    private android.bluetooth.le.BluetoothLeAdvertiser mBluetoothLeAdvertiser;
    private android.bluetooth.le.PeriodicAdvertisingManager mPeriodicAdvertisingManager;
    private final android.bluetooth.IBluetoothManager mManagerService = null;
    private final android.content.AttributionSource mAttributionSource = null;
    private android.bluetooth.IBluetooth mService;
    private final java.util.concurrent.locks.ReentrantReadWriteLock mServiceLock = null;
    private static boolean sServiceRegistered;
    private static android.bluetooth.IBluetooth sService;
    private static final java.lang.Object sServiceLock = null;
    private final java.lang.Object mLock = null;
    private final java.util.Map<android.bluetooth.BluetoothAdapter.LeScanCallback, android.bluetooth.le.ScanCallback> mLeScanClients = null;
    private final java.util.Map<android.bluetooth.BluetoothDevice, java.util.List<android.util.Pair<android.bluetooth.BluetoothAdapter.OnMetadataChangedListener, java.util.concurrent.Executor>>> mMetadataListeners = null;
    private final java.util.Map<android.bluetooth.BluetoothAdapter.BluetoothConnectionCallback, java.util.concurrent.Executor> mBluetoothConnectionCallbackExecutorMap = null;
    @android.annotation.SuppressLint("AndroidFrameworkBluetoothPermission")
    private final android.bluetooth.IBluetoothMetadataListener mBluetoothMetadataListener = null;
    private static final java.lang.String BLUETOOTH_GET_STATE_CACHE_PROPERTY = "cache_key.bluetooth.get_state";
    private final android.app.PropertyInvalidatedCache<java.lang.Void, java.lang.Integer> mBluetoothGetStateCache = null;
    private static final java.lang.String BLUETOOTH_FILTERING_CACHE_PROPERTY = "cache_key.bluetooth.is_offloaded_filtering_supported";
    private final android.app.PropertyInvalidatedCache<java.lang.Void, java.lang.Boolean> mBluetoothFilteringCache = null;
    private static final java.lang.String BLUETOOTH_GET_ADAPTER_CONNECTION_STATE_CACHE_PROPERTY = "cache_key.bluetooth.get_adapter_connection_state";
    private final android.app.PropertyInvalidatedCache<java.lang.Void, java.lang.Integer> mBluetoothGetAdapterConnectionStateCache = null;
    private static final java.lang.String BLUETOOTH_PROFILE_CACHE_PROPERTY = "cache_key.bluetooth.get_profile_connection_state";
    private final android.app.PropertyInvalidatedCache<java.lang.Integer, java.lang.Integer> mGetProfileConnectionStateCache = null;
    private static final android.bluetooth.IBluetoothManagerCallback sManagerCallback = null;
    private final android.bluetooth.IBluetoothManagerCallback mManagerCallback = null;
    private static final java.util.WeakHashMap<android.bluetooth.IBluetoothManagerCallback, java.lang.Void> sProxyServiceStateCallbacks = null;
    @android.annotation.SuppressLint("AndroidFrameworkBluetoothPermission")
    private final android.bluetooth.IBluetoothConnectionCallback mConnectionCallback = null;
    public static java.lang.String nameForState(int p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresNoPermission
    public static synchronized android.bluetooth.BluetoothAdapter getDefaultAdapter() { return null; }
    public static android.bluetooth.BluetoothAdapter createAdapter(android.content.AttributionSource p0) { return null; }
    BluetoothAdapter(android.bluetooth.IBluetoothManager p0, android.content.AttributionSource p1) {}
    @android.annotation.RequiresNoPermission
    public android.bluetooth.BluetoothDevice getRemoteDevice(java.lang.String p0) { return null; }
    @android.annotation.RequiresNoPermission
    public android.bluetooth.BluetoothDevice getRemoteDevice(byte[] p0) { return null; }
    @android.annotation.RequiresNoPermission
    public android.bluetooth.le.BluetoothLeAdvertiser getBluetoothLeAdvertiser() { return null; }
    @android.annotation.RequiresNoPermission
    public android.bluetooth.le.PeriodicAdvertisingManager getPeriodicAdvertisingManager() { return null; }
    @android.annotation.RequiresNoPermission
    public android.bluetooth.le.BluetoothLeScanner getBluetoothLeScanner() { return null; }
    @android.annotation.RequiresNoPermission
    public boolean isEnabled() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresNoPermission
    public boolean isLeEnabled() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean disableBLE() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean enableBLE() { return false; }
    @android.annotation.RequiresNoPermission
    public void disableBluetoothGetStateCache() {}
    public static void invalidateBluetoothGetStateCache() {}
    private int getStateInternal() { return 0; }
    @android.annotation.RequiresNoPermission
    public int getState() { return 0; }
    @android.annotation.RequiresNoPermission
    public int getLeState() { return 0; }
    boolean getLeAccess() { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean enable() { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean disable() { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean disable(boolean p0) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.LOCAL_MAC_ADDRESS"})
    public java.lang.String getAddress() { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.lang.String getName() { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_ADVERTISE")
    public int getNameLengthForAdvertise() { return 0; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean factoryReset() { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.os.ParcelUuid[] getUuids() { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean setName(java.lang.String p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothClass getBluetoothClass() { return null; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setBluetoothClass(android.bluetooth.BluetoothClass p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getIoCapability() { return 0; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setIoCapability(int p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getLeIoCapability() { return 0; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setLeIoCapability(int p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public int getScanMode() { return 0; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public boolean setScanMode(int p0, long p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public boolean setScanMode(int p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public int getDiscoverableTimeout() { return 0; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public void setDiscoverableTimeout(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public long getDiscoveryEndMillis() { return 0L; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public boolean startDiscovery() { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public boolean cancelDiscovery() { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public boolean isDiscovering() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED", "android.permission.MODIFY_PHONE_STATE"})
    public boolean removeActiveDevice(int p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED", "android.permission.MODIFY_PHONE_STATE"})
    public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED", "android.permission.MODIFY_PHONE_STATE"})
    public boolean connectAllEnabledProfiles(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean disconnectAllEnabledProfiles(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresNoPermission
    public boolean isMultipleAdvertisementSupported() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresNoPermission
    public boolean isBleScanAlwaysAvailable() { return false; }
    @android.annotation.RequiresNoPermission
    public void disableIsOffloadedFilteringSupportedCache() {}
    public static void invalidateIsOffloadedFilteringSupportedCache() {}
    @android.annotation.RequiresNoPermission
    public boolean isOffloadedFilteringSupported() { return false; }
    @android.annotation.RequiresNoPermission
    public boolean isOffloadedScanBatchingSupported() { return false; }
    @android.annotation.RequiresNoPermission
    public boolean isLe2MPhySupported() { return false; }
    @android.annotation.RequiresNoPermission
    public boolean isLeCodedPhySupported() { return false; }
    @android.annotation.RequiresNoPermission
    public boolean isLeExtendedAdvertisingSupported() { return false; }
    @android.annotation.RequiresNoPermission
    public boolean isLePeriodicAdvertisingSupported() { return false; }
    @android.annotation.RequiresNoPermission
    public int getLeMaximumAdvertisingDataLength() { return 0; }
    @android.annotation.RequiresNoPermission
    private boolean isHearingAidProfileSupported() { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getMaxConnectedAudioDevices() { return 0; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean isHardwareTrackingFiltersAvailable() { return false; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public android.bluetooth.BluetoothActivityEnergyInfo getControllerActivityEnergyInfo(int p0) { return null; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public void requestControllerActivityEnergyInfo(android.os.ResultReceiver p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getMostRecentlyConnectedDevices() { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.Set<android.bluetooth.BluetoothDevice> getBondedDevices() { return null; }
    @android.annotation.RequiresNoPermission
    public java.util.List<java.lang.Integer> getSupportedProfiles() { return null; }
    @android.annotation.RequiresNoPermission
    public void disableGetAdapterConnectionStateCache() {}
    public static void invalidateGetAdapterConnectionStateCache() {}
    @android.annotation.RequiresNoPermission
    public int getConnectionState() { return 0; }
    @android.annotation.RequiresNoPermission
    public void disableGetProfileConnectionStateCache() {}
    public static void invalidateGetProfileConnectionStateCache() {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
    public int getProfileConnectionState(int p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothServerSocket listenUsingRfcommOn(int p0) throws java.io.IOException { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothServerSocket listenUsingRfcommOn(int p0, boolean p1, boolean p2) throws java.io.IOException { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothServerSocket listenUsingRfcommWithServiceRecord(java.lang.String p0, java.util.UUID p1) throws java.io.IOException { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothServerSocket listenUsingInsecureRfcommWithServiceRecord(java.lang.String p0, java.util.UUID p1) throws java.io.IOException { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothServerSocket listenUsingEncryptedRfcommWithServiceRecord(java.lang.String p0, java.util.UUID p1) throws java.io.IOException { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    private android.bluetooth.BluetoothServerSocket createNewRfcommSocketAndRecord(java.lang.String p0, java.util.UUID p1, boolean p2, boolean p3) throws java.io.IOException { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothServerSocket listenUsingInsecureRfcommOn(int p0) throws java.io.IOException { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothServerSocket listenUsingL2capOn(int p0, boolean p1, boolean p2) throws java.io.IOException { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothServerSocket listenUsingL2capOn(int p0) throws java.io.IOException { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothServerSocket listenUsingInsecureL2capOn(int p0) throws java.io.IOException { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
    public android.util.Pair<byte[], byte[]> readOutOfBandData() { return null; }
    @android.annotation.SuppressLint({"AndroidFrameworkRequiresPermission", "AndroidFrameworkBluetoothPermission"})
    public boolean getProfileProxy(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1, int p2) { return false; }
    @android.annotation.SuppressLint({"AndroidFrameworkRequiresPermission", "AndroidFrameworkBluetoothPermission"})
    public void closeProfileProxy(int p0, android.bluetooth.BluetoothProfile p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean enableNoAutoConnect() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public void generateLocalOobData(int p0, java.util.concurrent.Executor p1, android.bluetooth.BluetoothAdapter.OobDataCallback p2) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
    public boolean changeApplicationBluetoothState(boolean p0, android.bluetooth.BluetoothAdapter.BluetoothStateChangeCallback p1) { return false; }
    private java.util.Set<android.bluetooth.BluetoothDevice> toDeviceSet(java.util.List<android.bluetooth.BluetoothDevice> p0) { return null; }
    protected void finalize() throws java.lang.Throwable {}
    public static boolean checkBluetoothAddress(java.lang.String p0) { return false; }
    public static boolean isAddressRandomStatic(java.lang.String p0) { return false; }
    @android.annotation.RequiresNoPermission
    public android.bluetooth.IBluetoothManager getBluetoothManager() { return null; }
    @android.annotation.RequiresNoPermission
    public android.content.AttributionSource getAttributionSource() { return null; }
    android.bluetooth.IBluetooth getBluetoothService() { return null; }
    android.bluetooth.IBluetooth getBluetoothService(android.bluetooth.IBluetoothManagerCallback p0) { return null; }
    void removeServiceStateCallback(android.bluetooth.IBluetoothManagerCallback p0) {}
    private void registerOrUnregisterAdapterLocked() {}
    public boolean registerServiceLifecycleCallback(android.bluetooth.BluetoothAdapter.ServiceLifecycleCallback p0) { return false; }
    public void unregisterServiceLifecycleCallback(android.bluetooth.BluetoothAdapter.ServiceLifecycleCallback p0) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public boolean startLeScan(android.bluetooth.BluetoothAdapter.LeScanCallback p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public boolean startLeScan(java.util.UUID[] p0, android.bluetooth.BluetoothAdapter.LeScanCallback p1) { return false; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public void stopLeScan(android.bluetooth.BluetoothAdapter.LeScanCallback p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothServerSocket listenUsingL2capChannel() throws java.io.IOException { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothServerSocket listenUsingInsecureL2capChannel() throws java.io.IOException { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean addOnMetadataChangedListener(android.bluetooth.BluetoothDevice p0, java.util.concurrent.Executor p1, android.bluetooth.BluetoothAdapter.OnMetadataChangedListener p2) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean removeOnMetadataChangedListener(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothAdapter.OnMetadataChangedListener p1) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean registerBluetoothConnectionCallback(java.util.concurrent.Executor p0, android.bluetooth.BluetoothAdapter.BluetoothConnectionCallback p1) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean unregisterBluetoothConnectionCallback(android.bluetooth.BluetoothAdapter.BluetoothConnectionCallback p0) { return false; }
    public static int priorityToConnectionPolicy(int p0) { return 0; }
    public static int connectionPolicyToPriority(int p0) { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ActiveDeviceUse {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AdapterState {
    }

    public static abstract class BluetoothConnectionCallback {
        public BluetoothConnectionCallback() {}
        public void onDeviceConnected(android.bluetooth.BluetoothDevice p0) {}
        public void onDeviceDisconnected(android.bluetooth.BluetoothDevice p0, int p1) {}
        public static java.lang.String disconnectReasonText(int p0) { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface DisconnectReason {
        }
    }

    public static interface BluetoothStateChangeCallback {
        public void onBluetoothStateChange(boolean p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IoCapability {
    }

    public static interface LeScanCallback {
        public void onLeScan(android.bluetooth.BluetoothDevice p0, int p1, byte[] p2);
    }

    @android.annotation.SystemApi
    public static interface OnMetadataChangedListener {
        public void onMetadataChanged(android.bluetooth.BluetoothDevice p0, int p1, byte[] p2);
    }

    @android.annotation.SystemApi
    public static interface OobDataCallback {
        public void onOobData(int p0, android.bluetooth.OobData p1);
        public void onError(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OobError {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScanMode {
    }

    public static abstract class ServiceLifecycleCallback {
        android.bluetooth.IBluetoothManagerCallback mRemote;
        public ServiceLifecycleCallback() {}
        public abstract void onBluetoothServiceUp();
        public abstract void onBluetoothServiceDown();
    }

    public class StateChangeCallbackWrapper extends android.bluetooth.IBluetoothStateChangeCallback.Stub {
        private android.bluetooth.BluetoothAdapter.BluetoothStateChangeCallback mCallback;
        StateChangeCallbackWrapper(android.bluetooth.BluetoothAdapter p0, android.bluetooth.BluetoothAdapter.BluetoothStateChangeCallback p1) { super(); }
        public void onBluetoothStateChange(boolean p0) {}
    }

    public class WrappedOobDataCallback extends android.bluetooth.IBluetoothOobDataCallback.Stub {
        private final android.bluetooth.BluetoothAdapter.OobDataCallback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        WrappedOobDataCallback(android.bluetooth.BluetoothAdapter p0, android.bluetooth.BluetoothAdapter.OobDataCallback p1, java.util.concurrent.Executor p2) { super(); }
        public void onOobData(int p0, android.bluetooth.OobData p1) {}
        public void onError(int p0) {}
    }
}
