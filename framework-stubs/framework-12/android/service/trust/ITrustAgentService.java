package android.service.trust;

public interface ITrustAgentService extends android.os.IInterface {
    public void onUnlockAttempt(boolean p0) throws android.os.RemoteException;
    public void onUnlockLockout(int p0) throws android.os.RemoteException;
    public void onTrustTimeout() throws android.os.RemoteException;
    public void onDeviceLocked() throws android.os.RemoteException;
    public void onDeviceUnlocked() throws android.os.RemoteException;
    public void onConfigure(java.util.List<android.os.PersistableBundle> p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void setCallback(android.service.trust.ITrustAgentServiceCallback p0) throws android.os.RemoteException;
    public void onEscrowTokenAdded(byte[] p0, long p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public void onTokenStateReceived(long p0, int p1) throws android.os.RemoteException;
    public void onEscrowTokenRemoved(long p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.service.trust.ITrustAgentService {
        public Default() {}
        public void onUnlockAttempt(boolean p0) throws android.os.RemoteException {}
        public void onUnlockLockout(int p0) throws android.os.RemoteException {}
        public void onTrustTimeout() throws android.os.RemoteException {}
        public void onDeviceLocked() throws android.os.RemoteException {}
        public void onDeviceUnlocked() throws android.os.RemoteException {}
        public void onConfigure(java.util.List<android.os.PersistableBundle> p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void setCallback(android.service.trust.ITrustAgentServiceCallback p0) throws android.os.RemoteException {}
        public void onEscrowTokenAdded(byte[] p0, long p1, android.os.UserHandle p2) throws android.os.RemoteException {}
        public void onTokenStateReceived(long p0, int p1) throws android.os.RemoteException {}
        public void onEscrowTokenRemoved(long p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.trust.ITrustAgentService {
        public static final java.lang.String DESCRIPTOR = "android.service.trust.ITrustAgentService";
        static final int TRANSACTION_onUnlockAttempt = 1;
        static final int TRANSACTION_onUnlockLockout = 2;
        static final int TRANSACTION_onTrustTimeout = 3;
        static final int TRANSACTION_onDeviceLocked = 4;
        static final int TRANSACTION_onDeviceUnlocked = 5;
        static final int TRANSACTION_onConfigure = 6;
        static final int TRANSACTION_setCallback = 7;
        static final int TRANSACTION_onEscrowTokenAdded = 8;
        static final int TRANSACTION_onTokenStateReceived = 9;
        static final int TRANSACTION_onEscrowTokenRemoved = 10;
        public Stub() { super(); }
        public static android.service.trust.ITrustAgentService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.trust.ITrustAgentService p0) { return false; }
        public static android.service.trust.ITrustAgentService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.trust.ITrustAgentService {
            private android.os.IBinder mRemote;
            public static android.service.trust.ITrustAgentService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onUnlockAttempt(boolean p0) throws android.os.RemoteException {}
            public void onUnlockLockout(int p0) throws android.os.RemoteException {}
            public void onTrustTimeout() throws android.os.RemoteException {}
            public void onDeviceLocked() throws android.os.RemoteException {}
            public void onDeviceUnlocked() throws android.os.RemoteException {}
            public void onConfigure(java.util.List<android.os.PersistableBundle> p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void setCallback(android.service.trust.ITrustAgentServiceCallback p0) throws android.os.RemoteException {}
            public void onEscrowTokenAdded(byte[] p0, long p1, android.os.UserHandle p2) throws android.os.RemoteException {}
            public void onTokenStateReceived(long p0, int p1) throws android.os.RemoteException {}
            public void onEscrowTokenRemoved(long p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}
