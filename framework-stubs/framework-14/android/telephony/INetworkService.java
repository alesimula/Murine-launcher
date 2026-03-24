package android.telephony;

public interface INetworkService extends android.os.IInterface {
    public void createNetworkServiceProvider(int p0) throws android.os.RemoteException;
    public void removeNetworkServiceProvider(int p0) throws android.os.RemoteException;
    public void requestNetworkRegistrationInfo(int p0, int p1, android.telephony.INetworkServiceCallback p2) throws android.os.RemoteException;
    public void registerForNetworkRegistrationInfoChanged(int p0, android.telephony.INetworkServiceCallback p1) throws android.os.RemoteException;
    public void unregisterForNetworkRegistrationInfoChanged(int p0, android.telephony.INetworkServiceCallback p1) throws android.os.RemoteException;

    public static class Default implements android.telephony.INetworkService {
        public Default() {}
        public void createNetworkServiceProvider(int p0) throws android.os.RemoteException {}
        public void removeNetworkServiceProvider(int p0) throws android.os.RemoteException {}
        public void requestNetworkRegistrationInfo(int p0, int p1, android.telephony.INetworkServiceCallback p2) throws android.os.RemoteException {}
        public void registerForNetworkRegistrationInfoChanged(int p0, android.telephony.INetworkServiceCallback p1) throws android.os.RemoteException {}
        public void unregisterForNetworkRegistrationInfoChanged(int p0, android.telephony.INetworkServiceCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.INetworkService {
        public static final java.lang.String DESCRIPTOR = "android.telephony.INetworkService";
        static final int TRANSACTION_createNetworkServiceProvider = 1;
        static final int TRANSACTION_removeNetworkServiceProvider = 2;
        static final int TRANSACTION_requestNetworkRegistrationInfo = 3;
        static final int TRANSACTION_registerForNetworkRegistrationInfoChanged = 4;
        static final int TRANSACTION_unregisterForNetworkRegistrationInfoChanged = 5;
        public Stub() { super(); }
        public static android.telephony.INetworkService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.telephony.INetworkService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void createNetworkServiceProvider(int p0) throws android.os.RemoteException {}
            public void removeNetworkServiceProvider(int p0) throws android.os.RemoteException {}
            public void requestNetworkRegistrationInfo(int p0, int p1, android.telephony.INetworkServiceCallback p2) throws android.os.RemoteException {}
            public void registerForNetworkRegistrationInfoChanged(int p0, android.telephony.INetworkServiceCallback p1) throws android.os.RemoteException {}
            public void unregisterForNetworkRegistrationInfoChanged(int p0, android.telephony.INetworkServiceCallback p1) throws android.os.RemoteException {}
        }
    }
}
