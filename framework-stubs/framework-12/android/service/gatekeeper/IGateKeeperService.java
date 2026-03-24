package android.service.gatekeeper;

public interface IGateKeeperService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.gatekeeper.IGateKeeperService";
    public android.service.gatekeeper.GateKeeperResponse enroll(int p0, byte[] p1, byte[] p2, byte[] p3) throws android.os.RemoteException;
    public android.service.gatekeeper.GateKeeperResponse verify(int p0, byte[] p1, byte[] p2) throws android.os.RemoteException;
    public android.service.gatekeeper.GateKeeperResponse verifyChallenge(int p0, long p1, byte[] p2, byte[] p3) throws android.os.RemoteException;
    public long getSecureUserId(int p0) throws android.os.RemoteException;
    public void clearSecureUserId(int p0) throws android.os.RemoteException;
    public void reportDeviceSetupComplete() throws android.os.RemoteException;

    public static class Default implements android.service.gatekeeper.IGateKeeperService {
        public Default() {}
        public android.service.gatekeeper.GateKeeperResponse enroll(int p0, byte[] p1, byte[] p2, byte[] p3) throws android.os.RemoteException { return null; }
        public android.service.gatekeeper.GateKeeperResponse verify(int p0, byte[] p1, byte[] p2) throws android.os.RemoteException { return null; }
        public android.service.gatekeeper.GateKeeperResponse verifyChallenge(int p0, long p1, byte[] p2, byte[] p3) throws android.os.RemoteException { return null; }
        public long getSecureUserId(int p0) throws android.os.RemoteException { return 0L; }
        public void clearSecureUserId(int p0) throws android.os.RemoteException {}
        public void reportDeviceSetupComplete() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.gatekeeper.IGateKeeperService {
        static final int TRANSACTION_enroll = 1;
        static final int TRANSACTION_verify = 2;
        static final int TRANSACTION_verifyChallenge = 3;
        static final int TRANSACTION_getSecureUserId = 4;
        static final int TRANSACTION_clearSecureUserId = 5;
        static final int TRANSACTION_reportDeviceSetupComplete = 6;
        public Stub() { super(); }
        public static android.service.gatekeeper.IGateKeeperService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.gatekeeper.IGateKeeperService p0) { return false; }
        public static android.service.gatekeeper.IGateKeeperService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.gatekeeper.IGateKeeperService {
            private android.os.IBinder mRemote;
            public static android.service.gatekeeper.IGateKeeperService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.service.gatekeeper.GateKeeperResponse enroll(int p0, byte[] p1, byte[] p2, byte[] p3) throws android.os.RemoteException { return null; }
            public android.service.gatekeeper.GateKeeperResponse verify(int p0, byte[] p1, byte[] p2) throws android.os.RemoteException { return null; }
            public android.service.gatekeeper.GateKeeperResponse verifyChallenge(int p0, long p1, byte[] p2, byte[] p3) throws android.os.RemoteException { return null; }
            public long getSecureUserId(int p0) throws android.os.RemoteException { return 0L; }
            public void clearSecureUserId(int p0) throws android.os.RemoteException {}
            public void reportDeviceSetupComplete() throws android.os.RemoteException {}
        }
    }
}
