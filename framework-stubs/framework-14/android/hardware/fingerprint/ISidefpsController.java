package android.hardware.fingerprint;

public interface ISidefpsController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.fingerprint.ISidefpsController";
    public void show(int p0, int p1) throws android.os.RemoteException;
    public void hide(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.fingerprint.ISidefpsController {
        public Default() {}
        public void show(int p0, int p1) throws android.os.RemoteException {}
        public void hide(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.fingerprint.ISidefpsController {
        static final int TRANSACTION_show = 1;
        static final int TRANSACTION_hide = 2;
        public Stub() { super(); }
        public static android.hardware.fingerprint.ISidefpsController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.fingerprint.ISidefpsController {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void show(int p0, int p1) throws android.os.RemoteException {}
            public void hide(int p0) throws android.os.RemoteException {}
        }
    }
}
