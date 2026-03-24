package android.security.authorization;

public interface IKeystoreAuthorization extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.authorization.IKeystoreAuthorization";
    public void addAuthToken(android.hardware.security.keymint.HardwareAuthToken p0) throws android.os.RemoteException;
    public void onDeviceUnlocked(int p0, byte[] p1) throws android.os.RemoteException;
    public void onDeviceLocked(int p0, long[] p1, boolean p2) throws android.os.RemoteException;
    public void onUserStorageLocked(int p0) throws android.os.RemoteException;
    public void onWeakUnlockMethodsExpired(int p0) throws android.os.RemoteException;
    public void onNonLskfUnlockMethodsExpired(int p0) throws android.os.RemoteException;
    public android.security.authorization.AuthorizationTokens getAuthTokensForCredStore(long p0, long p1, long p2) throws android.os.RemoteException;
    public long getLastAuthTime(long p0, int[] p1) throws android.os.RemoteException;

    public static class Default implements android.security.authorization.IKeystoreAuthorization {
        public Default() {}
        public void addAuthToken(android.hardware.security.keymint.HardwareAuthToken p0) throws android.os.RemoteException {}
        public void onDeviceUnlocked(int p0, byte[] p1) throws android.os.RemoteException {}
        public void onDeviceLocked(int p0, long[] p1, boolean p2) throws android.os.RemoteException {}
        public void onUserStorageLocked(int p0) throws android.os.RemoteException {}
        public void onWeakUnlockMethodsExpired(int p0) throws android.os.RemoteException {}
        public void onNonLskfUnlockMethodsExpired(int p0) throws android.os.RemoteException {}
        public android.security.authorization.AuthorizationTokens getAuthTokensForCredStore(long p0, long p1, long p2) throws android.os.RemoteException { return null; }
        public long getLastAuthTime(long p0, int[] p1) throws android.os.RemoteException { return 0L; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.authorization.IKeystoreAuthorization {
        static final int TRANSACTION_addAuthToken = 1;
        static final int TRANSACTION_onDeviceUnlocked = 2;
        static final int TRANSACTION_onDeviceLocked = 3;
        static final int TRANSACTION_onUserStorageLocked = 4;
        static final int TRANSACTION_onWeakUnlockMethodsExpired = 5;
        static final int TRANSACTION_onNonLskfUnlockMethodsExpired = 6;
        static final int TRANSACTION_getAuthTokensForCredStore = 7;
        static final int TRANSACTION_getLastAuthTime = 8;
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
            public void onDeviceUnlocked(int p0, byte[] p1) throws android.os.RemoteException {}
            public void onDeviceLocked(int p0, long[] p1, boolean p2) throws android.os.RemoteException {}
            public void onUserStorageLocked(int p0) throws android.os.RemoteException {}
            public void onWeakUnlockMethodsExpired(int p0) throws android.os.RemoteException {}
            public void onNonLskfUnlockMethodsExpired(int p0) throws android.os.RemoteException {}
            public android.security.authorization.AuthorizationTokens getAuthTokensForCredStore(long p0, long p1, long p2) throws android.os.RemoteException { return null; }
            public long getLastAuthTime(long p0, int[] p1) throws android.os.RemoteException { return 0L; }
        }
    }
}
