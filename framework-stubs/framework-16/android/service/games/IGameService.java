package android.service.games;

public interface IGameService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.games.IGameService";
    @android.annotation.RequiresNoPermission
    public void connected(android.service.games.IGameServiceController p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void disconnected() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void gameStarted(android.service.games.GameStartedEvent p0) throws android.os.RemoteException;

    public static class Default implements android.service.games.IGameService {
        public Default() {}
        public void connected(android.service.games.IGameServiceController p0) throws android.os.RemoteException {}
        public void disconnected() throws android.os.RemoteException {}
        public void gameStarted(android.service.games.GameStartedEvent p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.games.IGameService {
        static final int TRANSACTION_connected = 1;
        static final int TRANSACTION_disconnected = 2;
        static final int TRANSACTION_gameStarted = 3;
        public Stub() { super(); }
        public static android.service.games.IGameService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.games.IGameService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void connected(android.service.games.IGameServiceController p0) throws android.os.RemoteException {}
            public void disconnected() throws android.os.RemoteException {}
            public void gameStarted(android.service.games.GameStartedEvent p0) throws android.os.RemoteException {}
        }
    }
}
