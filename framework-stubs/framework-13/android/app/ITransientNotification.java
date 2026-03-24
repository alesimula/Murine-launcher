package android.app;

public interface ITransientNotification extends android.os.IInterface {
    public void show(android.os.IBinder p0) throws android.os.RemoteException;
    public void hide() throws android.os.RemoteException;

    public static class Default implements android.app.ITransientNotification {
        public Default() {}
        public void show(android.os.IBinder p0) throws android.os.RemoteException {}
        public void hide() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.ITransientNotification {
        public static final java.lang.String DESCRIPTOR = "android.app.ITransientNotification";
        static final int TRANSACTION_show = 1;
        static final int TRANSACTION_hide = 2;
        public Stub() { super(); }
        public static android.app.ITransientNotification asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.ITransientNotification {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void show(android.os.IBinder p0) throws android.os.RemoteException {}
            public void hide() throws android.os.RemoteException {}
        }
    }
}
