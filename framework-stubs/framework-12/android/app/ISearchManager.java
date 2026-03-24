package android.app;

public interface ISearchManager extends android.os.IInterface {
    public android.app.SearchableInfo getSearchableInfo(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.util.List<android.app.SearchableInfo> getSearchablesInGlobalSearch() throws android.os.RemoteException;
    public java.util.List<android.content.pm.ResolveInfo> getGlobalSearchActivities() throws android.os.RemoteException;
    public android.content.ComponentName getGlobalSearchActivity() throws android.os.RemoteException;
    public android.content.ComponentName getWebSearchActivity() throws android.os.RemoteException;
    public void launchAssist(int p0, android.os.Bundle p1) throws android.os.RemoteException;

    public static class Default implements android.app.ISearchManager {
        public Default() {}
        public android.app.SearchableInfo getSearchableInfo(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.app.SearchableInfo> getSearchablesInGlobalSearch() throws android.os.RemoteException { return null; }
        public java.util.List<android.content.pm.ResolveInfo> getGlobalSearchActivities() throws android.os.RemoteException { return null; }
        public android.content.ComponentName getGlobalSearchActivity() throws android.os.RemoteException { return null; }
        public android.content.ComponentName getWebSearchActivity() throws android.os.RemoteException { return null; }
        public void launchAssist(int p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.ISearchManager {
        public static final java.lang.String DESCRIPTOR = "android.app.ISearchManager";
        static final int TRANSACTION_getSearchableInfo = 1;
        static final int TRANSACTION_getSearchablesInGlobalSearch = 2;
        static final int TRANSACTION_getGlobalSearchActivities = 3;
        static final int TRANSACTION_getGlobalSearchActivity = 4;
        static final int TRANSACTION_getWebSearchActivity = 5;
        static final int TRANSACTION_launchAssist = 6;
        public Stub() { super(); }
        public static android.app.ISearchManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.ISearchManager p0) { return false; }
        public static android.app.ISearchManager getDefaultImpl() { return null; }

        private static class Proxy implements android.app.ISearchManager {
            private android.os.IBinder mRemote;
            public static android.app.ISearchManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.app.SearchableInfo getSearchableInfo(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.app.SearchableInfo> getSearchablesInGlobalSearch() throws android.os.RemoteException { return null; }
            public java.util.List<android.content.pm.ResolveInfo> getGlobalSearchActivities() throws android.os.RemoteException { return null; }
            public android.content.ComponentName getGlobalSearchActivity() throws android.os.RemoteException { return null; }
            public android.content.ComponentName getWebSearchActivity() throws android.os.RemoteException { return null; }
            public void launchAssist(int p0, android.os.Bundle p1) throws android.os.RemoteException {}
        }
    }
}
