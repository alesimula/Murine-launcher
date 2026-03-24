package android.app;

public interface IBinderSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.IBinderSession";
    public long binderTransactionStarting(java.lang.String p0) throws android.os.RemoteException;
    public void binderTransactionCompleted(long p0) throws android.os.RemoteException;

    public static class Default implements android.app.IBinderSession {
        public Default() {}
        public long binderTransactionStarting(java.lang.String p0) throws android.os.RemoteException { return 0L; }
        public void binderTransactionCompleted(long p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IBinderSession {
        static final int TRANSACTION_binderTransactionStarting = 1;
        static final int TRANSACTION_binderTransactionCompleted = 2;
        public Stub() { super(); }
        public static android.app.IBinderSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.IBinderSession {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public long binderTransactionStarting(java.lang.String p0) throws android.os.RemoteException { return 0L; }
            public void binderTransactionCompleted(long p0) throws android.os.RemoteException {}
        }
    }
}
