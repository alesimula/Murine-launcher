package android.service.quicksettings;

public interface IQSService extends android.os.IInterface {
    public android.service.quicksettings.Tile getTile(android.os.IBinder p0) throws android.os.RemoteException;
    public void updateQsTile(android.service.quicksettings.Tile p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void updateStatusIcon(android.os.IBinder p0, android.graphics.drawable.Icon p1, java.lang.String p2) throws android.os.RemoteException;
    public void onShowDialog(android.os.IBinder p0) throws android.os.RemoteException;
    public void onStartActivity(android.os.IBinder p0) throws android.os.RemoteException;
    public void startActivity(android.os.IBinder p0, android.app.PendingIntent p1) throws android.os.RemoteException;
    public boolean isLocked() throws android.os.RemoteException;
    public boolean isSecure() throws android.os.RemoteException;
    public void startUnlockAndRun(android.os.IBinder p0) throws android.os.RemoteException;
    public void onDialogHidden(android.os.IBinder p0) throws android.os.RemoteException;
    public void onStartSuccessful(android.os.IBinder p0) throws android.os.RemoteException;

    public static class Default implements android.service.quicksettings.IQSService {
        public Default() {}
        public android.service.quicksettings.Tile getTile(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public void updateQsTile(android.service.quicksettings.Tile p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void updateStatusIcon(android.os.IBinder p0, android.graphics.drawable.Icon p1, java.lang.String p2) throws android.os.RemoteException {}
        public void onShowDialog(android.os.IBinder p0) throws android.os.RemoteException {}
        public void onStartActivity(android.os.IBinder p0) throws android.os.RemoteException {}
        public void startActivity(android.os.IBinder p0, android.app.PendingIntent p1) throws android.os.RemoteException {}
        public boolean isLocked() throws android.os.RemoteException { return false; }
        public boolean isSecure() throws android.os.RemoteException { return false; }
        public void startUnlockAndRun(android.os.IBinder p0) throws android.os.RemoteException {}
        public void onDialogHidden(android.os.IBinder p0) throws android.os.RemoteException {}
        public void onStartSuccessful(android.os.IBinder p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.quicksettings.IQSService {
        public static final java.lang.String DESCRIPTOR = "android.service.quicksettings.IQSService";
        static final int TRANSACTION_getTile = 1;
        static final int TRANSACTION_updateQsTile = 2;
        static final int TRANSACTION_updateStatusIcon = 3;
        static final int TRANSACTION_onShowDialog = 4;
        static final int TRANSACTION_onStartActivity = 5;
        static final int TRANSACTION_startActivity = 6;
        static final int TRANSACTION_isLocked = 7;
        static final int TRANSACTION_isSecure = 8;
        static final int TRANSACTION_startUnlockAndRun = 9;
        static final int TRANSACTION_onDialogHidden = 10;
        static final int TRANSACTION_onStartSuccessful = 11;
        public Stub() { super(); }
        public static android.service.quicksettings.IQSService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.quicksettings.IQSService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.service.quicksettings.Tile getTile(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public void updateQsTile(android.service.quicksettings.Tile p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void updateStatusIcon(android.os.IBinder p0, android.graphics.drawable.Icon p1, java.lang.String p2) throws android.os.RemoteException {}
            public void onShowDialog(android.os.IBinder p0) throws android.os.RemoteException {}
            public void onStartActivity(android.os.IBinder p0) throws android.os.RemoteException {}
            public void startActivity(android.os.IBinder p0, android.app.PendingIntent p1) throws android.os.RemoteException {}
            public boolean isLocked() throws android.os.RemoteException { return false; }
            public boolean isSecure() throws android.os.RemoteException { return false; }
            public void startUnlockAndRun(android.os.IBinder p0) throws android.os.RemoteException {}
            public void onDialogHidden(android.os.IBinder p0) throws android.os.RemoteException {}
            public void onStartSuccessful(android.os.IBinder p0) throws android.os.RemoteException {}
        }
    }
}
