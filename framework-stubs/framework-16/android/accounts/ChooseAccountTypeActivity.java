package android.accounts;

public class ChooseAccountTypeActivity extends android.app.Activity {
    public ChooseAccountTypeActivity() { super(); }
    public void onCreate(android.os.Bundle p0) {}

    private static class AccountArrayAdapter extends android.widget.ArrayAdapter<android.accounts.ChooseAccountTypeActivity.AuthInfo> {
        public AccountArrayAdapter(android.content.Context p0, int p1, java.util.ArrayList<android.accounts.ChooseAccountTypeActivity.AuthInfo> p2) { super((android.content.Context)null, 0); }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    }

    private static class AuthInfo {
        final android.accounts.AuthenticatorDescription desc = null;
        final java.lang.String name = null;
        final android.graphics.drawable.Drawable drawable = null;
        AuthInfo(android.accounts.AuthenticatorDescription p0, java.lang.String p1, android.graphics.drawable.Drawable p2) {}
    }

    private static class ViewHolder {
        android.widget.ImageView icon;
        android.widget.TextView text;
    }
}
