package android.bluetooth;

public interface IBluetoothConnectionCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothConnectionCallback";
    public void onDeviceConnected(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public void onDeviceDisconnected(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.IBluetoothConnectionCallback {
        public Default() {}
        public void onDeviceConnected(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException {}
        public void onDeviceDisconnected(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothConnectionCallback {
        static final int TRANSACTION_onDeviceConnected = 1;
        static final int TRANSACTION_onDeviceDisconnected = 2;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothConnectionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothConnectionCallback p0) { return false; }
        public static android.bluetooth.IBluetoothConnectionCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothConnectionCallback {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothConnectionCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDeviceConnected(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException {}
            public void onDeviceDisconnected(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException {}
        }
    }
}
