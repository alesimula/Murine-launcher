package android.net;

public interface INetworkManagementEventObserver extends android.os.IInterface {
    public void interfaceStatusChanged(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void interfaceLinkStateChanged(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void interfaceAdded(java.lang.String p0) throws android.os.RemoteException;
    public void interfaceRemoved(java.lang.String p0) throws android.os.RemoteException;
    public void addressUpdated(java.lang.String p0, android.net.LinkAddress p1) throws android.os.RemoteException;
    public void addressRemoved(java.lang.String p0, android.net.LinkAddress p1) throws android.os.RemoteException;
    public void limitReached(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void interfaceClassDataActivityChanged(int p0, boolean p1, long p2, int p3) throws android.os.RemoteException;
    public void interfaceDnsServerInfo(java.lang.String p0, long p1, java.lang.String[] p2) throws android.os.RemoteException;
    public void routeUpdated(android.net.RouteInfo p0) throws android.os.RemoteException;
    public void routeRemoved(android.net.RouteInfo p0) throws android.os.RemoteException;

    public static class Default implements android.net.INetworkManagementEventObserver {
        public Default() {}
        public void interfaceStatusChanged(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void interfaceLinkStateChanged(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void interfaceAdded(java.lang.String p0) throws android.os.RemoteException {}
        public void interfaceRemoved(java.lang.String p0) throws android.os.RemoteException {}
        public void addressUpdated(java.lang.String p0, android.net.LinkAddress p1) throws android.os.RemoteException {}
        public void addressRemoved(java.lang.String p0, android.net.LinkAddress p1) throws android.os.RemoteException {}
        public void limitReached(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void interfaceClassDataActivityChanged(int p0, boolean p1, long p2, int p3) throws android.os.RemoteException {}
        public void interfaceDnsServerInfo(java.lang.String p0, long p1, java.lang.String[] p2) throws android.os.RemoteException {}
        public void routeUpdated(android.net.RouteInfo p0) throws android.os.RemoteException {}
        public void routeRemoved(android.net.RouteInfo p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.INetworkManagementEventObserver {
        public static final java.lang.String DESCRIPTOR = "android.net.INetworkManagementEventObserver";
        static final int TRANSACTION_interfaceStatusChanged = 1;
        static final int TRANSACTION_interfaceLinkStateChanged = 2;
        static final int TRANSACTION_interfaceAdded = 3;
        static final int TRANSACTION_interfaceRemoved = 4;
        static final int TRANSACTION_addressUpdated = 5;
        static final int TRANSACTION_addressRemoved = 6;
        static final int TRANSACTION_limitReached = 7;
        static final int TRANSACTION_interfaceClassDataActivityChanged = 8;
        static final int TRANSACTION_interfaceDnsServerInfo = 9;
        static final int TRANSACTION_routeUpdated = 10;
        static final int TRANSACTION_routeRemoved = 11;
        public Stub() { super(); }
        public static android.net.INetworkManagementEventObserver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.net.INetworkManagementEventObserver {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void interfaceStatusChanged(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void interfaceLinkStateChanged(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void interfaceAdded(java.lang.String p0) throws android.os.RemoteException {}
            public void interfaceRemoved(java.lang.String p0) throws android.os.RemoteException {}
            public void addressUpdated(java.lang.String p0, android.net.LinkAddress p1) throws android.os.RemoteException {}
            public void addressRemoved(java.lang.String p0, android.net.LinkAddress p1) throws android.os.RemoteException {}
            public void limitReached(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void interfaceClassDataActivityChanged(int p0, boolean p1, long p2, int p3) throws android.os.RemoteException {}
            public void interfaceDnsServerInfo(java.lang.String p0, long p1, java.lang.String[] p2) throws android.os.RemoteException {}
            public void routeUpdated(android.net.RouteInfo p0) throws android.os.RemoteException {}
            public void routeRemoved(android.net.RouteInfo p0) throws android.os.RemoteException {}
        }
    }
}
