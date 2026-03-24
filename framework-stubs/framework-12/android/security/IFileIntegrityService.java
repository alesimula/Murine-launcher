package android.security;

public interface IFileIntegrityService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.IFileIntegrityService";
    public boolean isApkVeritySupported() throws android.os.RemoteException;
    public boolean isAppSourceCertificateTrusted(byte[] p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements android.security.IFileIntegrityService {
        public Default() {}
        public boolean isApkVeritySupported() throws android.os.RemoteException { return false; }
        public boolean isAppSourceCertificateTrusted(byte[] p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.IFileIntegrityService {
        static final int TRANSACTION_isApkVeritySupported = 1;
        static final int TRANSACTION_isAppSourceCertificateTrusted = 2;
        public Stub() { super(); }
        public static android.security.IFileIntegrityService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.security.IFileIntegrityService p0) { return false; }
        public static android.security.IFileIntegrityService getDefaultImpl() { return null; }

        private static class Proxy implements android.security.IFileIntegrityService {
            private android.os.IBinder mRemote;
            public static android.security.IFileIntegrityService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isApkVeritySupported() throws android.os.RemoteException { return false; }
            public boolean isAppSourceCertificateTrusted(byte[] p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        }
    }
}
