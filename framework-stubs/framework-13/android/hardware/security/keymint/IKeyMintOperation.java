package android.hardware.security.keymint;

public interface IKeyMintOperation extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "207c9f218b9b9e4e74ff5232eb16511eca9d7d2e";
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

        private static class Proxy implements android.hardware.security.keymint.IKeyMintOperation {
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
