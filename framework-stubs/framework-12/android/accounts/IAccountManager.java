package android.accounts;

public interface IAccountManager extends android.os.IInterface {
    public java.lang.String getPassword(android.accounts.Account p0) throws android.os.RemoteException;
    public java.lang.String getUserData(android.accounts.Account p0, java.lang.String p1) throws android.os.RemoteException;
    public android.accounts.AuthenticatorDescription[] getAuthenticatorTypes(int p0) throws android.os.RemoteException;
    public android.accounts.Account[] getAccountsForPackage(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public android.accounts.Account[] getAccountsByTypeForPackage(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public android.accounts.Account[] getAccountsAsUser(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void hasFeatures(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, java.lang.String[] p2, java.lang.String p3) throws android.os.RemoteException;
    public void getAccountByTypeAndFeatures(android.accounts.IAccountManagerResponse p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3) throws android.os.RemoteException;
    public void getAccountsByFeatures(android.accounts.IAccountManagerResponse p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3) throws android.os.RemoteException;
    public boolean addAccountExplicitly(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2, java.lang.String p3) throws android.os.RemoteException;
    public void removeAccountAsUser(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, boolean p2, int p3) throws android.os.RemoteException;
    public boolean removeAccountExplicitly(android.accounts.Account p0) throws android.os.RemoteException;
    public void copyAccountToUser(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, int p2, int p3) throws android.os.RemoteException;
    public void invalidateAuthToken(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String peekAuthToken(android.accounts.Account p0, java.lang.String p1) throws android.os.RemoteException;
    public void setAuthToken(android.accounts.Account p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setPassword(android.accounts.Account p0, java.lang.String p1) throws android.os.RemoteException;
    public void clearPassword(android.accounts.Account p0) throws android.os.RemoteException;
    public void setUserData(android.accounts.Account p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void updateAppPermission(android.accounts.Account p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException;
    public void getAuthToken(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, java.lang.String p2, boolean p3, boolean p4, android.os.Bundle p5) throws android.os.RemoteException;
    public void addAccount(android.accounts.IAccountManagerResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, boolean p4, android.os.Bundle p5) throws android.os.RemoteException;
    public void addAccountAsUser(android.accounts.IAccountManagerResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, boolean p4, android.os.Bundle p5, int p6) throws android.os.RemoteException;
    public void updateCredentials(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, java.lang.String p2, boolean p3, android.os.Bundle p4) throws android.os.RemoteException;
    public void editProperties(android.accounts.IAccountManagerResponse p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void confirmCredentialsAsUser(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, android.os.Bundle p2, boolean p3, int p4) throws android.os.RemoteException;
    public boolean accountAuthenticated(android.accounts.Account p0) throws android.os.RemoteException;
    public void getAuthTokenLabel(android.accounts.IAccountManagerResponse p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void addSharedAccountsFromParentUser(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void renameAccount(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getPreviousName(android.accounts.Account p0) throws android.os.RemoteException;
    public void startAddAccountSession(android.accounts.IAccountManagerResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, boolean p4, android.os.Bundle p5) throws android.os.RemoteException;
    public void startUpdateCredentialsSession(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, java.lang.String p2, boolean p3, android.os.Bundle p4) throws android.os.RemoteException;
    public void finishSessionAsUser(android.accounts.IAccountManagerResponse p0, android.os.Bundle p1, boolean p2, android.os.Bundle p3, int p4) throws android.os.RemoteException;
    public boolean someUserHasAccount(android.accounts.Account p0) throws android.os.RemoteException;
    public void isCredentialsUpdateSuggested(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.Map getPackagesAndVisibilityForAccount(android.accounts.Account p0) throws android.os.RemoteException;
    public boolean addAccountExplicitlyWithVisibility(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2, java.util.Map p3, java.lang.String p4) throws android.os.RemoteException;
    public boolean setAccountVisibility(android.accounts.Account p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public int getAccountVisibility(android.accounts.Account p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.Map getAccountsAndVisibilityForPackage(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void registerAccountListener(java.lang.String[] p0, java.lang.String p1) throws android.os.RemoteException;
    public void unregisterAccountListener(java.lang.String[] p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean hasAccountAccess(android.accounts.Account p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public android.content.IntentSender createRequestAccountAccessIntentSenderAsUser(android.accounts.Account p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public void onAccountAccessed(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.accounts.IAccountManager {
        public Default() {}
        public java.lang.String getPassword(android.accounts.Account p0) throws android.os.RemoteException { return null; }
        public java.lang.String getUserData(android.accounts.Account p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.accounts.AuthenticatorDescription[] getAuthenticatorTypes(int p0) throws android.os.RemoteException { return null; }
        public android.accounts.Account[] getAccountsForPackage(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.accounts.Account[] getAccountsByTypeForPackage(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.accounts.Account[] getAccountsAsUser(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public void hasFeatures(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, java.lang.String[] p2, java.lang.String p3) throws android.os.RemoteException {}
        public void getAccountByTypeAndFeatures(android.accounts.IAccountManagerResponse p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3) throws android.os.RemoteException {}
        public void getAccountsByFeatures(android.accounts.IAccountManagerResponse p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3) throws android.os.RemoteException {}
        public boolean addAccountExplicitly(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2, java.lang.String p3) throws android.os.RemoteException { return false; }
        public void removeAccountAsUser(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, boolean p2, int p3) throws android.os.RemoteException {}
        public boolean removeAccountExplicitly(android.accounts.Account p0) throws android.os.RemoteException { return false; }
        public void copyAccountToUser(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, int p2, int p3) throws android.os.RemoteException {}
        public void invalidateAuthToken(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public java.lang.String peekAuthToken(android.accounts.Account p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void setAuthToken(android.accounts.Account p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setPassword(android.accounts.Account p0, java.lang.String p1) throws android.os.RemoteException {}
        public void clearPassword(android.accounts.Account p0) throws android.os.RemoteException {}
        public void setUserData(android.accounts.Account p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void updateAppPermission(android.accounts.Account p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException {}
        public void getAuthToken(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, java.lang.String p2, boolean p3, boolean p4, android.os.Bundle p5) throws android.os.RemoteException {}
        public void addAccount(android.accounts.IAccountManagerResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, boolean p4, android.os.Bundle p5) throws android.os.RemoteException {}
        public void addAccountAsUser(android.accounts.IAccountManagerResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, boolean p4, android.os.Bundle p5, int p6) throws android.os.RemoteException {}
        public void updateCredentials(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, java.lang.String p2, boolean p3, android.os.Bundle p4) throws android.os.RemoteException {}
        public void editProperties(android.accounts.IAccountManagerResponse p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public void confirmCredentialsAsUser(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, android.os.Bundle p2, boolean p3, int p4) throws android.os.RemoteException {}
        public boolean accountAuthenticated(android.accounts.Account p0) throws android.os.RemoteException { return false; }
        public void getAuthTokenLabel(android.accounts.IAccountManagerResponse p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void addSharedAccountsFromParentUser(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void renameAccount(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, java.lang.String p2) throws android.os.RemoteException {}
        public java.lang.String getPreviousName(android.accounts.Account p0) throws android.os.RemoteException { return null; }
        public void startAddAccountSession(android.accounts.IAccountManagerResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, boolean p4, android.os.Bundle p5) throws android.os.RemoteException {}
        public void startUpdateCredentialsSession(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, java.lang.String p2, boolean p3, android.os.Bundle p4) throws android.os.RemoteException {}
        public void finishSessionAsUser(android.accounts.IAccountManagerResponse p0, android.os.Bundle p1, boolean p2, android.os.Bundle p3, int p4) throws android.os.RemoteException {}
        public boolean someUserHasAccount(android.accounts.Account p0) throws android.os.RemoteException { return false; }
        public void isCredentialsUpdateSuggested(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, java.lang.String p2) throws android.os.RemoteException {}
        public java.util.Map getPackagesAndVisibilityForAccount(android.accounts.Account p0) throws android.os.RemoteException { return null; }
        public boolean addAccountExplicitlyWithVisibility(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2, java.util.Map p3, java.lang.String p4) throws android.os.RemoteException { return false; }
        public boolean setAccountVisibility(android.accounts.Account p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public int getAccountVisibility(android.accounts.Account p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public java.util.Map getAccountsAndVisibilityForPackage(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void registerAccountListener(java.lang.String[] p0, java.lang.String p1) throws android.os.RemoteException {}
        public void unregisterAccountListener(java.lang.String[] p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean hasAccountAccess(android.accounts.Account p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException { return false; }
        public android.content.IntentSender createRequestAccountAccessIntentSenderAsUser(android.accounts.Account p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException { return null; }
        public void onAccountAccessed(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.accounts.IAccountManager {
        public static final java.lang.String DESCRIPTOR = "android.accounts.IAccountManager";
        static final int TRANSACTION_getPassword = 1;
        static final int TRANSACTION_getUserData = 2;
        static final int TRANSACTION_getAuthenticatorTypes = 3;
        static final int TRANSACTION_getAccountsForPackage = 4;
        static final int TRANSACTION_getAccountsByTypeForPackage = 5;
        static final int TRANSACTION_getAccountsAsUser = 6;
        static final int TRANSACTION_hasFeatures = 7;
        static final int TRANSACTION_getAccountByTypeAndFeatures = 8;
        static final int TRANSACTION_getAccountsByFeatures = 9;
        static final int TRANSACTION_addAccountExplicitly = 10;
        static final int TRANSACTION_removeAccountAsUser = 11;
        static final int TRANSACTION_removeAccountExplicitly = 12;
        static final int TRANSACTION_copyAccountToUser = 13;
        static final int TRANSACTION_invalidateAuthToken = 14;
        static final int TRANSACTION_peekAuthToken = 15;
        static final int TRANSACTION_setAuthToken = 16;
        static final int TRANSACTION_setPassword = 17;
        static final int TRANSACTION_clearPassword = 18;
        static final int TRANSACTION_setUserData = 19;
        static final int TRANSACTION_updateAppPermission = 20;
        static final int TRANSACTION_getAuthToken = 21;
        static final int TRANSACTION_addAccount = 22;
        static final int TRANSACTION_addAccountAsUser = 23;
        static final int TRANSACTION_updateCredentials = 24;
        static final int TRANSACTION_editProperties = 25;
        static final int TRANSACTION_confirmCredentialsAsUser = 26;
        static final int TRANSACTION_accountAuthenticated = 27;
        static final int TRANSACTION_getAuthTokenLabel = 28;
        static final int TRANSACTION_addSharedAccountsFromParentUser = 29;
        static final int TRANSACTION_renameAccount = 30;
        static final int TRANSACTION_getPreviousName = 31;
        static final int TRANSACTION_startAddAccountSession = 32;
        static final int TRANSACTION_startUpdateCredentialsSession = 33;
        static final int TRANSACTION_finishSessionAsUser = 34;
        static final int TRANSACTION_someUserHasAccount = 35;
        static final int TRANSACTION_isCredentialsUpdateSuggested = 36;
        static final int TRANSACTION_getPackagesAndVisibilityForAccount = 37;
        static final int TRANSACTION_addAccountExplicitlyWithVisibility = 38;
        static final int TRANSACTION_setAccountVisibility = 39;
        static final int TRANSACTION_getAccountVisibility = 40;
        static final int TRANSACTION_getAccountsAndVisibilityForPackage = 41;
        static final int TRANSACTION_registerAccountListener = 42;
        static final int TRANSACTION_unregisterAccountListener = 43;
        static final int TRANSACTION_hasAccountAccess = 44;
        static final int TRANSACTION_createRequestAccountAccessIntentSenderAsUser = 45;
        static final int TRANSACTION_onAccountAccessed = 46;
        public Stub() { super(); }
        public static android.accounts.IAccountManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.accounts.IAccountManager p0) { return false; }
        public static android.accounts.IAccountManager getDefaultImpl() { return null; }

        private static class Proxy implements android.accounts.IAccountManager {
            private android.os.IBinder mRemote;
            public static android.accounts.IAccountManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getPassword(android.accounts.Account p0) throws android.os.RemoteException { return null; }
            public java.lang.String getUserData(android.accounts.Account p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.accounts.AuthenticatorDescription[] getAuthenticatorTypes(int p0) throws android.os.RemoteException { return null; }
            public android.accounts.Account[] getAccountsForPackage(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.accounts.Account[] getAccountsByTypeForPackage(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.accounts.Account[] getAccountsAsUser(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public void hasFeatures(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, java.lang.String[] p2, java.lang.String p3) throws android.os.RemoteException {}
            public void getAccountByTypeAndFeatures(android.accounts.IAccountManagerResponse p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3) throws android.os.RemoteException {}
            public void getAccountsByFeatures(android.accounts.IAccountManagerResponse p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3) throws android.os.RemoteException {}
            public boolean addAccountExplicitly(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2, java.lang.String p3) throws android.os.RemoteException { return false; }
            public void removeAccountAsUser(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, boolean p2, int p3) throws android.os.RemoteException {}
            public boolean removeAccountExplicitly(android.accounts.Account p0) throws android.os.RemoteException { return false; }
            public void copyAccountToUser(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, int p2, int p3) throws android.os.RemoteException {}
            public void invalidateAuthToken(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public java.lang.String peekAuthToken(android.accounts.Account p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void setAuthToken(android.accounts.Account p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setPassword(android.accounts.Account p0, java.lang.String p1) throws android.os.RemoteException {}
            public void clearPassword(android.accounts.Account p0) throws android.os.RemoteException {}
            public void setUserData(android.accounts.Account p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void updateAppPermission(android.accounts.Account p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException {}
            public void getAuthToken(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, java.lang.String p2, boolean p3, boolean p4, android.os.Bundle p5) throws android.os.RemoteException {}
            public void addAccount(android.accounts.IAccountManagerResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, boolean p4, android.os.Bundle p5) throws android.os.RemoteException {}
            public void addAccountAsUser(android.accounts.IAccountManagerResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, boolean p4, android.os.Bundle p5, int p6) throws android.os.RemoteException {}
            public void updateCredentials(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, java.lang.String p2, boolean p3, android.os.Bundle p4) throws android.os.RemoteException {}
            public void editProperties(android.accounts.IAccountManagerResponse p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public void confirmCredentialsAsUser(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, android.os.Bundle p2, boolean p3, int p4) throws android.os.RemoteException {}
            public boolean accountAuthenticated(android.accounts.Account p0) throws android.os.RemoteException { return false; }
            public void getAuthTokenLabel(android.accounts.IAccountManagerResponse p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void addSharedAccountsFromParentUser(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void renameAccount(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, java.lang.String p2) throws android.os.RemoteException {}
            public java.lang.String getPreviousName(android.accounts.Account p0) throws android.os.RemoteException { return null; }
            public void startAddAccountSession(android.accounts.IAccountManagerResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, boolean p4, android.os.Bundle p5) throws android.os.RemoteException {}
            public void startUpdateCredentialsSession(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, java.lang.String p2, boolean p3, android.os.Bundle p4) throws android.os.RemoteException {}
            public void finishSessionAsUser(android.accounts.IAccountManagerResponse p0, android.os.Bundle p1, boolean p2, android.os.Bundle p3, int p4) throws android.os.RemoteException {}
            public boolean someUserHasAccount(android.accounts.Account p0) throws android.os.RemoteException { return false; }
            public void isCredentialsUpdateSuggested(android.accounts.IAccountManagerResponse p0, android.accounts.Account p1, java.lang.String p2) throws android.os.RemoteException {}
            public java.util.Map getPackagesAndVisibilityForAccount(android.accounts.Account p0) throws android.os.RemoteException { return null; }
            public boolean addAccountExplicitlyWithVisibility(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2, java.util.Map p3, java.lang.String p4) throws android.os.RemoteException { return false; }
            public boolean setAccountVisibility(android.accounts.Account p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public int getAccountVisibility(android.accounts.Account p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public java.util.Map getAccountsAndVisibilityForPackage(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void registerAccountListener(java.lang.String[] p0, java.lang.String p1) throws android.os.RemoteException {}
            public void unregisterAccountListener(java.lang.String[] p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean hasAccountAccess(android.accounts.Account p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException { return false; }
            public android.content.IntentSender createRequestAccountAccessIntentSenderAsUser(android.accounts.Account p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException { return null; }
            public void onAccountAccessed(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}
