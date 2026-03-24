package android.accounts;

public class GrantCredentialsPermissionActivity extends android.app.Activity implements android.view.View.OnClickListener {
    public static final java.lang.String EXTRAS_ACCOUNT = "account";
    public static final java.lang.String EXTRAS_AUTH_TOKEN_TYPE = "authTokenType";
    public static final java.lang.String EXTRAS_RESPONSE = "response";
    public static final java.lang.String EXTRAS_REQUESTING_UID = "uid";
    private android.accounts.Account mAccount;
    private java.lang.String mAuthTokenType;
    private int mUid;
    private android.os.Bundle mResultBundle;
    protected android.view.LayoutInflater mInflater;
    public GrantCredentialsPermissionActivity() { super(); }
    protected void onCreate(android.os.Bundle p0) {}
    private java.lang.String getAccountLabel(android.accounts.Account p0) { return null; }
    private android.view.View newPackageView(java.lang.String p0) { return null; }
    public void onClick(android.view.View p0) {}
    public final void setAccountAuthenticatorResult(android.os.Bundle p0) {}
    public void finish() {}
}
