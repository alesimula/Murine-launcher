package android.view.contentcapture;

public interface IDataShareWriteAdapter extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.contentcapture.IDataShareWriteAdapter";
    public void write(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException;
    public void error(int p0) throws android.os.RemoteException;
    public void rejected() throws android.os.RemoteException;
    public void finish() throws android.os.RemoteException;

    public static class Default implements android.view.contentcapture.IDataShareWriteAdapter {
        public Default() {}
        public void write(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
        public void error(int p0) throws android.os.RemoteException {}
        public void rejected() throws android.os.RemoteException {}
        public void finish() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.contentcapture.IDataShareWriteAdapter {
        static final int TRANSACTION_write = 1;
        static final int TRANSACTION_error = 2;
        static final int TRANSACTION_rejected = 3;
        static final int TRANSACTION_finish = 4;
        public Stub() { super(); }
        public static android.view.contentcapture.IDataShareWriteAdapter asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.view.contentcapture.IDataShareWriteAdapter {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void write(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
            public void error(int p0) throws android.os.RemoteException {}
            public void rejected() throws android.os.RemoteException {}
            public void finish() throws android.os.RemoteException {}
        }
    }
}
