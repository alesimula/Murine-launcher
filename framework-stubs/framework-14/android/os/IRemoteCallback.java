package android.os;

public interface IRemoteCallback extends android.os.IInterface {
    public void sendResult(android.os.Bundle p0) throws android.os.RemoteException;

    public static class Default implements android.os.IRemoteCallback {
        public Default() {}
        public void sendResult(android.os.Bundle p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IRemoteCallback {
        public static final java.lang.String DESCRIPTOR = "android.os.IRemoteCallback";
        static final int TRANSACTION_sendResult = 1;
        public Stub() { super(); }
        public static android.os.IRemoteCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.IRemoteCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void sendResult(android.os.Bundle p0) throws android.os.RemoteException {}
        }
    }
}
