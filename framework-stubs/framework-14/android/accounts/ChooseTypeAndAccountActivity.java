package android.accounts;

public class ChooseTypeAndAccountActivity extends android.app.Activity implements android.accounts.AccountManagerCallback<android.os.Bundle> {
    public static final java.lang.String EXTRA_ALLOWABLE_ACCOUNTS_ARRAYLIST = "allowableAccounts";
    public static final java.lang.String EXTRA_ALLOWABLE_ACCOUNT_TYPES_STRING_ARRAY = "allowableAccountTypes";
    public static final java.lang.String EXTRA_ADD_ACCOUNT_OPTIONS_BUNDLE = "addAccountOptions";
    public static final java.lang.String EXTRA_ADD_ACCOUNT_REQUIRED_FEATURES_STRING_ARRAY = "addAccountRequiredFeatures";
    public static final java.lang.String EXTRA_ADD_ACCOUNT_AUTH_TOKEN_TYPE_STRING = "authTokenType";
    public static final java.lang.String EXTRA_SELECTED_ACCOUNT = "selectedAccount";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_ALWAYS_PROMPT_FOR_ACCOUNT = "alwaysPromptForAccount";
    public static final java.lang.String EXTRA_DESCRIPTION_TEXT_OVERRIDE = "descriptionTextOverride";
    public static final int REQUEST_NULL = 0;
    public static final int REQUEST_CHOOSE_TYPE = 1;
    public static final int REQUEST_ADD_ACCOUNT = 2;
    public ChooseTypeAndAccountActivity() { super(); }
    public void onCreate(android.os.Bundle p0) {}
    protected void onDestroy() {}
    protected void onSaveInstanceState(android.os.Bundle p0) {}
    public void onCancelButtonClicked(android.view.View p0) {}
    public void onOkButtonClicked(android.view.View p0) {}
    protected void onActivityResult(int p0, int p1, android.content.Intent p2) {}
    protected void runAddAccountForAuthenticator(java.lang.String p0) {}
    public void run(android.accounts.AccountManagerFuture<android.os.Bundle> p0) {}
}
