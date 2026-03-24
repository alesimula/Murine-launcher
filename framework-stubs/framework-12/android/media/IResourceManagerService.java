package android.media;

public interface IResourceManagerService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.IResourceManagerService";
    public static final java.lang.String kPolicySupportsMultipleSecureCodecs = "supports-multiple-secure-codecs";
    public static final java.lang.String kPolicySupportsSecureWithNonSecureCodec = "supports-secure-with-non-secure-codec";
    public void config(android.media.MediaResourcePolicyParcel[] p0) throws android.os.RemoteException;
    public void addResource(int p0, int p1, long p2, android.media.IResourceManagerClient p3, android.media.MediaResourceParcel[] p4) throws android.os.RemoteException;
    public void removeResource(int p0, long p1, android.media.MediaResourceParcel[] p2) throws android.os.RemoteException;
    public void removeClient(int p0, long p1) throws android.os.RemoteException;
    public boolean reclaimResource(int p0, android.media.MediaResourceParcel[] p1) throws android.os.RemoteException;
    public void overridePid(int p0, int p1) throws android.os.RemoteException;
    public void overrideProcessInfo(android.media.IResourceManagerClient p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void markClientForPendingRemoval(int p0, long p1) throws android.os.RemoteException;
    public void reclaimResourcesFromClientsPendingRemoval(int p0) throws android.os.RemoteException;

    public static class Default implements android.media.IResourceManagerService {
        public Default() {}
        public void config(android.media.MediaResourcePolicyParcel[] p0) throws android.os.RemoteException {}
        public void addResource(int p0, int p1, long p2, android.media.IResourceManagerClient p3, android.media.MediaResourceParcel[] p4) throws android.os.RemoteException {}
        public void removeResource(int p0, long p1, android.media.MediaResourceParcel[] p2) throws android.os.RemoteException {}
        public void removeClient(int p0, long p1) throws android.os.RemoteException {}
        public boolean reclaimResource(int p0, android.media.MediaResourceParcel[] p1) throws android.os.RemoteException { return false; }
        public void overridePid(int p0, int p1) throws android.os.RemoteException {}
        public void overrideProcessInfo(android.media.IResourceManagerClient p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void markClientForPendingRemoval(int p0, long p1) throws android.os.RemoteException {}
        public void reclaimResourcesFromClientsPendingRemoval(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IResourceManagerService {
        static final int TRANSACTION_config = 1;
        static final int TRANSACTION_addResource = 2;
        static final int TRANSACTION_removeResource = 3;
        static final int TRANSACTION_removeClient = 4;
        static final int TRANSACTION_reclaimResource = 5;
        static final int TRANSACTION_overridePid = 6;
        static final int TRANSACTION_overrideProcessInfo = 7;
        static final int TRANSACTION_markClientForPendingRemoval = 8;
        static final int TRANSACTION_reclaimResourcesFromClientsPendingRemoval = 9;
        public Stub() { super(); }
        public static android.media.IResourceManagerService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.IResourceManagerService p0) { return false; }
        public static android.media.IResourceManagerService getDefaultImpl() { return null; }

        private static class Proxy implements android.media.IResourceManagerService {
            private android.os.IBinder mRemote;
            public static android.media.IResourceManagerService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void config(android.media.MediaResourcePolicyParcel[] p0) throws android.os.RemoteException {}
            public void addResource(int p0, int p1, long p2, android.media.IResourceManagerClient p3, android.media.MediaResourceParcel[] p4) throws android.os.RemoteException {}
            public void removeResource(int p0, long p1, android.media.MediaResourceParcel[] p2) throws android.os.RemoteException {}
            public void removeClient(int p0, long p1) throws android.os.RemoteException {}
            public boolean reclaimResource(int p0, android.media.MediaResourceParcel[] p1) throws android.os.RemoteException { return false; }
            public void overridePid(int p0, int p1) throws android.os.RemoteException {}
            public void overrideProcessInfo(android.media.IResourceManagerClient p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void markClientForPendingRemoval(int p0, long p1) throws android.os.RemoteException {}
            public void reclaimResourcesFromClientsPendingRemoval(int p0) throws android.os.RemoteException {}
        }
    }
}
