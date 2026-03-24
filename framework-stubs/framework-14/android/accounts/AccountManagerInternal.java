package android.accounts;

public abstract class AccountManagerInternal {
    public AccountManagerInternal() {}
    public abstract void requestAccountAccess(android.accounts.Account p0, java.lang.String p1, int p2, android.os.RemoteCallback p3);
    public abstract boolean hasAccountAccess(android.accounts.Account p0, int p1);
    public abstract void addOnAppPermissionChangeListener(android.accounts.AccountManagerInternal.OnAppPermissionChangeListener p0);
    public abstract byte[] backupAccountAccessPermissions(int p0);
    public abstract void restoreAccountAccessPermissions(byte[] p0, int p1);

    public static interface OnAppPermissionChangeListener {
        public void onAppPermissionChanged(android.accounts.Account p0, int p1);
    }
}
