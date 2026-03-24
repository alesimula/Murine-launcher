package android.hardware.cas;

public interface ICas extends android.os.IInterface {
    public static final int VERSION = 1;
    public static final java.lang.String HASH = "bc51d8d70a55ec4723d3f73d0acf7003306bf69f";
    public static final java.lang.String DESCRIPTOR = null;
    public void closeSession(byte[] p0) throws android.os.RemoteException;
    public byte[] openSessionDefault() throws android.os.RemoteException;
    public byte[] openSession(int p0, int p1) throws android.os.RemoteException;
    public void processEcm(byte[] p0, byte[] p1) throws android.os.RemoteException;
    public void processEmm(byte[] p0) throws android.os.RemoteException;
    public void provision(java.lang.String p0) throws android.os.RemoteException;
    public void refreshEntitlements(int p0, byte[] p1) throws android.os.RemoteException;
    public void release() throws android.os.RemoteException;
    public void sendEvent(int p0, int p1, byte[] p2) throws android.os.RemoteException;
    public void sendSessionEvent(byte[] p0, int p1, int p2, byte[] p3) throws android.os.RemoteException;
    public void setPrivateData(byte[] p0) throws android.os.RemoteException;
    public void setSessionPrivateData(byte[] p0, byte[] p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.cas.ICas {
        public Default() {}
        public void closeSession(byte[] p0) throws android.os.RemoteException {}
        public byte[] openSessionDefault() throws android.os.RemoteException { return null; }
        public byte[] openSession(int p0, int p1) throws android.os.RemoteException { return null; }
        public void processEcm(byte[] p0, byte[] p1) throws android.os.RemoteException {}
        public void processEmm(byte[] p0) throws android.os.RemoteException {}
        public void provision(java.lang.String p0) throws android.os.RemoteException {}
        public void refreshEntitlements(int p0, byte[] p1) throws android.os.RemoteException {}
        public void release() throws android.os.RemoteException {}
        public void sendEvent(int p0, int p1, byte[] p2) throws android.os.RemoteException {}
        public void sendSessionEvent(byte[] p0, int p1, int p2, byte[] p3) throws android.os.RemoteException {}
        public void setPrivateData(byte[] p0) throws android.os.RemoteException {}
        public void setSessionPrivateData(byte[] p0, byte[] p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.cas.ICas {
        static final int TRANSACTION_closeSession = 1;
        static final int TRANSACTION_openSessionDefault = 2;
        static final int TRANSACTION_openSession = 3;
        static final int TRANSACTION_processEcm = 4;
        static final int TRANSACTION_processEmm = 5;
        static final int TRANSACTION_provision = 6;
        static final int TRANSACTION_refreshEntitlements = 7;
        static final int TRANSACTION_release = 8;
        static final int TRANSACTION_sendEvent = 9;
        static final int TRANSACTION_sendSessionEvent = 10;
        static final int TRANSACTION_setPrivateData = 11;
        static final int TRANSACTION_setSessionPrivateData = 12;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.cas.ICas asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.cas.ICas {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void closeSession(byte[] p0) throws android.os.RemoteException {}
            public byte[] openSessionDefault() throws android.os.RemoteException { return null; }
            public byte[] openSession(int p0, int p1) throws android.os.RemoteException { return null; }
            public void processEcm(byte[] p0, byte[] p1) throws android.os.RemoteException {}
            public void processEmm(byte[] p0) throws android.os.RemoteException {}
            public void provision(java.lang.String p0) throws android.os.RemoteException {}
            public void refreshEntitlements(int p0, byte[] p1) throws android.os.RemoteException {}
            public void release() throws android.os.RemoteException {}
            public void sendEvent(int p0, int p1, byte[] p2) throws android.os.RemoteException {}
            public void sendSessionEvent(byte[] p0, int p1, int p2, byte[] p3) throws android.os.RemoteException {}
            public void setPrivateData(byte[] p0) throws android.os.RemoteException {}
            public void setSessionPrivateData(byte[] p0, byte[] p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
