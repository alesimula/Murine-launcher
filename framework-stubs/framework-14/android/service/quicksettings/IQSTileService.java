package android.service.quicksettings;

public interface IQSTileService extends android.os.IInterface {
    public void onTileAdded() throws android.os.RemoteException;
    public void onTileRemoved() throws android.os.RemoteException;
    public void onStartListening() throws android.os.RemoteException;
    public void onStopListening() throws android.os.RemoteException;
    public void onClick(android.os.IBinder p0) throws android.os.RemoteException;
    public void onUnlockComplete() throws android.os.RemoteException;

    public static class Default implements android.service.quicksettings.IQSTileService {
        public Default() {}
        public void onTileAdded() throws android.os.RemoteException {}
        public void onTileRemoved() throws android.os.RemoteException {}
        public void onStartListening() throws android.os.RemoteException {}
        public void onStopListening() throws android.os.RemoteException {}
        public void onClick(android.os.IBinder p0) throws android.os.RemoteException {}
        public void onUnlockComplete() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.quicksettings.IQSTileService {
        public static final java.lang.String DESCRIPTOR = "android.service.quicksettings.IQSTileService";
        static final int TRANSACTION_onTileAdded = 1;
        static final int TRANSACTION_onTileRemoved = 2;
        static final int TRANSACTION_onStartListening = 3;
        static final int TRANSACTION_onStopListening = 4;
        static final int TRANSACTION_onClick = 5;
        static final int TRANSACTION_onUnlockComplete = 6;
        public Stub() { super(); }
        public static android.service.quicksettings.IQSTileService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.quicksettings.IQSTileService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onTileAdded() throws android.os.RemoteException {}
            public void onTileRemoved() throws android.os.RemoteException {}
            public void onStartListening() throws android.os.RemoteException {}
            public void onStopListening() throws android.os.RemoteException {}
            public void onClick(android.os.IBinder p0) throws android.os.RemoteException {}
            public void onUnlockComplete() throws android.os.RemoteException {}
        }
    }
}
