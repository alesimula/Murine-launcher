package android.bluetooth.le;

public interface IScannerCallback extends android.os.IInterface {
    public void onScannerRegistered(int p0, int p1) throws android.os.RemoteException;
    public void onScanResult(android.bluetooth.le.ScanResult p0) throws android.os.RemoteException;
    public void onBatchScanResults(java.util.List<android.bluetooth.le.ScanResult> p0) throws android.os.RemoteException;
    public void onFoundOrLost(boolean p0, android.bluetooth.le.ScanResult p1) throws android.os.RemoteException;
    public void onScanManagerErrorCallback(int p0) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.le.IScannerCallback {
        public Default() {}
        public void onScannerRegistered(int p0, int p1) throws android.os.RemoteException {}
        public void onScanResult(android.bluetooth.le.ScanResult p0) throws android.os.RemoteException {}
        public void onBatchScanResults(java.util.List<android.bluetooth.le.ScanResult> p0) throws android.os.RemoteException {}
        public void onFoundOrLost(boolean p0, android.bluetooth.le.ScanResult p1) throws android.os.RemoteException {}
        public void onScanManagerErrorCallback(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.le.IScannerCallback {
        private static final java.lang.String DESCRIPTOR = "android.bluetooth.le.IScannerCallback";
        static final int TRANSACTION_onScannerRegistered = 1;
        static final int TRANSACTION_onScanResult = 2;
        static final int TRANSACTION_onBatchScanResults = 3;
        static final int TRANSACTION_onFoundOrLost = 4;
        static final int TRANSACTION_onScanManagerErrorCallback = 5;
        public Stub() { super(); }
        public static android.bluetooth.le.IScannerCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.le.IScannerCallback p0) { return false; }
        public static android.bluetooth.le.IScannerCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.le.IScannerCallback {
            private android.os.IBinder mRemote;
            public static android.bluetooth.le.IScannerCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onScannerRegistered(int p0, int p1) throws android.os.RemoteException {}
            public void onScanResult(android.bluetooth.le.ScanResult p0) throws android.os.RemoteException {}
            public void onBatchScanResults(java.util.List<android.bluetooth.le.ScanResult> p0) throws android.os.RemoteException {}
            public void onFoundOrLost(boolean p0, android.bluetooth.le.ScanResult p1) throws android.os.RemoteException {}
            public void onScanManagerErrorCallback(int p0) throws android.os.RemoteException {}
        }
    }
}
