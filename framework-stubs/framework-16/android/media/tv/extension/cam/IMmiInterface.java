package android.media.tv.extension.cam;

public interface IMmiInterface extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.cam.IMmiInterface";
    public android.media.tv.extension.cam.IMmiSession openSession(int p0, android.media.tv.extension.cam.IMmiStatusCallback p1) throws android.os.RemoteException;
    public void appInfoEnterMenu(int p0, android.media.tv.extension.cam.IEnterMenuErrorCallback p1) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.cam.IMmiInterface {
        public Default() {}
        public android.media.tv.extension.cam.IMmiSession openSession(int p0, android.media.tv.extension.cam.IMmiStatusCallback p1) throws android.os.RemoteException { return null; }
        public void appInfoEnterMenu(int p0, android.media.tv.extension.cam.IEnterMenuErrorCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.cam.IMmiInterface {
        static final int TRANSACTION_openSession = 1;
        static final int TRANSACTION_appInfoEnterMenu = 2;
        public Stub() { super(); }
        public static android.media.tv.extension.cam.IMmiInterface asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.cam.IMmiInterface {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.media.tv.extension.cam.IMmiSession openSession(int p0, android.media.tv.extension.cam.IMmiStatusCallback p1) throws android.os.RemoteException { return null; }
            public void appInfoEnterMenu(int p0, android.media.tv.extension.cam.IEnterMenuErrorCallback p1) throws android.os.RemoteException {}
        }
    }
}
