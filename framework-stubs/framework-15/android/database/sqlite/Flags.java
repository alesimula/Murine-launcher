package android.database.sqlite;

public final class Flags {
    public static final java.lang.String FLAG_SIMPLE_SQL_COMMENT_SCANNER = "android.database.sqlite.simple_sql_comment_scanner";
    public static final java.lang.String FLAG_SQLITE_ALLOW_TEMP_TABLES = "android.database.sqlite.sqlite_allow_temp_tables";
    public static final java.lang.String FLAG_SQLITE_APIS_35 = "android.database.sqlite.sqlite_apis_35";
    public Flags() {}
    public static boolean simpleSqlCommentScanner() { return false; }
    public static boolean sqliteAllowTempTables() { return false; }
    public static boolean sqliteApis35() { return false; }
}
