package android.telephony.data;

public interface IDataService extends android.os.IInterface {
    public void createDataServiceProvider(int p0) throws android.os.RemoteException;
    public void removeDataServiceProvider(int p0) throws android.os.RemoteException;
    public void setupDataCall(int p0, int p1, android.telephony.data.DataProfile p2, boolean p3, boolean p4, int p5, android.net.LinkProperties p6, android.telephony.data.IDataServiceCallback p7) throws android.os.RemoteException;
    public void deactivateDataCall(int p0, int p1, int p2, android.telephony.data.IDataServiceCallback p3) throws android.os.RemoteException;
    public void setInitialAttachApn(int p0, android.telephony.data.DataProfile p1, boolean p2, android.telephony.data.IDataServiceCallback p3) throws android.os.RemoteException;
    public void setDataProfile(int p0, java.util.List<android.telephony.data.DataProfile> p1, boolean p2, android.telephony.data.IDataServiceCallback p3) throws android.os.RemoteException;
    public void requestDataCallList(int p0, android.telephony.data.IDataServiceCallback p1) throws android.os.RemoteException;
    public void registerForDataCallListChanged(int p0, android.telephony.data.IDataServiceCallback p1) throws android.os.RemoteException;
    public void unregisterForDataCallListChanged(int p0, android.telephony.data.IDataServiceCallback p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.telephony.data.IDataService {
        private static final java.lang.String DESCRIPTOR = "android.telephony.data.IDataService";
        static final int TRANSACTION_createDataServiceProvider = 1;
        static final int TRANSACTION_removeDataServiceProvider = 2;
        static final int TRANSACTION_setupDataCall = 3;
        static final int TRANSACTION_deactivateDataCall = 4;
        static final int TRANSACTION_setInitialAttachApn = 5;
        static final int TRANSACTION_setDataProfile = 6;
        static final int TRANSACTION_requestDataCallList = 7;
        static final int TRANSACTION_registerForDataCallListChanged = 8;
        static final int TRANSACTION_unregisterForDataCallListChanged = 9;
        public Stub() { super(); }
        public static android.telephony.data.IDataService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.data.IDataService p0) { return false; }
        public static android.telephony.data.IDataService getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.data.IDataService {
            private android.os.IBinder mRemote;
            public static android.telephony.data.IDataService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void createDataServiceProvider(int p0) throws android.os.RemoteException {}
            public void removeDataServiceProvider(int p0) throws android.os.RemoteException {}
            public void setupDataCall(int p0, int p1, android.telephony.data.DataProfile p2, boolean p3, boolean p4, int p5, android.net.LinkProperties p6, android.telephony.data.IDataServiceCallback p7) throws android.os.RemoteException {}
            public void deactivateDataCall(int p0, int p1, int p2, android.telephony.data.IDataServiceCallback p3) throws android.os.RemoteException {}
            public void setInitialAttachApn(int p0, android.telephony.data.DataProfile p1, boolean p2, android.telephony.data.IDataServiceCallback p3) throws android.os.RemoteException {}
            public void setDataProfile(int p0, java.util.List<android.telephony.data.DataProfile> p1, boolean p2, android.telephony.data.IDataServiceCallback p3) throws android.os.RemoteException {}
            public void requestDataCallList(int p0, android.telephony.data.IDataServiceCallback p1) throws android.os.RemoteException {}
            public void registerForDataCallListChanged(int p0, android.telephony.data.IDataServiceCallback p1) throws android.os.RemoteException {}
            public void unregisterForDataCallListChanged(int p0, android.telephony.data.IDataServiceCallback p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.telephony.data.IDataService {
        public Default() {}
        public void createDataServiceProvider(int p0) throws android.os.RemoteException {}
        public void removeDataServiceProvider(int p0) throws android.os.RemoteException {}
        public void setupDataCall(int p0, int p1, android.telephony.data.DataProfile p2, boolean p3, boolean p4, int p5, android.net.LinkProperties p6, android.telephony.data.IDataServiceCallback p7) throws android.os.RemoteException {}
        public void deactivateDataCall(int p0, int p1, int p2, android.telephony.data.IDataServiceCallback p3) throws android.os.RemoteException {}
        public void setInitialAttachApn(int p0, android.telephony.data.DataProfile p1, boolean p2, android.telephony.data.IDataServiceCallback p3) throws android.os.RemoteException {}
        public void setDataProfile(int p0, java.util.List<android.telephony.data.DataProfile> p1, boolean p2, android.telephony.data.IDataServiceCallback p3) throws android.os.RemoteException {}
        public void requestDataCallList(int p0, android.telephony.data.IDataServiceCallback p1) throws android.os.RemoteException {}
        public void registerForDataCallListChanged(int p0, android.telephony.data.IDataServiceCallback p1) throws android.os.RemoteException {}
        public void unregisterForDataCallListChanged(int p0, android.telephony.data.IDataServiceCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
