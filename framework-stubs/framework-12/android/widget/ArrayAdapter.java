package android.widget;

public class ArrayAdapter<T extends java.lang.Object> extends android.widget.BaseAdapter implements android.widget.Filterable, android.widget.ThemedSpinnerAdapter {
    private final java.lang.Object mLock = null;
    private final android.view.LayoutInflater mInflater = null;
    private final android.content.Context mContext = null;
    private final int mResource = 0;
    private int mDropDownResource;
    private java.util.List<T> mObjects;
    private boolean mObjectsFromResources;
    private int mFieldId;
    private boolean mNotifyOnChange;
    private java.util.ArrayList<T> mOriginalValues;
    private android.widget.ArrayAdapter<T>.ArrayFilter mFilter;
    private android.view.LayoutInflater mDropDownInflater;
    public ArrayAdapter(android.content.Context p0, int p1) { super(); }
    public ArrayAdapter(android.content.Context p0, int p1, int p2) { super(); }
    public ArrayAdapter(android.content.Context p0, int p1, T[] p2) { super(); }
    public ArrayAdapter(android.content.Context p0, int p1, int p2, T[] p3) { super(); }
    public ArrayAdapter(android.content.Context p0, int p1, java.util.List<T> p2) { super(); }
    public ArrayAdapter(android.content.Context p0, int p1, int p2, java.util.List<T> p3) { super(); }
    private ArrayAdapter(android.content.Context p0, int p1, int p2, java.util.List<T> p3, boolean p4) { super(); }
    public void add(T p0) {}
    public void addAll(java.util.Collection<? extends T> p0) {}
    public void addAll(T... p0) {}
    public void insert(T p0, int p1) {}
    public void remove(T p0) {}
    public void clear() {}
    public void sort(java.util.Comparator<? super T> p0) {}
    public void notifyDataSetChanged() {}
    public void setNotifyOnChange(boolean p0) {}
    public android.content.Context getContext() { return null; }
    public int getCount() { return 0; }
    public T getItem(int p0) { return null; }
    public int getPosition(T p0) { return 0; }
    public long getItemId(int p0) { return 0L; }
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    private android.view.View createViewFromResource(android.view.LayoutInflater p0, int p1, android.view.View p2, android.view.ViewGroup p3, int p4) { return null; }
    public void setDropDownViewResource(int p0) {}
    public void setDropDownViewTheme(android.content.res.Resources.Theme p0) {}
    public android.content.res.Resources.Theme getDropDownViewTheme() { return null; }
    public android.view.View getDropDownView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public static android.widget.ArrayAdapter<java.lang.CharSequence> createFromResource(android.content.Context p0, int p1, int p2) { return null; }
    public android.widget.Filter getFilter() { return null; }
    public java.lang.CharSequence[] getAutofillOptions() { return null; }

    private class ArrayFilter extends android.widget.Filter {
        private ArrayFilter(android.widget.ArrayAdapter p0) { super(); }
        protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence p0) { return null; }
        protected void publishResults(java.lang.CharSequence p0, android.widget.Filter.FilterResults p1) {}
    }
}
