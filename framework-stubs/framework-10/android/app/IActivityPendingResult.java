package android.app;

public interface IActivityPendingResult extends android.os.IInterface {
    public boolean sendResult(int p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.app.IActivityPendingResult {
        private static final java.lang.String DESCRIPTOR = "android.app.IActivityPendingResult";
        static final int TRANSACTION_sendResult = 1;
        public Stub() { super(); }
        public static android.app.IActivityPendingResult asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IActivityPendingResult p0) { return false; }
        public static android.app.IActivityPendingResult getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IActivityPendingResult {
            private android.os.IBinder mRemote;
            public static android.app.IActivityPendingResult sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean sendResult(int p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException { return false; }
        }
    }

    public static class Default implements android.app.IActivityPendingResult {
        public Default() {}
        public boolean sendResult(int p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }
}
