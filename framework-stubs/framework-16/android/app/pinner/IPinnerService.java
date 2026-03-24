package android.app.pinner;

public interface IPinnerService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.pinner.IPinnerService";
    @android.annotation.EnforcePermission("android.permission.DUMP")
    public java.util.List<android.app.pinner.PinnedFileStat> getPinnerStats() throws android.os.RemoteException;

    public static class Default implements android.app.pinner.IPinnerService {
        public Default() {}
        public java.util.List<android.app.pinner.PinnedFileStat> getPinnerStats() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.pinner.IPinnerService {
        static final int TRANSACTION_getPinnerStats = 1;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.app.pinner.IPinnerService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void getPinnerStats_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.pinner.IPinnerService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.app.pinner.PinnedFileStat> getPinnerStats() throws android.os.RemoteException { return null; }
        }
    }
}
