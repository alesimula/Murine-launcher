package android.net;

public interface ISocketKeepaliveCallback extends android.os.IInterface {
    public void onStarted(int p0) throws android.os.RemoteException;
    public void onStopped() throws android.os.RemoteException;
    public void onError(int p0) throws android.os.RemoteException;
    public void onDataReceived() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.net.ISocketKeepaliveCallback {
        private static final java.lang.String DESCRIPTOR = "android.net.ISocketKeepaliveCallback";
        static final int TRANSACTION_onStarted = 1;
        static final int TRANSACTION_onStopped = 2;
        static final int TRANSACTION_onError = 3;
        static final int TRANSACTION_onDataReceived = 4;
        public Stub() { super(); }
        public static android.net.ISocketKeepaliveCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.ISocketKeepaliveCallback p0) { return false; }
        public static android.net.ISocketKeepaliveCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.net.ISocketKeepaliveCallback {
            private android.os.IBinder mRemote;
            public static android.net.ISocketKeepaliveCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStarted(int p0) throws android.os.RemoteException {}
            public void onStopped() throws android.os.RemoteException {}
            public void onError(int p0) throws android.os.RemoteException {}
            public void onDataReceived() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.net.ISocketKeepaliveCallback {
        public Default() {}
        public void onStarted(int p0) throws android.os.RemoteException {}
        public void onStopped() throws android.os.RemoteException {}
        public void onError(int p0) throws android.os.RemoteException {}
        public void onDataReceived() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
