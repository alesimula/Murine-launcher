package android.database;

public class MergeCursor extends android.database.AbstractCursor {
    private android.database.DataSetObserver mObserver;
    private android.database.Cursor mCursor;
    private android.database.Cursor[] mCursors;
    public MergeCursor(android.database.Cursor[] p0) { super(); }
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
    public void registerContentObserver(android.database.ContentObserver p0) {}
    public void unregisterContentObserver(android.database.ContentObserver p0) {}
    public void registerDataSetObserver(android.database.DataSetObserver p0) {}
    public void unregisterDataSetObserver(android.database.DataSetObserver p0) {}
    public boolean requery() { return false; }
}
