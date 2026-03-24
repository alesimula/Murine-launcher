package android.system.keystore2;

public interface IKeystoreSecurityLevel extends android.os.IInterface {
    public static final int VERSION = 5;
    public static final java.lang.String HASH = "98d815116c190250e9e5a1d9182cea8126fd0e97";
    public static final java.lang.String DESCRIPTOR = null;
    public static final int KEY_FLAG_AUTH_BOUND_WITHOUT_CRYPTOGRAPHIC_LSKF_BINDING = 1;
    public android.system.keystore2.CreateOperationResponse createOperation(android.system.keystore2.KeyDescriptor p0, android.hardware.security.keymint.KeyParameter[] p1, boolean p2) throws android.os.RemoteException;
    public android.system.keystore2.KeyMetadata generateKey(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyDescriptor p1, android.hardware.security.keymint.KeyParameter[] p2, int p3, byte[] p4) throws android.os.RemoteException;
    public android.system.keystore2.KeyMetadata importKey(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyDescriptor p1, android.hardware.security.keymint.KeyParameter[] p2, int p3, byte[] p4) throws android.os.RemoteException;
    public android.system.keystore2.KeyMetadata importWrappedKey(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyDescriptor p1, byte[] p2, android.hardware.security.keymint.KeyParameter[] p3, android.system.keystore2.AuthenticatorSpec[] p4) throws android.os.RemoteException;
    public android.system.keystore2.EphemeralStorageKeyResponse convertStorageKeyToEphemeral(android.system.keystore2.KeyDescriptor p0) throws android.os.RemoteException;
    public void deleteKey(android.system.keystore2.KeyDescriptor p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.system.keystore2.IKeystoreSecurityLevel {
        public Default() {}
        public android.system.keystore2.CreateOperationResponse createOperation(android.system.keystore2.KeyDescriptor p0, android.hardware.security.keymint.KeyParameter[] p1, boolean p2) throws android.os.RemoteException { return null; }
        public android.system.keystore2.KeyMetadata generateKey(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyDescriptor p1, android.hardware.security.keymint.KeyParameter[] p2, int p3, byte[] p4) throws android.os.RemoteException { return null; }
        public android.system.keystore2.KeyMetadata importKey(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyDescriptor p1, android.hardware.security.keymint.KeyParameter[] p2, int p3, byte[] p4) throws android.os.RemoteException { return null; }
        public android.system.keystore2.KeyMetadata importWrappedKey(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyDescriptor p1, byte[] p2, android.hardware.security.keymint.KeyParameter[] p3, android.system.keystore2.AuthenticatorSpec[] p4) throws android.os.RemoteException { return null; }
        public android.system.keystore2.EphemeralStorageKeyResponse convertStorageKeyToEphemeral(android.system.keystore2.KeyDescriptor p0) throws android.os.RemoteException { return null; }
        public void deleteKey(android.system.keystore2.KeyDescriptor p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.system.keystore2.IKeystoreSecurityLevel {
        static final int TRANSACTION_createOperation = 1;
        static final int TRANSACTION_generateKey = 2;
        static final int TRANSACTION_importKey = 3;
        static final int TRANSACTION_importWrappedKey = 4;
        static final int TRANSACTION_convertStorageKeyToEphemeral = 5;
        static final int TRANSACTION_deleteKey = 6;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.system.keystore2.IKeystoreSecurityLevel asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.system.keystore2.IKeystoreSecurityLevel {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.system.keystore2.CreateOperationResponse createOperation(android.system.keystore2.KeyDescriptor p0, android.hardware.security.keymint.KeyParameter[] p1, boolean p2) throws android.os.RemoteException { return null; }
            public android.system.keystore2.KeyMetadata generateKey(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyDescriptor p1, android.hardware.security.keymint.KeyParameter[] p2, int p3, byte[] p4) throws android.os.RemoteException { return null; }
            public android.system.keystore2.KeyMetadata importKey(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyDescriptor p1, android.hardware.security.keymint.KeyParameter[] p2, int p3, byte[] p4) throws android.os.RemoteException { return null; }
            public android.system.keystore2.KeyMetadata importWrappedKey(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyDescriptor p1, byte[] p2, android.hardware.security.keymint.KeyParameter[] p3, android.system.keystore2.AuthenticatorSpec[] p4) throws android.os.RemoteException { return null; }
            public android.system.keystore2.EphemeralStorageKeyResponse convertStorageKeyToEphemeral(android.system.keystore2.KeyDescriptor p0) throws android.os.RemoteException { return null; }
            public void deleteKey(android.system.keystore2.KeyDescriptor p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
