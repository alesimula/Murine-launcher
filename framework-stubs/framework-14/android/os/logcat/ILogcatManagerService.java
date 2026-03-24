package android.os.logcat;

public interface ILogcatManagerService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.logcat.ILogcatManagerService";
    public void startThread(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void finishThread(int p0, int p1, int p2, int p3) throws android.os.RemoteException;

    public static class Default implements android.os.logcat.ILogcatManagerService {
        public Default() {}
        public void startThread(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void finishThread(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.logcat.ILogcatManagerService {
        static final int TRANSACTION_startThread = 1;
        static final int TRANSACTION_finishThread = 2;
        public Stub() { super(); }
        public static android.os.logcat.ILogcatManagerService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.logcat.ILogcatManagerService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void startThread(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void finishThread(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        }
    }
}
