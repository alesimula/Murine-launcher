package android.media.tv.extension.servicedb;

public interface IServiceListSetChannelListSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.servicedb.IServiceListSetChannelListSession";
    public int setChannelList(android.os.Bundle[] p0, android.os.Bundle p1, int p2) throws android.os.RemoteException;
    public int release() throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.servicedb.IServiceListSetChannelListSession {
        public Default() {}
        public int setChannelList(android.os.Bundle[] p0, android.os.Bundle p1, int p2) throws android.os.RemoteException { return 0; }
        public int release() throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.servicedb.IServiceListSetChannelListSession {
        static final int TRANSACTION_setChannelList = 1;
        static final int TRANSACTION_release = 2;
        public Stub() { super(); }
        public static android.media.tv.extension.servicedb.IServiceListSetChannelListSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.servicedb.IServiceListSetChannelListSession {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int setChannelList(android.os.Bundle[] p0, android.os.Bundle p1, int p2) throws android.os.RemoteException { return 0; }
            public int release() throws android.os.RemoteException { return 0; }
        }
    }
}
