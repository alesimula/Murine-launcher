package android.bluetooth;

public final class BluetoothDevice implements android.os.Parcelable {
    private static final java.lang.String TAG = "BluetoothDevice";
    private static final boolean DBG = false;
    private static final int CONNECTION_STATE_DISCONNECTED = 0;
    private static final int CONNECTION_STATE_CONNECTED = 1;
    private static final int CONNECTION_STATE_ENCRYPTED_BREDR = 2;
    private static final int CONNECTION_STATE_ENCRYPTED_LE = 4;
    public static final int ERROR = -2147483648;
    public static final java.lang.String ACTION_FOUND = "android.bluetooth.device.action.FOUND";
    public static final java.lang.String ACTION_CLASS_CHANGED = "android.bluetooth.device.action.CLASS_CHANGED";
    public static final java.lang.String ACTION_ACL_CONNECTED = "android.bluetooth.device.action.ACL_CONNECTED";
    public static final java.lang.String ACTION_ACL_DISCONNECT_REQUESTED = "android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED";
    public static final java.lang.String ACTION_ACL_DISCONNECTED = "android.bluetooth.device.action.ACL_DISCONNECTED";
    public static final java.lang.String ACTION_NAME_CHANGED = "android.bluetooth.device.action.NAME_CHANGED";
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String ACTION_ALIAS_CHANGED = "android.bluetooth.device.action.ALIAS_CHANGED";
    public static final java.lang.String ACTION_BOND_STATE_CHANGED = "android.bluetooth.device.action.BOND_STATE_CHANGED";
    public static final java.lang.String ACTION_BATTERY_LEVEL_CHANGED = "android.bluetooth.device.action.BATTERY_LEVEL_CHANGED";
    public static final java.lang.String EXTRA_BATTERY_LEVEL = "android.bluetooth.device.extra.BATTERY_LEVEL";
    public static final int BATTERY_LEVEL_UNKNOWN = -1;
    public static final int BATTERY_LEVEL_BLUETOOTH_OFF = -100;
    public static final java.lang.String EXTRA_DEVICE = "android.bluetooth.device.extra.DEVICE";
    public static final java.lang.String EXTRA_NAME = "android.bluetooth.device.extra.NAME";
    public static final java.lang.String EXTRA_RSSI = "android.bluetooth.device.extra.RSSI";
    public static final java.lang.String EXTRA_CLASS = "android.bluetooth.device.extra.CLASS";
    public static final java.lang.String EXTRA_BOND_STATE = "android.bluetooth.device.extra.BOND_STATE";
    public static final java.lang.String EXTRA_PREVIOUS_BOND_STATE = "android.bluetooth.device.extra.PREVIOUS_BOND_STATE";
    public static final int BOND_NONE = 10;
    public static final int BOND_BONDING = 11;
    public static final int BOND_BONDED = 12;
    public static final java.lang.String EXTRA_REASON = "android.bluetooth.device.extra.REASON";
    public static final java.lang.String EXTRA_PAIRING_VARIANT = "android.bluetooth.device.extra.PAIRING_VARIANT";
    public static final java.lang.String EXTRA_PAIRING_KEY = "android.bluetooth.device.extra.PAIRING_KEY";
    public static final int DEVICE_TYPE_UNKNOWN = 0;
    public static final int DEVICE_TYPE_CLASSIC = 1;
    public static final int DEVICE_TYPE_LE = 2;
    public static final int DEVICE_TYPE_DUAL = 3;
    public static final java.lang.String ACTION_SDP_RECORD = "android.bluetooth.device.action.SDP_RECORD";
    @android.annotation.SystemApi
    public static final int METADATA_MAX_LENGTH = 2048;
    @android.annotation.SystemApi
    public static final int METADATA_MANUFACTURER_NAME = 0;
    @android.annotation.SystemApi
    public static final int METADATA_MODEL_NAME = 1;
    @android.annotation.SystemApi
    public static final int METADATA_SOFTWARE_VERSION = 2;
    @android.annotation.SystemApi
    public static final int METADATA_HARDWARE_VERSION = 3;
    @android.annotation.SystemApi
    public static final int METADATA_COMPANION_APP = 4;
    @android.annotation.SystemApi
    public static final int METADATA_MAIN_ICON = 5;
    @android.annotation.SystemApi
    public static final int METADATA_IS_UNTETHERED_HEADSET = 6;
    @android.annotation.SystemApi
    public static final int METADATA_UNTETHERED_LEFT_ICON = 7;
    @android.annotation.SystemApi
    public static final int METADATA_UNTETHERED_RIGHT_ICON = 8;
    @android.annotation.SystemApi
    public static final int METADATA_UNTETHERED_CASE_ICON = 9;
    @android.annotation.SystemApi
    public static final int METADATA_UNTETHERED_LEFT_BATTERY = 10;
    @android.annotation.SystemApi
    public static final int METADATA_UNTETHERED_RIGHT_BATTERY = 11;
    @android.annotation.SystemApi
    public static final int METADATA_UNTETHERED_CASE_BATTERY = 12;
    @android.annotation.SystemApi
    public static final int METADATA_UNTETHERED_LEFT_CHARGING = 13;
    @android.annotation.SystemApi
    public static final int METADATA_UNTETHERED_RIGHT_CHARGING = 14;
    @android.annotation.SystemApi
    public static final int METADATA_UNTETHERED_CASE_CHARGING = 15;
    @android.annotation.SystemApi
    public static final int METADATA_ENHANCED_SETTINGS_UI_URI = 16;
    public static final java.lang.String ACTION_UUID = "android.bluetooth.device.action.UUID";
    public static final java.lang.String ACTION_MAS_INSTANCE = "android.bluetooth.device.action.MAS_INSTANCE";
    public static final java.lang.String ACTION_NAME_FAILED = "android.bluetooth.device.action.NAME_FAILED";
    public static final java.lang.String ACTION_PAIRING_REQUEST = "android.bluetooth.device.action.PAIRING_REQUEST";
    public static final java.lang.String ACTION_PAIRING_CANCEL = "android.bluetooth.device.action.PAIRING_CANCEL";
    public static final java.lang.String ACTION_CONNECTION_ACCESS_REQUEST = "android.bluetooth.device.action.CONNECTION_ACCESS_REQUEST";
    public static final java.lang.String ACTION_CONNECTION_ACCESS_REPLY = "android.bluetooth.device.action.CONNECTION_ACCESS_REPLY";
    public static final java.lang.String ACTION_CONNECTION_ACCESS_CANCEL = "android.bluetooth.device.action.CONNECTION_ACCESS_CANCEL";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_SILENCE_MODE_CHANGED = "android.bluetooth.device.action.SILENCE_MODE_CHANGED";
    public static final java.lang.String EXTRA_ACCESS_REQUEST_TYPE = "android.bluetooth.device.extra.ACCESS_REQUEST_TYPE";
    public static final int REQUEST_TYPE_PROFILE_CONNECTION = 1;
    public static final int REQUEST_TYPE_PHONEBOOK_ACCESS = 2;
    public static final int REQUEST_TYPE_MESSAGE_ACCESS = 3;
    public static final int REQUEST_TYPE_SIM_ACCESS = 4;
    public static final java.lang.String EXTRA_PACKAGE_NAME = "android.bluetooth.device.extra.PACKAGE_NAME";
    public static final java.lang.String EXTRA_CLASS_NAME = "android.bluetooth.device.extra.CLASS_NAME";
    public static final java.lang.String EXTRA_CONNECTION_ACCESS_RESULT = "android.bluetooth.device.extra.CONNECTION_ACCESS_RESULT";
    public static final int CONNECTION_ACCESS_YES = 1;
    public static final int CONNECTION_ACCESS_NO = 2;
    public static final java.lang.String EXTRA_ALWAYS_ALLOWED = "android.bluetooth.device.extra.ALWAYS_ALLOWED";
    public static final int BOND_SUCCESS = 0;
    public static final int UNBOND_REASON_AUTH_FAILED = 1;
    public static final int UNBOND_REASON_AUTH_REJECTED = 2;
    public static final int UNBOND_REASON_AUTH_CANCELED = 3;
    public static final int UNBOND_REASON_REMOTE_DEVICE_DOWN = 4;
    public static final int UNBOND_REASON_DISCOVERY_IN_PROGRESS = 5;
    public static final int UNBOND_REASON_AUTH_TIMEOUT = 6;
    public static final int UNBOND_REASON_REPEATED_ATTEMPTS = 7;
    public static final int UNBOND_REASON_REMOTE_AUTH_CANCELED = 8;
    public static final int UNBOND_REASON_REMOVED = 9;
    public static final int PAIRING_VARIANT_PIN = 0;
    public static final int PAIRING_VARIANT_PASSKEY = 1;
    public static final int PAIRING_VARIANT_PASSKEY_CONFIRMATION = 2;
    public static final int PAIRING_VARIANT_CONSENT = 3;
    public static final int PAIRING_VARIANT_DISPLAY_PASSKEY = 4;
    public static final int PAIRING_VARIANT_DISPLAY_PIN = 5;
    public static final int PAIRING_VARIANT_OOB_CONSENT = 6;
    public static final int PAIRING_VARIANT_PIN_16_DIGITS = 7;
    public static final java.lang.String EXTRA_UUID = "android.bluetooth.device.extra.UUID";
    public static final java.lang.String EXTRA_SDP_RECORD = "android.bluetooth.device.extra.SDP_RECORD";
    public static final java.lang.String EXTRA_SDP_SEARCH_STATUS = "android.bluetooth.device.extra.SDP_SEARCH_STATUS";
    @android.annotation.SystemApi
    public static final int ACCESS_UNKNOWN = 0;
    @android.annotation.SystemApi
    public static final int ACCESS_ALLOWED = 1;
    @android.annotation.SystemApi
    public static final int ACCESS_REJECTED = 2;
    public static final int TRANSPORT_AUTO = 0;
    public static final int TRANSPORT_BREDR = 1;
    public static final int TRANSPORT_LE = 2;
    public static final int PHY_LE_1M = 1;
    public static final int PHY_LE_2M = 2;
    public static final int PHY_LE_CODED = 3;
    public static final int PHY_LE_1M_MASK = 1;
    public static final int PHY_LE_2M_MASK = 2;
    public static final int PHY_LE_CODED_MASK = 4;
    public static final int PHY_OPTION_NO_PREFERRED = 0;
    public static final int PHY_OPTION_S2 = 1;
    public static final int PHY_OPTION_S8 = 2;
    public static final java.lang.String EXTRA_MAS_INSTANCE = "android.bluetooth.device.extra.MAS_INSTANCE";
    private static volatile android.bluetooth.IBluetooth sService;
    private final java.lang.String mAddress = null;
    static android.bluetooth.IBluetoothManagerCallback sStateChangeCallback;
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothDevice> CREATOR = null;
    private static final java.lang.String BLUETOOTH_BONDING_CACHE_PROPERTY = "cache_key.bluetooth.get_bond_state";
    private final android.app.PropertyInvalidatedCache<android.bluetooth.BluetoothDevice, java.lang.Integer> mBluetoothBondCache = null;
    static android.bluetooth.IBluetooth getService() { return null; }
    BluetoothDevice(java.lang.String p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String getAddress() { return null; }
    public java.lang.String getName() { return null; }
    public int getType() { return 0; }
    public java.lang.String getAlias() { return null; }
    public boolean setAlias(java.lang.String p0) { return false; }
    public int getBatteryLevel() { return 0; }
    public boolean createBond() { return false; }
    public boolean createBond(int p0) { return false; }
    public boolean createBondOutOfBand(int p0, android.bluetooth.OobData p1) { return false; }
    public boolean isBondingInitiatedLocally() { return false; }
    public boolean setDeviceOutOfBandData(byte[] p0, byte[] p1) { return false; }
    @android.annotation.SystemApi
    public boolean cancelBondProcess() { return false; }
    @android.annotation.SystemApi
    public boolean removeBond() { return false; }
    public void disableBluetoothGetBondStateCache() {}
    public static void invalidateBluetoothGetBondStateCache() {}
    public int getBondState() { return 0; }
    @android.annotation.SystemApi
    public boolean isConnected() { return false; }
    @android.annotation.SystemApi
    public boolean isEncrypted() { return false; }
    public android.bluetooth.BluetoothClass getBluetoothClass() { return null; }
    public android.os.ParcelUuid[] getUuids() { return null; }
    public boolean fetchUuidsWithSdp() { return false; }
    public boolean sdpSearch(android.os.ParcelUuid p0) { return false; }
    public boolean setPin(byte[] p0) { return false; }
    public boolean setPin(java.lang.String p0) { return false; }
    public boolean setPairingConfirmation(boolean p0) { return false; }
    public boolean cancelPairing() { return false; }
    boolean isBluetoothEnabled() { return false; }
    public int getPhonebookAccessPermission() { return 0; }
    @android.annotation.SystemApi
    public boolean setSilenceMode(boolean p0) { return false; }
    @android.annotation.SystemApi
    public boolean isInSilenceMode() { return false; }
    @android.annotation.SystemApi
    public boolean setPhonebookAccessPermission(int p0) { return false; }
    public int getMessageAccessPermission() { return 0; }
    @android.annotation.SystemApi
    public boolean setMessageAccessPermission(int p0) { return false; }
    @android.annotation.SystemApi
    public int getSimAccessPermission() { return 0; }
    @android.annotation.SystemApi
    public boolean setSimAccessPermission(int p0) { return false; }
    public android.bluetooth.BluetoothSocket createRfcommSocket(int p0) throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothSocket createL2capSocket(int p0) throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothSocket createInsecureL2capSocket(int p0) throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothSocket createRfcommSocketToServiceRecord(java.util.UUID p0) throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothSocket createInsecureRfcommSocketToServiceRecord(java.util.UUID p0) throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothSocket createInsecureRfcommSocket(int p0) throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothSocket createScoSocket() throws java.io.IOException { return null; }
    public static byte[] convertPinToBytes(java.lang.String p0) { return null; }
    public android.bluetooth.BluetoothGatt connectGatt(android.content.Context p0, boolean p1, android.bluetooth.BluetoothGattCallback p2) { return null; }
    public android.bluetooth.BluetoothGatt connectGatt(android.content.Context p0, boolean p1, android.bluetooth.BluetoothGattCallback p2, int p3) { return null; }
    public android.bluetooth.BluetoothGatt connectGatt(android.content.Context p0, boolean p1, android.bluetooth.BluetoothGattCallback p2, int p3, int p4) { return null; }
    public android.bluetooth.BluetoothGatt connectGatt(android.content.Context p0, boolean p1, android.bluetooth.BluetoothGattCallback p2, int p3, int p4, android.os.Handler p5) { return null; }
    public android.bluetooth.BluetoothGatt connectGatt(android.content.Context p0, boolean p1, android.bluetooth.BluetoothGattCallback p2, int p3, boolean p4, int p5, android.os.Handler p6) { return null; }
    public android.bluetooth.BluetoothSocket createL2capChannel(int p0) throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothSocket createInsecureL2capChannel(int p0) throws java.io.IOException { return null; }
    @android.annotation.SystemApi
    public boolean setMetadata(int p0, byte[] p1) { return false; }
    @android.annotation.SystemApi
    public byte[] getMetadata(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AccessPermission {
    }
}
