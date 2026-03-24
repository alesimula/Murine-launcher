package android.app.backup;

public interface IBackupManagerMonitor extends android.os.IInterface {
    public void onEvent(android.os.Bundle p0) throws android.os.RemoteException;

    public static class Default implements android.app.backup.IBackupManagerMonitor {
        public Default() {}
        public void onEvent(android.os.Bundle p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.backup.IBackupManagerMonitor {
        public static final java.lang.String DESCRIPTOR = "android.app.backup.IBackupManagerMonitor";
        static final int TRANSACTION_onEvent = 1;
        public Stub() { super(); }
        public static android.app.backup.IBackupManagerMonitor asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.backup.IBackupManagerMonitor p0) { return false; }
        public static android.app.backup.IBackupManagerMonitor getDefaultImpl() { return null; }

        private static class Proxy implements android.app.backup.IBackupManagerMonitor {
            private android.os.IBinder mRemote;
            public static android.app.backup.IBackupManagerMonitor sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onEvent(android.os.Bundle p0) throws android.os.RemoteException {}
        }
    }
}
