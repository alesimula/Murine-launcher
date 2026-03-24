package android.hardware.location;

public interface IContextHubClientCallback extends android.os.IInterface {
    public void onMessageFromNanoApp(android.hardware.location.NanoAppMessage p0) throws android.os.RemoteException;
    public void onHubReset() throws android.os.RemoteException;
    public void onNanoAppAborted(long p0, int p1) throws android.os.RemoteException;
    public void onNanoAppLoaded(long p0) throws android.os.RemoteException;
    public void onNanoAppUnloaded(long p0) throws android.os.RemoteException;
    public void onNanoAppEnabled(long p0) throws android.os.RemoteException;
    public void onNanoAppDisabled(long p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.location.IContextHubClientCallback {
        public Default() {}
        public void onMessageFromNanoApp(android.hardware.location.NanoAppMessage p0) throws android.os.RemoteException {}
        public void onHubReset() throws android.os.RemoteException {}
        public void onNanoAppAborted(long p0, int p1) throws android.os.RemoteException {}
        public void onNanoAppLoaded(long p0) throws android.os.RemoteException {}
        public void onNanoAppUnloaded(long p0) throws android.os.RemoteException {}
        public void onNanoAppEnabled(long p0) throws android.os.RemoteException {}
        public void onNanoAppDisabled(long p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.location.IContextHubClientCallback {
        private static final java.lang.String DESCRIPTOR = "android.hardware.location.IContextHubClientCallback";
        static final int TRANSACTION_onMessageFromNanoApp = 1;
        static final int TRANSACTION_onHubReset = 2;
        static final int TRANSACTION_onNanoAppAborted = 3;
        static final int TRANSACTION_onNanoAppLoaded = 4;
        static final int TRANSACTION_onNanoAppUnloaded = 5;
        static final int TRANSACTION_onNanoAppEnabled = 6;
        static final int TRANSACTION_onNanoAppDisabled = 7;
        public Stub() { super(); }
        public static android.hardware.location.IContextHubClientCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.location.IContextHubClientCallback p0) { return false; }
        public static android.hardware.location.IContextHubClientCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.location.IContextHubClientCallback {
            private android.os.IBinder mRemote;
            public static android.hardware.location.IContextHubClientCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onMessageFromNanoApp(android.hardware.location.NanoAppMessage p0) throws android.os.RemoteException {}
            public void onHubReset() throws android.os.RemoteException {}
            public void onNanoAppAborted(long p0, int p1) throws android.os.RemoteException {}
            public void onNanoAppLoaded(long p0) throws android.os.RemoteException {}
            public void onNanoAppUnloaded(long p0) throws android.os.RemoteException {}
            public void onNanoAppEnabled(long p0) throws android.os.RemoteException {}
            public void onNanoAppDisabled(long p0) throws android.os.RemoteException {}
        }
    }
}
