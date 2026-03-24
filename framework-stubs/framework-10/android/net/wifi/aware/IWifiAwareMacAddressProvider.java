package android.net.wifi.aware;

public interface IWifiAwareMacAddressProvider extends android.os.IInterface {
    public void macAddress(java.util.Map p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.aware.IWifiAwareMacAddressProvider {
        private static final java.lang.String DESCRIPTOR = "android.net.wifi.aware.IWifiAwareMacAddressProvider";
        static final int TRANSACTION_macAddress = 1;
        public Stub() { super(); }
        public static android.net.wifi.aware.IWifiAwareMacAddressProvider asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.wifi.aware.IWifiAwareMacAddressProvider p0) { return false; }
        public static android.net.wifi.aware.IWifiAwareMacAddressProvider getDefaultImpl() { return null; }

        private static class Proxy implements android.net.wifi.aware.IWifiAwareMacAddressProvider {
            private android.os.IBinder mRemote;
            public static android.net.wifi.aware.IWifiAwareMacAddressProvider sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void macAddress(java.util.Map p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.net.wifi.aware.IWifiAwareMacAddressProvider {
        public Default() {}
        public void macAddress(java.util.Map p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
