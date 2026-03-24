package android.content.pm;

public interface IOtaDexopt extends android.os.IInterface {
    public void prepare() throws android.os.RemoteException;
    public void cleanup() throws android.os.RemoteException;
    public boolean isDone() throws android.os.RemoteException;
    public float getProgress() throws android.os.RemoteException;
    public void dexoptNextPackage() throws android.os.RemoteException;
    public java.lang.String nextDexoptCommand() throws android.os.RemoteException;

    public static class Default implements android.content.pm.IOtaDexopt {
        public Default() {}
        public void prepare() throws android.os.RemoteException {}
        public void cleanup() throws android.os.RemoteException {}
        public boolean isDone() throws android.os.RemoteException { return false; }
        public float getProgress() throws android.os.RemoteException { return 0.0f; }
        public void dexoptNextPackage() throws android.os.RemoteException {}
        public java.lang.String nextDexoptCommand() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IOtaDexopt {
        private static final java.lang.String DESCRIPTOR = "android.content.pm.IOtaDexopt";
        static final int TRANSACTION_prepare = 1;
        static final int TRANSACTION_cleanup = 2;
        static final int TRANSACTION_isDone = 3;
        static final int TRANSACTION_getProgress = 4;
        static final int TRANSACTION_dexoptNextPackage = 5;
        static final int TRANSACTION_nextDexoptCommand = 6;
        public Stub() { super(); }
        public static android.content.pm.IOtaDexopt asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.IOtaDexopt p0) { return false; }
        public static android.content.pm.IOtaDexopt getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.IOtaDexopt {
            private android.os.IBinder mRemote;
            public static android.content.pm.IOtaDexopt sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void prepare() throws android.os.RemoteException {}
            public void cleanup() throws android.os.RemoteException {}
            public boolean isDone() throws android.os.RemoteException { return false; }
            public float getProgress() throws android.os.RemoteException { return 0.0f; }
            public void dexoptNextPackage() throws android.os.RemoteException {}
            public java.lang.String nextDexoptCommand() throws android.os.RemoteException { return null; }
        }
    }
}
