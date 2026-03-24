package android.database.sqlite;

public abstract class SQLiteOpenHelper implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = null;
    private final android.content.Context mContext = null;
    @android.annotation.UnsupportedAppUsage
    private final java.lang.String mName = null;
    private final int mNewVersion = 0;
    private final int mMinimumSupportedVersion = 0;
    private android.database.sqlite.SQLiteDatabase mDatabase;
    private boolean mIsInitializing;
    private android.database.sqlite.SQLiteDatabase.OpenParams.Builder mOpenParamsBuilder;
    public SQLiteOpenHelper(android.content.Context p0, java.lang.String p1, android.database.sqlite.SQLiteDatabase.CursorFactory p2, int p3) {}
    public SQLiteOpenHelper(android.content.Context p0, java.lang.String p1, android.database.sqlite.SQLiteDatabase.CursorFactory p2, int p3, android.database.DatabaseErrorHandler p4) {}
    public SQLiteOpenHelper(android.content.Context p0, java.lang.String p1, int p2, android.database.sqlite.SQLiteDatabase.OpenParams p3) {}
    public SQLiteOpenHelper(android.content.Context p0, java.lang.String p1, android.database.sqlite.SQLiteDatabase.CursorFactory p2, int p3, int p4, android.database.DatabaseErrorHandler p5) {}
    private SQLiteOpenHelper(android.content.Context p0, java.lang.String p1, int p2, int p3, android.database.sqlite.SQLiteDatabase.OpenParams.Builder p4) {}
    public java.lang.String getDatabaseName() { return null; }
    public void setWriteAheadLoggingEnabled(boolean p0) {}
    public void setLookasideConfig(int p0, int p1) {}
    public void setOpenParams(android.database.sqlite.SQLiteDatabase.OpenParams p0) {}
    private void setOpenParamsBuilder(android.database.sqlite.SQLiteDatabase.OpenParams.Builder p0) {}
    @java.lang.Deprecated
    public void setIdleConnectionTimeout(long p0) {}
    public android.database.sqlite.SQLiteDatabase getWritableDatabase() { return null; }
    public android.database.sqlite.SQLiteDatabase getReadableDatabase() { return null; }
    private android.database.sqlite.SQLiteDatabase getDatabaseLocked(boolean p0) { return null; }
    private static void setFilePermissionsForDb(java.lang.String p0) {}
    public synchronized void close() {}
    public void onConfigure(android.database.sqlite.SQLiteDatabase p0) {}
    public void onBeforeDelete(android.database.sqlite.SQLiteDatabase p0) {}
    public abstract void onCreate(android.database.sqlite.SQLiteDatabase p0);
    public abstract void onUpgrade(android.database.sqlite.SQLiteDatabase p0, int p1, int p2);
    public void onDowngrade(android.database.sqlite.SQLiteDatabase p0, int p1, int p2) {}
    public void onOpen(android.database.sqlite.SQLiteDatabase p0) {}
}
