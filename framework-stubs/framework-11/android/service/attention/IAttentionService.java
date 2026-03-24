package android.service.attention;

public interface IAttentionService extends android.os.IInterface {
    public void checkAttention(android.service.attention.IAttentionCallback p0) throws android.os.RemoteException;
    public void cancelAttentionCheck(android.service.attention.IAttentionCallback p0) throws android.os.RemoteException;

    public static class Default implements android.service.attention.IAttentionService {
        public Default() {}
        public void checkAttention(android.service.attention.IAttentionCallback p0) throws android.os.RemoteException {}
        public void cancelAttentionCheck(android.service.attention.IAttentionCallback p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.attention.IAttentionService {
        private static final java.lang.String DESCRIPTOR = "android.service.attention.IAttentionService";
        static final int TRANSACTION_checkAttention = 1;
        static final int TRANSACTION_cancelAttentionCheck = 2;
        public Stub() { super(); }
        public static android.service.attention.IAttentionService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.attention.IAttentionService p0) { return false; }
        public static android.service.attention.IAttentionService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.attention.IAttentionService {
            private android.os.IBinder mRemote;
            public static android.service.attention.IAttentionService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void checkAttention(android.service.attention.IAttentionCallback p0) throws android.os.RemoteException {}
            public void cancelAttentionCheck(android.service.attention.IAttentionCallback p0) throws android.os.RemoteException {}
        }
    }
}
