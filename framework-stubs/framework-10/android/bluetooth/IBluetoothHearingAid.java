package android.bluetooth;

public interface IBluetoothHearingAid extends android.os.IInterface {
    public static final int HI_SYNC_ID_INVALID = 0;
    public static final int SIDE_LEFT = 0;
    public static final int SIDE_RIGHT = 1;
    public static final int MODE_MONAURAL = 0;
    public static final int MODE_BINAURAL = 1;
    public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException;
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException;
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public java.util.List<android.bluetooth.BluetoothDevice> getActiveDevices() throws android.os.RemoteException;
    public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException;
    public int getPriority(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public void adjustVolume(int p0) throws android.os.RemoteException;
    public void setVolume(int p0) throws android.os.RemoteException;
    public int getVolume() throws android.os.RemoteException;
    public long getHiSyncId(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public int getDeviceSide(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public int getDeviceMode(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothHearingAid {
        private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothHearingAid";
        static final int TRANSACTION_connect = 1;
        static final int TRANSACTION_disconnect = 2;
        static final int TRANSACTION_getConnectedDevices = 3;
        static final int TRANSACTION_getDevicesMatchingConnectionStates = 4;
        static final int TRANSACTION_getConnectionState = 5;
        static final int TRANSACTION_setActiveDevice = 6;
        static final int TRANSACTION_getActiveDevices = 7;
        static final int TRANSACTION_setPriority = 8;
        static final int TRANSACTION_getPriority = 9;
        static final int TRANSACTION_adjustVolume = 10;
        static final int TRANSACTION_setVolume = 11;
        static final int TRANSACTION_getVolume = 12;
        static final int TRANSACTION_getHiSyncId = 13;
        static final int TRANSACTION_getDeviceSide = 14;
        static final int TRANSACTION_getDeviceMode = 15;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothHearingAid asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothHearingAid p0) { return false; }
        public static android.bluetooth.IBluetoothHearingAid getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothHearingAid {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothHearingAid sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
            public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
            public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public java.util.List<android.bluetooth.BluetoothDevice> getActiveDevices() throws android.os.RemoteException { return null; }
            public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
            public int getPriority(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public void adjustVolume(int p0) throws android.os.RemoteException {}
            public void setVolume(int p0) throws android.os.RemoteException {}
            public int getVolume() throws android.os.RemoteException { return 0; }
            public long getHiSyncId(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0L; }
            public int getDeviceSide(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public int getDeviceMode(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        }
    }

    public static class Default implements android.bluetooth.IBluetoothHearingAid {
        public Default() {}
        public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
        public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
        public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public java.util.List<android.bluetooth.BluetoothDevice> getActiveDevices() throws android.os.RemoteException { return null; }
        public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
        public int getPriority(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public void adjustVolume(int p0) throws android.os.RemoteException {}
        public void setVolume(int p0) throws android.os.RemoteException {}
        public int getVolume() throws android.os.RemoteException { return 0; }
        public long getHiSyncId(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0L; }
        public int getDeviceSide(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public int getDeviceMode(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }
}
