package android.apphibernation;

public interface IAppHibernationService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.apphibernation.IAppHibernationService";
    public boolean isHibernatingForUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setHibernatingForUser(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean isHibernatingGlobally(java.lang.String p0) throws android.os.RemoteException;
    public void setHibernatingGlobally(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getHibernatingPackagesForUser(int p0) throws android.os.RemoteException;
    public java.util.Map<java.lang.String, android.apphibernation.HibernationStats> getHibernationStatsForUser(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_APP_HIBERNATION")
    public boolean isOatArtifactDeletionEnabled() throws android.os.RemoteException;

    public static class Default implements android.apphibernation.IAppHibernationService {
        public Default() {}
        public boolean isHibernatingForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void setHibernatingForUser(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public boolean isHibernatingGlobally(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setHibernatingGlobally(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getHibernatingPackagesForUser(int p0) throws android.os.RemoteException { return null; }
        public java.util.Map<java.lang.String, android.apphibernation.HibernationStats> getHibernationStatsForUser(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException { return null; }
        public boolean isOatArtifactDeletionEnabled() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.apphibernation.IAppHibernationService {
        static final int TRANSACTION_isHibernatingForUser = 1;
        static final int TRANSACTION_setHibernatingForUser = 2;
        static final int TRANSACTION_isHibernatingGlobally = 3;
        static final int TRANSACTION_setHibernatingGlobally = 4;
        static final int TRANSACTION_getHibernatingPackagesForUser = 5;
        static final int TRANSACTION_getHibernationStatsForUser = 6;
        static final int TRANSACTION_isOatArtifactDeletionEnabled = 7;
        public Stub() { super(); }
        public static android.apphibernation.IAppHibernationService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.apphibernation.IAppHibernationService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isHibernatingForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void setHibernatingForUser(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public boolean isHibernatingGlobally(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setHibernatingGlobally(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getHibernatingPackagesForUser(int p0) throws android.os.RemoteException { return null; }
            public java.util.Map<java.lang.String, android.apphibernation.HibernationStats> getHibernationStatsForUser(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException { return null; }
            public boolean isOatArtifactDeletionEnabled() throws android.os.RemoteException { return false; }
        }
    }
}
