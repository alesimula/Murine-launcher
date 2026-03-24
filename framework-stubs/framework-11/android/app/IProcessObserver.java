package android.app;

public interface IProcessObserver extends android.os.IInterface {
    public void onForegroundActivitiesChanged(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public void onForegroundServicesChanged(int p0, int p1, int p2) throws android.os.RemoteException;
    public void onProcessDied(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.app.IProcessObserver {
        public Default() {}
        public void onForegroundActivitiesChanged(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void onForegroundServicesChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void onProcessDied(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IProcessObserver {
        private static final java.lang.String DESCRIPTOR = "android.app.IProcessObserver";
        static final int TRANSACTION_onForegroundActivitiesChanged = 1;
        static final int TRANSACTION_onForegroundServicesChanged = 2;
        static final int TRANSACTION_onProcessDied = 3;
        public Stub() { super(); }
        public static android.app.IProcessObserver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IProcessObserver p0) { return false; }
        public static android.app.IProcessObserver getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IProcessObserver {
            private android.os.IBinder mRemote;
            public static android.app.IProcessObserver sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onForegroundActivitiesChanged(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void onForegroundServicesChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void onProcessDied(int p0, int p1) throws android.os.RemoteException {}
        }
    }
}
