package android.widget;

public class SearchView extends android.widget.LinearLayout implements android.view.CollapsibleActionView {
    private static final boolean DBG = false;
    private static final java.lang.String LOG_TAG = "SearchView";
    private static final java.lang.String IME_OPTION_NO_MICROPHONE = "nm";
    @android.annotation.UnsupportedAppUsage
    private final android.widget.SearchView.SearchAutoComplete mSearchSrcTextView = null;
    @android.annotation.UnsupportedAppUsage
    private final android.view.View mSearchEditFrame = null;
    @android.annotation.UnsupportedAppUsage
    private final android.view.View mSearchPlate = null;
    @android.annotation.UnsupportedAppUsage
    private final android.view.View mSubmitArea = null;
    @android.annotation.UnsupportedAppUsage
    private final android.widget.ImageView mSearchButton = null;
    private final android.widget.ImageView mGoButton = null;
    @android.annotation.UnsupportedAppUsage
    private final android.widget.ImageView mCloseButton = null;
    @android.annotation.UnsupportedAppUsage
    private final android.widget.ImageView mVoiceButton = null;
    private final android.view.View mDropDownAnchor = null;
    private android.widget.SearchView.UpdatableTouchDelegate mTouchDelegate;
    private android.graphics.Rect mSearchSrcTextViewBounds;
    private android.graphics.Rect mSearchSrtTextViewBoundsExpanded;
    private int[] mTemp;
    private int[] mTemp2;
    private final android.widget.ImageView mCollapsedIcon = null;
    @android.annotation.UnsupportedAppUsage
    private final android.graphics.drawable.Drawable mSearchHintIcon = null;
    private final int mSuggestionRowLayout = 0;
    private final int mSuggestionCommitIconResId = 0;
    private final android.content.Intent mVoiceWebSearchIntent = null;
    private final android.content.Intent mVoiceAppSearchIntent = null;
    private final java.lang.CharSequence mDefaultQueryHint = null;
    @android.annotation.UnsupportedAppUsage
    private android.widget.SearchView.OnQueryTextListener mOnQueryChangeListener;
    private android.widget.SearchView.OnCloseListener mOnCloseListener;
    private android.view.View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private android.widget.SearchView.OnSuggestionListener mOnSuggestionListener;
    private android.view.View.OnClickListener mOnSearchClickListener;
    @android.annotation.UnsupportedAppUsage
    private boolean mIconifiedByDefault;
    @android.annotation.UnsupportedAppUsage
    private boolean mIconified;
    @android.annotation.UnsupportedAppUsage
    private android.widget.CursorAdapter mSuggestionsAdapter;
    private boolean mSubmitButtonEnabled;
    private java.lang.CharSequence mQueryHint;
    private boolean mQueryRefinement;
    @android.annotation.UnsupportedAppUsage
    private boolean mClearingFocus;
    private int mMaxWidth;
    @android.annotation.UnsupportedAppUsage
    private boolean mVoiceButtonEnabled;
    private java.lang.CharSequence mOldQueryText;
    @android.annotation.UnsupportedAppUsage
    private java.lang.CharSequence mUserQuery;
    @android.annotation.UnsupportedAppUsage
    private boolean mExpandedInActionView;
    @android.annotation.UnsupportedAppUsage
    private int mCollapsedImeOptions;
    private android.app.SearchableInfo mSearchable;
    private android.os.Bundle mAppSearchData;
    private java.lang.Runnable mUpdateDrawableStateRunnable;
    private java.lang.Runnable mReleaseCursorRunnable;
    private final java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> mOutsideDrawablesCache = null;
    @android.annotation.UnsupportedAppUsage
    private final android.view.View.OnClickListener mOnClickListener = null;
    android.view.View.OnKeyListener mTextKeyListener;
    private final android.widget.TextView.OnEditorActionListener mOnEditorActionListener = null;
    @android.annotation.UnsupportedAppUsage
    private final android.widget.AdapterView.OnItemClickListener mOnItemClickListener = null;
    private final android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener = null;
    private android.text.TextWatcher mTextWatcher;
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
    private void getChildBoundsWithinSearchView(android.view.View p0, android.graphics.Rect p1) {}
    private int getPreferredWidth() { return 0; }
    private int getPreferredHeight() { return 0; }
    @android.annotation.UnsupportedAppUsage
    private void updateViewsVisibility(boolean p0) {}
    private boolean hasVoiceSearch() { return false; }
    private boolean isSubmitAreaEnabled() { return false; }
    @android.annotation.UnsupportedAppUsage
    private void updateSubmitButton(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    private void updateSubmitArea() {}
    private void updateCloseButton() {}
    private void postUpdateFocusedState() {}
    private void updateFocusedState() {}
    protected void onDetachedFromWindow() {}
    void onQueryRefine(java.lang.CharSequence p0) {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    private boolean onSuggestionsKey(android.view.View p0, int p1, android.view.KeyEvent p2) { return false; }
    private static java.lang.String getActionKeyMessage(android.database.Cursor p0, android.app.SearchableInfo.ActionKeyInfo p1) { return null; }
    private java.lang.CharSequence getDecoratedHint(java.lang.CharSequence p0) { return null; }
    private void updateQueryHint() {}
    private void updateSearchAutoComplete() {}
    private void updateVoiceButton(boolean p0) {}
    private void onTextChanged(java.lang.CharSequence p0) {}
    private void onSubmitQuery() {}
    private void dismissSuggestions() {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private void onCloseClicked() {}
    private void onSearchClicked() {}
    private void onVoiceClicked() {}
    void onTextFocusChanged() {}
    public void onWindowFocusChanged(boolean p0) {}
    public void onActionViewCollapsed() {}
    public void onActionViewExpanded() {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    private void adjustDropDownSizeAndPosition() {}
    private boolean onItemClicked(int p0, int p1, java.lang.String p2) { return false; }
    private boolean onItemSelected(int p0) { return false; }
    private void rewriteQueryFromSuggestion(int p0) {}
    private boolean launchSuggestion(int p0, int p1, java.lang.String p2) { return false; }
    private void launchIntent(android.content.Intent p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private void setQuery(java.lang.CharSequence p0) {}
    private void launchQuerySearch(int p0, java.lang.String p1, java.lang.String p2) {}
    private android.content.Intent createIntent(java.lang.String p0, android.net.Uri p1, java.lang.String p2, java.lang.String p3, int p4, java.lang.String p5) { return null; }
    private android.content.Intent createVoiceWebSearchIntent(android.content.Intent p0, android.app.SearchableInfo p1) { return null; }
    private android.content.Intent createVoiceAppSearchIntent(android.content.Intent p0, android.app.SearchableInfo p1) { return null; }
    private android.content.Intent createIntentFromSuggestion(android.database.Cursor p0, int p1, java.lang.String p2) { return null; }
    private void forceSuggestionQuery() {}
    static boolean isLandscapeMode(android.content.Context p0) { return false; }

    private static class UpdatableTouchDelegate extends android.view.TouchDelegate {
        private final android.view.View mDelegateView = null;
        private final android.graphics.Rect mTargetBounds = null;
        private final android.graphics.Rect mActualBounds = null;
        private final android.graphics.Rect mSlopBounds = null;
        private final int mSlop = 0;
        private boolean mDelegateTargeted;
        public UpdatableTouchDelegate(android.graphics.Rect p0, android.graphics.Rect p1, android.view.View p2) { super(null, null); }
        public void setBounds(android.graphics.Rect p0, android.graphics.Rect p1) {}
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    }

    public static class SearchAutoComplete extends android.widget.AutoCompleteTextView {
        private int mThreshold;
        private android.widget.SearchView mSearchView;
        private boolean mHasPendingShowSoftInputRequest;
        final java.lang.Runnable mRunShowSoftInputIfNecessary = null;
        public SearchAutoComplete(android.content.Context p0) { super((android.content.Context)null); }
        @android.annotation.UnsupportedAppUsage
        public SearchAutoComplete(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
        public SearchAutoComplete(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
        public SearchAutoComplete(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
        protected void onFinishInflate() {}
        void setSearchView(android.widget.SearchView p0) {}
        public void setThreshold(int p0) {}
        private boolean isEmpty() { return false; }
        protected void replaceText(java.lang.CharSequence p0) {}
        public void performCompletion() {}
        public void onWindowFocusChanged(boolean p0) {}
        protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
        public boolean enoughToFilter() { return false; }
        public boolean onKeyPreIme(int p0, android.view.KeyEvent p1) { return false; }
        private int getSearchViewTextMinWidthDp() { return 0; }
        public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo p0) { return null; }
        public boolean checkInputConnectionProxy(android.view.View p0) { return false; }
        private void showSoftInputIfNecessary() {}
        private void setImeVisibility(boolean p0) {}
    }

    static class SavedState extends android.view.View.BaseSavedState {
        boolean isIconified;
        public static final android.os.Parcelable.Creator<android.widget.SearchView.SavedState> CREATOR = null;
        SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    public static interface OnSuggestionListener {
        public boolean onSuggestionSelect(int p0);
        public boolean onSuggestionClick(int p0);
    }

    public static interface OnQueryTextListener {
        public boolean onQueryTextSubmit(java.lang.String p0);
        public boolean onQueryTextChange(java.lang.String p0);
    }

    public static interface OnCloseListener {
        public boolean onClose();
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.SearchView> {
        private boolean mPropertiesMapped;
        private int mIconifiedId;
        private int mIconifiedByDefaultId;
        private int mMaxWidthId;
        private int mQueryId;
        private int mQueryHintId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.SearchView p0, android.view.inspector.PropertyReader p1) {}
    }
}
