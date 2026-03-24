package android.net.vcn;

public interface IVcnStatusCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.vcn.IVcnStatusCallback";
    public void onVcnStatusChanged(int p0) throws android.os.RemoteException;
    public void onGatewayConnectionError(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;

    public static class Default implements android.net.vcn.IVcnStatusCallback {
        public Default() {}
        public void onVcnStatusChanged(int p0) throws android.os.RemoteException {}
        public void onGatewayConnectionError(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.vcn.IVcnStatusCallback {
        static final int TRANSACTION_onVcnStatusChanged = 1;
        static final int TRANSACTION_onGatewayConnectionError = 2;
        public Stub() { super(); }
        public static android.net.vcn.IVcnStatusCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.vcn.IVcnStatusCallback p0) { return false; }
        public static android.net.vcn.IVcnStatusCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.net.vcn.IVcnStatusCallback {
            private android.os.IBinder mRemote;
            public static android.net.vcn.IVcnStatusCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onVcnStatusChanged(int p0) throws android.os.RemoteException {}
            public void onGatewayConnectionError(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        }
    }
}
