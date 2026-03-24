package android.os;

public interface IDumpstateListener extends android.os.IInterface {
    public static final int BUGREPORT_ERROR_INVALID_INPUT = 1;
    public static final int BUGREPORT_ERROR_RUNTIME_ERROR = 2;
    public static final int BUGREPORT_ERROR_USER_DENIED_CONSENT = 3;
    public static final int BUGREPORT_ERROR_USER_CONSENT_TIMED_OUT = 4;
    public static final int BUGREPORT_ERROR_ANOTHER_REPORT_IN_PROGRESS = 5;
    public void onProgress(int p0) throws android.os.RemoteException;
    public void onError(int p0) throws android.os.RemoteException;
    public void onFinished() throws android.os.RemoteException;
    public void onProgressUpdated(int p0) throws android.os.RemoteException;
    public void onMaxProgressUpdated(int p0) throws android.os.RemoteException;
    public void onSectionComplete(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.os.IDumpstateListener {
        private static final java.lang.String DESCRIPTOR = "android.os.IDumpstateListener";
        static final int TRANSACTION_onProgress = 1;
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onFinished = 3;
        static final int TRANSACTION_onProgressUpdated = 4;
        static final int TRANSACTION_onMaxProgressUpdated = 5;
        static final int TRANSACTION_onSectionComplete = 6;
        public Stub() { super(); }
        public static android.os.IDumpstateListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IDumpstateListener p0) { return false; }
        public static android.os.IDumpstateListener getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IDumpstateListener {
            private android.os.IBinder mRemote;
            public static android.os.IDumpstateListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onProgress(int p0) throws android.os.RemoteException {}
            public void onError(int p0) throws android.os.RemoteException {}
            public void onFinished() throws android.os.RemoteException {}
            public void onProgressUpdated(int p0) throws android.os.RemoteException {}
            public void onMaxProgressUpdated(int p0) throws android.os.RemoteException {}
            public void onSectionComplete(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.os.IDumpstateListener {
        public Default() {}
        public void onProgress(int p0) throws android.os.RemoteException {}
        public void onError(int p0) throws android.os.RemoteException {}
        public void onFinished() throws android.os.RemoteException {}
        public void onProgressUpdated(int p0) throws android.os.RemoteException {}
        public void onMaxProgressUpdated(int p0) throws android.os.RemoteException {}
        public void onSectionComplete(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
