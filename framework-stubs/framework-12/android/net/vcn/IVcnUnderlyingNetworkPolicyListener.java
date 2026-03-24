package android.net.vcn;

public interface IVcnUnderlyingNetworkPolicyListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.vcn.IVcnUnderlyingNetworkPolicyListener";
    public void onPolicyChanged() throws android.os.RemoteException;

    public static class Default implements android.net.vcn.IVcnUnderlyingNetworkPolicyListener {
        public Default() {}
        public void onPolicyChanged() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.vcn.IVcnUnderlyingNetworkPolicyListener {
        static final int TRANSACTION_onPolicyChanged = 1;
        public Stub() { super(); }
        public static android.net.vcn.IVcnUnderlyingNetworkPolicyListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.vcn.IVcnUnderlyingNetworkPolicyListener p0) { return false; }
        public static android.net.vcn.IVcnUnderlyingNetworkPolicyListener getDefaultImpl() { return null; }

        private static class Proxy implements android.net.vcn.IVcnUnderlyingNetworkPolicyListener {
            private android.os.IBinder mRemote;
            public static android.net.vcn.IVcnUnderlyingNetworkPolicyListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onPolicyChanged() throws android.os.RemoteException {}
        }
    }
}
