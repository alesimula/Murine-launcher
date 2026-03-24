package android.print;

public interface IPrintServicesChangeListener extends android.os.IInterface {
    public void onPrintServicesChanged() throws android.os.RemoteException;

    public static class Default implements android.print.IPrintServicesChangeListener {
        public Default() {}
        public void onPrintServicesChanged() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.print.IPrintServicesChangeListener {
        public static final java.lang.String DESCRIPTOR = "android.print.IPrintServicesChangeListener";
        static final int TRANSACTION_onPrintServicesChanged = 1;
        public Stub() { super(); }
        public static android.print.IPrintServicesChangeListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.print.IPrintServicesChangeListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onPrintServicesChanged() throws android.os.RemoteException {}
        }
    }
}
