package android.print;

public interface IPrintJobStateChangeListener extends android.os.IInterface {
    public void onPrintJobStateChanged(android.print.PrintJobId p0) throws android.os.RemoteException;

    public static class Default implements android.print.IPrintJobStateChangeListener {
        public Default() {}
        public void onPrintJobStateChanged(android.print.PrintJobId p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.print.IPrintJobStateChangeListener {
        public static final java.lang.String DESCRIPTOR = "android.print.IPrintJobStateChangeListener";
        static final int TRANSACTION_onPrintJobStateChanged = 1;
        public Stub() { super(); }
        public static android.print.IPrintJobStateChangeListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.print.IPrintJobStateChangeListener p0) { return false; }
        public static android.print.IPrintJobStateChangeListener getDefaultImpl() { return null; }

        private static class Proxy implements android.print.IPrintJobStateChangeListener {
            private android.os.IBinder mRemote;
            public static android.print.IPrintJobStateChangeListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onPrintJobStateChanged(android.print.PrintJobId p0) throws android.os.RemoteException {}
        }
    }
}
