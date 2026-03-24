package android.security.apc;

public interface IConfirmationCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.apc.IConfirmationCallback";
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

        private static class Proxy implements android.security.apc.IConfirmationCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCompleted(int p0, byte[] p1) throws android.os.RemoteException {}
        }
    }
}
