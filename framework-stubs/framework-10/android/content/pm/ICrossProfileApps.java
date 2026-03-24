package android.content.pm;

public interface ICrossProfileApps extends android.os.IInterface {
    public void startActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, android.content.ComponentName p2, int p3, boolean p4) throws android.os.RemoteException;
    public java.util.List<android.os.UserHandle> getTargetUserProfiles(java.lang.String p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.content.pm.ICrossProfileApps {
        private static final java.lang.String DESCRIPTOR = "android.content.pm.ICrossProfileApps";
        static final int TRANSACTION_startActivityAsUser = 1;
        static final int TRANSACTION_getTargetUserProfiles = 2;
        public Stub() { super(); }
        public static android.content.pm.ICrossProfileApps asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.ICrossProfileApps p0) { return false; }
        public static android.content.pm.ICrossProfileApps getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.ICrossProfileApps {
            private android.os.IBinder mRemote;
            public static android.content.pm.ICrossProfileApps sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void startActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, android.content.ComponentName p2, int p3, boolean p4) throws android.os.RemoteException {}
            public java.util.List<android.os.UserHandle> getTargetUserProfiles(java.lang.String p0) throws android.os.RemoteException { return null; }
        }
    }

    public static class Default implements android.content.pm.ICrossProfileApps {
        public Default() {}
        public void startActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, android.content.ComponentName p2, int p3, boolean p4) throws android.os.RemoteException {}
        public java.util.List<android.os.UserHandle> getTargetUserProfiles(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }
}
