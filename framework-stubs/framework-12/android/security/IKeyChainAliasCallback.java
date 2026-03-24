package android.security;

public interface IKeyChainAliasCallback extends android.os.IInterface {
    public void alias(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.security.IKeyChainAliasCallback {
        public Default() {}
        public void alias(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.IKeyChainAliasCallback {
        public static final java.lang.String DESCRIPTOR = "android.security.IKeyChainAliasCallback";
        static final int TRANSACTION_alias = 1;
        public Stub() { super(); }
        public static android.security.IKeyChainAliasCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.security.IKeyChainAliasCallback p0) { return false; }
        public static android.security.IKeyChainAliasCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.security.IKeyChainAliasCallback {
            private android.os.IBinder mRemote;
            public static android.security.IKeyChainAliasCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void alias(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}
