package android.media;

public interface IMediaRouterClient extends android.os.IInterface {
    public void onStateChanged() throws android.os.RemoteException;
    public void onRestoreRoute() throws android.os.RemoteException;
    public void onGroupRouteSelected(java.lang.String p0) throws android.os.RemoteException;
    public void onGlobalA2dpChanged(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.media.IMediaRouterClient {
        public Default() {}
        public void onStateChanged() throws android.os.RemoteException {}
        public void onRestoreRoute() throws android.os.RemoteException {}
        public void onGroupRouteSelected(java.lang.String p0) throws android.os.RemoteException {}
        public void onGlobalA2dpChanged(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IMediaRouterClient {
        public static final java.lang.String DESCRIPTOR = "android.media.IMediaRouterClient";
        static final int TRANSACTION_onStateChanged = 1;
        static final int TRANSACTION_onRestoreRoute = 2;
        static final int TRANSACTION_onGroupRouteSelected = 3;
        static final int TRANSACTION_onGlobalA2dpChanged = 4;
        public Stub() { super(); }
        public static android.media.IMediaRouterClient asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.IMediaRouterClient p0) { return false; }
        public static android.media.IMediaRouterClient getDefaultImpl() { return null; }

        private static class Proxy implements android.media.IMediaRouterClient {
            private android.os.IBinder mRemote;
            public static android.media.IMediaRouterClient sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStateChanged() throws android.os.RemoteException {}
            public void onRestoreRoute() throws android.os.RemoteException {}
            public void onGroupRouteSelected(java.lang.String p0) throws android.os.RemoteException {}
            public void onGlobalA2dpChanged(boolean p0) throws android.os.RemoteException {}
        }
    }
}
