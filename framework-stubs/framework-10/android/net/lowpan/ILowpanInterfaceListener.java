package android.net.lowpan;

public interface ILowpanInterfaceListener extends android.os.IInterface {
    public void onEnabledChanged(boolean p0) throws android.os.RemoteException;
    public void onConnectedChanged(boolean p0) throws android.os.RemoteException;
    public void onUpChanged(boolean p0) throws android.os.RemoteException;
    public void onRoleChanged(java.lang.String p0) throws android.os.RemoteException;
    public void onStateChanged(java.lang.String p0) throws android.os.RemoteException;
    public void onLowpanIdentityChanged(android.net.lowpan.LowpanIdentity p0) throws android.os.RemoteException;
    public void onLinkNetworkAdded(android.net.IpPrefix p0) throws android.os.RemoteException;
    public void onLinkNetworkRemoved(android.net.IpPrefix p0) throws android.os.RemoteException;
    public void onLinkAddressAdded(java.lang.String p0) throws android.os.RemoteException;
    public void onLinkAddressRemoved(java.lang.String p0) throws android.os.RemoteException;
    public void onReceiveFromCommissioner(byte[] p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.net.lowpan.ILowpanInterfaceListener {
        private static final java.lang.String DESCRIPTOR = "android.net.lowpan.ILowpanInterfaceListener";
        static final int TRANSACTION_onEnabledChanged = 1;
        static final int TRANSACTION_onConnectedChanged = 2;
        static final int TRANSACTION_onUpChanged = 3;
        static final int TRANSACTION_onRoleChanged = 4;
        static final int TRANSACTION_onStateChanged = 5;
        static final int TRANSACTION_onLowpanIdentityChanged = 6;
        static final int TRANSACTION_onLinkNetworkAdded = 7;
        static final int TRANSACTION_onLinkNetworkRemoved = 8;
        static final int TRANSACTION_onLinkAddressAdded = 9;
        static final int TRANSACTION_onLinkAddressRemoved = 10;
        static final int TRANSACTION_onReceiveFromCommissioner = 11;
        public Stub() { super(); }
        public static android.net.lowpan.ILowpanInterfaceListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.lowpan.ILowpanInterfaceListener p0) { return false; }
        public static android.net.lowpan.ILowpanInterfaceListener getDefaultImpl() { return null; }

        private static class Proxy implements android.net.lowpan.ILowpanInterfaceListener {
            private android.os.IBinder mRemote;
            public static android.net.lowpan.ILowpanInterfaceListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onEnabledChanged(boolean p0) throws android.os.RemoteException {}
            public void onConnectedChanged(boolean p0) throws android.os.RemoteException {}
            public void onUpChanged(boolean p0) throws android.os.RemoteException {}
            public void onRoleChanged(java.lang.String p0) throws android.os.RemoteException {}
            public void onStateChanged(java.lang.String p0) throws android.os.RemoteException {}
            public void onLowpanIdentityChanged(android.net.lowpan.LowpanIdentity p0) throws android.os.RemoteException {}
            public void onLinkNetworkAdded(android.net.IpPrefix p0) throws android.os.RemoteException {}
            public void onLinkNetworkRemoved(android.net.IpPrefix p0) throws android.os.RemoteException {}
            public void onLinkAddressAdded(java.lang.String p0) throws android.os.RemoteException {}
            public void onLinkAddressRemoved(java.lang.String p0) throws android.os.RemoteException {}
            public void onReceiveFromCommissioner(byte[] p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.net.lowpan.ILowpanInterfaceListener {
        public Default() {}
        public void onEnabledChanged(boolean p0) throws android.os.RemoteException {}
        public void onConnectedChanged(boolean p0) throws android.os.RemoteException {}
        public void onUpChanged(boolean p0) throws android.os.RemoteException {}
        public void onRoleChanged(java.lang.String p0) throws android.os.RemoteException {}
        public void onStateChanged(java.lang.String p0) throws android.os.RemoteException {}
        public void onLowpanIdentityChanged(android.net.lowpan.LowpanIdentity p0) throws android.os.RemoteException {}
        public void onLinkNetworkAdded(android.net.IpPrefix p0) throws android.os.RemoteException {}
        public void onLinkNetworkRemoved(android.net.IpPrefix p0) throws android.os.RemoteException {}
        public void onLinkAddressAdded(java.lang.String p0) throws android.os.RemoteException {}
        public void onLinkAddressRemoved(java.lang.String p0) throws android.os.RemoteException {}
        public void onReceiveFromCommissioner(byte[] p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
