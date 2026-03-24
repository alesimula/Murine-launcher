package android.hardware.security.keymint;

public interface IKeyMintDevice extends android.os.IInterface {
    public static final int VERSION = 3;
    public static final java.lang.String HASH = "74a538630d5d90f732f361a2313cbb69b09eb047";
    public static final java.lang.String DESCRIPTOR = null;
    public static final int AUTH_TOKEN_MAC_LENGTH = 32;
    public android.hardware.security.keymint.KeyMintHardwareInfo getHardwareInfo() throws android.os.RemoteException;
    public void addRngEntropy(byte[] p0) throws android.os.RemoteException;
    public android.hardware.security.keymint.KeyCreationResult generateKey(android.hardware.security.keymint.KeyParameter[] p0, android.hardware.security.keymint.AttestationKey p1) throws android.os.RemoteException;
    public android.hardware.security.keymint.KeyCreationResult importKey(android.hardware.security.keymint.KeyParameter[] p0, int p1, byte[] p2, android.hardware.security.keymint.AttestationKey p3) throws android.os.RemoteException;
    public android.hardware.security.keymint.KeyCreationResult importWrappedKey(byte[] p0, byte[] p1, byte[] p2, android.hardware.security.keymint.KeyParameter[] p3, long p4, long p5) throws android.os.RemoteException;
    public byte[] upgradeKey(byte[] p0, android.hardware.security.keymint.KeyParameter[] p1) throws android.os.RemoteException;
    public void deleteKey(byte[] p0) throws android.os.RemoteException;
    public void deleteAllKeys() throws android.os.RemoteException;
    public void destroyAttestationIds() throws android.os.RemoteException;
    public android.hardware.security.keymint.BeginResult begin(int p0, byte[] p1, android.hardware.security.keymint.KeyParameter[] p2, android.hardware.security.keymint.HardwareAuthToken p3) throws android.os.RemoteException;
    public void deviceLocked(boolean p0, android.hardware.security.secureclock.TimeStampToken p1) throws android.os.RemoteException;
    public void earlyBootEnded() throws android.os.RemoteException;
    public byte[] convertStorageKeyToEphemeral(byte[] p0) throws android.os.RemoteException;
    public android.hardware.security.keymint.KeyCharacteristics[] getKeyCharacteristics(byte[] p0, byte[] p1, byte[] p2) throws android.os.RemoteException;
    public byte[] getRootOfTrustChallenge() throws android.os.RemoteException;
    public byte[] getRootOfTrust(byte[] p0) throws android.os.RemoteException;
    public void sendRootOfTrust(byte[] p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.security.keymint.IKeyMintDevice {
        public Default() {}
        public android.hardware.security.keymint.KeyMintHardwareInfo getHardwareInfo() throws android.os.RemoteException { return null; }
        public void addRngEntropy(byte[] p0) throws android.os.RemoteException {}
        public android.hardware.security.keymint.KeyCreationResult generateKey(android.hardware.security.keymint.KeyParameter[] p0, android.hardware.security.keymint.AttestationKey p1) throws android.os.RemoteException { return null; }
        public android.hardware.security.keymint.KeyCreationResult importKey(android.hardware.security.keymint.KeyParameter[] p0, int p1, byte[] p2, android.hardware.security.keymint.AttestationKey p3) throws android.os.RemoteException { return null; }
        public android.hardware.security.keymint.KeyCreationResult importWrappedKey(byte[] p0, byte[] p1, byte[] p2, android.hardware.security.keymint.KeyParameter[] p3, long p4, long p5) throws android.os.RemoteException { return null; }
        public byte[] upgradeKey(byte[] p0, android.hardware.security.keymint.KeyParameter[] p1) throws android.os.RemoteException { return null; }
        public void deleteKey(byte[] p0) throws android.os.RemoteException {}
        public void deleteAllKeys() throws android.os.RemoteException {}
        public void destroyAttestationIds() throws android.os.RemoteException {}
        public android.hardware.security.keymint.BeginResult begin(int p0, byte[] p1, android.hardware.security.keymint.KeyParameter[] p2, android.hardware.security.keymint.HardwareAuthToken p3) throws android.os.RemoteException { return null; }
        public void deviceLocked(boolean p0, android.hardware.security.secureclock.TimeStampToken p1) throws android.os.RemoteException {}
        public void earlyBootEnded() throws android.os.RemoteException {}
        public byte[] convertStorageKeyToEphemeral(byte[] p0) throws android.os.RemoteException { return null; }
        public android.hardware.security.keymint.KeyCharacteristics[] getKeyCharacteristics(byte[] p0, byte[] p1, byte[] p2) throws android.os.RemoteException { return null; }
        public byte[] getRootOfTrustChallenge() throws android.os.RemoteException { return null; }
        public byte[] getRootOfTrust(byte[] p0) throws android.os.RemoteException { return null; }
        public void sendRootOfTrust(byte[] p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.security.keymint.IKeyMintDevice {
        static final int TRANSACTION_getHardwareInfo = 1;
        static final int TRANSACTION_addRngEntropy = 2;
        static final int TRANSACTION_generateKey = 3;
        static final int TRANSACTION_importKey = 4;
        static final int TRANSACTION_importWrappedKey = 5;
        static final int TRANSACTION_upgradeKey = 6;
        static final int TRANSACTION_deleteKey = 7;
        static final int TRANSACTION_deleteAllKeys = 8;
        static final int TRANSACTION_destroyAttestationIds = 9;
        static final int TRANSACTION_begin = 10;
        static final int TRANSACTION_deviceLocked = 11;
        static final int TRANSACTION_earlyBootEnded = 12;
        static final int TRANSACTION_convertStorageKeyToEphemeral = 13;
        static final int TRANSACTION_getKeyCharacteristics = 14;
        static final int TRANSACTION_getRootOfTrustChallenge = 15;
        static final int TRANSACTION_getRootOfTrust = 16;
        static final int TRANSACTION_sendRootOfTrust = 17;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.security.keymint.IKeyMintDevice asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.security.keymint.IKeyMintDevice {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.security.keymint.KeyMintHardwareInfo getHardwareInfo() throws android.os.RemoteException { return null; }
            public void addRngEntropy(byte[] p0) throws android.os.RemoteException {}
            public android.hardware.security.keymint.KeyCreationResult generateKey(android.hardware.security.keymint.KeyParameter[] p0, android.hardware.security.keymint.AttestationKey p1) throws android.os.RemoteException { return null; }
            public android.hardware.security.keymint.KeyCreationResult importKey(android.hardware.security.keymint.KeyParameter[] p0, int p1, byte[] p2, android.hardware.security.keymint.AttestationKey p3) throws android.os.RemoteException { return null; }
            public android.hardware.security.keymint.KeyCreationResult importWrappedKey(byte[] p0, byte[] p1, byte[] p2, android.hardware.security.keymint.KeyParameter[] p3, long p4, long p5) throws android.os.RemoteException { return null; }
            public byte[] upgradeKey(byte[] p0, android.hardware.security.keymint.KeyParameter[] p1) throws android.os.RemoteException { return null; }
            public void deleteKey(byte[] p0) throws android.os.RemoteException {}
            public void deleteAllKeys() throws android.os.RemoteException {}
            public void destroyAttestationIds() throws android.os.RemoteException {}
            public android.hardware.security.keymint.BeginResult begin(int p0, byte[] p1, android.hardware.security.keymint.KeyParameter[] p2, android.hardware.security.keymint.HardwareAuthToken p3) throws android.os.RemoteException { return null; }
            public void deviceLocked(boolean p0, android.hardware.security.secureclock.TimeStampToken p1) throws android.os.RemoteException {}
            public void earlyBootEnded() throws android.os.RemoteException {}
            public byte[] convertStorageKeyToEphemeral(byte[] p0) throws android.os.RemoteException { return null; }
            public android.hardware.security.keymint.KeyCharacteristics[] getKeyCharacteristics(byte[] p0, byte[] p1, byte[] p2) throws android.os.RemoteException { return null; }
            public byte[] getRootOfTrustChallenge() throws android.os.RemoteException { return null; }
            public byte[] getRootOfTrust(byte[] p0) throws android.os.RemoteException { return null; }
            public void sendRootOfTrust(byte[] p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
