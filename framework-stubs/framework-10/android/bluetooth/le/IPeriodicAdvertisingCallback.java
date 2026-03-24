package android.bluetooth.le;

public interface IPeriodicAdvertisingCallback extends android.os.IInterface {
    public void onSyncEstablished(int p0, android.bluetooth.BluetoothDevice p1, int p2, int p3, int p4, int p5) throws android.os.RemoteException;
    public void onPeriodicAdvertisingReport(android.bluetooth.le.PeriodicAdvertisingReport p0) throws android.os.RemoteException;
    public void onSyncLost(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.le.IPeriodicAdvertisingCallback {
        private static final java.lang.String DESCRIPTOR = "android.bluetooth.le.IPeriodicAdvertisingCallback";
        static final int TRANSACTION_onSyncEstablished = 1;
        static final int TRANSACTION_onPeriodicAdvertisingReport = 2;
        static final int TRANSACTION_onSyncLost = 3;
        public Stub() { super(); }
        public static android.bluetooth.le.IPeriodicAdvertisingCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.le.IPeriodicAdvertisingCallback p0) { return false; }
        public static android.bluetooth.le.IPeriodicAdvertisingCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.le.IPeriodicAdvertisingCallback {
            private android.os.IBinder mRemote;
            public static android.bluetooth.le.IPeriodicAdvertisingCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSyncEstablished(int p0, android.bluetooth.BluetoothDevice p1, int p2, int p3, int p4, int p5) throws android.os.RemoteException {}
            public void onPeriodicAdvertisingReport(android.bluetooth.le.PeriodicAdvertisingReport p0) throws android.os.RemoteException {}
            public void onSyncLost(int p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.bluetooth.le.IPeriodicAdvertisingCallback {
        public Default() {}
        public void onSyncEstablished(int p0, android.bluetooth.BluetoothDevice p1, int p2, int p3, int p4, int p5) throws android.os.RemoteException {}
        public void onPeriodicAdvertisingReport(android.bluetooth.le.PeriodicAdvertisingReport p0) throws android.os.RemoteException {}
        public void onSyncLost(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
