package android.service.games;

public interface IGameServiceController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.games.IGameServiceController";
    @android.annotation.EnforcePermission("android.permission.MANAGE_GAME_ACTIVITY")
    public void createGameSession(int p0) throws android.os.RemoteException;

    public static class Default implements android.service.games.IGameServiceController {
        public Default() {}
        public void createGameSession(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.games.IGameServiceController {
        static final int TRANSACTION_createGameSession = 1;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.service.games.IGameServiceController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void createGameSession_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.games.IGameServiceController {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void createGameSession(int p0) throws android.os.RemoteException {}
        }
    }
}
