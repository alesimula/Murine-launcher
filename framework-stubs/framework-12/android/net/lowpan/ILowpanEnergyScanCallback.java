package android.net.lowpan;

public interface ILowpanEnergyScanCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.lowpan.ILowpanEnergyScanCallback";
    public void onEnergyScanResult(int p0, int p1) throws android.os.RemoteException;
    public void onEnergyScanFinished() throws android.os.RemoteException;

    public static class Default implements android.net.lowpan.ILowpanEnergyScanCallback {
        public Default() {}
        public void onEnergyScanResult(int p0, int p1) throws android.os.RemoteException {}
        public void onEnergyScanFinished() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.lowpan.ILowpanEnergyScanCallback {
        static final int TRANSACTION_onEnergyScanResult = 1;
        static final int TRANSACTION_onEnergyScanFinished = 2;
        public Stub() { super(); }
        public static android.net.lowpan.ILowpanEnergyScanCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.lowpan.ILowpanEnergyScanCallback p0) { return false; }
        public static android.net.lowpan.ILowpanEnergyScanCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.net.lowpan.ILowpanEnergyScanCallback {
            private android.os.IBinder mRemote;
            public static android.net.lowpan.ILowpanEnergyScanCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onEnergyScanResult(int p0, int p1) throws android.os.RemoteException {}
            public void onEnergyScanFinished() throws android.os.RemoteException {}
        }
    }
}
