package android.app;

public interface ITransientNotification extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public void show(android.os.IBinder p0) throws android.os.RemoteException;
    public void hide() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.app.ITransientNotification {
        private static final java.lang.String DESCRIPTOR = "android.app.ITransientNotification";
        static final int TRANSACTION_show = 1;
        static final int TRANSACTION_hide = 2;
        public Stub() { super(); }
        public static android.app.ITransientNotification asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.ITransientNotification p0) { return false; }
        public static android.app.ITransientNotification getDefaultImpl() { return null; }

        private static class Proxy implements android.app.ITransientNotification {
            private android.os.IBinder mRemote;
            public static android.app.ITransientNotification sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void show(android.os.IBinder p0) throws android.os.RemoteException {}
            public void hide() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.app.ITransientNotification {
        public Default() {}
        public void show(android.os.IBinder p0) throws android.os.RemoteException {}
        public void hide() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
