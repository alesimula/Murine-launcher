package android.app;

public interface IGameManagerService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.IGameManagerService";
    public int getGameMode(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setGameMode(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public int[] getAvailableGameModes(java.lang.String p0) throws android.os.RemoteException;
    public boolean isAngleEnabled(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void notifyGraphicsEnvironmentSetup(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setGameState(java.lang.String p0, android.app.GameState p1, int p2) throws android.os.RemoteException;
    public android.app.GameModeInfo getGameModeInfo(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setGameServiceProvider(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.app.IGameManagerService {
        public Default() {}
        public int getGameMode(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public void setGameMode(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public int[] getAvailableGameModes(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean isAngleEnabled(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void notifyGraphicsEnvironmentSetup(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void setGameState(java.lang.String p0, android.app.GameState p1, int p2) throws android.os.RemoteException {}
        public android.app.GameModeInfo getGameModeInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void setGameServiceProvider(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IGameManagerService {
        static final int TRANSACTION_getGameMode = 1;
        static final int TRANSACTION_setGameMode = 2;
        static final int TRANSACTION_getAvailableGameModes = 3;
        static final int TRANSACTION_isAngleEnabled = 4;
        static final int TRANSACTION_notifyGraphicsEnvironmentSetup = 5;
        static final int TRANSACTION_setGameState = 6;
        static final int TRANSACTION_getGameModeInfo = 7;
        static final int TRANSACTION_setGameServiceProvider = 8;
        public Stub() { super(); }
        public static android.app.IGameManagerService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.IGameManagerService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int getGameMode(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public void setGameMode(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public int[] getAvailableGameModes(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean isAngleEnabled(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void notifyGraphicsEnvironmentSetup(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void setGameState(java.lang.String p0, android.app.GameState p1, int p2) throws android.os.RemoteException {}
            public android.app.GameModeInfo getGameModeInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void setGameServiceProvider(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}
