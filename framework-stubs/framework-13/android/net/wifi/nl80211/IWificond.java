package android.net.wifi.nl80211;

public interface IWificond extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.wifi.nl80211.IWificond";
    public android.net.wifi.nl80211.IApInterface createApInterface(java.lang.String p0) throws android.os.RemoteException;
    public android.net.wifi.nl80211.IClientInterface createClientInterface(java.lang.String p0) throws android.os.RemoteException;
    public boolean tearDownApInterface(java.lang.String p0) throws android.os.RemoteException;
    public boolean tearDownClientInterface(java.lang.String p0) throws android.os.RemoteException;
    public void tearDownInterfaces() throws android.os.RemoteException;
    public java.util.List<android.os.IBinder> GetClientInterfaces() throws android.os.RemoteException;
    public java.util.List<android.os.IBinder> GetApInterfaces() throws android.os.RemoteException;
    public int[] getAvailable2gChannels() throws android.os.RemoteException;
    public int[] getAvailable5gNonDFSChannels() throws android.os.RemoteException;
    public int[] getAvailableDFSChannels() throws android.os.RemoteException;
    public int[] getAvailable6gChannels() throws android.os.RemoteException;
    public int[] getAvailable60gChannels() throws android.os.RemoteException;
    public void RegisterCallback(android.net.wifi.nl80211.IInterfaceEventCallback p0) throws android.os.RemoteException;
    public void UnregisterCallback(android.net.wifi.nl80211.IInterfaceEventCallback p0) throws android.os.RemoteException;
    public void registerWificondEventCallback(android.net.wifi.nl80211.IWificondEventCallback p0) throws android.os.RemoteException;
    public void unregisterWificondEventCallback(android.net.wifi.nl80211.IWificondEventCallback p0) throws android.os.RemoteException;
    public android.net.wifi.nl80211.DeviceWiphyCapabilities getDeviceWiphyCapabilities(java.lang.String p0) throws android.os.RemoteException;
    public void notifyCountryCodeChanged() throws android.os.RemoteException;

    public static class Default implements android.net.wifi.nl80211.IWificond {
        public Default() {}
        public android.net.wifi.nl80211.IApInterface createApInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.net.wifi.nl80211.IClientInterface createClientInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean tearDownApInterface(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean tearDownClientInterface(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void tearDownInterfaces() throws android.os.RemoteException {}
        public java.util.List<android.os.IBinder> GetClientInterfaces() throws android.os.RemoteException { return null; }
        public java.util.List<android.os.IBinder> GetApInterfaces() throws android.os.RemoteException { return null; }
        public int[] getAvailable2gChannels() throws android.os.RemoteException { return null; }
        public int[] getAvailable5gNonDFSChannels() throws android.os.RemoteException { return null; }
        public int[] getAvailableDFSChannels() throws android.os.RemoteException { return null; }
        public int[] getAvailable6gChannels() throws android.os.RemoteException { return null; }
        public int[] getAvailable60gChannels() throws android.os.RemoteException { return null; }
        public void RegisterCallback(android.net.wifi.nl80211.IInterfaceEventCallback p0) throws android.os.RemoteException {}
        public void UnregisterCallback(android.net.wifi.nl80211.IInterfaceEventCallback p0) throws android.os.RemoteException {}
        public void registerWificondEventCallback(android.net.wifi.nl80211.IWificondEventCallback p0) throws android.os.RemoteException {}
        public void unregisterWificondEventCallback(android.net.wifi.nl80211.IWificondEventCallback p0) throws android.os.RemoteException {}
        public android.net.wifi.nl80211.DeviceWiphyCapabilities getDeviceWiphyCapabilities(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void notifyCountryCodeChanged() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.nl80211.IWificond {
        static final int TRANSACTION_createApInterface = 1;
        static final int TRANSACTION_createClientInterface = 2;
        static final int TRANSACTION_tearDownApInterface = 3;
        static final int TRANSACTION_tearDownClientInterface = 4;
        static final int TRANSACTION_tearDownInterfaces = 5;
        static final int TRANSACTION_GetClientInterfaces = 6;
        static final int TRANSACTION_GetApInterfaces = 7;
        static final int TRANSACTION_getAvailable2gChannels = 8;
        static final int TRANSACTION_getAvailable5gNonDFSChannels = 9;
        static final int TRANSACTION_getAvailableDFSChannels = 10;
        static final int TRANSACTION_getAvailable6gChannels = 11;
        static final int TRANSACTION_getAvailable60gChannels = 12;
        static final int TRANSACTION_RegisterCallback = 13;
        static final int TRANSACTION_UnregisterCallback = 14;
        static final int TRANSACTION_registerWificondEventCallback = 15;
        static final int TRANSACTION_unregisterWificondEventCallback = 16;
        static final int TRANSACTION_getDeviceWiphyCapabilities = 17;
        static final int TRANSACTION_notifyCountryCodeChanged = 18;
        public Stub() { super(); }
        public static android.net.wifi.nl80211.IWificond asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.net.wifi.nl80211.IWificond {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.net.wifi.nl80211.IApInterface createApInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.net.wifi.nl80211.IClientInterface createClientInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean tearDownApInterface(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean tearDownClientInterface(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void tearDownInterfaces() throws android.os.RemoteException {}
            public java.util.List<android.os.IBinder> GetClientInterfaces() throws android.os.RemoteException { return null; }
            public java.util.List<android.os.IBinder> GetApInterfaces() throws android.os.RemoteException { return null; }
            public int[] getAvailable2gChannels() throws android.os.RemoteException { return null; }
            public int[] getAvailable5gNonDFSChannels() throws android.os.RemoteException { return null; }
            public int[] getAvailableDFSChannels() throws android.os.RemoteException { return null; }
            public int[] getAvailable6gChannels() throws android.os.RemoteException { return null; }
            public int[] getAvailable60gChannels() throws android.os.RemoteException { return null; }
            public void RegisterCallback(android.net.wifi.nl80211.IInterfaceEventCallback p0) throws android.os.RemoteException {}
            public void UnregisterCallback(android.net.wifi.nl80211.IInterfaceEventCallback p0) throws android.os.RemoteException {}
            public void registerWificondEventCallback(android.net.wifi.nl80211.IWificondEventCallback p0) throws android.os.RemoteException {}
            public void unregisterWificondEventCallback(android.net.wifi.nl80211.IWificondEventCallback p0) throws android.os.RemoteException {}
            public android.net.wifi.nl80211.DeviceWiphyCapabilities getDeviceWiphyCapabilities(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void notifyCountryCodeChanged() throws android.os.RemoteException {}
        }
    }
}
