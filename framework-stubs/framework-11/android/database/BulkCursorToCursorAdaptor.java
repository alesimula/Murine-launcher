package android.database;

public final class BulkCursorToCursorAdaptor extends android.database.AbstractWindowedCursor {
    private static final java.lang.String TAG = "BulkCursor";
    private android.database.AbstractCursor.SelfContentObserver mObserverBridge;
    private android.database.IBulkCursor mBulkCursor;
    private java.lang.String[] mColumns;
    private boolean mWantsAllOnMoveCalls;
    private int mCount;
    public BulkCursorToCursorAdaptor() { super(); }
    public void initialize(android.database.BulkCursorDescriptor p0) {}
    public android.database.IContentObserver getObserver() { return null; }
    private void throwIfCursorIsClosed() {}
    public int getCount() { return 0; }
    public boolean onMove(int p0, int p1) { return false; }
    public void deactivate() {}
    public void close() {}
    public boolean requery() { return false; }
    public java.lang.String[] getColumnNames() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public android.os.Bundle respond(android.os.Bundle p0) { return null; }
}
