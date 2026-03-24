package android.service.search;

public interface ISearchUiService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.search.ISearchUiService";
    public void onCreateSearchSession(android.app.search.SearchContext p0, android.app.search.SearchSessionId p1) throws android.os.RemoteException;
    public void onQuery(android.app.search.SearchSessionId p0, android.app.search.Query p1, android.app.search.ISearchCallback p2) throws android.os.RemoteException;
    public void onNotifyEvent(android.app.search.SearchSessionId p0, android.app.search.Query p1, android.app.search.SearchTargetEvent p2) throws android.os.RemoteException;
    public void onRegisterEmptyQueryResultUpdateCallback(android.app.search.SearchSessionId p0, android.app.search.ISearchCallback p1) throws android.os.RemoteException;
    public void onUnregisterEmptyQueryResultUpdateCallback(android.app.search.SearchSessionId p0, android.app.search.ISearchCallback p1) throws android.os.RemoteException;
    public void onDestroy(android.app.search.SearchSessionId p0) throws android.os.RemoteException;

    public static class Default implements android.service.search.ISearchUiService {
        public Default() {}
        public void onCreateSearchSession(android.app.search.SearchContext p0, android.app.search.SearchSessionId p1) throws android.os.RemoteException {}
        public void onQuery(android.app.search.SearchSessionId p0, android.app.search.Query p1, android.app.search.ISearchCallback p2) throws android.os.RemoteException {}
        public void onNotifyEvent(android.app.search.SearchSessionId p0, android.app.search.Query p1, android.app.search.SearchTargetEvent p2) throws android.os.RemoteException {}
        public void onRegisterEmptyQueryResultUpdateCallback(android.app.search.SearchSessionId p0, android.app.search.ISearchCallback p1) throws android.os.RemoteException {}
        public void onUnregisterEmptyQueryResultUpdateCallback(android.app.search.SearchSessionId p0, android.app.search.ISearchCallback p1) throws android.os.RemoteException {}
        public void onDestroy(android.app.search.SearchSessionId p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.search.ISearchUiService {
        static final int TRANSACTION_onCreateSearchSession = 1;
        static final int TRANSACTION_onQuery = 2;
        static final int TRANSACTION_onNotifyEvent = 3;
        static final int TRANSACTION_onRegisterEmptyQueryResultUpdateCallback = 4;
        static final int TRANSACTION_onUnregisterEmptyQueryResultUpdateCallback = 5;
        static final int TRANSACTION_onDestroy = 6;
        public Stub() { super(); }
        public static android.service.search.ISearchUiService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.search.ISearchUiService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCreateSearchSession(android.app.search.SearchContext p0, android.app.search.SearchSessionId p1) throws android.os.RemoteException {}
            public void onQuery(android.app.search.SearchSessionId p0, android.app.search.Query p1, android.app.search.ISearchCallback p2) throws android.os.RemoteException {}
            public void onNotifyEvent(android.app.search.SearchSessionId p0, android.app.search.Query p1, android.app.search.SearchTargetEvent p2) throws android.os.RemoteException {}
            public void onRegisterEmptyQueryResultUpdateCallback(android.app.search.SearchSessionId p0, android.app.search.ISearchCallback p1) throws android.os.RemoteException {}
            public void onUnregisterEmptyQueryResultUpdateCallback(android.app.search.SearchSessionId p0, android.app.search.ISearchCallback p1) throws android.os.RemoteException {}
            public void onDestroy(android.app.search.SearchSessionId p0) throws android.os.RemoteException {}
        }
    }
}
