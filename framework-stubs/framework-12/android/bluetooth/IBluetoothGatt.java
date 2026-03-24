package android.bluetooth;

public interface IBluetoothGatt extends android.os.IInterface {
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public void registerScanner(android.bluetooth.le.IScannerCallback p0, android.os.WorkSource p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public void unregisterScanner(int p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public void startScan(int p0, android.bluetooth.le.ScanSettings p1, java.util.List<android.bluetooth.le.ScanFilter> p2, java.util.List p3, android.content.AttributionSource p4) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public void startScanForIntent(android.app.PendingIntent p0, android.bluetooth.le.ScanSettings p1, java.util.List<android.bluetooth.le.ScanFilter> p2, android.content.AttributionSource p3) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public void stopScanForIntent(android.app.PendingIntent p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public void stopScan(int p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public void flushPendingBatchResults(int p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_ADVERTISE")
    public void startAdvertisingSet(android.bluetooth.le.AdvertisingSetParameters p0, android.bluetooth.le.AdvertiseData p1, android.bluetooth.le.AdvertiseData p2, android.bluetooth.le.PeriodicAdvertisingParameters p3, android.bluetooth.le.AdvertiseData p4, int p5, int p6, android.bluetooth.le.IAdvertisingSetCallback p7, android.content.AttributionSource p8) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_ADVERTISE")
    public void stopAdvertisingSet(android.bluetooth.le.IAdvertisingSetCallback p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_ADVERTISE", "android.permission.BLUETOOTH_PRIVILEGED"})
    public void getOwnAddress(int p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_ADVERTISE")
    public void enableAdvertisingSet(int p0, boolean p1, int p2, int p3, android.content.AttributionSource p4) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_ADVERTISE")
    public void setAdvertisingData(int p0, android.bluetooth.le.AdvertiseData p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_ADVERTISE")
    public void setScanResponseData(int p0, android.bluetooth.le.AdvertiseData p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_ADVERTISE")
    public void setAdvertisingParameters(int p0, android.bluetooth.le.AdvertisingSetParameters p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_ADVERTISE")
    public void setPeriodicAdvertisingParameters(int p0, android.bluetooth.le.PeriodicAdvertisingParameters p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_ADVERTISE")
    public void setPeriodicAdvertisingData(int p0, android.bluetooth.le.AdvertiseData p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_ADVERTISE")
    public void setPeriodicAdvertisingEnable(int p0, boolean p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public void registerSync(android.bluetooth.le.ScanResult p0, int p1, int p2, android.bluetooth.le.IPeriodicAdvertisingCallback p3, android.content.AttributionSource p4) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public void unregisterSync(android.bluetooth.le.IPeriodicAdvertisingCallback p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void registerClient(android.os.ParcelUuid p0, android.bluetooth.IBluetoothGattCallback p1, boolean p2, android.content.AttributionSource p3) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void unregisterClient(int p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void clientConnect(int p0, java.lang.String p1, boolean p2, int p3, boolean p4, int p5, android.content.AttributionSource p6) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void clientDisconnect(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void clientSetPreferredPhy(int p0, java.lang.String p1, int p2, int p3, int p4, android.content.AttributionSource p5) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void clientReadPhy(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void refreshDevice(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void discoverServices(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void discoverServiceByUuid(int p0, java.lang.String p1, android.os.ParcelUuid p2, android.content.AttributionSource p3) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void readCharacteristic(int p0, java.lang.String p1, int p2, int p3, android.content.AttributionSource p4) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void readUsingCharacteristicUuid(int p0, java.lang.String p1, android.os.ParcelUuid p2, int p3, int p4, int p5, android.content.AttributionSource p6) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void writeCharacteristic(int p0, java.lang.String p1, int p2, int p3, int p4, byte[] p5, android.content.AttributionSource p6) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void readDescriptor(int p0, java.lang.String p1, int p2, int p3, android.content.AttributionSource p4) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void writeDescriptor(int p0, java.lang.String p1, int p2, int p3, byte[] p4, android.content.AttributionSource p5) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void registerForNotification(int p0, java.lang.String p1, int p2, boolean p3, android.content.AttributionSource p4) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void beginReliableWrite(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void endReliableWrite(int p0, java.lang.String p1, boolean p2, android.content.AttributionSource p3) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void readRemoteRssi(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void configureMTU(int p0, java.lang.String p1, int p2, android.content.AttributionSource p3) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void connectionParameterUpdate(int p0, java.lang.String p1, int p2, android.content.AttributionSource p3) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void leConnectionUpdate(int p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6, int p7, android.content.AttributionSource p8) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void registerServer(android.os.ParcelUuid p0, android.bluetooth.IBluetoothGattServerCallback p1, boolean p2, android.content.AttributionSource p3) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void unregisterServer(int p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void serverConnect(int p0, java.lang.String p1, boolean p2, int p3, android.content.AttributionSource p4) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void serverDisconnect(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void serverSetPreferredPhy(int p0, java.lang.String p1, int p2, int p3, int p4, android.content.AttributionSource p5) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void serverReadPhy(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void addService(int p0, android.bluetooth.BluetoothGattService p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void removeService(int p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void clearServices(int p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void sendResponse(int p0, java.lang.String p1, int p2, int p3, int p4, byte[] p5, android.content.AttributionSource p6) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void sendNotification(int p0, java.lang.String p1, int p2, boolean p3, byte[] p4, android.content.AttributionSource p5) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void disconnectAll(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void unregAll(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int numHwTrackFiltersAvailable(android.content.AttributionSource p0) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.IBluetoothGatt {
        public Default() {}
        public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0, android.content.AttributionSource p1) throws android.os.RemoteException { return null; }
        public void registerScanner(android.bluetooth.le.IScannerCallback p0, android.os.WorkSource p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public void unregisterScanner(int p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
        public void startScan(int p0, android.bluetooth.le.ScanSettings p1, java.util.List<android.bluetooth.le.ScanFilter> p2, java.util.List p3, android.content.AttributionSource p4) throws android.os.RemoteException {}
        public void startScanForIntent(android.app.PendingIntent p0, android.bluetooth.le.ScanSettings p1, java.util.List<android.bluetooth.le.ScanFilter> p2, android.content.AttributionSource p3) throws android.os.RemoteException {}
        public void stopScanForIntent(android.app.PendingIntent p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
        public void stopScan(int p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
        public void flushPendingBatchResults(int p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
        public void startAdvertisingSet(android.bluetooth.le.AdvertisingSetParameters p0, android.bluetooth.le.AdvertiseData p1, android.bluetooth.le.AdvertiseData p2, android.bluetooth.le.PeriodicAdvertisingParameters p3, android.bluetooth.le.AdvertiseData p4, int p5, int p6, android.bluetooth.le.IAdvertisingSetCallback p7, android.content.AttributionSource p8) throws android.os.RemoteException {}
        public void stopAdvertisingSet(android.bluetooth.le.IAdvertisingSetCallback p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
        public void getOwnAddress(int p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
        public void enableAdvertisingSet(int p0, boolean p1, int p2, int p3, android.content.AttributionSource p4) throws android.os.RemoteException {}
        public void setAdvertisingData(int p0, android.bluetooth.le.AdvertiseData p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public void setScanResponseData(int p0, android.bluetooth.le.AdvertiseData p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public void setAdvertisingParameters(int p0, android.bluetooth.le.AdvertisingSetParameters p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public void setPeriodicAdvertisingParameters(int p0, android.bluetooth.le.PeriodicAdvertisingParameters p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public void setPeriodicAdvertisingData(int p0, android.bluetooth.le.AdvertiseData p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public void setPeriodicAdvertisingEnable(int p0, boolean p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public void registerSync(android.bluetooth.le.ScanResult p0, int p1, int p2, android.bluetooth.le.IPeriodicAdvertisingCallback p3, android.content.AttributionSource p4) throws android.os.RemoteException {}
        public void unregisterSync(android.bluetooth.le.IPeriodicAdvertisingCallback p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
        public void registerClient(android.os.ParcelUuid p0, android.bluetooth.IBluetoothGattCallback p1, boolean p2, android.content.AttributionSource p3) throws android.os.RemoteException {}
        public void unregisterClient(int p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
        public void clientConnect(int p0, java.lang.String p1, boolean p2, int p3, boolean p4, int p5, android.content.AttributionSource p6) throws android.os.RemoteException {}
        public void clientDisconnect(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public void clientSetPreferredPhy(int p0, java.lang.String p1, int p2, int p3, int p4, android.content.AttributionSource p5) throws android.os.RemoteException {}
        public void clientReadPhy(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public void refreshDevice(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public void discoverServices(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public void discoverServiceByUuid(int p0, java.lang.String p1, android.os.ParcelUuid p2, android.content.AttributionSource p3) throws android.os.RemoteException {}
        public void readCharacteristic(int p0, java.lang.String p1, int p2, int p3, android.content.AttributionSource p4) throws android.os.RemoteException {}
        public void readUsingCharacteristicUuid(int p0, java.lang.String p1, android.os.ParcelUuid p2, int p3, int p4, int p5, android.content.AttributionSource p6) throws android.os.RemoteException {}
        public void writeCharacteristic(int p0, java.lang.String p1, int p2, int p3, int p4, byte[] p5, android.content.AttributionSource p6) throws android.os.RemoteException {}
        public void readDescriptor(int p0, java.lang.String p1, int p2, int p3, android.content.AttributionSource p4) throws android.os.RemoteException {}
        public void writeDescriptor(int p0, java.lang.String p1, int p2, int p3, byte[] p4, android.content.AttributionSource p5) throws android.os.RemoteException {}
        public void registerForNotification(int p0, java.lang.String p1, int p2, boolean p3, android.content.AttributionSource p4) throws android.os.RemoteException {}
        public void beginReliableWrite(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public void endReliableWrite(int p0, java.lang.String p1, boolean p2, android.content.AttributionSource p3) throws android.os.RemoteException {}
        public void readRemoteRssi(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public void configureMTU(int p0, java.lang.String p1, int p2, android.content.AttributionSource p3) throws android.os.RemoteException {}
        public void connectionParameterUpdate(int p0, java.lang.String p1, int p2, android.content.AttributionSource p3) throws android.os.RemoteException {}
        public void leConnectionUpdate(int p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6, int p7, android.content.AttributionSource p8) throws android.os.RemoteException {}
        public void registerServer(android.os.ParcelUuid p0, android.bluetooth.IBluetoothGattServerCallback p1, boolean p2, android.content.AttributionSource p3) throws android.os.RemoteException {}
        public void unregisterServer(int p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
        public void serverConnect(int p0, java.lang.String p1, boolean p2, int p3, android.content.AttributionSource p4) throws android.os.RemoteException {}
        public void serverDisconnect(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public void serverSetPreferredPhy(int p0, java.lang.String p1, int p2, int p3, int p4, android.content.AttributionSource p5) throws android.os.RemoteException {}
        public void serverReadPhy(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public void addService(int p0, android.bluetooth.BluetoothGattService p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public void removeService(int p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public void clearServices(int p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
        public void sendResponse(int p0, java.lang.String p1, int p2, int p3, int p4, byte[] p5, android.content.AttributionSource p6) throws android.os.RemoteException {}
        public void sendNotification(int p0, java.lang.String p1, int p2, boolean p3, byte[] p4, android.content.AttributionSource p5) throws android.os.RemoteException {}
        public void disconnectAll(android.content.AttributionSource p0) throws android.os.RemoteException {}
        public void unregAll(android.content.AttributionSource p0) throws android.os.RemoteException {}
        public int numHwTrackFiltersAvailable(android.content.AttributionSource p0) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothGatt {
        public static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothGatt";
        static final int TRANSACTION_getDevicesMatchingConnectionStates = 1;
        static final int TRANSACTION_registerScanner = 2;
        static final int TRANSACTION_unregisterScanner = 3;
        static final int TRANSACTION_startScan = 4;
        static final int TRANSACTION_startScanForIntent = 5;
        static final int TRANSACTION_stopScanForIntent = 6;
        static final int TRANSACTION_stopScan = 7;
        static final int TRANSACTION_flushPendingBatchResults = 8;
        static final int TRANSACTION_startAdvertisingSet = 9;
        static final int TRANSACTION_stopAdvertisingSet = 10;
        static final int TRANSACTION_getOwnAddress = 11;
        static final int TRANSACTION_enableAdvertisingSet = 12;
        static final int TRANSACTION_setAdvertisingData = 13;
        static final int TRANSACTION_setScanResponseData = 14;
        static final int TRANSACTION_setAdvertisingParameters = 15;
        static final int TRANSACTION_setPeriodicAdvertisingParameters = 16;
        static final int TRANSACTION_setPeriodicAdvertisingData = 17;
        static final int TRANSACTION_setPeriodicAdvertisingEnable = 18;
        static final int TRANSACTION_registerSync = 19;
        static final int TRANSACTION_unregisterSync = 20;
        static final int TRANSACTION_registerClient = 21;
        static final int TRANSACTION_unregisterClient = 22;
        static final int TRANSACTION_clientConnect = 23;
        static final int TRANSACTION_clientDisconnect = 24;
        static final int TRANSACTION_clientSetPreferredPhy = 25;
        static final int TRANSACTION_clientReadPhy = 26;
        static final int TRANSACTION_refreshDevice = 27;
        static final int TRANSACTION_discoverServices = 28;
        static final int TRANSACTION_discoverServiceByUuid = 29;
        static final int TRANSACTION_readCharacteristic = 30;
        static final int TRANSACTION_readUsingCharacteristicUuid = 31;
        static final int TRANSACTION_writeCharacteristic = 32;
        static final int TRANSACTION_readDescriptor = 33;
        static final int TRANSACTION_writeDescriptor = 34;
        static final int TRANSACTION_registerForNotification = 35;
        static final int TRANSACTION_beginReliableWrite = 36;
        static final int TRANSACTION_endReliableWrite = 37;
        static final int TRANSACTION_readRemoteRssi = 38;
        static final int TRANSACTION_configureMTU = 39;
        static final int TRANSACTION_connectionParameterUpdate = 40;
        static final int TRANSACTION_leConnectionUpdate = 41;
        static final int TRANSACTION_registerServer = 42;
        static final int TRANSACTION_unregisterServer = 43;
        static final int TRANSACTION_serverConnect = 44;
        static final int TRANSACTION_serverDisconnect = 45;
        static final int TRANSACTION_serverSetPreferredPhy = 46;
        static final int TRANSACTION_serverReadPhy = 47;
        static final int TRANSACTION_addService = 48;
        static final int TRANSACTION_removeService = 49;
        static final int TRANSACTION_clearServices = 50;
        static final int TRANSACTION_sendResponse = 51;
        static final int TRANSACTION_sendNotification = 52;
        static final int TRANSACTION_disconnectAll = 53;
        static final int TRANSACTION_unregAll = 54;
        static final int TRANSACTION_numHwTrackFiltersAvailable = 55;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothGatt asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothGatt p0) { return false; }
        public static android.bluetooth.IBluetoothGatt getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothGatt {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothGatt sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0, android.content.AttributionSource p1) throws android.os.RemoteException { return null; }
            public void registerScanner(android.bluetooth.le.IScannerCallback p0, android.os.WorkSource p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public void unregisterScanner(int p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
            public void startScan(int p0, android.bluetooth.le.ScanSettings p1, java.util.List<android.bluetooth.le.ScanFilter> p2, java.util.List p3, android.content.AttributionSource p4) throws android.os.RemoteException {}
            public void startScanForIntent(android.app.PendingIntent p0, android.bluetooth.le.ScanSettings p1, java.util.List<android.bluetooth.le.ScanFilter> p2, android.content.AttributionSource p3) throws android.os.RemoteException {}
            public void stopScanForIntent(android.app.PendingIntent p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
            public void stopScan(int p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
            public void flushPendingBatchResults(int p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
            public void startAdvertisingSet(android.bluetooth.le.AdvertisingSetParameters p0, android.bluetooth.le.AdvertiseData p1, android.bluetooth.le.AdvertiseData p2, android.bluetooth.le.PeriodicAdvertisingParameters p3, android.bluetooth.le.AdvertiseData p4, int p5, int p6, android.bluetooth.le.IAdvertisingSetCallback p7, android.content.AttributionSource p8) throws android.os.RemoteException {}
            public void stopAdvertisingSet(android.bluetooth.le.IAdvertisingSetCallback p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
            public void getOwnAddress(int p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
            public void enableAdvertisingSet(int p0, boolean p1, int p2, int p3, android.content.AttributionSource p4) throws android.os.RemoteException {}
            public void setAdvertisingData(int p0, android.bluetooth.le.AdvertiseData p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public void setScanResponseData(int p0, android.bluetooth.le.AdvertiseData p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public void setAdvertisingParameters(int p0, android.bluetooth.le.AdvertisingSetParameters p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public void setPeriodicAdvertisingParameters(int p0, android.bluetooth.le.PeriodicAdvertisingParameters p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public void setPeriodicAdvertisingData(int p0, android.bluetooth.le.AdvertiseData p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public void setPeriodicAdvertisingEnable(int p0, boolean p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public void registerSync(android.bluetooth.le.ScanResult p0, int p1, int p2, android.bluetooth.le.IPeriodicAdvertisingCallback p3, android.content.AttributionSource p4) throws android.os.RemoteException {}
            public void unregisterSync(android.bluetooth.le.IPeriodicAdvertisingCallback p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
            public void registerClient(android.os.ParcelUuid p0, android.bluetooth.IBluetoothGattCallback p1, boolean p2, android.content.AttributionSource p3) throws android.os.RemoteException {}
            public void unregisterClient(int p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
            public void clientConnect(int p0, java.lang.String p1, boolean p2, int p3, boolean p4, int p5, android.content.AttributionSource p6) throws android.os.RemoteException {}
            public void clientDisconnect(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public void clientSetPreferredPhy(int p0, java.lang.String p1, int p2, int p3, int p4, android.content.AttributionSource p5) throws android.os.RemoteException {}
            public void clientReadPhy(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public void refreshDevice(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public void discoverServices(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public void discoverServiceByUuid(int p0, java.lang.String p1, android.os.ParcelUuid p2, android.content.AttributionSource p3) throws android.os.RemoteException {}
            public void readCharacteristic(int p0, java.lang.String p1, int p2, int p3, android.content.AttributionSource p4) throws android.os.RemoteException {}
            public void readUsingCharacteristicUuid(int p0, java.lang.String p1, android.os.ParcelUuid p2, int p3, int p4, int p5, android.content.AttributionSource p6) throws android.os.RemoteException {}
            public void writeCharacteristic(int p0, java.lang.String p1, int p2, int p3, int p4, byte[] p5, android.content.AttributionSource p6) throws android.os.RemoteException {}
            public void readDescriptor(int p0, java.lang.String p1, int p2, int p3, android.content.AttributionSource p4) throws android.os.RemoteException {}
            public void writeDescriptor(int p0, java.lang.String p1, int p2, int p3, byte[] p4, android.content.AttributionSource p5) throws android.os.RemoteException {}
            public void registerForNotification(int p0, java.lang.String p1, int p2, boolean p3, android.content.AttributionSource p4) throws android.os.RemoteException {}
            public void beginReliableWrite(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public void endReliableWrite(int p0, java.lang.String p1, boolean p2, android.content.AttributionSource p3) throws android.os.RemoteException {}
            public void readRemoteRssi(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public void configureMTU(int p0, java.lang.String p1, int p2, android.content.AttributionSource p3) throws android.os.RemoteException {}
            public void connectionParameterUpdate(int p0, java.lang.String p1, int p2, android.content.AttributionSource p3) throws android.os.RemoteException {}
            public void leConnectionUpdate(int p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6, int p7, android.content.AttributionSource p8) throws android.os.RemoteException {}
            public void registerServer(android.os.ParcelUuid p0, android.bluetooth.IBluetoothGattServerCallback p1, boolean p2, android.content.AttributionSource p3) throws android.os.RemoteException {}
            public void unregisterServer(int p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
            public void serverConnect(int p0, java.lang.String p1, boolean p2, int p3, android.content.AttributionSource p4) throws android.os.RemoteException {}
            public void serverDisconnect(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public void serverSetPreferredPhy(int p0, java.lang.String p1, int p2, int p3, int p4, android.content.AttributionSource p5) throws android.os.RemoteException {}
            public void serverReadPhy(int p0, java.lang.String p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public void addService(int p0, android.bluetooth.BluetoothGattService p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public void removeService(int p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public void clearServices(int p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
            public void sendResponse(int p0, java.lang.String p1, int p2, int p3, int p4, byte[] p5, android.content.AttributionSource p6) throws android.os.RemoteException {}
            public void sendNotification(int p0, java.lang.String p1, int p2, boolean p3, byte[] p4, android.content.AttributionSource p5) throws android.os.RemoteException {}
            public void disconnectAll(android.content.AttributionSource p0) throws android.os.RemoteException {}
            public void unregAll(android.content.AttributionSource p0) throws android.os.RemoteException {}
            public int numHwTrackFiltersAvailable(android.content.AttributionSource p0) throws android.os.RemoteException { return 0; }
        }
    }
}
