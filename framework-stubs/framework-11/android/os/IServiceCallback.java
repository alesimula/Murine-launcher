package android.os;

public interface IServiceCallback extends android.os.IInterface {
    public void onRegistration(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException;

    public static class Default implements android.os.IServiceCallback {
        public Default() {}
        public void onRegistration(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IServiceCallback {
        private static final java.lang.String DESCRIPTOR = "android.os.IServiceCallback";
        static final int TRANSACTION_onRegistration = 1;
        public Stub() { super(); }
        public static android.os.IServiceCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IServiceCallback p0) { return false; }
        public static android.os.IServiceCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IServiceCallback {
            private android.os.IBinder mRemote;
            public static android.os.IServiceCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onRegistration(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
        }
    }
}
