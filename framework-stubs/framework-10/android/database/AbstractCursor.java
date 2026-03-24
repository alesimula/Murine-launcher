package android.database;

public abstract class AbstractCursor implements android.database.CrossProcessCursor {
    private static final java.lang.String TAG = "Cursor";
    protected java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> mUpdatedRows;
    protected int mRowIdColumnIndex;
    protected java.lang.Long mCurrentRowID;
    @java.lang.Deprecated
    protected int mPos;
    @java.lang.Deprecated
    protected boolean mClosed;
    @java.lang.Deprecated
    protected android.content.ContentResolver mContentResolver;
    @android.annotation.UnsupportedAppUsage
    private android.net.Uri mNotifyUri;
    private java.util.List<android.net.Uri> mNotifyUris;
    private final java.lang.Object mSelfObserverLock = null;
    private android.database.ContentObserver mSelfObserver;
    private boolean mSelfObserverRegistered;
    private final android.database.DataSetObservable mDataSetObservable = null;
    private final android.database.ContentObservable mContentObservable = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private android.os.Bundle mExtras;
    public abstract int getCount();
    public abstract java.lang.String[] getColumnNames();
    public abstract java.lang.String getString(int p0);
    public abstract short getShort(int p0);
    public abstract int getInt(int p0);
    public abstract long getLong(int p0);
    public abstract float getFloat(int p0);
    public abstract double getDouble(int p0);
    public abstract boolean isNull(int p0);
    public int getType(int p0) { return 0; }
    public byte[] getBlob(int p0) { return null; }
    public android.database.CursorWindow getWindow() { return null; }
    public int getColumnCount() { return 0; }
    public void deactivate() {}
    protected void onDeactivateOrClose() {}
    public boolean requery() { return false; }
    public boolean isClosed() { return false; }
    public void close() {}
    public boolean onMove(int p0, int p1) { return false; }
    public void copyStringToBuffer(int p0, android.database.CharArrayBuffer p1) {}
    public AbstractCursor() {}
    public final int getPosition() { return 0; }
    public final boolean moveToPosition(int p0) { return false; }
    public void fillWindow(int p0, android.database.CursorWindow p1) {}
    public final boolean move(int p0) { return false; }
    public final boolean moveToFirst() { return false; }
    public final boolean moveToLast() { return false; }
    public final boolean moveToNext() { return false; }
    public final boolean moveToPrevious() { return false; }
    public final boolean isFirst() { return false; }
    public final boolean isLast() { return false; }
    public final boolean isBeforeFirst() { return false; }
    public final boolean isAfterLast() { return false; }
    public int getColumnIndex(java.lang.String p0) { return 0; }
    public int getColumnIndexOrThrow(java.lang.String p0) { return 0; }
    public java.lang.String getColumnName(int p0) { return null; }
    public void registerContentObserver(android.database.ContentObserver p0) {}
    public void unregisterContentObserver(android.database.ContentObserver p0) {}
    public void registerDataSetObserver(android.database.DataSetObserver p0) {}
    public void unregisterDataSetObserver(android.database.DataSetObserver p0) {}
    protected void onChange(boolean p0) {}
    public void setNotificationUri(android.content.ContentResolver p0, android.net.Uri p1) {}
    public void setNotificationUris(android.content.ContentResolver p0, java.util.List<android.net.Uri> p1) {}
    public void setNotificationUris(android.content.ContentResolver p0, java.util.List<android.net.Uri> p1, int p2, boolean p3) {}
    public android.net.Uri getNotificationUri() { return null; }
    public java.util.List<android.net.Uri> getNotificationUris() { return null; }
    public boolean getWantsAllOnMoveCalls() { return false; }
    public void setExtras(android.os.Bundle p0) {}
    public android.os.Bundle getExtras() { return null; }
    public android.os.Bundle respond(android.os.Bundle p0) { return null; }
    @java.lang.Deprecated
    protected boolean isFieldUpdated(int p0) { return false; }
    @java.lang.Deprecated
    protected java.lang.Object getUpdatedField(int p0) { return null; }
    protected void checkPosition() {}
    protected void finalize() {}

    protected static class SelfContentObserver extends android.database.ContentObserver {
        java.lang.ref.WeakReference<android.database.AbstractCursor> mCursor;
        public SelfContentObserver(android.database.AbstractCursor p0) { super(null); }
        public boolean deliverSelfNotifications() { return false; }
        public void onChange(boolean p0) {}
    }
}
