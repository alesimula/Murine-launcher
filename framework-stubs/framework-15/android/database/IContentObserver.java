package android.database;

public interface IContentObserver extends android.os.IInterface {
    public void onChange(boolean p0, android.net.Uri p1, int p2) throws android.os.RemoteException;
    public void onChangeEtc(boolean p0, android.net.Uri[] p1, int p2, int p3) throws android.os.RemoteException;

    public static class Default implements android.database.IContentObserver {
        public Default() {}
        public void onChange(boolean p0, android.net.Uri p1, int p2) throws android.os.RemoteException {}
        public void onChangeEtc(boolean p0, android.net.Uri[] p1, int p2, int p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.database.IContentObserver {
        public static final java.lang.String DESCRIPTOR = "android.database.IContentObserver";
        static final int TRANSACTION_onChange = 1;
        static final int TRANSACTION_onChangeEtc = 2;
        public Stub() { super(); }
        public static android.database.IContentObserver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.database.IContentObserver {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onChange(boolean p0, android.net.Uri p1, int p2) throws android.os.RemoteException {}
            public void onChangeEtc(boolean p0, android.net.Uri[] p1, int p2, int p3) throws android.os.RemoteException {}
        }
    }
}
