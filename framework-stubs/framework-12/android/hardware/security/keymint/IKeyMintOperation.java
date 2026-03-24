package android.hardware.security.keymint;

public interface IKeyMintOperation extends android.os.IInterface {
    public static final int VERSION = 1;
    public static final java.lang.String HASH = "976674616001f714f4a4df49ee45f548de828524";
    public static final java.lang.String DESCRIPTOR = null;
    public void updateAad(byte[] p0, android.hardware.security.keymint.HardwareAuthToken p1, android.hardware.security.secureclock.TimeStampToken p2) throws android.os.RemoteException;
    public byte[] update(byte[] p0, android.hardware.security.keymint.HardwareAuthToken p1, android.hardware.security.secureclock.TimeStampToken p2) throws android.os.RemoteException;
    public byte[] finish(byte[] p0, byte[] p1, android.hardware.security.keymint.HardwareAuthToken p2, android.hardware.security.secureclock.TimeStampToken p3, byte[] p4) throws android.os.RemoteException;
    public void abort() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.security.keymint.IKeyMintOperation {
        public Default() {}
        public void updateAad(byte[] p0, android.hardware.security.keymint.HardwareAuthToken p1, android.hardware.security.secureclock.TimeStampToken p2) throws android.os.RemoteException {}
        public byte[] update(byte[] p0, android.hardware.security.keymint.HardwareAuthToken p1, android.hardware.security.secureclock.TimeStampToken p2) throws android.os.RemoteException { return null; }
        public byte[] finish(byte[] p0, byte[] p1, android.hardware.security.keymint.HardwareAuthToken p2, android.hardware.security.secureclock.TimeStampToken p3, byte[] p4) throws android.os.RemoteException { return null; }
        public void abort() throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.security.keymint.IKeyMintOperation {
        static final int TRANSACTION_updateAad = 1;
        static final int TRANSACTION_update = 2;
        static final int TRANSACTION_finish = 3;
        static final int TRANSACTION_abort = 4;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.security.keymint.IKeyMintOperation asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.security.keymint.IKeyMintOperation p0) { return false; }
        public static android.hardware.security.keymint.IKeyMintOperation getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.security.keymint.IKeyMintOperation {
            private android.os.IBinder mRemote;
            private int mCachedVersion;
            private java.lang.String mCachedHash;
            public static android.hardware.security.keymint.IKeyMintOperation sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void updateAad(byte[] p0, android.hardware.security.keymint.HardwareAuthToken p1, android.hardware.security.secureclock.TimeStampToken p2) throws android.os.RemoteException {}
            public byte[] update(byte[] p0, android.hardware.security.keymint.HardwareAuthToken p1, android.hardware.security.secureclock.TimeStampToken p2) throws android.os.RemoteException { return null; }
            public byte[] finish(byte[] p0, byte[] p1, android.hardware.security.keymint.HardwareAuthToken p2, android.hardware.security.secureclock.TimeStampToken p3, byte[] p4) throws android.os.RemoteException { return null; }
            public void abort() throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
