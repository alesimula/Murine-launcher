package android.service.storage;

public interface IExternalStorageService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.storage.IExternalStorageService";
    public void startSession(java.lang.String p0, int p1, android.os.ParcelFileDescriptor p2, java.lang.String p3, java.lang.String p4, android.os.RemoteCallback p5) throws android.os.RemoteException;
    public void endSession(java.lang.String p0, android.os.RemoteCallback p1) throws android.os.RemoteException;
    public void notifyVolumeStateChanged(java.lang.String p0, android.os.storage.StorageVolume p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
    public void freeCache(java.lang.String p0, java.lang.String p1, long p2, android.os.RemoteCallback p3) throws android.os.RemoteException;
    public void notifyAnrDelayStarted(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;

    public static class Default implements android.service.storage.IExternalStorageService {
        public Default() {}
        public void startSession(java.lang.String p0, int p1, android.os.ParcelFileDescriptor p2, java.lang.String p3, java.lang.String p4, android.os.RemoteCallback p5) throws android.os.RemoteException {}
        public void endSession(java.lang.String p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        public void notifyVolumeStateChanged(java.lang.String p0, android.os.storage.StorageVolume p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public void freeCache(java.lang.String p0, java.lang.String p1, long p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
        public void notifyAnrDelayStarted(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.storage.IExternalStorageService {
        static final int TRANSACTION_startSession = 1;
        static final int TRANSACTION_endSession = 2;
        static final int TRANSACTION_notifyVolumeStateChanged = 3;
        static final int TRANSACTION_freeCache = 4;
        static final int TRANSACTION_notifyAnrDelayStarted = 5;
        public Stub() { super(); }
        public static android.service.storage.IExternalStorageService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.storage.IExternalStorageService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void startSession(java.lang.String p0, int p1, android.os.ParcelFileDescriptor p2, java.lang.String p3, java.lang.String p4, android.os.RemoteCallback p5) throws android.os.RemoteException {}
            public void endSession(java.lang.String p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
            public void notifyVolumeStateChanged(java.lang.String p0, android.os.storage.StorageVolume p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
            public void freeCache(java.lang.String p0, java.lang.String p1, long p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
            public void notifyAnrDelayStarted(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        }
    }
}
