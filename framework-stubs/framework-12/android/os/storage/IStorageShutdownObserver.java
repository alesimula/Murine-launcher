package android.os.storage;

public interface IStorageShutdownObserver extends android.os.IInterface {
    public void onShutDownComplete(int p0) throws android.os.RemoteException;

    public static class Default implements android.os.storage.IStorageShutdownObserver {
        public Default() {}
        public void onShutDownComplete(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.storage.IStorageShutdownObserver {
        public static final java.lang.String DESCRIPTOR = "android.os.storage.IStorageShutdownObserver";
        static final int TRANSACTION_onShutDownComplete = 1;
        public Stub() { super(); }
        public static android.os.storage.IStorageShutdownObserver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.storage.IStorageShutdownObserver p0) { return false; }
        public static android.os.storage.IStorageShutdownObserver getDefaultImpl() { return null; }

        private static class Proxy implements android.os.storage.IStorageShutdownObserver {
            private android.os.IBinder mRemote;
            public static android.os.storage.IStorageShutdownObserver sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onShutDownComplete(int p0) throws android.os.RemoteException {}
        }
    }
}
