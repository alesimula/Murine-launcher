package android.hardware.biometrics;

public interface ITestSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.ITestSession";
    public void setTestHalEnabled(boolean p0) throws android.os.RemoteException;
    public void startEnroll(int p0) throws android.os.RemoteException;
    public void finishEnroll(int p0) throws android.os.RemoteException;
    public void acceptAuthentication(int p0) throws android.os.RemoteException;
    public void rejectAuthentication(int p0) throws android.os.RemoteException;
    public void notifyAcquired(int p0, int p1) throws android.os.RemoteException;
    public void notifyError(int p0, int p1) throws android.os.RemoteException;
    public void cleanupInternalState(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.ITestSession {
        public Default() {}
        public void setTestHalEnabled(boolean p0) throws android.os.RemoteException {}
        public void startEnroll(int p0) throws android.os.RemoteException {}
        public void finishEnroll(int p0) throws android.os.RemoteException {}
        public void acceptAuthentication(int p0) throws android.os.RemoteException {}
        public void rejectAuthentication(int p0) throws android.os.RemoteException {}
        public void notifyAcquired(int p0, int p1) throws android.os.RemoteException {}
        public void notifyError(int p0, int p1) throws android.os.RemoteException {}
        public void cleanupInternalState(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.ITestSession {
        static final int TRANSACTION_setTestHalEnabled = 1;
        static final int TRANSACTION_startEnroll = 2;
        static final int TRANSACTION_finishEnroll = 3;
        static final int TRANSACTION_acceptAuthentication = 4;
        static final int TRANSACTION_rejectAuthentication = 5;
        static final int TRANSACTION_notifyAcquired = 6;
        static final int TRANSACTION_notifyError = 7;
        static final int TRANSACTION_cleanupInternalState = 8;
        public Stub() { super(); }
        public static android.hardware.biometrics.ITestSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.biometrics.ITestSession p0) { return false; }
        public static android.hardware.biometrics.ITestSession getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.biometrics.ITestSession {
            private android.os.IBinder mRemote;
            public static android.hardware.biometrics.ITestSession sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setTestHalEnabled(boolean p0) throws android.os.RemoteException {}
            public void startEnroll(int p0) throws android.os.RemoteException {}
            public void finishEnroll(int p0) throws android.os.RemoteException {}
            public void acceptAuthentication(int p0) throws android.os.RemoteException {}
            public void rejectAuthentication(int p0) throws android.os.RemoteException {}
            public void notifyAcquired(int p0, int p1) throws android.os.RemoteException {}
            public void notifyError(int p0, int p1) throws android.os.RemoteException {}
            public void cleanupInternalState(int p0) throws android.os.RemoteException {}
        }
    }
}
