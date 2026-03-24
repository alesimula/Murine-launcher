package com.android.internal.app;

public class LocalePickerWithRegion extends android.app.ListFragment implements android.widget.SearchView.OnQueryTextListener {
    private static final java.lang.String PARENT_FRAGMENT_NAME = "localeListEditor";
    private com.android.internal.app.SuggestedLocaleAdapter mAdapter;
    private com.android.internal.app.LocalePickerWithRegion.LocaleSelectedListener mListener;
    private java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> mLocaleList;
    private com.android.internal.app.LocaleStore.LocaleInfo mParentLocale;
    private boolean mTranslatedOnly;
    private android.widget.SearchView mSearchView;
    private java.lang.CharSequence mPreviousSearch;
    private boolean mPreviousSearchHadFocus;
    private int mFirstVisiblePosition;
    private int mTopDistance;
    public LocalePickerWithRegion() { super(); }
    private static com.android.internal.app.LocalePickerWithRegion createCountryPicker(android.content.Context p0, com.android.internal.app.LocalePickerWithRegion.LocaleSelectedListener p1, com.android.internal.app.LocaleStore.LocaleInfo p2, boolean p3) { return null; }
    public static com.android.internal.app.LocalePickerWithRegion createLanguagePicker(android.content.Context p0, com.android.internal.app.LocalePickerWithRegion.LocaleSelectedListener p1, boolean p2) { return null; }
    private boolean setListener(android.content.Context p0, com.android.internal.app.LocalePickerWithRegion.LocaleSelectedListener p1, com.android.internal.app.LocaleStore.LocaleInfo p2, boolean p3) { return false; }
    private void returnToParentFrame() {}
    public void onCreate(android.os.Bundle p0) {}
    public boolean onOptionsItemSelected(android.view.MenuItem p0) { return false; }
    public void onResume() {}
    public void onPause() {}
    public void onListItemClick(android.widget.ListView p0, android.view.View p1, int p2, long p3) {}
    public void onCreateOptionsMenu(android.view.Menu p0, android.view.MenuInflater p1) {}
    public boolean onQueryTextSubmit(java.lang.String p0) { return false; }
    public boolean onQueryTextChange(java.lang.String p0) { return false; }

    public static interface LocaleSelectedListener {
        public void onLocaleSelected(com.android.internal.app.LocaleStore.LocaleInfo p0);
    }
}
