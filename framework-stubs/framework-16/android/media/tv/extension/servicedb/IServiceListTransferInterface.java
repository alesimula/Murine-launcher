package android.media.tv.extension.servicedb;

public interface IServiceListTransferInterface extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.servicedb.IServiceListTransferInterface";
    public android.os.IBinder createExportSession(android.media.tv.extension.servicedb.IServiceListExportListener p0) throws android.os.RemoteException;
    public android.os.IBinder createImportSession(android.media.tv.extension.servicedb.IServiceListImportListener p0) throws android.os.RemoteException;
    public android.os.IBinder createSetChannelListSession(android.media.tv.extension.servicedb.IServiceListSetChannelListListener p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.servicedb.IServiceListTransferInterface {
        public Default() {}
        public android.os.IBinder createExportSession(android.media.tv.extension.servicedb.IServiceListExportListener p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder createImportSession(android.media.tv.extension.servicedb.IServiceListImportListener p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder createSetChannelListSession(android.media.tv.extension.servicedb.IServiceListSetChannelListListener p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.servicedb.IServiceListTransferInterface {
        static final int TRANSACTION_createExportSession = 1;
        static final int TRANSACTION_createImportSession = 2;
        static final int TRANSACTION_createSetChannelListSession = 3;
        public Stub() { super(); }
        public static android.media.tv.extension.servicedb.IServiceListTransferInterface asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.servicedb.IServiceListTransferInterface {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.IBinder createExportSession(android.media.tv.extension.servicedb.IServiceListExportListener p0) throws android.os.RemoteException { return null; }
            public android.os.IBinder createImportSession(android.media.tv.extension.servicedb.IServiceListImportListener p0) throws android.os.RemoteException { return null; }
            public android.os.IBinder createSetChannelListSession(android.media.tv.extension.servicedb.IServiceListSetChannelListListener p0) throws android.os.RemoteException { return null; }
        }
    }
}
