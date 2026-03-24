package android.flags;

public interface IFeatureFlags extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.flags.IFeatureFlags";
    public java.util.List<android.flags.SyncableFlag> syncFlags(java.util.List<android.flags.SyncableFlag> p0) throws android.os.RemoteException;
    public void registerCallback(android.flags.IFeatureFlagsCallback p0) throws android.os.RemoteException;
    public void unregisterCallback(android.flags.IFeatureFlagsCallback p0) throws android.os.RemoteException;
    public java.util.List<android.flags.SyncableFlag> queryFlags(java.util.List<android.flags.SyncableFlag> p0) throws android.os.RemoteException;
    public void overrideFlag(android.flags.SyncableFlag p0) throws android.os.RemoteException;
    public void resetFlag(android.flags.SyncableFlag p0) throws android.os.RemoteException;

    public static class Default implements android.flags.IFeatureFlags {
        public Default() {}
        public java.util.List<android.flags.SyncableFlag> syncFlags(java.util.List<android.flags.SyncableFlag> p0) throws android.os.RemoteException { return null; }
        public void registerCallback(android.flags.IFeatureFlagsCallback p0) throws android.os.RemoteException {}
        public void unregisterCallback(android.flags.IFeatureFlagsCallback p0) throws android.os.RemoteException {}
        public java.util.List<android.flags.SyncableFlag> queryFlags(java.util.List<android.flags.SyncableFlag> p0) throws android.os.RemoteException { return null; }
        public void overrideFlag(android.flags.SyncableFlag p0) throws android.os.RemoteException {}
        public void resetFlag(android.flags.SyncableFlag p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.flags.IFeatureFlags {
        static final int TRANSACTION_syncFlags = 1;
        static final int TRANSACTION_registerCallback = 2;
        static final int TRANSACTION_unregisterCallback = 3;
        static final int TRANSACTION_queryFlags = 4;
        static final int TRANSACTION_overrideFlag = 5;
        static final int TRANSACTION_resetFlag = 6;
        public Stub() { super(); }
        public static android.flags.IFeatureFlags asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.flags.IFeatureFlags {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.flags.SyncableFlag> syncFlags(java.util.List<android.flags.SyncableFlag> p0) throws android.os.RemoteException { return null; }
            public void registerCallback(android.flags.IFeatureFlagsCallback p0) throws android.os.RemoteException {}
            public void unregisterCallback(android.flags.IFeatureFlagsCallback p0) throws android.os.RemoteException {}
            public java.util.List<android.flags.SyncableFlag> queryFlags(java.util.List<android.flags.SyncableFlag> p0) throws android.os.RemoteException { return null; }
            public void overrideFlag(android.flags.SyncableFlag p0) throws android.os.RemoteException {}
            public void resetFlag(android.flags.SyncableFlag p0) throws android.os.RemoteException {}
        }
    }
}
