package android.accounts;

public class ChooseAccountTypeActivity extends android.app.Activity {
    private static final java.lang.String TAG = "AccountChooser";
    private java.util.HashMap<java.lang.String, android.accounts.ChooseAccountTypeActivity.AuthInfo> mTypeToAuthenticatorInfo;
    private java.util.ArrayList<android.accounts.ChooseAccountTypeActivity.AuthInfo> mAuthenticatorInfosToDisplay;
    public ChooseAccountTypeActivity() { super(); }
    public void onCreate(android.os.Bundle p0) {}
    private void setResultAndFinish(java.lang.String p0) {}
    private void buildTypeToAuthDescriptionMap() {}

    private static class ViewHolder {
        android.widget.ImageView icon;
        android.widget.TextView text;
        private ViewHolder() {}
    }

    private static class AuthInfo {
        final android.accounts.AuthenticatorDescription desc = null;
        final java.lang.String name = null;
        final android.graphics.drawable.Drawable drawable = null;
        AuthInfo(android.accounts.AuthenticatorDescription p0, java.lang.String p1, android.graphics.drawable.Drawable p2) {}
    }

    private static class AccountArrayAdapter extends android.widget.ArrayAdapter<android.accounts.ChooseAccountTypeActivity.AuthInfo> {
        private android.view.LayoutInflater mLayoutInflater;
        private java.util.ArrayList<android.accounts.ChooseAccountTypeActivity.AuthInfo> mInfos;
        public AccountArrayAdapter(android.content.Context p0, int p1, java.util.ArrayList<android.accounts.ChooseAccountTypeActivity.AuthInfo> p2) { super((android.content.Context)null, 0); }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    }
}
