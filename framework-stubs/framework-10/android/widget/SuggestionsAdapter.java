package android.widget;

class SuggestionsAdapter extends android.widget.ResourceCursorAdapter implements android.view.View.OnClickListener {
    private static final boolean DBG = false;
    private static final java.lang.String LOG_TAG = "SuggestionsAdapter";
    private static final int QUERY_LIMIT = 50;
    static final int REFINE_NONE = 0;
    static final int REFINE_BY_ENTRY = 1;
    static final int REFINE_ALL = 2;
    private final android.app.SearchManager mSearchManager = null;
    private final android.widget.SearchView mSearchView = null;
    private final android.app.SearchableInfo mSearchable = null;
    private final android.content.Context mProviderContext = null;
    private final java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> mOutsideDrawablesCache = null;
    private final int mCommitIconResId = 0;
    private boolean mClosed;
    private int mQueryRefinement;
    private android.content.res.ColorStateList mUrlColor;
    static final int INVALID_INDEX = -1;
    private int mText1Col;
    private int mText2Col;
    private int mText2UrlCol;
    private int mIconName1Col;
    private int mIconName2Col;
    private int mFlagsCol;
    private static final long DELETE_KEY_POST_DELAY = 500L;
    public SuggestionsAdapter(android.content.Context p0, android.widget.SearchView p1, android.app.SearchableInfo p2, java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> p3) { super((android.content.Context)null, 0, (android.database.Cursor)null); }
    public void setQueryRefinement(int p0) {}
    public int getQueryRefinement() { return 0; }
    public boolean hasStableIds() { return false; }
    public android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence p0) { return null; }
    public void close() {}
    public void notifyDataSetChanged() {}
    public void notifyDataSetInvalidated() {}
    private void updateSpinnerState(android.database.Cursor p0) {}
    public void changeCursor(android.database.Cursor p0) {}
    public android.view.View newView(android.content.Context p0, android.database.Cursor p1, android.view.ViewGroup p2) { return null; }
    public void bindView(android.view.View p0, android.content.Context p1, android.database.Cursor p2) {}
    public void onClick(android.view.View p0) {}
    private java.lang.CharSequence formatUrl(android.content.Context p0, java.lang.CharSequence p1) { return null; }
    private void setViewText(android.widget.TextView p0, java.lang.CharSequence p1) {}
    private android.graphics.drawable.Drawable getIcon1(android.database.Cursor p0) { return null; }
    private android.graphics.drawable.Drawable getIcon2(android.database.Cursor p0) { return null; }
    private void setViewDrawable(android.widget.ImageView p0, android.graphics.drawable.Drawable p1, int p2) {}
    public java.lang.CharSequence convertToString(android.database.Cursor p0) { return null; }
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public android.view.View getDropDownView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    private android.graphics.drawable.Drawable getDrawableFromResourceValue(java.lang.String p0) { return null; }
    private android.graphics.drawable.Drawable getDrawable(android.net.Uri p0) { return null; }
    private android.graphics.drawable.Drawable checkIconCache(java.lang.String p0) { return null; }
    private void storeInIconCache(java.lang.String p0, android.graphics.drawable.Drawable p1) {}
    private android.graphics.drawable.Drawable getDefaultIcon1(android.database.Cursor p0) { return null; }
    private android.graphics.drawable.Drawable getActivityIconWithCache(android.content.ComponentName p0) { return null; }
    private android.graphics.drawable.Drawable getActivityIcon(android.content.ComponentName p0) { return null; }
    public static java.lang.String getColumnString(android.database.Cursor p0, java.lang.String p1) { return null; }
    private static java.lang.String getStringOrNull(android.database.Cursor p0, int p1) { return null; }

    private static final class ChildViewCache {
        public final android.widget.TextView mText1 = null;
        public final android.widget.TextView mText2 = null;
        public final android.widget.ImageView mIcon1 = null;
        public final android.widget.ImageView mIcon2 = null;
        public final android.widget.ImageView mIconRefine = null;
        public ChildViewCache(android.view.View p0) {}
    }
}
