package android.app;

public interface IGameManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.IGameManager";
    public int getGameMode() throws android.os.RemoteException;

    public static class Default implements android.app.IGameManager {
        public Default() {}
        public int getGameMode() throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IGameManager {
        static final int TRANSACTION_getGameMode = 1;
        public Stub() { super(); }
        public static android.app.IGameManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IGameManager p0) { return false; }
        public static android.app.IGameManager getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IGameManager {
            private android.os.IBinder mRemote;
            public static android.app.IGameManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int getGameMode() throws android.os.RemoteException { return 0; }
        }
    }
}
