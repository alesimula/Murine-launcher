package android.os;

public interface IUpdateEngineStable extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "ee2e6f0bd51391955f79f4d5eeeafc37c668cd40";
    public static final java.lang.String DESCRIPTOR = null;
    public void applyPayloadFd(android.os.ParcelFileDescriptor p0, long p1, long p2, java.lang.String[] p3) throws android.os.RemoteException;
    public boolean bind(android.os.IUpdateEngineStableCallback p0) throws android.os.RemoteException;
    public boolean unbind(android.os.IUpdateEngineStableCallback p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.os.IUpdateEngineStable {
        public Default() {}
        public void applyPayloadFd(android.os.ParcelFileDescriptor p0, long p1, long p2, java.lang.String[] p3) throws android.os.RemoteException {}
        public boolean bind(android.os.IUpdateEngineStableCallback p0) throws android.os.RemoteException { return false; }
        public boolean unbind(android.os.IUpdateEngineStableCallback p0) throws android.os.RemoteException { return false; }
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IUpdateEngineStable {
        static final int TRANSACTION_applyPayloadFd = 1;
        static final int TRANSACTION_bind = 2;
        static final int TRANSACTION_unbind = 3;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.os.IUpdateEngineStable asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.os.IUpdateEngineStable {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void applyPayloadFd(android.os.ParcelFileDescriptor p0, long p1, long p2, java.lang.String[] p3) throws android.os.RemoteException {}
            public boolean bind(android.os.IUpdateEngineStableCallback p0) throws android.os.RemoteException { return false; }
            public boolean unbind(android.os.IUpdateEngineStableCallback p0) throws android.os.RemoteException { return false; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
