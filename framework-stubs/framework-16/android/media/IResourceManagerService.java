package android.media;

public interface IResourceManagerService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.IResourceManagerService";
    public static final java.lang.String kPolicySupportsMultipleSecureCodecs = "supports-multiple-secure-codecs";
    public static final java.lang.String kPolicySupportsSecureWithNonSecureCodec = "supports-secure-with-non-secure-codec";
    public void config(android.media.MediaResourcePolicyParcel[] p0) throws android.os.RemoteException;
    public void addResource(android.media.ClientInfoParcel p0, android.media.IResourceManagerClient p1, android.media.MediaResourceParcel[] p2) throws android.os.RemoteException;
    public void updateResource(android.media.ClientInfoParcel p0, android.media.MediaResourceParcel[] p1) throws android.os.RemoteException;
    public void removeResource(android.media.ClientInfoParcel p0, android.media.MediaResourceParcel[] p1) throws android.os.RemoteException;
    public void removeClient(android.media.ClientInfoParcel p0) throws android.os.RemoteException;
    public boolean reclaimResource(android.media.ClientInfoParcel p0, android.media.MediaResourceParcel[] p1) throws android.os.RemoteException;
    public void overridePid(int p0, int p1) throws android.os.RemoteException;
    public void overrideProcessInfo(android.media.IResourceManagerClient p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void markClientForPendingRemoval(android.media.ClientInfoParcel p0) throws android.os.RemoteException;
    public void reclaimResourcesFromClientsPendingRemoval(int p0) throws android.os.RemoteException;
    public void notifyClientCreated(android.media.ClientInfoParcel p0) throws android.os.RemoteException;
    public void notifyClientStarted(android.media.ClientConfigParcel p0) throws android.os.RemoteException;
    public void notifyClientStopped(android.media.ClientConfigParcel p0) throws android.os.RemoteException;
    public void notifyClientConfigChanged(android.media.ClientConfigParcel p0) throws android.os.RemoteException;
    public void getMediaResourceUsageReport(android.media.MediaResourceParcel[] p0) throws android.os.RemoteException;

    public static class Default implements android.media.IResourceManagerService {
        public Default() {}
        public void config(android.media.MediaResourcePolicyParcel[] p0) throws android.os.RemoteException {}
        public void addResource(android.media.ClientInfoParcel p0, android.media.IResourceManagerClient p1, android.media.MediaResourceParcel[] p2) throws android.os.RemoteException {}
        public void updateResource(android.media.ClientInfoParcel p0, android.media.MediaResourceParcel[] p1) throws android.os.RemoteException {}
        public void removeResource(android.media.ClientInfoParcel p0, android.media.MediaResourceParcel[] p1) throws android.os.RemoteException {}
        public void removeClient(android.media.ClientInfoParcel p0) throws android.os.RemoteException {}
        public boolean reclaimResource(android.media.ClientInfoParcel p0, android.media.MediaResourceParcel[] p1) throws android.os.RemoteException { return false; }
        public void overridePid(int p0, int p1) throws android.os.RemoteException {}
        public void overrideProcessInfo(android.media.IResourceManagerClient p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void markClientForPendingRemoval(android.media.ClientInfoParcel p0) throws android.os.RemoteException {}
        public void reclaimResourcesFromClientsPendingRemoval(int p0) throws android.os.RemoteException {}
        public void notifyClientCreated(android.media.ClientInfoParcel p0) throws android.os.RemoteException {}
        public void notifyClientStarted(android.media.ClientConfigParcel p0) throws android.os.RemoteException {}
        public void notifyClientStopped(android.media.ClientConfigParcel p0) throws android.os.RemoteException {}
        public void notifyClientConfigChanged(android.media.ClientConfigParcel p0) throws android.os.RemoteException {}
        public void getMediaResourceUsageReport(android.media.MediaResourceParcel[] p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IResourceManagerService {
        static final int TRANSACTION_config = 1;
        static final int TRANSACTION_addResource = 2;
        static final int TRANSACTION_updateResource = 3;
        static final int TRANSACTION_removeResource = 4;
        static final int TRANSACTION_removeClient = 5;
        static final int TRANSACTION_reclaimResource = 6;
        static final int TRANSACTION_overridePid = 7;
        static final int TRANSACTION_overrideProcessInfo = 8;
        static final int TRANSACTION_markClientForPendingRemoval = 9;
        static final int TRANSACTION_reclaimResourcesFromClientsPendingRemoval = 10;
        static final int TRANSACTION_notifyClientCreated = 11;
        static final int TRANSACTION_notifyClientStarted = 12;
        static final int TRANSACTION_notifyClientStopped = 13;
        static final int TRANSACTION_notifyClientConfigChanged = 14;
        static final int TRANSACTION_getMediaResourceUsageReport = 15;
        public Stub() { super(); }
        public static android.media.IResourceManagerService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.IResourceManagerService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void config(android.media.MediaResourcePolicyParcel[] p0) throws android.os.RemoteException {}
            public void addResource(android.media.ClientInfoParcel p0, android.media.IResourceManagerClient p1, android.media.MediaResourceParcel[] p2) throws android.os.RemoteException {}
            public void updateResource(android.media.ClientInfoParcel p0, android.media.MediaResourceParcel[] p1) throws android.os.RemoteException {}
            public void removeResource(android.media.ClientInfoParcel p0, android.media.MediaResourceParcel[] p1) throws android.os.RemoteException {}
            public void removeClient(android.media.ClientInfoParcel p0) throws android.os.RemoteException {}
            public boolean reclaimResource(android.media.ClientInfoParcel p0, android.media.MediaResourceParcel[] p1) throws android.os.RemoteException { return false; }
            public void overridePid(int p0, int p1) throws android.os.RemoteException {}
            public void overrideProcessInfo(android.media.IResourceManagerClient p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void markClientForPendingRemoval(android.media.ClientInfoParcel p0) throws android.os.RemoteException {}
            public void reclaimResourcesFromClientsPendingRemoval(int p0) throws android.os.RemoteException {}
            public void notifyClientCreated(android.media.ClientInfoParcel p0) throws android.os.RemoteException {}
            public void notifyClientStarted(android.media.ClientConfigParcel p0) throws android.os.RemoteException {}
            public void notifyClientStopped(android.media.ClientConfigParcel p0) throws android.os.RemoteException {}
            public void notifyClientConfigChanged(android.media.ClientConfigParcel p0) throws android.os.RemoteException {}
            public void getMediaResourceUsageReport(android.media.MediaResourceParcel[] p0) throws android.os.RemoteException {}
        }
    }
}
