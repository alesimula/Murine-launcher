package android.app;

public interface IAppTraceRetriever extends android.os.IInterface {
    public android.os.ParcelFileDescriptor getTraceFileDescriptor(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.app.IAppTraceRetriever {
        public Default() {}
        public android.os.ParcelFileDescriptor getTraceFileDescriptor(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IAppTraceRetriever {
        private static final java.lang.String DESCRIPTOR = "android.app.IAppTraceRetriever";
        static final int TRANSACTION_getTraceFileDescriptor = 1;
        public Stub() { super(); }
        public static android.app.IAppTraceRetriever asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IAppTraceRetriever p0) { return false; }
        public static android.app.IAppTraceRetriever getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IAppTraceRetriever {
            private android.os.IBinder mRemote;
            public static android.app.IAppTraceRetriever sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.ParcelFileDescriptor getTraceFileDescriptor(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
        }
    }
}
