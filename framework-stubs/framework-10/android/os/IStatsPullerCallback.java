package android.os;

public interface IStatsPullerCallback extends android.os.IInterface {
    public android.os.StatsLogEventWrapper[] pullData(int p0, long p1, long p2) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.os.IStatsPullerCallback {
        private static final java.lang.String DESCRIPTOR = "android.os.IStatsPullerCallback";
        static final int TRANSACTION_pullData = 1;
        public Stub() { super(); }
        public static android.os.IStatsPullerCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IStatsPullerCallback p0) { return false; }
        public static android.os.IStatsPullerCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IStatsPullerCallback {
            private android.os.IBinder mRemote;
            public static android.os.IStatsPullerCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.StatsLogEventWrapper[] pullData(int p0, long p1, long p2) throws android.os.RemoteException { return null; }
        }
    }

    public static class Default implements android.os.IStatsPullerCallback {
        public Default() {}
        public android.os.StatsLogEventWrapper[] pullData(int p0, long p1, long p2) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }
}
