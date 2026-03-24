package android.service.carrier;

public interface IApnSourceService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.carrier.IApnSourceService";
    public android.content.ContentValues[] getApns(int p0) throws android.os.RemoteException;

    public static class Default implements android.service.carrier.IApnSourceService {
        public Default() {}
        public android.content.ContentValues[] getApns(int p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.carrier.IApnSourceService {
        static final int TRANSACTION_getApns = 1;
        public Stub() { super(); }
        public static android.service.carrier.IApnSourceService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.carrier.IApnSourceService p0) { return false; }
        public static android.service.carrier.IApnSourceService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.carrier.IApnSourceService {
            private android.os.IBinder mRemote;
            public static android.service.carrier.IApnSourceService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.content.ContentValues[] getApns(int p0) throws android.os.RemoteException { return null; }
        }
    }
}
