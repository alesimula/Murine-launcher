package android.preference;

@java.lang.Deprecated
public abstract class PreferenceActivity extends android.app.ListActivity implements android.preference.PreferenceManager.OnPreferenceTreeClickListener, android.preference.PreferenceFragment.OnPreferenceStartFragmentCallback {
    public static final java.lang.String EXTRA_SHOW_FRAGMENT = ":android:show_fragment";
    public static final java.lang.String EXTRA_SHOW_FRAGMENT_ARGUMENTS = ":android:show_fragment_args";
    public static final java.lang.String EXTRA_SHOW_FRAGMENT_TITLE = ":android:show_fragment_title";
    public static final java.lang.String EXTRA_SHOW_FRAGMENT_SHORT_TITLE = ":android:show_fragment_short_title";
    public static final java.lang.String EXTRA_NO_HEADERS = ":android:no_headers";
    public static final long HEADER_ID_UNDEFINED = -1L;
    public PreferenceActivity() { super(); }
    public boolean onOptionsItemSelected(android.view.MenuItem p0) { return false; }
    protected void onCreate(android.os.Bundle p0) {}
    public void onBackPressed() {}
    public boolean hasHeaders() { return false; }
    public java.util.List<android.preference.PreferenceActivity.Header> getHeaders() { return null; }
    public boolean isMultiPane() { return false; }
    public boolean onIsMultiPane() { return false; }
    public boolean onIsHidingHeaders() { return false; }
    public android.preference.PreferenceActivity.Header onGetInitialHeader() { return null; }
    public android.preference.PreferenceActivity.Header onGetNewHeader() { return null; }
    public void onBuildHeaders(java.util.List<android.preference.PreferenceActivity.Header> p0) {}
    public void invalidateHeaders() {}
    public void loadHeadersFromResource(int p0, java.util.List<android.preference.PreferenceActivity.Header> p1) {}
    protected boolean isValidFragment(java.lang.String p0) { return false; }
    public void setListFooter(android.view.View p0) {}
    protected void onStop() {}
    protected void onDestroy() {}
    protected void onSaveInstanceState(android.os.Bundle p0) {}
    protected void onRestoreInstanceState(android.os.Bundle p0) {}
    protected void onActivityResult(int p0, int p1, android.content.Intent p2) {}
    public void onContentChanged() {}
    protected void onListItemClick(android.widget.ListView p0, android.view.View p1, int p2, long p3) {}
    public void onHeaderClick(android.preference.PreferenceActivity.Header p0, int p1) {}
    public android.content.Intent onBuildStartFragmentIntent(java.lang.String p0, android.os.Bundle p1, int p2, int p3) { return null; }
    public void startWithFragment(java.lang.String p0, android.os.Bundle p1, android.app.Fragment p2, int p3) {}
    public void startWithFragment(java.lang.String p0, android.os.Bundle p1, android.app.Fragment p2, int p3, int p4, int p5) {}
    public void showBreadCrumbs(java.lang.CharSequence p0, java.lang.CharSequence p1) {}
    public void setParentTitle(java.lang.CharSequence p0, java.lang.CharSequence p1, android.view.View.OnClickListener p2) {}
    void setSelectedHeader(android.preference.PreferenceActivity.Header p0) {}
    void showBreadCrumbs(android.preference.PreferenceActivity.Header p0) {}
    public void switchToHeader(java.lang.String p0, android.os.Bundle p1) {}
    public void switchToHeader(android.preference.PreferenceActivity.Header p0) {}
    android.preference.PreferenceActivity.Header findBestMatchingHeader(android.preference.PreferenceActivity.Header p0, java.util.ArrayList<android.preference.PreferenceActivity.Header> p1) { return null; }
    public void startPreferenceFragment(android.app.Fragment p0, boolean p1) {}
    public void startPreferencePanel(java.lang.String p0, android.os.Bundle p1, int p2, java.lang.CharSequence p3, android.app.Fragment p4, int p5) {}
    public void finishPreferencePanel(android.app.Fragment p0, int p1, android.content.Intent p2) {}
    public boolean onPreferenceStartFragment(android.preference.PreferenceFragment p0, android.preference.Preference p1) { return false; }
    @java.lang.Deprecated
    public android.preference.PreferenceManager getPreferenceManager() { return null; }
    @java.lang.Deprecated
    public void setPreferenceScreen(android.preference.PreferenceScreen p0) {}
    @java.lang.Deprecated
    public android.preference.PreferenceScreen getPreferenceScreen() { return null; }
    @java.lang.Deprecated
    public void addPreferencesFromIntent(android.content.Intent p0) {}
    @java.lang.Deprecated
    public void addPreferencesFromResource(int p0) {}
    @java.lang.Deprecated
    public boolean onPreferenceTreeClick(android.preference.PreferenceScreen p0, android.preference.Preference p1) { return false; }
    @java.lang.Deprecated
    public android.preference.Preference findPreference(java.lang.CharSequence p0) { return null; }
    protected void onNewIntent(android.content.Intent p0) {}
    protected boolean hasNextButton() { return false; }
    protected android.widget.Button getNextButton() { return null; }

    @java.lang.Deprecated
    public static final class Header implements android.os.Parcelable {
        public long id;
        public int titleRes;
        public java.lang.CharSequence title;
        public int summaryRes;
        public java.lang.CharSequence summary;
        public int breadCrumbTitleRes;
        public java.lang.CharSequence breadCrumbTitle;
        public int breadCrumbShortTitleRes;
        public java.lang.CharSequence breadCrumbShortTitle;
        public int iconRes;
        public java.lang.String fragment;
        public android.os.Bundle fragmentArguments;
        public android.content.Intent intent;
        public android.os.Bundle extras;
        public static final android.os.Parcelable.Creator<android.preference.PreferenceActivity.Header> CREATOR = null;
        public Header() {}
        public java.lang.CharSequence getTitle(android.content.res.Resources p0) { return null; }
        public java.lang.CharSequence getSummary(android.content.res.Resources p0) { return null; }
        public java.lang.CharSequence getBreadCrumbTitle(android.content.res.Resources p0) { return null; }
        public java.lang.CharSequence getBreadCrumbShortTitle(android.content.res.Resources p0) { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void readFromParcel(android.os.Parcel p0) {}
        Header(android.os.Parcel p0) {}
    }

    private static class HeaderAdapter extends android.widget.ArrayAdapter<android.preference.PreferenceActivity.Header> {
        public HeaderAdapter(android.content.Context p0, java.util.List<android.preference.PreferenceActivity.Header> p1, int p2, boolean p3) { super((android.content.Context)null, 0); }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }

        private static class HeaderViewHolder {
            android.widget.ImageView icon;
            android.widget.TextView title;
            android.widget.TextView summary;
        }
    }
}
