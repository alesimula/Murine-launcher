package android.accounts;

public class AccountManager {
    public static final int ERROR_CODE_REMOTE_EXCEPTION = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 3;
    public static final int ERROR_CODE_CANCELED = 4;
    public static final int ERROR_CODE_INVALID_RESPONSE = 5;
    public static final int ERROR_CODE_UNSUPPORTED_OPERATION = 6;
    public static final int ERROR_CODE_BAD_ARGUMENTS = 7;
    public static final int ERROR_CODE_BAD_REQUEST = 8;
    public static final int ERROR_CODE_BAD_AUTHENTICATION = 9;
    public static final int ERROR_CODE_USER_RESTRICTED = 100;
    public static final int ERROR_CODE_MANAGEMENT_DISABLED_FOR_ACCOUNT_TYPE = 101;
    public static final java.lang.String KEY_ACCOUNT_NAME = "authAccount";
    public static final java.lang.String KEY_ACCOUNT_TYPE = "accountType";
    public static final java.lang.String KEY_ACCOUNT_ACCESS_ID = "accountAccessId";
    public static final java.lang.String KEY_AUTHTOKEN = "authtoken";
    public static final java.lang.String KEY_INTENT = "intent";
    public static final java.lang.String KEY_PASSWORD = "password";
    public static final java.lang.String KEY_ACCOUNTS = "accounts";
    public static final java.lang.String KEY_ACCOUNT_AUTHENTICATOR_RESPONSE = "accountAuthenticatorResponse";
    public static final java.lang.String KEY_ACCOUNT_MANAGER_RESPONSE = "accountManagerResponse";
    public static final java.lang.String KEY_AUTHENTICATOR_TYPES = "authenticator_types";
    public static final java.lang.String KEY_AUTH_FAILED_MESSAGE = "authFailedMessage";
    public static final java.lang.String KEY_AUTH_TOKEN_LABEL = "authTokenLabelKey";
    public static final java.lang.String KEY_BOOLEAN_RESULT = "booleanResult";
    public static final java.lang.String KEY_ERROR_CODE = "errorCode";
    public static final java.lang.String KEY_ERROR_MESSAGE = "errorMessage";
    public static final java.lang.String KEY_USERDATA = "userdata";
    public static final java.lang.String KEY_LAST_AUTHENTICATED_TIME = "lastAuthenticatedTime";
    public static final java.lang.String KEY_CALLER_UID = "callerUid";
    public static final java.lang.String KEY_CALLER_PID = "callerPid";
    public static final java.lang.String KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
    public static final java.lang.String KEY_NOTIFY_ON_FAILURE = "notifyOnAuthFailure";
    public static final java.lang.String KEY_ACCOUNT_SESSION_BUNDLE = "accountSessionBundle";
    public static final java.lang.String KEY_ACCOUNT_STATUS_TOKEN = "accountStatusToken";
    public static final java.lang.String ACTION_AUTHENTICATOR_INTENT = "android.accounts.AccountAuthenticator";
    public static final java.lang.String AUTHENTICATOR_META_DATA_NAME = "android.accounts.AccountAuthenticator";
    public static final java.lang.String AUTHENTICATOR_ATTRIBUTES_NAME = "account-authenticator";
    public static final int VISIBILITY_UNDEFINED = 0;
    public static final int VISIBILITY_VISIBLE = 1;
    public static final int VISIBILITY_USER_MANAGED_VISIBLE = 2;
    public static final int VISIBILITY_NOT_VISIBLE = 3;
    public static final int VISIBILITY_USER_MANAGED_NOT_VISIBLE = 4;
    public static final java.lang.String ACCOUNT_ACCESS_TOKEN_TYPE = "com.android.AccountManager.ACCOUNT_ACCESS_TOKEN_TYPE";
    public static final java.lang.String CACHE_KEY_ACCOUNTS_DATA_PROPERTY = "cache_key.system_server.accounts_data";
    public static final int CACHE_ACCOUNTS_DATA_SIZE = 4;
    android.app.PropertyInvalidatedCache<android.content.pm.UserPackage, android.accounts.Account[]> mAccountsForUserCache;
    public static final java.lang.String CACHE_KEY_USER_DATA_PROPERTY = "cache_key.system_server.account_user_data";
    public static final int CACHE_USER_DATA_SIZE = 32;
    android.app.PropertyInvalidatedCache<android.accounts.AccountManager.AccountKeyData, java.lang.String> mUserDataCache;
    public static final java.lang.String LOGIN_ACCOUNTS_CHANGED_ACTION = "android.accounts.LOGIN_ACCOUNTS_CHANGED";
    public static final java.lang.String ACTION_ACCOUNT_REMOVED = "android.accounts.action.ACCOUNT_REMOVED";
    public static final java.lang.String ACTION_VISIBLE_ACCOUNTS_CHANGED = "android.accounts.action.VISIBLE_ACCOUNTS_CHANGED";
    public static final java.lang.String PACKAGE_NAME_KEY_LEGACY_VISIBLE = "android:accounts:key_legacy_visible";
    public static final java.lang.String PACKAGE_NAME_KEY_LEGACY_NOT_VISIBLE = "android:accounts:key_legacy_not_visible";
    public AccountManager(android.content.Context p0, android.accounts.IAccountManager p1) {}
    public AccountManager(android.content.Context p0, android.accounts.IAccountManager p1, android.os.Handler p2) {}
    public static android.os.Bundle sanitizeResult(android.os.Bundle p0) { return null; }
    public static android.accounts.AccountManager get(android.content.Context p0) { return null; }
    public java.lang.String getPassword(android.accounts.Account p0) { return null; }
    public java.lang.String getUserData(android.accounts.Account p0, java.lang.String p1) { return null; }
    public android.accounts.AuthenticatorDescription[] getAuthenticatorTypes() { return null; }
    public android.accounts.AuthenticatorDescription[] getAuthenticatorTypesAsUser(int p0) { return null; }
    @android.annotation.NonNull
    public android.accounts.Account[] getAccounts() { return null; }
    @android.annotation.NonNull
    public android.accounts.Account[] getAccountsAsUser(int p0) { return null; }
    @android.annotation.NonNull
    public android.accounts.Account[] getAccountsForPackage(java.lang.String p0, int p1) { return null; }
    @android.annotation.NonNull
    public android.accounts.Account[] getAccountsByTypeForPackage(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.NonNull
    public android.accounts.Account[] getAccountsByType(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public android.accounts.Account[] getAccountsByTypeAsUser(java.lang.String p0, android.os.UserHandle p1) { return null; }
    public void updateAppPermission(android.accounts.Account p0, java.lang.String p1, int p2, boolean p3) {}
    public android.accounts.AccountManagerFuture<java.lang.String> getAuthTokenLabel(java.lang.String p0, java.lang.String p1, android.accounts.AccountManagerCallback<java.lang.String> p2, android.os.Handler p3) { return null; }
    public android.accounts.AccountManagerFuture<java.lang.Boolean> hasFeatures(android.accounts.Account p0, java.lang.String[] p1, android.accounts.AccountManagerCallback<java.lang.Boolean> p2, android.os.Handler p3) { return null; }
    public android.accounts.AccountManagerFuture<android.accounts.Account[]> getAccountsByTypeAndFeatures(java.lang.String p0, java.lang.String[] p1, android.accounts.AccountManagerCallback<android.accounts.Account[]> p2, android.os.Handler p3) { return null; }
    public boolean addAccountExplicitly(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2) { return false; }
    public boolean addAccountExplicitly(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2, java.util.Map<java.lang.String, java.lang.Integer> p3) { return false; }
    public java.util.Map<java.lang.String, java.lang.Integer> getPackagesAndVisibilityForAccount(android.accounts.Account p0) { return null; }
    public java.util.Map<android.accounts.Account, java.lang.Integer> getAccountsAndVisibilityForPackage(java.lang.String p0, java.lang.String p1) { return null; }
    public boolean setAccountVisibility(android.accounts.Account p0, java.lang.String p1, int p2) { return false; }
    public int getAccountVisibility(android.accounts.Account p0, java.lang.String p1) { return 0; }
    public boolean notifyAccountAuthenticated(android.accounts.Account p0) { return false; }
    public android.accounts.AccountManagerFuture<android.accounts.Account> renameAccount(android.accounts.Account p0, java.lang.String p1, android.accounts.AccountManagerCallback<android.accounts.Account> p2, android.os.Handler p3) { return null; }
    public java.lang.String getPreviousName(android.accounts.Account p0) { return null; }
    @java.lang.Deprecated
    public android.accounts.AccountManagerFuture<java.lang.Boolean> removeAccount(android.accounts.Account p0, android.accounts.AccountManagerCallback<java.lang.Boolean> p1, android.os.Handler p2) { return null; }
    @android.annotation.RequiresPermission(value="android.permission.REMOVE_ACCOUNTS", conditional=true)
    @android.annotation.FlaggedApi("android.app.admin.flags.split_create_managed_profile_enabled")
    public android.accounts.AccountManagerFuture<android.os.Bundle> removeAccount(android.accounts.Account p0, android.app.Activity p1, android.accounts.AccountManagerCallback<android.os.Bundle> p2, android.os.Handler p3) { return null; }
    @java.lang.Deprecated
    public android.accounts.AccountManagerFuture<java.lang.Boolean> removeAccountAsUser(android.accounts.Account p0, android.accounts.AccountManagerCallback<java.lang.Boolean> p1, android.os.Handler p2, android.os.UserHandle p3) { return null; }
    public android.accounts.AccountManagerFuture<android.os.Bundle> removeAccountAsUser(android.accounts.Account p0, android.app.Activity p1, android.accounts.AccountManagerCallback<android.os.Bundle> p2, android.os.Handler p3, android.os.UserHandle p4) { return null; }
    public boolean removeAccountExplicitly(android.accounts.Account p0) { return false; }
    public void invalidateAuthToken(java.lang.String p0, java.lang.String p1) {}
    public java.lang.String peekAuthToken(android.accounts.Account p0, java.lang.String p1) { return null; }
    public void setPassword(android.accounts.Account p0, java.lang.String p1) {}
    public void clearPassword(android.accounts.Account p0) {}
    public void setUserData(android.accounts.Account p0, java.lang.String p1, java.lang.String p2) {}
    public void setAuthToken(android.accounts.Account p0, java.lang.String p1, java.lang.String p2) {}
    public java.lang.String blockingGetAuthToken(android.accounts.Account p0, java.lang.String p1, boolean p2) throws android.accounts.OperationCanceledException, java.io.IOException, android.accounts.AuthenticatorException { return null; }
    public android.accounts.AccountManagerFuture<android.os.Bundle> getAuthToken(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2, android.app.Activity p3, android.accounts.AccountManagerCallback<android.os.Bundle> p4, android.os.Handler p5) { return null; }
    @java.lang.Deprecated
    public android.accounts.AccountManagerFuture<android.os.Bundle> getAuthToken(android.accounts.Account p0, java.lang.String p1, boolean p2, android.accounts.AccountManagerCallback<android.os.Bundle> p3, android.os.Handler p4) { return null; }
    public android.accounts.AccountManagerFuture<android.os.Bundle> getAuthToken(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2, boolean p3, android.accounts.AccountManagerCallback<android.os.Bundle> p4, android.os.Handler p5) { return null; }
    public android.accounts.AccountManagerFuture<android.os.Bundle> addAccount(java.lang.String p0, java.lang.String p1, java.lang.String[] p2, android.os.Bundle p3, android.app.Activity p4, android.accounts.AccountManagerCallback<android.os.Bundle> p5, android.os.Handler p6) { return null; }
    public android.accounts.AccountManagerFuture<android.os.Bundle> addAccountAsUser(java.lang.String p0, java.lang.String p1, java.lang.String[] p2, android.os.Bundle p3, android.app.Activity p4, android.accounts.AccountManagerCallback<android.os.Bundle> p5, android.os.Handler p6, android.os.UserHandle p7) { return null; }
    public void addSharedAccountsFromParentUser(android.os.UserHandle p0, android.os.UserHandle p1) {}
    @android.annotation.SystemApi
    @android.annotation.NonNull
    @android.annotation.RequiresPermission(anyOf={"android.permission.COPY_ACCOUNTS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    @android.annotation.FlaggedApi("android.app.admin.flags.split_create_managed_profile_enabled")
    public android.accounts.AccountManagerFuture<java.lang.Boolean> copyAccountToUser(android.accounts.Account p0, android.os.UserHandle p1, android.os.UserHandle p2, android.os.Handler p3, android.accounts.AccountManagerCallback<java.lang.Boolean> p4) { return null; }
    public android.accounts.AccountManagerFuture<android.os.Bundle> confirmCredentials(android.accounts.Account p0, android.os.Bundle p1, android.app.Activity p2, android.accounts.AccountManagerCallback<android.os.Bundle> p3, android.os.Handler p4) { return null; }
    public android.accounts.AccountManagerFuture<android.os.Bundle> confirmCredentialsAsUser(android.accounts.Account p0, android.os.Bundle p1, android.app.Activity p2, android.accounts.AccountManagerCallback<android.os.Bundle> p3, android.os.Handler p4, android.os.UserHandle p5) { return null; }
    public android.accounts.AccountManagerFuture<android.os.Bundle> updateCredentials(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2, android.app.Activity p3, android.accounts.AccountManagerCallback<android.os.Bundle> p4, android.os.Handler p5) { return null; }
    public android.accounts.AccountManagerFuture<android.os.Bundle> editProperties(java.lang.String p0, android.app.Activity p1, android.accounts.AccountManagerCallback<android.os.Bundle> p2, android.os.Handler p3) { return null; }
    public boolean someUserHasAccount(android.accounts.Account p0) { return false; }
    public android.accounts.AccountManagerFuture<android.os.Bundle> getAuthTokenByFeatures(java.lang.String p0, java.lang.String p1, java.lang.String[] p2, android.app.Activity p3, android.os.Bundle p4, android.os.Bundle p5, android.accounts.AccountManagerCallback<android.os.Bundle> p6, android.os.Handler p7) { return null; }
    @java.lang.Deprecated
    public static android.content.Intent newChooseAccountIntent(android.accounts.Account p0, java.util.ArrayList<android.accounts.Account> p1, java.lang.String[] p2, boolean p3, java.lang.String p4, java.lang.String p5, java.lang.String[] p6, android.os.Bundle p7) { return null; }
    public static android.content.Intent newChooseAccountIntent(android.accounts.Account p0, java.util.List<android.accounts.Account> p1, java.lang.String[] p2, java.lang.String p3, java.lang.String p4, java.lang.String[] p5, android.os.Bundle p6) { return null; }
    public void addOnAccountsUpdatedListener(android.accounts.OnAccountsUpdateListener p0, android.os.Handler p1, boolean p2) {}
    public void addOnAccountsUpdatedListener(android.accounts.OnAccountsUpdateListener p0, android.os.Handler p1, boolean p2, java.lang.String[] p3) {}
    public void removeOnAccountsUpdatedListener(android.accounts.OnAccountsUpdateListener p0) {}
    public android.accounts.AccountManagerFuture<android.os.Bundle> startAddAccountSession(java.lang.String p0, java.lang.String p1, java.lang.String[] p2, android.os.Bundle p3, android.app.Activity p4, android.accounts.AccountManagerCallback<android.os.Bundle> p5, android.os.Handler p6) { return null; }
    public android.accounts.AccountManagerFuture<android.os.Bundle> startUpdateCredentialsSession(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2, android.app.Activity p3, android.accounts.AccountManagerCallback<android.os.Bundle> p4, android.os.Handler p5) { return null; }
    public android.accounts.AccountManagerFuture<android.os.Bundle> finishSession(android.os.Bundle p0, android.app.Activity p1, android.accounts.AccountManagerCallback<android.os.Bundle> p2, android.os.Handler p3) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS_FULL")
    public android.accounts.AccountManagerFuture<android.os.Bundle> finishSessionAsUser(android.os.Bundle p0, android.app.Activity p1, android.os.UserHandle p2, android.accounts.AccountManagerCallback<android.os.Bundle> p3, android.os.Handler p4) { return null; }
    public android.accounts.AccountManagerFuture<java.lang.Boolean> isCredentialsUpdateSuggested(android.accounts.Account p0, java.lang.String p1, android.accounts.AccountManagerCallback<java.lang.Boolean> p2, android.os.Handler p3) { return null; }
    public boolean hasAccountAccess(android.accounts.Account p0, java.lang.String p1, android.os.UserHandle p2) { return false; }
    public android.content.IntentSender createRequestAccountAccessIntentSenderAsUser(android.accounts.Account p0, java.lang.String p1, android.os.UserHandle p2) { return null; }
    public static void invalidateLocalAccountsDataCaches() {}
    public void disableLocalAccountCaches() {}
    public static void invalidateLocalAccountUserDataCaches() {}
    public void disableLocalUserInfoCaches() {}

    private static final class AccountKeyData {
        public final android.accounts.Account account = null;
        public final java.lang.String key = null;
        public AccountKeyData(android.accounts.Account p0, java.lang.String p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AccountVisibility {
    }

    private abstract class AmsTask extends java.util.concurrent.FutureTask<android.os.Bundle> implements android.accounts.AccountManagerFuture<android.os.Bundle> {
        final android.accounts.IAccountManagerResponse mResponse = null;
        final android.os.Handler mHandler = null;
        final android.accounts.AccountManagerCallback<android.os.Bundle> mCallback = null;
        final android.app.Activity mActivity = null;
        public AmsTask(android.app.Activity p0, android.os.Handler p1, android.accounts.AccountManagerCallback<android.os.Bundle> p2) { super((java.util.concurrent.Callable)null); }
        public final android.accounts.AccountManagerFuture<android.os.Bundle> start() { return null; }
        protected void set(android.os.Bundle p0) {}
        public abstract void doWork() throws android.os.RemoteException;
        public android.os.Bundle getResult() throws android.accounts.OperationCanceledException, java.io.IOException, android.accounts.AuthenticatorException { return null; }
        public android.os.Bundle getResult(long p0, java.util.concurrent.TimeUnit p1) throws android.accounts.OperationCanceledException, java.io.IOException, android.accounts.AuthenticatorException { return null; }
        protected void done() {}

        private class Response extends android.accounts.IAccountManagerResponse.Stub {
            public void onResult(android.os.Bundle p0) {}
            public void onError(int p0, java.lang.String p1) {}
        }
    }

    private abstract class BaseFutureTask<T extends java.lang.Object> extends java.util.concurrent.FutureTask<T> {
        public final android.accounts.IAccountManagerResponse mResponse = null;
        final android.os.Handler mHandler = null;
        public BaseFutureTask(android.accounts.AccountManager p0, android.os.Handler p1) { super((java.util.concurrent.Callable)null); }
        public abstract void doWork() throws android.os.RemoteException;
        public abstract T bundleToResult(android.os.Bundle p0) throws android.accounts.AuthenticatorException;
        protected void postRunnableToHandler(java.lang.Runnable p0) {}
        protected void startTask() {}

        protected class Response extends android.accounts.IAccountManagerResponse.Stub {
            protected Response(android.accounts.AccountManager.BaseFutureTask p0) { super(); }
            public void onResult(android.os.Bundle p0) {}
            public void onError(int p0, java.lang.String p1) {}
        }
    }

    private abstract class Future2Task<T extends java.lang.Object> extends android.accounts.AccountManager.BaseFutureTask<T> implements android.accounts.AccountManagerFuture<T> {
        final android.accounts.AccountManagerCallback<T> mCallback = null;
        public Future2Task(android.os.Handler p0, android.accounts.AccountManagerCallback<T> p1) { super(null, null); }
        protected void done() {}
        public android.accounts.AccountManager.Future2Task<T> start() { return null; }
        public T getResult() throws android.accounts.OperationCanceledException, java.io.IOException, android.accounts.AuthenticatorException { return null; }
        public T getResult(long p0, java.util.concurrent.TimeUnit p1) throws android.accounts.OperationCanceledException, java.io.IOException, android.accounts.AuthenticatorException { return null; }
    }

    private class GetAuthTokenByTypeAndFeaturesTask extends android.accounts.AccountManager.AmsTask implements android.accounts.AccountManagerCallback<android.os.Bundle> {
        volatile android.accounts.AccountManagerFuture<android.os.Bundle> mFuture;
        final java.lang.String mAccountType = null;
        final java.lang.String mAuthTokenType = null;
        final java.lang.String[] mFeatures = null;
        final android.os.Bundle mAddAccountOptions = null;
        final android.os.Bundle mLoginOptions = null;
        final android.accounts.AccountManagerCallback<android.os.Bundle> mMyCallback = null;
        GetAuthTokenByTypeAndFeaturesTask(java.lang.String p0, java.lang.String p1, java.lang.String[] p2, android.app.Activity p3, android.os.Bundle p4, android.os.Bundle p5, android.accounts.AccountManagerCallback<android.os.Bundle> p6, android.os.Handler p7) { super(null, null, null); }
        public void doWork() throws android.os.RemoteException {}
        public void run(android.accounts.AccountManagerFuture<android.os.Bundle> p0) {}
    }
}
