package android.app;

public class SearchDialog extends android.app.Dialog {
    private static final boolean DBG = false;
    private static final java.lang.String LOG_TAG = "SearchDialog";
    private static final java.lang.String INSTANCE_KEY_COMPONENT = "comp";
    private static final java.lang.String INSTANCE_KEY_APPDATA = "data";
    private static final java.lang.String INSTANCE_KEY_USER_QUERY = "uQry";
    private static final java.lang.String IME_OPTION_NO_MICROPHONE = "nm";
    private static final int SEARCH_PLATE_LEFT_PADDING_NON_GLOBAL = 7;
    private android.widget.TextView mBadgeLabel;
    private android.widget.ImageView mAppIcon;
    private android.widget.AutoCompleteTextView mSearchAutoComplete;
    private android.view.View mSearchPlate;
    private android.widget.SearchView mSearchView;
    private android.graphics.drawable.Drawable mWorkingSpinner;
    private android.view.View mCloseSearch;
    private android.app.SearchableInfo mSearchable;
    private android.content.ComponentName mLaunchComponent;
    private android.os.Bundle mAppSearchData;
    private android.content.Context mActivityContext;
    private final android.content.Intent mVoiceWebSearchIntent = null;
    private final android.content.Intent mVoiceAppSearchIntent = null;
    private java.lang.String mUserQuery;
    private int mSearchAutoCompleteImeOptions;
    private android.content.BroadcastReceiver mConfChangeListener;
    private final android.widget.SearchView.OnCloseListener mOnCloseListener = null;
    private final android.widget.SearchView.OnQueryTextListener mOnQueryChangeListener = null;
    private final android.widget.SearchView.OnSuggestionListener mOnSuggestionSelectionListener = null;
    static int resolveDialogTheme(android.content.Context p0) { return 0; }
    public SearchDialog(android.content.Context p0, android.app.SearchManager p1) { super((android.content.Context)null); }
    protected void onCreate(android.os.Bundle p0) {}
    private void createContentView() {}
    public boolean show(java.lang.String p0, boolean p1, android.content.ComponentName p2, android.os.Bundle p3) { return false; }
    private boolean doShow(java.lang.String p0, boolean p1, android.content.ComponentName p2, android.os.Bundle p3) { return false; }
    private boolean show(android.content.ComponentName p0, android.os.Bundle p1) { return false; }
    public void onStart() {}
    public void onStop() {}
    public void setWorking(boolean p0) {}
    public android.os.Bundle onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Bundle p0) {}
    public void onConfigurationChanged() {}
    static boolean isLandscapeMode(android.content.Context p0) { return false; }
    private boolean enoughToFilter() { return false; }
    private void updateUI() {}
    private void updateSearchAutoComplete() {}
    private void updateSearchAppIcon() {}
    private void updateSearchBadge() {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    private boolean isOutOfBounds(android.view.View p0, android.view.MotionEvent p1) { return false; }
    public void hide() {}
    public void launchQuerySearch() {}
    protected void launchQuerySearch(int p0, java.lang.String p1) {}
    private void launchIntent(android.content.Intent p0) {}
    public void setListSelection(int p0) {}
    private android.content.Intent createIntent(java.lang.String p0, android.net.Uri p1, java.lang.String p2, java.lang.String p3, int p4, java.lang.String p5) { return null; }
    private boolean isEmpty(android.widget.AutoCompleteTextView p0) { return false; }
    public void onBackPressed() {}
    private boolean onClosePressed() { return false; }
    private void setUserQuery(java.lang.String p0) {}

    public static class SearchBar extends android.widget.LinearLayout {
        public SearchBar(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
        public SearchBar(android.content.Context p0) { super((android.content.Context)null); }
        public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1, int p2) { return null; }
    }
}
