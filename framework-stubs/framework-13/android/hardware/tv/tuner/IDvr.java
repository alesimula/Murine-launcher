package android.hardware.tv.tuner;

public interface IDvr extends android.os.IInterface {
    public static final int VERSION = 1;
    public static final java.lang.String HASH = "d42f1677ada3f62036894111686245c3c8310fe4";
    public static final java.lang.String DESCRIPTOR = null;
    public void getQueueDesc(android.hardware.common.fmq.MQDescriptor<java.lang.Byte, java.lang.Byte> p0) throws android.os.RemoteException;
    public void configure(android.hardware.tv.tuner.DvrSettings p0) throws android.os.RemoteException;
    public void attachFilter(android.hardware.tv.tuner.IFilter p0) throws android.os.RemoteException;
    public void detachFilter(android.hardware.tv.tuner.IFilter p0) throws android.os.RemoteException;
    public void start() throws android.os.RemoteException;
    public void stop() throws android.os.RemoteException;
    public void flush() throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.tv.tuner.IDvr {
        public Default() {}
        public void getQueueDesc(android.hardware.common.fmq.MQDescriptor<java.lang.Byte, java.lang.Byte> p0) throws android.os.RemoteException {}
        public void configure(android.hardware.tv.tuner.DvrSettings p0) throws android.os.RemoteException {}
        public void attachFilter(android.hardware.tv.tuner.IFilter p0) throws android.os.RemoteException {}
        public void detachFilter(android.hardware.tv.tuner.IFilter p0) throws android.os.RemoteException {}
        public void start() throws android.os.RemoteException {}
        public void stop() throws android.os.RemoteException {}
        public void flush() throws android.os.RemoteException {}
        public void close() throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.tv.tuner.IDvr {
        static final int TRANSACTION_getQueueDesc = 1;
        static final int TRANSACTION_configure = 2;
        static final int TRANSACTION_attachFilter = 3;
        static final int TRANSACTION_detachFilter = 4;
        static final int TRANSACTION_start = 5;
        static final int TRANSACTION_stop = 6;
        static final int TRANSACTION_flush = 7;
        static final int TRANSACTION_close = 8;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.tv.tuner.IDvr asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.tv.tuner.IDvr {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getQueueDesc(android.hardware.common.fmq.MQDescriptor<java.lang.Byte, java.lang.Byte> p0) throws android.os.RemoteException {}
            public void configure(android.hardware.tv.tuner.DvrSettings p0) throws android.os.RemoteException {}
            public void attachFilter(android.hardware.tv.tuner.IFilter p0) throws android.os.RemoteException {}
            public void detachFilter(android.hardware.tv.tuner.IFilter p0) throws android.os.RemoteException {}
            public void start() throws android.os.RemoteException {}
            public void stop() throws android.os.RemoteException {}
            public void flush() throws android.os.RemoteException {}
            public void close() throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
