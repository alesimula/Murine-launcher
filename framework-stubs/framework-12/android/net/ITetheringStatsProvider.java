package android.net;

public interface ITetheringStatsProvider extends android.os.IInterface {
    public static final int QUOTA_UNLIMITED = -1;
    public android.net.NetworkStats getTetherStats(int p0) throws android.os.RemoteException;
    public void setInterfaceQuota(java.lang.String p0, long p1) throws android.os.RemoteException;

    public static class Default implements android.net.ITetheringStatsProvider {
        public Default() {}
        public android.net.NetworkStats getTetherStats(int p0) throws android.os.RemoteException { return null; }
        public void setInterfaceQuota(java.lang.String p0, long p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.ITetheringStatsProvider {
        public static final java.lang.String DESCRIPTOR = "android.net.ITetheringStatsProvider";
        static final int TRANSACTION_getTetherStats = 1;
        static final int TRANSACTION_setInterfaceQuota = 2;
        public Stub() { super(); }
        public static android.net.ITetheringStatsProvider asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.ITetheringStatsProvider p0) { return false; }
        public static android.net.ITetheringStatsProvider getDefaultImpl() { return null; }

        private static class Proxy implements android.net.ITetheringStatsProvider {
            private android.os.IBinder mRemote;
            public static android.net.ITetheringStatsProvider sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.net.NetworkStats getTetherStats(int p0) throws android.os.RemoteException { return null; }
            public void setInterfaceQuota(java.lang.String p0, long p1) throws android.os.RemoteException {}
        }
    }
}
