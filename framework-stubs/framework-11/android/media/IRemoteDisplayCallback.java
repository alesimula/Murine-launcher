package android.media;

public interface IRemoteDisplayCallback extends android.os.IInterface {
    public void onStateChanged(android.media.RemoteDisplayState p0) throws android.os.RemoteException;

    public static class Default implements android.media.IRemoteDisplayCallback {
        public Default() {}
        public void onStateChanged(android.media.RemoteDisplayState p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IRemoteDisplayCallback {
        private static final java.lang.String DESCRIPTOR = "android.media.IRemoteDisplayCallback";
        static final int TRANSACTION_onStateChanged = 1;
        public Stub() { super(); }
        public static android.media.IRemoteDisplayCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.IRemoteDisplayCallback p0) { return false; }
        public static android.media.IRemoteDisplayCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.media.IRemoteDisplayCallback {
            private android.os.IBinder mRemote;
            public static android.media.IRemoteDisplayCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStateChanged(android.media.RemoteDisplayState p0) throws android.os.RemoteException {}
        }
    }
}
