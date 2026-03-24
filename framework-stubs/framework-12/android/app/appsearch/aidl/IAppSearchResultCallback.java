package android.app.appsearch.aidl;

public interface IAppSearchResultCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.appsearch.aidl.IAppSearchResultCallback";
    public void onResult(android.app.appsearch.aidl.AppSearchResultParcel p0) throws android.os.RemoteException;

    public static class Default implements android.app.appsearch.aidl.IAppSearchResultCallback {
        public Default() {}
        public void onResult(android.app.appsearch.aidl.AppSearchResultParcel p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.appsearch.aidl.IAppSearchResultCallback {
        static final int TRANSACTION_onResult = 1;
        public Stub() { super(); }
        public static android.app.appsearch.aidl.IAppSearchResultCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.appsearch.aidl.IAppSearchResultCallback p0) { return false; }
        public static android.app.appsearch.aidl.IAppSearchResultCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.app.appsearch.aidl.IAppSearchResultCallback {
            private android.os.IBinder mRemote;
            public static android.app.appsearch.aidl.IAppSearchResultCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onResult(android.app.appsearch.aidl.AppSearchResultParcel p0) throws android.os.RemoteException {}
        }
    }
}
