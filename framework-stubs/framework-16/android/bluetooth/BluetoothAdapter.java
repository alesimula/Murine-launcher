package android.bluetooth;

public final class BluetoothAdapter {
    public static final java.lang.String ACTION_AUTO_ON_STATE_CHANGED = "android.bluetooth.action.AUTO_ON_STATE_CHANGED";
    public static final java.lang.String ACTION_BLE_STATE_CHANGED = "android.bluetooth.adapter.action.BLE_STATE_CHANGED";
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED";
    public static final java.lang.String ACTION_DISCOVERY_FINISHED = "android.bluetooth.adapter.action.DISCOVERY_FINISHED";
    public static final java.lang.String ACTION_DISCOVERY_STARTED = "android.bluetooth.adapter.action.DISCOVERY_STARTED";
    public static final java.lang.String ACTION_LOCAL_NAME_CHANGED = "android.bluetooth.adapter.action.LOCAL_NAME_CHANGED";
    public static final java.lang.String ACTION_REQUEST_BLE_SCAN_ALWAYS_AVAILABLE = "android.bluetooth.adapter.action.REQUEST_BLE_SCAN_ALWAYS_AVAILABLE";
    public static final java.lang.String ACTION_REQUEST_DISABLE = "android.bluetooth.adapter.action.REQUEST_DISABLE";
    public static final java.lang.String ACTION_REQUEST_DISCOVERABLE = "android.bluetooth.adapter.action.REQUEST_DISCOVERABLE";
    public static final java.lang.String ACTION_REQUEST_ENABLE = "android.bluetooth.adapter.action.REQUEST_ENABLE";
    public static final java.lang.String ACTION_SCAN_MODE_CHANGED = "android.bluetooth.adapter.action.SCAN_MODE_CHANGED";
    public static final java.lang.String ACTION_STATE_CHANGED = "android.bluetooth.adapter.action.STATE_CHANGED";
    public static final int ACTIVE_DEVICE_ALL = 2;
    public static final int ACTIVE_DEVICE_AUDIO = 0;
    public static final int ACTIVE_DEVICE_PHONE_CALL = 1;
    public static final java.lang.String AUDIO_MODE_DUPLEX = "audio_mode_duplex";
    public static final java.lang.String AUDIO_MODE_OUTPUT_ONLY = "audio_mode_output_only";
    public static final int AUTO_ON_STATE_DISABLED = 1;
    public static final int AUTO_ON_STATE_ENABLED = 2;
    public static final int BT_SNOOP_LOG_MODE_DISABLED = 0;
    public static final int BT_SNOOP_LOG_MODE_FILTERED = 1;
    public static final int BT_SNOOP_LOG_MODE_FULL = 2;
    public static final int ERROR = -2147483648;
    public static final java.lang.String EXTRA_AUTO_ON_STATE = "android.bluetooth.extra.AUTO_ON_STATE";
    public static final java.lang.String EXTRA_CONNECTION_STATE = "android.bluetooth.adapter.extra.CONNECTION_STATE";
    public static final java.lang.String EXTRA_DISCOVERABLE_DURATION = "android.bluetooth.adapter.extra.DISCOVERABLE_DURATION";
    public static final java.lang.String EXTRA_LOCAL_NAME = "android.bluetooth.adapter.extra.LOCAL_NAME";
    public static final java.lang.String EXTRA_PREVIOUS_CONNECTION_STATE = "android.bluetooth.adapter.extra.PREVIOUS_CONNECTION_STATE";
    public static final java.lang.String EXTRA_PREVIOUS_SCAN_MODE = "android.bluetooth.adapter.extra.PREVIOUS_SCAN_MODE";
    public static final java.lang.String EXTRA_PREVIOUS_STATE = "android.bluetooth.adapter.extra.PREVIOUS_STATE";
    public static final java.lang.String EXTRA_RFCOMM_LISTENER_ID = "android.bluetooth.adapter.extra.RFCOMM_LISTENER_ID";
    public static final java.lang.String EXTRA_SCAN_MODE = "android.bluetooth.adapter.extra.SCAN_MODE";
    public static final java.lang.String EXTRA_STATE = "android.bluetooth.adapter.extra.STATE";
    public static final int SCAN_MODE_CONNECTABLE = 21;
    public static final int SCAN_MODE_CONNECTABLE_DISCOVERABLE = 23;
    public static final int SCAN_MODE_NONE = 20;
    public static final int STATE_BLE_ON = 15;
    public static final int STATE_CONNECTED = 2;
    public static final int STATE_CONNECTING = 1;
    public static final int STATE_DISCONNECTED = 0;
    public static final int STATE_DISCONNECTING = 3;
    public static final int STATE_OFF = 10;
    public static final int STATE_ON = 12;
    public static final int STATE_TURNING_OFF = 13;
    public static final int STATE_TURNING_ON = 11;
    BluetoothAdapter() {}
    public boolean addOnMetadataChangedListener(android.bluetooth.BluetoothDevice p0, java.util.concurrent.Executor p1, android.bluetooth.BluetoothAdapter.OnMetadataChangedListener p2) { return false; }
    public boolean cancelDiscovery() { return false; }
    public static boolean checkBluetoothAddress(java.lang.String p0) { return false; }
    public boolean clearBluetooth() { return false; }
    public void closeProfileProxy(int p0, android.bluetooth.BluetoothProfile p1) {}
    @java.lang.Deprecated
    public boolean disable() { return false; }
    public boolean disable(boolean p0) { return false; }
    public boolean disableBLE() { return false; }
    @java.lang.Deprecated
    public boolean enable() { return false; }
    public boolean enableBLE() { return false; }
    public boolean enableNoAutoConnect() { return false; }
    public void generateLocalOobData(int p0, java.util.concurrent.Executor p1, android.bluetooth.BluetoothAdapter.OobDataCallback p2) {}
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getActiveDevices(int p0) { return null; }
    public java.lang.String getAddress() { return null; }
    public int getBluetoothHciSnoopLoggingMode() { return 0; }
    public android.bluetooth.le.BluetoothLeAdvertiser getBluetoothLeAdvertiser() { return null; }
    public android.bluetooth.le.BluetoothLeScanner getBluetoothLeScanner() { return null; }
    public java.util.Set<android.bluetooth.BluetoothDevice> getBondedDevices() { return null; }
    public int getConnectionState() { return 0; }
    @java.lang.Deprecated
    public static android.bluetooth.BluetoothAdapter getDefaultAdapter() { return null; }
    @android.annotation.Nullable
    public java.time.Duration getDiscoverableTimeout() { return null; }
    public long getDiscoveryEndMillis() { return 0L; }
    @android.annotation.Nullable
    public android.bluetooth.le.DistanceMeasurementManager getDistanceMeasurementManager() { return null; }
    public int getLeMaximumAdvertisingDataLength() { return 0; }
    public int getMaxConnectedAudioDevices() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothDevice> getMostRecentlyConnectedDevices() { return null; }
    public java.lang.String getName() { return null; }
    public int getOffloadedTransportDiscoveryDataScanSupported() { return 0; }
    @android.annotation.NonNull
    public android.os.Bundle getPreferredAudioProfiles(android.bluetooth.BluetoothDevice p0) { return null; }
    public int getProfileConnectionState(int p0) { return 0; }
    public boolean getProfileProxy(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1, int p2) { return false; }
    public android.bluetooth.BluetoothDevice getRemoteDevice(byte[] p0) { return null; }
    public android.bluetooth.BluetoothDevice getRemoteDevice(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public android.bluetooth.BluetoothDevice getRemoteLeDevice(java.lang.String p0, int p1) { return null; }
    public int getScanMode() { return 0; }
    public int getState() { return 0; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getSupportedProfiles() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.os.ParcelUuid> getUuidsList() { return null; }
    public boolean isAutoOnEnabled() { return false; }
    public boolean isAutoOnSupported() { return false; }
    public boolean isBleScanAlwaysAvailable() { return false; }
    public boolean isDiscovering() { return false; }
    public int isDistanceMeasurementSupported() { return 0; }
    public boolean isEnabled() { return false; }
    public boolean isLe2MPhySupported() { return false; }
    public int isLeAudioBroadcastAssistantSupported() { return 0; }
    public int isLeAudioBroadcastSourceSupported() { return 0; }
    public int isLeAudioSupported() { return 0; }
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.socket_settings_api")
    public boolean isLeCocSocketOffloadSupported() { return false; }
    public boolean isLeCodedPhySupported() { return false; }
    public boolean isLeEnabled() { return false; }
    public boolean isLeExtendedAdvertisingSupported() { return false; }
    public boolean isLePeriodicAdvertisingSupported() { return false; }
    public boolean isMultipleAdvertisementSupported() { return false; }
    public boolean isOffloadedFilteringSupported() { return false; }
    public boolean isOffloadedScanBatchingSupported() { return false; }
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.socket_settings_api")
    public boolean isRfcommSocketOffloadSupported() { return false; }
    @android.annotation.NonNull
    public android.bluetooth.BluetoothServerSocket listenUsingInsecureL2capChannel() throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothServerSocket listenUsingInsecureRfcommWithServiceRecord(java.lang.String p0, java.util.UUID p1) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public android.bluetooth.BluetoothServerSocket listenUsingL2capChannel() throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothServerSocket listenUsingRfcommWithServiceRecord(java.lang.String p0, java.util.UUID p1) throws java.io.IOException { return null; }
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.socket_settings_api")
    @android.annotation.NonNull
    public android.bluetooth.BluetoothServerSocket listenUsingSocketSettings(android.bluetooth.BluetoothSocketSettings p0) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public static java.lang.String nameForState(int p0) { return null; }
    public int notifyActiveDeviceChangeApplied(android.bluetooth.BluetoothDevice p0) { return 0; }
    public boolean registerBluetoothConnectionCallback(java.util.concurrent.Executor p0, android.bluetooth.BluetoothAdapter.BluetoothConnectionCallback p1) { return false; }
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.hci_vendor_specific_extension")
    public void registerBluetoothHciVendorSpecificCallback(java.util.Set<java.lang.Integer> p0, java.util.concurrent.Executor p1, android.bluetooth.BluetoothAdapter.BluetoothHciVendorSpecificCallback p2) {}
    public int registerBluetoothQualityReportReadyCallback(java.util.concurrent.Executor p0, android.bluetooth.BluetoothAdapter.BluetoothQualityReportReadyCallback p1) { return 0; }
    public int registerPreferredAudioProfilesChangedCallback(java.util.concurrent.Executor p0, android.bluetooth.BluetoothAdapter.PreferredAudioProfilesChangedCallback p1) { return 0; }
    public boolean removeActiveDevice(int p0) { return false; }
    public boolean removeOnMetadataChangedListener(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothAdapter.OnMetadataChangedListener p1) { return false; }
    public void requestControllerActivityEnergyInfo(java.util.concurrent.Executor p0, android.bluetooth.BluetoothAdapter.OnBluetoothActivityEnergyInfoCallback p1) {}
    @android.annotation.NonNull
    public android.bluetooth.BluetoothSocket retrieveConnectedRfcommSocket(java.util.UUID p0) { return null; }
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.hci_vendor_specific_extension")
    public void sendBluetoothHciVendorSpecificCommand(int p0, byte[] p1) {}
    public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public void setAutoOnEnabled(boolean p0) {}
    public int setBluetoothHciSnoopLoggingMode(int p0) { return 0; }
    public int setDiscoverableTimeout(java.time.Duration p0) { return 0; }
    public boolean setName(java.lang.String p0) { return false; }
    public int setPreferredAudioProfiles(android.bluetooth.BluetoothDevice p0, android.os.Bundle p1) { return 0; }
    public int setScanMode(int p0) { return 0; }
    public boolean startDiscovery() { return false; }
    @java.lang.Deprecated
    public boolean startLeScan(android.bluetooth.BluetoothAdapter.LeScanCallback p0) { return false; }
    @java.lang.Deprecated
    public boolean startLeScan(java.util.UUID[] p0, android.bluetooth.BluetoothAdapter.LeScanCallback p1) { return false; }
    public int startRfcommServer(java.lang.String p0, java.util.UUID p1, android.app.PendingIntent p2) { return 0; }
    @java.lang.Deprecated
    public void stopLeScan(android.bluetooth.BluetoothAdapter.LeScanCallback p0) {}
    public int stopRfcommServer(java.util.UUID p0) { return 0; }
    public boolean unregisterBluetoothConnectionCallback(android.bluetooth.BluetoothAdapter.BluetoothConnectionCallback p0) { return false; }
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.hci_vendor_specific_extension")
    public void unregisterBluetoothHciVendorSpecificCallback(android.bluetooth.BluetoothAdapter.BluetoothHciVendorSpecificCallback p0) {}
    public int unregisterBluetoothQualityReportReadyCallback(android.bluetooth.BluetoothAdapter.BluetoothQualityReportReadyCallback p0) { return 0; }
    public int unregisterPreferredAudioProfilesChangedCallback(android.bluetooth.BluetoothAdapter.PreferredAudioProfilesChangedCallback p0) { return 0; }

    public static abstract class BluetoothConnectionCallback {
        public BluetoothConnectionCallback() {}
        @android.annotation.NonNull
        public static java.lang.String disconnectReasonToString(int p0) { return null; }
        public void onDeviceConnected(android.bluetooth.BluetoothDevice p0) {}
        public void onDeviceDisconnected(android.bluetooth.BluetoothDevice p0, int p1) {}
    }

    @android.annotation.FlaggedApi("com.android.bluetooth.flags.hci_vendor_specific_extension")
    public static interface BluetoothHciVendorSpecificCallback {
        public void onCommandComplete(int p0, byte[] p1);
        public void onCommandStatus(int p0, int p1);
        public void onEvent(int p0, byte[] p1);
    }

    public static interface BluetoothQualityReportReadyCallback {
        public void onBluetoothQualityReportReady(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothQualityReport p1, int p2);
    }

    public static interface LeScanCallback {
        public void onLeScan(android.bluetooth.BluetoothDevice p0, int p1, byte[] p2);
    }

    public static interface OnBluetoothActivityEnergyInfoCallback {
        public void onBluetoothActivityEnergyInfoAvailable(android.bluetooth.BluetoothActivityEnergyInfo p0);
        public void onBluetoothActivityEnergyInfoError(int p0);
    }

    public static interface OnMetadataChangedListener {
        public void onMetadataChanged(android.bluetooth.BluetoothDevice p0, int p1, byte[] p2);
    }

    public static interface OobDataCallback {
        public void onError(int p0);
        public void onOobData(int p0, android.bluetooth.OobData p1);
    }

    public static interface PreferredAudioProfilesChangedCallback {
        public void onPreferredAudioProfilesChanged(android.bluetooth.BluetoothDevice p0, android.os.Bundle p1, int p2);
    }
}
