package android.security.keystore;

public interface IKeystoreService extends android.os.IInterface {
    public int getState(int p0) throws android.os.RemoteException;
    public byte[] get(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int insert(java.lang.String p0, byte[] p1, int p2, int p3) throws android.os.RemoteException;
    public int del(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int exist(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.lang.String[] list(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int reset() throws android.os.RemoteException;
    public int onUserPasswordChanged(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int lock(int p0) throws android.os.RemoteException;
    public int unlock(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int isEmpty(int p0) throws android.os.RemoteException;
    public java.lang.String grant(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int ungrant(java.lang.String p0, int p1) throws android.os.RemoteException;
    public long getmtime(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int is_hardware_backed(java.lang.String p0) throws android.os.RemoteException;
    public int clear_uid(long p0) throws android.os.RemoteException;
    public int addRngEntropy(android.security.keystore.IKeystoreResponseCallback p0, byte[] p1, int p2) throws android.os.RemoteException;
    public int generateKey(android.security.keystore.IKeystoreKeyCharacteristicsCallback p0, java.lang.String p1, android.security.keymaster.KeymasterArguments p2, byte[] p3, int p4, int p5) throws android.os.RemoteException;
    public int getKeyCharacteristics(android.security.keystore.IKeystoreKeyCharacteristicsCallback p0, java.lang.String p1, android.security.keymaster.KeymasterBlob p2, android.security.keymaster.KeymasterBlob p3, int p4) throws android.os.RemoteException;
    public int importKey(android.security.keystore.IKeystoreKeyCharacteristicsCallback p0, java.lang.String p1, android.security.keymaster.KeymasterArguments p2, int p3, byte[] p4, int p5, int p6) throws android.os.RemoteException;
    public int exportKey(android.security.keystore.IKeystoreExportKeyCallback p0, java.lang.String p1, int p2, android.security.keymaster.KeymasterBlob p3, android.security.keymaster.KeymasterBlob p4, int p5) throws android.os.RemoteException;
    public int begin(android.security.keystore.IKeystoreOperationResultCallback p0, android.os.IBinder p1, java.lang.String p2, int p3, boolean p4, android.security.keymaster.KeymasterArguments p5, byte[] p6, int p7) throws android.os.RemoteException;
    public int update(android.security.keystore.IKeystoreOperationResultCallback p0, android.os.IBinder p1, android.security.keymaster.KeymasterArguments p2, byte[] p3) throws android.os.RemoteException;
    public int finish(android.security.keystore.IKeystoreOperationResultCallback p0, android.os.IBinder p1, android.security.keymaster.KeymasterArguments p2, byte[] p3, byte[] p4) throws android.os.RemoteException;
    public int abort(android.security.keystore.IKeystoreResponseCallback p0, android.os.IBinder p1) throws android.os.RemoteException;
    public int addAuthToken(byte[] p0) throws android.os.RemoteException;
    public int onUserAdded(int p0, int p1) throws android.os.RemoteException;
    public int onUserRemoved(int p0) throws android.os.RemoteException;
    public int attestKey(android.security.keystore.IKeystoreCertificateChainCallback p0, java.lang.String p1, android.security.keymaster.KeymasterArguments p2) throws android.os.RemoteException;
    public int attestDeviceIds(android.security.keystore.IKeystoreCertificateChainCallback p0, android.security.keymaster.KeymasterArguments p1) throws android.os.RemoteException;
    public int onDeviceOffBody() throws android.os.RemoteException;
    public int importWrappedKey(android.security.keystore.IKeystoreKeyCharacteristicsCallback p0, java.lang.String p1, byte[] p2, java.lang.String p3, byte[] p4, android.security.keymaster.KeymasterArguments p5, long p6, long p7) throws android.os.RemoteException;
    public int presentConfirmationPrompt(android.os.IBinder p0, java.lang.String p1, byte[] p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    public int cancelConfirmationPrompt(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean isConfirmationPromptSupported() throws android.os.RemoteException;
    public int onKeyguardVisibilityChanged(boolean p0, int p1) throws android.os.RemoteException;
    public int listUidsOfAuthBoundKeys(java.util.List<java.lang.String> p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.security.keystore.IKeystoreService {
        private static final java.lang.String DESCRIPTOR = "android.security.keystore.IKeystoreService";
        static final int TRANSACTION_getState = 1;
        static final int TRANSACTION_get = 2;
        static final int TRANSACTION_insert = 3;
        static final int TRANSACTION_del = 4;
        static final int TRANSACTION_exist = 5;
        static final int TRANSACTION_list = 6;
        static final int TRANSACTION_reset = 7;
        static final int TRANSACTION_onUserPasswordChanged = 8;
        static final int TRANSACTION_lock = 9;
        static final int TRANSACTION_unlock = 10;
        static final int TRANSACTION_isEmpty = 11;
        static final int TRANSACTION_grant = 12;
        static final int TRANSACTION_ungrant = 13;
        static final int TRANSACTION_getmtime = 14;
        static final int TRANSACTION_is_hardware_backed = 15;
        static final int TRANSACTION_clear_uid = 16;
        static final int TRANSACTION_addRngEntropy = 17;
        static final int TRANSACTION_generateKey = 18;
        static final int TRANSACTION_getKeyCharacteristics = 19;
        static final int TRANSACTION_importKey = 20;
        static final int TRANSACTION_exportKey = 21;
        static final int TRANSACTION_begin = 22;
        static final int TRANSACTION_update = 23;
        static final int TRANSACTION_finish = 24;
        static final int TRANSACTION_abort = 25;
        static final int TRANSACTION_addAuthToken = 26;
        static final int TRANSACTION_onUserAdded = 27;
        static final int TRANSACTION_onUserRemoved = 28;
        static final int TRANSACTION_attestKey = 29;
        static final int TRANSACTION_attestDeviceIds = 30;
        static final int TRANSACTION_onDeviceOffBody = 31;
        static final int TRANSACTION_importWrappedKey = 32;
        static final int TRANSACTION_presentConfirmationPrompt = 33;
        static final int TRANSACTION_cancelConfirmationPrompt = 34;
        static final int TRANSACTION_isConfirmationPromptSupported = 35;
        static final int TRANSACTION_onKeyguardVisibilityChanged = 36;
        static final int TRANSACTION_listUidsOfAuthBoundKeys = 37;
        public Stub() { super(); }
        public static android.security.keystore.IKeystoreService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.security.keystore.IKeystoreService p0) { return false; }
        public static android.security.keystore.IKeystoreService getDefaultImpl() { return null; }

        private static class Proxy implements android.security.keystore.IKeystoreService {
            private android.os.IBinder mRemote;
            public static android.security.keystore.IKeystoreService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int getState(int p0) throws android.os.RemoteException { return 0; }
            public byte[] get(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public int insert(java.lang.String p0, byte[] p1, int p2, int p3) throws android.os.RemoteException { return 0; }
            public int del(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public int exist(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public java.lang.String[] list(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public int reset() throws android.os.RemoteException { return 0; }
            public int onUserPasswordChanged(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int lock(int p0) throws android.os.RemoteException { return 0; }
            public int unlock(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int isEmpty(int p0) throws android.os.RemoteException { return 0; }
            public java.lang.String grant(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public int ungrant(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public long getmtime(java.lang.String p0, int p1) throws android.os.RemoteException { return 0L; }
            public int is_hardware_backed(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int clear_uid(long p0) throws android.os.RemoteException { return 0; }
            public int addRngEntropy(android.security.keystore.IKeystoreResponseCallback p0, byte[] p1, int p2) throws android.os.RemoteException { return 0; }
            public int generateKey(android.security.keystore.IKeystoreKeyCharacteristicsCallback p0, java.lang.String p1, android.security.keymaster.KeymasterArguments p2, byte[] p3, int p4, int p5) throws android.os.RemoteException { return 0; }
            public int getKeyCharacteristics(android.security.keystore.IKeystoreKeyCharacteristicsCallback p0, java.lang.String p1, android.security.keymaster.KeymasterBlob p2, android.security.keymaster.KeymasterBlob p3, int p4) throws android.os.RemoteException { return 0; }
            public int importKey(android.security.keystore.IKeystoreKeyCharacteristicsCallback p0, java.lang.String p1, android.security.keymaster.KeymasterArguments p2, int p3, byte[] p4, int p5, int p6) throws android.os.RemoteException { return 0; }
            public int exportKey(android.security.keystore.IKeystoreExportKeyCallback p0, java.lang.String p1, int p2, android.security.keymaster.KeymasterBlob p3, android.security.keymaster.KeymasterBlob p4, int p5) throws android.os.RemoteException { return 0; }
            public int begin(android.security.keystore.IKeystoreOperationResultCallback p0, android.os.IBinder p1, java.lang.String p2, int p3, boolean p4, android.security.keymaster.KeymasterArguments p5, byte[] p6, int p7) throws android.os.RemoteException { return 0; }
            public int update(android.security.keystore.IKeystoreOperationResultCallback p0, android.os.IBinder p1, android.security.keymaster.KeymasterArguments p2, byte[] p3) throws android.os.RemoteException { return 0; }
            public int finish(android.security.keystore.IKeystoreOperationResultCallback p0, android.os.IBinder p1, android.security.keymaster.KeymasterArguments p2, byte[] p3, byte[] p4) throws android.os.RemoteException { return 0; }
            public int abort(android.security.keystore.IKeystoreResponseCallback p0, android.os.IBinder p1) throws android.os.RemoteException { return 0; }
            public int addAuthToken(byte[] p0) throws android.os.RemoteException { return 0; }
            public int onUserAdded(int p0, int p1) throws android.os.RemoteException { return 0; }
            public int onUserRemoved(int p0) throws android.os.RemoteException { return 0; }
            public int attestKey(android.security.keystore.IKeystoreCertificateChainCallback p0, java.lang.String p1, android.security.keymaster.KeymasterArguments p2) throws android.os.RemoteException { return 0; }
            public int attestDeviceIds(android.security.keystore.IKeystoreCertificateChainCallback p0, android.security.keymaster.KeymasterArguments p1) throws android.os.RemoteException { return 0; }
            public int onDeviceOffBody() throws android.os.RemoteException { return 0; }
            public int importWrappedKey(android.security.keystore.IKeystoreKeyCharacteristicsCallback p0, java.lang.String p1, byte[] p2, java.lang.String p3, byte[] p4, android.security.keymaster.KeymasterArguments p5, long p6, long p7) throws android.os.RemoteException { return 0; }
            public int presentConfirmationPrompt(android.os.IBinder p0, java.lang.String p1, byte[] p2, java.lang.String p3, int p4) throws android.os.RemoteException { return 0; }
            public int cancelConfirmationPrompt(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public boolean isConfirmationPromptSupported() throws android.os.RemoteException { return false; }
            public int onKeyguardVisibilityChanged(boolean p0, int p1) throws android.os.RemoteException { return 0; }
            public int listUidsOfAuthBoundKeys(java.util.List<java.lang.String> p0) throws android.os.RemoteException { return 0; }
        }
    }

    public static class Default implements android.security.keystore.IKeystoreService {
        public Default() {}
        public int getState(int p0) throws android.os.RemoteException { return 0; }
        public byte[] get(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public int insert(java.lang.String p0, byte[] p1, int p2, int p3) throws android.os.RemoteException { return 0; }
        public int del(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public int exist(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public java.lang.String[] list(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public int reset() throws android.os.RemoteException { return 0; }
        public int onUserPasswordChanged(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int lock(int p0) throws android.os.RemoteException { return 0; }
        public int unlock(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int isEmpty(int p0) throws android.os.RemoteException { return 0; }
        public java.lang.String grant(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public int ungrant(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public long getmtime(java.lang.String p0, int p1) throws android.os.RemoteException { return 0L; }
        public int is_hardware_backed(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int clear_uid(long p0) throws android.os.RemoteException { return 0; }
        public int addRngEntropy(android.security.keystore.IKeystoreResponseCallback p0, byte[] p1, int p2) throws android.os.RemoteException { return 0; }
        public int generateKey(android.security.keystore.IKeystoreKeyCharacteristicsCallback p0, java.lang.String p1, android.security.keymaster.KeymasterArguments p2, byte[] p3, int p4, int p5) throws android.os.RemoteException { return 0; }
        public int getKeyCharacteristics(android.security.keystore.IKeystoreKeyCharacteristicsCallback p0, java.lang.String p1, android.security.keymaster.KeymasterBlob p2, android.security.keymaster.KeymasterBlob p3, int p4) throws android.os.RemoteException { return 0; }
        public int importKey(android.security.keystore.IKeystoreKeyCharacteristicsCallback p0, java.lang.String p1, android.security.keymaster.KeymasterArguments p2, int p3, byte[] p4, int p5, int p6) throws android.os.RemoteException { return 0; }
        public int exportKey(android.security.keystore.IKeystoreExportKeyCallback p0, java.lang.String p1, int p2, android.security.keymaster.KeymasterBlob p3, android.security.keymaster.KeymasterBlob p4, int p5) throws android.os.RemoteException { return 0; }
        public int begin(android.security.keystore.IKeystoreOperationResultCallback p0, android.os.IBinder p1, java.lang.String p2, int p3, boolean p4, android.security.keymaster.KeymasterArguments p5, byte[] p6, int p7) throws android.os.RemoteException { return 0; }
        public int update(android.security.keystore.IKeystoreOperationResultCallback p0, android.os.IBinder p1, android.security.keymaster.KeymasterArguments p2, byte[] p3) throws android.os.RemoteException { return 0; }
        public int finish(android.security.keystore.IKeystoreOperationResultCallback p0, android.os.IBinder p1, android.security.keymaster.KeymasterArguments p2, byte[] p3, byte[] p4) throws android.os.RemoteException { return 0; }
        public int abort(android.security.keystore.IKeystoreResponseCallback p0, android.os.IBinder p1) throws android.os.RemoteException { return 0; }
        public int addAuthToken(byte[] p0) throws android.os.RemoteException { return 0; }
        public int onUserAdded(int p0, int p1) throws android.os.RemoteException { return 0; }
        public int onUserRemoved(int p0) throws android.os.RemoteException { return 0; }
        public int attestKey(android.security.keystore.IKeystoreCertificateChainCallback p0, java.lang.String p1, android.security.keymaster.KeymasterArguments p2) throws android.os.RemoteException { return 0; }
        public int attestDeviceIds(android.security.keystore.IKeystoreCertificateChainCallback p0, android.security.keymaster.KeymasterArguments p1) throws android.os.RemoteException { return 0; }
        public int onDeviceOffBody() throws android.os.RemoteException { return 0; }
        public int importWrappedKey(android.security.keystore.IKeystoreKeyCharacteristicsCallback p0, java.lang.String p1, byte[] p2, java.lang.String p3, byte[] p4, android.security.keymaster.KeymasterArguments p5, long p6, long p7) throws android.os.RemoteException { return 0; }
        public int presentConfirmationPrompt(android.os.IBinder p0, java.lang.String p1, byte[] p2, java.lang.String p3, int p4) throws android.os.RemoteException { return 0; }
        public int cancelConfirmationPrompt(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public boolean isConfirmationPromptSupported() throws android.os.RemoteException { return false; }
        public int onKeyguardVisibilityChanged(boolean p0, int p1) throws android.os.RemoteException { return 0; }
        public int listUidsOfAuthBoundKeys(java.util.List<java.lang.String> p0) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }
}
