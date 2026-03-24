package android.widget;

class SuggestionsAdapter extends android.widget.ResourceCursorAdapter implements android.view.View.OnClickListener {
    static final int REFINE_NONE = 0;
    static final int REFINE_BY_ENTRY = 1;
    static final int REFINE_ALL = 2;
    static final int INVALID_INDEX = -1;
    public SuggestionsAdapter(android.content.Context p0, android.widget.SearchView p1, android.app.SearchableInfo p2, java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> p3) { super((android.content.Context)null, 0, (android.database.Cursor)null); }
    public void setQueryRefinement(int p0) {}
    public int getQueryRefinement() { return 0; }
    public boolean hasStableIds() { return false; }
    public android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence p0) { return null; }
    public void close() {}
    public void notifyDataSetChanged() {}
    public void notifyDataSetInvalidated() {}
    public void changeCursor(android.database.Cursor p0) {}
    public android.view.View newView(android.content.Context p0, android.database.Cursor p1, android.view.ViewGroup p2) { return null; }
    public void bindView(android.view.View p0, android.content.Context p1, android.database.Cursor p2) {}
    public void onClick(android.view.View p0) {}
    public java.lang.CharSequence convertToString(android.database.Cursor p0) { return null; }
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public android.view.View getDropDownView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public static java.lang.String getColumnString(android.database.Cursor p0, java.lang.String p1) { return null; }

    private static final class ChildViewCache {
        public final android.widget.TextView mText1 = null;
        public final android.widget.TextView mText2 = null;
        public final android.widget.ImageView mIcon1 = null;
        public final android.widget.ImageView mIcon2 = null;
        public final android.widget.ImageView mIconRefine = null;
        public ChildViewCache(android.view.View p0) {}
    }
}
