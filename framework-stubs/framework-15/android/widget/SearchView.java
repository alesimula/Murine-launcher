package android.widget;

public class SearchView extends android.widget.LinearLayout implements android.view.CollapsibleActionView {
    android.view.View.OnKeyListener mTextKeyListener;
    public SearchView(android.content.Context p0) { super((android.content.Context)null); }
    public SearchView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public SearchView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public SearchView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    int getSuggestionRowLayout() { return 0; }
    int getSuggestionCommitIconResId() { return 0; }
    public void setSearchableInfo(android.app.SearchableInfo p0) {}
    public void setAppSearchData(android.os.Bundle p0) {}
    public void setImeOptions(int p0) {}
    public int getImeOptions() { return 0; }
    public void setInputType(int p0) {}
    public int getInputType() { return 0; }
    public boolean requestFocus(int p0, android.graphics.Rect p1) { return false; }
    public void clearFocus() {}
    public void setOnQueryTextListener(android.widget.SearchView.OnQueryTextListener p0) {}
    public void setOnCloseListener(android.widget.SearchView.OnCloseListener p0) {}
    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener p0) {}
    public void setOnSuggestionListener(android.widget.SearchView.OnSuggestionListener p0) {}
    public void setOnSearchClickListener(android.view.View.OnClickListener p0) {}
    public java.lang.CharSequence getQuery() { return null; }
    public void setQuery(java.lang.CharSequence p0, boolean p1) {}
    public void setQueryHint(java.lang.CharSequence p0) {}
    @android.annotation.Nullable
    public java.lang.CharSequence getQueryHint() { return null; }
    public void setIconifiedByDefault(boolean p0) {}
    @java.lang.Deprecated
    public boolean isIconfiedByDefault() { return false; }
    public boolean isIconifiedByDefault() { return false; }
    public void setIconified(boolean p0) {}
    public boolean isIconified() { return false; }
    public void setSubmitButtonEnabled(boolean p0) {}
    public boolean isSubmitButtonEnabled() { return false; }
    public void setQueryRefinementEnabled(boolean p0) {}
    public boolean isQueryRefinementEnabled() { return false; }
    public void setSuggestionsAdapter(android.widget.CursorAdapter p0) {}
    public android.widget.CursorAdapter getSuggestionsAdapter() { return null; }
    public void setMaxWidth(int p0) {}
    public int getMaxWidth() { return 0; }
    protected void onMeasure(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onDetachedFromWindow() {}
    void onQueryRefine(java.lang.CharSequence p0) {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    void onTextFocusChanged() {}
    public void onWindowFocusChanged(boolean p0) {}
    public void onActionViewCollapsed() {}
    public void onActionViewExpanded() {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    static boolean isLandscapeMode(android.content.Context p0) { return false; }

    public static interface OnCloseListener {
        public boolean onClose();
    }

    public static interface OnQueryTextListener {
        public boolean onQueryTextSubmit(java.lang.String p0);
        public boolean onQueryTextChange(java.lang.String p0);
    }

    public static interface OnSuggestionListener {
        public boolean onSuggestionSelect(int p0);
        public boolean onSuggestionClick(int p0);
    }

    static class SavedState extends android.view.View.BaseSavedState {
        boolean isIconified;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.widget.SearchView.SavedState> CREATOR = null;
        SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    public static class SearchAutoComplete extends android.widget.AutoCompleteTextView {
        final java.lang.Runnable mRunShowSoftInputIfNecessary = null;
        public SearchAutoComplete(android.content.Context p0) { super((android.content.Context)null); }
        public SearchAutoComplete(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
        public SearchAutoComplete(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
        public SearchAutoComplete(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
        protected void onFinishInflate() {}
        void setSearchView(android.widget.SearchView p0) {}
        public void setThreshold(int p0) {}
        protected void replaceText(java.lang.CharSequence p0) {}
        public void performCompletion() {}
        public void onWindowFocusChanged(boolean p0) {}
        protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
        public boolean enoughToFilter() { return false; }
        public boolean onKeyPreIme(int p0, android.view.KeyEvent p1) { return false; }
        public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo p0) { return null; }
        public boolean checkInputConnectionProxy(android.view.View p0) { return false; }
    }

    private static class UpdatableTouchDelegate extends android.view.TouchDelegate {
        public UpdatableTouchDelegate(android.graphics.Rect p0, android.graphics.Rect p1, android.view.View p2) { super(null, null); }
        public void setBounds(android.graphics.Rect p0, android.graphics.Rect p1) {}
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    }
}
