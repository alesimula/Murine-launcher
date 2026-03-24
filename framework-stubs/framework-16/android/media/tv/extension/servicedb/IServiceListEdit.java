package android.media.tv.extension.servicedb;

public interface IServiceListEdit extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.servicedb.IServiceListEdit";
    public int open(android.media.tv.extension.servicedb.IServiceListEditListener p0) throws android.os.RemoteException;
    public int close() throws android.os.RemoteException;
    public int commit() throws android.os.RemoteException;
    public int userEditCommit() throws android.os.RemoteException;
    public android.os.Bundle getServiceInfoFromDatabase(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException;
    public android.os.Bundle getServiceInfoListFromDatabase(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException;
    public java.lang.String[] getServiceInfoIdsFromDatabase(java.lang.String p0) throws android.os.RemoteException;
    public int updateServiceInfoFromDatabase(android.os.Bundle p0) throws android.os.RemoteException;
    public int updateServiceInfoByListFromDatabase(android.os.Bundle[] p0) throws android.os.RemoteException;
    public int removeServiceInfoFromDatabase(java.lang.String p0) throws android.os.RemoteException;
    public int removeServiceInfoByListFromDatabase(java.lang.String[] p0) throws android.os.RemoteException;
    public java.lang.String[] getServiceListChannelIds() throws android.os.RemoteException;
    public android.os.Bundle getServiceListInfoByChannelId(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException;
    public android.os.Bundle getTransportStreamInfoList(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException;
    public android.os.Bundle getTransportStreamInfoListForce(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException;
    public android.os.Bundle getNetworkInfoList(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException;
    public android.os.Bundle getSatelliteInfoList(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException;
    public java.lang.String toRecordInfoByType(android.os.Bundle p0, java.lang.String p1) throws android.os.RemoteException;
    public int putRecordIdList(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException;
    public java.lang.String addPredefinedServiceListInfo(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    public int addPredefinedChannelList(java.lang.String p0, android.os.Bundle[] p1) throws android.os.RemoteException;
    public int addPredefinedSatInfo(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;
    public java.lang.String getServiceLogoUri(int p0) throws android.os.RemoteException;
    public android.os.Bundle getInstalledServiceListInfo(java.lang.String p0) throws android.os.RemoteException;
    public android.os.Bundle[] getAllInstalledServiceListInfo() throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.servicedb.IServiceListEdit {
        public Default() {}
        public int open(android.media.tv.extension.servicedb.IServiceListEditListener p0) throws android.os.RemoteException { return 0; }
        public int close() throws android.os.RemoteException { return 0; }
        public int commit() throws android.os.RemoteException { return 0; }
        public int userEditCommit() throws android.os.RemoteException { return 0; }
        public android.os.Bundle getServiceInfoFromDatabase(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
        public android.os.Bundle getServiceInfoListFromDatabase(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
        public java.lang.String[] getServiceInfoIdsFromDatabase(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int updateServiceInfoFromDatabase(android.os.Bundle p0) throws android.os.RemoteException { return 0; }
        public int updateServiceInfoByListFromDatabase(android.os.Bundle[] p0) throws android.os.RemoteException { return 0; }
        public int removeServiceInfoFromDatabase(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int removeServiceInfoByListFromDatabase(java.lang.String[] p0) throws android.os.RemoteException { return 0; }
        public java.lang.String[] getServiceListChannelIds() throws android.os.RemoteException { return null; }
        public android.os.Bundle getServiceListInfoByChannelId(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
        public android.os.Bundle getTransportStreamInfoList(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
        public android.os.Bundle getTransportStreamInfoListForce(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
        public android.os.Bundle getNetworkInfoList(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
        public android.os.Bundle getSatelliteInfoList(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
        public java.lang.String toRecordInfoByType(android.os.Bundle p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public int putRecordIdList(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException { return 0; }
        public java.lang.String addPredefinedServiceListInfo(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException { return null; }
        public int addPredefinedChannelList(java.lang.String p0, android.os.Bundle[] p1) throws android.os.RemoteException { return 0; }
        public int addPredefinedSatInfo(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException { return 0; }
        public java.lang.String getServiceLogoUri(int p0) throws android.os.RemoteException { return null; }
        public android.os.Bundle getInstalledServiceListInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.Bundle[] getAllInstalledServiceListInfo() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.servicedb.IServiceListEdit {
        static final int TRANSACTION_open = 1;
        static final int TRANSACTION_close = 2;
        static final int TRANSACTION_commit = 3;
        static final int TRANSACTION_userEditCommit = 4;
        static final int TRANSACTION_getServiceInfoFromDatabase = 5;
        static final int TRANSACTION_getServiceInfoListFromDatabase = 6;
        static final int TRANSACTION_getServiceInfoIdsFromDatabase = 7;
        static final int TRANSACTION_updateServiceInfoFromDatabase = 8;
        static final int TRANSACTION_updateServiceInfoByListFromDatabase = 9;
        static final int TRANSACTION_removeServiceInfoFromDatabase = 10;
        static final int TRANSACTION_removeServiceInfoByListFromDatabase = 11;
        static final int TRANSACTION_getServiceListChannelIds = 12;
        static final int TRANSACTION_getServiceListInfoByChannelId = 13;
        static final int TRANSACTION_getTransportStreamInfoList = 14;
        static final int TRANSACTION_getTransportStreamInfoListForce = 15;
        static final int TRANSACTION_getNetworkInfoList = 16;
        static final int TRANSACTION_getSatelliteInfoList = 17;
        static final int TRANSACTION_toRecordInfoByType = 18;
        static final int TRANSACTION_putRecordIdList = 19;
        static final int TRANSACTION_addPredefinedServiceListInfo = 20;
        static final int TRANSACTION_addPredefinedChannelList = 21;
        static final int TRANSACTION_addPredefinedSatInfo = 22;
        static final int TRANSACTION_getServiceLogoUri = 23;
        static final int TRANSACTION_getInstalledServiceListInfo = 24;
        static final int TRANSACTION_getAllInstalledServiceListInfo = 25;
        public Stub() { super(); }
        public static android.media.tv.extension.servicedb.IServiceListEdit asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.servicedb.IServiceListEdit {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int open(android.media.tv.extension.servicedb.IServiceListEditListener p0) throws android.os.RemoteException { return 0; }
            public int close() throws android.os.RemoteException { return 0; }
            public int commit() throws android.os.RemoteException { return 0; }
            public int userEditCommit() throws android.os.RemoteException { return 0; }
            public android.os.Bundle getServiceInfoFromDatabase(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
            public android.os.Bundle getServiceInfoListFromDatabase(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
            public java.lang.String[] getServiceInfoIdsFromDatabase(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int updateServiceInfoFromDatabase(android.os.Bundle p0) throws android.os.RemoteException { return 0; }
            public int updateServiceInfoByListFromDatabase(android.os.Bundle[] p0) throws android.os.RemoteException { return 0; }
            public int removeServiceInfoFromDatabase(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int removeServiceInfoByListFromDatabase(java.lang.String[] p0) throws android.os.RemoteException { return 0; }
            public java.lang.String[] getServiceListChannelIds() throws android.os.RemoteException { return null; }
            public android.os.Bundle getServiceListInfoByChannelId(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
            public android.os.Bundle getTransportStreamInfoList(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
            public android.os.Bundle getTransportStreamInfoListForce(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
            public android.os.Bundle getNetworkInfoList(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
            public android.os.Bundle getSatelliteInfoList(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
            public java.lang.String toRecordInfoByType(android.os.Bundle p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public int putRecordIdList(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException { return 0; }
            public java.lang.String addPredefinedServiceListInfo(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException { return null; }
            public int addPredefinedChannelList(java.lang.String p0, android.os.Bundle[] p1) throws android.os.RemoteException { return 0; }
            public int addPredefinedSatInfo(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException { return 0; }
            public java.lang.String getServiceLogoUri(int p0) throws android.os.RemoteException { return null; }
            public android.os.Bundle getInstalledServiceListInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.os.Bundle[] getAllInstalledServiceListInfo() throws android.os.RemoteException { return null; }
        }
    }
}
