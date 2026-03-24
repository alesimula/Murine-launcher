package android.security;

public class KeyStore {
    private static final java.lang.String TAG = "KeyStore";
    @android.annotation.UnsupportedAppUsage
    public static final int NO_ERROR = 1;
    public static final int LOCKED = 2;
    public static final int UNINITIALIZED = 3;
    public static final int SYSTEM_ERROR = 4;
    public static final int PROTOCOL_ERROR = 5;
    public static final int PERMISSION_DENIED = 6;
    public static final int KEY_NOT_FOUND = 7;
    public static final int VALUE_CORRUPTED = 8;
    public static final int UNDEFINED_ACTION = 9;
    public static final int WRONG_PASSWORD = 10;
    public static final int KEY_ALREADY_EXISTS = 16;
    public static final int CANNOT_ATTEST_IDS = -66;
    public static final int HARDWARE_TYPE_UNAVAILABLE = -68;
    public static final int OP_AUTH_NEEDED = 15;
    public static final int KEY_PERMANENTLY_INVALIDATED = 17;
    public static final int UID_SELF = -1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_ENCRYPTED = 1;
    public static final int FLAG_SOFTWARE = 2;
    public static final int FLAG_CRITICAL_TO_DEVICE_ENCRYPTION = 8;
    public static final int FLAG_STRONGBOX = 16;
    private int mError;
    private final android.security.keystore.IKeystoreService mBinder = null;
    private final android.content.Context mContext = null;
    private android.os.IBinder mToken;
    public static final int CONFIRMATIONUI_OK = 0;
    public static final int CONFIRMATIONUI_CANCELED = 1;
    public static final int CONFIRMATIONUI_ABORTED = 2;
    public static final int CONFIRMATIONUI_OPERATION_PENDING = 3;
    public static final int CONFIRMATIONUI_IGNORED = 4;
    public static final int CONFIRMATIONUI_SYSTEM_ERROR = 5;
    public static final int CONFIRMATIONUI_UNIMPLEMENTED = 6;
    public static final int CONFIRMATIONUI_UNEXPECTED = 7;
    public static final int CONFIRMATIONUI_UIERROR = 65536;
    public static final int CONFIRMATIONUI_UIERROR_MISSING_GLYPH = 65537;
    public static final int CONFIRMATIONUI_UIERROR_MESSAGE_TOO_LONG = 65538;
    public static final int CONFIRMATIONUI_UIERROR_MALFORMED_UTF8_ENCODING = 65539;
    private KeyStore(android.security.keystore.IKeystoreService p0) {}
    @android.annotation.UnsupportedAppUsage
    public static android.content.Context getApplicationContext() { return null; }
    @android.annotation.UnsupportedAppUsage
    public static android.security.KeyStore getInstance() { return null; }
    private synchronized android.os.IBinder getToken() { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.security.KeyStore.State state(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.security.KeyStore.State state() { return null; }
    public boolean isUnlocked() { return false; }
    public byte[] get(java.lang.String p0, int p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public byte[] get(java.lang.String p0) { return null; }
    public byte[] get(java.lang.String p0, int p1, boolean p2) { return null; }
    public byte[] get(java.lang.String p0, boolean p1) { return null; }
    public boolean put(java.lang.String p0, byte[] p1, int p2, int p3) { return false; }
    public int insert(java.lang.String p0, byte[] p1, int p2, int p3) { return 0; }
    int delete2(java.lang.String p0, int p1) { return 0; }
    public boolean delete(java.lang.String p0, int p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean delete(java.lang.String p0) { return false; }
    public boolean contains(java.lang.String p0, int p1) { return false; }
    public boolean contains(java.lang.String p0) { return false; }
    public java.lang.String[] list(java.lang.String p0, int p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public int[] listUidsOfAuthBoundKeys() { return null; }
    public java.lang.String[] list(java.lang.String p0) { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public boolean reset() { return false; }
    public boolean lock(int p0) { return false; }
    public boolean lock() { return false; }
    public boolean unlock(int p0, java.lang.String p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean unlock(java.lang.String p0) { return false; }
    public boolean isEmpty(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public boolean isEmpty() { return false; }
    public java.lang.String grant(java.lang.String p0, int p1) { return null; }
    public boolean ungrant(java.lang.String p0, int p1) { return false; }
    public long getmtime(java.lang.String p0, int p1) { return 0L; }
    public long getmtime(java.lang.String p0) { return 0L; }
    public boolean isHardwareBacked() { return false; }
    public boolean isHardwareBacked(java.lang.String p0) { return false; }
    public boolean clearUid(int p0) { return false; }
    public int getLastError() { return 0; }
    public boolean addRngEntropy(byte[] p0, int p1) { return false; }
    private int generateKeyInternal(java.lang.String p0, android.security.keymaster.KeymasterArguments p1, byte[] p2, int p3, int p4, android.security.keymaster.KeyCharacteristics p5) throws android.os.RemoteException, java.util.concurrent.ExecutionException, java.lang.InterruptedException { return 0; }
    public int generateKey(java.lang.String p0, android.security.keymaster.KeymasterArguments p1, byte[] p2, int p3, int p4, android.security.keymaster.KeyCharacteristics p5) { return 0; }
    public int generateKey(java.lang.String p0, android.security.keymaster.KeymasterArguments p1, byte[] p2, int p3, android.security.keymaster.KeyCharacteristics p4) { return 0; }
    public int getKeyCharacteristics(java.lang.String p0, android.security.keymaster.KeymasterBlob p1, android.security.keymaster.KeymasterBlob p2, int p3, android.security.keymaster.KeyCharacteristics p4) { return 0; }
    public int getKeyCharacteristics(java.lang.String p0, android.security.keymaster.KeymasterBlob p1, android.security.keymaster.KeymasterBlob p2, android.security.keymaster.KeyCharacteristics p3) { return 0; }
    private int importKeyInternal(java.lang.String p0, android.security.keymaster.KeymasterArguments p1, int p2, byte[] p3, int p4, int p5, android.security.keymaster.KeyCharacteristics p6) throws android.os.RemoteException, java.util.concurrent.ExecutionException, java.lang.InterruptedException { return 0; }
    public int importKey(java.lang.String p0, android.security.keymaster.KeymasterArguments p1, int p2, byte[] p3, int p4, int p5, android.security.keymaster.KeyCharacteristics p6) { return 0; }
    public int importKey(java.lang.String p0, android.security.keymaster.KeymasterArguments p1, int p2, byte[] p3, int p4, android.security.keymaster.KeyCharacteristics p5) { return 0; }
    private java.lang.String getAlgorithmFromPKCS8(byte[] p0) { return null; }
    private android.security.keymaster.KeymasterArguments makeLegacyArguments(java.lang.String p0) { return null; }
    public boolean importKey(java.lang.String p0, byte[] p1, int p2, int p3) { return false; }
    private int importWrappedKeyInternal(java.lang.String p0, byte[] p1, java.lang.String p2, byte[] p3, android.security.keymaster.KeymasterArguments p4, long p5, long p6, android.security.keymaster.KeyCharacteristics p7) throws android.os.RemoteException, java.util.concurrent.ExecutionException, java.lang.InterruptedException { return 0; }
    public int importWrappedKey(java.lang.String p0, byte[] p1, java.lang.String p2, byte[] p3, android.security.keymaster.KeymasterArguments p4, long p5, long p6, int p7, android.security.keymaster.KeyCharacteristics p8) { return 0; }
    public android.security.keymaster.ExportResult exportKey(java.lang.String p0, int p1, android.security.keymaster.KeymasterBlob p2, android.security.keymaster.KeymasterBlob p3, int p4) { return null; }
    public android.security.keymaster.ExportResult exportKey(java.lang.String p0, int p1, android.security.keymaster.KeymasterBlob p2, android.security.keymaster.KeymasterBlob p3) { return null; }
    public android.security.keymaster.OperationResult begin(java.lang.String p0, int p1, boolean p2, android.security.keymaster.KeymasterArguments p3, byte[] p4, int p5) { return null; }
    public android.security.keymaster.OperationResult begin(java.lang.String p0, int p1, boolean p2, android.security.keymaster.KeymasterArguments p3, byte[] p4) { return null; }
    public android.security.keymaster.OperationResult update(android.os.IBinder p0, android.security.keymaster.KeymasterArguments p1, byte[] p2) { return null; }
    public android.security.keymaster.OperationResult finish(android.os.IBinder p0, android.security.keymaster.KeymasterArguments p1, byte[] p2, byte[] p3) { return null; }
    public android.security.keymaster.OperationResult finish(android.os.IBinder p0, android.security.keymaster.KeymasterArguments p1, byte[] p2) { return null; }
    public int abort(android.os.IBinder p0) { return 0; }
    public int addAuthToken(byte[] p0) { return 0; }
    public boolean onUserPasswordChanged(int p0, java.lang.String p1) { return false; }
    public void onUserAdded(int p0, int p1) {}
    public void onUserAdded(int p0) {}
    public void onUserRemoved(int p0) {}
    public boolean onUserPasswordChanged(java.lang.String p0) { return false; }
    public int attestKey(java.lang.String p0, android.security.keymaster.KeymasterArguments p1, android.security.keymaster.KeymasterCertificateChain p2) { return 0; }
    public int attestDeviceIds(android.security.keymaster.KeymasterArguments p0, android.security.keymaster.KeymasterCertificateChain p1) { return 0; }
    public void onDeviceOffBody() {}
    public int presentConfirmationPrompt(android.os.IBinder p0, java.lang.String p1, byte[] p2, java.lang.String p3, int p4) { return 0; }
    public int cancelConfirmationPrompt(android.os.IBinder p0) { return 0; }
    public boolean isConfirmationPromptSupported() { return false; }
    @android.annotation.UnsupportedAppUsage
    public static android.security.KeyStoreException getKeyStoreException(int p0) { return null; }
    public java.security.InvalidKeyException getInvalidKeyException(java.lang.String p0, int p1, android.security.KeyStoreException p2) { return null; }
    private long getFaceOnlySid() { return 0L; }
    private long getFingerprintOnlySid() { return 0L; }
    public java.security.InvalidKeyException getInvalidKeyException(java.lang.String p0, int p1, int p2) { return null; }

    public static enum State {
        UNLOCKED,
        LOCKED,
        UNINITIALIZED;
        private State() {}
    }

    private class OperationPromise extends android.security.keystore.IKeystoreOperationResultCallback.Stub implements android.os.IBinder.DeathRecipient {
        private final java.util.concurrent.CompletableFuture<android.security.keymaster.OperationResult> future = null;
        private OperationPromise(android.security.KeyStore p0) { super(); }
        public void onFinished(android.security.keymaster.OperationResult p0) throws android.os.RemoteException {}
        public final java.util.concurrent.CompletableFuture<android.security.keymaster.OperationResult> getFuture() { return null; }
        public void binderDied() {}
    }

    private class KeystoreResultPromise extends android.security.keystore.IKeystoreResponseCallback.Stub implements android.os.IBinder.DeathRecipient {
        private final java.util.concurrent.CompletableFuture<android.security.keystore.KeystoreResponse> future = null;
        private KeystoreResultPromise(android.security.KeyStore p0) { super(); }
        public void onFinished(android.security.keystore.KeystoreResponse p0) throws android.os.RemoteException {}
        public final java.util.concurrent.CompletableFuture<android.security.keystore.KeystoreResponse> getFuture() { return null; }
        public void binderDied() {}
    }

    private class KeyCharacteristicsPromise extends android.security.keystore.IKeystoreKeyCharacteristicsCallback.Stub implements android.os.IBinder.DeathRecipient {
        private final java.util.concurrent.CompletableFuture<android.security.KeyStore.KeyCharacteristicsCallbackResult> future = null;
        private KeyCharacteristicsPromise(android.security.KeyStore p0) { super(); }
        public void onFinished(android.security.keystore.KeystoreResponse p0, android.security.keymaster.KeyCharacteristics p1) throws android.os.RemoteException {}
        public final java.util.concurrent.CompletableFuture<android.security.KeyStore.KeyCharacteristicsCallbackResult> getFuture() { return null; }
        public void binderDied() {}
    }

    private class KeyCharacteristicsCallbackResult {
        private android.security.keystore.KeystoreResponse keystoreResponse;
        private android.security.keymaster.KeyCharacteristics keyCharacteristics;
        public KeyCharacteristicsCallbackResult(android.security.KeyStore p0, android.security.keystore.KeystoreResponse p1, android.security.keymaster.KeyCharacteristics p2) {}
        public android.security.keystore.KeystoreResponse getKeystoreResponse() { return null; }
        public void setKeystoreResponse(android.security.keystore.KeystoreResponse p0) {}
        public android.security.keymaster.KeyCharacteristics getKeyCharacteristics() { return null; }
        public void setKeyCharacteristics(android.security.keymaster.KeyCharacteristics p0) {}
    }

    private class KeyAttestationCallbackResult {
        private android.security.keystore.KeystoreResponse keystoreResponse;
        private android.security.keymaster.KeymasterCertificateChain certificateChain;
        public KeyAttestationCallbackResult(android.security.KeyStore p0, android.security.keystore.KeystoreResponse p1, android.security.keymaster.KeymasterCertificateChain p2) {}
        public android.security.keystore.KeystoreResponse getKeystoreResponse() { return null; }
        public void setKeystoreResponse(android.security.keystore.KeystoreResponse p0) {}
        public android.security.keymaster.KeymasterCertificateChain getCertificateChain() { return null; }
        public void setCertificateChain(android.security.keymaster.KeymasterCertificateChain p0) {}
    }

    private class ExportKeyPromise extends android.security.keystore.IKeystoreExportKeyCallback.Stub implements android.os.IBinder.DeathRecipient {
        private final java.util.concurrent.CompletableFuture<android.security.keymaster.ExportResult> future = null;
        private ExportKeyPromise(android.security.KeyStore p0) { super(); }
        public void onFinished(android.security.keymaster.ExportResult p0) throws android.os.RemoteException {}
        public final java.util.concurrent.CompletableFuture<android.security.keymaster.ExportResult> getFuture() { return null; }
        public void binderDied() {}
    }

    private class CertificateChainPromise extends android.security.keystore.IKeystoreCertificateChainCallback.Stub implements android.os.IBinder.DeathRecipient {
        private final java.util.concurrent.CompletableFuture<android.security.KeyStore.KeyAttestationCallbackResult> future = null;
        private CertificateChainPromise(android.security.KeyStore p0) { super(); }
        public void onFinished(android.security.keystore.KeystoreResponse p0, android.security.keymaster.KeymasterCertificateChain p1) throws android.os.RemoteException {}
        public final java.util.concurrent.CompletableFuture<android.security.KeyStore.KeyAttestationCallbackResult> getFuture() { return null; }
        public void binderDied() {}
    }
}
