package android.hardware.gnss;

public interface IAGnss extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "fc957f1d3d261d065ff5e5415f2d21caa79c310f";
    public static final java.lang.String DESCRIPTOR = null;
    public void setCallback(android.hardware.gnss.IAGnssCallback p0) throws android.os.RemoteException;
    public void dataConnClosed() throws android.os.RemoteException;
    public void dataConnFailed() throws android.os.RemoteException;
    public void setServer(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void dataConnOpen(long p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static @interface ApnIpType {
        public static final int INVALID = 0;
        public static final int IPV4 = 1;
        public static final int IPV6 = 2;
        public static final int IPV4V6 = 3;
    }

    public static class Default implements android.hardware.gnss.IAGnss {
        public Default() {}
        public void setCallback(android.hardware.gnss.IAGnssCallback p0) throws android.os.RemoteException {}
        public void dataConnClosed() throws android.os.RemoteException {}
        public void dataConnFailed() throws android.os.RemoteException {}
        public void setServer(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void dataConnOpen(long p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.IAGnss {
        static final int TRANSACTION_setCallback = 1;
        static final int TRANSACTION_dataConnClosed = 2;
        static final int TRANSACTION_dataConnFailed = 3;
        static final int TRANSACTION_setServer = 4;
        static final int TRANSACTION_dataConnOpen = 5;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.gnss.IAGnss asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.gnss.IAGnss {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setCallback(android.hardware.gnss.IAGnssCallback p0) throws android.os.RemoteException {}
            public void dataConnClosed() throws android.os.RemoteException {}
            public void dataConnFailed() throws android.os.RemoteException {}
            public void setServer(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void dataConnOpen(long p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
