package android.bluetooth;

public interface IBluetoothManager extends android.os.IInterface {
    public android.bluetooth.IBluetooth registerAdapter(android.bluetooth.IBluetoothManagerCallback p0) throws android.os.RemoteException;
    public void unregisterAdapter(android.bluetooth.IBluetoothManagerCallback p0) throws android.os.RemoteException;
    public void registerStateChangeCallback(android.bluetooth.IBluetoothStateChangeCallback p0) throws android.os.RemoteException;
    public void unregisterStateChangeCallback(android.bluetooth.IBluetoothStateChangeCallback p0) throws android.os.RemoteException;
    public boolean isEnabled() throws android.os.RemoteException;
    public boolean enable(java.lang.String p0) throws android.os.RemoteException;
    public boolean enableNoAutoConnect(java.lang.String p0) throws android.os.RemoteException;
    public boolean disable(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public int getState() throws android.os.RemoteException;
    public android.bluetooth.IBluetoothGatt getBluetoothGatt() throws android.os.RemoteException;
    public boolean bindBluetoothProfileService(int p0, android.bluetooth.IBluetoothProfileServiceConnection p1) throws android.os.RemoteException;
    public void unbindBluetoothProfileService(int p0, android.bluetooth.IBluetoothProfileServiceConnection p1) throws android.os.RemoteException;
    public java.lang.String getAddress() throws android.os.RemoteException;
    public java.lang.String getName() throws android.os.RemoteException;
    public boolean onFactoryReset() throws android.os.RemoteException;
    public boolean isBleScanAlwaysAvailable() throws android.os.RemoteException;
    public boolean enableBle(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException;
    public boolean disableBle(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException;
    public boolean isBleAppPresent() throws android.os.RemoteException;
    public boolean isHearingAidProfileSupported() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getSystemConfigEnabledProfilesForPackage(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.IBluetoothManager {
        public Default() {}
        public android.bluetooth.IBluetooth registerAdapter(android.bluetooth.IBluetoothManagerCallback p0) throws android.os.RemoteException { return null; }
        public void unregisterAdapter(android.bluetooth.IBluetoothManagerCallback p0) throws android.os.RemoteException {}
        public void registerStateChangeCallback(android.bluetooth.IBluetoothStateChangeCallback p0) throws android.os.RemoteException {}
        public void unregisterStateChangeCallback(android.bluetooth.IBluetoothStateChangeCallback p0) throws android.os.RemoteException {}
        public boolean isEnabled() throws android.os.RemoteException { return false; }
        public boolean enable(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean enableNoAutoConnect(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean disable(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
        public int getState() throws android.os.RemoteException { return 0; }
        public android.bluetooth.IBluetoothGatt getBluetoothGatt() throws android.os.RemoteException { return null; }
        public boolean bindBluetoothProfileService(int p0, android.bluetooth.IBluetoothProfileServiceConnection p1) throws android.os.RemoteException { return false; }
        public void unbindBluetoothProfileService(int p0, android.bluetooth.IBluetoothProfileServiceConnection p1) throws android.os.RemoteException {}
        public java.lang.String getAddress() throws android.os.RemoteException { return null; }
        public java.lang.String getName() throws android.os.RemoteException { return null; }
        public boolean onFactoryReset() throws android.os.RemoteException { return false; }
        public boolean isBleScanAlwaysAvailable() throws android.os.RemoteException { return false; }
        public boolean enableBle(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException { return false; }
        public boolean disableBle(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException { return false; }
        public boolean isBleAppPresent() throws android.os.RemoteException { return false; }
        public boolean isHearingAidProfileSupported() throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getSystemConfigEnabledProfilesForPackage(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothManager {
        private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothManager";
        static final int TRANSACTION_registerAdapter = 1;
        static final int TRANSACTION_unregisterAdapter = 2;
        static final int TRANSACTION_registerStateChangeCallback = 3;
        static final int TRANSACTION_unregisterStateChangeCallback = 4;
        static final int TRANSACTION_isEnabled = 5;
        static final int TRANSACTION_enable = 6;
        static final int TRANSACTION_enableNoAutoConnect = 7;
        static final int TRANSACTION_disable = 8;
        static final int TRANSACTION_getState = 9;
        static final int TRANSACTION_getBluetoothGatt = 10;
        static final int TRANSACTION_bindBluetoothProfileService = 11;
        static final int TRANSACTION_unbindBluetoothProfileService = 12;
        static final int TRANSACTION_getAddress = 13;
        static final int TRANSACTION_getName = 14;
        static final int TRANSACTION_onFactoryReset = 15;
        static final int TRANSACTION_isBleScanAlwaysAvailable = 16;
        static final int TRANSACTION_enableBle = 17;
        static final int TRANSACTION_disableBle = 18;
        static final int TRANSACTION_isBleAppPresent = 19;
        static final int TRANSACTION_isHearingAidProfileSupported = 20;
        static final int TRANSACTION_getSystemConfigEnabledProfilesForPackage = 21;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothManager p0) { return false; }
        public static android.bluetooth.IBluetoothManager getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothManager {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.bluetooth.IBluetooth registerAdapter(android.bluetooth.IBluetoothManagerCallback p0) throws android.os.RemoteException { return null; }
            public void unregisterAdapter(android.bluetooth.IBluetoothManagerCallback p0) throws android.os.RemoteException {}
            public void registerStateChangeCallback(android.bluetooth.IBluetoothStateChangeCallback p0) throws android.os.RemoteException {}
            public void unregisterStateChangeCallback(android.bluetooth.IBluetoothStateChangeCallback p0) throws android.os.RemoteException {}
            public boolean isEnabled() throws android.os.RemoteException { return false; }
            public boolean enable(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean enableNoAutoConnect(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean disable(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
            public int getState() throws android.os.RemoteException { return 0; }
            public android.bluetooth.IBluetoothGatt getBluetoothGatt() throws android.os.RemoteException { return null; }
            public boolean bindBluetoothProfileService(int p0, android.bluetooth.IBluetoothProfileServiceConnection p1) throws android.os.RemoteException { return false; }
            public void unbindBluetoothProfileService(int p0, android.bluetooth.IBluetoothProfileServiceConnection p1) throws android.os.RemoteException {}
            public java.lang.String getAddress() throws android.os.RemoteException { return null; }
            public java.lang.String getName() throws android.os.RemoteException { return null; }
            public boolean onFactoryReset() throws android.os.RemoteException { return false; }
            public boolean isBleScanAlwaysAvailable() throws android.os.RemoteException { return false; }
            public boolean enableBle(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException { return false; }
            public boolean disableBle(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException { return false; }
            public boolean isBleAppPresent() throws android.os.RemoteException { return false; }
            public boolean isHearingAidProfileSupported() throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getSystemConfigEnabledProfilesForPackage(java.lang.String p0) throws android.os.RemoteException { return null; }
        }
    }
}
