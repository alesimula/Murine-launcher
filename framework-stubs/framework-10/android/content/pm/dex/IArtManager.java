package android.content.pm.dex;

public interface IArtManager extends android.os.IInterface {
    public void snapshotRuntimeProfile(int p0, java.lang.String p1, java.lang.String p2, android.content.pm.dex.ISnapshotRuntimeProfileCallback p3, java.lang.String p4) throws android.os.RemoteException;
    public boolean isRuntimeProfilingEnabled(int p0, java.lang.String p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.content.pm.dex.IArtManager {
        private static final java.lang.String DESCRIPTOR = "android.content.pm.dex.IArtManager";
        static final int TRANSACTION_snapshotRuntimeProfile = 1;
        static final int TRANSACTION_isRuntimeProfilingEnabled = 2;
        public Stub() { super(); }
        public static android.content.pm.dex.IArtManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.dex.IArtManager p0) { return false; }
        public static android.content.pm.dex.IArtManager getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.dex.IArtManager {
            private android.os.IBinder mRemote;
            public static android.content.pm.dex.IArtManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void snapshotRuntimeProfile(int p0, java.lang.String p1, java.lang.String p2, android.content.pm.dex.ISnapshotRuntimeProfileCallback p3, java.lang.String p4) throws android.os.RemoteException {}
            public boolean isRuntimeProfilingEnabled(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        }
    }

    public static class Default implements android.content.pm.dex.IArtManager {
        public Default() {}
        public void snapshotRuntimeProfile(int p0, java.lang.String p1, java.lang.String p2, android.content.pm.dex.ISnapshotRuntimeProfileCallback p3, java.lang.String p4) throws android.os.RemoteException {}
        public boolean isRuntimeProfilingEnabled(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }
}
