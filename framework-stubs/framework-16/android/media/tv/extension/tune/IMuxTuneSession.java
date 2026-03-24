package android.media.tv.extension.tune;

public interface IMuxTuneSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.tune.IMuxTuneSession";
    public void start(int p0, int p1, int p2, android.os.Bundle p3) throws android.os.RemoteException;
    public void stop() throws android.os.RemoteException;
    public void release() throws android.os.RemoteException;
    public java.lang.String getSessionToken() throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.tune.IMuxTuneSession {
        public Default() {}
        public void start(int p0, int p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public void stop() throws android.os.RemoteException {}
        public void release() throws android.os.RemoteException {}
        public java.lang.String getSessionToken() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.tune.IMuxTuneSession {
        static final int TRANSACTION_start = 1;
        static final int TRANSACTION_stop = 2;
        static final int TRANSACTION_release = 3;
        static final int TRANSACTION_getSessionToken = 4;
        public Stub() { super(); }
        public static android.media.tv.extension.tune.IMuxTuneSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.tune.IMuxTuneSession {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void start(int p0, int p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
            public void stop() throws android.os.RemoteException {}
            public void release() throws android.os.RemoteException {}
            public java.lang.String getSessionToken() throws android.os.RemoteException { return null; }
        }
    }
}
