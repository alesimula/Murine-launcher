package com.android.internal.database;

public class SortCursor extends android.database.AbstractCursor {
    private static final java.lang.String TAG = "SortCursor";
    @android.annotation.UnsupportedAppUsage
    private android.database.Cursor mCursor;
    @android.annotation.UnsupportedAppUsage
    private android.database.Cursor[] mCursors;
    private int[] mSortColumns;
    private final int ROWCACHESIZE = 0;
    private int[] mRowNumCache;
    private int[] mCursorCache;
    private int[][] mCurRowNumCache;
    private int mLastCacheHit;
    private android.database.DataSetObserver mObserver;
    @android.annotation.UnsupportedAppUsage
    public SortCursor(android.database.Cursor[] p0, java.lang.String p1) { super(); }
    public int getCount() { return 0; }
    public boolean onMove(int p0, int p1) { return false; }
    public java.lang.String getString(int p0) { return null; }
    public short getShort(int p0) { return 0; }
    public int getInt(int p0) { return 0; }
    public long getLong(int p0) { return 0L; }
    public float getFloat(int p0) { return 0.0f; }
    public double getDouble(int p0) { return 0.0; }
    public int getType(int p0) { return 0; }
    public boolean isNull(int p0) { return false; }
    public byte[] getBlob(int p0) { return null; }
    public java.lang.String[] getColumnNames() { return null; }
    public void deactivate() {}
    public void close() {}
    public void registerDataSetObserver(android.database.DataSetObserver p0) {}
    public void unregisterDataSetObserver(android.database.DataSetObserver p0) {}
    public boolean requery() { return false; }
}
