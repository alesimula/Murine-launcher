package android.service.games;

public interface IGameSessionController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.games.IGameSessionController";
    public void takeScreenshot(int p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_GAME_ACTIVITY")
    public void restartGame(int p0) throws android.os.RemoteException;

    public static class Default implements android.service.games.IGameSessionController {
        public Default() {}
        public void takeScreenshot(int p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException {}
        public void restartGame(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.games.IGameSessionController {
        static final int TRANSACTION_takeScreenshot = 1;
        static final int TRANSACTION_restartGame = 2;
        public Stub() { super(); }
        public static android.service.games.IGameSessionController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.games.IGameSessionController {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void takeScreenshot(int p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException {}
            public void restartGame(int p0) throws android.os.RemoteException {}
        }
    }
}
