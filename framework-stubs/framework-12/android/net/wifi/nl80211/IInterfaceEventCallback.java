package android.net.wifi.nl80211;

public interface IInterfaceEventCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.wifi.nl80211.IInterfaceEventCallback";
    public void OnClientInterfaceReady(android.net.wifi.nl80211.IClientInterface p0) throws android.os.RemoteException;
    public void OnApInterfaceReady(android.net.wifi.nl80211.IApInterface p0) throws android.os.RemoteException;
    public void OnClientTorndownEvent(android.net.wifi.nl80211.IClientInterface p0) throws android.os.RemoteException;
    public void OnApTorndownEvent(android.net.wifi.nl80211.IApInterface p0) throws android.os.RemoteException;

    public static class Default implements android.net.wifi.nl80211.IInterfaceEventCallback {
        public Default() {}
        public void OnClientInterfaceReady(android.net.wifi.nl80211.IClientInterface p0) throws android.os.RemoteException {}
        public void OnApInterfaceReady(android.net.wifi.nl80211.IApInterface p0) throws android.os.RemoteException {}
        public void OnClientTorndownEvent(android.net.wifi.nl80211.IClientInterface p0) throws android.os.RemoteException {}
        public void OnApTorndownEvent(android.net.wifi.nl80211.IApInterface p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.nl80211.IInterfaceEventCallback {
        static final int TRANSACTION_OnClientInterfaceReady = 1;
        static final int TRANSACTION_OnApInterfaceReady = 2;
        static final int TRANSACTION_OnClientTorndownEvent = 3;
        static final int TRANSACTION_OnApTorndownEvent = 4;
        public Stub() { super(); }
        public static android.net.wifi.nl80211.IInterfaceEventCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.wifi.nl80211.IInterfaceEventCallback p0) { return false; }
        public static android.net.wifi.nl80211.IInterfaceEventCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.net.wifi.nl80211.IInterfaceEventCallback {
            private android.os.IBinder mRemote;
            public static android.net.wifi.nl80211.IInterfaceEventCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void OnClientInterfaceReady(android.net.wifi.nl80211.IClientInterface p0) throws android.os.RemoteException {}
            public void OnApInterfaceReady(android.net.wifi.nl80211.IApInterface p0) throws android.os.RemoteException {}
            public void OnClientTorndownEvent(android.net.wifi.nl80211.IClientInterface p0) throws android.os.RemoteException {}
            public void OnApTorndownEvent(android.net.wifi.nl80211.IApInterface p0) throws android.os.RemoteException {}
        }
    }
}
