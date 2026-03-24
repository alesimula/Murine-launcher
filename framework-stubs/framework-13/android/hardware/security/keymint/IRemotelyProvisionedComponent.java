package android.hardware.security.keymint;

public interface IRemotelyProvisionedComponent extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "207c9f218b9b9e4e74ff5232eb16511eca9d7d2e";
    public static final java.lang.String DESCRIPTOR = null;
    public static final int STATUS_FAILED = 1;
    public static final int STATUS_INVALID_MAC = 2;
    public static final int STATUS_PRODUCTION_KEY_IN_TEST_REQUEST = 3;
    public static final int STATUS_TEST_KEY_IN_PRODUCTION_REQUEST = 4;
    public static final int STATUS_INVALID_EEK = 5;
    public android.hardware.security.keymint.RpcHardwareInfo getHardwareInfo() throws android.os.RemoteException;
    public byte[] generateEcdsaP256KeyPair(boolean p0, android.hardware.security.keymint.MacedPublicKey p1) throws android.os.RemoteException;
    public byte[] generateCertificateRequest(boolean p0, android.hardware.security.keymint.MacedPublicKey[] p1, byte[] p2, byte[] p3, android.hardware.security.keymint.DeviceInfo p4, android.hardware.security.keymint.ProtectedData p5) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.security.keymint.IRemotelyProvisionedComponent {
        public Default() {}
        public android.hardware.security.keymint.RpcHardwareInfo getHardwareInfo() throws android.os.RemoteException { return null; }
        public byte[] generateEcdsaP256KeyPair(boolean p0, android.hardware.security.keymint.MacedPublicKey p1) throws android.os.RemoteException { return null; }
        public byte[] generateCertificateRequest(boolean p0, android.hardware.security.keymint.MacedPublicKey[] p1, byte[] p2, byte[] p3, android.hardware.security.keymint.DeviceInfo p4, android.hardware.security.keymint.ProtectedData p5) throws android.os.RemoteException { return null; }
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.security.keymint.IRemotelyProvisionedComponent {
        static final int TRANSACTION_getHardwareInfo = 1;
        static final int TRANSACTION_generateEcdsaP256KeyPair = 2;
        static final int TRANSACTION_generateCertificateRequest = 3;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.security.keymint.IRemotelyProvisionedComponent asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.security.keymint.IRemotelyProvisionedComponent {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.security.keymint.RpcHardwareInfo getHardwareInfo() throws android.os.RemoteException { return null; }
            public byte[] generateEcdsaP256KeyPair(boolean p0, android.hardware.security.keymint.MacedPublicKey p1) throws android.os.RemoteException { return null; }
            public byte[] generateCertificateRequest(boolean p0, android.hardware.security.keymint.MacedPublicKey[] p1, byte[] p2, byte[] p3, android.hardware.security.keymint.DeviceInfo p4, android.hardware.security.keymint.ProtectedData p5) throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
