package android.net;

public interface INetdEventCallback extends android.os.IInterface {
    public static final int CALLBACK_CALLER_CONNECTIVITY_SERVICE = 0;
    public static final int CALLBACK_CALLER_DEVICE_POLICY = 1;
    public static final int CALLBACK_CALLER_NETWORK_WATCHLIST = 2;
    public void onDnsEvent(int p0, int p1, int p2, java.lang.String p3, java.lang.String[] p4, int p5, long p6, int p7) throws android.os.RemoteException;
    public void onNat64PrefixEvent(int p0, boolean p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void onPrivateDnsValidationEvent(int p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public void onConnectEvent(java.lang.String p0, int p1, long p2, int p3) throws android.os.RemoteException;

    public static class Default implements android.net.INetdEventCallback {
        public Default() {}
        public void onDnsEvent(int p0, int p1, int p2, java.lang.String p3, java.lang.String[] p4, int p5, long p6, int p7) throws android.os.RemoteException {}
        public void onNat64PrefixEvent(int p0, boolean p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public void onPrivateDnsValidationEvent(int p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
        public void onConnectEvent(java.lang.String p0, int p1, long p2, int p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.INetdEventCallback {
        private static final java.lang.String DESCRIPTOR = "android.net.INetdEventCallback";
        static final int TRANSACTION_onDnsEvent = 1;
        static final int TRANSACTION_onNat64PrefixEvent = 2;
        static final int TRANSACTION_onPrivateDnsValidationEvent = 3;
        static final int TRANSACTION_onConnectEvent = 4;
        public Stub() { super(); }
        public static android.net.INetdEventCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.INetdEventCallback p0) { return false; }
        public static android.net.INetdEventCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.net.INetdEventCallback {
            private android.os.IBinder mRemote;
            public static android.net.INetdEventCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDnsEvent(int p0, int p1, int p2, java.lang.String p3, java.lang.String[] p4, int p5, long p6, int p7) throws android.os.RemoteException {}
            public void onNat64PrefixEvent(int p0, boolean p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public void onPrivateDnsValidationEvent(int p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
            public void onConnectEvent(java.lang.String p0, int p1, long p2, int p3) throws android.os.RemoteException {}
        }
    }
}
