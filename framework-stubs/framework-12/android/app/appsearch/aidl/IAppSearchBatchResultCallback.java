package android.app.appsearch.aidl;

public interface IAppSearchBatchResultCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.appsearch.aidl.IAppSearchBatchResultCallback";
    public void onResult(android.app.appsearch.aidl.AppSearchBatchResultParcel p0) throws android.os.RemoteException;
    public void onSystemError(android.app.appsearch.aidl.AppSearchResultParcel p0) throws android.os.RemoteException;

    public static class Default implements android.app.appsearch.aidl.IAppSearchBatchResultCallback {
        public Default() {}
        public void onResult(android.app.appsearch.aidl.AppSearchBatchResultParcel p0) throws android.os.RemoteException {}
        public void onSystemError(android.app.appsearch.aidl.AppSearchResultParcel p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.appsearch.aidl.IAppSearchBatchResultCallback {
        static final int TRANSACTION_onResult = 1;
        static final int TRANSACTION_onSystemError = 2;
        public Stub() { super(); }
        public static android.app.appsearch.aidl.IAppSearchBatchResultCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.appsearch.aidl.IAppSearchBatchResultCallback p0) { return false; }
        public static android.app.appsearch.aidl.IAppSearchBatchResultCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.app.appsearch.aidl.IAppSearchBatchResultCallback {
            private android.os.IBinder mRemote;
            public static android.app.appsearch.aidl.IAppSearchBatchResultCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onResult(android.app.appsearch.aidl.AppSearchBatchResultParcel p0) throws android.os.RemoteException {}
            public void onSystemError(android.app.appsearch.aidl.AppSearchResultParcel p0) throws android.os.RemoteException {}
        }
    }
}
