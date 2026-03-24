package android.app.appsearch.aidl;

public interface IAppSearchManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.appsearch.aidl.IAppSearchManager";
    public void setSchema(java.lang.String p0, java.lang.String p1, java.util.List<android.os.Bundle> p2, java.util.List<java.lang.String> p3, java.util.Map<java.lang.String, java.util.List<android.os.Bundle>> p4, boolean p5, int p6, android.os.UserHandle p7, long p8, android.app.appsearch.aidl.IAppSearchResultCallback p9) throws android.os.RemoteException;
    public void getSchema(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, android.app.appsearch.aidl.IAppSearchResultCallback p3) throws android.os.RemoteException;
    public void getNamespaces(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, android.app.appsearch.aidl.IAppSearchResultCallback p3) throws android.os.RemoteException;
    public void putDocuments(java.lang.String p0, java.lang.String p1, java.util.List<android.os.Bundle> p2, android.os.UserHandle p3, long p4, android.app.appsearch.aidl.IAppSearchBatchResultCallback p5) throws android.os.RemoteException;
    public void getDocuments(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, java.util.Map<java.lang.String, java.util.List<java.lang.String>> p4, android.os.UserHandle p5, long p6, android.app.appsearch.aidl.IAppSearchBatchResultCallback p7) throws android.os.RemoteException;
    public void query(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3, android.os.UserHandle p4, long p5, android.app.appsearch.aidl.IAppSearchResultCallback p6) throws android.os.RemoteException;
    public void globalQuery(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, android.os.UserHandle p3, long p4, android.app.appsearch.aidl.IAppSearchResultCallback p5) throws android.os.RemoteException;
    public void getNextPage(java.lang.String p0, long p1, android.os.UserHandle p2, android.app.appsearch.aidl.IAppSearchResultCallback p3) throws android.os.RemoteException;
    public void invalidateNextPageToken(java.lang.String p0, long p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public void writeQueryResultsToFile(java.lang.String p0, java.lang.String p1, android.os.ParcelFileDescriptor p2, java.lang.String p3, android.os.Bundle p4, android.os.UserHandle p5, android.app.appsearch.aidl.IAppSearchResultCallback p6) throws android.os.RemoteException;
    public void putDocumentsFromFile(java.lang.String p0, java.lang.String p1, android.os.ParcelFileDescriptor p2, android.os.UserHandle p3, android.app.appsearch.aidl.IAppSearchResultCallback p4) throws android.os.RemoteException;
    public void reportUsage(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, long p4, boolean p5, android.os.UserHandle p6, android.app.appsearch.aidl.IAppSearchResultCallback p7) throws android.os.RemoteException;
    public void removeByDocumentId(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, android.os.UserHandle p4, long p5, android.app.appsearch.aidl.IAppSearchBatchResultCallback p6) throws android.os.RemoteException;
    public void removeByQuery(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3, android.os.UserHandle p4, long p5, android.app.appsearch.aidl.IAppSearchResultCallback p6) throws android.os.RemoteException;
    public void getStorageInfo(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, android.app.appsearch.aidl.IAppSearchResultCallback p3) throws android.os.RemoteException;
    public void persistToDisk(java.lang.String p0, android.os.UserHandle p1, long p2) throws android.os.RemoteException;
    public void initialize(java.lang.String p0, android.os.UserHandle p1, long p2, android.app.appsearch.aidl.IAppSearchResultCallback p3) throws android.os.RemoteException;

    public static class Default implements android.app.appsearch.aidl.IAppSearchManager {
        public Default() {}
        public void setSchema(java.lang.String p0, java.lang.String p1, java.util.List<android.os.Bundle> p2, java.util.List<java.lang.String> p3, java.util.Map<java.lang.String, java.util.List<android.os.Bundle>> p4, boolean p5, int p6, android.os.UserHandle p7, long p8, android.app.appsearch.aidl.IAppSearchResultCallback p9) throws android.os.RemoteException {}
        public void getSchema(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, android.app.appsearch.aidl.IAppSearchResultCallback p3) throws android.os.RemoteException {}
        public void getNamespaces(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, android.app.appsearch.aidl.IAppSearchResultCallback p3) throws android.os.RemoteException {}
        public void putDocuments(java.lang.String p0, java.lang.String p1, java.util.List<android.os.Bundle> p2, android.os.UserHandle p3, long p4, android.app.appsearch.aidl.IAppSearchBatchResultCallback p5) throws android.os.RemoteException {}
        public void getDocuments(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, java.util.Map<java.lang.String, java.util.List<java.lang.String>> p4, android.os.UserHandle p5, long p6, android.app.appsearch.aidl.IAppSearchBatchResultCallback p7) throws android.os.RemoteException {}
        public void query(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3, android.os.UserHandle p4, long p5, android.app.appsearch.aidl.IAppSearchResultCallback p6) throws android.os.RemoteException {}
        public void globalQuery(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, android.os.UserHandle p3, long p4, android.app.appsearch.aidl.IAppSearchResultCallback p5) throws android.os.RemoteException {}
        public void getNextPage(java.lang.String p0, long p1, android.os.UserHandle p2, android.app.appsearch.aidl.IAppSearchResultCallback p3) throws android.os.RemoteException {}
        public void invalidateNextPageToken(java.lang.String p0, long p1, android.os.UserHandle p2) throws android.os.RemoteException {}
        public void writeQueryResultsToFile(java.lang.String p0, java.lang.String p1, android.os.ParcelFileDescriptor p2, java.lang.String p3, android.os.Bundle p4, android.os.UserHandle p5, android.app.appsearch.aidl.IAppSearchResultCallback p6) throws android.os.RemoteException {}
        public void putDocumentsFromFile(java.lang.String p0, java.lang.String p1, android.os.ParcelFileDescriptor p2, android.os.UserHandle p3, android.app.appsearch.aidl.IAppSearchResultCallback p4) throws android.os.RemoteException {}
        public void reportUsage(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, long p4, boolean p5, android.os.UserHandle p6, android.app.appsearch.aidl.IAppSearchResultCallback p7) throws android.os.RemoteException {}
        public void removeByDocumentId(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, android.os.UserHandle p4, long p5, android.app.appsearch.aidl.IAppSearchBatchResultCallback p6) throws android.os.RemoteException {}
        public void removeByQuery(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3, android.os.UserHandle p4, long p5, android.app.appsearch.aidl.IAppSearchResultCallback p6) throws android.os.RemoteException {}
        public void getStorageInfo(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, android.app.appsearch.aidl.IAppSearchResultCallback p3) throws android.os.RemoteException {}
        public void persistToDisk(java.lang.String p0, android.os.UserHandle p1, long p2) throws android.os.RemoteException {}
        public void initialize(java.lang.String p0, android.os.UserHandle p1, long p2, android.app.appsearch.aidl.IAppSearchResultCallback p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.appsearch.aidl.IAppSearchManager {
        static final int TRANSACTION_setSchema = 1;
        static final int TRANSACTION_getSchema = 2;
        static final int TRANSACTION_getNamespaces = 3;
        static final int TRANSACTION_putDocuments = 4;
        static final int TRANSACTION_getDocuments = 5;
        static final int TRANSACTION_query = 6;
        static final int TRANSACTION_globalQuery = 7;
        static final int TRANSACTION_getNextPage = 8;
        static final int TRANSACTION_invalidateNextPageToken = 9;
        static final int TRANSACTION_writeQueryResultsToFile = 10;
        static final int TRANSACTION_putDocumentsFromFile = 11;
        static final int TRANSACTION_reportUsage = 12;
        static final int TRANSACTION_removeByDocumentId = 13;
        static final int TRANSACTION_removeByQuery = 14;
        static final int TRANSACTION_getStorageInfo = 15;
        static final int TRANSACTION_persistToDisk = 16;
        static final int TRANSACTION_initialize = 17;
        public Stub() { super(); }
        public static android.app.appsearch.aidl.IAppSearchManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.appsearch.aidl.IAppSearchManager p0) { return false; }
        public static android.app.appsearch.aidl.IAppSearchManager getDefaultImpl() { return null; }

        private static class Proxy implements android.app.appsearch.aidl.IAppSearchManager {
            private android.os.IBinder mRemote;
            public static android.app.appsearch.aidl.IAppSearchManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setSchema(java.lang.String p0, java.lang.String p1, java.util.List<android.os.Bundle> p2, java.util.List<java.lang.String> p3, java.util.Map<java.lang.String, java.util.List<android.os.Bundle>> p4, boolean p5, int p6, android.os.UserHandle p7, long p8, android.app.appsearch.aidl.IAppSearchResultCallback p9) throws android.os.RemoteException {}
            public void getSchema(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, android.app.appsearch.aidl.IAppSearchResultCallback p3) throws android.os.RemoteException {}
            public void getNamespaces(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, android.app.appsearch.aidl.IAppSearchResultCallback p3) throws android.os.RemoteException {}
            public void putDocuments(java.lang.String p0, java.lang.String p1, java.util.List<android.os.Bundle> p2, android.os.UserHandle p3, long p4, android.app.appsearch.aidl.IAppSearchBatchResultCallback p5) throws android.os.RemoteException {}
            public void getDocuments(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, java.util.Map<java.lang.String, java.util.List<java.lang.String>> p4, android.os.UserHandle p5, long p6, android.app.appsearch.aidl.IAppSearchBatchResultCallback p7) throws android.os.RemoteException {}
            public void query(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3, android.os.UserHandle p4, long p5, android.app.appsearch.aidl.IAppSearchResultCallback p6) throws android.os.RemoteException {}
            public void globalQuery(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, android.os.UserHandle p3, long p4, android.app.appsearch.aidl.IAppSearchResultCallback p5) throws android.os.RemoteException {}
            public void getNextPage(java.lang.String p0, long p1, android.os.UserHandle p2, android.app.appsearch.aidl.IAppSearchResultCallback p3) throws android.os.RemoteException {}
            public void invalidateNextPageToken(java.lang.String p0, long p1, android.os.UserHandle p2) throws android.os.RemoteException {}
            public void writeQueryResultsToFile(java.lang.String p0, java.lang.String p1, android.os.ParcelFileDescriptor p2, java.lang.String p3, android.os.Bundle p4, android.os.UserHandle p5, android.app.appsearch.aidl.IAppSearchResultCallback p6) throws android.os.RemoteException {}
            public void putDocumentsFromFile(java.lang.String p0, java.lang.String p1, android.os.ParcelFileDescriptor p2, android.os.UserHandle p3, android.app.appsearch.aidl.IAppSearchResultCallback p4) throws android.os.RemoteException {}
            public void reportUsage(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, long p4, boolean p5, android.os.UserHandle p6, android.app.appsearch.aidl.IAppSearchResultCallback p7) throws android.os.RemoteException {}
            public void removeByDocumentId(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, android.os.UserHandle p4, long p5, android.app.appsearch.aidl.IAppSearchBatchResultCallback p6) throws android.os.RemoteException {}
            public void removeByQuery(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3, android.os.UserHandle p4, long p5, android.app.appsearch.aidl.IAppSearchResultCallback p6) throws android.os.RemoteException {}
            public void getStorageInfo(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, android.app.appsearch.aidl.IAppSearchResultCallback p3) throws android.os.RemoteException {}
            public void persistToDisk(java.lang.String p0, android.os.UserHandle p1, long p2) throws android.os.RemoteException {}
            public void initialize(java.lang.String p0, android.os.UserHandle p1, long p2, android.app.appsearch.aidl.IAppSearchResultCallback p3) throws android.os.RemoteException {}
        }
    }
}
