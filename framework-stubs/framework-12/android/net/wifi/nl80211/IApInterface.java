package android.net.wifi.nl80211;

public interface IApInterface extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.wifi.nl80211.IApInterface";
    public static final int ENCRYPTION_TYPE_NONE = 0;
    public static final int ENCRYPTION_TYPE_WPA = 1;
    public static final int ENCRYPTION_TYPE_WPA2 = 2;
    public boolean registerCallback(android.net.wifi.nl80211.IApInterfaceEventCallback p0) throws android.os.RemoteException;
    public java.lang.String getInterfaceName() throws android.os.RemoteException;

    public static class Default implements android.net.wifi.nl80211.IApInterface {
        public Default() {}
        public boolean registerCallback(android.net.wifi.nl80211.IApInterfaceEventCallback p0) throws android.os.RemoteException { return false; }
        public java.lang.String getInterfaceName() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.nl80211.IApInterface {
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_getInterfaceName = 2;
        public Stub() { super(); }
        public static android.net.wifi.nl80211.IApInterface asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.wifi.nl80211.IApInterface p0) { return false; }
        public static android.net.wifi.nl80211.IApInterface getDefaultImpl() { return null; }

        private static class Proxy implements android.net.wifi.nl80211.IApInterface {
            private android.os.IBinder mRemote;
            public static android.net.wifi.nl80211.IApInterface sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean registerCallback(android.net.wifi.nl80211.IApInterfaceEventCallback p0) throws android.os.RemoteException { return false; }
            public java.lang.String getInterfaceName() throws android.os.RemoteException { return null; }
        }
    }
}
