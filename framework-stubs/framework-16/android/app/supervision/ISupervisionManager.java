package android.app.supervision;

public interface ISupervisionManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.supervision.ISupervisionManager";
    public android.content.Intent createConfirmSupervisionCredentialsIntent(int p0) throws android.os.RemoteException;
    public boolean isSupervisionEnabledForUser(int p0) throws android.os.RemoteException;
    public void setSupervisionEnabledForUser(int p0, boolean p1) throws android.os.RemoteException;
    public java.lang.String getActiveSupervisionAppPackage(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_ROLE_HOLDERS")
    public boolean shouldAllowBypassingSupervisionRoleQualification() throws android.os.RemoteException;
    public void setSupervisionRecoveryInfo(android.app.supervision.SupervisionRecoveryInfo p0) throws android.os.RemoteException;
    public android.app.supervision.SupervisionRecoveryInfo getSupervisionRecoveryInfo() throws android.os.RemoteException;
    public boolean hasSupervisionCredentials() throws android.os.RemoteException;
    public void registerSupervisionListener(android.app.supervision.ISupervisionListener p0) throws android.os.RemoteException;
    public void unregisterSupervisionListener(android.app.supervision.ISupervisionListener p0) throws android.os.RemoteException;

    public static class Default implements android.app.supervision.ISupervisionManager {
        public Default() {}
        public android.content.Intent createConfirmSupervisionCredentialsIntent(int p0) throws android.os.RemoteException { return null; }
        public boolean isSupervisionEnabledForUser(int p0) throws android.os.RemoteException { return false; }
        public void setSupervisionEnabledForUser(int p0, boolean p1) throws android.os.RemoteException {}
        public java.lang.String getActiveSupervisionAppPackage(int p0) throws android.os.RemoteException { return null; }
        public boolean shouldAllowBypassingSupervisionRoleQualification() throws android.os.RemoteException { return false; }
        public void setSupervisionRecoveryInfo(android.app.supervision.SupervisionRecoveryInfo p0) throws android.os.RemoteException {}
        public android.app.supervision.SupervisionRecoveryInfo getSupervisionRecoveryInfo() throws android.os.RemoteException { return null; }
        public boolean hasSupervisionCredentials() throws android.os.RemoteException { return false; }
        public void registerSupervisionListener(android.app.supervision.ISupervisionListener p0) throws android.os.RemoteException {}
        public void unregisterSupervisionListener(android.app.supervision.ISupervisionListener p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.supervision.ISupervisionManager {
        static final int TRANSACTION_createConfirmSupervisionCredentialsIntent = 1;
        static final int TRANSACTION_isSupervisionEnabledForUser = 2;
        static final int TRANSACTION_setSupervisionEnabledForUser = 3;
        static final int TRANSACTION_getActiveSupervisionAppPackage = 4;
        static final int TRANSACTION_shouldAllowBypassingSupervisionRoleQualification = 5;
        static final int TRANSACTION_setSupervisionRecoveryInfo = 6;
        static final int TRANSACTION_getSupervisionRecoveryInfo = 7;
        static final int TRANSACTION_hasSupervisionCredentials = 8;
        static final int TRANSACTION_registerSupervisionListener = 9;
        static final int TRANSACTION_unregisterSupervisionListener = 10;
        public Stub() { super(); }
        public static android.app.supervision.ISupervisionManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.supervision.ISupervisionManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.content.Intent createConfirmSupervisionCredentialsIntent(int p0) throws android.os.RemoteException { return null; }
            public boolean isSupervisionEnabledForUser(int p0) throws android.os.RemoteException { return false; }
            public void setSupervisionEnabledForUser(int p0, boolean p1) throws android.os.RemoteException {}
            public java.lang.String getActiveSupervisionAppPackage(int p0) throws android.os.RemoteException { return null; }
            public boolean shouldAllowBypassingSupervisionRoleQualification() throws android.os.RemoteException { return false; }
            public void setSupervisionRecoveryInfo(android.app.supervision.SupervisionRecoveryInfo p0) throws android.os.RemoteException {}
            public android.app.supervision.SupervisionRecoveryInfo getSupervisionRecoveryInfo() throws android.os.RemoteException { return null; }
            public boolean hasSupervisionCredentials() throws android.os.RemoteException { return false; }
            public void registerSupervisionListener(android.app.supervision.ISupervisionListener p0) throws android.os.RemoteException {}
            public void unregisterSupervisionListener(android.app.supervision.ISupervisionListener p0) throws android.os.RemoteException {}
        }
    }
}
