package android.content.pm;

public interface IPackageDataObserver extends android.os.IInterface {
    public void onRemoveCompleted(java.lang.String p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.content.pm.IPackageDataObserver {
        public Default() {}
        public void onRemoveCompleted(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageDataObserver {
        public static final java.lang.String DESCRIPTOR = "android.content.pm.IPackageDataObserver";
        static final int TRANSACTION_onRemoveCompleted = 1;
        public Stub() { super(); }
        public static android.content.pm.IPackageDataObserver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.content.pm.IPackageDataObserver {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onRemoveCompleted(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}
