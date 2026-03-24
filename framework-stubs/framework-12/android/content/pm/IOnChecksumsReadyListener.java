package android.content.pm;

public interface IOnChecksumsReadyListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.content.pm.IOnChecksumsReadyListener";
    public void onChecksumsReady(java.util.List<android.content.pm.ApkChecksum> p0) throws android.os.RemoteException;

    public static class Default implements android.content.pm.IOnChecksumsReadyListener {
        public Default() {}
        public void onChecksumsReady(java.util.List<android.content.pm.ApkChecksum> p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IOnChecksumsReadyListener {
        static final int TRANSACTION_onChecksumsReady = 1;
        public Stub() { super(); }
        public static android.content.pm.IOnChecksumsReadyListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.IOnChecksumsReadyListener p0) { return false; }
        public static android.content.pm.IOnChecksumsReadyListener getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.IOnChecksumsReadyListener {
            private android.os.IBinder mRemote;
            public static android.content.pm.IOnChecksumsReadyListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onChecksumsReady(java.util.List<android.content.pm.ApkChecksum> p0) throws android.os.RemoteException {}
        }
    }
}
