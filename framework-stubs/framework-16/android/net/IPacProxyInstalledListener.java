package android.net;

public interface IPacProxyInstalledListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.IPacProxyInstalledListener";
    public void onPacProxyInstalled(android.net.Network p0, android.net.ProxyInfo p1) throws android.os.RemoteException;

    public static class Default implements android.net.IPacProxyInstalledListener {
        public Default() {}
        public void onPacProxyInstalled(android.net.Network p0, android.net.ProxyInfo p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.IPacProxyInstalledListener {
        static final int TRANSACTION_onPacProxyInstalled = 1;
        public Stub() { super(); }
        public static android.net.IPacProxyInstalledListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.net.IPacProxyInstalledListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onPacProxyInstalled(android.net.Network p0, android.net.ProxyInfo p1) throws android.os.RemoteException {}
        }
    }
}
