package android.net;

public interface IPacProxyManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.IPacProxyManager";
    public void addListener(android.net.IPacProxyInstalledListener p0) throws android.os.RemoteException;
    public void removeListener(android.net.IPacProxyInstalledListener p0) throws android.os.RemoteException;
    public void setCurrentProxyScriptUrl(android.net.ProxyInfo p0) throws android.os.RemoteException;

    public static class Default implements android.net.IPacProxyManager {
        public Default() {}
        public void addListener(android.net.IPacProxyInstalledListener p0) throws android.os.RemoteException {}
        public void removeListener(android.net.IPacProxyInstalledListener p0) throws android.os.RemoteException {}
        public void setCurrentProxyScriptUrl(android.net.ProxyInfo p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.IPacProxyManager {
        static final int TRANSACTION_addListener = 1;
        static final int TRANSACTION_removeListener = 2;
        static final int TRANSACTION_setCurrentProxyScriptUrl = 3;
        public Stub() { super(); }
        public static android.net.IPacProxyManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.IPacProxyManager p0) { return false; }
        public static android.net.IPacProxyManager getDefaultImpl() { return null; }

        private static class Proxy implements android.net.IPacProxyManager {
            private android.os.IBinder mRemote;
            public static android.net.IPacProxyManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addListener(android.net.IPacProxyInstalledListener p0) throws android.os.RemoteException {}
            public void removeListener(android.net.IPacProxyInstalledListener p0) throws android.os.RemoteException {}
            public void setCurrentProxyScriptUrl(android.net.ProxyInfo p0) throws android.os.RemoteException {}
        }
    }
}
