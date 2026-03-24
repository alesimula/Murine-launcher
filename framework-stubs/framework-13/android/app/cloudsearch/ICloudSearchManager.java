package android.app.cloudsearch;

public interface ICloudSearchManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.cloudsearch.ICloudSearchManager";
    public void search(android.app.cloudsearch.SearchRequest p0, android.app.cloudsearch.ICloudSearchManagerCallback p1) throws android.os.RemoteException;
    public void returnResults(android.os.IBinder p0, java.lang.String p1, android.app.cloudsearch.SearchResponse p2) throws android.os.RemoteException;

    public static class Default implements android.app.cloudsearch.ICloudSearchManager {
        public Default() {}
        public void search(android.app.cloudsearch.SearchRequest p0, android.app.cloudsearch.ICloudSearchManagerCallback p1) throws android.os.RemoteException {}
        public void returnResults(android.os.IBinder p0, java.lang.String p1, android.app.cloudsearch.SearchResponse p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.cloudsearch.ICloudSearchManager {
        static final int TRANSACTION_search = 1;
        static final int TRANSACTION_returnResults = 2;
        public Stub() { super(); }
        public static android.app.cloudsearch.ICloudSearchManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.cloudsearch.ICloudSearchManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void search(android.app.cloudsearch.SearchRequest p0, android.app.cloudsearch.ICloudSearchManagerCallback p1) throws android.os.RemoteException {}
            public void returnResults(android.os.IBinder p0, java.lang.String p1, android.app.cloudsearch.SearchResponse p2) throws android.os.RemoteException {}
        }
    }
}
