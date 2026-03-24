package android.content;

public abstract class CursorEntityIterator implements android.content.EntityIterator {
    private final android.database.Cursor mCursor = null;
    private boolean mIsClosed;
    @android.annotation.UnsupportedAppUsage
    public CursorEntityIterator(android.database.Cursor p0) {}
    public abstract android.content.Entity getEntityAndIncrementCursor(android.database.Cursor p0) throws android.os.RemoteException;
    public final boolean hasNext() { return false; }
    public android.content.Entity next() { return null; }
    public void remove() {}
    public final void reset() {}
    public final void close() {}
}
