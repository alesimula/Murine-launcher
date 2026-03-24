package android.net.lowpan;

public interface ILowpanNetScanCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.lowpan.ILowpanNetScanCallback";
    public void onNetScanBeacon(android.net.lowpan.LowpanBeaconInfo p0) throws android.os.RemoteException;
    public void onNetScanFinished() throws android.os.RemoteException;

    public static class Default implements android.net.lowpan.ILowpanNetScanCallback {
        public Default() {}
        public void onNetScanBeacon(android.net.lowpan.LowpanBeaconInfo p0) throws android.os.RemoteException {}
        public void onNetScanFinished() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.lowpan.ILowpanNetScanCallback {
        static final int TRANSACTION_onNetScanBeacon = 1;
        static final int TRANSACTION_onNetScanFinished = 2;
        public Stub() { super(); }
        public static android.net.lowpan.ILowpanNetScanCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.lowpan.ILowpanNetScanCallback p0) { return false; }
        public static android.net.lowpan.ILowpanNetScanCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.net.lowpan.ILowpanNetScanCallback {
            private android.os.IBinder mRemote;
            public static android.net.lowpan.ILowpanNetScanCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onNetScanBeacon(android.net.lowpan.LowpanBeaconInfo p0) throws android.os.RemoteException {}
            public void onNetScanFinished() throws android.os.RemoteException {}
        }
    }
}
