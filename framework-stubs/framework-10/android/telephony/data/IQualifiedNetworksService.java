package android.telephony.data;

public interface IQualifiedNetworksService extends android.os.IInterface {
    public void createNetworkAvailabilityProvider(int p0, android.telephony.data.IQualifiedNetworksServiceCallback p1) throws android.os.RemoteException;
    public void removeNetworkAvailabilityProvider(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.telephony.data.IQualifiedNetworksService {
        private static final java.lang.String DESCRIPTOR = "android.telephony.data.IQualifiedNetworksService";
        static final int TRANSACTION_createNetworkAvailabilityProvider = 1;
        static final int TRANSACTION_removeNetworkAvailabilityProvider = 2;
        public Stub() { super(); }
        public static android.telephony.data.IQualifiedNetworksService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.data.IQualifiedNetworksService p0) { return false; }
        public static android.telephony.data.IQualifiedNetworksService getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.data.IQualifiedNetworksService {
            private android.os.IBinder mRemote;
            public static android.telephony.data.IQualifiedNetworksService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void createNetworkAvailabilityProvider(int p0, android.telephony.data.IQualifiedNetworksServiceCallback p1) throws android.os.RemoteException {}
            public void removeNetworkAvailabilityProvider(int p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.telephony.data.IQualifiedNetworksService {
        public Default() {}
        public void createNetworkAvailabilityProvider(int p0, android.telephony.data.IQualifiedNetworksServiceCallback p1) throws android.os.RemoteException {}
        public void removeNetworkAvailabilityProvider(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
