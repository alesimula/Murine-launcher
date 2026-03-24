package com.android.internal.backup;

public interface IObbBackupService extends android.os.IInterface {
    public void backupObbs(java.lang.String p0, android.os.ParcelFileDescriptor p1, int p2, android.app.backup.IBackupManager p3) throws android.os.RemoteException;
    public void restoreObbFile(java.lang.String p0, android.os.ParcelFileDescriptor p1, long p2, int p3, java.lang.String p4, long p5, long p6, int p7, android.app.backup.IBackupManager p8) throws android.os.RemoteException;

    public static class Default implements com.android.internal.backup.IObbBackupService {
        public Default() {}
        public void backupObbs(java.lang.String p0, android.os.ParcelFileDescriptor p1, int p2, android.app.backup.IBackupManager p3) throws android.os.RemoteException {}
        public void restoreObbFile(java.lang.String p0, android.os.ParcelFileDescriptor p1, long p2, int p3, java.lang.String p4, long p5, long p6, int p7, android.app.backup.IBackupManager p8) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.backup.IObbBackupService {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.backup.IObbBackupService";
        static final int TRANSACTION_backupObbs = 1;
        static final int TRANSACTION_restoreObbFile = 2;
        public Stub() { super(); }
        public static com.android.internal.backup.IObbBackupService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.backup.IObbBackupService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void backupObbs(java.lang.String p0, android.os.ParcelFileDescriptor p1, int p2, android.app.backup.IBackupManager p3) throws android.os.RemoteException {}
            public void restoreObbFile(java.lang.String p0, android.os.ParcelFileDescriptor p1, long p2, int p3, java.lang.String p4, long p5, long p6, int p7, android.app.backup.IBackupManager p8) throws android.os.RemoteException {}
        }
    }
}
