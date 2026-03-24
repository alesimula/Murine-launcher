package android.app;

public interface IServiceConnection extends android.os.IInterface {
    public void connected(android.content.ComponentName p0, android.os.IBinder p1, boolean p2) throws android.os.RemoteException;

    public static class Default implements android.app.IServiceConnection {
        public Default() {}
        public void connected(android.content.ComponentName p0, android.os.IBinder p1, boolean p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IServiceConnection {
        public static final java.lang.String DESCRIPTOR = "android.app.IServiceConnection";
        static final int TRANSACTION_connected = 1;
        public Stub() { super(); }
        public static android.app.IServiceConnection asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IServiceConnection p0) { return false; }
        public static android.app.IServiceConnection getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IServiceConnection {
            private android.os.IBinder mRemote;
            public static android.app.IServiceConnection sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void connected(android.content.ComponentName p0, android.os.IBinder p1, boolean p2) throws android.os.RemoteException {}
        }
    }
}
