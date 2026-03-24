package android.service.games;

public interface IGameSessionService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.games.IGameSessionService";
    @android.annotation.RequiresNoPermission
    public void create(android.service.games.IGameSessionController p0, android.service.games.CreateGameSessionRequest p1, android.service.games.GameSessionViewHostConfiguration p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException;

    public static class Default implements android.service.games.IGameSessionService {
        public Default() {}
        public void create(android.service.games.IGameSessionController p0, android.service.games.CreateGameSessionRequest p1, android.service.games.GameSessionViewHostConfiguration p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.games.IGameSessionService {
        static final int TRANSACTION_create = 1;
        public Stub() { super(); }
        public static android.service.games.IGameSessionService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.games.IGameSessionService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void create(android.service.games.IGameSessionController p0, android.service.games.CreateGameSessionRequest p1, android.service.games.GameSessionViewHostConfiguration p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException {}
        }
    }
}
