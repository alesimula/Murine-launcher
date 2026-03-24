package com.android.internal.app;

public class SuggestedLocaleAdapter extends android.widget.BaseAdapter implements android.widget.Filterable {
    private static final int TYPE_HEADER_SUGGESTED = 0;
    private static final int TYPE_HEADER_ALL_OTHERS = 1;
    private static final int TYPE_LOCALE = 2;
    private static final int MIN_REGIONS_FOR_SUGGESTIONS = 6;
    private java.util.ArrayList<com.android.internal.app.LocaleStore.LocaleInfo> mLocaleOptions;
    private java.util.ArrayList<com.android.internal.app.LocaleStore.LocaleInfo> mOriginalLocaleOptions;
    private int mSuggestionCount;
    private final boolean mCountryMode = false;
    private android.view.LayoutInflater mInflater;
    private java.util.Locale mDisplayLocale;
    private android.content.Context mContextOverride;
    public SuggestedLocaleAdapter(java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> p0, boolean p1) { super(); }
    public boolean areAllItemsEnabled() { return false; }
    public boolean isEnabled(int p0) { return false; }
    public int getItemViewType(int p0) { return 0; }
    public int getViewTypeCount() { return 0; }
    public int getCount() { return 0; }
    public java.lang.Object getItem(int p0) { return null; }
    public long getItemId(int p0) { return 0L; }
    public void setDisplayLocale(android.content.Context p0, java.util.Locale p1) {}
    private void setTextTo(android.widget.TextView p0, int p1) {}
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    private boolean showHeaders() { return false; }
    public void sort(com.android.internal.app.LocaleHelper.LocaleInfoComparator p0) {}
    public android.widget.Filter getFilter() { return null; }

    class FilterByNativeAndUiNames extends android.widget.Filter {
        FilterByNativeAndUiNames(com.android.internal.app.SuggestedLocaleAdapter p0) { super(); }
        protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence p0) { return null; }
        boolean wordMatches(java.lang.String p0, java.lang.String p1) { return false; }
        protected void publishResults(java.lang.CharSequence p0, android.widget.Filter.FilterResults p1) {}
    }
}
