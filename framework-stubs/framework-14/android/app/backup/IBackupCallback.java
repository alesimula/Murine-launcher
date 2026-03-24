package android.app.backup;

public interface IBackupCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.backup.IBackupCallback";
    public void operationComplete(long p0) throws android.os.RemoteException;

    public static class Default implements android.app.backup.IBackupCallback {
        public Default() {}
        public void operationComplete(long p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.backup.IBackupCallback {
        static final int TRANSACTION_operationComplete = 1;
        public Stub() { super(); }
        public static android.app.backup.IBackupCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.backup.IBackupCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void operationComplete(long p0) throws android.os.RemoteException {}
        }
    }
}
