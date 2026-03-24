package android.bluetooth;

public interface IBluetoothPan extends android.os.IInterface {
    public boolean isTetheringOn() throws android.os.RemoteException;
    public void setBluetoothTethering(boolean p0) throws android.os.RemoteException;
    public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException;
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException;
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothPan {
        private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothPan";
        static final int TRANSACTION_isTetheringOn = 1;
        static final int TRANSACTION_setBluetoothTethering = 2;
        static final int TRANSACTION_connect = 3;
        static final int TRANSACTION_disconnect = 4;
        static final int TRANSACTION_getConnectedDevices = 5;
        static final int TRANSACTION_getDevicesMatchingConnectionStates = 6;
        static final int TRANSACTION_getConnectionState = 7;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothPan asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothPan p0) { return false; }
        public static android.bluetooth.IBluetoothPan getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothPan {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothPan sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isTetheringOn() throws android.os.RemoteException { return false; }
            public void setBluetoothTethering(boolean p0) throws android.os.RemoteException {}
            public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
            public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
            public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        }
    }

    public static class Default implements android.bluetooth.IBluetoothPan {
        public Default() {}
        public boolean isTetheringOn() throws android.os.RemoteException { return false; }
        public void setBluetoothTethering(boolean p0) throws android.os.RemoteException {}
        public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
        public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
        public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }
}
