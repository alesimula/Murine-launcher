package android.bluetooth;

public interface IBluetoothPbap extends android.os.IInterface {
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException;
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException;
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public void disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.IBluetoothPbap {
        public Default() {}
        public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
        public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
        public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public void disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException {}
        public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothPbap {
        private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothPbap";
        static final int TRANSACTION_getConnectedDevices = 1;
        static final int TRANSACTION_getDevicesMatchingConnectionStates = 2;
        static final int TRANSACTION_getConnectionState = 3;
        static final int TRANSACTION_disconnect = 4;
        static final int TRANSACTION_setConnectionPolicy = 5;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothPbap asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothPbap p0) { return false; }
        public static android.bluetooth.IBluetoothPbap getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothPbap {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothPbap sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
            public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
            public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public void disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException {}
            public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
        }
    }
}
