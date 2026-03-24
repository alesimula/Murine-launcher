package android.service.controls;

public interface IControlsActionCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.controls.IControlsActionCallback";
    public void accept(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.service.controls.IControlsActionCallback {
        public Default() {}
        public void accept(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.controls.IControlsActionCallback {
        static final int TRANSACTION_accept = 1;
        public Stub() { super(); }
        public static android.service.controls.IControlsActionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.controls.IControlsActionCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void accept(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        }
    }
}
