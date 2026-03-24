package android.hardware.tv.tuner;

public interface IFilterCallback extends android.os.IInterface {
    public static final int VERSION = 1;
    public static final java.lang.String HASH = "d42f1677ada3f62036894111686245c3c8310fe4";
    public static final java.lang.String DESCRIPTOR = null;
    public void onFilterEvent(android.hardware.tv.tuner.DemuxFilterEvent[] p0) throws android.os.RemoteException;
    public void onFilterStatus(byte p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.tv.tuner.IFilterCallback {
        public Default() {}
        public void onFilterEvent(android.hardware.tv.tuner.DemuxFilterEvent[] p0) throws android.os.RemoteException {}
        public void onFilterStatus(byte p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.tv.tuner.IFilterCallback {
        static final int TRANSACTION_onFilterEvent = 1;
        static final int TRANSACTION_onFilterStatus = 2;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.tv.tuner.IFilterCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.tv.tuner.IFilterCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onFilterEvent(android.hardware.tv.tuner.DemuxFilterEvent[] p0) throws android.os.RemoteException {}
            public void onFilterStatus(byte p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
