package android.widget;

public class SimpleAdapter extends android.widget.BaseAdapter implements android.widget.Filterable, android.widget.ThemedSpinnerAdapter {
    private final android.view.LayoutInflater mInflater = null;
    private int[] mTo;
    private java.lang.String[] mFrom;
    private android.widget.SimpleAdapter.ViewBinder mViewBinder;
    private java.util.List<? extends java.util.Map<java.lang.String, ?>> mData;
    private int mResource;
    private int mDropDownResource;
    private android.view.LayoutInflater mDropDownInflater;
    private android.widget.SimpleAdapter.SimpleFilter mFilter;
    private java.util.ArrayList<java.util.Map<java.lang.String, ?>> mUnfilteredData;
    public SimpleAdapter(android.content.Context p0, java.util.List<? extends java.util.Map<java.lang.String, ?>> p1, int p2, java.lang.String[] p3, int[] p4) { super(); }
    public int getCount() { return 0; }
    public java.lang.Object getItem(int p0) { return null; }
    public long getItemId(int p0) { return 0L; }
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    private android.view.View createViewFromResource(android.view.LayoutInflater p0, int p1, android.view.View p2, android.view.ViewGroup p3, int p4) { return null; }
    public void setDropDownViewResource(int p0) {}
    public void setDropDownViewTheme(android.content.res.Resources.Theme p0) {}
    public android.content.res.Resources.Theme getDropDownViewTheme() { return null; }
    public android.view.View getDropDownView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    private void bindView(int p0, android.view.View p1) {}
    public android.widget.SimpleAdapter.ViewBinder getViewBinder() { return null; }
    public void setViewBinder(android.widget.SimpleAdapter.ViewBinder p0) {}
    public void setViewImage(android.widget.ImageView p0, int p1) {}
    public void setViewImage(android.widget.ImageView p0, java.lang.String p1) {}
    public void setViewText(android.widget.TextView p0, java.lang.String p1) {}
    public android.widget.Filter getFilter() { return null; }

    private class SimpleFilter extends android.widget.Filter {
        private SimpleFilter(android.widget.SimpleAdapter p0) { super(); }
        protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence p0) { return null; }
        protected void publishResults(java.lang.CharSequence p0, android.widget.Filter.FilterResults p1) {}
    }

    public static interface ViewBinder {
        public boolean setViewValue(android.view.View p0, java.lang.Object p1, java.lang.String p2);
    }
}
