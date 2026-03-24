package android.accounts;

public abstract class AbstractAccountAuthenticator {
    public static final java.lang.String KEY_CUSTOM_TOKEN_EXPIRY = "android.accounts.expiry";
    public AbstractAccountAuthenticator(android.content.Context p0) {}
    public final android.os.IBinder getIBinder() { return null; }
    public abstract android.os.Bundle editProperties(android.accounts.AccountAuthenticatorResponse p0, java.lang.String p1);
    public abstract android.os.Bundle addAccount(android.accounts.AccountAuthenticatorResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, android.os.Bundle p4) throws android.accounts.NetworkErrorException;
    public abstract android.os.Bundle confirmCredentials(android.accounts.AccountAuthenticatorResponse p0, android.accounts.Account p1, android.os.Bundle p2) throws android.accounts.NetworkErrorException;
    public abstract android.os.Bundle getAuthToken(android.accounts.AccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2, android.os.Bundle p3) throws android.accounts.NetworkErrorException;
    public abstract java.lang.String getAuthTokenLabel(java.lang.String p0);
    public abstract android.os.Bundle updateCredentials(android.accounts.AccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2, android.os.Bundle p3) throws android.accounts.NetworkErrorException;
    public abstract android.os.Bundle hasFeatures(android.accounts.AccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String[] p2) throws android.accounts.NetworkErrorException;
    public android.os.Bundle getAccountRemovalAllowed(android.accounts.AccountAuthenticatorResponse p0, android.accounts.Account p1) throws android.accounts.NetworkErrorException { return null; }
    public android.os.Bundle getAccountCredentialsForCloning(android.accounts.AccountAuthenticatorResponse p0, android.accounts.Account p1) throws android.accounts.NetworkErrorException { return null; }
    public android.os.Bundle addAccountFromCredentials(android.accounts.AccountAuthenticatorResponse p0, android.accounts.Account p1, android.os.Bundle p2) throws android.accounts.NetworkErrorException { return null; }
    public android.os.Bundle startAddAccountSession(android.accounts.AccountAuthenticatorResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, android.os.Bundle p4) throws android.accounts.NetworkErrorException { return null; }
    public android.os.Bundle startUpdateCredentialsSession(android.accounts.AccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2, android.os.Bundle p3) throws android.accounts.NetworkErrorException { return null; }
    public android.os.Bundle finishSession(android.accounts.AccountAuthenticatorResponse p0, java.lang.String p1, android.os.Bundle p2) throws android.accounts.NetworkErrorException { return null; }
    public android.os.Bundle isCredentialsUpdateSuggested(android.accounts.AccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2) throws android.accounts.NetworkErrorException { return null; }

    private class Transport extends android.accounts.IAccountAuthenticator.Stub {
        @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
        public void addAccount(android.accounts.IAccountAuthenticatorResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, android.os.Bundle p4) throws android.os.RemoteException {}
        @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
        public void confirmCredentials(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, android.os.Bundle p2) throws android.os.RemoteException {}
        @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
        public void getAuthTokenLabel(android.accounts.IAccountAuthenticatorResponse p0, java.lang.String p1) throws android.os.RemoteException {}
        @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
        public void getAuthToken(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException {}
        @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
        public void updateCredentials(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException {}
        @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
        public void editProperties(android.accounts.IAccountAuthenticatorResponse p0, java.lang.String p1) throws android.os.RemoteException {}
        @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
        public void hasFeatures(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String[] p2) throws android.os.RemoteException {}
        @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
        public void getAccountRemovalAllowed(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1) throws android.os.RemoteException {}
        @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
        public void getAccountCredentialsForCloning(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1) throws android.os.RemoteException {}
        @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
        public void addAccountFromCredentials(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, android.os.Bundle p2) throws android.os.RemoteException {}
        @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
        public void startAddAccountSession(android.accounts.IAccountAuthenticatorResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, android.os.Bundle p4) throws android.os.RemoteException {}
        @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
        public void startUpdateCredentialsSession(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException {}
        @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
        public void finishSession(android.accounts.IAccountAuthenticatorResponse p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
        @android.annotation.EnforcePermission("android.permission.ACCOUNT_MANAGER")
        public void isCredentialsUpdateSuggested(android.accounts.IAccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2) throws android.os.RemoteException {}
    }
}
