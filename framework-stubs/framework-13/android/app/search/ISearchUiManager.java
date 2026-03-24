package android.app.search;

public interface ISearchUiManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.search.ISearchUiManager";
    public void createSearchSession(android.app.search.SearchContext p0, android.app.search.SearchSessionId p1, android.os.IBinder p2) throws android.os.RemoteException;
    public void query(android.app.search.SearchSessionId p0, android.app.search.Query p1, android.app.search.ISearchCallback p2) throws android.os.RemoteException;
    public void notifyEvent(android.app.search.SearchSessionId p0, android.app.search.Query p1, android.app.search.SearchTargetEvent p2) throws android.os.RemoteException;
    public void destroySearchSession(android.app.search.SearchSessionId p0) throws android.os.RemoteException;

    public static class Default implements android.app.search.ISearchUiManager {
        public Default() {}
        public void createSearchSession(android.app.search.SearchContext p0, android.app.search.SearchSessionId p1, android.os.IBinder p2) throws android.os.RemoteException {}
        public void query(android.app.search.SearchSessionId p0, android.app.search.Query p1, android.app.search.ISearchCallback p2) throws android.os.RemoteException {}
        public void notifyEvent(android.app.search.SearchSessionId p0, android.app.search.Query p1, android.app.search.SearchTargetEvent p2) throws android.os.RemoteException {}
        public void destroySearchSession(android.app.search.SearchSessionId p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.search.ISearchUiManager {
        static final int TRANSACTION_createSearchSession = 1;
        static final int TRANSACTION_query = 2;
        static final int TRANSACTION_notifyEvent = 3;
        static final int TRANSACTION_destroySearchSession = 4;
        public Stub() { super(); }
        public static android.app.search.ISearchUiManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.search.ISearchUiManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void createSearchSession(android.app.search.SearchContext p0, android.app.search.SearchSessionId p1, android.os.IBinder p2) throws android.os.RemoteException {}
            public void query(android.app.search.SearchSessionId p0, android.app.search.Query p1, android.app.search.ISearchCallback p2) throws android.os.RemoteException {}
            public void notifyEvent(android.app.search.SearchSessionId p0, android.app.search.Query p1, android.app.search.SearchTargetEvent p2) throws android.os.RemoteException {}
            public void destroySearchSession(android.app.search.SearchSessionId p0) throws android.os.RemoteException {}
        }
    }
}
