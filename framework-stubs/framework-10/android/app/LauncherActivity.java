package android.app;

public abstract class LauncherActivity extends android.app.ListActivity {
    android.content.Intent mIntent;
    android.content.pm.PackageManager mPackageManager;
    android.app.LauncherActivity.IconResizer mIconResizer;
    public LauncherActivity() { super(); }
    protected void onCreate(android.os.Bundle p0) {}
    private void updateAlertTitle() {}
    private void updateButtonText() {}
    public void setTitle(java.lang.CharSequence p0) {}
    public void setTitle(int p0) {}
    protected void onSetContentView() {}
    protected void onListItemClick(android.widget.ListView p0, android.view.View p1, int p2, long p3) {}
    protected android.content.Intent intentForPosition(int p0) { return null; }
    protected android.app.LauncherActivity.ListItem itemForPosition(int p0) { return null; }
    protected android.content.Intent getTargetIntent() { return null; }
    protected java.util.List<android.content.pm.ResolveInfo> onQueryPackageManager(android.content.Intent p0) { return null; }
    protected void onSortResultList(java.util.List<android.content.pm.ResolveInfo> p0) {}
    public java.util.List<android.app.LauncherActivity.ListItem> makeListItems() { return null; }
    protected boolean onEvaluateShowIcons() { return false; }

    public static class ListItem {
        public android.content.pm.ResolveInfo resolveInfo;
        public java.lang.CharSequence label;
        public android.graphics.drawable.Drawable icon;
        public java.lang.String packageName;
        public java.lang.String className;
        public android.os.Bundle extras;
        ListItem(android.content.pm.PackageManager p0, android.content.pm.ResolveInfo p1, android.app.LauncherActivity.IconResizer p2) {}
        public ListItem() {}
    }

    public class IconResizer {
        private int mIconWidth;
        private int mIconHeight;
        private final android.graphics.Rect mOldBounds = null;
        private android.graphics.Canvas mCanvas;
        public IconResizer(android.app.LauncherActivity p0) {}
        public android.graphics.drawable.Drawable createIconThumbnail(android.graphics.drawable.Drawable p0) { return null; }
    }

    private class ActivityAdapter extends android.widget.BaseAdapter implements android.widget.Filterable {
        private final java.lang.Object lock = null;
        private java.util.ArrayList<android.app.LauncherActivity.ListItem> mOriginalValues;
        protected final android.app.LauncherActivity.IconResizer mIconResizer = null;
        protected final android.view.LayoutInflater mInflater = null;
        protected java.util.List<android.app.LauncherActivity.ListItem> mActivitiesList;
        private android.widget.Filter mFilter;
        private final boolean mShowIcons = false;
        public ActivityAdapter(android.app.LauncherActivity p0, android.app.LauncherActivity.IconResizer p1) { super(); }
        public android.content.Intent intentForPosition(int p0) { return null; }
        public android.app.LauncherActivity.ListItem itemForPosition(int p0) { return null; }
        public int getCount() { return 0; }
        public java.lang.Object getItem(int p0) { return null; }
        public long getItemId(int p0) { return 0L; }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
        private void bindView(android.view.View p0, android.app.LauncherActivity.ListItem p1) {}
        public android.widget.Filter getFilter() { return null; }

        private class ArrayFilter extends android.widget.Filter {
            private ArrayFilter(android.app.LauncherActivity.ActivityAdapter p0) { super(); }
            protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence p0) { return null; }
            protected void publishResults(java.lang.CharSequence p0, android.widget.Filter.FilterResults p1) {}
        }
    }
}
