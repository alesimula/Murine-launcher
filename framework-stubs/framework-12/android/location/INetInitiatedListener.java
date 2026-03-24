package android.location;

public interface INetInitiatedListener extends android.os.IInterface {
    public boolean sendNiResponse(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.location.INetInitiatedListener {
        public Default() {}
        public boolean sendNiResponse(int p0, int p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.location.INetInitiatedListener {
        public static final java.lang.String DESCRIPTOR = "android.location.INetInitiatedListener";
        static final int TRANSACTION_sendNiResponse = 1;
        public Stub() { super(); }
        public static android.location.INetInitiatedListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.location.INetInitiatedListener p0) { return false; }
        public static android.location.INetInitiatedListener getDefaultImpl() { return null; }

        private static class Proxy implements android.location.INetInitiatedListener {
            private android.os.IBinder mRemote;
            public static android.location.INetInitiatedListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean sendNiResponse(int p0, int p1) throws android.os.RemoteException { return false; }
        }
    }
}
