package android.bluetooth;

public interface IBluetoothSocketManager extends android.os.IInterface {
    public android.os.ParcelFileDescriptor connectSocket(android.bluetooth.BluetoothDevice p0, int p1, android.os.ParcelUuid p2, int p3, int p4) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor createSocketChannel(int p0, java.lang.String p1, android.os.ParcelUuid p2, int p3, int p4) throws android.os.RemoteException;
    public void requestMaximumTxDataLength(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.IBluetoothSocketManager {
        public Default() {}
        public android.os.ParcelFileDescriptor connectSocket(android.bluetooth.BluetoothDevice p0, int p1, android.os.ParcelUuid p2, int p3, int p4) throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor createSocketChannel(int p0, java.lang.String p1, android.os.ParcelUuid p2, int p3, int p4) throws android.os.RemoteException { return null; }
        public void requestMaximumTxDataLength(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothSocketManager {
        private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothSocketManager";
        static final int TRANSACTION_connectSocket = 1;
        static final int TRANSACTION_createSocketChannel = 2;
        static final int TRANSACTION_requestMaximumTxDataLength = 3;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothSocketManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothSocketManager p0) { return false; }
        public static android.bluetooth.IBluetoothSocketManager getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothSocketManager {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothSocketManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.ParcelFileDescriptor connectSocket(android.bluetooth.BluetoothDevice p0, int p1, android.os.ParcelUuid p2, int p3, int p4) throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor createSocketChannel(int p0, java.lang.String p1, android.os.ParcelUuid p2, int p3, int p4) throws android.os.RemoteException { return null; }
            public void requestMaximumTxDataLength(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException {}
        }
    }
}
