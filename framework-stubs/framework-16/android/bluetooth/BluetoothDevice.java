package android.bluetooth;

public final class BluetoothDevice implements android.os.Parcelable {
    public static final int ACCESS_ALLOWED = 1;
    public static final int ACCESS_REJECTED = 2;
    public static final int ACCESS_UNKNOWN = 0;
    public static final java.lang.String ACTION_ACL_CONNECTED = "android.bluetooth.device.action.ACL_CONNECTED";
    public static final java.lang.String ACTION_ACL_DISCONNECTED = "android.bluetooth.device.action.ACL_DISCONNECTED";
    public static final java.lang.String ACTION_ACL_DISCONNECT_REQUESTED = "android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED";
    public static final java.lang.String ACTION_ALIAS_CHANGED = "android.bluetooth.device.action.ALIAS_CHANGED";
    public static final java.lang.String ACTION_BATTERY_LEVEL_CHANGED = "android.bluetooth.device.action.BATTERY_LEVEL_CHANGED";
    public static final java.lang.String ACTION_BOND_STATE_CHANGED = "android.bluetooth.device.action.BOND_STATE_CHANGED";
    public static final java.lang.String ACTION_CLASS_CHANGED = "android.bluetooth.device.action.CLASS_CHANGED";
    public static final java.lang.String ACTION_CONNECTION_ACCESS_CANCEL = "android.bluetooth.device.action.CONNECTION_ACCESS_CANCEL";
    public static final java.lang.String ACTION_CONNECTION_ACCESS_REPLY = "android.bluetooth.device.action.CONNECTION_ACCESS_REPLY";
    public static final java.lang.String ACTION_CONNECTION_ACCESS_REQUEST = "android.bluetooth.device.action.CONNECTION_ACCESS_REQUEST";
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.encryption_change_broadcast")
    public static final java.lang.String ACTION_ENCRYPTION_CHANGE = "android.bluetooth.device.action.ENCRYPTION_CHANGE";
    public static final java.lang.String ACTION_FOUND = "android.bluetooth.device.action.FOUND";
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.key_missing_public")
    public static final java.lang.String ACTION_KEY_MISSING = "android.bluetooth.device.action.KEY_MISSING";
    public static final java.lang.String ACTION_NAME_CHANGED = "android.bluetooth.device.action.NAME_CHANGED";
    public static final java.lang.String ACTION_PAIRING_CANCEL = "android.bluetooth.device.action.PAIRING_CANCEL";
    public static final java.lang.String ACTION_PAIRING_REQUEST = "android.bluetooth.device.action.PAIRING_REQUEST";
    public static final java.lang.String ACTION_SILENCE_MODE_CHANGED = "android.bluetooth.device.action.SILENCE_MODE_CHANGED";
    public static final java.lang.String ACTION_SWITCH_BUFFER_SIZE = "android.bluetooth.device.action.SWITCH_BUFFER_SIZE";
    public static final java.lang.String ACTION_UUID = "android.bluetooth.device.action.UUID";
    public static final int ACTIVE_AUDIO_DEVICE_POLICY_ALL_PROFILES_ACTIVE_UPON_CONNECTION = 1;
    public static final int ACTIVE_AUDIO_DEVICE_POLICY_ALL_PROFILES_INACTIVE_UPON_CONNECTION = 2;
    public static final int ACTIVE_AUDIO_DEVICE_POLICY_DEFAULT = 0;
    public static final int ADDRESS_TYPE_ANONYMOUS = 255;
    public static final int ADDRESS_TYPE_PUBLIC = 0;
    public static final int ADDRESS_TYPE_RANDOM = 1;
    public static final int ADDRESS_TYPE_UNKNOWN = 65535;
    public static final int BATTERY_LEVEL_BLUETOOTH_OFF = -100;
    public static final int BATTERY_LEVEL_UNKNOWN = -1;
    public static final int BOND_BONDED = 12;
    public static final int BOND_BONDING = 11;
    public static final int BOND_NONE = 10;
    public static final int CONNECTION_ACCESS_NO = 2;
    public static final int CONNECTION_ACCESS_YES = 1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothDevice> CREATOR = null;
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.support_metadata_device_types_apis")
    public static final java.lang.String DEVICE_TYPE_CARKIT = "Carkit";
    public static final int DEVICE_TYPE_CLASSIC = 1;
    public static final java.lang.String DEVICE_TYPE_DEFAULT = "Default";
    public static final int DEVICE_TYPE_DUAL = 3;
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.support_metadata_device_types_apis")
    public static final java.lang.String DEVICE_TYPE_HEADSET = "Headset";
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.support_metadata_device_types_apis")
    public static final java.lang.String DEVICE_TYPE_HEARING_AID = "HearingAid";
    public static final int DEVICE_TYPE_LE = 2;
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.support_metadata_device_types_apis")
    public static final java.lang.String DEVICE_TYPE_SPEAKER = "Speaker";
    public static final java.lang.String DEVICE_TYPE_STYLUS = "Stylus";
    public static final int DEVICE_TYPE_UNKNOWN = 0;
    public static final java.lang.String DEVICE_TYPE_UNTETHERED_HEADSET = "Untethered Headset";
    public static final java.lang.String DEVICE_TYPE_WATCH = "Watch";
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.encryption_change_broadcast")
    public static final int ENCRYPTION_ALGORITHM_AES = 2;
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.encryption_change_broadcast")
    public static final int ENCRYPTION_ALGORITHM_E0 = 1;
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.encryption_change_broadcast")
    public static final int ENCRYPTION_ALGORITHM_NONE = 0;
    public static final int ERROR = -2147483648;
    public static final java.lang.String EXTRA_ACCESS_REQUEST_TYPE = "android.bluetooth.device.extra.ACCESS_REQUEST_TYPE";
    public static final java.lang.String EXTRA_ALWAYS_ALLOWED = "android.bluetooth.device.extra.ALWAYS_ALLOWED";
    public static final java.lang.String EXTRA_BATTERY_LEVEL = "android.bluetooth.device.extra.BATTERY_LEVEL";
    public static final java.lang.String EXTRA_BOND_STATE = "android.bluetooth.device.extra.BOND_STATE";
    public static final java.lang.String EXTRA_CLASS = "android.bluetooth.device.extra.CLASS";
    public static final java.lang.String EXTRA_CONNECTION_ACCESS_RESULT = "android.bluetooth.device.extra.CONNECTION_ACCESS_RESULT";
    public static final java.lang.String EXTRA_DEVICE = "android.bluetooth.device.extra.DEVICE";
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.get_svc_uuids_from_ble_adv_data")
    public static final java.lang.String EXTRA_DISCOVERY_RESULT_TYPE = "android.bluetooth.device.extra.DISCOVERY_RESULT_TYPE";
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.encryption_change_broadcast")
    public static final java.lang.String EXTRA_ENCRYPTION_ALGORITHM = "android.bluetooth.device.extra.EXTRA_ENCRYPTION_ALGORITHM";
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.encryption_change_broadcast")
    public static final java.lang.String EXTRA_ENCRYPTION_ENABLED = "android.bluetooth.device.extra.ENCRYPTION_ENABLED";
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.encryption_change_broadcast")
    public static final java.lang.String EXTRA_ENCRYPTION_STATUS = "android.bluetooth.device.extra.ENCRYPTION_STATUS";
    public static final java.lang.String EXTRA_IS_COORDINATED_SET_MEMBER = "android.bluetooth.extra.IS_COORDINATED_SET_MEMBER";
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.encryption_change_broadcast")
    public static final java.lang.String EXTRA_KEY_SIZE = "android.bluetooth.device.extra.KEY_SIZE";
    public static final java.lang.String EXTRA_LOW_LATENCY_BUFFER_SIZE = "android.bluetooth.device.extra.LOW_LATENCY_BUFFER_SIZE";
    public static final java.lang.String EXTRA_NAME = "android.bluetooth.device.extra.NAME";
    public static final java.lang.String EXTRA_PAIRING_INITIATOR = "android.bluetooth.device.extra.PAIRING_INITIATOR";
    public static final int EXTRA_PAIRING_INITIATOR_BACKGROUND = 2;
    public static final int EXTRA_PAIRING_INITIATOR_FOREGROUND = 1;
    public static final java.lang.String EXTRA_PAIRING_KEY = "android.bluetooth.device.extra.PAIRING_KEY";
    public static final java.lang.String EXTRA_PAIRING_VARIANT = "android.bluetooth.device.extra.PAIRING_VARIANT";
    public static final java.lang.String EXTRA_PREVIOUS_BOND_STATE = "android.bluetooth.device.extra.PREVIOUS_BOND_STATE";
    public static final java.lang.String EXTRA_RSSI = "android.bluetooth.device.extra.RSSI";
    public static final java.lang.String EXTRA_TRANSPORT = "android.bluetooth.device.extra.TRANSPORT";
    public static final java.lang.String EXTRA_UNBOND_REASON = "android.bluetooth.device.extra.REASON";
    public static final java.lang.String EXTRA_UUID = "android.bluetooth.device.extra.UUID";
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.get_svc_uuids_from_ble_adv_data")
    public static final java.lang.String EXTRA_UUID_LE = "android.bluetooth.device.extra.UUID_LE";
    public static final int METADATA_COMPANION_APP = 4;
    public static final int METADATA_DEVICE_TYPE = 17;
    public static final int METADATA_ENHANCED_SETTINGS_UI_URI = 16;
    public static final int METADATA_EXCLUSIVE_MANAGER = 29;
    public static final int METADATA_HARDWARE_VERSION = 3;
    public static final int METADATA_IS_UNTETHERED_HEADSET = 6;
    public static final int METADATA_LE_AUDIO = 26;
    public static final int METADATA_MAIN_BATTERY = 18;
    public static final int METADATA_MAIN_CHARGING = 19;
    public static final int METADATA_MAIN_ICON = 5;
    public static final int METADATA_MAIN_LOW_BATTERY_THRESHOLD = 20;
    public static final int METADATA_MANUFACTURER_NAME = 0;
    public static final int METADATA_MAX_LENGTH = 2048;
    public static final int METADATA_MODEL_NAME = 1;
    public static final int METADATA_SOFTWARE_VERSION = 2;
    public static final int METADATA_UNTETHERED_CASE_BATTERY = 12;
    public static final int METADATA_UNTETHERED_CASE_CHARGING = 15;
    public static final int METADATA_UNTETHERED_CASE_ICON = 9;
    public static final int METADATA_UNTETHERED_CASE_LOW_BATTERY_THRESHOLD = 23;
    public static final int METADATA_UNTETHERED_LEFT_BATTERY = 10;
    public static final int METADATA_UNTETHERED_LEFT_CHARGING = 13;
    public static final int METADATA_UNTETHERED_LEFT_ICON = 7;
    public static final int METADATA_UNTETHERED_LEFT_LOW_BATTERY_THRESHOLD = 21;
    public static final int METADATA_UNTETHERED_RIGHT_BATTERY = 11;
    public static final int METADATA_UNTETHERED_RIGHT_CHARGING = 14;
    public static final int METADATA_UNTETHERED_RIGHT_ICON = 8;
    public static final int METADATA_UNTETHERED_RIGHT_LOW_BATTERY_THRESHOLD = 22;
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.support_zoomed_in_icon_metadata")
    public static final int METADATA_ZOOMED_IN_ICON = 30;
    public static final int PAIRING_VARIANT_CONSENT = 3;
    public static final int PAIRING_VARIANT_DISPLAY_PASSKEY = 4;
    public static final int PAIRING_VARIANT_DISPLAY_PIN = 5;
    public static final int PAIRING_VARIANT_OOB_CONSENT = 6;
    public static final int PAIRING_VARIANT_PASSKEY = 1;
    public static final int PAIRING_VARIANT_PASSKEY_CONFIRMATION = 2;
    public static final int PAIRING_VARIANT_PIN = 0;
    public static final int PAIRING_VARIANT_PIN_16_DIGITS = 7;
    public static final int PHY_LE_1M = 1;
    public static final int PHY_LE_1M_MASK = 1;
    public static final int PHY_LE_2M = 2;
    public static final int PHY_LE_2M_MASK = 2;
    public static final int PHY_LE_CODED = 3;
    public static final int PHY_LE_CODED_MASK = 4;
    public static final int PHY_OPTION_NO_PREFERRED = 0;
    public static final int PHY_OPTION_S2 = 1;
    public static final int PHY_OPTION_S8 = 2;
    public static final int REQUEST_TYPE_MESSAGE_ACCESS = 3;
    public static final int REQUEST_TYPE_PHONEBOOK_ACCESS = 2;
    public static final int REQUEST_TYPE_PROFILE_CONNECTION = 1;
    public static final int REQUEST_TYPE_SIM_ACCESS = 4;
    public static final int TRANSPORT_AUTO = 0;
    public static final int TRANSPORT_BREDR = 1;
    public static final int TRANSPORT_LE = 2;
    public static final int UNBOND_REASON_AUTH_CANCELED = 3;
    public static final int UNBOND_REASON_AUTH_FAILED = 1;
    public static final int UNBOND_REASON_AUTH_REJECTED = 2;
    public static final int UNBOND_REASON_AUTH_TIMEOUT = 6;
    public static final int UNBOND_REASON_DISCOVERY_IN_PROGRESS = 5;
    public static final int UNBOND_REASON_REMOTE_AUTH_CANCELED = 8;
    public static final int UNBOND_REASON_REMOTE_DEVICE_DOWN = 4;
    public static final int UNBOND_REASON_REMOVED = 9;
    public static final int UNBOND_REASON_REPEATED_ATTEMPTS = 7;
    BluetoothDevice() {}
    public boolean canBondWithoutDialog() { return false; }
    public boolean cancelBondProcess() { return false; }
    public int connect() { return 0; }
    public android.bluetooth.BluetoothGatt connectGatt(android.content.Context p0, boolean p1, android.bluetooth.BluetoothGattCallback p2) { return null; }
    public android.bluetooth.BluetoothGatt connectGatt(android.content.Context p0, boolean p1, android.bluetooth.BluetoothGattCallback p2, int p3) { return null; }
    public android.bluetooth.BluetoothGatt connectGatt(android.content.Context p0, boolean p1, android.bluetooth.BluetoothGattCallback p2, int p3, int p4) { return null; }
    public android.bluetooth.BluetoothGatt connectGatt(android.content.Context p0, boolean p1, android.bluetooth.BluetoothGattCallback p2, int p3, int p4, android.os.Handler p5) { return null; }
    public boolean createBond() { return false; }
    public boolean createBond(int p0) { return false; }
    public boolean createBondOutOfBand(int p0, android.bluetooth.OobData p1, android.bluetooth.OobData p2) { return false; }
    @android.annotation.NonNull
    public android.bluetooth.BluetoothSocket createInsecureL2capChannel(int p0) throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothSocket createInsecureRfcommSocketToServiceRecord(java.util.UUID p0) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public android.bluetooth.BluetoothSocket createL2capChannel(int p0) throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothSocket createRfcommSocketToServiceRecord(java.util.UUID p0) throws java.io.IOException { return null; }
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.socket_settings_api")
    @android.annotation.NonNull
    public android.bluetooth.BluetoothSocket createUsingSocketSettings(android.bluetooth.BluetoothSocketSettings p0) throws java.io.IOException { return null; }
    public int describeContents() { return 0; }
    public int disconnect() { return 0; }
    public boolean fetchUuidsWithSdp() { return false; }
    public boolean fetchUuidsWithSdp(int p0) { return false; }
    public int getActiveAudioDevicePolicy() { return 0; }
    public java.lang.String getAddress() { return null; }
    public int getAddressType() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getAlias() { return null; }
    @android.annotation.NonNull
    public java.lang.String getAnonymizedAddress() { return null; }
    public int getBatteryLevel() { return 0; }
    public android.bluetooth.BluetoothClass getBluetoothClass() { return null; }
    public int getBondState() { return 0; }
    public int getConnectionHandle(int p0) { return 0; }
    @android.annotation.Nullable
    public java.lang.String getIdentityAddress() { return null; }
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.identity_address_type_api")
    @android.annotation.NonNull
    public android.bluetooth.BluetoothDevice.BluetoothAddress getIdentityAddressWithType() { return null; }
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.key_missing_count_api")
    public int getKeyMissingCount() { return 0; }
    public int getMessageAccessPermission() { return 0; }
    @android.annotation.Nullable
    public byte[] getMetadata(int p0) { return null; }
    public java.lang.String getName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPackageNameOfBondingApplication() { return null; }
    public int getPhonebookAccessPermission() { return 0; }
    @android.annotation.Nullable
    public android.bluetooth.BluetoothSinkAudioPolicy getRequestedAudioPolicyAsSink() { return null; }
    public int getSimAccessPermission() { return 0; }
    public int getType() { return 0; }
    public android.os.ParcelUuid[] getUuids() { return null; }
    public boolean isBondingInitiatedLocally() { return false; }
    public boolean isConnected() { return false; }
    public boolean isEncrypted() { return false; }
    public boolean isInSilenceMode() { return false; }
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.metadata_api_microphone_for_call_enabled")
    public boolean isMicrophonePreferredForCalls() { return false; }
    public int isRequestAudioPolicyAsSinkSupported() { return 0; }
    public void prepareToEnterProcess(android.content.AttributionSource p0) {}
    public boolean removeBond() { return false; }
    public int requestAudioPolicyAsSink(android.bluetooth.BluetoothSinkAudioPolicy p0) { return 0; }
    public int setActiveAudioDevicePolicy(int p0) { return 0; }
    public int setAlias(java.lang.String p0) { return 0; }
    public boolean setLowLatencyAudioAllowed(boolean p0) { return false; }
    public boolean setMessageAccessPermission(int p0) { return false; }
    public boolean setMetadata(int p0, byte[] p1) { return false; }
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.metadata_api_microphone_for_call_enabled")
    public int setMicrophonePreferredForCalls(boolean p0) { return 0; }
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.prioritized_in_ear_routing")
    public int setOnHead(boolean p0) { return 0; }
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.prioritized_in_ear_routing")
    public int setOnHeadDetectionEnabled(boolean p0) { return 0; }
    public boolean setPairingConfirmation(boolean p0) { return false; }
    public boolean setPhonebookAccessPermission(int p0) { return false; }
    public boolean setPin(byte[] p0) { return false; }
    public boolean setPin(java.lang.String p0) { return false; }
    public boolean setSilenceMode(boolean p0) { return false; }
    public boolean setSimAccessPermission(int p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.FlaggedApi("com.android.bluetooth.flags.identity_address_type_api")
    public static final class BluetoothAddress implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothDevice.BluetoothAddress> CREATOR = null;
        public BluetoothAddress(java.lang.String p0, int p1) {}
        public int describeContents() { return 0; }
        @android.annotation.Nullable
        public java.lang.String getAddress() { return null; }
        public int getAddressType() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
