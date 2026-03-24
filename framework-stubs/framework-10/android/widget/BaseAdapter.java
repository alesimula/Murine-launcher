package android.widget;

public abstract class BaseAdapter implements android.widget.ListAdapter, android.widget.SpinnerAdapter {
    @android.annotation.UnsupportedAppUsage
    private final android.database.DataSetObservable mDataSetObservable = null;
    private java.lang.CharSequence[] mAutofillOptions;
    public BaseAdapter() {}
    public boolean hasStableIds() { return false; }
    public void registerDataSetObserver(android.database.DataSetObserver p0) {}
    public void unregisterDataSetObserver(android.database.DataSetObserver p0) {}
    public void notifyDataSetChanged() {}
    public void notifyDataSetInvalidated() {}
    public boolean areAllItemsEnabled() { return false; }
    public boolean isEnabled(int p0) { return false; }
    public android.view.View getDropDownView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public int getItemViewType(int p0) { return 0; }
    public int getViewTypeCount() { return 0; }
    public boolean isEmpty() { return false; }
    public java.lang.CharSequence[] getAutofillOptions() { return null; }
    public void setAutofillOptions(java.lang.CharSequence... p0) {}
}
