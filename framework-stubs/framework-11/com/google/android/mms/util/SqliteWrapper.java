package com.google.android.mms.util;

public final class SqliteWrapper {
    private static final java.lang.String TAG = "SqliteWrapper";
    private static final java.lang.String SQLITE_EXCEPTION_DETAIL_MESSAGE = "unable to open database file";
    private SqliteWrapper() {}
    private static boolean isLowMemory(android.content.Context p0) { return false; }
    private static boolean isLowMemory(android.database.sqlite.SQLiteException p0) { return false; }
    public static void checkSQLiteException(android.content.Context p0, android.database.sqlite.SQLiteException p1) {}
    public static android.database.Cursor query(android.content.Context p0, android.content.ContentResolver p1, android.net.Uri p2, java.lang.String[] p3, java.lang.String p4, java.lang.String[] p5, java.lang.String p6) { return null; }
    public static boolean requery(android.content.Context p0, android.database.Cursor p1) { return false; }
    public static int update(android.content.Context p0, android.content.ContentResolver p1, android.net.Uri p2, android.content.ContentValues p3, java.lang.String p4, java.lang.String[] p5) { return 0; }
    public static int delete(android.content.Context p0, android.content.ContentResolver p1, android.net.Uri p2, java.lang.String p3, java.lang.String[] p4) { return 0; }
    public static android.net.Uri insert(android.content.Context p0, android.content.ContentResolver p1, android.net.Uri p2, android.content.ContentValues p3) { return null; }
}
