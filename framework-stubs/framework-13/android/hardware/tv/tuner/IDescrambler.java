package android.hardware.tv.tuner;

public interface IDescrambler extends android.os.IInterface {
    public static final int VERSION = 1;
    public static final java.lang.String HASH = "d42f1677ada3f62036894111686245c3c8310fe4";
    public static final java.lang.String DESCRIPTOR = null;
    public void setDemuxSource(int p0) throws android.os.RemoteException;
    public void setKeyToken(byte[] p0) throws android.os.RemoteException;
    public void addPid(android.hardware.tv.tuner.DemuxPid p0, android.hardware.tv.tuner.IFilter p1) throws android.os.RemoteException;
    public void removePid(android.hardware.tv.tuner.DemuxPid p0, android.hardware.tv.tuner.IFilter p1) throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.tv.tuner.IDescrambler {
        public Default() {}
        public void setDemuxSource(int p0) throws android.os.RemoteException {}
        public void setKeyToken(byte[] p0) throws android.os.RemoteException {}
        public void addPid(android.hardware.tv.tuner.DemuxPid p0, android.hardware.tv.tuner.IFilter p1) throws android.os.RemoteException {}
        public void removePid(android.hardware.tv.tuner.DemuxPid p0, android.hardware.tv.tuner.IFilter p1) throws android.os.RemoteException {}
        public void close() throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.tv.tuner.IDescrambler {
        static final int TRANSACTION_setDemuxSource = 1;
        static final int TRANSACTION_setKeyToken = 2;
        static final int TRANSACTION_addPid = 3;
        static final int TRANSACTION_removePid = 4;
        static final int TRANSACTION_close = 5;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.tv.tuner.IDescrambler asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.tv.tuner.IDescrambler {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setDemuxSource(int p0) throws android.os.RemoteException {}
            public void setKeyToken(byte[] p0) throws android.os.RemoteException {}
            public void addPid(android.hardware.tv.tuner.DemuxPid p0, android.hardware.tv.tuner.IFilter p1) throws android.os.RemoteException {}
            public void removePid(android.hardware.tv.tuner.DemuxPid p0, android.hardware.tv.tuner.IFilter p1) throws android.os.RemoteException {}
            public void close() throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
