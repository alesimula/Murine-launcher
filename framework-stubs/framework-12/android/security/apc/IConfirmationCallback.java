package android.security.apc;

public interface IConfirmationCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public void onCompleted(int p0, byte[] p1) throws android.os.RemoteException;

    public static class Default implements android.security.apc.IConfirmationCallback {
        public Default() {}
        public void onCompleted(int p0, byte[] p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.apc.IConfirmationCallback {
        static final int TRANSACTION_onCompleted = 1;
        public Stub() { super(); }
        public static android.security.apc.IConfirmationCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.security.apc.IConfirmationCallback p0) { return false; }
        public static android.security.apc.IConfirmationCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.security.apc.IConfirmationCallback {
            private android.os.IBinder mRemote;
            public static android.security.apc.IConfirmationCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCompleted(int p0, byte[] p1) throws android.os.RemoteException {}
        }
    }
}
