package android.bluetooth;

public interface IBluetoothAvrcpController extends android.os.IInterface {
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException;
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException;
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public android.bluetooth.BluetoothAvrcpPlayerSettings getPlayerSettings(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean setPlayerApplicationSetting(android.bluetooth.BluetoothAvrcpPlayerSettings p0) throws android.os.RemoteException;
    public void sendGroupNavigationCmd(android.bluetooth.BluetoothDevice p0, int p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.IBluetoothAvrcpController {
        public Default() {}
        public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
        public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
        public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public android.bluetooth.BluetoothAvrcpPlayerSettings getPlayerSettings(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
        public boolean setPlayerApplicationSetting(android.bluetooth.BluetoothAvrcpPlayerSettings p0) throws android.os.RemoteException { return false; }
        public void sendGroupNavigationCmd(android.bluetooth.BluetoothDevice p0, int p1, int p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothAvrcpController {
        private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothAvrcpController";
        static final int TRANSACTION_getConnectedDevices = 1;
        static final int TRANSACTION_getDevicesMatchingConnectionStates = 2;
        static final int TRANSACTION_getConnectionState = 3;
        static final int TRANSACTION_getPlayerSettings = 4;
        static final int TRANSACTION_setPlayerApplicationSetting = 5;
        static final int TRANSACTION_sendGroupNavigationCmd = 6;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothAvrcpController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothAvrcpController p0) { return false; }
        public static android.bluetooth.IBluetoothAvrcpController getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothAvrcpController {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothAvrcpController sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
            public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
            public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public android.bluetooth.BluetoothAvrcpPlayerSettings getPlayerSettings(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
            public boolean setPlayerApplicationSetting(android.bluetooth.BluetoothAvrcpPlayerSettings p0) throws android.os.RemoteException { return false; }
            public void sendGroupNavigationCmd(android.bluetooth.BluetoothDevice p0, int p1, int p2) throws android.os.RemoteException {}
        }
    }
}
