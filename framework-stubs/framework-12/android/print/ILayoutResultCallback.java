package android.print;

public interface ILayoutResultCallback extends android.os.IInterface {
    public void onLayoutStarted(android.os.ICancellationSignal p0, int p1) throws android.os.RemoteException;
    public void onLayoutFinished(android.print.PrintDocumentInfo p0, boolean p1, int p2) throws android.os.RemoteException;
    public void onLayoutFailed(java.lang.CharSequence p0, int p1) throws android.os.RemoteException;
    public void onLayoutCanceled(int p0) throws android.os.RemoteException;

    public static class Default implements android.print.ILayoutResultCallback {
        public Default() {}
        public void onLayoutStarted(android.os.ICancellationSignal p0, int p1) throws android.os.RemoteException {}
        public void onLayoutFinished(android.print.PrintDocumentInfo p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void onLayoutFailed(java.lang.CharSequence p0, int p1) throws android.os.RemoteException {}
        public void onLayoutCanceled(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.print.ILayoutResultCallback {
        public static final java.lang.String DESCRIPTOR = "android.print.ILayoutResultCallback";
        static final int TRANSACTION_onLayoutStarted = 1;
        static final int TRANSACTION_onLayoutFinished = 2;
        static final int TRANSACTION_onLayoutFailed = 3;
        static final int TRANSACTION_onLayoutCanceled = 4;
        public Stub() { super(); }
        public static android.print.ILayoutResultCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.print.ILayoutResultCallback p0) { return false; }
        public static android.print.ILayoutResultCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.print.ILayoutResultCallback {
            private android.os.IBinder mRemote;
            public static android.print.ILayoutResultCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onLayoutStarted(android.os.ICancellationSignal p0, int p1) throws android.os.RemoteException {}
            public void onLayoutFinished(android.print.PrintDocumentInfo p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void onLayoutFailed(java.lang.CharSequence p0, int p1) throws android.os.RemoteException {}
            public void onLayoutCanceled(int p0) throws android.os.RemoteException {}
        }
    }
}
