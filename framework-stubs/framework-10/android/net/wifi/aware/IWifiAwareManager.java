package android.net.wifi.aware;

public interface IWifiAwareManager extends android.os.IInterface {
    public boolean isUsageEnabled() throws android.os.RemoteException;
    public android.net.wifi.aware.Characteristics getCharacteristics() throws android.os.RemoteException;
    public void connect(android.os.IBinder p0, java.lang.String p1, android.net.wifi.aware.IWifiAwareEventCallback p2, android.net.wifi.aware.ConfigRequest p3, boolean p4) throws android.os.RemoteException;
    public void disconnect(int p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void publish(java.lang.String p0, int p1, android.net.wifi.aware.PublishConfig p2, android.net.wifi.aware.IWifiAwareDiscoverySessionCallback p3) throws android.os.RemoteException;
    public void subscribe(java.lang.String p0, int p1, android.net.wifi.aware.SubscribeConfig p2, android.net.wifi.aware.IWifiAwareDiscoverySessionCallback p3) throws android.os.RemoteException;
    public void updatePublish(int p0, int p1, android.net.wifi.aware.PublishConfig p2) throws android.os.RemoteException;
    public void updateSubscribe(int p0, int p1, android.net.wifi.aware.SubscribeConfig p2) throws android.os.RemoteException;
    public void sendMessage(int p0, int p1, int p2, byte[] p3, int p4, int p5) throws android.os.RemoteException;
    public void terminateSession(int p0, int p1) throws android.os.RemoteException;
    public void requestMacAddresses(int p0, java.util.List p1, android.net.wifi.aware.IWifiAwareMacAddressProvider p2) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.aware.IWifiAwareManager {
        private static final java.lang.String DESCRIPTOR = "android.net.wifi.aware.IWifiAwareManager";
        static final int TRANSACTION_isUsageEnabled = 1;
        static final int TRANSACTION_getCharacteristics = 2;
        static final int TRANSACTION_connect = 3;
        static final int TRANSACTION_disconnect = 4;
        static final int TRANSACTION_publish = 5;
        static final int TRANSACTION_subscribe = 6;
        static final int TRANSACTION_updatePublish = 7;
        static final int TRANSACTION_updateSubscribe = 8;
        static final int TRANSACTION_sendMessage = 9;
        static final int TRANSACTION_terminateSession = 10;
        static final int TRANSACTION_requestMacAddresses = 11;
        public Stub() { super(); }
        public static android.net.wifi.aware.IWifiAwareManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.wifi.aware.IWifiAwareManager p0) { return false; }
        public static android.net.wifi.aware.IWifiAwareManager getDefaultImpl() { return null; }

        private static class Proxy implements android.net.wifi.aware.IWifiAwareManager {
            private android.os.IBinder mRemote;
            public static android.net.wifi.aware.IWifiAwareManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isUsageEnabled() throws android.os.RemoteException { return false; }
            public android.net.wifi.aware.Characteristics getCharacteristics() throws android.os.RemoteException { return null; }
            public void connect(android.os.IBinder p0, java.lang.String p1, android.net.wifi.aware.IWifiAwareEventCallback p2, android.net.wifi.aware.ConfigRequest p3, boolean p4) throws android.os.RemoteException {}
            public void disconnect(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void publish(java.lang.String p0, int p1, android.net.wifi.aware.PublishConfig p2, android.net.wifi.aware.IWifiAwareDiscoverySessionCallback p3) throws android.os.RemoteException {}
            public void subscribe(java.lang.String p0, int p1, android.net.wifi.aware.SubscribeConfig p2, android.net.wifi.aware.IWifiAwareDiscoverySessionCallback p3) throws android.os.RemoteException {}
            public void updatePublish(int p0, int p1, android.net.wifi.aware.PublishConfig p2) throws android.os.RemoteException {}
            public void updateSubscribe(int p0, int p1, android.net.wifi.aware.SubscribeConfig p2) throws android.os.RemoteException {}
            public void sendMessage(int p0, int p1, int p2, byte[] p3, int p4, int p5) throws android.os.RemoteException {}
            public void terminateSession(int p0, int p1) throws android.os.RemoteException {}
            public void requestMacAddresses(int p0, java.util.List p1, android.net.wifi.aware.IWifiAwareMacAddressProvider p2) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.net.wifi.aware.IWifiAwareManager {
        public Default() {}
        public boolean isUsageEnabled() throws android.os.RemoteException { return false; }
        public android.net.wifi.aware.Characteristics getCharacteristics() throws android.os.RemoteException { return null; }
        public void connect(android.os.IBinder p0, java.lang.String p1, android.net.wifi.aware.IWifiAwareEventCallback p2, android.net.wifi.aware.ConfigRequest p3, boolean p4) throws android.os.RemoteException {}
        public void disconnect(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void publish(java.lang.String p0, int p1, android.net.wifi.aware.PublishConfig p2, android.net.wifi.aware.IWifiAwareDiscoverySessionCallback p3) throws android.os.RemoteException {}
        public void subscribe(java.lang.String p0, int p1, android.net.wifi.aware.SubscribeConfig p2, android.net.wifi.aware.IWifiAwareDiscoverySessionCallback p3) throws android.os.RemoteException {}
        public void updatePublish(int p0, int p1, android.net.wifi.aware.PublishConfig p2) throws android.os.RemoteException {}
        public void updateSubscribe(int p0, int p1, android.net.wifi.aware.SubscribeConfig p2) throws android.os.RemoteException {}
        public void sendMessage(int p0, int p1, int p2, byte[] p3, int p4, int p5) throws android.os.RemoteException {}
        public void terminateSession(int p0, int p1) throws android.os.RemoteException {}
        public void requestMacAddresses(int p0, java.util.List p1, android.net.wifi.aware.IWifiAwareMacAddressProvider p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
