package android.bluetooth;

public interface IBluetoothOobDataCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothOobDataCallback";
    public void onOobData(int p0, android.bluetooth.OobData p1) throws android.os.RemoteException;
    public void onError(int p0) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.IBluetoothOobDataCallback {
        public Default() {}
        public void onOobData(int p0, android.bluetooth.OobData p1) throws android.os.RemoteException {}
        public void onError(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothOobDataCallback {
        static final int TRANSACTION_onOobData = 1;
        static final int TRANSACTION_onError = 2;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothOobDataCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothOobDataCallback p0) { return false; }
        public static android.bluetooth.IBluetoothOobDataCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothOobDataCallback {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothOobDataCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onOobData(int p0, android.bluetooth.OobData p1) throws android.os.RemoteException {}
            public void onError(int p0) throws android.os.RemoteException {}
        }
    }
}
