package android.media.tv.extension.servicedb;

public interface IServiceListImportSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.servicedb.IServiceListImportSession";
    public int importServiceList(android.os.ParcelFileDescriptor p0, android.os.Bundle p1) throws android.os.RemoteException;
    public int preload(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException;
    public int release() throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.servicedb.IServiceListImportSession {
        public Default() {}
        public int importServiceList(android.os.ParcelFileDescriptor p0, android.os.Bundle p1) throws android.os.RemoteException { return 0; }
        public int preload(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException { return 0; }
        public int release() throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.servicedb.IServiceListImportSession {
        static final int TRANSACTION_importServiceList = 1;
        static final int TRANSACTION_preload = 2;
        static final int TRANSACTION_release = 3;
        public Stub() { super(); }
        public static android.media.tv.extension.servicedb.IServiceListImportSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.servicedb.IServiceListImportSession {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int importServiceList(android.os.ParcelFileDescriptor p0, android.os.Bundle p1) throws android.os.RemoteException { return 0; }
            public int preload(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException { return 0; }
            public int release() throws android.os.RemoteException { return 0; }
        }
    }
}
