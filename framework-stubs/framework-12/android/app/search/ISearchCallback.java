package android.app.search;

public interface ISearchCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.search.ISearchCallback";
    public void onResult(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException;

    public static class Default implements android.app.search.ISearchCallback {
        public Default() {}
        public void onResult(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.search.ISearchCallback {
        static final int TRANSACTION_onResult = 1;
        public Stub() { super(); }
        public static android.app.search.ISearchCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.search.ISearchCallback p0) { return false; }
        public static android.app.search.ISearchCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.app.search.ISearchCallback {
            private android.os.IBinder mRemote;
            public static android.app.search.ISearchCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onResult(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException {}
        }
    }
}
