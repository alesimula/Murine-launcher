package android.database.sqlite;

public final class SQLiteStatement extends android.database.sqlite.SQLiteProgram {
    @android.annotation.UnsupportedAppUsage
    SQLiteStatement(android.database.sqlite.SQLiteDatabase p0, java.lang.String p1, java.lang.Object[] p2) { super(null, null, null, null); }
    public void execute() {}
    public int executeUpdateDelete() { return 0; }
    public long executeInsert() { return 0L; }
    public long simpleQueryForLong() { return 0L; }
    public java.lang.String simpleQueryForString() { return null; }
    public android.os.ParcelFileDescriptor simpleQueryForBlobFileDescriptor() { return null; }
    public java.lang.String toString() { return null; }
}
