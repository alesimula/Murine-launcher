package android.hardware.tv.tuner;

public interface IFilter extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "f8d74c149f04e76b6d622db2bd8e465dae24b08c";
    public static final java.lang.String DESCRIPTOR = null;
    public void getQueueDesc(android.hardware.common.fmq.MQDescriptor<java.lang.Byte, java.lang.Byte> p0) throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    public void configure(android.hardware.tv.tuner.DemuxFilterSettings p0) throws android.os.RemoteException;
    public void configureAvStreamType(android.hardware.tv.tuner.AvStreamType p0) throws android.os.RemoteException;
    public void configureIpCid(int p0) throws android.os.RemoteException;
    public void configureMonitorEvent(int p0) throws android.os.RemoteException;
    public void start() throws android.os.RemoteException;
    public void stop() throws android.os.RemoteException;
    public void flush() throws android.os.RemoteException;
    public long getAvSharedHandle(android.hardware.common.NativeHandle p0) throws android.os.RemoteException;
    public int getId() throws android.os.RemoteException;
    public long getId64Bit() throws android.os.RemoteException;
    public void releaseAvHandle(android.hardware.common.NativeHandle p0, long p1) throws android.os.RemoteException;
    public void setDataSource(android.hardware.tv.tuner.IFilter p0) throws android.os.RemoteException;
    public void setDelayHint(android.hardware.tv.tuner.FilterDelayHint p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.tv.tuner.IFilter {
        public Default() {}
        public void getQueueDesc(android.hardware.common.fmq.MQDescriptor<java.lang.Byte, java.lang.Byte> p0) throws android.os.RemoteException {}
        public void close() throws android.os.RemoteException {}
        public void configure(android.hardware.tv.tuner.DemuxFilterSettings p0) throws android.os.RemoteException {}
        public void configureAvStreamType(android.hardware.tv.tuner.AvStreamType p0) throws android.os.RemoteException {}
        public void configureIpCid(int p0) throws android.os.RemoteException {}
        public void configureMonitorEvent(int p0) throws android.os.RemoteException {}
        public void start() throws android.os.RemoteException {}
        public void stop() throws android.os.RemoteException {}
        public void flush() throws android.os.RemoteException {}
        public long getAvSharedHandle(android.hardware.common.NativeHandle p0) throws android.os.RemoteException { return 0L; }
        public int getId() throws android.os.RemoteException { return 0; }
        public long getId64Bit() throws android.os.RemoteException { return 0L; }
        public void releaseAvHandle(android.hardware.common.NativeHandle p0, long p1) throws android.os.RemoteException {}
        public void setDataSource(android.hardware.tv.tuner.IFilter p0) throws android.os.RemoteException {}
        public void setDelayHint(android.hardware.tv.tuner.FilterDelayHint p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.tv.tuner.IFilter {
        static final int TRANSACTION_getQueueDesc = 1;
        static final int TRANSACTION_close = 2;
        static final int TRANSACTION_configure = 3;
        static final int TRANSACTION_configureAvStreamType = 4;
        static final int TRANSACTION_configureIpCid = 5;
        static final int TRANSACTION_configureMonitorEvent = 6;
        static final int TRANSACTION_start = 7;
        static final int TRANSACTION_stop = 8;
        static final int TRANSACTION_flush = 9;
        static final int TRANSACTION_getAvSharedHandle = 10;
        static final int TRANSACTION_getId = 11;
        static final int TRANSACTION_getId64Bit = 12;
        static final int TRANSACTION_releaseAvHandle = 13;
        static final int TRANSACTION_setDataSource = 14;
        static final int TRANSACTION_setDelayHint = 15;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.tv.tuner.IFilter asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.tv.tuner.IFilter {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getQueueDesc(android.hardware.common.fmq.MQDescriptor<java.lang.Byte, java.lang.Byte> p0) throws android.os.RemoteException {}
            public void close() throws android.os.RemoteException {}
            public void configure(android.hardware.tv.tuner.DemuxFilterSettings p0) throws android.os.RemoteException {}
            public void configureAvStreamType(android.hardware.tv.tuner.AvStreamType p0) throws android.os.RemoteException {}
            public void configureIpCid(int p0) throws android.os.RemoteException {}
            public void configureMonitorEvent(int p0) throws android.os.RemoteException {}
            public void start() throws android.os.RemoteException {}
            public void stop() throws android.os.RemoteException {}
            public void flush() throws android.os.RemoteException {}
            public long getAvSharedHandle(android.hardware.common.NativeHandle p0) throws android.os.RemoteException { return 0L; }
            public int getId() throws android.os.RemoteException { return 0; }
            public long getId64Bit() throws android.os.RemoteException { return 0L; }
            public void releaseAvHandle(android.hardware.common.NativeHandle p0, long p1) throws android.os.RemoteException {}
            public void setDataSource(android.hardware.tv.tuner.IFilter p0) throws android.os.RemoteException {}
            public void setDelayHint(android.hardware.tv.tuner.FilterDelayHint p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
