package android.bluetooth;

public interface IBluetooth extends android.os.IInterface {
    public boolean isEnabled() throws android.os.RemoteException;
    public int getState() throws android.os.RemoteException;
    public boolean enable() throws android.os.RemoteException;
    public boolean enableNoAutoConnect() throws android.os.RemoteException;
    public boolean disable() throws android.os.RemoteException;
    public java.lang.String getAddress() throws android.os.RemoteException;
    public android.os.ParcelUuid[] getUuids() throws android.os.RemoteException;
    public boolean setName(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getName() throws android.os.RemoteException;
    public android.bluetooth.BluetoothClass getBluetoothClass() throws android.os.RemoteException;
    public boolean setBluetoothClass(android.bluetooth.BluetoothClass p0) throws android.os.RemoteException;
    public int getIoCapability() throws android.os.RemoteException;
    public boolean setIoCapability(int p0) throws android.os.RemoteException;
    public int getLeIoCapability() throws android.os.RemoteException;
    public boolean setLeIoCapability(int p0) throws android.os.RemoteException;
    public int getScanMode() throws android.os.RemoteException;
    public boolean setScanMode(int p0, int p1) throws android.os.RemoteException;
    public int getDiscoverableTimeout() throws android.os.RemoteException;
    public boolean setDiscoverableTimeout(int p0) throws android.os.RemoteException;
    public boolean startDiscovery(java.lang.String p0) throws android.os.RemoteException;
    public boolean cancelDiscovery() throws android.os.RemoteException;
    public boolean isDiscovering() throws android.os.RemoteException;
    public long getDiscoveryEndMillis() throws android.os.RemoteException;
    public int getAdapterConnectionState() throws android.os.RemoteException;
    public int getProfileConnectionState(int p0) throws android.os.RemoteException;
    public android.bluetooth.BluetoothDevice[] getBondedDevices() throws android.os.RemoteException;
    public boolean createBond(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException;
    public boolean createBondOutOfBand(android.bluetooth.BluetoothDevice p0, int p1, android.bluetooth.OobData p2) throws android.os.RemoteException;
    public boolean cancelBondProcess(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean removeBond(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public int getBondState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean isBondingInitiatedLocally(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public long getSupportedProfiles() throws android.os.RemoteException;
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public java.lang.String getRemoteName(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public int getRemoteType(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public java.lang.String getRemoteAlias(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean setRemoteAlias(android.bluetooth.BluetoothDevice p0, java.lang.String p1) throws android.os.RemoteException;
    public int getRemoteClass(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public android.os.ParcelUuid[] getRemoteUuids(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean fetchRemoteUuids(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean sdpSearch(android.bluetooth.BluetoothDevice p0, android.os.ParcelUuid p1) throws android.os.RemoteException;
    public int getBatteryLevel(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public int getMaxConnectedAudioDevices() throws android.os.RemoteException;
    public boolean setPin(android.bluetooth.BluetoothDevice p0, boolean p1, int p2, byte[] p3) throws android.os.RemoteException;
    public boolean setPasskey(android.bluetooth.BluetoothDevice p0, boolean p1, int p2, byte[] p3) throws android.os.RemoteException;
    public boolean setPairingConfirmation(android.bluetooth.BluetoothDevice p0, boolean p1) throws android.os.RemoteException;
    public int getPhonebookAccessPermission(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean setSilenceMode(android.bluetooth.BluetoothDevice p0, boolean p1) throws android.os.RemoteException;
    public boolean getSilenceMode(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean setPhonebookAccessPermission(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException;
    public int getMessageAccessPermission(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean setMessageAccessPermission(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException;
    public int getSimAccessPermission(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean setSimAccessPermission(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException;
    public void sendConnectionStateChange(android.bluetooth.BluetoothDevice p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void registerCallback(android.bluetooth.IBluetoothCallback p0) throws android.os.RemoteException;
    public void unregisterCallback(android.bluetooth.IBluetoothCallback p0) throws android.os.RemoteException;
    public android.bluetooth.IBluetoothSocketManager getSocketManager() throws android.os.RemoteException;
    public boolean factoryReset() throws android.os.RemoteException;
    public boolean isMultiAdvertisementSupported() throws android.os.RemoteException;
    public boolean isOffloadedFilteringSupported() throws android.os.RemoteException;
    public boolean isOffloadedScanBatchingSupported() throws android.os.RemoteException;
    public boolean isActivityAndEnergyReportingSupported() throws android.os.RemoteException;
    public boolean isLe2MPhySupported() throws android.os.RemoteException;
    public boolean isLeCodedPhySupported() throws android.os.RemoteException;
    public boolean isLeExtendedAdvertisingSupported() throws android.os.RemoteException;
    public boolean isLePeriodicAdvertisingSupported() throws android.os.RemoteException;
    public int getLeMaximumAdvertisingDataLength() throws android.os.RemoteException;
    public android.bluetooth.BluetoothActivityEnergyInfo reportActivityInfo() throws android.os.RemoteException;
    public boolean registerMetadataListener(android.bluetooth.IBluetoothMetadataListener p0, android.bluetooth.BluetoothDevice p1) throws android.os.RemoteException;
    public boolean unregisterMetadataListener(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean setMetadata(android.bluetooth.BluetoothDevice p0, int p1, byte[] p2) throws android.os.RemoteException;
    public byte[] getMetadata(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException;
    public void requestActivityInfo(android.os.ResultReceiver p0) throws android.os.RemoteException;
    public void onLeServiceUp() throws android.os.RemoteException;
    public void onBrEdrDown() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetooth {
        private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetooth";
        static final int TRANSACTION_isEnabled = 1;
        static final int TRANSACTION_getState = 2;
        static final int TRANSACTION_enable = 3;
        static final int TRANSACTION_enableNoAutoConnect = 4;
        static final int TRANSACTION_disable = 5;
        static final int TRANSACTION_getAddress = 6;
        static final int TRANSACTION_getUuids = 7;
        static final int TRANSACTION_setName = 8;
        static final int TRANSACTION_getName = 9;
        static final int TRANSACTION_getBluetoothClass = 10;
        static final int TRANSACTION_setBluetoothClass = 11;
        static final int TRANSACTION_getIoCapability = 12;
        static final int TRANSACTION_setIoCapability = 13;
        static final int TRANSACTION_getLeIoCapability = 14;
        static final int TRANSACTION_setLeIoCapability = 15;
        static final int TRANSACTION_getScanMode = 16;
        static final int TRANSACTION_setScanMode = 17;
        static final int TRANSACTION_getDiscoverableTimeout = 18;
        static final int TRANSACTION_setDiscoverableTimeout = 19;
        static final int TRANSACTION_startDiscovery = 20;
        static final int TRANSACTION_cancelDiscovery = 21;
        static final int TRANSACTION_isDiscovering = 22;
        static final int TRANSACTION_getDiscoveryEndMillis = 23;
        static final int TRANSACTION_getAdapterConnectionState = 24;
        static final int TRANSACTION_getProfileConnectionState = 25;
        static final int TRANSACTION_getBondedDevices = 26;
        static final int TRANSACTION_createBond = 27;
        static final int TRANSACTION_createBondOutOfBand = 28;
        static final int TRANSACTION_cancelBondProcess = 29;
        static final int TRANSACTION_removeBond = 30;
        static final int TRANSACTION_getBondState = 31;
        static final int TRANSACTION_isBondingInitiatedLocally = 32;
        static final int TRANSACTION_getSupportedProfiles = 33;
        static final int TRANSACTION_getConnectionState = 34;
        static final int TRANSACTION_getRemoteName = 35;
        static final int TRANSACTION_getRemoteType = 36;
        static final int TRANSACTION_getRemoteAlias = 37;
        static final int TRANSACTION_setRemoteAlias = 38;
        static final int TRANSACTION_getRemoteClass = 39;
        static final int TRANSACTION_getRemoteUuids = 40;
        static final int TRANSACTION_fetchRemoteUuids = 41;
        static final int TRANSACTION_sdpSearch = 42;
        static final int TRANSACTION_getBatteryLevel = 43;
        static final int TRANSACTION_getMaxConnectedAudioDevices = 44;
        static final int TRANSACTION_setPin = 45;
        static final int TRANSACTION_setPasskey = 46;
        static final int TRANSACTION_setPairingConfirmation = 47;
        static final int TRANSACTION_getPhonebookAccessPermission = 48;
        static final int TRANSACTION_setSilenceMode = 49;
        static final int TRANSACTION_getSilenceMode = 50;
        static final int TRANSACTION_setPhonebookAccessPermission = 51;
        static final int TRANSACTION_getMessageAccessPermission = 52;
        static final int TRANSACTION_setMessageAccessPermission = 53;
        static final int TRANSACTION_getSimAccessPermission = 54;
        static final int TRANSACTION_setSimAccessPermission = 55;
        static final int TRANSACTION_sendConnectionStateChange = 56;
        static final int TRANSACTION_registerCallback = 57;
        static final int TRANSACTION_unregisterCallback = 58;
        static final int TRANSACTION_getSocketManager = 59;
        static final int TRANSACTION_factoryReset = 60;
        static final int TRANSACTION_isMultiAdvertisementSupported = 61;
        static final int TRANSACTION_isOffloadedFilteringSupported = 62;
        static final int TRANSACTION_isOffloadedScanBatchingSupported = 63;
        static final int TRANSACTION_isActivityAndEnergyReportingSupported = 64;
        static final int TRANSACTION_isLe2MPhySupported = 65;
        static final int TRANSACTION_isLeCodedPhySupported = 66;
        static final int TRANSACTION_isLeExtendedAdvertisingSupported = 67;
        static final int TRANSACTION_isLePeriodicAdvertisingSupported = 68;
        static final int TRANSACTION_getLeMaximumAdvertisingDataLength = 69;
        static final int TRANSACTION_reportActivityInfo = 70;
        static final int TRANSACTION_registerMetadataListener = 71;
        static final int TRANSACTION_unregisterMetadataListener = 72;
        static final int TRANSACTION_setMetadata = 73;
        static final int TRANSACTION_getMetadata = 74;
        static final int TRANSACTION_requestActivityInfo = 75;
        static final int TRANSACTION_onLeServiceUp = 76;
        static final int TRANSACTION_onBrEdrDown = 77;
        public Stub() { super(); }
        public static android.bluetooth.IBluetooth asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetooth p0) { return false; }
        public static android.bluetooth.IBluetooth getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetooth {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetooth sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isEnabled() throws android.os.RemoteException { return false; }
            public int getState() throws android.os.RemoteException { return 0; }
            public boolean enable() throws android.os.RemoteException { return false; }
            public boolean enableNoAutoConnect() throws android.os.RemoteException { return false; }
            public boolean disable() throws android.os.RemoteException { return false; }
            public java.lang.String getAddress() throws android.os.RemoteException { return null; }
            public android.os.ParcelUuid[] getUuids() throws android.os.RemoteException { return null; }
            public boolean setName(java.lang.String p0) throws android.os.RemoteException { return false; }
            public java.lang.String getName() throws android.os.RemoteException { return null; }
            public android.bluetooth.BluetoothClass getBluetoothClass() throws android.os.RemoteException { return null; }
            public boolean setBluetoothClass(android.bluetooth.BluetoothClass p0) throws android.os.RemoteException { return false; }
            public int getIoCapability() throws android.os.RemoteException { return 0; }
            public boolean setIoCapability(int p0) throws android.os.RemoteException { return false; }
            public int getLeIoCapability() throws android.os.RemoteException { return 0; }
            public boolean setLeIoCapability(int p0) throws android.os.RemoteException { return false; }
            public int getScanMode() throws android.os.RemoteException { return 0; }
            public boolean setScanMode(int p0, int p1) throws android.os.RemoteException { return false; }
            public int getDiscoverableTimeout() throws android.os.RemoteException { return 0; }
            public boolean setDiscoverableTimeout(int p0) throws android.os.RemoteException { return false; }
            public boolean startDiscovery(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean cancelDiscovery() throws android.os.RemoteException { return false; }
            public boolean isDiscovering() throws android.os.RemoteException { return false; }
            public long getDiscoveryEndMillis() throws android.os.RemoteException { return 0L; }
            public int getAdapterConnectionState() throws android.os.RemoteException { return 0; }
            public int getProfileConnectionState(int p0) throws android.os.RemoteException { return 0; }
            public android.bluetooth.BluetoothDevice[] getBondedDevices() throws android.os.RemoteException { return null; }
            public boolean createBond(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
            public boolean createBondOutOfBand(android.bluetooth.BluetoothDevice p0, int p1, android.bluetooth.OobData p2) throws android.os.RemoteException { return false; }
            public boolean cancelBondProcess(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean removeBond(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public int getBondState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public boolean isBondingInitiatedLocally(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public long getSupportedProfiles() throws android.os.RemoteException { return 0L; }
            public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getRemoteName(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
            public int getRemoteType(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getRemoteAlias(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
            public boolean setRemoteAlias(android.bluetooth.BluetoothDevice p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public int getRemoteClass(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public android.os.ParcelUuid[] getRemoteUuids(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
            public boolean fetchRemoteUuids(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean sdpSearch(android.bluetooth.BluetoothDevice p0, android.os.ParcelUuid p1) throws android.os.RemoteException { return false; }
            public int getBatteryLevel(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public int getMaxConnectedAudioDevices() throws android.os.RemoteException { return 0; }
            public boolean setPin(android.bluetooth.BluetoothDevice p0, boolean p1, int p2, byte[] p3) throws android.os.RemoteException { return false; }
            public boolean setPasskey(android.bluetooth.BluetoothDevice p0, boolean p1, int p2, byte[] p3) throws android.os.RemoteException { return false; }
            public boolean setPairingConfirmation(android.bluetooth.BluetoothDevice p0, boolean p1) throws android.os.RemoteException { return false; }
            public int getPhonebookAccessPermission(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public boolean setSilenceMode(android.bluetooth.BluetoothDevice p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean getSilenceMode(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean setPhonebookAccessPermission(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
            public int getMessageAccessPermission(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public boolean setMessageAccessPermission(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
            public int getSimAccessPermission(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public boolean setSimAccessPermission(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
            public void sendConnectionStateChange(android.bluetooth.BluetoothDevice p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void registerCallback(android.bluetooth.IBluetoothCallback p0) throws android.os.RemoteException {}
            public void unregisterCallback(android.bluetooth.IBluetoothCallback p0) throws android.os.RemoteException {}
            public android.bluetooth.IBluetoothSocketManager getSocketManager() throws android.os.RemoteException { return null; }
            public boolean factoryReset() throws android.os.RemoteException { return false; }
            public boolean isMultiAdvertisementSupported() throws android.os.RemoteException { return false; }
            public boolean isOffloadedFilteringSupported() throws android.os.RemoteException { return false; }
            public boolean isOffloadedScanBatchingSupported() throws android.os.RemoteException { return false; }
            public boolean isActivityAndEnergyReportingSupported() throws android.os.RemoteException { return false; }
            public boolean isLe2MPhySupported() throws android.os.RemoteException { return false; }
            public boolean isLeCodedPhySupported() throws android.os.RemoteException { return false; }
            public boolean isLeExtendedAdvertisingSupported() throws android.os.RemoteException { return false; }
            public boolean isLePeriodicAdvertisingSupported() throws android.os.RemoteException { return false; }
            public int getLeMaximumAdvertisingDataLength() throws android.os.RemoteException { return 0; }
            public android.bluetooth.BluetoothActivityEnergyInfo reportActivityInfo() throws android.os.RemoteException { return null; }
            public boolean registerMetadataListener(android.bluetooth.IBluetoothMetadataListener p0, android.bluetooth.BluetoothDevice p1) throws android.os.RemoteException { return false; }
            public boolean unregisterMetadataListener(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean setMetadata(android.bluetooth.BluetoothDevice p0, int p1, byte[] p2) throws android.os.RemoteException { return false; }
            public byte[] getMetadata(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return null; }
            public void requestActivityInfo(android.os.ResultReceiver p0) throws android.os.RemoteException {}
            public void onLeServiceUp() throws android.os.RemoteException {}
            public void onBrEdrDown() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.bluetooth.IBluetooth {
        public Default() {}
        public boolean isEnabled() throws android.os.RemoteException { return false; }
        public int getState() throws android.os.RemoteException { return 0; }
        public boolean enable() throws android.os.RemoteException { return false; }
        public boolean enableNoAutoConnect() throws android.os.RemoteException { return false; }
        public boolean disable() throws android.os.RemoteException { return false; }
        public java.lang.String getAddress() throws android.os.RemoteException { return null; }
        public android.os.ParcelUuid[] getUuids() throws android.os.RemoteException { return null; }
        public boolean setName(java.lang.String p0) throws android.os.RemoteException { return false; }
        public java.lang.String getName() throws android.os.RemoteException { return null; }
        public android.bluetooth.BluetoothClass getBluetoothClass() throws android.os.RemoteException { return null; }
        public boolean setBluetoothClass(android.bluetooth.BluetoothClass p0) throws android.os.RemoteException { return false; }
        public int getIoCapability() throws android.os.RemoteException { return 0; }
        public boolean setIoCapability(int p0) throws android.os.RemoteException { return false; }
        public int getLeIoCapability() throws android.os.RemoteException { return 0; }
        public boolean setLeIoCapability(int p0) throws android.os.RemoteException { return false; }
        public int getScanMode() throws android.os.RemoteException { return 0; }
        public boolean setScanMode(int p0, int p1) throws android.os.RemoteException { return false; }
        public int getDiscoverableTimeout() throws android.os.RemoteException { return 0; }
        public boolean setDiscoverableTimeout(int p0) throws android.os.RemoteException { return false; }
        public boolean startDiscovery(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean cancelDiscovery() throws android.os.RemoteException { return false; }
        public boolean isDiscovering() throws android.os.RemoteException { return false; }
        public long getDiscoveryEndMillis() throws android.os.RemoteException { return 0L; }
        public int getAdapterConnectionState() throws android.os.RemoteException { return 0; }
        public int getProfileConnectionState(int p0) throws android.os.RemoteException { return 0; }
        public android.bluetooth.BluetoothDevice[] getBondedDevices() throws android.os.RemoteException { return null; }
        public boolean createBond(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
        public boolean createBondOutOfBand(android.bluetooth.BluetoothDevice p0, int p1, android.bluetooth.OobData p2) throws android.os.RemoteException { return false; }
        public boolean cancelBondProcess(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean removeBond(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public int getBondState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public boolean isBondingInitiatedLocally(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public long getSupportedProfiles() throws android.os.RemoteException { return 0L; }
        public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getRemoteName(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
        public int getRemoteType(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getRemoteAlias(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
        public boolean setRemoteAlias(android.bluetooth.BluetoothDevice p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public int getRemoteClass(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public android.os.ParcelUuid[] getRemoteUuids(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
        public boolean fetchRemoteUuids(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean sdpSearch(android.bluetooth.BluetoothDevice p0, android.os.ParcelUuid p1) throws android.os.RemoteException { return false; }
        public int getBatteryLevel(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public int getMaxConnectedAudioDevices() throws android.os.RemoteException { return 0; }
        public boolean setPin(android.bluetooth.BluetoothDevice p0, boolean p1, int p2, byte[] p3) throws android.os.RemoteException { return false; }
        public boolean setPasskey(android.bluetooth.BluetoothDevice p0, boolean p1, int p2, byte[] p3) throws android.os.RemoteException { return false; }
        public boolean setPairingConfirmation(android.bluetooth.BluetoothDevice p0, boolean p1) throws android.os.RemoteException { return false; }
        public int getPhonebookAccessPermission(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public boolean setSilenceMode(android.bluetooth.BluetoothDevice p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean getSilenceMode(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean setPhonebookAccessPermission(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
        public int getMessageAccessPermission(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public boolean setMessageAccessPermission(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
        public int getSimAccessPermission(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public boolean setSimAccessPermission(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
        public void sendConnectionStateChange(android.bluetooth.BluetoothDevice p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void registerCallback(android.bluetooth.IBluetoothCallback p0) throws android.os.RemoteException {}
        public void unregisterCallback(android.bluetooth.IBluetoothCallback p0) throws android.os.RemoteException {}
        public android.bluetooth.IBluetoothSocketManager getSocketManager() throws android.os.RemoteException { return null; }
        public boolean factoryReset() throws android.os.RemoteException { return false; }
        public boolean isMultiAdvertisementSupported() throws android.os.RemoteException { return false; }
        public boolean isOffloadedFilteringSupported() throws android.os.RemoteException { return false; }
        public boolean isOffloadedScanBatchingSupported() throws android.os.RemoteException { return false; }
        public boolean isActivityAndEnergyReportingSupported() throws android.os.RemoteException { return false; }
        public boolean isLe2MPhySupported() throws android.os.RemoteException { return false; }
        public boolean isLeCodedPhySupported() throws android.os.RemoteException { return false; }
        public boolean isLeExtendedAdvertisingSupported() throws android.os.RemoteException { return false; }
        public boolean isLePeriodicAdvertisingSupported() throws android.os.RemoteException { return false; }
        public int getLeMaximumAdvertisingDataLength() throws android.os.RemoteException { return 0; }
        public android.bluetooth.BluetoothActivityEnergyInfo reportActivityInfo() throws android.os.RemoteException { return null; }
        public boolean registerMetadataListener(android.bluetooth.IBluetoothMetadataListener p0, android.bluetooth.BluetoothDevice p1) throws android.os.RemoteException { return false; }
        public boolean unregisterMetadataListener(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean setMetadata(android.bluetooth.BluetoothDevice p0, int p1, byte[] p2) throws android.os.RemoteException { return false; }
        public byte[] getMetadata(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return null; }
        public void requestActivityInfo(android.os.ResultReceiver p0) throws android.os.RemoteException {}
        public void onLeServiceUp() throws android.os.RemoteException {}
        public void onBrEdrDown() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
