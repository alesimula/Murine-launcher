package android.service.contentcapture;

public interface IContentProtectionService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.contentcapture.IContentProtectionService";
    public void onLoginDetected(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException;
    public void onUpdateAllowlistRequest(android.os.IBinder p0) throws android.os.RemoteException;

    public static class Default implements android.service.contentcapture.IContentProtectionService {
        public Default() {}
        public void onLoginDetected(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException {}
        public void onUpdateAllowlistRequest(android.os.IBinder p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.contentcapture.IContentProtectionService {
        static final int TRANSACTION_onLoginDetected = 1;
        static final int TRANSACTION_onUpdateAllowlistRequest = 2;
        public Stub() { super(); }
        public static android.service.contentcapture.IContentProtectionService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.contentcapture.IContentProtectionService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onLoginDetected(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException {}
            public void onUpdateAllowlistRequest(android.os.IBinder p0) throws android.os.RemoteException {}
        }
    }
}
