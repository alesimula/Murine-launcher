package android.print;

public interface IPrinterDiscoveryObserver extends android.os.IInterface {
    public void onPrintersAdded(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException;
    public void onPrintersRemoved(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException;

    public static class Default implements android.print.IPrinterDiscoveryObserver {
        public Default() {}
        public void onPrintersAdded(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException {}
        public void onPrintersRemoved(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.print.IPrinterDiscoveryObserver {
        public static final java.lang.String DESCRIPTOR = "android.print.IPrinterDiscoveryObserver";
        static final int TRANSACTION_onPrintersAdded = 1;
        static final int TRANSACTION_onPrintersRemoved = 2;
        public Stub() { super(); }
        public static android.print.IPrinterDiscoveryObserver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.print.IPrinterDiscoveryObserver p0) { return false; }
        public static android.print.IPrinterDiscoveryObserver getDefaultImpl() { return null; }

        private static class Proxy implements android.print.IPrinterDiscoveryObserver {
            private android.os.IBinder mRemote;
            public static android.print.IPrinterDiscoveryObserver sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onPrintersAdded(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException {}
            public void onPrintersRemoved(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException {}
        }
    }
}
