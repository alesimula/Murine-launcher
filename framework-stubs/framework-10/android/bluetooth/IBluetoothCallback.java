package android.bluetooth;

public interface IBluetoothCallback extends android.os.IInterface {
    public void onBluetoothStateChange(int p0, int p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothCallback {
        private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothCallback";
        static final int TRANSACTION_onBluetoothStateChange = 1;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothCallback p0) { return false; }
        public static android.bluetooth.IBluetoothCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothCallback {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onBluetoothStateChange(int p0, int p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.bluetooth.IBluetoothCallback {
        public Default() {}
        public void onBluetoothStateChange(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
