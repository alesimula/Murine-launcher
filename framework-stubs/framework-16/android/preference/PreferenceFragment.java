package android.preference;

@java.lang.Deprecated
public abstract class PreferenceFragment extends android.app.Fragment implements android.preference.PreferenceManager.OnPreferenceTreeClickListener {
    public PreferenceFragment() { super(); }
    public void onCreate(android.os.Bundle p0) {}
    public android.view.View onCreateView(android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2) { return null; }
    public void onViewCreated(android.view.View p0, android.os.Bundle p1) {}
    public void onActivityCreated(android.os.Bundle p0) {}
    public void onStart() {}
    public void onStop() {}
    public void onDestroyView() {}
    public void onDestroy() {}
    public void onSaveInstanceState(android.os.Bundle p0) {}
    public void onActivityResult(int p0, int p1, android.content.Intent p2) {}
    public android.preference.PreferenceManager getPreferenceManager() { return null; }
    public void setPreferenceScreen(android.preference.PreferenceScreen p0) {}
    public android.preference.PreferenceScreen getPreferenceScreen() { return null; }
    public void addPreferencesFromIntent(android.content.Intent p0) {}
    public void addPreferencesFromResource(int p0) {}
    public boolean onPreferenceTreeClick(android.preference.PreferenceScreen p0, android.preference.Preference p1) { return false; }
    public android.preference.Preference findPreference(java.lang.CharSequence p0) { return null; }
    protected void onBindPreferences() {}
    protected void onUnbindPreferences() {}
    public android.widget.ListView getListView() { return null; }
    public boolean hasListView() { return false; }

    @java.lang.Deprecated
    public static interface OnPreferenceStartFragmentCallback {
        public boolean onPreferenceStartFragment(android.preference.PreferenceFragment p0, android.preference.Preference p1);
    }
}
