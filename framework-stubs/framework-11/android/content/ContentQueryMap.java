package android.content;

public class ContentQueryMap extends java.util.Observable {
    private volatile android.database.Cursor mCursor;
    private java.lang.String[] mColumnNames;
    private int mKeyColumn;
    private android.os.Handler mHandlerForUpdateNotifications;
    private boolean mKeepUpdated;
    private java.util.Map<java.lang.String, android.content.ContentValues> mValues;
    private android.database.ContentObserver mContentObserver;
    private boolean mDirty;
    public ContentQueryMap(android.database.Cursor p0, java.lang.String p1, boolean p2, android.os.Handler p3) { super(); }
    public void setKeepUpdated(boolean p0) {}
    public synchronized android.content.ContentValues getValues(java.lang.String p0) { return null; }
    public void requery() {}
    private synchronized void readCursorIntoCache(android.database.Cursor p0) {}
    public synchronized java.util.Map<java.lang.String, android.content.ContentValues> getRows() { return null; }
    public synchronized void close() {}
    protected void finalize() throws java.lang.Throwable {}
}
