package android.media.tv.extension.time;

public interface IBroadcastTime extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.time.IBroadcastTime";
    public long getUtcTime() throws android.os.RemoteException;
    public long getLocalTime() throws android.os.RemoteException;
    public android.os.Bundle getTimeZoneInfo() throws android.os.RemoteException;
    public long getUtcTimePerStream(java.lang.String p0) throws android.os.RemoteException;
    public long getLocalTimePerStream(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.time.IBroadcastTime {
        public Default() {}
        public long getUtcTime() throws android.os.RemoteException { return 0L; }
        public long getLocalTime() throws android.os.RemoteException { return 0L; }
        public android.os.Bundle getTimeZoneInfo() throws android.os.RemoteException { return null; }
        public long getUtcTimePerStream(java.lang.String p0) throws android.os.RemoteException { return 0L; }
        public long getLocalTimePerStream(java.lang.String p0) throws android.os.RemoteException { return 0L; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.time.IBroadcastTime {
        static final int TRANSACTION_getUtcTime = 1;
        static final int TRANSACTION_getLocalTime = 2;
        static final int TRANSACTION_getTimeZoneInfo = 3;
        static final int TRANSACTION_getUtcTimePerStream = 4;
        static final int TRANSACTION_getLocalTimePerStream = 5;
        public Stub() { super(); }
        public static android.media.tv.extension.time.IBroadcastTime asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.time.IBroadcastTime {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public long getUtcTime() throws android.os.RemoteException { return 0L; }
            public long getLocalTime() throws android.os.RemoteException { return 0L; }
            public android.os.Bundle getTimeZoneInfo() throws android.os.RemoteException { return null; }
            public long getUtcTimePerStream(java.lang.String p0) throws android.os.RemoteException { return 0L; }
            public long getLocalTimePerStream(java.lang.String p0) throws android.os.RemoteException { return 0L; }
        }
    }
}
