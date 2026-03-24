package android.net.vcn;

public interface IVcnManagementService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.vcn.IVcnManagementService";
    public void setVcnConfig(android.os.ParcelUuid p0, android.net.vcn.VcnConfig p1, java.lang.String p2) throws android.os.RemoteException;
    public void clearVcnConfig(android.os.ParcelUuid p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<android.os.ParcelUuid> getConfiguredSubscriptionGroups(java.lang.String p0) throws android.os.RemoteException;
    public void addVcnUnderlyingNetworkPolicyListener(android.net.vcn.IVcnUnderlyingNetworkPolicyListener p0) throws android.os.RemoteException;
    public void removeVcnUnderlyingNetworkPolicyListener(android.net.vcn.IVcnUnderlyingNetworkPolicyListener p0) throws android.os.RemoteException;
    public android.net.vcn.VcnUnderlyingNetworkPolicy getUnderlyingNetworkPolicy(android.net.NetworkCapabilities p0, android.net.LinkProperties p1) throws android.os.RemoteException;
    public void registerVcnStatusCallback(android.os.ParcelUuid p0, android.net.vcn.IVcnStatusCallback p1, java.lang.String p2) throws android.os.RemoteException;
    public void unregisterVcnStatusCallback(android.net.vcn.IVcnStatusCallback p0) throws android.os.RemoteException;

    public static class Default implements android.net.vcn.IVcnManagementService {
        public Default() {}
        public void setVcnConfig(android.os.ParcelUuid p0, android.net.vcn.VcnConfig p1, java.lang.String p2) throws android.os.RemoteException {}
        public void clearVcnConfig(android.os.ParcelUuid p0, java.lang.String p1) throws android.os.RemoteException {}
        public java.util.List<android.os.ParcelUuid> getConfiguredSubscriptionGroups(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void addVcnUnderlyingNetworkPolicyListener(android.net.vcn.IVcnUnderlyingNetworkPolicyListener p0) throws android.os.RemoteException {}
        public void removeVcnUnderlyingNetworkPolicyListener(android.net.vcn.IVcnUnderlyingNetworkPolicyListener p0) throws android.os.RemoteException {}
        public android.net.vcn.VcnUnderlyingNetworkPolicy getUnderlyingNetworkPolicy(android.net.NetworkCapabilities p0, android.net.LinkProperties p1) throws android.os.RemoteException { return null; }
        public void registerVcnStatusCallback(android.os.ParcelUuid p0, android.net.vcn.IVcnStatusCallback p1, java.lang.String p2) throws android.os.RemoteException {}
        public void unregisterVcnStatusCallback(android.net.vcn.IVcnStatusCallback p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.vcn.IVcnManagementService {
        static final int TRANSACTION_setVcnConfig = 1;
        static final int TRANSACTION_clearVcnConfig = 2;
        static final int TRANSACTION_getConfiguredSubscriptionGroups = 3;
        static final int TRANSACTION_addVcnUnderlyingNetworkPolicyListener = 4;
        static final int TRANSACTION_removeVcnUnderlyingNetworkPolicyListener = 5;
        static final int TRANSACTION_getUnderlyingNetworkPolicy = 6;
        static final int TRANSACTION_registerVcnStatusCallback = 7;
        static final int TRANSACTION_unregisterVcnStatusCallback = 8;
        public Stub() { super(); }
        public static android.net.vcn.IVcnManagementService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.vcn.IVcnManagementService p0) { return false; }
        public static android.net.vcn.IVcnManagementService getDefaultImpl() { return null; }

        private static class Proxy implements android.net.vcn.IVcnManagementService {
            private android.os.IBinder mRemote;
            public static android.net.vcn.IVcnManagementService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setVcnConfig(android.os.ParcelUuid p0, android.net.vcn.VcnConfig p1, java.lang.String p2) throws android.os.RemoteException {}
            public void clearVcnConfig(android.os.ParcelUuid p0, java.lang.String p1) throws android.os.RemoteException {}
            public java.util.List<android.os.ParcelUuid> getConfiguredSubscriptionGroups(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void addVcnUnderlyingNetworkPolicyListener(android.net.vcn.IVcnUnderlyingNetworkPolicyListener p0) throws android.os.RemoteException {}
            public void removeVcnUnderlyingNetworkPolicyListener(android.net.vcn.IVcnUnderlyingNetworkPolicyListener p0) throws android.os.RemoteException {}
            public android.net.vcn.VcnUnderlyingNetworkPolicy getUnderlyingNetworkPolicy(android.net.NetworkCapabilities p0, android.net.LinkProperties p1) throws android.os.RemoteException { return null; }
            public void registerVcnStatusCallback(android.os.ParcelUuid p0, android.net.vcn.IVcnStatusCallback p1, java.lang.String p2) throws android.os.RemoteException {}
            public void unregisterVcnStatusCallback(android.net.vcn.IVcnStatusCallback p0) throws android.os.RemoteException {}
        }
    }
}
