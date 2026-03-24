package android.widget;

public interface Adapter {
    public static final int IGNORE_ITEM_VIEW_TYPE = -1;
    public static final int NO_SELECTION = -2147483648;
    public void registerDataSetObserver(android.database.DataSetObserver p0);
    public void unregisterDataSetObserver(android.database.DataSetObserver p0);
    public int getCount();
    public java.lang.Object getItem(int p0);
    public long getItemId(int p0);
    public boolean hasStableIds();
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2);
    public int getItemViewType(int p0);
    public int getViewTypeCount();
    public boolean isEmpty();
    default public java.lang.CharSequence[] getAutofillOptions() { return null; }
}
