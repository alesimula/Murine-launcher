package android.accounts;

public interface IAccountAuthenticator extends android.os.IInterface {
    @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
    public void addAccount(android.accounts.IAccountAuthenticatorResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, android.os.Bundle p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
    public void confirmCredentials(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, android.os.Bundle p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
    public void getAuthToken(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
    public void getAuthTokenLabel(android.accounts.IAccountAuthenticatorResponse p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
    public void updateCredentials(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
    public void editProperties(android.accounts.IAccountAuthenticatorResponse p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
    public void hasFeatures(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String[] p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
    public void getAccountRemovalAllowed(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
    public void getAccountCredentialsForCloning(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
    public void addAccountFromCredentials(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, android.os.Bundle p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
    public void startAddAccountSession(android.accounts.IAccountAuthenticatorResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, android.os.Bundle p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
    public void startUpdateCredentialsSession(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
    public void finishSession(android.accounts.IAccountAuthenticatorResponse p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
    public void isCredentialsUpdateSuggested(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2) throws android.os.RemoteException;

    public static class Default implements android.accounts.IAccountAuthenticator {
        public Default() {}
        public void addAccount(android.accounts.IAccountAuthenticatorResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, android.os.Bundle p4) throws android.os.RemoteException {}
        public void confirmCredentials(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void getAuthToken(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public void getAuthTokenLabel(android.accounts.IAccountAuthenticatorResponse p0, java.lang.String p1) throws android.os.RemoteException {}
        public void updateCredentials(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public void editProperties(android.accounts.IAccountAuthenticatorResponse p0, java.lang.String p1) throws android.os.RemoteException {}
        public void hasFeatures(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String[] p2) throws android.os.RemoteException {}
        public void getAccountRemovalAllowed(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1) throws android.os.RemoteException {}
        public void getAccountCredentialsForCloning(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1) throws android.os.RemoteException {}
        public void addAccountFromCredentials(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void startAddAccountSession(android.accounts.IAccountAuthenticatorResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, android.os.Bundle p4) throws android.os.RemoteException {}
        public void startUpdateCredentialsSession(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public void finishSession(android.accounts.IAccountAuthenticatorResponse p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void isCredentialsUpdateSuggested(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.accounts.IAccountAuthenticator {
        public static final java.lang.String DESCRIPTOR = "android.accounts.IAccountAuthenticator";
        static final int TRANSACTION_addAccount = 1;
        static final int TRANSACTION_confirmCredentials = 2;
        static final int TRANSACTION_getAuthToken = 3;
        static final int TRANSACTION_getAuthTokenLabel = 4;
        static final int TRANSACTION_updateCredentials = 5;
        static final int TRANSACTION_editProperties = 6;
        static final int TRANSACTION_hasFeatures = 7;
        static final int TRANSACTION_getAccountRemovalAllowed = 8;
        static final int TRANSACTION_getAccountCredentialsForCloning = 9;
        static final int TRANSACTION_addAccountFromCredentials = 10;
        static final int TRANSACTION_startAddAccountSession = 11;
        static final int TRANSACTION_startUpdateCredentialsSession = 12;
        static final int TRANSACTION_finishSession = 13;
        static final int TRANSACTION_isCredentialsUpdateSuggested = 14;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.accounts.IAccountAuthenticator asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void addAccount_enforcePermission() throws java.lang.SecurityException {}
        protected void confirmCredentials_enforcePermission() throws java.lang.SecurityException {}
        protected void getAuthToken_enforcePermission() throws java.lang.SecurityException {}
        protected void getAuthTokenLabel_enforcePermission() throws java.lang.SecurityException {}
        protected void updateCredentials_enforcePermission() throws java.lang.SecurityException {}
        protected void editProperties_enforcePermission() throws java.lang.SecurityException {}
        protected void hasFeatures_enforcePermission() throws java.lang.SecurityException {}
        protected void getAccountRemovalAllowed_enforcePermission() throws java.lang.SecurityException {}
        protected void getAccountCredentialsForCloning_enforcePermission() throws java.lang.SecurityException {}
        protected void addAccountFromCredentials_enforcePermission() throws java.lang.SecurityException {}
        protected void startAddAccountSession_enforcePermission() throws java.lang.SecurityException {}
        protected void startUpdateCredentialsSession_enforcePermission() throws java.lang.SecurityException {}
        protected void finishSession_enforcePermission() throws java.lang.SecurityException {}
        protected void isCredentialsUpdateSuggested_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.accounts.IAccountAuthenticator {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addAccount(android.accounts.IAccountAuthenticatorResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, android.os.Bundle p4) throws android.os.RemoteException {}
            public void confirmCredentials(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void getAuthToken(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException {}
            public void getAuthTokenLabel(android.accounts.IAccountAuthenticatorResponse p0, java.lang.String p1) throws android.os.RemoteException {}
            public void updateCredentials(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException {}
            public void editProperties(android.accounts.IAccountAuthenticatorResponse p0, java.lang.String p1) throws android.os.RemoteException {}
            public void hasFeatures(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String[] p2) throws android.os.RemoteException {}
            public void getAccountRemovalAllowed(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1) throws android.os.RemoteException {}
            public void getAccountCredentialsForCloning(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1) throws android.os.RemoteException {}
            public void addAccountFromCredentials(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void startAddAccountSession(android.accounts.IAccountAuthenticatorResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, android.os.Bundle p4) throws android.os.RemoteException {}
            public void startUpdateCredentialsSession(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException {}
            public void finishSession(android.accounts.IAccountAuthenticatorResponse p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void isCredentialsUpdateSuggested(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2) throws android.os.RemoteException {}
        }
    }
}
