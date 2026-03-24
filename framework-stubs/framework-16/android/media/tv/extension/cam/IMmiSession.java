package android.media.tv.extension.cam;

public interface IMmiSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.cam.IMmiSession";
    public void setMenuListAnswer(int p0) throws android.os.RemoteException;
    public void setEnquiryAnswer(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void closeMmi() throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.cam.IMmiSession {
        public Default() {}
        public void setMenuListAnswer(int p0) throws android.os.RemoteException {}
        public void setEnquiryAnswer(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void closeMmi() throws android.os.RemoteException {}
        public void close() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.cam.IMmiSession {
        static final int TRANSACTION_setMenuListAnswer = 1;
        static final int TRANSACTION_setEnquiryAnswer = 2;
        static final int TRANSACTION_closeMmi = 3;
        static final int TRANSACTION_close = 4;
        public Stub() { super(); }
        public static android.media.tv.extension.cam.IMmiSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.cam.IMmiSession {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setMenuListAnswer(int p0) throws android.os.RemoteException {}
            public void setEnquiryAnswer(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void closeMmi() throws android.os.RemoteException {}
            public void close() throws android.os.RemoteException {}
        }
    }
}
