package android.net.wifi.nl80211;

public interface IApInterfaceEventCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.wifi.nl80211.IApInterfaceEventCallback";
    public static final int BANDWIDTH_INVALID = 0;
    public static final int BANDWIDTH_20_NOHT = 1;
    public static final int BANDWIDTH_20 = 2;
    public static final int BANDWIDTH_40 = 3;
    public static final int BANDWIDTH_80 = 4;
    public static final int BANDWIDTH_80P80 = 5;
    public static final int BANDWIDTH_160 = 6;
    public static final int BANDWIDTH_320 = 7;
    public void onConnectedClientsChanged(android.net.wifi.nl80211.NativeWifiClient p0, boolean p1) throws android.os.RemoteException;
    public void onSoftApChannelSwitched(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.net.wifi.nl80211.IApInterfaceEventCallback {
        public Default() {}
        public void onConnectedClientsChanged(android.net.wifi.nl80211.NativeWifiClient p0, boolean p1) throws android.os.RemoteException {}
        public void onSoftApChannelSwitched(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.nl80211.IApInterfaceEventCallback {
        static final int TRANSACTION_onConnectedClientsChanged = 1;
        static final int TRANSACTION_onSoftApChannelSwitched = 2;
        public Stub() { super(); }
        public static android.net.wifi.nl80211.IApInterfaceEventCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.net.wifi.nl80211.IApInterfaceEventCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onConnectedClientsChanged(android.net.wifi.nl80211.NativeWifiClient p0, boolean p1) throws android.os.RemoteException {}
            public void onSoftApChannelSwitched(int p0, int p1) throws android.os.RemoteException {}
        }
    }
}
