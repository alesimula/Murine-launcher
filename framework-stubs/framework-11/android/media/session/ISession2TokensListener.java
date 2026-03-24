package android.media.session;

public interface ISession2TokensListener extends android.os.IInterface {
    public void onSession2TokensChanged(java.util.List<android.media.Session2Token> p0) throws android.os.RemoteException;

    public static class Default implements android.media.session.ISession2TokensListener {
        public Default() {}
        public void onSession2TokensChanged(java.util.List<android.media.Session2Token> p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.session.ISession2TokensListener {
        private static final java.lang.String DESCRIPTOR = "android.media.session.ISession2TokensListener";
        static final int TRANSACTION_onSession2TokensChanged = 1;
        public Stub() { super(); }
        public static android.media.session.ISession2TokensListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.session.ISession2TokensListener p0) { return false; }
        public static android.media.session.ISession2TokensListener getDefaultImpl() { return null; }

        private static class Proxy implements android.media.session.ISession2TokensListener {
            private android.os.IBinder mRemote;
            public static android.media.session.ISession2TokensListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSession2TokensChanged(java.util.List<android.media.Session2Token> p0) throws android.os.RemoteException {}
        }
    }
}
