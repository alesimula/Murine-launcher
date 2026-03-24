package android.system.keystore2;

public interface IKeystoreOperation extends android.os.IInterface {
    public static final int VERSION = 4;
    public static final java.lang.String HASH = "5648acc9b43590ef0a775b6f5c553831c20cccc4";
    public static final java.lang.String DESCRIPTOR = null;
    public void updateAad(byte[] p0) throws android.os.RemoteException;
    public byte[] update(byte[] p0) throws android.os.RemoteException;
    public byte[] finish(byte[] p0, byte[] p1) throws android.os.RemoteException;
    public void abort() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.system.keystore2.IKeystoreOperation {
        public Default() {}
        public void updateAad(byte[] p0) throws android.os.RemoteException {}
        public byte[] update(byte[] p0) throws android.os.RemoteException { return null; }
        public byte[] finish(byte[] p0, byte[] p1) throws android.os.RemoteException { return null; }
        public void abort() throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.system.keystore2.IKeystoreOperation {
        static final int TRANSACTION_updateAad = 1;
        static final int TRANSACTION_update = 2;
        static final int TRANSACTION_finish = 3;
        static final int TRANSACTION_abort = 4;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.system.keystore2.IKeystoreOperation asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.system.keystore2.IKeystoreOperation {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void updateAad(byte[] p0) throws android.os.RemoteException {}
            public byte[] update(byte[] p0) throws android.os.RemoteException { return null; }
            public byte[] finish(byte[] p0, byte[] p1) throws android.os.RemoteException { return null; }
            public void abort() throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
