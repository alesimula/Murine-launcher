package android.service.contentcapture;

public interface IDataShareCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.contentcapture.IDataShareCallback";
    public void accept(android.service.contentcapture.IDataShareReadAdapter p0) throws android.os.RemoteException;
    public void reject() throws android.os.RemoteException;

    public static class Default implements android.service.contentcapture.IDataShareCallback {
        public Default() {}
        public void accept(android.service.contentcapture.IDataShareReadAdapter p0) throws android.os.RemoteException {}
        public void reject() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.contentcapture.IDataShareCallback {
        static final int TRANSACTION_accept = 1;
        static final int TRANSACTION_reject = 2;
        public Stub() { super(); }
        public static android.service.contentcapture.IDataShareCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.contentcapture.IDataShareCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void accept(android.service.contentcapture.IDataShareReadAdapter p0) throws android.os.RemoteException {}
            public void reject() throws android.os.RemoteException {}
        }
    }
}
