package android.os;

public interface ISystemUpdateManager extends android.os.IInterface {
    public android.os.Bundle retrieveSystemUpdateInfo() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.RECOVERY")
    public void updateSystemUpdateInfo(android.os.PersistableBundle p0) throws android.os.RemoteException;

    public static class Default implements android.os.ISystemUpdateManager {
        public Default() {}
        public android.os.Bundle retrieveSystemUpdateInfo() throws android.os.RemoteException { return null; }
        public void updateSystemUpdateInfo(android.os.PersistableBundle p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.ISystemUpdateManager {
        public static final java.lang.String DESCRIPTOR = "android.os.ISystemUpdateManager";
        static final int TRANSACTION_retrieveSystemUpdateInfo = 1;
        static final int TRANSACTION_updateSystemUpdateInfo = 2;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.os.ISystemUpdateManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void updateSystemUpdateInfo_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.ISystemUpdateManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.Bundle retrieveSystemUpdateInfo() throws android.os.RemoteException { return null; }
            public void updateSystemUpdateInfo(android.os.PersistableBundle p0) throws android.os.RemoteException {}
        }
    }
}
