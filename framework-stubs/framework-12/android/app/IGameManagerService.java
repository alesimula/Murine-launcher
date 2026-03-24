package android.app;

public interface IGameManagerService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.IGameManagerService";
    public int getGameMode(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setGameMode(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public int[] getAvailableGameModes(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.app.IGameManagerService {
        public Default() {}
        public int getGameMode(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public void setGameMode(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public int[] getAvailableGameModes(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IGameManagerService {
        static final int TRANSACTION_getGameMode = 1;
        static final int TRANSACTION_setGameMode = 2;
        static final int TRANSACTION_getAvailableGameModes = 3;
        public Stub() { super(); }
        public static android.app.IGameManagerService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IGameManagerService p0) { return false; }
        public static android.app.IGameManagerService getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IGameManagerService {
            private android.os.IBinder mRemote;
            public static android.app.IGameManagerService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int getGameMode(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public void setGameMode(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public int[] getAvailableGameModes(java.lang.String p0) throws android.os.RemoteException { return null; }
        }
    }
}
