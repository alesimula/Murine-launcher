package android.print;

public interface IWriteResultCallback extends android.os.IInterface {
    public void onWriteStarted(android.os.ICancellationSignal p0, int p1) throws android.os.RemoteException;
    public void onWriteFinished(android.print.PageRange[] p0, int p1) throws android.os.RemoteException;
    public void onWriteFailed(java.lang.CharSequence p0, int p1) throws android.os.RemoteException;
    public void onWriteCanceled(int p0) throws android.os.RemoteException;

    public static class Default implements android.print.IWriteResultCallback {
        public Default() {}
        public void onWriteStarted(android.os.ICancellationSignal p0, int p1) throws android.os.RemoteException {}
        public void onWriteFinished(android.print.PageRange[] p0, int p1) throws android.os.RemoteException {}
        public void onWriteFailed(java.lang.CharSequence p0, int p1) throws android.os.RemoteException {}
        public void onWriteCanceled(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.print.IWriteResultCallback {
        private static final java.lang.String DESCRIPTOR = "android.print.IWriteResultCallback";
        static final int TRANSACTION_onWriteStarted = 1;
        static final int TRANSACTION_onWriteFinished = 2;
        static final int TRANSACTION_onWriteFailed = 3;
        static final int TRANSACTION_onWriteCanceled = 4;
        public Stub() { super(); }
        public static android.print.IWriteResultCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.print.IWriteResultCallback p0) { return false; }
        public static android.print.IWriteResultCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.print.IWriteResultCallback {
            private android.os.IBinder mRemote;
            public static android.print.IWriteResultCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onWriteStarted(android.os.ICancellationSignal p0, int p1) throws android.os.RemoteException {}
            public void onWriteFinished(android.print.PageRange[] p0, int p1) throws android.os.RemoteException {}
            public void onWriteFailed(java.lang.CharSequence p0, int p1) throws android.os.RemoteException {}
            public void onWriteCanceled(int p0) throws android.os.RemoteException {}
        }
    }
}
