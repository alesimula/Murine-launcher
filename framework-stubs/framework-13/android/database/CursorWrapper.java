package android.database;

public class CursorWrapper implements android.database.Cursor {
    protected final android.database.Cursor mCursor = null;
    public CursorWrapper(android.database.Cursor p0) {}
    public android.database.Cursor getWrappedCursor() { return null; }
    public void close() {}
    public boolean isClosed() { return false; }
    public int getCount() { return 0; }
    @java.lang.Deprecated
    public void deactivate() {}
    public boolean moveToFirst() { return false; }
    public int getColumnCount() { return 0; }
    public int getColumnIndex(java.lang.String p0) { return 0; }
    public int getColumnIndexOrThrow(java.lang.String p0) throws java.lang.IllegalArgumentException { return 0; }
    public java.lang.String getColumnName(int p0) { return null; }
    public java.lang.String[] getColumnNames() { return null; }
    public double getDouble(int p0) { return 0.0; }
    public void setExtras(android.os.Bundle p0) {}
    public android.os.Bundle getExtras() { return null; }
    public float getFloat(int p0) { return 0.0f; }
    public int getInt(int p0) { return 0; }
    public long getLong(int p0) { return 0L; }
    public short getShort(int p0) { return 0; }
    public java.lang.String getString(int p0) { return null; }
    public void copyStringToBuffer(int p0, android.database.CharArrayBuffer p1) {}
    public byte[] getBlob(int p0) { return null; }
    public boolean getWantsAllOnMoveCalls() { return false; }
    public boolean isAfterLast() { return false; }
    public boolean isBeforeFirst() { return false; }
    public boolean isFirst() { return false; }
    public boolean isLast() { return false; }
    public int getType(int p0) { return 0; }
    public boolean isNull(int p0) { return false; }
    public boolean moveToLast() { return false; }
    public boolean move(int p0) { return false; }
    public boolean moveToPosition(int p0) { return false; }
    public boolean moveToNext() { return false; }
    public int getPosition() { return 0; }
    public boolean moveToPrevious() { return false; }
    public void registerContentObserver(android.database.ContentObserver p0) {}
    public void registerDataSetObserver(android.database.DataSetObserver p0) {}
    @java.lang.Deprecated
    public boolean requery() { return false; }
    public android.os.Bundle respond(android.os.Bundle p0) { return null; }
    public void setNotificationUri(android.content.ContentResolver p0, android.net.Uri p1) {}
    public void setNotificationUris(android.content.ContentResolver p0, java.util.List<android.net.Uri> p1) {}
    public android.net.Uri getNotificationUri() { return null; }
    public java.util.List<android.net.Uri> getNotificationUris() { return null; }
    public void unregisterContentObserver(android.database.ContentObserver p0) {}
    public void unregisterDataSetObserver(android.database.DataSetObserver p0) {}
}
