package android.app.admin;

public interface IDeviceAdminService extends android.os.IInterface {

    public static class Default implements android.app.admin.IDeviceAdminService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.admin.IDeviceAdminService {
        public static final java.lang.String DESCRIPTOR = "android.app.admin.IDeviceAdminService";
        public Stub() { super(); }
        public static android.app.admin.IDeviceAdminService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.admin.IDeviceAdminService p0) { return false; }
        public static android.app.admin.IDeviceAdminService getDefaultImpl() { return null; }

        private static class Proxy implements android.app.admin.IDeviceAdminService {
            private android.os.IBinder mRemote;
            public static android.app.admin.IDeviceAdminService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}
