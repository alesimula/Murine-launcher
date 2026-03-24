package android.app;

public interface IWindowToken extends android.os.IInterface {
    public void onConfigurationChanged(android.content.res.Configuration p0, int p1) throws android.os.RemoteException;
    public void onWindowTokenRemoved() throws android.os.RemoteException;

    public static class Default implements android.app.IWindowToken {
        public Default() {}
        public void onConfigurationChanged(android.content.res.Configuration p0, int p1) throws android.os.RemoteException {}
        public void onWindowTokenRemoved() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IWindowToken {
        private static final java.lang.String DESCRIPTOR = "android.app.IWindowToken";
        static final int TRANSACTION_onConfigurationChanged = 1;
        static final int TRANSACTION_onWindowTokenRemoved = 2;
        public Stub() { super(); }
        public static android.app.IWindowToken asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IWindowToken p0) { return false; }
        public static android.app.IWindowToken getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IWindowToken {
            private android.os.IBinder mRemote;
            public static android.app.IWindowToken sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onConfigurationChanged(android.content.res.Configuration p0, int p1) throws android.os.RemoteException {}
            public void onWindowTokenRemoved() throws android.os.RemoteException {}
        }
    }
}
