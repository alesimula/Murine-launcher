package android.hardware.tv.tuner;

public interface IDemux extends android.os.IInterface {
    public static final int VERSION = 1;
    public static final java.lang.String HASH = "d42f1677ada3f62036894111686245c3c8310fe4";
    public static final java.lang.String DESCRIPTOR = null;
    public void setFrontendDataSource(int p0) throws android.os.RemoteException;
    public android.hardware.tv.tuner.IFilter openFilter(android.hardware.tv.tuner.DemuxFilterType p0, int p1, android.hardware.tv.tuner.IFilterCallback p2) throws android.os.RemoteException;
    public android.hardware.tv.tuner.ITimeFilter openTimeFilter() throws android.os.RemoteException;
    public int getAvSyncHwId(android.hardware.tv.tuner.IFilter p0) throws android.os.RemoteException;
    public long getAvSyncTime(int p0) throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    public android.hardware.tv.tuner.IDvr openDvr(byte p0, int p1, android.hardware.tv.tuner.IDvrCallback p2) throws android.os.RemoteException;
    public void connectCiCam(int p0) throws android.os.RemoteException;
    public void disconnectCiCam() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.tv.tuner.IDemux {
        public Default() {}
        public void setFrontendDataSource(int p0) throws android.os.RemoteException {}
        public android.hardware.tv.tuner.IFilter openFilter(android.hardware.tv.tuner.DemuxFilterType p0, int p1, android.hardware.tv.tuner.IFilterCallback p2) throws android.os.RemoteException { return null; }
        public android.hardware.tv.tuner.ITimeFilter openTimeFilter() throws android.os.RemoteException { return null; }
        public int getAvSyncHwId(android.hardware.tv.tuner.IFilter p0) throws android.os.RemoteException { return 0; }
        public long getAvSyncTime(int p0) throws android.os.RemoteException { return 0L; }
        public void close() throws android.os.RemoteException {}
        public android.hardware.tv.tuner.IDvr openDvr(byte p0, int p1, android.hardware.tv.tuner.IDvrCallback p2) throws android.os.RemoteException { return null; }
        public void connectCiCam(int p0) throws android.os.RemoteException {}
        public void disconnectCiCam() throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.tv.tuner.IDemux {
        static final int TRANSACTION_setFrontendDataSource = 1;
        static final int TRANSACTION_openFilter = 2;
        static final int TRANSACTION_openTimeFilter = 3;
        static final int TRANSACTION_getAvSyncHwId = 4;
        static final int TRANSACTION_getAvSyncTime = 5;
        static final int TRANSACTION_close = 6;
        static final int TRANSACTION_openDvr = 7;
        static final int TRANSACTION_connectCiCam = 8;
        static final int TRANSACTION_disconnectCiCam = 9;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.tv.tuner.IDemux asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.tv.tuner.IDemux {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setFrontendDataSource(int p0) throws android.os.RemoteException {}
            public android.hardware.tv.tuner.IFilter openFilter(android.hardware.tv.tuner.DemuxFilterType p0, int p1, android.hardware.tv.tuner.IFilterCallback p2) throws android.os.RemoteException { return null; }
            public android.hardware.tv.tuner.ITimeFilter openTimeFilter() throws android.os.RemoteException { return null; }
            public int getAvSyncHwId(android.hardware.tv.tuner.IFilter p0) throws android.os.RemoteException { return 0; }
            public long getAvSyncTime(int p0) throws android.os.RemoteException { return 0L; }
            public void close() throws android.os.RemoteException {}
            public android.hardware.tv.tuner.IDvr openDvr(byte p0, int p1, android.hardware.tv.tuner.IDvrCallback p2) throws android.os.RemoteException { return null; }
            public void connectCiCam(int p0) throws android.os.RemoteException {}
            public void disconnectCiCam() throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
