package android.database.sqlite;

public abstract class SQLiteClosable implements java.io.Closeable {
    public SQLiteClosable() {}
    protected abstract void onAllReferencesReleased();
    @java.lang.Deprecated
    protected void onAllReferencesReleasedFromContainer() {}
    public void acquireReference() {}
    public void releaseReference() {}
    @java.lang.Deprecated
    public void releaseReferenceFromContainer() {}
    public void close() {}
}
