package android.security.authorization;

public interface IKeystoreAuthorization extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public void addAuthToken(android.hardware.security.keymint.HardwareAuthToken p0) throws android.os.RemoteException;
    public void onLockScreenEvent(int p0, int p1, byte[] p2, long[] p3) throws android.os.RemoteException;
    public android.security.authorization.AuthorizationTokens getAuthTokensForCredStore(long p0, long p1, long p2) throws android.os.RemoteException;

    public static class Default implements android.security.authorization.IKeystoreAuthorization {
        public Default() {}
        public void addAuthToken(android.hardware.security.keymint.HardwareAuthToken p0) throws android.os.RemoteException {}
        public void onLockScreenEvent(int p0, int p1, byte[] p2, long[] p3) throws android.os.RemoteException {}
        public android.security.authorization.AuthorizationTokens getAuthTokensForCredStore(long p0, long p1, long p2) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.authorization.IKeystoreAuthorization {
        static final int TRANSACTION_addAuthToken = 1;
        static final int TRANSACTION_onLockScreenEvent = 2;
        static final int TRANSACTION_getAuthTokensForCredStore = 3;
        public Stub() { super(); }
        public static android.security.authorization.IKeystoreAuthorization asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.security.authorization.IKeystoreAuthorization {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addAuthToken(android.hardware.security.keymint.HardwareAuthToken p0) throws android.os.RemoteException {}
            public void onLockScreenEvent(int p0, int p1, byte[] p2, long[] p3) throws android.os.RemoteException {}
            public android.security.authorization.AuthorizationTokens getAuthTokensForCredStore(long p0, long p1, long p2) throws android.os.RemoteException { return null; }
        }
    }
}
