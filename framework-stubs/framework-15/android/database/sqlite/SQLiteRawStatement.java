package android.database.sqlite;

@android.annotation.FlaggedApi("android.database.sqlite.sqlite_apis_35")
public final class SQLiteRawStatement implements java.io.Closeable {
    public static final int SQLITE_DATA_TYPE_INTEGER = 1;
    public static final int SQLITE_DATA_TYPE_FLOAT = 2;
    public static final int SQLITE_DATA_TYPE_TEXT = 3;
    public static final int SQLITE_DATA_TYPE_BLOB = 4;
    public static final int SQLITE_DATA_TYPE_NULL = 5;
    SQLiteRawStatement(android.database.sqlite.SQLiteDatabase p0, java.lang.String p1) {}
    public void close() {}
    public boolean isOpen() { return false; }
    public boolean step() { return false; }
    public int stepNoThrow() { return 0; }
    public void reset() {}
    public void clearBindings() {}
    public int getParameterCount() { return 0; }
    public int getParameterIndex(java.lang.String p0) { return 0; }
    @android.annotation.Nullable
    public java.lang.String getParameterName(int p0) { return null; }
    public void bindBlob(int p0, byte[] p1) {}
    public void bindBlob(int p0, byte[] p1, int p2, int p3) {}
    public void bindDouble(int p0, double p1) {}
    public void bindInt(int p0, int p1) {}
    public void bindLong(int p0, long p1) {}
    public void bindNull(int p0) {}
    public void bindText(int p0, java.lang.String p1) {}
    public int getResultColumnCount() { return 0; }
    public int getColumnType(int p0) { return 0; }
    @android.annotation.NonNull
    public java.lang.String getColumnName(int p0) { return null; }
    public int getColumnLength(int p0) { return 0; }
    @android.annotation.Nullable
    public byte[] getColumnBlob(int p0) { return null; }
    public int readColumnBlob(int p0, byte[] p1, int p2, int p3, int p4) { return 0; }
    public double getColumnDouble(int p0) { return 0.0; }
    public int getColumnInt(int p0) { return 0; }
    public long getColumnLong(int p0) { return 0L; }
    @android.annotation.NonNull
    public java.lang.String getColumnText(int p0) { return null; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SQLiteDataType {
    }
}
