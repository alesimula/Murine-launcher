package android.app.backup;

public interface IRestoreObserver extends android.os.IInterface {
    public void restoreSetsAvailable(android.app.backup.RestoreSet[] p0) throws android.os.RemoteException;
    public void restoreStarting(int p0) throws android.os.RemoteException;
    public void onUpdate(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void restoreFinished(int p0) throws android.os.RemoteException;

    public static class Default implements android.app.backup.IRestoreObserver {
        public Default() {}
        public void restoreSetsAvailable(android.app.backup.RestoreSet[] p0) throws android.os.RemoteException {}
        public void restoreStarting(int p0) throws android.os.RemoteException {}
        public void onUpdate(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void restoreFinished(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.backup.IRestoreObserver {
        public static final java.lang.String DESCRIPTOR = "android.app.backup.IRestoreObserver";
        static final int TRANSACTION_restoreSetsAvailable = 1;
        static final int TRANSACTION_restoreStarting = 2;
        static final int TRANSACTION_onUpdate = 3;
        static final int TRANSACTION_restoreFinished = 4;
        public Stub() { super(); }
        public static android.app.backup.IRestoreObserver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.backup.IRestoreObserver p0) { return false; }
        public static android.app.backup.IRestoreObserver getDefaultImpl() { return null; }

        private static class Proxy implements android.app.backup.IRestoreObserver {
            private android.os.IBinder mRemote;
            public static android.app.backup.IRestoreObserver sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void restoreSetsAvailable(android.app.backup.RestoreSet[] p0) throws android.os.RemoteException {}
            public void restoreStarting(int p0) throws android.os.RemoteException {}
            public void onUpdate(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void restoreFinished(int p0) throws android.os.RemoteException {}
        }
    }
}
