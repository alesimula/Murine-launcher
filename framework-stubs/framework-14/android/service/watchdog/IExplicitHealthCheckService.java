package android.service.watchdog;

public interface IExplicitHealthCheckService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.watchdog.IExplicitHealthCheckService";
    public void setCallback(android.os.RemoteCallback p0) throws android.os.RemoteException;
    public void request(java.lang.String p0) throws android.os.RemoteException;
    public void cancel(java.lang.String p0) throws android.os.RemoteException;
    public void getSupportedPackages(android.os.RemoteCallback p0) throws android.os.RemoteException;
    public void getRequestedPackages(android.os.RemoteCallback p0) throws android.os.RemoteException;

    public static class Default implements android.service.watchdog.IExplicitHealthCheckService {
        public Default() {}
        public void setCallback(android.os.RemoteCallback p0) throws android.os.RemoteException {}
        public void request(java.lang.String p0) throws android.os.RemoteException {}
        public void cancel(java.lang.String p0) throws android.os.RemoteException {}
        public void getSupportedPackages(android.os.RemoteCallback p0) throws android.os.RemoteException {}
        public void getRequestedPackages(android.os.RemoteCallback p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.watchdog.IExplicitHealthCheckService {
        static final int TRANSACTION_setCallback = 1;
        static final int TRANSACTION_request = 2;
        static final int TRANSACTION_cancel = 3;
        static final int TRANSACTION_getSupportedPackages = 4;
        static final int TRANSACTION_getRequestedPackages = 5;
        public Stub() { super(); }
        public static android.service.watchdog.IExplicitHealthCheckService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.watchdog.IExplicitHealthCheckService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setCallback(android.os.RemoteCallback p0) throws android.os.RemoteException {}
            public void request(java.lang.String p0) throws android.os.RemoteException {}
            public void cancel(java.lang.String p0) throws android.os.RemoteException {}
            public void getSupportedPackages(android.os.RemoteCallback p0) throws android.os.RemoteException {}
            public void getRequestedPackages(android.os.RemoteCallback p0) throws android.os.RemoteException {}
        }
    }
}
