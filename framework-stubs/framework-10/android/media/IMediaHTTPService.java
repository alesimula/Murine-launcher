package android.media;

public interface IMediaHTTPService extends android.os.IInterface {
    public android.media.IMediaHTTPConnection makeHTTPConnection() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.media.IMediaHTTPService {
        private static final java.lang.String DESCRIPTOR = "android.media.IMediaHTTPService";
        static final int TRANSACTION_makeHTTPConnection = 1;
        public Stub() { super(); }
        public static android.media.IMediaHTTPService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.IMediaHTTPService p0) { return false; }
        public static android.media.IMediaHTTPService getDefaultImpl() { return null; }

        private static class Proxy implements android.media.IMediaHTTPService {
            private android.os.IBinder mRemote;
            public static android.media.IMediaHTTPService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.media.IMediaHTTPConnection makeHTTPConnection() throws android.os.RemoteException { return null; }
        }
    }

    public static class Default implements android.media.IMediaHTTPService {
        public Default() {}
        public android.media.IMediaHTTPConnection makeHTTPConnection() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }
}
