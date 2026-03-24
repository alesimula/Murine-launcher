package android.bluetooth;

public interface IBluetooth extends android.os.IInterface {
    @android.annotation.RequiresNoPermission
    public int getState() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean enable(boolean p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean disable(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.LOCAL_MAC_ADDRESS"})
    public java.lang.String getAddress() throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.LOCAL_MAC_ADDRESS"})
    public java.lang.String getAddressWithAttribution(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.os.ParcelUuid[] getUuids(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean setName(java.lang.String p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.lang.String getName(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_ADVERTISE")
    public int getNameLengthForAdvertise(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothClass getBluetoothClass(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setBluetoothClass(android.bluetooth.BluetoothClass p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getIoCapability(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setIoCapability(int p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getLeIoCapability(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setLeIoCapability(int p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public int getScanMode(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public boolean setScanMode(int p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public int getDiscoverableTimeout(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public boolean setDiscoverableTimeout(int p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public boolean startDiscovery(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public boolean cancelDiscovery(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public boolean isDiscovering(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public long getDiscoveryEndMillis(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public int getAdapterConnectionState() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public int getProfileConnectionState(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothDevice[] getBondedDevices(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean createBond(android.bluetooth.BluetoothDevice p0, int p1, android.bluetooth.OobData p2, android.bluetooth.OobData p3, android.content.AttributionSource p4) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean cancelBondProcess(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean removeBond(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getBondState(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean isBondingInitiatedLocally(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public long getSupportedProfiles() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getConnectionStateWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.lang.String getRemoteName(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getRemoteType(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.lang.String getRemoteAlias(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.lang.String getRemoteAliasWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int setRemoteAlias(android.bluetooth.BluetoothDevice p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getRemoteClass(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.os.ParcelUuid[] getRemoteUuids(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean fetchRemoteUuids(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean fetchRemoteUuidsWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean sdpSearch(android.bluetooth.BluetoothDevice p0, android.os.ParcelUuid p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getBatteryLevel(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getMaxConnectedAudioDevices(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean setPin(android.bluetooth.BluetoothDevice p0, boolean p1, int p2, byte[] p3, android.content.AttributionSource p4) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean setPasskey(android.bluetooth.BluetoothDevice p0, boolean p1, int p2, byte[] p3, android.content.AttributionSource p4) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setPairingConfirmation(android.bluetooth.BluetoothDevice p0, boolean p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getPhonebookAccessPermission(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setSilenceMode(android.bluetooth.BluetoothDevice p0, boolean p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean getSilenceMode(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setPhonebookAccessPermission(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getMessageAccessPermission(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setMessageAccessPermission(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getSimAccessPermission(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setSimAccessPermission(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public void registerCallback(android.bluetooth.IBluetoothCallback p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public void unregisterCallback(android.bluetooth.IBluetoothCallback p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public android.bluetooth.IBluetoothSocketManager getSocketManager() throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean factoryReset(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean isMultiAdvertisementSupported() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean isOffloadedFilteringSupported() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean isOffloadedScanBatchingSupported() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean isActivityAndEnergyReportingSupported() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean isLe2MPhySupported() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean isLeCodedPhySupported() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean isLeExtendedAdvertisingSupported() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean isLePeriodicAdvertisingSupported() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public int getLeMaximumAdvertisingDataLength() throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public android.bluetooth.BluetoothActivityEnergyInfo reportActivityInfo(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean registerMetadataListener(android.bluetooth.IBluetoothMetadataListener p0, android.bluetooth.BluetoothDevice p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean unregisterMetadataListener(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setMetadata(android.bluetooth.BluetoothDevice p0, int p1, byte[] p2, android.content.AttributionSource p3) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public byte[] getMetadata(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public void requestActivityInfo(android.os.ResultReceiver p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public void onLeServiceUp(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public void onBrEdrDown(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED", "android.permission.MODIFY_PHONE_STATE"})
    public boolean connectAllEnabledProfiles(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean disconnectAllEnabledProfiles(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED", "android.permission.MODIFY_PHONE_STATE"})
    public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getMostRecentlyConnectedDevices(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED", "android.permission.MODIFY_PHONE_STATE"})
    public boolean removeActiveDevice(int p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean registerBluetoothConnectionCallback(android.bluetooth.IBluetoothConnectionCallback p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean unregisterBluetoothConnectionCallback(android.bluetooth.IBluetoothConnectionCallback p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean canBondWithoutDialog(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public void generateLocalOobData(int p0, android.bluetooth.IBluetoothOobDataCallback p1, android.content.AttributionSource p2) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.IBluetooth {
        public Default() {}
        public int getState() throws android.os.RemoteException { return 0; }
        public boolean enable(boolean p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public boolean disable(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
        public java.lang.String getAddress() throws android.os.RemoteException { return null; }
        public java.lang.String getAddressWithAttribution(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
        public android.os.ParcelUuid[] getUuids(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
        public boolean setName(java.lang.String p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public java.lang.String getName(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
        public int getNameLengthForAdvertise(android.content.AttributionSource p0) throws android.os.RemoteException { return 0; }
        public android.bluetooth.BluetoothClass getBluetoothClass(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
        public boolean setBluetoothClass(android.bluetooth.BluetoothClass p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public int getIoCapability(android.content.AttributionSource p0) throws android.os.RemoteException { return 0; }
        public boolean setIoCapability(int p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public int getLeIoCapability(android.content.AttributionSource p0) throws android.os.RemoteException { return 0; }
        public boolean setLeIoCapability(int p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public int getScanMode(android.content.AttributionSource p0) throws android.os.RemoteException { return 0; }
        public boolean setScanMode(int p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
        public int getDiscoverableTimeout(android.content.AttributionSource p0) throws android.os.RemoteException { return 0; }
        public boolean setDiscoverableTimeout(int p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public boolean startDiscovery(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
        public boolean cancelDiscovery(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
        public boolean isDiscovering(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
        public long getDiscoveryEndMillis(android.content.AttributionSource p0) throws android.os.RemoteException { return 0L; }
        public int getAdapterConnectionState() throws android.os.RemoteException { return 0; }
        public int getProfileConnectionState(int p0) throws android.os.RemoteException { return 0; }
        public android.bluetooth.BluetoothDevice[] getBondedDevices(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
        public boolean createBond(android.bluetooth.BluetoothDevice p0, int p1, android.bluetooth.OobData p2, android.bluetooth.OobData p3, android.content.AttributionSource p4) throws android.os.RemoteException { return false; }
        public boolean cancelBondProcess(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public boolean removeBond(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public int getBondState(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        public boolean isBondingInitiatedLocally(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public long getSupportedProfiles() throws android.os.RemoteException { return 0L; }
        public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public int getConnectionStateWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        public java.lang.String getRemoteName(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return null; }
        public int getRemoteType(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        public java.lang.String getRemoteAlias(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
        public java.lang.String getRemoteAliasWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return null; }
        public int setRemoteAlias(android.bluetooth.BluetoothDevice p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException { return 0; }
        public int getRemoteClass(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        public android.os.ParcelUuid[] getRemoteUuids(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return null; }
        public boolean fetchRemoteUuids(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean fetchRemoteUuidsWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public boolean sdpSearch(android.bluetooth.BluetoothDevice p0, android.os.ParcelUuid p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
        public int getBatteryLevel(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        public int getMaxConnectedAudioDevices(android.content.AttributionSource p0) throws android.os.RemoteException { return 0; }
        public boolean setPin(android.bluetooth.BluetoothDevice p0, boolean p1, int p2, byte[] p3, android.content.AttributionSource p4) throws android.os.RemoteException { return false; }
        public boolean setPasskey(android.bluetooth.BluetoothDevice p0, boolean p1, int p2, byte[] p3, android.content.AttributionSource p4) throws android.os.RemoteException { return false; }
        public boolean setPairingConfirmation(android.bluetooth.BluetoothDevice p0, boolean p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
        public int getPhonebookAccessPermission(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        public boolean setSilenceMode(android.bluetooth.BluetoothDevice p0, boolean p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
        public boolean getSilenceMode(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public boolean setPhonebookAccessPermission(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
        public int getMessageAccessPermission(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        public boolean setMessageAccessPermission(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
        public int getSimAccessPermission(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        public boolean setSimAccessPermission(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
        public void registerCallback(android.bluetooth.IBluetoothCallback p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
        public void unregisterCallback(android.bluetooth.IBluetoothCallback p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
        public android.bluetooth.IBluetoothSocketManager getSocketManager() throws android.os.RemoteException { return null; }
        public boolean factoryReset(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
        public boolean isMultiAdvertisementSupported() throws android.os.RemoteException { return false; }
        public boolean isOffloadedFilteringSupported() throws android.os.RemoteException { return false; }
        public boolean isOffloadedScanBatchingSupported() throws android.os.RemoteException { return false; }
        public boolean isActivityAndEnergyReportingSupported() throws android.os.RemoteException { return false; }
        public boolean isLe2MPhySupported() throws android.os.RemoteException { return false; }
        public boolean isLeCodedPhySupported() throws android.os.RemoteException { return false; }
        public boolean isLeExtendedAdvertisingSupported() throws android.os.RemoteException { return false; }
        public boolean isLePeriodicAdvertisingSupported() throws android.os.RemoteException { return false; }
        public int getLeMaximumAdvertisingDataLength() throws android.os.RemoteException { return 0; }
        public android.bluetooth.BluetoothActivityEnergyInfo reportActivityInfo(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
        public boolean registerMetadataListener(android.bluetooth.IBluetoothMetadataListener p0, android.bluetooth.BluetoothDevice p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
        public boolean unregisterMetadataListener(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public boolean setMetadata(android.bluetooth.BluetoothDevice p0, int p1, byte[] p2, android.content.AttributionSource p3) throws android.os.RemoteException { return false; }
        public byte[] getMetadata(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return null; }
        public void requestActivityInfo(android.os.ResultReceiver p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
        public void onLeServiceUp(android.content.AttributionSource p0) throws android.os.RemoteException {}
        public void onBrEdrDown(android.content.AttributionSource p0) throws android.os.RemoteException {}
        public boolean connectAllEnabledProfiles(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public boolean disconnectAllEnabledProfiles(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
        public java.util.List<android.bluetooth.BluetoothDevice> getMostRecentlyConnectedDevices(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
        public boolean removeActiveDevice(int p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public boolean registerBluetoothConnectionCallback(android.bluetooth.IBluetoothConnectionCallback p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public boolean unregisterBluetoothConnectionCallback(android.bluetooth.IBluetoothConnectionCallback p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public boolean canBondWithoutDialog(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public void generateLocalOobData(int p0, android.bluetooth.IBluetoothOobDataCallback p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetooth {
        public static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetooth";
        static final int TRANSACTION_getState = 1;
        static final int TRANSACTION_enable = 2;
        static final int TRANSACTION_disable = 3;
        static final int TRANSACTION_getAddress = 4;
        static final int TRANSACTION_getAddressWithAttribution = 5;
        static final int TRANSACTION_getUuids = 6;
        static final int TRANSACTION_setName = 7;
        static final int TRANSACTION_getName = 8;
        static final int TRANSACTION_getNameLengthForAdvertise = 9;
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
        static final int TRANSACTION_cancelBondProcess = 28;
        static final int TRANSACTION_removeBond = 29;
        static final int TRANSACTION_getBondState = 30;
        static final int TRANSACTION_isBondingInitiatedLocally = 31;
        static final int TRANSACTION_getSupportedProfiles = 32;
        static final int TRANSACTION_getConnectionState = 33;
        static final int TRANSACTION_getConnectionStateWithAttribution = 34;
        static final int TRANSACTION_getRemoteName = 35;
        static final int TRANSACTION_getRemoteType = 36;
        static final int TRANSACTION_getRemoteAlias = 37;
        static final int TRANSACTION_getRemoteAliasWithAttribution = 38;
        static final int TRANSACTION_setRemoteAlias = 39;
        static final int TRANSACTION_getRemoteClass = 40;
        static final int TRANSACTION_getRemoteUuids = 41;
        static final int TRANSACTION_fetchRemoteUuids = 42;
        static final int TRANSACTION_fetchRemoteUuidsWithAttribution = 43;
        static final int TRANSACTION_sdpSearch = 44;
        static final int TRANSACTION_getBatteryLevel = 45;
        static final int TRANSACTION_getMaxConnectedAudioDevices = 46;
        static final int TRANSACTION_setPin = 47;
        static final int TRANSACTION_setPasskey = 48;
        static final int TRANSACTION_setPairingConfirmation = 49;
        static final int TRANSACTION_getPhonebookAccessPermission = 50;
        static final int TRANSACTION_setSilenceMode = 51;
        static final int TRANSACTION_getSilenceMode = 52;
        static final int TRANSACTION_setPhonebookAccessPermission = 53;
        static final int TRANSACTION_getMessageAccessPermission = 54;
        static final int TRANSACTION_setMessageAccessPermission = 55;
        static final int TRANSACTION_getSimAccessPermission = 56;
        static final int TRANSACTION_setSimAccessPermission = 57;
        static final int TRANSACTION_registerCallback = 58;
        static final int TRANSACTION_unregisterCallback = 59;
        static final int TRANSACTION_getSocketManager = 60;
        static final int TRANSACTION_factoryReset = 61;
        static final int TRANSACTION_isMultiAdvertisementSupported = 62;
        static final int TRANSACTION_isOffloadedFilteringSupported = 63;
        static final int TRANSACTION_isOffloadedScanBatchingSupported = 64;
        static final int TRANSACTION_isActivityAndEnergyReportingSupported = 65;
        static final int TRANSACTION_isLe2MPhySupported = 66;
        static final int TRANSACTION_isLeCodedPhySupported = 67;
        static final int TRANSACTION_isLeExtendedAdvertisingSupported = 68;
        static final int TRANSACTION_isLePeriodicAdvertisingSupported = 69;
        static final int TRANSACTION_getLeMaximumAdvertisingDataLength = 70;
        static final int TRANSACTION_reportActivityInfo = 71;
        static final int TRANSACTION_registerMetadataListener = 72;
        static final int TRANSACTION_unregisterMetadataListener = 73;
        static final int TRANSACTION_setMetadata = 74;
        static final int TRANSACTION_getMetadata = 75;
        static final int TRANSACTION_requestActivityInfo = 76;
        static final int TRANSACTION_onLeServiceUp = 77;
        static final int TRANSACTION_onBrEdrDown = 78;
        static final int TRANSACTION_connectAllEnabledProfiles = 79;
        static final int TRANSACTION_disconnectAllEnabledProfiles = 80;
        static final int TRANSACTION_setActiveDevice = 81;
        static final int TRANSACTION_getMostRecentlyConnectedDevices = 82;
        static final int TRANSACTION_removeActiveDevice = 83;
        static final int TRANSACTION_registerBluetoothConnectionCallback = 84;
        static final int TRANSACTION_unregisterBluetoothConnectionCallback = 85;
        static final int TRANSACTION_canBondWithoutDialog = 86;
        static final int TRANSACTION_generateLocalOobData = 87;
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
            public int getState() throws android.os.RemoteException { return 0; }
            public boolean enable(boolean p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public boolean disable(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
            public java.lang.String getAddress() throws android.os.RemoteException { return null; }
            public java.lang.String getAddressWithAttribution(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
            public android.os.ParcelUuid[] getUuids(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
            public boolean setName(java.lang.String p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public java.lang.String getName(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
            public int getNameLengthForAdvertise(android.content.AttributionSource p0) throws android.os.RemoteException { return 0; }
            public android.bluetooth.BluetoothClass getBluetoothClass(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
            public boolean setBluetoothClass(android.bluetooth.BluetoothClass p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public int getIoCapability(android.content.AttributionSource p0) throws android.os.RemoteException { return 0; }
            public boolean setIoCapability(int p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public int getLeIoCapability(android.content.AttributionSource p0) throws android.os.RemoteException { return 0; }
            public boolean setLeIoCapability(int p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public int getScanMode(android.content.AttributionSource p0) throws android.os.RemoteException { return 0; }
            public boolean setScanMode(int p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
            public int getDiscoverableTimeout(android.content.AttributionSource p0) throws android.os.RemoteException { return 0; }
            public boolean setDiscoverableTimeout(int p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public boolean startDiscovery(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
            public boolean cancelDiscovery(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
            public boolean isDiscovering(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
            public long getDiscoveryEndMillis(android.content.AttributionSource p0) throws android.os.RemoteException { return 0L; }
            public int getAdapterConnectionState() throws android.os.RemoteException { return 0; }
            public int getProfileConnectionState(int p0) throws android.os.RemoteException { return 0; }
            public android.bluetooth.BluetoothDevice[] getBondedDevices(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
            public boolean createBond(android.bluetooth.BluetoothDevice p0, int p1, android.bluetooth.OobData p2, android.bluetooth.OobData p3, android.content.AttributionSource p4) throws android.os.RemoteException { return false; }
            public boolean cancelBondProcess(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public boolean removeBond(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public int getBondState(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
            public boolean isBondingInitiatedLocally(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public long getSupportedProfiles() throws android.os.RemoteException { return 0L; }
            public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public int getConnectionStateWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
            public java.lang.String getRemoteName(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return null; }
            public int getRemoteType(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
            public java.lang.String getRemoteAlias(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
            public java.lang.String getRemoteAliasWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return null; }
            public int setRemoteAlias(android.bluetooth.BluetoothDevice p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException { return 0; }
            public int getRemoteClass(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
            public android.os.ParcelUuid[] getRemoteUuids(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return null; }
            public boolean fetchRemoteUuids(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean fetchRemoteUuidsWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public boolean sdpSearch(android.bluetooth.BluetoothDevice p0, android.os.ParcelUuid p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
            public int getBatteryLevel(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
            public int getMaxConnectedAudioDevices(android.content.AttributionSource p0) throws android.os.RemoteException { return 0; }
            public boolean setPin(android.bluetooth.BluetoothDevice p0, boolean p1, int p2, byte[] p3, android.content.AttributionSource p4) throws android.os.RemoteException { return false; }
            public boolean setPasskey(android.bluetooth.BluetoothDevice p0, boolean p1, int p2, byte[] p3, android.content.AttributionSource p4) throws android.os.RemoteException { return false; }
            public boolean setPairingConfirmation(android.bluetooth.BluetoothDevice p0, boolean p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
            public int getPhonebookAccessPermission(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
            public boolean setSilenceMode(android.bluetooth.BluetoothDevice p0, boolean p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
            public boolean getSilenceMode(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public boolean setPhonebookAccessPermission(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
            public int getMessageAccessPermission(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
            public boolean setMessageAccessPermission(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
            public int getSimAccessPermission(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
            public boolean setSimAccessPermission(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
            public void registerCallback(android.bluetooth.IBluetoothCallback p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
            public void unregisterCallback(android.bluetooth.IBluetoothCallback p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
            public android.bluetooth.IBluetoothSocketManager getSocketManager() throws android.os.RemoteException { return null; }
            public boolean factoryReset(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
            public boolean isMultiAdvertisementSupported() throws android.os.RemoteException { return false; }
            public boolean isOffloadedFilteringSupported() throws android.os.RemoteException { return false; }
            public boolean isOffloadedScanBatchingSupported() throws android.os.RemoteException { return false; }
            public boolean isActivityAndEnergyReportingSupported() throws android.os.RemoteException { return false; }
            public boolean isLe2MPhySupported() throws android.os.RemoteException { return false; }
            public boolean isLeCodedPhySupported() throws android.os.RemoteException { return false; }
            public boolean isLeExtendedAdvertisingSupported() throws android.os.RemoteException { return false; }
            public boolean isLePeriodicAdvertisingSupported() throws android.os.RemoteException { return false; }
            public int getLeMaximumAdvertisingDataLength() throws android.os.RemoteException { return 0; }
            public android.bluetooth.BluetoothActivityEnergyInfo reportActivityInfo(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
            public boolean registerMetadataListener(android.bluetooth.IBluetoothMetadataListener p0, android.bluetooth.BluetoothDevice p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
            public boolean unregisterMetadataListener(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public boolean setMetadata(android.bluetooth.BluetoothDevice p0, int p1, byte[] p2, android.content.AttributionSource p3) throws android.os.RemoteException { return false; }
            public byte[] getMetadata(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return null; }
            public void requestActivityInfo(android.os.ResultReceiver p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
            public void onLeServiceUp(android.content.AttributionSource p0) throws android.os.RemoteException {}
            public void onBrEdrDown(android.content.AttributionSource p0) throws android.os.RemoteException {}
            public boolean connectAllEnabledProfiles(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public boolean disconnectAllEnabledProfiles(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
            public java.util.List<android.bluetooth.BluetoothDevice> getMostRecentlyConnectedDevices(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
            public boolean removeActiveDevice(int p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public boolean registerBluetoothConnectionCallback(android.bluetooth.IBluetoothConnectionCallback p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public boolean unregisterBluetoothConnectionCallback(android.bluetooth.IBluetoothConnectionCallback p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public boolean canBondWithoutDialog(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public void generateLocalOobData(int p0, android.bluetooth.IBluetoothOobDataCallback p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        }
    }
}
