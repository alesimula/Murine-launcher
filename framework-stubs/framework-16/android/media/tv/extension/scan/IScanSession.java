package android.media.tv.extension.scan;

public interface IScanSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.scan.IScanSession";
    public int startScan(int p0, java.lang.String p1, java.lang.String p2, int[] p3, java.lang.String p4, java.lang.String p5, android.os.Bundle p6) throws android.os.RemoteException;
    public int resetScan() throws android.os.RemoteException;
    public int cancelScan() throws android.os.RemoteException;
    public java.lang.String[] getAvailableExtensionInterfaceNames() throws android.os.RemoteException;
    public android.os.IBinder getExtensionInterface(java.lang.String p0) throws android.os.RemoteException;
    public int clearServiceList(android.os.Bundle p0) throws android.os.RemoteException;
    public int storeServiceList() throws android.os.RemoteException;
    public android.os.Bundle getServiceInfo(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException;
    public java.lang.String[] getServiceInfoIdList() throws android.os.RemoteException;
    public android.os.Bundle getServiceInfoList(android.os.Bundle p0, java.lang.String[] p1) throws android.os.RemoteException;
    public int updateServiceInfo(android.os.Bundle p0) throws android.os.RemoteException;
    public int updateServiceInfoByList(android.os.Bundle[] p0) throws android.os.RemoteException;
    public android.os.Bundle getServiceLists() throws android.os.RemoteException;
    public int setServiceList(int p0) throws android.os.RemoteException;
    public android.os.Bundle getPackageData() throws android.os.RemoteException;
    public int setPackage(java.lang.String p0) throws android.os.RemoteException;
    public android.os.Bundle getCountryRegionData() throws android.os.RemoteException;
    public int setCountryRegion(java.lang.String p0) throws android.os.RemoteException;
    public android.os.Bundle getRegionData() throws android.os.RemoteException;
    public int setRegion(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getSessionToken() throws android.os.RemoteException;
    public int release() throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.scan.IScanSession {
        public Default() {}
        public int startScan(int p0, java.lang.String p1, java.lang.String p2, int[] p3, java.lang.String p4, java.lang.String p5, android.os.Bundle p6) throws android.os.RemoteException { return 0; }
        public int resetScan() throws android.os.RemoteException { return 0; }
        public int cancelScan() throws android.os.RemoteException { return 0; }
        public java.lang.String[] getAvailableExtensionInterfaceNames() throws android.os.RemoteException { return null; }
        public android.os.IBinder getExtensionInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int clearServiceList(android.os.Bundle p0) throws android.os.RemoteException { return 0; }
        public int storeServiceList() throws android.os.RemoteException { return 0; }
        public android.os.Bundle getServiceInfo(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
        public java.lang.String[] getServiceInfoIdList() throws android.os.RemoteException { return null; }
        public android.os.Bundle getServiceInfoList(android.os.Bundle p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
        public int updateServiceInfo(android.os.Bundle p0) throws android.os.RemoteException { return 0; }
        public int updateServiceInfoByList(android.os.Bundle[] p0) throws android.os.RemoteException { return 0; }
        public android.os.Bundle getServiceLists() throws android.os.RemoteException { return null; }
        public int setServiceList(int p0) throws android.os.RemoteException { return 0; }
        public android.os.Bundle getPackageData() throws android.os.RemoteException { return null; }
        public int setPackage(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public android.os.Bundle getCountryRegionData() throws android.os.RemoteException { return null; }
        public int setCountryRegion(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public android.os.Bundle getRegionData() throws android.os.RemoteException { return null; }
        public int setRegion(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getSessionToken() throws android.os.RemoteException { return null; }
        public int release() throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.scan.IScanSession {
        static final int TRANSACTION_startScan = 1;
        static final int TRANSACTION_resetScan = 2;
        static final int TRANSACTION_cancelScan = 3;
        static final int TRANSACTION_getAvailableExtensionInterfaceNames = 4;
        static final int TRANSACTION_getExtensionInterface = 5;
        static final int TRANSACTION_clearServiceList = 6;
        static final int TRANSACTION_storeServiceList = 7;
        static final int TRANSACTION_getServiceInfo = 8;
        static final int TRANSACTION_getServiceInfoIdList = 9;
        static final int TRANSACTION_getServiceInfoList = 10;
        static final int TRANSACTION_updateServiceInfo = 11;
        static final int TRANSACTION_updateServiceInfoByList = 12;
        static final int TRANSACTION_getServiceLists = 13;
        static final int TRANSACTION_setServiceList = 14;
        static final int TRANSACTION_getPackageData = 15;
        static final int TRANSACTION_setPackage = 16;
        static final int TRANSACTION_getCountryRegionData = 17;
        static final int TRANSACTION_setCountryRegion = 18;
        static final int TRANSACTION_getRegionData = 19;
        static final int TRANSACTION_setRegion = 20;
        static final int TRANSACTION_getSessionToken = 21;
        static final int TRANSACTION_release = 22;
        public Stub() { super(); }
        public static android.media.tv.extension.scan.IScanSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.scan.IScanSession {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int startScan(int p0, java.lang.String p1, java.lang.String p2, int[] p3, java.lang.String p4, java.lang.String p5, android.os.Bundle p6) throws android.os.RemoteException { return 0; }
            public int resetScan() throws android.os.RemoteException { return 0; }
            public int cancelScan() throws android.os.RemoteException { return 0; }
            public java.lang.String[] getAvailableExtensionInterfaceNames() throws android.os.RemoteException { return null; }
            public android.os.IBinder getExtensionInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int clearServiceList(android.os.Bundle p0) throws android.os.RemoteException { return 0; }
            public int storeServiceList() throws android.os.RemoteException { return 0; }
            public android.os.Bundle getServiceInfo(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
            public java.lang.String[] getServiceInfoIdList() throws android.os.RemoteException { return null; }
            public android.os.Bundle getServiceInfoList(android.os.Bundle p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
            public int updateServiceInfo(android.os.Bundle p0) throws android.os.RemoteException { return 0; }
            public int updateServiceInfoByList(android.os.Bundle[] p0) throws android.os.RemoteException { return 0; }
            public android.os.Bundle getServiceLists() throws android.os.RemoteException { return null; }
            public int setServiceList(int p0) throws android.os.RemoteException { return 0; }
            public android.os.Bundle getPackageData() throws android.os.RemoteException { return null; }
            public int setPackage(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public android.os.Bundle getCountryRegionData() throws android.os.RemoteException { return null; }
            public int setCountryRegion(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public android.os.Bundle getRegionData() throws android.os.RemoteException { return null; }
            public int setRegion(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getSessionToken() throws android.os.RemoteException { return null; }
            public int release() throws android.os.RemoteException { return 0; }
        }
    }
}
