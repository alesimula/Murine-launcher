package android.hardware.location;

public interface IContextHubClient extends android.os.IInterface {
    public int sendMessageToNanoApp(android.hardware.location.NanoAppMessage p0) throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    public int getId() throws android.os.RemoteException;

    public static class Default implements android.hardware.location.IContextHubClient {
        public Default() {}
        public int sendMessageToNanoApp(android.hardware.location.NanoAppMessage p0) throws android.os.RemoteException { return 0; }
        public void close() throws android.os.RemoteException {}
        public int getId() throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.location.IContextHubClient {
        public static final java.lang.String DESCRIPTOR = "android.hardware.location.IContextHubClient";
        static final int TRANSACTION_sendMessageToNanoApp = 1;
        static final int TRANSACTION_close = 2;
        static final int TRANSACTION_getId = 3;
        public Stub() { super(); }
        public static android.hardware.location.IContextHubClient asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.location.IContextHubClient {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int sendMessageToNanoApp(android.hardware.location.NanoAppMessage p0) throws android.os.RemoteException { return 0; }
            public void close() throws android.os.RemoteException {}
            public int getId() throws android.os.RemoteException { return 0; }
        }
    }
}
