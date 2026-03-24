package android.media;

public interface IResourceManagerClient extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.IResourceManagerClient";
    public boolean reclaimResource() throws android.os.RemoteException;
    public java.lang.String getName() throws android.os.RemoteException;

    public static class Default implements android.media.IResourceManagerClient {
        public Default() {}
        public boolean reclaimResource() throws android.os.RemoteException { return false; }
        public java.lang.String getName() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IResourceManagerClient {
        static final int TRANSACTION_reclaimResource = 1;
        static final int TRANSACTION_getName = 2;
        public Stub() { super(); }
        public static android.media.IResourceManagerClient asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.IResourceManagerClient {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean reclaimResource() throws android.os.RemoteException { return false; }
            public java.lang.String getName() throws android.os.RemoteException { return null; }
        }
    }
}
