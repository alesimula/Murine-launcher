package android.bluetooth;

public interface IBluetoothManagerCallback extends android.os.IInterface {
    public void onBluetoothServiceUp(android.bluetooth.IBluetooth p0) throws android.os.RemoteException;
    public void onBluetoothServiceDown() throws android.os.RemoteException;
    public void onBrEdrDown() throws android.os.RemoteException;

    public static class Default implements android.bluetooth.IBluetoothManagerCallback {
        public Default() {}
        public void onBluetoothServiceUp(android.bluetooth.IBluetooth p0) throws android.os.RemoteException {}
        public void onBluetoothServiceDown() throws android.os.RemoteException {}
        public void onBrEdrDown() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothManagerCallback {
        public static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothManagerCallback";
        static final int TRANSACTION_onBluetoothServiceUp = 1;
        static final int TRANSACTION_onBluetoothServiceDown = 2;
        static final int TRANSACTION_onBrEdrDown = 3;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothManagerCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothManagerCallback p0) { return false; }
        public static android.bluetooth.IBluetoothManagerCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothManagerCallback {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothManagerCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onBluetoothServiceUp(android.bluetooth.IBluetooth p0) throws android.os.RemoteException {}
            public void onBluetoothServiceDown() throws android.os.RemoteException {}
            public void onBrEdrDown() throws android.os.RemoteException {}
        }
    }
}
