package android.service.contentcapture;

public interface IDataShareReadAdapter extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.contentcapture.IDataShareReadAdapter";
    public void start(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException;
    public void error(int p0) throws android.os.RemoteException;
    public void finish() throws android.os.RemoteException;

    public static class Default implements android.service.contentcapture.IDataShareReadAdapter {
        public Default() {}
        public void start(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
        public void error(int p0) throws android.os.RemoteException {}
        public void finish() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.contentcapture.IDataShareReadAdapter {
        static final int TRANSACTION_start = 1;
        static final int TRANSACTION_error = 2;
        static final int TRANSACTION_finish = 3;
        public Stub() { super(); }
        public static android.service.contentcapture.IDataShareReadAdapter asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.contentcapture.IDataShareReadAdapter {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void start(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
            public void error(int p0) throws android.os.RemoteException {}
            public void finish() throws android.os.RemoteException {}
        }
    }
}
