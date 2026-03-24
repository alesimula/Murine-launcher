package android.net.wifi.nl80211;

public interface IClientInterface extends android.os.IInterface {
    public int[] getPacketCounters() throws android.os.RemoteException;
    public int[] signalPoll() throws android.os.RemoteException;
    public byte[] getMacAddress() throws android.os.RemoteException;
    public java.lang.String getInterfaceName() throws android.os.RemoteException;
    public android.net.wifi.nl80211.IWifiScannerImpl getWifiScannerImpl() throws android.os.RemoteException;
    public void SendMgmtFrame(byte[] p0, android.net.wifi.nl80211.ISendMgmtFrameEvent p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.net.wifi.nl80211.IClientInterface {
        public Default() {}
        public int[] getPacketCounters() throws android.os.RemoteException { return null; }
        public int[] signalPoll() throws android.os.RemoteException { return null; }
        public byte[] getMacAddress() throws android.os.RemoteException { return null; }
        public java.lang.String getInterfaceName() throws android.os.RemoteException { return null; }
        public android.net.wifi.nl80211.IWifiScannerImpl getWifiScannerImpl() throws android.os.RemoteException { return null; }
        public void SendMgmtFrame(byte[] p0, android.net.wifi.nl80211.ISendMgmtFrameEvent p1, int p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.nl80211.IClientInterface {
        private static final java.lang.String DESCRIPTOR = "android.net.wifi.nl80211.IClientInterface";
        static final int TRANSACTION_getPacketCounters = 1;
        static final int TRANSACTION_signalPoll = 2;
        static final int TRANSACTION_getMacAddress = 3;
        static final int TRANSACTION_getInterfaceName = 4;
        static final int TRANSACTION_getWifiScannerImpl = 5;
        static final int TRANSACTION_SendMgmtFrame = 6;
        public Stub() { super(); }
        public static android.net.wifi.nl80211.IClientInterface asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.wifi.nl80211.IClientInterface p0) { return false; }
        public static android.net.wifi.nl80211.IClientInterface getDefaultImpl() { return null; }

        private static class Proxy implements android.net.wifi.nl80211.IClientInterface {
            private android.os.IBinder mRemote;
            public static android.net.wifi.nl80211.IClientInterface sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int[] getPacketCounters() throws android.os.RemoteException { return null; }
            public int[] signalPoll() throws android.os.RemoteException { return null; }
            public byte[] getMacAddress() throws android.os.RemoteException { return null; }
            public java.lang.String getInterfaceName() throws android.os.RemoteException { return null; }
            public android.net.wifi.nl80211.IWifiScannerImpl getWifiScannerImpl() throws android.os.RemoteException { return null; }
            public void SendMgmtFrame(byte[] p0, android.net.wifi.nl80211.ISendMgmtFrameEvent p1, int p2) throws android.os.RemoteException {}
        }
    }
}
