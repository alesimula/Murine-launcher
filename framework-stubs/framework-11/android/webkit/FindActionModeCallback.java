package android.webkit;

@android.annotation.SystemApi
public class FindActionModeCallback implements android.view.ActionMode.Callback, android.text.TextWatcher, android.view.View.OnClickListener, android.webkit.WebView.FindListener {
    private android.view.View mCustomView;
    private android.widget.EditText mEditText;
    private android.widget.TextView mMatches;
    private android.webkit.WebView mWebView;
    private android.view.inputmethod.InputMethodManager mInput;
    private android.content.res.Resources mResources;
    private boolean mMatchesFound;
    private int mNumberOfMatches;
    private int mActiveMatchIndex;
    private android.view.ActionMode mActionMode;
    private android.graphics.Rect mGlobalVisibleRect;
    private android.graphics.Point mGlobalVisibleOffset;
    public FindActionModeCallback(android.content.Context p0) {}
    public void finish() {}
    public void setText(java.lang.String p0) {}
    public void setWebView(android.webkit.WebView p0) {}
    public void onFindResultReceived(int p0, int p1, boolean p2) {}
    private void findNext(boolean p0) {}
    public void findAll() {}
    public void showSoftInput() {}
    public void updateMatchCount(int p0, int p1, boolean p2) {}
    private void updateMatchesString() {}
    public void onClick(android.view.View p0) {}
    public boolean onCreateActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
    public void onDestroyActionMode(android.view.ActionMode p0) {}
    public boolean onPrepareActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
    public boolean onActionItemClicked(android.view.ActionMode p0, android.view.MenuItem p1) { return false; }
    public void beforeTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    public void onTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    public void afterTextChanged(android.text.Editable p0) {}
    public int getActionModeGlobalBottom() { return 0; }

    public static class NoAction implements android.view.ActionMode.Callback {
        public NoAction() {}
        public boolean onCreateActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
        public boolean onPrepareActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
        public boolean onActionItemClicked(android.view.ActionMode p0, android.view.MenuItem p1) { return false; }
        public void onDestroyActionMode(android.view.ActionMode p0) {}
    }
}
