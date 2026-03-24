package android.app.timezone;

public interface ICallback extends android.os.IInterface {
    public void onFinished(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.app.timezone.ICallback {
        private static final java.lang.String DESCRIPTOR = "android.app.timezone.ICallback";
        static final int TRANSACTION_onFinished = 1;
        public Stub() { super(); }
        public static android.app.timezone.ICallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.timezone.ICallback p0) { return false; }
        public static android.app.timezone.ICallback getDefaultImpl() { return null; }

        private static class Proxy implements android.app.timezone.ICallback {
            private android.os.IBinder mRemote;
            public static android.app.timezone.ICallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onFinished(int p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.app.timezone.ICallback {
        public Default() {}
        public void onFinished(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
