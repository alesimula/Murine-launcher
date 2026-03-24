package android.media;

public interface IMediaHTTPConnection extends android.os.IInterface {
    public android.os.IBinder connect(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void disconnect() throws android.os.RemoteException;
    public int readAt(long p0, int p1) throws android.os.RemoteException;
    public long getSize() throws android.os.RemoteException;
    public java.lang.String getMIMEType() throws android.os.RemoteException;
    public java.lang.String getUri() throws android.os.RemoteException;

    public static class Default implements android.media.IMediaHTTPConnection {
        public Default() {}
        public android.os.IBinder connect(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void disconnect() throws android.os.RemoteException {}
        public int readAt(long p0, int p1) throws android.os.RemoteException { return 0; }
        public long getSize() throws android.os.RemoteException { return 0L; }
        public java.lang.String getMIMEType() throws android.os.RemoteException { return null; }
        public java.lang.String getUri() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IMediaHTTPConnection {
        private static final java.lang.String DESCRIPTOR = "android.media.IMediaHTTPConnection";
        static final int TRANSACTION_connect = 1;
        static final int TRANSACTION_disconnect = 2;
        static final int TRANSACTION_readAt = 3;
        static final int TRANSACTION_getSize = 4;
        static final int TRANSACTION_getMIMEType = 5;
        static final int TRANSACTION_getUri = 6;
        public Stub() { super(); }
        public static android.media.IMediaHTTPConnection asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.IMediaHTTPConnection p0) { return false; }
        public static android.media.IMediaHTTPConnection getDefaultImpl() { return null; }

        private static class Proxy implements android.media.IMediaHTTPConnection {
            private android.os.IBinder mRemote;
            public static android.media.IMediaHTTPConnection sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.IBinder connect(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void disconnect() throws android.os.RemoteException {}
            public int readAt(long p0, int p1) throws android.os.RemoteException { return 0; }
            public long getSize() throws android.os.RemoteException { return 0L; }
            public java.lang.String getMIMEType() throws android.os.RemoteException { return null; }
            public java.lang.String getUri() throws android.os.RemoteException { return null; }
        }
    }
}
