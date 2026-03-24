package android.accounts;

public class ChooseAccountActivity extends android.app.Activity {
    private static final java.lang.String TAG = "AccountManager";
    private android.os.Parcelable[] mAccounts;
    private android.accounts.AccountManagerResponse mAccountManagerResponse;
    private android.os.Bundle mResult;
    private int mCallingUid;
    private java.lang.String mCallingPackage;
    private java.util.HashMap<java.lang.String, android.accounts.AuthenticatorDescription> mTypeToAuthDescription;
    public ChooseAccountActivity() { super(); }
    public void onCreate(android.os.Bundle p0) {}
    private void getAuthDescriptions() {}
    private android.graphics.drawable.Drawable getDrawableForType(java.lang.String p0) { return null; }
    protected void onListItemClick(android.widget.ListView p0, android.view.View p1, int p2, long p3) {}
    public void finish() {}

    private static class ViewHolder {
        android.widget.ImageView icon;
        android.widget.TextView text;
        private ViewHolder() {}
    }

    private static class AccountInfo {
        final java.lang.String name = null;
        final android.graphics.drawable.Drawable drawable = null;
        AccountInfo(java.lang.String p0, android.graphics.drawable.Drawable p1) {}
    }

    private static class AccountArrayAdapter extends android.widget.ArrayAdapter<android.accounts.ChooseAccountActivity.AccountInfo> {
        private android.view.LayoutInflater mLayoutInflater;
        private android.accounts.ChooseAccountActivity.AccountInfo[] mInfos;
        public AccountArrayAdapter(android.content.Context p0, int p1, android.accounts.ChooseAccountActivity.AccountInfo[] p2) { super((android.content.Context)null, 0); }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    }
}
