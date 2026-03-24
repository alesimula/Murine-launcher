package android.app;

public interface IActivityController extends android.os.IInterface {
    public boolean activityStarting(android.content.Intent p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean activityResuming(java.lang.String p0) throws android.os.RemoteException;
    public boolean appCrashed(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, long p4, java.lang.String p5) throws android.os.RemoteException;
    public int appEarlyNotResponding(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public int appNotResponding(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public int systemNotResponding(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.app.IActivityController {
        public Default() {}
        public boolean activityStarting(android.content.Intent p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean activityResuming(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean appCrashed(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, long p4, java.lang.String p5) throws android.os.RemoteException { return false; }
        public int appEarlyNotResponding(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public int appNotResponding(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public int systemNotResponding(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IActivityController {
        public static final java.lang.String DESCRIPTOR = "android.app.IActivityController";
        static final int TRANSACTION_activityStarting = 1;
        static final int TRANSACTION_activityResuming = 2;
        static final int TRANSACTION_appCrashed = 3;
        static final int TRANSACTION_appEarlyNotResponding = 4;
        static final int TRANSACTION_appNotResponding = 5;
        static final int TRANSACTION_systemNotResponding = 6;
        public Stub() { super(); }
        public static android.app.IActivityController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IActivityController p0) { return false; }
        public static android.app.IActivityController getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IActivityController {
            private android.os.IBinder mRemote;
            public static android.app.IActivityController sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean activityStarting(android.content.Intent p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean activityResuming(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean appCrashed(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, long p4, java.lang.String p5) throws android.os.RemoteException { return false; }
            public int appEarlyNotResponding(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public int appNotResponding(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public int systemNotResponding(java.lang.String p0) throws android.os.RemoteException { return 0; }
        }
    }
}
