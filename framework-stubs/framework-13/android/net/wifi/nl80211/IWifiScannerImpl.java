package android.net.wifi.nl80211;

public interface IWifiScannerImpl extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.wifi.nl80211.IWifiScannerImpl";
    public static final int SCAN_TYPE_LOW_SPAN = 0;
    public static final int SCAN_TYPE_LOW_POWER = 1;
    public static final int SCAN_TYPE_HIGH_ACCURACY = 2;
    public static final int SCAN_TYPE_DEFAULT = -1;
    public android.net.wifi.nl80211.NativeScanResult[] getScanResults() throws android.os.RemoteException;
    public android.net.wifi.nl80211.NativeScanResult[] getPnoScanResults() throws android.os.RemoteException;
    public int getMaxSsidsPerScan() throws android.os.RemoteException;
    public boolean scan(android.net.wifi.nl80211.SingleScanSettings p0) throws android.os.RemoteException;
    public void subscribeScanEvents(android.net.wifi.nl80211.IScanEvent p0) throws android.os.RemoteException;
    public void unsubscribeScanEvents() throws android.os.RemoteException;
    public void subscribePnoScanEvents(android.net.wifi.nl80211.IPnoScanEvent p0) throws android.os.RemoteException;
    public void unsubscribePnoScanEvents() throws android.os.RemoteException;
    public boolean startPnoScan(android.net.wifi.nl80211.PnoSettings p0) throws android.os.RemoteException;
    public boolean stopPnoScan() throws android.os.RemoteException;
    public void abortScan() throws android.os.RemoteException;

    public static class Default implements android.net.wifi.nl80211.IWifiScannerImpl {
        public Default() {}
        public android.net.wifi.nl80211.NativeScanResult[] getScanResults() throws android.os.RemoteException { return null; }
        public android.net.wifi.nl80211.NativeScanResult[] getPnoScanResults() throws android.os.RemoteException { return null; }
        public int getMaxSsidsPerScan() throws android.os.RemoteException { return 0; }
        public boolean scan(android.net.wifi.nl80211.SingleScanSettings p0) throws android.os.RemoteException { return false; }
        public void subscribeScanEvents(android.net.wifi.nl80211.IScanEvent p0) throws android.os.RemoteException {}
        public void unsubscribeScanEvents() throws android.os.RemoteException {}
        public void subscribePnoScanEvents(android.net.wifi.nl80211.IPnoScanEvent p0) throws android.os.RemoteException {}
        public void unsubscribePnoScanEvents() throws android.os.RemoteException {}
        public boolean startPnoScan(android.net.wifi.nl80211.PnoSettings p0) throws android.os.RemoteException { return false; }
        public boolean stopPnoScan() throws android.os.RemoteException { return false; }
        public void abortScan() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.nl80211.IWifiScannerImpl {
        static final int TRANSACTION_getScanResults = 1;
        static final int TRANSACTION_getPnoScanResults = 2;
        static final int TRANSACTION_getMaxSsidsPerScan = 3;
        static final int TRANSACTION_scan = 4;
        static final int TRANSACTION_subscribeScanEvents = 5;
        static final int TRANSACTION_unsubscribeScanEvents = 6;
        static final int TRANSACTION_subscribePnoScanEvents = 7;
        static final int TRANSACTION_unsubscribePnoScanEvents = 8;
        static final int TRANSACTION_startPnoScan = 9;
        static final int TRANSACTION_stopPnoScan = 10;
        static final int TRANSACTION_abortScan = 11;
        public Stub() { super(); }
        public static android.net.wifi.nl80211.IWifiScannerImpl asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.net.wifi.nl80211.IWifiScannerImpl {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.net.wifi.nl80211.NativeScanResult[] getScanResults() throws android.os.RemoteException { return null; }
            public android.net.wifi.nl80211.NativeScanResult[] getPnoScanResults() throws android.os.RemoteException { return null; }
            public int getMaxSsidsPerScan() throws android.os.RemoteException { return 0; }
            public boolean scan(android.net.wifi.nl80211.SingleScanSettings p0) throws android.os.RemoteException { return false; }
            public void subscribeScanEvents(android.net.wifi.nl80211.IScanEvent p0) throws android.os.RemoteException {}
            public void unsubscribeScanEvents() throws android.os.RemoteException {}
            public void subscribePnoScanEvents(android.net.wifi.nl80211.IPnoScanEvent p0) throws android.os.RemoteException {}
            public void unsubscribePnoScanEvents() throws android.os.RemoteException {}
            public boolean startPnoScan(android.net.wifi.nl80211.PnoSettings p0) throws android.os.RemoteException { return false; }
            public boolean stopPnoScan() throws android.os.RemoteException { return false; }
            public void abortScan() throws android.os.RemoteException {}
        }
    }
}
