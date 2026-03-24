package android.hardware.gnss;

public interface IGnssBatching extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "fc957f1d3d261d065ff5e5415f2d21caa79c310f";
    public static final java.lang.String DESCRIPTOR = null;
    public static final int WAKEUP_ON_FIFO_FULL = 1;
    public void init(android.hardware.gnss.IGnssBatchingCallback p0) throws android.os.RemoteException;
    public int getBatchSize() throws android.os.RemoteException;
    public void start(android.hardware.gnss.IGnssBatching.Options p0) throws android.os.RemoteException;
    public void flush() throws android.os.RemoteException;
    public void stop() throws android.os.RemoteException;
    public void cleanup() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.gnss.IGnssBatching {
        public Default() {}
        public void init(android.hardware.gnss.IGnssBatchingCallback p0) throws android.os.RemoteException {}
        public int getBatchSize() throws android.os.RemoteException { return 0; }
        public void start(android.hardware.gnss.IGnssBatching.Options p0) throws android.os.RemoteException {}
        public void flush() throws android.os.RemoteException {}
        public void stop() throws android.os.RemoteException {}
        public void cleanup() throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static class Options implements android.os.Parcelable {
        public long periodNanos;
        public float minDistanceMeters;
        public int flags;
        public static final android.os.Parcelable.Creator<android.hardware.gnss.IGnssBatching.Options> CREATOR = null;
        public Options() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.IGnssBatching {
        static final int TRANSACTION_init = 1;
        static final int TRANSACTION_getBatchSize = 2;
        static final int TRANSACTION_start = 3;
        static final int TRANSACTION_flush = 4;
        static final int TRANSACTION_stop = 5;
        static final int TRANSACTION_cleanup = 6;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.gnss.IGnssBatching asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.gnss.IGnssBatching {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void init(android.hardware.gnss.IGnssBatchingCallback p0) throws android.os.RemoteException {}
            public int getBatchSize() throws android.os.RemoteException { return 0; }
            public void start(android.hardware.gnss.IGnssBatching.Options p0) throws android.os.RemoteException {}
            public void flush() throws android.os.RemoteException {}
            public void stop() throws android.os.RemoteException {}
            public void cleanup() throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
