package android.hardware.biometrics;

public interface ITestSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.ITestSession";
    @android.annotation.EnforcePermission("android.permission.TEST_BIOMETRIC")
    public void setTestHalEnabled(boolean p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.TEST_BIOMETRIC")
    public void startEnroll(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.TEST_BIOMETRIC")
    public void finishEnroll(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.TEST_BIOMETRIC")
    public void acceptAuthentication(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.TEST_BIOMETRIC")
    public void rejectAuthentication(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.TEST_BIOMETRIC")
    public void notifyAcquired(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.TEST_BIOMETRIC")
    public void notifyError(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.TEST_BIOMETRIC")
    public void cleanupInternalState(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.TEST_BIOMETRIC")
    public int getSensorId() throws android.os.RemoteException;

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
        public int getSensorId() throws android.os.RemoteException { return 0; }
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
        static final int TRANSACTION_getSensorId = 9;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.hardware.biometrics.ITestSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setTestHalEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void startEnroll_enforcePermission() throws java.lang.SecurityException {}
        protected void finishEnroll_enforcePermission() throws java.lang.SecurityException {}
        protected void acceptAuthentication_enforcePermission() throws java.lang.SecurityException {}
        protected void rejectAuthentication_enforcePermission() throws java.lang.SecurityException {}
        protected void notifyAcquired_enforcePermission() throws java.lang.SecurityException {}
        protected void notifyError_enforcePermission() throws java.lang.SecurityException {}
        protected void cleanupInternalState_enforcePermission() throws java.lang.SecurityException {}
        protected void getSensorId_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.biometrics.ITestSession {
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
            public int getSensorId() throws android.os.RemoteException { return 0; }
        }
    }
}
