package android.preference;

@java.lang.Deprecated
public class PreferenceGroupAdapter extends android.widget.BaseAdapter implements android.preference.Preference.OnPreferenceChangeInternalListener {
    public PreferenceGroupAdapter(android.preference.PreferenceGroup p0) { super(); }
    public int getCount() { return 0; }
    public android.preference.Preference getItem(int p0) { return null; }
    public long getItemId(int p0) { return 0L; }
    public void setHighlighted(int p0) {}
    public void setHighlightedDrawable(android.graphics.drawable.Drawable p0) {}
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public boolean isEnabled(int p0) { return false; }
    public boolean areAllItemsEnabled() { return false; }
    public void onPreferenceChange(android.preference.Preference p0) {}
    public void onPreferenceHierarchyChange(android.preference.Preference p0) {}
    public boolean hasStableIds() { return false; }
    public int getItemViewType(int p0) { return 0; }
    public int getViewTypeCount() { return 0; }

    private static class PreferenceLayout implements java.lang.Comparable<android.preference.PreferenceGroupAdapter.PreferenceLayout> {
        public int compareTo(android.preference.PreferenceGroupAdapter.PreferenceLayout p0) { return 0; }
    }
}
