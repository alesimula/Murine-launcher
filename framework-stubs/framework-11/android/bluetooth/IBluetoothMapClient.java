package android.bluetooth;

public interface IBluetoothMapClient extends android.os.IInterface {
    public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean isConnected(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException;
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException;
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException;
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean sendMessage(android.bluetooth.BluetoothDevice p0, android.net.Uri[] p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4) throws android.os.RemoteException;
    public boolean getUnreadMessages(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public int getSupportedFeatures(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.IBluetoothMapClient {
        public Default() {}
        public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean isConnected(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
        public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
        public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
        public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public boolean sendMessage(android.bluetooth.BluetoothDevice p0, android.net.Uri[] p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4) throws android.os.RemoteException { return false; }
        public boolean getUnreadMessages(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public int getSupportedFeatures(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothMapClient {
        private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothMapClient";
        static final int TRANSACTION_connect = 1;
        static final int TRANSACTION_disconnect = 2;
        static final int TRANSACTION_isConnected = 3;
        static final int TRANSACTION_getConnectedDevices = 4;
        static final int TRANSACTION_getDevicesMatchingConnectionStates = 5;
        static final int TRANSACTION_getConnectionState = 6;
        static final int TRANSACTION_setConnectionPolicy = 7;
        static final int TRANSACTION_getConnectionPolicy = 8;
        static final int TRANSACTION_sendMessage = 9;
        static final int TRANSACTION_getUnreadMessages = 10;
        static final int TRANSACTION_getSupportedFeatures = 11;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothMapClient asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothMapClient p0) { return false; }
        public static android.bluetooth.IBluetoothMapClient getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothMapClient {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothMapClient sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean isConnected(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
            public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
            public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
            public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public boolean sendMessage(android.bluetooth.BluetoothDevice p0, android.net.Uri[] p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4) throws android.os.RemoteException { return false; }
            public boolean getUnreadMessages(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public int getSupportedFeatures(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        }
    }
}
