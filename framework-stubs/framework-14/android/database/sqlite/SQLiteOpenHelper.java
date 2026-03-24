package android.database.sqlite;

public abstract class SQLiteOpenHelper implements java.lang.AutoCloseable {
    public SQLiteOpenHelper(android.content.Context p0, java.lang.String p1, android.database.sqlite.SQLiteDatabase.CursorFactory p2, int p3) {}
    public SQLiteOpenHelper(android.content.Context p0, java.lang.String p1, android.database.sqlite.SQLiteDatabase.CursorFactory p2, int p3, android.database.DatabaseErrorHandler p4) {}
    public SQLiteOpenHelper(android.content.Context p0, java.lang.String p1, int p2, android.database.sqlite.SQLiteDatabase.OpenParams p3) {}
    public SQLiteOpenHelper(android.content.Context p0, java.lang.String p1, android.database.sqlite.SQLiteDatabase.CursorFactory p2, int p3, int p4, android.database.DatabaseErrorHandler p5) {}
    public java.lang.String getDatabaseName() { return null; }
    public void setWriteAheadLoggingEnabled(boolean p0) {}
    public void setLookasideConfig(int p0, int p1) {}
    public void setOpenParams(android.database.sqlite.SQLiteDatabase.OpenParams p0) {}
    @java.lang.Deprecated
    public void setIdleConnectionTimeout(long p0) {}
    public android.database.sqlite.SQLiteDatabase getWritableDatabase() { return null; }
    public android.database.sqlite.SQLiteDatabase getReadableDatabase() { return null; }
    public synchronized void close() {}
    public void onConfigure(android.database.sqlite.SQLiteDatabase p0) {}
    public void onBeforeDelete(android.database.sqlite.SQLiteDatabase p0) {}
    public abstract void onCreate(android.database.sqlite.SQLiteDatabase p0);
    public abstract void onUpgrade(android.database.sqlite.SQLiteDatabase p0, int p1, int p2);
    public void onDowngrade(android.database.sqlite.SQLiteDatabase p0, int p1, int p2) {}
    public void onOpen(android.database.sqlite.SQLiteDatabase p0) {}
}
