package android.app;

public interface IUserSwitchObserver extends android.os.IInterface {
    public void onUserSwitching(int p0, android.os.IRemoteCallback p1) throws android.os.RemoteException;
    public void onUserSwitchComplete(int p0) throws android.os.RemoteException;
    public void onForegroundProfileSwitch(int p0) throws android.os.RemoteException;
    public void onLockedBootComplete(int p0) throws android.os.RemoteException;

    public static class Default implements android.app.IUserSwitchObserver {
        public Default() {}
        public void onUserSwitching(int p0, android.os.IRemoteCallback p1) throws android.os.RemoteException {}
        public void onUserSwitchComplete(int p0) throws android.os.RemoteException {}
        public void onForegroundProfileSwitch(int p0) throws android.os.RemoteException {}
        public void onLockedBootComplete(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IUserSwitchObserver {
        private static final java.lang.String DESCRIPTOR = "android.app.IUserSwitchObserver";
        static final int TRANSACTION_onUserSwitching = 1;
        static final int TRANSACTION_onUserSwitchComplete = 2;
        static final int TRANSACTION_onForegroundProfileSwitch = 3;
        static final int TRANSACTION_onLockedBootComplete = 4;
        public Stub() { super(); }
        public static android.app.IUserSwitchObserver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IUserSwitchObserver p0) { return false; }
        public static android.app.IUserSwitchObserver getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IUserSwitchObserver {
            private android.os.IBinder mRemote;
            public static android.app.IUserSwitchObserver sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onUserSwitching(int p0, android.os.IRemoteCallback p1) throws android.os.RemoteException {}
            public void onUserSwitchComplete(int p0) throws android.os.RemoteException {}
            public void onForegroundProfileSwitch(int p0) throws android.os.RemoteException {}
            public void onLockedBootComplete(int p0) throws android.os.RemoteException {}
        }
    }
}
