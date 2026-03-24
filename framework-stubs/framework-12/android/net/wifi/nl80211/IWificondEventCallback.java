package android.net.wifi.nl80211;

public interface IWificondEventCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.wifi.nl80211.IWificondEventCallback";
    public void OnRegDomainChanged(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.net.wifi.nl80211.IWificondEventCallback {
        public Default() {}
        public void OnRegDomainChanged(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.nl80211.IWificondEventCallback {
        static final int TRANSACTION_OnRegDomainChanged = 1;
        public Stub() { super(); }
        public static android.net.wifi.nl80211.IWificondEventCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.wifi.nl80211.IWificondEventCallback p0) { return false; }
        public static android.net.wifi.nl80211.IWificondEventCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.net.wifi.nl80211.IWificondEventCallback {
            private android.os.IBinder mRemote;
            public static android.net.wifi.nl80211.IWificondEventCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void OnRegDomainChanged(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}
